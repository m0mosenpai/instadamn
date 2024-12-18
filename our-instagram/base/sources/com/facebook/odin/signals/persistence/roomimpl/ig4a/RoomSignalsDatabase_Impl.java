package com.facebook.odin.signals.persistence.roomimpl.ig4a;

import X.AbstractC28801aI;
import X.AbstractC28981ab;
import X.C28381Yz;
import X.C28621Zy;
import X.C28861aP;
import X.C37471ok;
import X.C3SV;
import X.InterfaceC29101an;
import X.InterfaceC37481ol;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.odin.signals.persistence.roomimpl.ig4a.RoomSignalsDatabase_Impl;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public final class RoomSignalsDatabase_Impl extends RoomSignalsDatabase {
    public volatile C3SV A00;

    @Override // X.C1YP
    public final C28621Zy createInvalidationTracker() {
        return new C28621Zy(this, new HashMap(0), new HashMap(0), "signals");
    }

    @Override // X.C1YP
    public final void clearAllTables() {
        super.assertNotMainThread();
        InterfaceC37481ol CHx = super.getOpenHelper().CHx();
        try {
            super.beginTransaction();
            CHx.ATG("DELETE FROM `signals`");
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
        return c28381Yz.A02.AL5(AbstractC28981ab.A00(c28381Yz.A00, new C28861aP(c28381Yz, new AbstractC28801aI() { // from class: X.3SU
            {
                super(1);
            }

            @Override // X.AbstractC28801aI
            public final void onPostMigrate(InterfaceC37481ol interfaceC37481ol) {
            }

            @Override // X.AbstractC28801aI
            public final void createAllTables(InterfaceC37481ol interfaceC37481ol) {
                interfaceC37481ol.ATG("CREATE TABLE IF NOT EXISTS `signals` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `signal_id` TEXT NOT NULL, `timestamp` INTEGER NOT NULL, `signal_component_id` INTEGER, `context` TEXT, `type` INTEGER NOT NULL, `long_value` INTEGER, `float_value` REAL, `text_value` TEXT, `expiration_timestamp` INTEGER NOT NULL)");
                interfaceC37481ol.ATG("CREATE INDEX IF NOT EXISTS `index_signals_signal_id` ON `signals` (`signal_id`)");
                interfaceC37481ol.ATG("CREATE INDEX IF NOT EXISTS `index_signals_timestamp` ON `signals` (`timestamp`)");
                interfaceC37481ol.ATG(AbstractC111324zv.A00(40));
                interfaceC37481ol.ATG("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'eead9bda19a66b723cc9e635c2c65732')");
            }

            @Override // X.AbstractC28801aI
            public final void dropAllTables(InterfaceC37481ol interfaceC37481ol) {
                interfaceC37481ol.ATG("DROP TABLE IF EXISTS `signals`");
                List list = RoomSignalsDatabase_Impl.this.mCallbacks;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((C2LL) it.next()).A01(interfaceC37481ol);
                    }
                }
            }

            @Override // X.AbstractC28801aI
            public final void onCreate(InterfaceC37481ol interfaceC37481ol) {
                List list = RoomSignalsDatabase_Impl.this.mCallbacks;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((C2LL) it.next()).A00(interfaceC37481ol);
                    }
                }
            }

            @Override // X.AbstractC28801aI
            public final void onOpen(InterfaceC37481ol interfaceC37481ol) {
                RoomSignalsDatabase_Impl roomSignalsDatabase_Impl = RoomSignalsDatabase_Impl.this;
                roomSignalsDatabase_Impl.mDatabase = interfaceC37481ol;
                roomSignalsDatabase_Impl.internalInitInvalidationTracker(interfaceC37481ol);
                List list = roomSignalsDatabase_Impl.mCallbacks;
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
                hashMap.put("signal_id", new C63003SaR("signal_id", "TEXT", null, 0, 1, true));
                hashMap.put("timestamp", new C63003SaR("timestamp", "INTEGER", null, 0, 1, true));
                hashMap.put("signal_component_id", new C63003SaR("signal_component_id", "INTEGER", null, 0, 1, false));
                hashMap.put("context", new C63003SaR("context", "TEXT", null, 0, 1, false));
                hashMap.put(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, new C63003SaR(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "INTEGER", null, 0, 1, true));
                hashMap.put("long_value", new C63003SaR("long_value", "INTEGER", null, 0, 1, false));
                hashMap.put("float_value", new C63003SaR("float_value", "REAL", null, 0, 1, false));
                hashMap.put("text_value", new C63003SaR("text_value", "TEXT", null, 0, 1, false));
                hashMap.put("expiration_timestamp", new C63003SaR("expiration_timestamp", "INTEGER", null, 0, 1, true));
                HashSet hashSet = new HashSet(0);
                HashSet hashSet2 = new HashSet(2);
                hashSet2.add(new SP3("index_signals_signal_id", Arrays.asList("signal_id"), Arrays.asList("ASC"), false));
                hashSet2.add(new SP3("index_signals_timestamp", Arrays.asList("timestamp"), Arrays.asList("ASC"), false));
                C23008ACh c23008ACh = new C23008ACh("signals", hashMap, hashSet, hashSet2);
                C23008ACh A00 = RrF.A00(interfaceC37481ol, "signals");
                if (!c23008ACh.equals(A00)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("signals(com.facebook.odin.signals.persistence.roomimpl.SignalEntity).\n Expected:\n");
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
        }, "eead9bda19a66b723cc9e635c2c65732", "70557efde1a6c901c2fd2cf162953e0a"), c28381Yz.A04, false, false));
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
        hashMap.put(C3SV.class, Collections.emptyList());
        return hashMap;
    }
}
