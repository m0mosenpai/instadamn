package com.instagram.direct.wellbeing.teensafety.safetyinterventions.data.database;

import X.AbstractC28801aI;
import X.AbstractC28981ab;
import X.C164447Xj;
import X.C164457Xk;
import X.C28381Yz;
import X.C28621Zy;
import X.C28861aP;
import X.C37471ok;
import X.InterfaceC29101an;
import X.InterfaceC37481ol;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import com.instagram.direct.wellbeing.teensafety.safetyinterventions.data.database.SafetyInterventionsDatabase_Impl;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public final class SafetyInterventionsDatabase_Impl extends SafetyInterventionsDatabase {
    public volatile C164457Xk A00;
    public volatile C164447Xj A01;

    @Override // X.C1YP
    public final C28621Zy createInvalidationTracker() {
        return new C28621Zy(this, new HashMap(0), new HashMap(0), "global_impression_tracker", "user_impression_tracker");
    }

    @Override // X.C1YP
    public final void clearAllTables() {
        super.assertNotMainThread();
        InterfaceC37481ol CHx = super.getOpenHelper().CHx();
        try {
            super.beginTransaction();
            CHx.ATG("DELETE FROM `global_impression_tracker`");
            CHx.ATG("DELETE FROM `user_impression_tracker`");
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
        return c28381Yz.A02.AL5(AbstractC28981ab.A00(c28381Yz.A00, new C28861aP(c28381Yz, new AbstractC28801aI() { // from class: X.7Xi
            {
                super(1);
            }

            @Override // X.AbstractC28801aI
            public final void onPostMigrate(InterfaceC37481ol interfaceC37481ol) {
            }

            @Override // X.AbstractC28801aI
            public final A6Q onValidateSchema(InterfaceC37481ol interfaceC37481ol) {
                StringBuilder sb;
                String str;
                HashMap hashMap = new HashMap(3);
                hashMap.put("intervention_type", new C63003SaR("intervention_type", "TEXT", null, 1, 1, true));
                hashMap.put("total_impressions", new C63003SaR("total_impressions", "INTEGER", "0", 0, 1, true));
                hashMap.put("last_impression_timestamp", new C63003SaR("last_impression_timestamp", "INTEGER", "0", 0, 1, true));
                C23008ACh c23008ACh = new C23008ACh("global_impression_tracker", hashMap, new HashSet(0), new HashSet(0));
                C23008ACh A00 = RrF.A00(interfaceC37481ol, "global_impression_tracker");
                if (!c23008ACh.equals(A00)) {
                    sb = new StringBuilder();
                    str = "global_impression_tracker(com.instagram.direct.wellbeing.teensafety.safetyinterventions.data.database.SafetyInterventionsGlobalImpressionTrackerEntity).\n Expected:\n";
                } else {
                    HashMap hashMap2 = new HashMap(4);
                    hashMap2.put("intervention_type", new C63003SaR("intervention_type", "TEXT", null, 1, 1, true));
                    hashMap2.put(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, new C63003SaR(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, "TEXT", null, 2, 1, true));
                    hashMap2.put("total_impressions", new C63003SaR("total_impressions", "INTEGER", "0", 0, 1, true));
                    hashMap2.put("last_impression_timestamp", new C63003SaR("last_impression_timestamp", "INTEGER", "0", 0, 1, true));
                    c23008ACh = new C23008ACh("user_impression_tracker", hashMap2, new HashSet(0), new HashSet(0));
                    A00 = RrF.A00(interfaceC37481ol, "user_impression_tracker");
                    if (!c23008ACh.equals(A00)) {
                        sb = new StringBuilder();
                        str = "user_impression_tracker(com.instagram.direct.wellbeing.teensafety.safetyinterventions.data.database.SafetyInterventionsUserImpressionTrackerEntity).\n Expected:\n";
                    } else {
                        return new A6Q(true, null);
                    }
                }
                sb.append(str);
                sb.append(c23008ACh);
                sb.append("\n Found:\n");
                sb.append(A00);
                return new A6Q(false, sb.toString());
            }

            @Override // X.AbstractC28801aI
            public final void createAllTables(InterfaceC37481ol interfaceC37481ol) {
                interfaceC37481ol.ATG("CREATE TABLE IF NOT EXISTS `global_impression_tracker` (`intervention_type` TEXT NOT NULL, `total_impressions` INTEGER NOT NULL DEFAULT 0, `last_impression_timestamp` INTEGER NOT NULL DEFAULT 0, PRIMARY KEY(`intervention_type`))");
                interfaceC37481ol.ATG("CREATE TABLE IF NOT EXISTS `user_impression_tracker` (`intervention_type` TEXT NOT NULL, `user_id` TEXT NOT NULL, `total_impressions` INTEGER NOT NULL DEFAULT 0, `last_impression_timestamp` INTEGER NOT NULL DEFAULT 0, PRIMARY KEY(`intervention_type`, `user_id`))");
                interfaceC37481ol.ATG("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                interfaceC37481ol.ATG("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '6c1551e9233e780b87a9e97472ec020e')");
            }

            @Override // X.AbstractC28801aI
            public final void dropAllTables(InterfaceC37481ol interfaceC37481ol) {
                interfaceC37481ol.ATG("DROP TABLE IF EXISTS `global_impression_tracker`");
                interfaceC37481ol.ATG("DROP TABLE IF EXISTS `user_impression_tracker`");
                List list = SafetyInterventionsDatabase_Impl.this.mCallbacks;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((C2LL) it.next()).A01(interfaceC37481ol);
                    }
                }
            }

            @Override // X.AbstractC28801aI
            public final void onCreate(InterfaceC37481ol interfaceC37481ol) {
                List list = SafetyInterventionsDatabase_Impl.this.mCallbacks;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((C2LL) it.next()).A00(interfaceC37481ol);
                    }
                }
            }

            @Override // X.AbstractC28801aI
            public final void onOpen(InterfaceC37481ol interfaceC37481ol) {
                SafetyInterventionsDatabase_Impl safetyInterventionsDatabase_Impl = SafetyInterventionsDatabase_Impl.this;
                safetyInterventionsDatabase_Impl.mDatabase = interfaceC37481ol;
                safetyInterventionsDatabase_Impl.internalInitInvalidationTracker(interfaceC37481ol);
                List list = safetyInterventionsDatabase_Impl.mCallbacks;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((C2LL) it.next()).A02(interfaceC37481ol);
                    }
                }
            }

            @Override // X.AbstractC28801aI
            public final void onPreMigrate(InterfaceC37481ol interfaceC37481ol) {
                C3EP.A01(interfaceC37481ol);
            }
        }, "6c1551e9233e780b87a9e97472ec020e", "bc05b5e40cdd903050566d822051f47a"), c28381Yz.A04, false, false));
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
        hashMap.put(C164447Xj.class, Collections.emptyList());
        hashMap.put(C164457Xk.class, Collections.emptyList());
        return hashMap;
    }
}
