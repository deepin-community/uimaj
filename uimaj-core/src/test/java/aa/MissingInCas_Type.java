/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
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

package aa;

import org.apache.uima.cas.FeatureStructure;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.FSGenerator;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.cas.TOP_Type;

/**
 * Updated by JCasGen Tue Feb 21 14:56:04 EST 2006
 * 
 * @generated
 */
public class MissingInCas_Type extends TOP_Type {
  /** @generated */
  protected FSGenerator getFSGenerator() {
    return fsGenerator;
  }

  /** @generated */
  private final FSGenerator fsGenerator = new FSGenerator() {
    public FeatureStructure createFS(int addr, CASImpl cas) {
      if (MissingInCas_Type.this.useExistingInstance) {
        // Return eq fs instance if already created
        FeatureStructure fs = MissingInCas_Type.this.jcas.getJfsFromCaddr(addr);
        if (null == fs) {
          fs = new MissingInCas(addr, MissingInCas_Type.this);
          MissingInCas_Type.this.jcas.putJfsFromCaddr(addr, fs);
          return fs;
        }
        return fs;
      } else
        return new MissingInCas(addr, MissingInCas_Type.this);
    }
  };

  /** @generated */
  public final static int typeIndexID = MissingInCas.typeIndexID;

  /**
   * @generated
   * @modifiable
   */
  public final static boolean featOkTst = org.apache.uima.jcas.JCasRegistry.getFeatOkTst("aa.MissingInCas");

  /**
   * initialize variables to correspond with Cas Type and Features
   * 
   * @generated
   */
  public MissingInCas_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl) this.casType, getFSGenerator());

  }
}
