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
package com.amazonaws.services.iotjobsdataplane.model;

import javax.annotation.Generated;

/**
 * <p>
 * An update attempted to change the job execution to a state that is invalid because of the job execution's current
 * state (for example, an attempt to change a request in state SUCCESS to state IN_PROGRESS). In this case, the body of
 * the error message also contains the executionState field.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InvalidStateTransitionException extends com.amazonaws.services.iotjobsdataplane.model.AWSIoTJobsDataPlaneException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new InvalidStateTransitionException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public InvalidStateTransitionException(String message) {
        super(message);
    }

}
