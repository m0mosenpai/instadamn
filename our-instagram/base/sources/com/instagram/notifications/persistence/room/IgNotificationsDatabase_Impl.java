package com.instagram.notifications.persistence.room;

import X.AbstractC109414wT;
import X.AbstractC28801aI;
import X.AbstractC28981ab;
import X.C109424wU;
import X.C28381Yz;
import X.C28621Zy;
import X.C28861aP;
import X.C37471ok;
import X.InterfaceC29101an;
import X.InterfaceC37481ol;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import com.instagram.notifications.persistence.room.IgNotificationsDatabase_Impl;
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
public final class IgNotificationsDatabase_Impl extends IgNotificationsDatabase {
    public volatile C109424wU A00;

    @Override // X.C1YP
    public final C28621Zy createInvalidationTracker() {
        return new C28621Zy(this, new HashMap(0), new HashMap(0), "ignotifications", "newfeedstory");
    }

    @Override // X.C1YP
    public final void clearAllTables() {
        super.assertNotMainThread();
        InterfaceC37481ol CHx = super.getOpenHelper().CHx();
        try {
            super.beginTransaction();
            CHx.ATG("DELETE FROM `ignotifications`");
            CHx.ATG("DELETE FROM `newfeedstory`");
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
        return c28381Yz.A02.AL5(AbstractC28981ab.A00(c28381Yz.A00, new C28861aP(c28381Yz, new AbstractC28801aI() { // from class: X.4wS
            {
                super(4);
            }

            @Override // X.AbstractC28801aI
            public final void onPostMigrate(InterfaceC37481ol interfaceC37481ol) {
            }

            @Override // X.AbstractC28801aI
            public final A6Q onValidateSchema(InterfaceC37481ol interfaceC37481ol) {
                StringBuilder sb;
                String str;
                HashMap hashMap = new HashMap(7);
                hashMap.put("push_id", new C63003SaR("push_id", "TEXT", null, 1, 1, true));
                hashMap.put("uuid", new C63003SaR("uuid", "TEXT", null, 0, 1, true));
                hashMap.put("recipient_id", new C63003SaR("recipient_id", "TEXT", null, 0, 1, true));
                hashMap.put("category", new C63003SaR("category", "TEXT", null, 0, 1, true));
                hashMap.put("timestamp", new C63003SaR("timestamp", "INTEGER", null, 0, 1, true));
                hashMap.put("is_rendered", new C63003SaR("is_rendered", "INTEGER", null, 0, 1, true));
                hashMap.put("data", new C63003SaR("data", "BLOB", null, 0, 1, true));
                HashSet hashSet = new HashSet(0);
                HashSet hashSet2 = new HashSet(2);
                hashSet2.add(new SP3("index_ignotifications_uuid", Arrays.asList("uuid"), Arrays.asList("ASC"), false));
                hashSet2.add(new SP3("index_ignotifications_timestamp", Arrays.asList("timestamp"), Arrays.asList("ASC"), false));
                C23008ACh c23008ACh = new C23008ACh("ignotifications", hashMap, hashSet, hashSet2);
                C23008ACh A00 = RrF.A00(interfaceC37481ol, "ignotifications");
                if (!c23008ACh.equals(A00)) {
                    sb = new StringBuilder();
                    str = "ignotifications(com.instagram.notifications.persistence.room.IgNotificationEntity).\n Expected:\n";
                } else {
                    HashMap hashMap2 = new HashMap(9);
                    hashMap2.put(PublicKeyCredentialControllerUtility.JSON_KEY_ID, new C63003SaR(PublicKeyCredentialControllerUtility.JSON_KEY_ID, "TEXT", null, 1, 1, true));
                    hashMap2.put(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, new C63003SaR(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, "TEXT", null, 0, 1, true));
                    hashMap2.put("notification_type", new C63003SaR("notification_type", "INTEGER", null, 0, 1, true));
                    hashMap2.put("timestamp", new C63003SaR("timestamp", "INTEGER", null, 0, 1, true));
                    hashMap2.put("first_impression_timestamp", new C63003SaR("first_impression_timestamp", "INTEGER", null, 0, 1, false));
                    hashMap2.put("impression_count", new C63003SaR("impression_count", "INTEGER", null, 0, 1, true));
                    hashMap2.put("priority_section_eligibility", new C63003SaR("priority_section_eligibility", "INTEGER", null, 0, 1, true));
                    hashMap2.put("major_app_version", new C63003SaR("major_app_version", "INTEGER", null, 0, 1, true));
                    hashMap2.put("data", new C63003SaR("data", "BLOB", null, 0, 1, true));
                    HashSet hashSet3 = new HashSet(0);
                    HashSet hashSet4 = new HashSet(1);
                    hashSet4.add(new SP3("index_newfeedstory_timestamp", Arrays.asList("timestamp"), Arrays.asList("ASC"), false));
                    c23008ACh = new C23008ACh("newfeedstory", hashMap2, hashSet3, hashSet4);
                    A00 = RrF.A00(interfaceC37481ol, "newfeedstory");
                    if (!c23008ACh.equals(A00)) {
                        sb = new StringBuilder();
                        str = "newfeedstory(com.instagram.notifications.persistence.room.NewsfeedStoryEntity).\n Expected:\n";
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
                interfaceC37481ol.ATG("CREATE TABLE IF NOT EXISTS `ignotifications` (`push_id` TEXT NOT NULL, `uuid` TEXT NOT NULL, `recipient_id` TEXT NOT NULL, `category` TEXT NOT NULL, `timestamp` INTEGER NOT NULL, `is_rendered` INTEGER NOT NULL, `data` BLOB NOT NULL, PRIMARY KEY(`push_id`))");
                interfaceC37481ol.ATG("CREATE INDEX IF NOT EXISTS `index_ignotifications_uuid` ON `ignotifications` (`uuid`)");
                interfaceC37481ol.ATG("CREATE INDEX IF NOT EXISTS `index_ignotifications_timestamp` ON `ignotifications` (`timestamp`)");
                interfaceC37481ol.ATG("CREATE TABLE IF NOT EXISTS `newfeedstory` (`id` TEXT NOT NULL, `user_id` TEXT NOT NULL, `notification_type` INTEGER NOT NULL, `timestamp` INTEGER NOT NULL, `first_impression_timestamp` INTEGER, `impression_count` INTEGER NOT NULL, `priority_section_eligibility` INTEGER NOT NULL, `major_app_version` INTEGER NOT NULL, `data` BLOB NOT NULL, PRIMARY KEY(`id`))");
                interfaceC37481ol.ATG("CREATE INDEX IF NOT EXISTS `index_newfeedstory_timestamp` ON `newfeedstory` (`timestamp`)");
                interfaceC37481ol.ATG(AbstractC111324zv.A00(40));
                interfaceC37481ol.ATG("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '86dceb4730e308a832277a98aef7c261')");
            }

            @Override // X.AbstractC28801aI
            public final void dropAllTables(InterfaceC37481ol interfaceC37481ol) {
                interfaceC37481ol.ATG("DROP TABLE IF EXISTS `ignotifications`");
                interfaceC37481ol.ATG("DROP TABLE IF EXISTS `newfeedstory`");
                List list = IgNotificationsDatabase_Impl.this.mCallbacks;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((C2LL) it.next()).A01(interfaceC37481ol);
                    }
                }
            }

            @Override // X.AbstractC28801aI
            public final void onCreate(InterfaceC37481ol interfaceC37481ol) {
                List list = IgNotificationsDatabase_Impl.this.mCallbacks;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((C2LL) it.next()).A00(interfaceC37481ol);
                    }
                }
            }

            @Override // X.AbstractC28801aI
            public final void onOpen(InterfaceC37481ol interfaceC37481ol) {
                IgNotificationsDatabase_Impl igNotificationsDatabase_Impl = IgNotificationsDatabase_Impl.this;
                igNotificationsDatabase_Impl.mDatabase = interfaceC37481ol;
                igNotificationsDatabase_Impl.internalInitInvalidationTracker(interfaceC37481ol);
                List list = igNotificationsDatabase_Impl.mCallbacks;
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
        }, "86dceb4730e308a832277a98aef7c261", "93f9b05e3eda7e6e38008e51a06dd432"), c28381Yz.A04, false, false));
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
        hashMap.put(AbstractC109414wT.class, Collections.emptyList());
        hashMap.put(C109424wU.class, Collections.emptyList());
        return hashMap;
    }
}
