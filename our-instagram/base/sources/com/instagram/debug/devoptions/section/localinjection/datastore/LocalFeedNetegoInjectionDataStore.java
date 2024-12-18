package com.instagram.debug.devoptions.section.localinjection.datastore;

import X.AbstractC06950Ym;
import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.AbstractC16960so;
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
public final class LocalFeedNetegoInjectionDataStore implements LocalMediaInjectionDataStoreManager {
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
        List A1Q = AbstractC16960so.A1Q(new LocalInjectionUnit.Item("Feed Ad vs Feed Organic Bakeoff", "feed_ad_vs_organic_bakeoff.json", null), new LocalInjectionUnit.Item("Mlex Survey", "feed_mlex_survey.json", null), new LocalInjectionUnit.Item("Mlex Survey 2", "feed_mlex_survey_2.json", null), new LocalInjectionUnit.Item("ASQ Survey", "feed_asq_survey.json", null), new LocalInjectionUnit.Item("Inline Survey (IG-WYT)", "feed_inline_survey.json", null), new LocalInjectionUnit.Item("Ad Likeness Survey", "feed_ad_likeness_survey.json", null), new LocalInjectionUnit.Item("Feed Organic vs Feed Organic Bakeoff", "feed_organic_vs_organic_bakeoff.json", null), new LocalInjectionUnit.Item("Story Sentiment Survey", "feed_story_sentiment_survey.json", null), new LocalInjectionUnit.Item("ACQS (Story Ads User Sentiment) Survey", "feed_acqs_survey.json", null), new LocalInjectionUnit.Item("Suggested Users", "feed_su.json", null), new LocalInjectionUnit.Item("Clips Netego", "feed_clips_netego.json", null), new LocalInjectionUnit.Item("Ad4ad", "ad4ad.json", null), new LocalInjectionUnit.Item("Follow Requests", "follow_requests.json", null), new LocalInjectionUnit.Item("Follow Requests (updated social context", "follow_requests_updated_social_context.json", null), new LocalInjectionUnit.Item("Take A Break Nudge (uses Ad4Ad layout)", "take_a_break.json", null));
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
                str = AnonymousClass001.A0O("feed_netego_", i);
            }
            A0i.add(new LocalInjectionUnit(str, AnonymousClass001.A0R("feed_netego/", item.filename), item.name, LocalInjectionUnit.InjectionUnitType.FEED_NETEGO));
            i = i2;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC167017dG.A01(AbstractC06950Ym.A1E(A0i, 10)));
        Iterator it = A0i.iterator();
        while (it.hasNext()) {
            AbstractC65703TsZ.A1Y(it, linkedHashMap);
        }
        return linkedHashMap;
    }
}
