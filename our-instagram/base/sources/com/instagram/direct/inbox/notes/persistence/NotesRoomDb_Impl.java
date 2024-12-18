package com.instagram.direct.inbox.notes.persistence;

import X.AbstractC166987dD;
import X.AbstractC72046XLm;
import X.AbstractC72048XLo;
import X.AbstractC72049XLp;
import X.C28381Yz;
import X.C28621Zy;
import X.C47906LEa;
import X.C72063XMg;
import X.InterfaceC29101an;
import X.InterfaceC37481ol;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes12.dex */
public final class NotesRoomDb_Impl extends NotesRoomDb {
    public volatile C47906LEa A00;

    @Override // X.C1YP
    public final C28621Zy createInvalidationTracker() {
        return new C28621Zy(this, AbstractC72046XLm.A0g(0), AbstractC72046XLm.A0g(0), "note_entities_data");
    }

    @Override // X.C1YP
    public final InterfaceC29101an createOpenHelper(C28381Yz c28381Yz) {
        return AbstractC72048XLo.A06(c28381Yz, new C72063XMg(this, 1), "64b9cc273fc8ab43807f96b6e89205d1", "291baae5b8c585e41bf7d093be9c1c5f");
    }

    @Override // X.C1YP
    public final void clearAllTables() {
        super.assertNotMainThread();
        InterfaceC37481ol CHx = super.getOpenHelper().CHx();
        try {
            super.beginTransaction();
            CHx.ATG("DELETE FROM `note_entities_data`");
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
        AbstractC72046XLm.A1Q(C47906LEa.class, A1G);
        return A1G;
    }
}
