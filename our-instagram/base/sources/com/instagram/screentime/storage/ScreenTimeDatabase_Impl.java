package com.instagram.screentime.storage;

import X.AbstractC28801aI;
import X.AbstractC28981ab;
import X.C28381Yz;
import X.C28621Zy;
import X.C28861aP;
import X.C37471ok;
import X.C99044cR;
import X.InterfaceC29101an;
import X.InterfaceC37481ol;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.screentime.storage.ScreenTimeDatabase_Impl;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public final class ScreenTimeDatabase_Impl extends ScreenTimeDatabase {
    public volatile C99044cR A00;

    @Override // X.C1YP
    public final C28621Zy createInvalidationTracker() {
        return new C28621Zy(this, new HashMap(0), new HashMap(0), "screentime_sync");
    }

    @Override // X.C1YP
    public final void clearAllTables() {
        super.assertNotMainThread();
        InterfaceC37481ol CHx = super.getOpenHelper().CHx();
        try {
            super.beginTransaction();
            CHx.ATG("DELETE FROM `screentime_sync`");
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
        return c28381Yz.A02.AL5(AbstractC28981ab.A00(c28381Yz.A00, new C28861aP(c28381Yz, new AbstractC28801aI() { // from class: X.4cQ
            {
                super(1);
            }

            @Override // X.AbstractC28801aI
            public final void onPostMigrate(InterfaceC37481ol interfaceC37481ol) {
            }

            @Override // X.AbstractC28801aI
            public final A6Q onValidateSchema(InterfaceC37481ol interfaceC37481ol) {
                HashMap hashMap = new HashMap(3);
                hashMap.put(PublicKeyCredentialControllerUtility.JSON_KEY_ID, new C63003SaR(PublicKeyCredentialControllerUtility.JSON_KEY_ID, "INTEGER", null, 1, 1, true));
                hashMap.put("last_sync_time", new C63003SaR("last_sync_time", "INTEGER", null, 0, 1, true));
                hashMap.put("tia_last_interval_end", new C63003SaR("tia_last_interval_end", "INTEGER", null, 0, 1, false));
                C23008ACh c23008ACh = new C23008ACh("screentime_sync", hashMap, new HashSet(0), new HashSet(0));
                C23008ACh A00 = RrF.A00(interfaceC37481ol, "screentime_sync");
                if (!c23008ACh.equals(A00)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("screentime_sync(com.instagram.screentime.storage.ScreenTimeSyncStateEntity).\n Expected:\n");
                    sb.append(c23008ACh);
                    sb.append("\n Found:\n");
                    sb.append(A00);
                    return new A6Q(false, sb.toString());
                }
                return new A6Q(true, null);
            }

            @Override // X.AbstractC28801aI
            public final void createAllTables(InterfaceC37481ol interfaceC37481ol) {
                interfaceC37481ol.ATG("CREATE TABLE IF NOT EXISTS `screentime_sync` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `last_sync_time` INTEGER NOT NULL, `tia_last_interval_end` INTEGER)");
                interfaceC37481ol.ATG(AbstractC111324zv.A00(40));
                interfaceC37481ol.ATG("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'dd0e82fa5800eec1fd75807c74de1575')");
            }

            @Override // X.AbstractC28801aI
            public final void dropAllTables(InterfaceC37481ol interfaceC37481ol) {
                interfaceC37481ol.ATG("DROP TABLE IF EXISTS `screentime_sync`");
                List list = ScreenTimeDatabase_Impl.this.mCallbacks;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((C2LL) it.next()).A01(interfaceC37481ol);
                    }
                }
            }

            @Override // X.AbstractC28801aI
            public final void onCreate(InterfaceC37481ol interfaceC37481ol) {
                List list = ScreenTimeDatabase_Impl.this.mCallbacks;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((C2LL) it.next()).A00(interfaceC37481ol);
                    }
                }
            }

            @Override // X.AbstractC28801aI
            public final void onOpen(InterfaceC37481ol interfaceC37481ol) {
                ScreenTimeDatabase_Impl screenTimeDatabase_Impl = ScreenTimeDatabase_Impl.this;
                screenTimeDatabase_Impl.mDatabase = interfaceC37481ol;
                screenTimeDatabase_Impl.internalInitInvalidationTracker(interfaceC37481ol);
                List list = screenTimeDatabase_Impl.mCallbacks;
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
        }, "dd0e82fa5800eec1fd75807c74de1575", "14b6569592437f4756f8595a54f005d3"), c28381Yz.A04, false, false));
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
        hashMap.put(C99044cR.class, Collections.emptyList());
        return hashMap;
    }
}
