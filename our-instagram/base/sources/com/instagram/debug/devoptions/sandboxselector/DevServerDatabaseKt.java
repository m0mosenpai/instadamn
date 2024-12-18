package com.instagram.debug.devoptions.sandboxselector;

import X.C14360o3;
import X.C1Ym;
import X.InterfaceC37481ol;

/* loaded from: classes12.dex */
public abstract class DevServerDatabaseKt {
    public static final C1Ym MIGRATION_1_2 = new C1Ym() { // from class: com.instagram.debug.devoptions.sandboxselector.DevServerDatabaseKt$MIGRATION_1_2$1
        @Override // X.C1Ym
        public void migrate(InterfaceC37481ol interfaceC37481ol) {
            C14360o3.A0B(interfaceC37481ol, 0);
            interfaceC37481ol.ATG("\n          ALTER TABLE internal_dev_servers\n          ADD COLUMN supports_vpnless integer NOT NULL DEFAULT 0\n        ");
        }
    };

    public static final C1Ym getMIGRATION_1_2() {
        return MIGRATION_1_2;
    }
}
