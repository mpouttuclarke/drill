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
// Generated by http://code.google.com/p/protostuff/ ... DO NOT EDIT!
// Generated from BitControl.Proto

package org.apache.drill.exec.proto;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import com.dyuproject.protostuff.GraphIOUtil;
import com.dyuproject.protostuff.Input;
import com.dyuproject.protostuff.Message;
import com.dyuproject.protostuff.Output;
import com.dyuproject.protostuff.Schema;

public final class PlanFragment implements Externalizable, Message<PlanFragment>, Schema<PlanFragment>
{

    public static Schema<PlanFragment> getSchema()
    {
        return DEFAULT_INSTANCE;
    }

    public static PlanFragment getDefaultInstance()
    {
        return DEFAULT_INSTANCE;
    }

    static final PlanFragment DEFAULT_INSTANCE = new PlanFragment();

    static final Long DEFAULT_MEM_INITIAL = new Long(20000000l);
    static final Long DEFAULT_MEM_MAX = new Long(2000000000l);
    
    private FragmentHandle handle;
    private Float networkCost;
    private Float cpuCost;
    private Float diskCost;
    private Float memoryCost;
    private String fragmentJson;
    private Boolean leafFragment;
    private DrillbitEndpoint assignment;
    private DrillbitEndpoint foreman;
    private Long memInitial = DEFAULT_MEM_INITIAL;
    private Long memMax = DEFAULT_MEM_MAX;
    private Long queryStartTime;
    private UserCredentials credentials;
    private Integer timeZone;
    private String optionsJson;

    public PlanFragment()
    {
        
    }

    // getters and setters

    // handle

    public FragmentHandle getHandle()
    {
        return handle;
    }

    public void setHandle(FragmentHandle handle)
    {
        this.handle = handle;
    }

    // networkCost

    public Float getNetworkCost()
    {
        return networkCost;
    }

    public void setNetworkCost(Float networkCost)
    {
        this.networkCost = networkCost;
    }

    // cpuCost

    public Float getCpuCost()
    {
        return cpuCost;
    }

    public void setCpuCost(Float cpuCost)
    {
        this.cpuCost = cpuCost;
    }

    // diskCost

    public Float getDiskCost()
    {
        return diskCost;
    }

    public void setDiskCost(Float diskCost)
    {
        this.diskCost = diskCost;
    }

    // memoryCost

    public Float getMemoryCost()
    {
        return memoryCost;
    }

    public void setMemoryCost(Float memoryCost)
    {
        this.memoryCost = memoryCost;
    }

    // fragmentJson

    public String getFragmentJson()
    {
        return fragmentJson;
    }

    public void setFragmentJson(String fragmentJson)
    {
        this.fragmentJson = fragmentJson;
    }

    // leafFragment

    public Boolean getLeafFragment()
    {
        return leafFragment;
    }

    public void setLeafFragment(Boolean leafFragment)
    {
        this.leafFragment = leafFragment;
    }

    // assignment

    public DrillbitEndpoint getAssignment()
    {
        return assignment;
    }

    public void setAssignment(DrillbitEndpoint assignment)
    {
        this.assignment = assignment;
    }

    // foreman

    public DrillbitEndpoint getForeman()
    {
        return foreman;
    }

    public void setForeman(DrillbitEndpoint foreman)
    {
        this.foreman = foreman;
    }

    // memInitial

    public Long getMemInitial()
    {
        return memInitial;
    }

    public void setMemInitial(Long memInitial)
    {
        this.memInitial = memInitial;
    }

    // memMax

    public Long getMemMax()
    {
        return memMax;
    }

    public void setMemMax(Long memMax)
    {
        this.memMax = memMax;
    }

    // queryStartTime

    public Long getQueryStartTime()
    {
        return queryStartTime;
    }

    public void setQueryStartTime(Long queryStartTime)
    {
        this.queryStartTime = queryStartTime;
    }

    // credentials

    public UserCredentials getCredentials()
    {
        return credentials;
    }

    public void setCredentials(UserCredentials credentials)
    {
        this.credentials = credentials;
    }

    // timeZone

    public Integer getTimeZone()
    {
        return timeZone;
    }

    public void setTimeZone(Integer timeZone)
    {
        this.timeZone = timeZone;
    }

    // optionsJson

    public String getOptionsJson()
    {
        return optionsJson;
    }

    public void setOptionsJson(String optionsJson)
    {
        this.optionsJson = optionsJson;
    }

    // java serialization

    public void readExternal(ObjectInput in) throws IOException
    {
        GraphIOUtil.mergeDelimitedFrom(in, this, this);
    }

    public void writeExternal(ObjectOutput out) throws IOException
    {
        GraphIOUtil.writeDelimitedTo(out, this, this);
    }

    // message method

    public Schema<PlanFragment> cachedSchema()
    {
        return DEFAULT_INSTANCE;
    }

    // schema methods

    public PlanFragment newMessage()
    {
        return new PlanFragment();
    }

    public Class<PlanFragment> typeClass()
    {
        return PlanFragment.class;
    }

    public String messageName()
    {
        return PlanFragment.class.getSimpleName();
    }

    public String messageFullName()
    {
        return PlanFragment.class.getName();
    }

    public boolean isInitialized(PlanFragment message)
    {
        return true;
    }

    public void mergeFrom(Input input, PlanFragment message) throws IOException
    {
        for(int number = input.readFieldNumber(this);; number = input.readFieldNumber(this))
        {
            switch(number)
            {
                case 0:
                    return;
                case 1:
                    message.handle = input.mergeObject(message.handle, FragmentHandle.getSchema());
                    break;

                case 4:
                    message.networkCost = input.readFloat();
                    break;
                case 5:
                    message.cpuCost = input.readFloat();
                    break;
                case 6:
                    message.diskCost = input.readFloat();
                    break;
                case 7:
                    message.memoryCost = input.readFloat();
                    break;
                case 8:
                    message.fragmentJson = input.readString();
                    break;
                case 9:
                    message.leafFragment = input.readBool();
                    break;
                case 10:
                    message.assignment = input.mergeObject(message.assignment, DrillbitEndpoint.getSchema());
                    break;

                case 11:
                    message.foreman = input.mergeObject(message.foreman, DrillbitEndpoint.getSchema());
                    break;

                case 12:
                    message.memInitial = input.readInt64();
                    break;
                case 13:
                    message.memMax = input.readInt64();
                    break;
                case 14:
                    message.queryStartTime = input.readInt64();
                    break;
                case 15:
                    message.credentials = input.mergeObject(message.credentials, UserCredentials.getSchema());
                    break;

                case 16:
                    message.timeZone = input.readInt32();
                    break;
                case 17:
                    message.optionsJson = input.readString();
                    break;
                default:
                    input.handleUnknownField(number, this);
            }   
        }
    }


    public void writeTo(Output output, PlanFragment message) throws IOException
    {
        if(message.handle != null)
             output.writeObject(1, message.handle, FragmentHandle.getSchema(), false);


        if(message.networkCost != null)
            output.writeFloat(4, message.networkCost, false);

        if(message.cpuCost != null)
            output.writeFloat(5, message.cpuCost, false);

        if(message.diskCost != null)
            output.writeFloat(6, message.diskCost, false);

        if(message.memoryCost != null)
            output.writeFloat(7, message.memoryCost, false);

        if(message.fragmentJson != null)
            output.writeString(8, message.fragmentJson, false);

        if(message.leafFragment != null)
            output.writeBool(9, message.leafFragment, false);

        if(message.assignment != null)
             output.writeObject(10, message.assignment, DrillbitEndpoint.getSchema(), false);


        if(message.foreman != null)
             output.writeObject(11, message.foreman, DrillbitEndpoint.getSchema(), false);


        if(message.memInitial != null && message.memInitial != DEFAULT_MEM_INITIAL)
            output.writeInt64(12, message.memInitial, false);

        if(message.memMax != null && message.memMax != DEFAULT_MEM_MAX)
            output.writeInt64(13, message.memMax, false);

        if(message.queryStartTime != null)
            output.writeInt64(14, message.queryStartTime, false);

        if(message.credentials != null)
             output.writeObject(15, message.credentials, UserCredentials.getSchema(), false);


        if(message.timeZone != null)
            output.writeInt32(16, message.timeZone, false);

        if(message.optionsJson != null)
            output.writeString(17, message.optionsJson, false);
    }

    public String getFieldName(int number)
    {
        switch(number)
        {
            case 1: return "handle";
            case 4: return "networkCost";
            case 5: return "cpuCost";
            case 6: return "diskCost";
            case 7: return "memoryCost";
            case 8: return "fragmentJson";
            case 9: return "leafFragment";
            case 10: return "assignment";
            case 11: return "foreman";
            case 12: return "memInitial";
            case 13: return "memMax";
            case 14: return "queryStartTime";
            case 15: return "credentials";
            case 16: return "timeZone";
            case 17: return "optionsJson";
            default: return null;
        }
    }

    public int getFieldNumber(String name)
    {
        final Integer number = __fieldMap.get(name);
        return number == null ? 0 : number.intValue();
    }

    private static final java.util.HashMap<String,Integer> __fieldMap = new java.util.HashMap<String,Integer>();
    static
    {
        __fieldMap.put("handle", 1);
        __fieldMap.put("networkCost", 4);
        __fieldMap.put("cpuCost", 5);
        __fieldMap.put("diskCost", 6);
        __fieldMap.put("memoryCost", 7);
        __fieldMap.put("fragmentJson", 8);
        __fieldMap.put("leafFragment", 9);
        __fieldMap.put("assignment", 10);
        __fieldMap.put("foreman", 11);
        __fieldMap.put("memInitial", 12);
        __fieldMap.put("memMax", 13);
        __fieldMap.put("queryStartTime", 14);
        __fieldMap.put("credentials", 15);
        __fieldMap.put("timeZone", 16);
        __fieldMap.put("optionsJson", 17);
    }
    
}
