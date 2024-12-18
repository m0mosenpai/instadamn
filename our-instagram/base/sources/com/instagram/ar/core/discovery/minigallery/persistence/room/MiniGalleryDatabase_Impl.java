package com.instagram.ar.core.discovery.minigallery.persistence.room;

import X.AbstractC28801aI;
import X.AbstractC28981ab;
import X.C1823987e;
import X.C28381Yz;
import X.C28621Zy;
import X.C28861aP;
import X.C37471ok;
import X.InterfaceC29101an;
import X.InterfaceC37481ol;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.ar.core.discovery.minigallery.persistence.room.MiniGalleryDatabase_Impl;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes4.dex */
public final class MiniGalleryDatabase_Impl extends MiniGalleryDatabase {
    public volatile C1823987e A00;

    @Override // X.C1YP
    public final C28621Zy createInvalidationTracker() {
        return new C28621Zy(this, new HashMap(0), new HashMap(0), "mini_gallery_categories");
    }

    @Override // X.C1YP
    public final void clearAllTables() {
        super.assertNotMainThread();
        InterfaceC37481ol CHx = super.getOpenHelper().CHx();
        try {
            super.beginTransaction();
            CHx.ATG("DELETE FROM `mini_gallery_categories`");
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
        return c28381Yz.A02.AL5(AbstractC28981ab.A00(c28381Yz.A00, new C28861aP(c28381Yz, new AbstractC28801aI() { // from class: X.87d
            {
                super(2);
            }

            @Override // X.AbstractC28801aI
            public final void onPostMigrate(InterfaceC37481ol interfaceC37481ol) {
            }

            @Override // X.AbstractC28801aI
            public final A6Q onValidateSchema(InterfaceC37481ol interfaceC37481ol) {
                HashMap hashMap = new HashMap(6);
                hashMap.put("miniGallerySurface", new C63003SaR("miniGallerySurface", "TEXT", null, 0, 1, true));
                hashMap.put("categoryId", new C63003SaR("categoryId", "TEXT", null, 0, 1, true));
                hashMap.put(PublicKeyCredentialControllerUtility.JSON_KEY_DISPLAY_NAME, new C63003SaR(PublicKeyCredentialControllerUtility.JSON_KEY_DISPLAY_NAME, "TEXT", null, 0, 1, true));
                hashMap.put("syncedAt", new C63003SaR("syncedAt", "INTEGER", null, 0, 1, true));
                hashMap.put(PublicKeyCredentialControllerUtility.JSON_KEY_ID, new C63003SaR(PublicKeyCredentialControllerUtility.JSON_KEY_ID, "TEXT", null, 1, 1, true));
                hashMap.put("isDefaultCategory", new C63003SaR("isDefaultCategory", "INTEGER", null, 0, 1, true));
                C23008ACh c23008ACh = new C23008ACh("mini_gallery_categories", hashMap, new HashSet(0), new HashSet(0));
                C23008ACh A00 = RrF.A00(interfaceC37481ol, "mini_gallery_categories");
                if (!c23008ACh.equals(A00)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("mini_gallery_categories(com.instagram.ar.core.discovery.minigallery.persistence.room.MiniGalleryCategoryEntity).\n Expected:\n");
                    sb.append(c23008ACh);
                    sb.append("\n Found:\n");
                    sb.append(A00);
                    return new A6Q(false, sb.toString());
                }
                return new A6Q(true, null);
            }

            @Override // X.AbstractC28801aI
            public final void createAllTables(InterfaceC37481ol interfaceC37481ol) {
                interfaceC37481ol.ATG("CREATE TABLE IF NOT EXISTS `mini_gallery_categories` (`miniGallerySurface` TEXT NOT NULL, `categoryId` TEXT NOT NULL, `displayName` TEXT NOT NULL, `syncedAt` INTEGER NOT NULL, `id` TEXT NOT NULL, `isDefaultCategory` INTEGER NOT NULL, PRIMARY KEY(`id`))");
                interfaceC37481ol.ATG(AbstractC111324zv.A00(40));
                interfaceC37481ol.ATG("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'c8b02299555e0e46bf298e63f085303e')");
            }

            @Override // X.AbstractC28801aI
            public final void dropAllTables(InterfaceC37481ol interfaceC37481ol) {
                interfaceC37481ol.ATG("DROP TABLE IF EXISTS `mini_gallery_categories`");
                List list = MiniGalleryDatabase_Impl.this.mCallbacks;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((C2LL) it.next()).A01(interfaceC37481ol);
                    }
                }
            }

            @Override // X.AbstractC28801aI
            public final void onCreate(InterfaceC37481ol interfaceC37481ol) {
                List list = MiniGalleryDatabase_Impl.this.mCallbacks;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((C2LL) it.next()).A00(interfaceC37481ol);
                    }
                }
            }

            @Override // X.AbstractC28801aI
            public final void onOpen(InterfaceC37481ol interfaceC37481ol) {
                MiniGalleryDatabase_Impl miniGalleryDatabase_Impl = MiniGalleryDatabase_Impl.this;
                miniGalleryDatabase_Impl.mDatabase = interfaceC37481ol;
                miniGalleryDatabase_Impl.internalInitInvalidationTracker(interfaceC37481ol);
                List list = miniGalleryDatabase_Impl.mCallbacks;
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
        }, "c8b02299555e0e46bf298e63f085303e", "abcc85944ad16268315a0f5f23ddd578"), c28381Yz.A04, false, false));
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
        hashMap.put(C1823987e.class, Collections.emptyList());
        return hashMap;
    }
}
