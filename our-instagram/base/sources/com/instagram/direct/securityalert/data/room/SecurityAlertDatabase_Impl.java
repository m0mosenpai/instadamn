package com.instagram.direct.securityalert.data.room;

import X.AbstractC166987dD;
import X.AbstractC72046XLm;
import X.AbstractC72048XLo;
import X.AbstractC72049XLp;
import X.C28381Yz;
import X.C28621Zy;
import X.C47662L2v;
import X.C49276LqW;
import X.C72063XMg;
import X.InterfaceC29101an;
import X.InterfaceC37481ol;
import X.InterfaceC50511MRo;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes12.dex */
public final class SecurityAlertDatabase_Impl extends SecurityAlertDatabase {
    public volatile C47662L2v A00;
    public volatile InterfaceC50511MRo A01;

    @Override // X.C1YP
    public final C28621Zy createInvalidationTracker() {
        return new C28621Zy(this, AbstractC72046XLm.A0g(0), AbstractC72046XLm.A0g(0), "security_alert", "participant_device_change");
    }

    @Override // X.C1YP
    public final InterfaceC29101an createOpenHelper(C28381Yz c28381Yz) {
        return AbstractC72048XLo.A06(c28381Yz, new C72063XMg(this, 2, 42), "8a33cd745df9f5bcd6b94548c17b2894", "661210226e621143d7d122ae46330c34");
    }

    @Override // com.instagram.direct.securityalert.data.room.SecurityAlertDatabase
    public final C47662L2v A00() {
        C47662L2v c47662L2v;
        if (this.A00 != null) {
            return this.A00;
        }
        synchronized (this) {
            if (this.A00 == null) {
                this.A00 = new C47662L2v(this);
            }
            c47662L2v = this.A00;
        }
        return c47662L2v;
    }

    @Override // com.instagram.direct.securityalert.data.room.SecurityAlertDatabase
    public final InterfaceC50511MRo A01() {
        InterfaceC50511MRo interfaceC50511MRo;
        if (this.A01 != null) {
            return this.A01;
        }
        synchronized (this) {
            if (this.A01 == null) {
                this.A01 = new C49276LqW(this);
            }
            interfaceC50511MRo = this.A01;
        }
        return interfaceC50511MRo;
    }

    @Override // X.C1YP
    public final void clearAllTables() {
        super.assertNotMainThread();
        InterfaceC37481ol CHx = super.getOpenHelper().CHx();
        try {
            super.beginTransaction();
            CHx.ATG("DELETE FROM `security_alert`");
            CHx.ATG("DELETE FROM `participant_device_change`");
            super.setTransactionSuccessful();
        } finally {
            super.endTransaction();
            AbstractC72049XLp.A0E(CHx);
        }
    }

    @Override // X.C1YP
    public final List getAutoMigrations(Map map) {
        return AbstractC166987dD.A1E();
    }

    @Override // X.C1YP
    public final Set getRequiredAutoMigrationSpecs() {
        return AbstractC166987dD.A1H();
    }

    @Override // X.C1YP
    public final Map getRequiredTypeConverters() {
        HashMap A1G = AbstractC166987dD.A1G();
        AbstractC72046XLm.A1Q(InterfaceC50511MRo.class, A1G);
        AbstractC72046XLm.A1Q(C47662L2v.class, A1G);
        return A1G;
    }
}
