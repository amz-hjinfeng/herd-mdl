/*
 * Copyright 2018 herd-mdl contributors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
**/
package org.tsi.mdlt.enums;

/**
 * enumeration for stack input parameters
 */
public enum StackInputParameterKeyEnum {
    MDL_INSTANCE_NAME("MDLInstanceName"),
    DEPLOYMENT_BUCKET_NAME("DeploymentBucketName"),
    RELEASE_VERSION("ReleaseVersion"),
    CREATE_DEMO_OBJECT("CreateDemoObjects"),
    ENABLE_SSL_AUTH("EnableSSLAndAuth"),
    ROLLBACK_ON_FAILURE("RollbackOnFailure"),
    ENVIRONMENT("Environment"),
    DEPLOY_COMPONENTS("DeployComponents"),
    CREATE_OPEN_lDAP("CreateOpenLDAP");

    private String key;

    StackInputParameterKeyEnum(String key) {
        this.key = key;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
