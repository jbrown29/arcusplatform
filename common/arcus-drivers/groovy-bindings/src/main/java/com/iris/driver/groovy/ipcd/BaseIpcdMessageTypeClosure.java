/*
 * Copyright 2019 Arcus Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.iris.driver.groovy.ipcd;

import groovy.lang.Closure;

import com.iris.driver.groovy.binding.EnvironmentBinding;
import com.iris.protocol.ipcd.message.model.MessageType;
import com.iris.protocol.ipcd.message.model.StatusType;

@SuppressWarnings("serial")
public class BaseIpcdMessageTypeClosure extends BaseIpcdClosure {
   private final MessageType messageType;
   
   protected BaseIpcdMessageTypeClosure(EnvironmentBinding binding, MessageType messageType) {
      super(binding);
      this.messageType = messageType;
   }
   
   protected void doCall(Closure<?> closure) {
      addHandler(null, null, closure);
   }
   
   protected void addHandler(String commandName, StatusType statusType, Closure<?> closure) {
      addHandler(messageType, commandName, statusType, closure);
   }
}

