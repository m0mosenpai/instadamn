package com.instagram.debug.devoptions.section.localinjection.datastore;

import X.AbstractC06950Ym;
import X.AbstractC167007dF;
import X.AbstractC16960so;
import X.AbstractC37302Gc3;
import X.AbstractC65703TsZ;
import X.AnonymousClass001;
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
public final class LocalFeedAdsInjectionDataStore implements LocalMediaInjectionDataStoreManager {
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
        LocalInjectionUnit.Item[] itemArr = new LocalInjectionUnit.Item[51];
        System.arraycopy(new LocalInjectionUnit.Item[]{new LocalInjectionUnit.Item("Carousel Ad", "feed_carousel_ad.json", null), new LocalInjectionUnit.Item("DPA Carousel Ad", "feed_dpa_carousel_ad.json", null), new LocalInjectionUnit.Item("Carousel Ad On-Demand Loading", "feed_carousel_ad_with_on_demand_loading.json", null), new LocalInjectionUnit.Item("App Install Ad", "feed_ad_with_app_install.json", null), new LocalInjectionUnit.Item("DeepLink Ad", "feed_ad_with_deep_link.json", null), new LocalInjectionUnit.Item("PBIA Ad", "feed_pbia_ad.json", null), new LocalInjectionUnit.Item("Single Image Ad", "feed_standard_ad.json", null), new LocalInjectionUnit.Item("Single Image Ad + IAB Screenshot [VPN]", "feed_standard_ad_with_iab_preview.json", null), new LocalInjectionUnit.Item("Single Video Ad", "feed_standard_video_ad.json", null), new LocalInjectionUnit.Item("Political Ad", "feed_political_ad.json", null), new LocalInjectionUnit.Item("Lead Ad", "feed_lead_gen_ad.json", null), new LocalInjectionUnit.Item("Canvas Ad", "feed_canvas_ad.json", null), new LocalInjectionUnit.Item("Disclaimer Text Page Ad", "feed_disclaimer_text_page_ad.json", null), new LocalInjectionUnit.Item("Disclaimer Web Page Ad", "feed_disclaimer_web_page_ad.json", null), new LocalInjectionUnit.Item("Disclaimer Carousel Ad", "feed_disclaimer_carousel_ad.json", null), new LocalInjectionUnit.Item("New Click to Messenger Flow Ad", "feed_ad_with_new_ctm_flow.json", null), new LocalInjectionUnit.Item("New Click to WhatsApp Flow Ad", "feed_ad_with_new_ctwa_flow.json", null), new LocalInjectionUnit.Item("New Click to Direct Flow Ad", "feed_ad_with_new_ctd_flow.json", null), new LocalInjectionUnit.Item("Click To Instagram Direct Single Image Ad on Feed", "feed_ad_ctd_single_image.json", null), new LocalInjectionUnit.Item("Click To Instagram Direct Carousel on Feed", "feed_ad_ctd_carousel.json", null), new LocalInjectionUnit.Item("Click To Instagram Direct Video Ad on Feed", "feed_ad_ctd_video.json", null), new LocalInjectionUnit.Item("Click To Join Single Image Ad on Feed", "feed_ad_ctj_single_image.json", null), new LocalInjectionUnit.Item("Non-tall Video Ad", "feed_previewable_video_ad.json", null), new LocalInjectionUnit.Item("Tall Video Ad", "feed_tall_video_ad.json", null), new LocalInjectionUnit.Item("Branded Content Ad", "feed_ad_with_branded_content.json", null), new LocalInjectionUnit.Item("Clips Video Internal Deeplink Ad", "feed_ad_with_clips_video_deeplink.json", null), new LocalInjectionUnit.Item("Audio Page Deeplink Ad", "feed_ad_with_audio_page_internal_deeplink.json", null)}, 0, itemArr, 0, 27);
        System.arraycopy(new LocalInjectionUnit.Item[]{new LocalInjectionUnit.Item("Showreel Composition Image Feed Ad", "showreel_composition_image_feed_ad.json", null), new LocalInjectionUnit.Item("Showreel Native Feed Ad", "showreel_native_feed_ad.json", null), new LocalInjectionUnit.Item("Feed Video Ads End Scene", "feed_ads_end_scene.json", null), new LocalInjectionUnit.Item("DA Auto Tagging Onsite CTA", "feed_da_auto_tag_onsite_cta.json", null), new LocalInjectionUnit.Item("DA Auto Tagging Offsite CTA", "feed_da_auto_tag_offsite_cta.json", null), new LocalInjectionUnit.Item("Tappable Shop Collection Ad", "feed_tappable_collection_ad.json", null), new LocalInjectionUnit.Item("Tappable Collection Ad", "feed_tappable_IX_collection_ad.json", null), new LocalInjectionUnit.Item("Tappable Collection Ad (Rounded Border)", "feed_tappable_IX_collection_rounded_border.json", null), new LocalInjectionUnit.Item("IG Feed Video post click Watch And Browse Ad", "feed_ad_watch_and_browse.json", null), new LocalInjectionUnit.Item("IG Feed Video post click Reels Browse Ad", "feed_ad_video_reels_browser.json", null), new LocalInjectionUnit.Item("Arts CTA Ad", "feed_arts_cta_ad.json", null), new LocalInjectionUnit.Item("IX Collection Arts Ad", "feed_IX_collection_arts_ad.json", null), new LocalInjectionUnit.Item("DSC Collection Arts Ad", "feed_DSC_collection_arts_ad.json", null), new LocalInjectionUnit.Item("Standalone Multi Ads", "feed_ad_with_standalone_multi_ads.json", null), new LocalInjectionUnit.Item("Post Engagement Multi ", "feed_ad_with_post_ad_engagement_multi_ads.json", null), new LocalInjectionUnit.Item("Standalone Multi Ads 9x16 Template", "feed_ad_with_standalone_multi_ads_9x16_template.json", null), new LocalInjectionUnit.Item("Standalone Multi Ads 4x15 Template", "feed_ad_with_standalone_multi_ads_4x5_template.json", null), new LocalInjectionUnit.Item("Retail Ad with Single ARTS", "feed_retail_ad_with_single_arts.json", "feed_retail_ad_with_single_arts"), new LocalInjectionUnit.Item("Retail Ad with ARTS Motion", "feed_retail_ad_with_arts_motion.json", "feed_retail_ad_with_arts_motion"), new LocalInjectionUnit.Item("Popularity Proof Ad", "feed_single_image_popularity_proof_ad.json", "feed_single_image_popularity_proof_ad"), new LocalInjectionUnit.Item("Popularity Proof No Icon Ad", "feed_popularity_proof_no_icon_ad.json", "feed_popularity_proof_no_icon_ad"), new LocalInjectionUnit.Item("Popularity Proof Empty Ad", "feed_wrong_popularity_proof_ad.json", "feed_wrong_popularity_proof_ad"), new LocalInjectionUnit.Item("Popularity Proof Invalid Icon Ad", "feed_popularity_proof_invalid_icon_ad.json", "feed_popularity_proof_invalid_icon_ad"), new LocalInjectionUnit.Item("Retail Ad with Single AwPT", "feed_retail_ad_with_single_awpt.json", "feed_retail_ad_with_single_awpt")}, 0, itemArr, 27, 24);
        List<LocalInjectionUnit.Item> A1Q = AbstractC16960so.A1Q(itemArr);
        ArrayList A0i = AbstractC167007dF.A0i(A1Q);
        for (LocalInjectionUnit.Item item : A1Q) {
            A0i.add(new LocalInjectionUnit(AbstractC65703TsZ.A16(item), AnonymousClass001.A0R("feed_ads/", item.filename), item.name, LocalInjectionUnit.InjectionUnitType.FEED_ADS));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC37302Gc3.A01(AbstractC06950Ym.A1E(A0i, 10)));
        Iterator it = A0i.iterator();
        while (it.hasNext()) {
            AbstractC65703TsZ.A1Y(it, linkedHashMap);
        }
        return linkedHashMap;
    }
}
