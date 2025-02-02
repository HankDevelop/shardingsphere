/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.shardingsphere.sharding.distsql.parser.segment;

import lombok.Getter;
import org.apache.shardingsphere.sql.parser.api.visitor.ASTNode;

import java.util.Collection;
import java.util.Collections;

/**
 * Audit strategy segment.
 */
@Getter
public final class AuditStrategySegment implements ASTNode {
    
    private Collection<String> auditorNames;
    
    private Collection<ShardingAuditorSegment> shardingAuditorSegments;
    
    private final boolean allowHintDisable;
    
    public AuditStrategySegment(final Collection<String> auditorNames, final boolean allowHintDisable) {
        this.auditorNames = auditorNames;
        this.shardingAuditorSegments = Collections.EMPTY_LIST;
        this.allowHintDisable = allowHintDisable;
    }
    
    public AuditStrategySegment(final Collection<String> auditorNames, final Collection<ShardingAuditorSegment> shardingAuditorSegments,
                                final boolean allowHintDisable) {
        this.auditorNames = auditorNames;
        this.shardingAuditorSegments = shardingAuditorSegments;
        this.allowHintDisable = allowHintDisable;
    }
}
