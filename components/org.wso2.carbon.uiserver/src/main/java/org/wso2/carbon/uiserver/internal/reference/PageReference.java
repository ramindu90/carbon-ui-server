/*
 * Copyright (c) 2017, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.wso2.carbon.uiserver.internal.reference;

import org.wso2.carbon.uiserver.internal.exception.FileOperationException;

/**
 * A reference to a page in a web app.
 *
 * @since 0.8.0
 */
public interface PageReference {

    /**
     * Returns the path pattern of the page represented by this reference.
     *
     * @return path pattern of the page
     * @throws FileOperationException if cannot get the path pattern
     */
    String getPathPattern() throws FileOperationException;

    /**
     * Returns a reference to the HTMl if of the page represented by this reference.
     *
     * @return reference to the HTML file of the page
     */
    FileReference getHtmlFile();
}
