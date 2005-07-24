/*
 * Copyright 2005 Nigel Sheridan-Smith, Davy Verstappen.
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
 */
package org.jsmiparser.parsetree.asn1;

import org.jsmiparser.util.token.IdToken;

/**
 * @author davy
 */
public abstract class AbstractNamedSymbol extends AbstractSymbol implements NamedSymbol {
    private IdToken m_idToken;

    public AbstractNamedSymbol(Context context, IdToken idToken) {
        super(context);
        m_idToken = idToken;
    }

    public String getName() {
        return m_idToken.getId();
    }

    public IdToken getIdToken() {
        return m_idToken;
    }
}