/*
 * DBeaver - Universal Database Manager
 * Copyright (C) 2010-2022 DBeaver Corp and others
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
package org.jkiss.dbeaver.ui.dialogs.net;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.jkiss.code.NotNull;
import org.jkiss.dbeaver.model.net.DBWHandlerConfiguration;
import org.jkiss.dbeaver.ui.IObjectPropertyConfigurator;
import org.jkiss.dbeaver.ui.internal.UIConnectionMessages;

/**
 * SSL configuration
 */
public abstract class SSLConfiguratorAbstractUI implements IObjectPropertyConfigurator<Object, DBWHandlerConfiguration> {

    @Override
    public void resetSettings(@NotNull DBWHandlerConfiguration configuration) {

    }

    @Override
    public boolean isComplete() {
        return false;
    }

    protected void createSSLConfigHint(Composite composite, boolean optional, int hSpan) {
        Label tipLabel = new Label(composite, SWT.WRAP);
        StringBuilder tip = new StringBuilder();
        if (optional) {
            tip.append(UIConnectionMessages.dialog_setting_ssl_configurator_label_optional + "\n");
        }
        tip.append(UIConnectionMessages.dialog_setting_ssl_configurator_label_description + "\n\n");
        tipLabel.setText(tip.toString());
        if (hSpan > 1) {
            GridData gd = new GridData(GridData.FILL_HORIZONTAL);
            gd.horizontalSpan = hSpan;
            tipLabel.setLayoutData(gd);
        }
    }


}
