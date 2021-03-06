/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.drill.exec.store.ischema;

import org.apache.calcite.schema.SchemaPlus;

import org.apache.drill.exec.store.RecordReader;
import org.apache.drill.exec.store.ischema.InfoSchemaTable.Catalogs;
import org.apache.drill.exec.store.ischema.InfoSchemaTable.Columns;
import org.apache.drill.exec.store.ischema.InfoSchemaTable.Schemata;
import org.apache.drill.exec.store.ischema.InfoSchemaTable.Tables;
import org.apache.drill.exec.store.ischema.InfoSchemaTable.Views;
import org.apache.calcite.rel.type.RelDataType;
import org.apache.calcite.rel.type.RelDataTypeFactory;

/**
 * The set of tables/views in INFORMATION_SCHEMA.
 */
public enum SelectedTable{
  // TODO:  Resolve how to not have two different place defining table names:
  // NOTE: These identifiers have to match the string values in
  // InfoSchemaConstants.
  CATALOGS(new Catalogs()),
  SCHEMATA(new Schemata()),
  VIEWS(new Views()),
  COLUMNS(new Columns()),
  TABLES(new Tables());

  private final InfoSchemaTable tableDef;

  /**
   * ...
   * @param  tableDef  the definition (columns and data generator) of the table
   */
  private SelectedTable(InfoSchemaTable tableDef) {
    this.tableDef = tableDef;
  }

  public RecordReader getRecordReader(SchemaPlus rootSchema, InfoSchemaFilter filter) {
    RecordGenerator recordGenerator = tableDef.getRecordGenerator();
    recordGenerator.setInfoSchemaFilter(filter);
    recordGenerator.scanSchema(rootSchema);
    return recordGenerator.getRecordReader();
  }

  public RelDataType getRowType(RelDataTypeFactory typeFactory) {
    return tableDef.getRowType(typeFactory);
  }
}
