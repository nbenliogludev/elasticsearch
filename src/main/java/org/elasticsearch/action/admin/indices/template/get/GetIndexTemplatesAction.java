/*
 * Licensed to Elasticsearch under one or more contributor
 * license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright
 * ownership. Elasticsearch licenses this file to you under
 * the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.elasticsearch.action.admin.indices.template.get;

import org.elasticsearch.action.admin.indices.IndicesAction;
import org.elasticsearch.client.IndicesAdminClient;

/**
 *
 */
public class GetIndexTemplatesAction extends IndicesAction<GetIndexTemplatesRequest, GetIndexTemplatesResponse, GetIndexTemplatesRequestBuilder> {

    public static final GetIndexTemplatesAction INSTANCE = new GetIndexTemplatesAction();
    public static final String NAME = "cluster:admin/template/get";

    protected GetIndexTemplatesAction() {
        super(NAME);
    }

    @Override
    public GetIndexTemplatesResponse newResponse() {
        return new GetIndexTemplatesResponse();
    }

    @Override
    public GetIndexTemplatesRequestBuilder newRequestBuilder(IndicesAdminClient client) {
        return new GetIndexTemplatesRequestBuilder(client);
    }
}
