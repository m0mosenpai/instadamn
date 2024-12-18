package com.instagram.igtv.persistence;

import X.AbstractC166987dD;
import X.AbstractC72046XLm;
import X.AbstractC72048XLo;
import X.AbstractC72049XLp;
import X.C28381Yz;
import X.C28621Zy;
import X.C72063XMg;
import X.InterfaceC29101an;
import X.InterfaceC37481ol;
import X.MXP;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes12.dex */
public final class IGTVDatabase_Impl extends IGTVDatabase {
    public volatile MXP A00;

    @Override // X.C1YP
    public final C28621Zy createInvalidationTracker() {
        return new C28621Zy(this, AbstractC72046XLm.A0g(0), AbstractC72046XLm.A0g(0), "drafts");
    }

    @Override // X.C1YP
    public final InterfaceC29101an createOpenHelper(C28381Yz c28381Yz) {
        return AbstractC72048XLo.A06(c28381Yz, new C72063XMg(this), "fa0f0287d6550153fc6cd9d504c3a72d", "70e1ec6da29a4f47f581d0bd19f2361c");
    }

    @Override // X.C1YP
    public final void clearAllTables() {
        super.assertNotMainThread();
        InterfaceC37481ol CHx = super.getOpenHelper().CHx();
        try {
            super.beginTransaction();
            CHx.ATG("DELETE FROM `drafts`");
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
        AbstractC72046XLm.A1Q(MXP.class, A1G);
        return A1G;
    }
}
