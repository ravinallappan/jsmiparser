/*
 * Copyright 2005 Davy Verstappen.
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
package org.jsmiparser.smi;

import org.jsmiparser.util.token.IdToken;

public class SmiAttribute extends SmiObjectType {

    public SmiAttribute(IdToken idToken, SmiModule module) {
		super(idToken, module);
	}

	public SmiClass getSmiClass() {
        return null; // TODO
    }

    public String getCodeConstantId() {
		return getModule().getMib().getCodeNamingStrategy().getCodeConstantId(this);
	}
	
	public String getFullCodeConstantId() {
		return getModule().getMib().getCodeNamingStrategy().getFullCodeConstantId(this);
	}

	public String getCodeOid() {
		return getOid();
	}

	public String getCodeId() {
		return getModule().getMib().getCodeNamingStrategy().getAttributeId(this);
	}

    public String getRequestMethodId() {
		return getModule().getMib().getCodeNamingStrategy().getRequestMethodId(this);
	}

	public String getGetterMethodId() {
		return getModule().getMib().getCodeNamingStrategy().getGetterMethodId(this);
	}

	public String getSetterMethodId() {
		return getModule().getMib().getCodeNamingStrategy().getSetterMethodId(this);
	}

}
