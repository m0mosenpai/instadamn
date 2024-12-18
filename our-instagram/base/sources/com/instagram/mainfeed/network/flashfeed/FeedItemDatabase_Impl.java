package com.instagram.mainfeed.network.flashfeed;

import X.AbstractC28801aI;
import X.AbstractC28981ab;
import X.C28381Yz;
import X.C28621Zy;
import X.C28861aP;
import X.C29461bN;
import X.C37471ok;
import X.InterfaceC29101an;
import X.InterfaceC37481ol;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.mainfeed.network.flashfeed.FeedItemDatabase_Impl;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class FeedItemDatabase_Impl extends FeedItemDatabase {
    public volatile C29461bN A00;

    @Override // X.C1YP
    public final C28621Zy createInvalidationTracker() {
        return new C28621Zy(this, new HashMap(0), new HashMap(0), "user_feed_items");
    }

    @Override // X.C1YP
    public final void clearAllTables() {
        super.assertNotMainThread();
        InterfaceC37481ol CHx = super.getOpenHelper().CHx();
        try {
            super.beginTransaction();
            CHx.ATG("DELETE FROM `user_feed_items`");
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
        return c28381Yz.A02.AL5(AbstractC28981ab.A00(c28381Yz.A00, new C28861aP(c28381Yz, new AbstractC28801aI() { // from class: X.1aF
            {
                super(4);
            }

            @Override // X.AbstractC28801aI
            public final void onPostMigrate(InterfaceC37481ol interfaceC37481ol) {
            }

            @Override // X.AbstractC28801aI
            public final A6Q onValidateSchema(InterfaceC37481ol interfaceC37481ol) {
                HashMap hashMap = new HashMap(6);
                hashMap.put(PublicKeyCredentialControllerUtility.JSON_KEY_ID, new C63003SaR(PublicKeyCredentialControllerUtility.JSON_KEY_ID, "TEXT", null, 1, 1, true));
                hashMap.put("ranking_weight", new C63003SaR("ranking_weight", "REAL", null, 0, 1, false));
                hashMap.put("data", new C63003SaR("data", "BLOB", null, 0, 1, true));
                hashMap.put("media_age", new C63003SaR("media_age", "INTEGER", null, 0, 1, false));
                hashMap.put("stored_age", new C63003SaR("stored_age", "INTEGER", null, 0, 1, true));
                hashMap.put("item_type", new C63003SaR("item_type", "TEXT", "'media'", 0, 1, true));
                HashSet hashSet = new HashSet(0);
                HashSet hashSet2 = new HashSet(4);
                hashSet2.add(new SP3("index_user_feed_items_ranking_weight", Arrays.asList("ranking_weight"), Arrays.asList("ASC"), false));
                hashSet2.add(new SP3("index_user_feed_items_media_age", Arrays.asList("media_age"), Arrays.asList("ASC"), false));
                hashSet2.add(new SP3("index_user_feed_items_stored_age", Arrays.asList("stored_age"), Arrays.asList("ASC"), false));
                hashSet2.add(new SP3("index_user_feed_items_item_type", Arrays.asList("item_type"), Arrays.asList("ASC"), false));
                C23008ACh c23008ACh = new C23008ACh("user_feed_items", hashMap, hashSet, hashSet2);
                C23008ACh A00 = RrF.A00(interfaceC37481ol, "user_feed_items");
                if (!c23008ACh.equals(A00)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("user_feed_items(com.instagram.mainfeed.network.flashfeed.FeedItemEntity).\n Expected:\n");
                    sb.append(c23008ACh);
                    sb.append("\n Found:\n");
                    sb.append(A00);
                    return new A6Q(false, sb.toString());
                }
                return new A6Q(true, null);
            }

            @Override // X.AbstractC28801aI
            public final void createAllTables(InterfaceC37481ol interfaceC37481ol) {
                interfaceC37481ol.ATG("CREATE TABLE IF NOT EXISTS `user_feed_items` (`id` TEXT NOT NULL, `ranking_weight` REAL, `data` BLOB NOT NULL, `media_age` INTEGER, `stored_age` INTEGER NOT NULL, `item_type` TEXT NOT NULL DEFAULT 'media', PRIMARY KEY(`id`))");
                interfaceC37481ol.ATG("CREATE INDEX IF NOT EXISTS `index_user_feed_items_ranking_weight` ON `user_feed_items` (`ranking_weight`)");
                interfaceC37481ol.ATG("CREATE INDEX IF NOT EXISTS `index_user_feed_items_media_age` ON `user_feed_items` (`media_age`)");
                interfaceC37481ol.ATG("CREATE INDEX IF NOT EXISTS `index_user_feed_items_stored_age` ON `user_feed_items` (`stored_age`)");
                interfaceC37481ol.ATG("CREATE INDEX IF NOT EXISTS `index_user_feed_items_item_type` ON `user_feed_items` (`item_type`)");
                interfaceC37481ol.ATG("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                interfaceC37481ol.ATG("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '3d61bb2c78fec981166d33eedf8813c8')");
            }

            @Override // X.AbstractC28801aI
            public final void dropAllTables(InterfaceC37481ol interfaceC37481ol) {
                interfaceC37481ol.ATG("DROP TABLE IF EXISTS `user_feed_items`");
                List list = FeedItemDatabase_Impl.this.mCallbacks;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((C2LL) it.next()).A01(interfaceC37481ol);
                    }
                }
            }

            @Override // X.AbstractC28801aI
            public final void onCreate(InterfaceC37481ol interfaceC37481ol) {
                List list = FeedItemDatabase_Impl.this.mCallbacks;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((C2LL) it.next()).A00(interfaceC37481ol);
                    }
                }
            }

            @Override // X.AbstractC28801aI
            public final void onOpen(InterfaceC37481ol interfaceC37481ol) {
                FeedItemDatabase_Impl feedItemDatabase_Impl = FeedItemDatabase_Impl.this;
                feedItemDatabase_Impl.mDatabase = interfaceC37481ol;
                feedItemDatabase_Impl.internalInitInvalidationTracker(interfaceC37481ol);
                List list = feedItemDatabase_Impl.mCallbacks;
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
        }, "3d61bb2c78fec981166d33eedf8813c8", "d7755684cd1a2ad07301af1790077ad3"), c28381Yz.A04, false, false));
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
        hashMap.put(C29461bN.class, Collections.emptyList());
        return hashMap;
    }
}
