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

package org.apache.uima.adapter.soap;

import java.util.Iterator;
import java.util.Vector;

import org.apache.axis.Constants;
import org.apache.axis.Version;
import org.apache.axis.encoding.DeserializerFactory;
import org.apache.uima.adapter.soap.axis11.BinaryDeserializer_Axis11;

/**
 * An Axis deserializer factory that constructs instances of {@link BinaryDeserializer}.
 * 
 * 
 */
public class BinaryDeserializerFactory implements DeserializerFactory {

  private static final long serialVersionUID = 9029965561439924991L;

  private Vector mechanisms;

  public javax.xml.rpc.encoding.Deserializer getDeserializerAs(String mechanismType) {
    // There is a binary incompatibility between Axis v1.1 and
    // Axis v1.2 in the serializer/deserializer libraries.
    // So that UIMA can support both Axis versions, we have different
    // versions of each of our serializer classes. Here we check the
    // Axis version number and return an insance of the correct class.
    String ver = Version.getVersion();
    if (ver.startsWith("Apache Axis version: 1.1")) {
      return new BinaryDeserializer_Axis11();
    } else {
      return new BinaryDeserializer();
    }
  }

  public Iterator getSupportedMechanismTypes() {
    if (mechanisms == null) {
      mechanisms = new Vector();
      mechanisms.add(Constants.AXIS_SAX);
    }
    return mechanisms.iterator();
  }
}
