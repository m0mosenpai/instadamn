package com.instagram.debug.devoptions.section.localinjection.datastore;

import X.AbstractC06950Ym;
import X.AbstractC167007dF;
import X.AbstractC16960so;
import X.AbstractC37302Gc3;
import X.AbstractC65703TsZ;
import X.AnonymousClass001;
import X.C00O;
import android.content.Context;
import com.instagram.debug.devoptions.section.localinjection.datastore.LocalInjectionUnit;
import com.instagram.debug.devoptions.section.localinjection.datastore.LocalMediaInjectionDataStoreManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes11.dex */
public final class LocalReelsAdsInjectionDataStore implements LocalMediaInjectionDataStoreManager {
    @Override // com.instagram.debug.devoptions.section.localinjection.datastore.LocalMediaInjectionDataStoreManager
    public /* synthetic */ List getAllInjectionItems() {
        return LocalMediaInjectionDataStoreManager.CC.$default$getAllInjectionItems(this);
    }

    @Override // com.instagram.debug.devoptions.section.localinjection.datastore.LocalMediaInjectionDataStoreManager
    public /* synthetic */ List getInjectedJSONStrings(Context context, Set set) {
        return LocalMediaInjectionDataStoreManager.CC.$default$getInjectedJSONStrings(this, context, set);
    }

    @Override // com.instagram.debug.devoptions.section.localinjection.datastore.LocalMediaInjectionDataStoreManager
    public Map getInjectionDataStore() {
        List A1Q = AbstractC16960so.A1Q(new LocalInjectionUnit.Item("Basic 9:16 Video Ad", "clips_916_ad.json", null), new LocalInjectionUnit.Item("Basic non 9:16 Video Ad", "clips_non_916_ad.json", null), new LocalInjectionUnit.Item("PBIA Ad", "clips_pbia_ad.json", null), new LocalInjectionUnit.Item("Showreel Composition Image Ad", "clips_showreel_composition_image_ad.json", null), new LocalInjectionUnit.Item("Showreel Native Ad", "clips_showreel_native_ad.json", null), new LocalInjectionUnit.Item("Basic Ad with Disclaimer URL", "clips_disclaimer_url_ad.json", null), new LocalInjectionUnit.Item("Basic Ad with Disclaimer Text", "clips_disclaimer_text_ad.json", null), new LocalInjectionUnit.Item("Mid-Scene V2 with Attached Module", "clips_mid_scene_v2_attached_module.json", null), new LocalInjectionUnit.Item("App install Ad with app metadata", "clips_mai_ad.json", null), new LocalInjectionUnit.Item("Carousel Ad", "clips_carousel_ad.json", null), new LocalInjectionUnit.Item("INI and Mid-Scene V2 with Attached Module 1", "clips_ini_mid_scene_v2_attached_module_1.json", null), new LocalInjectionUnit.Item("INI and Mid-Scene V2 with Attached Module 2", "clips_ini_mid_scene_v2_attached_module_2.json", null), new LocalInjectionUnit.Item("Multi Ad Grid Format with All Image Aspect Ratios", "multi_ad_grid_format_image.json", null), new LocalInjectionUnit.Item("Multi Ad Grid Format with All Video Aspect Ratios", "multi_ad_grid_format_video.json", null), new LocalInjectionUnit.Item("Multi Ad Mega Card Format Mixed Image and Videos", "multi_ad_mega_card_format.json", null), new LocalInjectionUnit.Item("Delayed Skip Ad", "clips_delayed_skip_ad.json", null), new LocalInjectionUnit.Item("Ad with preview comment", "clips_ad_preview_comment.json", null));
        ArrayList A0i = AbstractC167007dF.A0i(A1Q);
        int i = 0;
        for (Object obj : A1Q) {
            int i2 = i + 1;
            if (i < 0) {
                AbstractC16960so.A1U();
                throw C00O.createAndThrow();
            }
            LocalInjectionUnit.Item item = (LocalInjectionUnit.Item) obj;
            A0i.add(new LocalInjectionUnit(AbstractC65703TsZ.A16(item), AnonymousClass001.A0R("reels_ads/", item.filename), item.name, LocalInjectionUnit.InjectionUnitType.REELS_ADS));
            i = i2;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC37302Gc3.A01(AbstractC06950Ym.A1E(A0i, 10)));
        Iterator it = A0i.iterator();
        while (it.hasNext()) {
            AbstractC65703TsZ.A1Y(it, linkedHashMap);
        }
        return linkedHashMap;
    }
}
