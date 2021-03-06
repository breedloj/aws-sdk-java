/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.simplesystemsmanagement.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 */
public class DeregisterManagedInstanceRequest extends AmazonWebServiceRequest
        implements Serializable, Cloneable {

    /**
     * <p>
     * The ID assigned to the managed instance when you registered it using the
     * activation process.
     * </p>
     */
    private String instanceId;

    /**
     * <p>
     * The ID assigned to the managed instance when you registered it using the
     * activation process.
     * </p>
     * 
     * @param instanceId
     *        The ID assigned to the managed instance when you registered it
     *        using the activation process.
     */

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The ID assigned to the managed instance when you registered it using the
     * activation process.
     * </p>
     * 
     * @return The ID assigned to the managed instance when you registered it
     *         using the activation process.
     */

    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * <p>
     * The ID assigned to the managed instance when you registered it using the
     * activation process.
     * </p>
     * 
     * @param instanceId
     *        The ID assigned to the managed instance when you registered it
     *        using the activation process.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DeregisterManagedInstanceRequest withInstanceId(String instanceId) {
        setInstanceId(instanceId);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getInstanceId() != null)
            sb.append("InstanceId: " + getInstanceId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeregisterManagedInstanceRequest == false)
            return false;
        DeregisterManagedInstanceRequest other = (DeregisterManagedInstanceRequest) obj;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null
                && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        return hashCode;
    }

    @Override
    public DeregisterManagedInstanceRequest clone() {
        return (DeregisterManagedInstanceRequest) super.clone();
    }
}