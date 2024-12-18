package com.facebook.odin.features.persistence.room.ig4a;

import X.AbstractC28801aI;
import X.AbstractC28981ab;
import X.C28381Yz;
import X.C28621Zy;
import X.C28861aP;
import X.C37471ok;
import X.C3S0;
import X.InterfaceC29101an;
import X.InterfaceC37481ol;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.odin.features.persistence.room.ig4a.IgRoomExampleDatabase_Impl;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public final class IgRoomExampleDatabase_Impl extends IgRoomExampleDatabase {
    public volatile C3S0 A00;

    @Override // X.C1YP
    public final C28621Zy createInvalidationTracker() {
        return new C28621Zy(this, new HashMap(0), new HashMap(0), "examples");
    }

    @Override // X.C1YP
    public final void clearAllTables() {
        super.assertNotMainThread();
        InterfaceC37481ol CHx = super.getOpenHelper().CHx();
        try {
            super.beginTransaction();
            CHx.ATG("DELETE FROM `examples`");
            super.setTransactionSuccessful();
        } finally {
            super.endTransaction();
            CHx.E7O("PRAGMA wal_checkpoint(FULL)").close();
            if (!((C37471ok) CHx).A00.inTransaction()) {
                CHx.ATG("VACUUM");
            }
        }
    }

    @Override // X.C1YP
    public final InterfaceC29101an createOpenHelper(C28381Yz c28381Yz) {
        return c28381Yz.A02.AL5(AbstractC28981ab.A00(c28381Yz.A00, new C28861aP(c28381Yz, new AbstractC28801aI() { // from class: X.3Rz
            {
                super(1);
            }

            @Override // X.AbstractC28801aI
            public final void onPostMigrate(InterfaceC37481ol interfaceC37481ol) {
            }

            @Override // X.AbstractC28801aI
            public final void createAllTables(InterfaceC37481ol interfaceC37481ol) {
                interfaceC37481ol.ATG("CREATE TABLE IF NOT EXISTS `examples` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `example_id` TEXT NOT NULL, `use_case` TEXT NOT NULL, `use_case_version` TEXT NOT NULL, `model_version` INTEGER NOT NULL, `label` INTEGER NOT NULL, `features` TEXT NOT NULL, `timestamp` INTEGER NOT NULL, `label_timestamp` INTEGER NOT NULL, `context` TEXT NOT NULL)");
                interfaceC37481ol.ATG(AbstractC111324zv.A00(40));
                interfaceC37481ol.ATG("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '473251c2ba832c8fe881158dd000e9e1')");
            }

            @Override // X.AbstractC28801aI
            public final void dropAllTables(InterfaceC37481ol interfaceC37481ol) {
                interfaceC37481ol.ATG("DROP TABLE IF EXISTS `examples`");
                List list = IgRoomExampleDatabase_Impl.this.mCallbacks;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((C2LL) it.next()).A01(interfaceC37481ol);
                    }
                }
            }

            @Override // X.AbstractC28801aI
            public final void onCreate(InterfaceC37481ol interfaceC37481ol) {
                List list = IgRoomExampleDatabase_Impl.this.mCallbacks;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((C2LL) it.next()).A00(interfaceC37481ol);
                    }
                }
            }

            @Override // X.AbstractC28801aI
            public final void onOpen(InterfaceC37481ol interfaceC37481ol) {
                IgRoomExampleDatabase_Impl igRoomExampleDatabase_Impl = IgRoomExampleDatabase_Impl.this;
                igRoomExampleDatabase_Impl.mDatabase = interfaceC37481ol;
                igRoomExampleDatabase_Impl.internalInitInvalidationTracker(interfaceC37481ol);
                List list = igRoomExampleDatabase_Impl.mCallbacks;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((C2LL) it.next()).A02(interfaceC37481ol);
                    }
                }
            }

            @Override // X.AbstractC28801aI
            public final A6Q onValidateSchema(InterfaceC37481ol interfaceC37481ol) {
                HashMap hashMap = new HashMap(10);
                hashMap.put(PublicKeyCredentialControllerUtility.JSON_KEY_ID, new C63003SaR(PublicKeyCredentialControllerUtility.JSON_KEY_ID, "INTEGER", null, 1, 1, true));
                hashMap.put("example_id", new C63003SaR("example_id", "TEXT", null, 0, 1, true));
                hashMap.put("use_case", new C63003SaR("use_case", "TEXT", null, 0, 1, true));
                hashMap.put("use_case_version", new C63003SaR("use_case_version", "TEXT", null, 0, 1, true));
                hashMap.put("model_version", new C63003SaR("model_version", "INTEGER", null, 0, 1, true));
                hashMap.put("label", new C63003SaR("label", "INTEGER", null, 0, 1, true));
                hashMap.put("features", new C63003SaR("features", "TEXT", null, 0, 1, true));
                hashMap.put("timestamp", new C63003SaR("timestamp", "INTEGER", null, 0, 1, true));
                hashMap.put("label_timestamp", new C63003SaR("label_timestamp", "INTEGER", null, 0, 1, true));
                hashMap.put("context", new C63003SaR("context", "TEXT", null, 0, 1, true));
                C23008ACh c23008ACh = new C23008ACh("examples", hashMap, new HashSet(0), new HashSet(0));
                C23008ACh A00 = RrF.A00(interfaceC37481ol, "examples");
                if (!c23008ACh.equals(A00)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("examples(com.facebook.odin.features.persistence.room.ExampleEntity).\n Expected:\n");
                    sb.append(c23008ACh);
                    sb.append("\n Found:\n");
                    sb.append(A00);
                    return new A6Q(false, sb.toString());
                }
                return new A6Q(true, null);
            }

            @Override // X.AbstractC28801aI
            public final void onPreMigrate(InterfaceC37481ol interfaceC37481ol) {
                C3EP.A01(interfaceC37481ol);
            }
        }, "473251c2ba832c8fe881158dd000e9e1", "2a5823346c2c2315a12517407d12f3ce"), c28381Yz.A04, false, false));
    }

    @Override // X.C1YP
    public final List getAutoMigrations(Map map) {
        return new ArrayList();
    }

    @Override // X.C1YP
    public final Set getRequiredAutoMigrationSpecs() {
        return new HashSet();
    }

    @Override // X.C1YP
    public final Map getRequiredTypeConverters() {
        HashMap hashMap = new HashMap();
        hashMap.put(C3S0.class, Collections.emptyList());
        return hashMap;
    }
}
