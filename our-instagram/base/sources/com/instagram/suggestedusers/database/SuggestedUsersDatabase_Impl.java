package com.instagram.suggestedusers.database;

import X.AbstractC111324zv;
import X.AbstractC166987dD;
import X.AbstractC72046XLm;
import X.AbstractC72048XLo;
import X.AbstractC72049XLp;
import X.C28381Yz;
import X.C28621Zy;
import X.C72063XMg;
import X.InterfaceC29101an;
import X.InterfaceC37481ol;
import X.L8y;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes12.dex */
public final class SuggestedUsersDatabase_Impl extends SuggestedUsersDatabase {
    public volatile L8y A00;

    @Override // X.C1YP
    public final C28621Zy createInvalidationTracker() {
        return new C28621Zy(this, AbstractC72046XLm.A0g(0), AbstractC72046XLm.A0g(0), AbstractC111324zv.A00(77));
    }

    @Override // X.C1YP
    public final InterfaceC29101an createOpenHelper(C28381Yz c28381Yz) {
        return AbstractC72048XLo.A06(c28381Yz, new C72063XMg(this, 7, 42), "89d395671163a6d305db059df658b0ce", "96ee0b36d0b314c6046f03d9fc155c8c");
    }

    @Override // com.instagram.suggestedusers.database.SuggestedUsersDatabase
    public final L8y A00() {
        L8y l8y;
        if (this.A00 != null) {
            return this.A00;
        }
        synchronized (this) {
            if (this.A00 == null) {
                this.A00 = new L8y(this);
            }
            l8y = this.A00;
        }
        return l8y;
    }

    @Override // X.C1YP
    public final void clearAllTables() {
        super.assertNotMainThread();
        InterfaceC37481ol CHx = super.getOpenHelper().CHx();
        try {
            super.beginTransaction();
            CHx.ATG("DELETE FROM `suggested_users`");
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
        AbstractC72046XLm.A1Q(L8y.class, A1G);
        return A1G;
    }
}
