/*
 *   Copyright 2019-2020 SharifPoetra
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */
package com.sharif.thunder.datasources;

import com.sharif.thunder.DataSource;

public class InVCRoles extends DataSource {

  public InVCRoles() {
    this.filename = "discordbot.invcroles";
    this.generateKey =
        (item) -> {
          return item[GUILDID];
        };
    this.size = 2;
  }

  public static final int GUILDID = 0;
  public static final int ROLEID = 1;
}
