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
package com.iris.platform.rule.environment;

import com.iris.common.rule.Context;
import com.iris.common.rule.event.RuleEvent;
import com.iris.messages.MessageBody;
import com.iris.messages.PlatformMessage;
import com.iris.messages.address.Address;

public interface PlaceEventHandler {

   boolean isDeleted();
   
   boolean isAvailable();
   
   void start();
   
   void stop();

   Address getAddress();
   
   Context getContext();
   
   void onEvent(RuleEvent event);
   
   MessageBody handleRequest(PlatformMessage message);
}

