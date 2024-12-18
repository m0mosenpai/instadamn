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
public final class LocalStoriesNetegoInjectionDataStore implements LocalMediaInjectionDataStoreManager {
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
        int i = 0;
        List A1Q = AbstractC16960so.A1Q(new LocalInjectionUnit.Item("Bakeoff", "bakeoff.json", null), new LocalInjectionUnit.Item("Ad4Ad Image", "ad4ad_image.json", null), new LocalInjectionUnit.Item("Ad4Ad Video", "ad4ad_video.json", null), new LocalInjectionUnit.Item("Suggested Users", "suggested_users_shuffle.json", null), new LocalInjectionUnit.Item("Quality Survey", "netego_quality_survey.json", null), new LocalInjectionUnit.Item("Story Creation Upsell", "story_creation_upsell.json", null), new LocalInjectionUnit.Item("Suggested Clips", "suggested_clips.json", null), new LocalInjectionUnit.Item("Products For You", "products_for_you.json", null), new LocalInjectionUnit.Item("Affiliate Top Brands", "affiliate_top_brands.json", null), new LocalInjectionUnit.Item("Shops You Might Like", "shops_you_might_like.json", null), new LocalInjectionUnit.Item("Ads Consent Growth", "ig_ads_consent_growth.json", null), new LocalInjectionUnit.Item("Insights Stories", "ig_insights.json", null), new LocalInjectionUnit.Item("Share Comment to Story - Reel", "share_comment_to_story_reel.json", null), new LocalInjectionUnit.Item("Share Comment to Story - Feed", "share_comment_to_story_feed.json", null), new LocalInjectionUnit.Item("Meta Gallery Stories Netego", "meta_gallery_stories_netego.json", null), new LocalInjectionUnit.Item("Trending Add Yours", "trending_add_yours_midcard.json", null));
        ArrayList A0i = AbstractC167007dF.A0i(A1Q);
        for (Object obj : A1Q) {
            int i2 = i + 1;
            if (i < 0) {
                AbstractC16960so.A1U();
                throw C00O.createAndThrow();
            }
            LocalInjectionUnit.Item item = (LocalInjectionUnit.Item) obj;
            String str = item.id;
            if (str == null) {
                str = AnonymousClass001.A0O("stories_netego_", i);
            }
            A0i.add(new LocalInjectionUnit(str, AnonymousClass001.A0R("stories_netego/", item.filename), item.name, LocalInjectionUnit.InjectionUnitType.STORIES_NETEGO));
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
