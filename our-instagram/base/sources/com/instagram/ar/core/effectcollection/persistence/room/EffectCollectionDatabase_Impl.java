package com.instagram.ar.core.effectcollection.persistence.room;

import X.AbstractC28801aI;
import X.AbstractC28981ab;
import X.C142456c7;
import X.C28381Yz;
import X.C28621Zy;
import X.C28861aP;
import X.C37471ok;
import X.InterfaceC29101an;
import X.InterfaceC37481ol;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.ar.core.effectcollection.persistence.room.EffectCollectionDatabase_Impl;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public final class EffectCollectionDatabase_Impl extends EffectCollectionDatabase {
    public volatile C142456c7 A00;

    @Override // X.C1YP
    public final C28621Zy createInvalidationTracker() {
        return new C28621Zy(this, new HashMap(0), new HashMap(0), "effects", "effect_collections", "effect_collections_effects");
    }

    @Override // X.C1YP
    public final void clearAllTables() {
        super.assertNotMainThread();
        InterfaceC37481ol CHx = super.getOpenHelper().CHx();
        try {
            super.beginTransaction();
            CHx.ATG("DELETE FROM `effects`");
            CHx.ATG("DELETE FROM `effect_collections`");
            CHx.ATG("DELETE FROM `effect_collections_effects`");
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
        return c28381Yz.A02.AL5(AbstractC28981ab.A00(c28381Yz.A00, new C28861aP(c28381Yz, new AbstractC28801aI() { // from class: X.6c6
            @Override // X.AbstractC28801aI
            public final void onPostMigrate(InterfaceC37481ol interfaceC37481ol) {
            }

            {
                super(18);
            }

            @Override // X.AbstractC28801aI
            public final void createAllTables(InterfaceC37481ol interfaceC37481ol) {
                interfaceC37481ol.ATG("CREATE TABLE IF NOT EXISTS `effects` (`effectId` TEXT NOT NULL, `effectPackageId` TEXT, `effectFileId` TEXT NOT NULL, `isDraft` INTEGER NOT NULL, `isNetworkConsentRequired` INTEGER NOT NULL, `isUserSafetyWarningRequired` INTEGER NOT NULL, `usesFlmCapability` INTEGER NOT NULL, `isAnimatedPhotoEffect` INTEGER NOT NULL, `cacheKey` TEXT, `compressionType` TEXT NOT NULL, `title` TEXT NOT NULL, `assetUrl` TEXT NOT NULL, `filesizeBytes` INTEGER NOT NULL, `uncompressedFileSizeBytes` INTEGER NOT NULL, `md5Hash` TEXT, `thumbnailUrl` TEXT NOT NULL, `transparentBackgroundThumbnailUrl` TEXT, `instructionList` TEXT NOT NULL, `restrictionSet` TEXT NOT NULL, `isInternalOnly` INTEGER NOT NULL, `capabilitiesSet` TEXT NOT NULL, `type` TEXT NOT NULL, `badgeState` INTEGER NOT NULL, `attributionId` TEXT, `attributionUserName` TEXT, `attributionProfileImageUrl` TEXT, `capabilityMinVersion` TEXT NOT NULL, `effectInfoUIOptions` TEXT NOT NULL, `effectInfoUISecondaryOptions` TEXT NOT NULL, `saveStatus` INTEGER NOT NULL, `effectManifestJson` TEXT, `previewVideoMedia` TEXT NOT NULL, `effectFileContents` TEXT, `useHandsFree` INTEGER NOT NULL, `handsFreeDurationMs` INTEGER NOT NULL, `isCreativeTool` INTEGER NOT NULL, `creativeToolDescription` TEXT, `isEncrypted` INTEGER NOT NULL, `syncedAt` INTEGER NOT NULL, `shaderPackMetadata` TEXT, `productCapabilities` TEXT NOT NULL, `fanClubId` TEXT, `formattedMediaCount` TEXT, `formattedMediaCountAccessibility` TEXT, `avatarSdkPresetGlb` TEXT, `requiredSdkVersion` TEXT, `bestInstanceId` TEXT, `avatarType` TEXT, PRIMARY KEY(`effectId`))");
                interfaceC37481ol.ATG("CREATE TABLE IF NOT EXISTS `effect_collections` (`productId` TEXT NOT NULL, `collectionName` TEXT NOT NULL, `syncedAt` INTEGER NOT NULL, `lastSyncedNextCursor` TEXT, `hasMore` INTEGER NOT NULL, `collectionId` TEXT NOT NULL, PRIMARY KEY(`collectionId`))");
                interfaceC37481ol.ATG("CREATE TABLE IF NOT EXISTS `effect_collections_effects` (`collectionId` TEXT NOT NULL, `effectId` TEXT NOT NULL, `order` INTEGER NOT NULL, PRIMARY KEY(`collectionId`, `effectId`))");
                interfaceC37481ol.ATG("CREATE INDEX IF NOT EXISTS `index_effect_collections_effects_order` ON `effect_collections_effects` (`order`)");
                interfaceC37481ol.ATG("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                interfaceC37481ol.ATG("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '6f1c5b41dc69a2e390b2e7eb0b9232d4')");
            }

            @Override // X.AbstractC28801aI
            public final void dropAllTables(InterfaceC37481ol interfaceC37481ol) {
                interfaceC37481ol.ATG("DROP TABLE IF EXISTS `effects`");
                interfaceC37481ol.ATG("DROP TABLE IF EXISTS `effect_collections`");
                interfaceC37481ol.ATG("DROP TABLE IF EXISTS `effect_collections_effects`");
                List list = EffectCollectionDatabase_Impl.this.mCallbacks;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((C2LL) it.next()).A01(interfaceC37481ol);
                    }
                }
            }

            @Override // X.AbstractC28801aI
            public final void onCreate(InterfaceC37481ol interfaceC37481ol) {
                List list = EffectCollectionDatabase_Impl.this.mCallbacks;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((C2LL) it.next()).A00(interfaceC37481ol);
                    }
                }
            }

            @Override // X.AbstractC28801aI
            public final void onOpen(InterfaceC37481ol interfaceC37481ol) {
                EffectCollectionDatabase_Impl effectCollectionDatabase_Impl = EffectCollectionDatabase_Impl.this;
                effectCollectionDatabase_Impl.mDatabase = interfaceC37481ol;
                effectCollectionDatabase_Impl.internalInitInvalidationTracker(interfaceC37481ol);
                List list = effectCollectionDatabase_Impl.mCallbacks;
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
                HashMap hashMap = new HashMap(48);
                hashMap.put("effectId", new C63003SaR("effectId", "TEXT", null, 1, 1, true));
                hashMap.put("effectPackageId", new C63003SaR("effectPackageId", "TEXT", null, 0, 1, false));
                hashMap.put("effectFileId", new C63003SaR("effectFileId", "TEXT", null, 0, 1, true));
                hashMap.put("isDraft", new C63003SaR("isDraft", "INTEGER", null, 0, 1, true));
                hashMap.put("isNetworkConsentRequired", new C63003SaR("isNetworkConsentRequired", "INTEGER", null, 0, 1, true));
                hashMap.put("isUserSafetyWarningRequired", new C63003SaR("isUserSafetyWarningRequired", "INTEGER", null, 0, 1, true));
                hashMap.put("usesFlmCapability", new C63003SaR("usesFlmCapability", "INTEGER", null, 0, 1, true));
                hashMap.put("isAnimatedPhotoEffect", new C63003SaR("isAnimatedPhotoEffect", "INTEGER", null, 0, 1, true));
                hashMap.put("cacheKey", new C63003SaR("cacheKey", "TEXT", null, 0, 1, false));
                hashMap.put("compressionType", new C63003SaR("compressionType", "TEXT", null, 0, 1, true));
                hashMap.put(DialogModule.KEY_TITLE, new C63003SaR(DialogModule.KEY_TITLE, "TEXT", null, 0, 1, true));
                hashMap.put("assetUrl", new C63003SaR("assetUrl", "TEXT", null, 0, 1, true));
                hashMap.put("filesizeBytes", new C63003SaR("filesizeBytes", "INTEGER", null, 0, 1, true));
                hashMap.put("uncompressedFileSizeBytes", new C63003SaR("uncompressedFileSizeBytes", "INTEGER", null, 0, 1, true));
                hashMap.put("md5Hash", new C63003SaR("md5Hash", "TEXT", null, 0, 1, false));
                hashMap.put("thumbnailUrl", new C63003SaR("thumbnailUrl", "TEXT", null, 0, 1, true));
                hashMap.put("transparentBackgroundThumbnailUrl", new C63003SaR("transparentBackgroundThumbnailUrl", "TEXT", null, 0, 1, false));
                hashMap.put("instructionList", new C63003SaR("instructionList", "TEXT", null, 0, 1, true));
                hashMap.put("restrictionSet", new C63003SaR("restrictionSet", "TEXT", null, 0, 1, true));
                hashMap.put("isInternalOnly", new C63003SaR("isInternalOnly", "INTEGER", null, 0, 1, true));
                hashMap.put("capabilitiesSet", new C63003SaR("capabilitiesSet", "TEXT", null, 0, 1, true));
                hashMap.put(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, new C63003SaR(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "TEXT", null, 0, 1, true));
                hashMap.put("badgeState", new C63003SaR("badgeState", "INTEGER", null, 0, 1, true));
                hashMap.put("attributionId", new C63003SaR("attributionId", "TEXT", null, 0, 1, false));
                hashMap.put("attributionUserName", new C63003SaR("attributionUserName", "TEXT", null, 0, 1, false));
                hashMap.put("attributionProfileImageUrl", new C63003SaR("attributionProfileImageUrl", "TEXT", null, 0, 1, false));
                hashMap.put("capabilityMinVersion", new C63003SaR("capabilityMinVersion", "TEXT", null, 0, 1, true));
                hashMap.put("effectInfoUIOptions", new C63003SaR("effectInfoUIOptions", "TEXT", null, 0, 1, true));
                hashMap.put("effectInfoUISecondaryOptions", new C63003SaR("effectInfoUISecondaryOptions", "TEXT", null, 0, 1, true));
                hashMap.put("saveStatus", new C63003SaR("saveStatus", "INTEGER", null, 0, 1, true));
                hashMap.put("effectManifestJson", new C63003SaR("effectManifestJson", "TEXT", null, 0, 1, false));
                hashMap.put("previewVideoMedia", new C63003SaR("previewVideoMedia", "TEXT", null, 0, 1, true));
                hashMap.put("effectFileContents", new C63003SaR("effectFileContents", "TEXT", null, 0, 1, false));
                hashMap.put("useHandsFree", new C63003SaR("useHandsFree", "INTEGER", null, 0, 1, true));
                hashMap.put("handsFreeDurationMs", new C63003SaR("handsFreeDurationMs", "INTEGER", null, 0, 1, true));
                hashMap.put("isCreativeTool", new C63003SaR("isCreativeTool", "INTEGER", null, 0, 1, true));
                hashMap.put("creativeToolDescription", new C63003SaR("creativeToolDescription", "TEXT", null, 0, 1, false));
                hashMap.put("isEncrypted", new C63003SaR("isEncrypted", "INTEGER", null, 0, 1, true));
                hashMap.put("syncedAt", new C63003SaR("syncedAt", "INTEGER", null, 0, 1, true));
                hashMap.put("shaderPackMetadata", new C63003SaR("shaderPackMetadata", "TEXT", null, 0, 1, false));
                hashMap.put("productCapabilities", new C63003SaR("productCapabilities", "TEXT", null, 0, 1, true));
                hashMap.put("fanClubId", new C63003SaR("fanClubId", "TEXT", null, 0, 1, false));
                hashMap.put("formattedMediaCount", new C63003SaR("formattedMediaCount", "TEXT", null, 0, 1, false));
                hashMap.put("formattedMediaCountAccessibility", new C63003SaR("formattedMediaCountAccessibility", "TEXT", null, 0, 1, false));
                hashMap.put("avatarSdkPresetGlb", new C63003SaR("avatarSdkPresetGlb", "TEXT", null, 0, 1, false));
                hashMap.put("requiredSdkVersion", new C63003SaR("requiredSdkVersion", "TEXT", null, 0, 1, false));
                hashMap.put("bestInstanceId", new C63003SaR("bestInstanceId", "TEXT", null, 0, 1, false));
                hashMap.put("avatarType", new C63003SaR("avatarType", "TEXT", null, 0, 1, false));
                C23008ACh c23008ACh = new C23008ACh("effects", hashMap, new HashSet(0), new HashSet(0));
                C23008ACh A00 = RrF.A00(interfaceC37481ol, "effects");
                if (!c23008ACh.equals(A00)) {
                    sb = new StringBuilder();
                    str = "effects(com.instagram.ar.core.effectcollection.persistence.room.CameraAREffectEntity).\n Expected:\n";
                } else {
                    HashMap hashMap2 = new HashMap(6);
                    hashMap2.put("productId", new C63003SaR("productId", "TEXT", null, 0, 1, true));
                    hashMap2.put("collectionName", new C63003SaR("collectionName", "TEXT", null, 0, 1, true));
                    hashMap2.put("syncedAt", new C63003SaR("syncedAt", "INTEGER", null, 0, 1, true));
                    hashMap2.put("lastSyncedNextCursor", new C63003SaR("lastSyncedNextCursor", "TEXT", null, 0, 1, false));
                    hashMap2.put("hasMore", new C63003SaR("hasMore", "INTEGER", null, 0, 1, true));
                    hashMap2.put("collectionId", new C63003SaR("collectionId", "TEXT", null, 1, 1, true));
                    c23008ACh = new C23008ACh("effect_collections", hashMap2, new HashSet(0), new HashSet(0));
                    A00 = RrF.A00(interfaceC37481ol, "effect_collections");
                    if (!c23008ACh.equals(A00)) {
                        sb = new StringBuilder();
                        str = "effect_collections(com.instagram.ar.core.effectcollection.persistence.room.EffectCollectionEntity).\n Expected:\n";
                    } else {
                        HashMap hashMap3 = new HashMap(3);
                        hashMap3.put("collectionId", new C63003SaR("collectionId", "TEXT", null, 1, 1, true));
                        hashMap3.put("effectId", new C63003SaR("effectId", "TEXT", null, 2, 1, true));
                        hashMap3.put("order", new C63003SaR("order", "INTEGER", null, 0, 1, true));
                        HashSet hashSet = new HashSet(0);
                        HashSet hashSet2 = new HashSet(1);
                        hashSet2.add(new SP3("index_effect_collections_effects_order", Arrays.asList("order"), Arrays.asList("ASC"), false));
                        c23008ACh = new C23008ACh("effect_collections_effects", hashMap3, hashSet, hashSet2);
                        A00 = RrF.A00(interfaceC37481ol, "effect_collections_effects");
                        if (!c23008ACh.equals(A00)) {
                            sb = new StringBuilder();
                            str = "effect_collections_effects(com.instagram.ar.core.effectcollection.persistence.room.EffectCollectionCameraAREffectCrossRefEntity).\n Expected:\n";
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
        }, "6f1c5b41dc69a2e390b2e7eb0b9232d4", "e51aa4bfb9dcbd1dcbf04ae32687c3e6"), c28381Yz.A04, false, false));
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
        hashMap.put(C142456c7.class, Collections.emptyList());
        return hashMap;
    }
}
