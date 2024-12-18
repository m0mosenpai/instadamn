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
public final class LocalThreadsAdsInjectionDataStore implements LocalMediaInjectionDataStoreManager {
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
        List A1Q = AbstractC16960so.A1Q(new LocalInjectionUnit.Item("Single Image Ad Thread", "single_image_ad_thread.json", null), new LocalInjectionUnit.Item("Single Video Ad Thread", "single_video_ad_thread.json", null));
        ArrayList A0i = AbstractC167007dF.A0i(A1Q);
        int i = 0;
        for (Object obj : A1Q) {
            int i2 = i + 1;
            if (i < 0) {
                AbstractC16960so.A1U();
                throw C00O.createAndThrow();
            }
            LocalInjectionUnit.Item item = (LocalInjectionUnit.Item) obj;
            A0i.add(new LocalInjectionUnit(AbstractC65703TsZ.A16(item), AnonymousClass001.A0R("threads_ads/", item.filename), item.name, LocalInjectionUnit.InjectionUnitType.THREADS_ADS));
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
