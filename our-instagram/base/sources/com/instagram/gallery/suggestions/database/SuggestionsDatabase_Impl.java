package com.instagram.gallery.suggestions.database;

import X.AbstractC111324zv;
import X.AbstractC166987dD;
import X.AbstractC43591JPw;
import X.AbstractC72046XLm;
import X.AbstractC72048XLo;
import X.AbstractC72049XLp;
import X.C28381Yz;
import X.C28621Zy;
import X.C47915LEj;
import X.C72063XMg;
import X.InterfaceC29101an;
import X.InterfaceC37481ol;
import X.L0C;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes12.dex */
public final class SuggestionsDatabase_Impl extends SuggestionsDatabase {
    public volatile L0C A00;
    public volatile C47915LEj A01;

    @Override // X.C1YP
    public final C28621Zy createInvalidationTracker() {
        return new C28621Zy(this, AbstractC72046XLm.A0g(0), AbstractC72046XLm.A0g(0), AbstractC43591JPw.A00(213), "suggestion_medium");
    }

    @Override // com.instagram.gallery.suggestions.database.SuggestionsDatabase
    public final C47915LEj A00() {
        C47915LEj c47915LEj;
        if (this.A01 != null) {
            return this.A01;
        }
        synchronized (this) {
            if (this.A01 == null) {
                this.A01 = new C47915LEj(this);
            }
            c47915LEj = this.A01;
        }
        return c47915LEj;
    }

    @Override // X.C1YP
    public final InterfaceC29101an createOpenHelper(C28381Yz c28381Yz) {
        return AbstractC72048XLo.A06(c28381Yz, new C72063XMg(this), "1ff21b556f1ac0738d52f2ae83a7be4f", "52806978387d0f02a31efb4d8f6da22e");
    }

    @Override // X.C1YP
    public final void clearAllTables() {
        super.assertNotMainThread();
        InterfaceC37481ol CHx = super.getOpenHelper().CHx();
        try {
            super.beginTransaction();
            CHx.ATG(AbstractC111324zv.A00(1708));
            CHx.ATG("DELETE FROM `suggestions`");
            CHx.ATG("DELETE FROM `suggestion_medium`");
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
        AbstractC72046XLm.A1Q(C47915LEj.class, A1G);
        AbstractC72046XLm.A1Q(L0C.class, A1G);
        return A1G;
    }
}
