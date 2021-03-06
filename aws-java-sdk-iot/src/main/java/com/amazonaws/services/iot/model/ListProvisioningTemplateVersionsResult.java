/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListProvisioningTemplateVersionsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The list of fleet provisioning template versions.
     * </p>
     */
    private java.util.List<ProvisioningTemplateVersionSummary> versions;
    /**
     * <p>
     * A token to retrieve the next set of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The list of fleet provisioning template versions.
     * </p>
     * 
     * @return The list of fleet provisioning template versions.
     */

    public java.util.List<ProvisioningTemplateVersionSummary> getVersions() {
        return versions;
    }

    /**
     * <p>
     * The list of fleet provisioning template versions.
     * </p>
     * 
     * @param versions
     *        The list of fleet provisioning template versions.
     */

    public void setVersions(java.util.Collection<ProvisioningTemplateVersionSummary> versions) {
        if (versions == null) {
            this.versions = null;
            return;
        }

        this.versions = new java.util.ArrayList<ProvisioningTemplateVersionSummary>(versions);
    }

    /**
     * <p>
     * The list of fleet provisioning template versions.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVersions(java.util.Collection)} or {@link #withVersions(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param versions
     *        The list of fleet provisioning template versions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListProvisioningTemplateVersionsResult withVersions(ProvisioningTemplateVersionSummary... versions) {
        if (this.versions == null) {
            setVersions(new java.util.ArrayList<ProvisioningTemplateVersionSummary>(versions.length));
        }
        for (ProvisioningTemplateVersionSummary ele : versions) {
            this.versions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of fleet provisioning template versions.
     * </p>
     * 
     * @param versions
     *        The list of fleet provisioning template versions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListProvisioningTemplateVersionsResult withVersions(java.util.Collection<ProvisioningTemplateVersionSummary> versions) {
        setVersions(versions);
        return this;
    }

    /**
     * <p>
     * A token to retrieve the next set of results.
     * </p>
     * 
     * @param nextToken
     *        A token to retrieve the next set of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token to retrieve the next set of results.
     * </p>
     * 
     * @return A token to retrieve the next set of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token to retrieve the next set of results.
     * </p>
     * 
     * @param nextToken
     *        A token to retrieve the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListProvisioningTemplateVersionsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getVersions() != null)
            sb.append("Versions: ").append(getVersions()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListProvisioningTemplateVersionsResult == false)
            return false;
        ListProvisioningTemplateVersionsResult other = (ListProvisioningTemplateVersionsResult) obj;
        if (other.getVersions() == null ^ this.getVersions() == null)
            return false;
        if (other.getVersions() != null && other.getVersions().equals(this.getVersions()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVersions() == null) ? 0 : getVersions().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListProvisioningTemplateVersionsResult clone() {
        try {
            return (ListProvisioningTemplateVersionsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
