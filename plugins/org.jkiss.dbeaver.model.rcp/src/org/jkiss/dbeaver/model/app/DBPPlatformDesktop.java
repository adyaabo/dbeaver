/*
 * DBeaver - Universal Database Manager
 * Copyright (C) 2010-2025 DBeaver Corp and others
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

package org.jkiss.dbeaver.model.app;

import org.jkiss.code.NotNull;
import org.jkiss.dbeaver.model.DBPExternalFileManager;
import org.jkiss.dbeaver.runtime.DBWorkbench;

/**
 * DBPPlatform
 */
public interface DBPPlatformDesktop extends DBPPlatform, DBPPlatformEventManager {

    @NotNull
    DBPWorkspaceDesktop getWorkspace();

    @NotNull
    DBPPlatformLanguage getLanguage();

    @NotNull
    DBPExternalFileManager getExternalFileManager();

    static DBPPlatformDesktop getInstance() {
        return DBWorkbench.getPlatform(DBPPlatformDesktop.class);
    }

    /**
     * Workbench is started when main workbench window is fully initialized.
     * This check was added because Eclipse plugins may trigger some UI actions
     * like dialogs during plugins activation and may lead to UI deadlocks.
     */
    boolean isWorkbenchStarted();

}
