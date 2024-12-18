package com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.database;

import X.AbstractC111324zv;
import X.AbstractC28801aI;
import X.AbstractC28981ab;
import X.C2043892u;
import X.C2043992v;
import X.C28381Yz;
import X.C28621Zy;
import X.C28861aP;
import X.C37471ok;
import X.InterfaceC29101an;
import X.InterfaceC37481ol;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.database.ContentFilterDictionaryDatabase_Impl;
import com.instagram.realtimeclient.RealtimeSubscription;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes4.dex */
public final class ContentFilterDictionaryDatabase_Impl extends ContentFilterDictionaryDatabase {
    public volatile C2043992v A00;
    public volatile C2043892u A01;

    @Override // X.C1YP
    public final C28621Zy createInvalidationTracker() {
        return new C28621Zy(this, new HashMap(0), new HashMap(0), "content_filter_dictionary_metadata", "content_filter_dictionary_entries", "content_filter_dictionary_client_availability");
    }

    @Override // X.C1YP
    public final InterfaceC29101an createOpenHelper(C28381Yz c28381Yz) {
        return c28381Yz.A02.AL5(AbstractC28981ab.A00(c28381Yz.A00, new C28861aP(c28381Yz, new AbstractC28801aI() { // from class: X.92t
            {
                super(1);
            }

            @Override // X.AbstractC28801aI
            public final void onPostMigrate(InterfaceC37481ol interfaceC37481ol) {
            }

            @Override // X.AbstractC28801aI
            public final void createAllTables(InterfaceC37481ol interfaceC37481ol) {
                interfaceC37481ol.ATG("CREATE TABLE IF NOT EXISTS `content_filter_dictionary_metadata` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `dictionary_key` TEXT NOT NULL, `name` TEXT NOT NULL, `language` TEXT NOT NULL, `editable` INTEGER NOT NULL, `type` INTEGER NOT NULL, `strategy_id` INTEGER NOT NULL, `loadedVersion` TEXT NOT NULL DEFAULT '', `latestVersion` TEXT NOT NULL DEFAULT '', `supportsVersioning` INTEGER NOT NULL DEFAULT 1)");
                interfaceC37481ol.ATG("CREATE UNIQUE INDEX IF NOT EXISTS `index_content_filter_dictionary_metadata_dictionary_key` ON `content_filter_dictionary_metadata` (`dictionary_key`)");
                interfaceC37481ol.ATG("CREATE TABLE IF NOT EXISTS `content_filter_dictionary_entries` (`dictionary_id` INTEGER NOT NULL, `pattern` TEXT NOT NULL, PRIMARY KEY(`dictionary_id`, `pattern`), FOREIGN KEY(`dictionary_id`) REFERENCES `content_filter_dictionary_metadata`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
                interfaceC37481ol.ATG("CREATE TABLE IF NOT EXISTS `content_filter_dictionary_client_availability` (`dictionary_id` INTEGER NOT NULL, `client_id` INTEGER NOT NULL, PRIMARY KEY(`dictionary_id`, `client_id`), FOREIGN KEY(`dictionary_id`) REFERENCES `content_filter_dictionary_metadata`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
                interfaceC37481ol.ATG(AbstractC111324zv.A00(40));
                interfaceC37481ol.ATG("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '9914a74bbddde2b9b1a1ca667c5e7298')");
            }

            @Override // X.AbstractC28801aI
            public final void dropAllTables(InterfaceC37481ol interfaceC37481ol) {
                interfaceC37481ol.ATG("DROP TABLE IF EXISTS `content_filter_dictionary_metadata`");
                interfaceC37481ol.ATG("DROP TABLE IF EXISTS `content_filter_dictionary_entries`");
                interfaceC37481ol.ATG("DROP TABLE IF EXISTS `content_filter_dictionary_client_availability`");
                List list = ContentFilterDictionaryDatabase_Impl.this.mCallbacks;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((C2LL) it.next()).A01(interfaceC37481ol);
                    }
                }
            }

            @Override // X.AbstractC28801aI
            public final void onCreate(InterfaceC37481ol interfaceC37481ol) {
                List list = ContentFilterDictionaryDatabase_Impl.this.mCallbacks;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((C2LL) it.next()).A00(interfaceC37481ol);
                    }
                }
            }

            @Override // X.AbstractC28801aI
            public final void onOpen(InterfaceC37481ol interfaceC37481ol) {
                ContentFilterDictionaryDatabase_Impl contentFilterDictionaryDatabase_Impl = ContentFilterDictionaryDatabase_Impl.this;
                contentFilterDictionaryDatabase_Impl.mDatabase = interfaceC37481ol;
                interfaceC37481ol.ATG("PRAGMA foreign_keys = ON");
                contentFilterDictionaryDatabase_Impl.internalInitInvalidationTracker(interfaceC37481ol);
                List list = contentFilterDictionaryDatabase_Impl.mCallbacks;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((C2LL) it.next()).A02(interfaceC37481ol);
                    }
                }
            }

            @Override // X.AbstractC28801aI
            public final A6Q onValidateSchema(InterfaceC37481ol interfaceC37481ol) {
                StringBuilder sb;
                String str;
                HashMap hashMap = new HashMap(10);
                hashMap.put(PublicKeyCredentialControllerUtility.JSON_KEY_ID, new C63003SaR(PublicKeyCredentialControllerUtility.JSON_KEY_ID, "INTEGER", null, 1, 1, true));
                hashMap.put("dictionary_key", new C63003SaR("dictionary_key", "TEXT", null, 0, 1, true));
                hashMap.put(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, new C63003SaR(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, "TEXT", null, 0, 1, true));
                hashMap.put("language", new C63003SaR("language", "TEXT", null, 0, 1, true));
                hashMap.put("editable", new C63003SaR("editable", "INTEGER", null, 0, 1, true));
                hashMap.put(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, new C63003SaR(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "INTEGER", null, 0, 1, true));
                hashMap.put("strategy_id", new C63003SaR("strategy_id", "INTEGER", null, 0, 1, true));
                hashMap.put("loadedVersion", new C63003SaR("loadedVersion", "TEXT", "''", 0, 1, true));
                hashMap.put("latestVersion", new C63003SaR("latestVersion", "TEXT", "''", 0, 1, true));
                hashMap.put("supportsVersioning", new C63003SaR("supportsVersioning", "INTEGER", RealtimeSubscription.GRAPHQL_MQTT_VERSION, 0, 1, true));
                HashSet hashSet = new HashSet(0);
                HashSet hashSet2 = new HashSet(1);
                hashSet2.add(new SP3("index_content_filter_dictionary_metadata_dictionary_key", Arrays.asList("dictionary_key"), Arrays.asList("ASC"), true));
                C23008ACh c23008ACh = new C23008ACh("content_filter_dictionary_metadata", hashMap, hashSet, hashSet2);
                C23008ACh A00 = RrF.A00(interfaceC37481ol, "content_filter_dictionary_metadata");
                if (!c23008ACh.equals(A00)) {
                    sb = new StringBuilder();
                    str = "content_filter_dictionary_metadata(com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.database.ContentFilterDictionaryMetadataEntity).\n Expected:\n";
                } else {
                    HashMap hashMap2 = new HashMap(2);
                    hashMap2.put("dictionary_id", new C63003SaR("dictionary_id", "INTEGER", null, 1, 1, true));
                    hashMap2.put("pattern", new C63003SaR("pattern", "TEXT", null, 2, 1, true));
                    HashSet hashSet3 = new HashSet(1);
                    List asList = Arrays.asList("dictionary_id");
                    List asList2 = Arrays.asList(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
                    String A002 = AbstractC111324zv.A00(1517);
                    String A003 = AbstractC111324zv.A00(1697);
                    hashSet3.add(new C23010ACk("content_filter_dictionary_metadata", A002, A003, asList, asList2));
                    c23008ACh = new C23008ACh("content_filter_dictionary_entries", hashMap2, hashSet3, new HashSet(0));
                    A00 = RrF.A00(interfaceC37481ol, "content_filter_dictionary_entries");
                    if (!c23008ACh.equals(A00)) {
                        sb = new StringBuilder();
                        str = "content_filter_dictionary_entries(com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.database.ContentFilterDictionaryEntriesEntity).\n Expected:\n";
                    } else {
                        HashMap hashMap3 = new HashMap(2);
                        hashMap3.put("dictionary_id", new C63003SaR("dictionary_id", "INTEGER", null, 1, 1, true));
                        hashMap3.put("client_id", new C63003SaR("client_id", "INTEGER", null, 2, 1, true));
                        HashSet hashSet4 = new HashSet(1);
                        hashSet4.add(new C23010ACk("content_filter_dictionary_metadata", A002, A003, Arrays.asList("dictionary_id"), Arrays.asList(PublicKeyCredentialControllerUtility.JSON_KEY_ID)));
                        c23008ACh = new C23008ACh("content_filter_dictionary_client_availability", hashMap3, hashSet4, new HashSet(0));
                        A00 = RrF.A00(interfaceC37481ol, "content_filter_dictionary_client_availability");
                        if (!c23008ACh.equals(A00)) {
                            sb = new StringBuilder();
                            str = "content_filter_dictionary_client_availability(com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.database.ContentFilterDictionaryClientAvailabilityEntity).\n Expected:\n";
                        } else {
                            return new A6Q(true, null);
                        }
                    }
                }
                sb.append(str);
                sb.append(c23008ACh);
                sb.append("\n Found:\n");
                sb.append(A00);
                return new A6Q(false, sb.toString());
            }

            @Override // X.AbstractC28801aI
            public final void onPreMigrate(InterfaceC37481ol interfaceC37481ol) {
                C3EP.A01(interfaceC37481ol);
            }
        }, "9914a74bbddde2b9b1a1ca667c5e7298", "0e90a579cfcb054df3728e50be237697"), c28381Yz.A04, false, false));
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
        hashMap.put(C2043892u.class, Collections.emptyList());
        hashMap.put(C2043992v.class, Collections.emptyList());
        return hashMap;
    }

    @Override // X.C1YP
    public final void clearAllTables() {
        super.assertNotMainThread();
        InterfaceC37481ol CHx = super.getOpenHelper().CHx();
        try {
            super.beginTransaction();
            CHx.ATG(AbstractC111324zv.A00(1708));
            CHx.ATG("DELETE FROM `content_filter_dictionary_metadata`");
            CHx.ATG("DELETE FROM `content_filter_dictionary_entries`");
            CHx.ATG("DELETE FROM `content_filter_dictionary_client_availability`");
            super.setTransactionSuccessful();
        } finally {
            super.endTransaction();
            CHx.E7O("PRAGMA wal_checkpoint(FULL)").close();
            if (!((C37471ok) CHx).A00.inTransaction()) {
                CHx.ATG("VACUUM");
            }
        }
    }
}
