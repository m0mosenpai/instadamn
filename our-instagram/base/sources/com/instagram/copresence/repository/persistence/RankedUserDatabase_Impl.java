package com.instagram.copresence.repository.persistence;

import X.AbstractC166987dD;
import X.AbstractC28981ab;
import X.AbstractC72046XLm;
import X.AbstractC72049XLp;
import X.C28381Yz;
import X.C28621Zy;
import X.C28861aP;
import X.C72063XMg;
import X.C72108XOe;
import X.C72110XOg;
import X.InterfaceC29101an;
import X.InterfaceC37481ol;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes12.dex */
public final class RankedUserDatabase_Impl extends RankedUserDatabase {
    public volatile C72110XOg A00;
    public volatile C72108XOe A01;

    @Override // X.C1YP
    public final C28621Zy createInvalidationTracker() {
        return new C28621Zy(this, AbstractC72046XLm.A0g(0), AbstractC72046XLm.A0g(0), "bff_ranked_user_model", "call_recipients_ranked_user_model");
    }

    @Override // X.C1YP
    public final InterfaceC29101an createOpenHelper(C28381Yz c28381Yz) {
        return c28381Yz.A02.AL5(AbstractC28981ab.A00(c28381Yz.A00, new C28861aP(c28381Yz, new C72063XMg(this, 0), "9fa95391669f185532ef5e2f5dc372b1", "d5a4bafc77d01750ab88f760a554e243"), c28381Yz.A04, false, false));
    }

    @Override // com.instagram.copresence.repository.persistence.RankedUserDatabase
    public final C72110XOg A00() {
        C72110XOg c72110XOg;
        if (this.A00 != null) {
            return this.A00;
        }
        synchronized (this) {
            if (this.A00 == null) {
                this.A00 = new C72110XOg(this);
            }
            c72110XOg = this.A00;
        }
        return c72110XOg;
    }

    @Override // com.instagram.copresence.repository.persistence.RankedUserDatabase
    public final C72108XOe A01() {
        C72108XOe c72108XOe;
        if (this.A01 != null) {
            return this.A01;
        }
        synchronized (this) {
            if (this.A01 == null) {
                this.A01 = new C72108XOe(this);
            }
            c72108XOe = this.A01;
        }
        return c72108XOe;
    }

    @Override // X.C1YP
    public final void clearAllTables() {
        super.assertNotMainThread();
        InterfaceC37481ol CHx = super.getOpenHelper().CHx();
        try {
            super.beginTransaction();
            CHx.ATG("DELETE FROM `bff_ranked_user_model`");
            CHx.ATG("DELETE FROM `call_recipients_ranked_user_model`");
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
        AbstractC72046XLm.A1Q(C72110XOg.class, A1G);
        AbstractC72046XLm.A1Q(C72108XOe.class, A1G);
        return A1G;
    }
}
