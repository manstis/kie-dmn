/*
 * Copyright 2016 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.kie.dmn.core.ast;

import org.kie.dmn.feel.model.v1_1.Decision;

import java.util.HashMap;
import java.util.Map;

public class DecisionNode extends DMNBaseNode {

    private Decision decision;
    private Map<String, DMNBaseNode> dependencies = new HashMap<>(  );

    public DecisionNode() {
    }

    public DecisionNode(Decision decision) {
        this.decision = decision;
    }

    public Decision getDecision() {
        return decision;
    }

    public void setDecision(Decision decision) {
        this.decision = decision;
    }

    public Map<String, DMNBaseNode> getDependencies() {
        return dependencies;
    }

    public void setDependencies(Map<String, DMNBaseNode> dependencies) {
        this.dependencies = dependencies;
    }

    public void addDependency( String name, DMNBaseNode dependency ) {
        this.dependencies.put( name, dependency );
    }
}