package com.instagram.debug.devoptions.section.localinjection.datastore;

import X.AbstractC001800i;
import X.AbstractC06950Ym;
import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.AbstractC16960so;
import X.AbstractC65703TsZ;
import X.AnonymousClass001;
import X.C00O;
import X.C14360o3;
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
public final class LocalReelsOrganicInjectionDataStore implements LocalMediaInjectionDataStoreManager {
    @Override // com.instagram.debug.devoptions.section.localinjection.datastore.LocalMediaInjectionDataStoreManager
    public /* synthetic */ List getAllInjectionItems() {
        return LocalMediaInjectionDataStoreManager.CC.$default$getAllInjectionItems(this);
    }

    @Override // com.instagram.debug.devoptions.section.localinjection.datastore.LocalMediaInjectionDataStoreManager
    public Map getInjectionDataStore() {
        List A1Q = AbstractC16960so.A1Q(new LocalInjectionUnit.Item("Photo", "clips_mixed_media_photo.json", LocalMediaInjectionConstants.ID_REELS_PHOTO), new LocalInjectionUnit.Item("Photo with Music", "clips_mixed_media_photo_with_music.json", LocalMediaInjectionConstants.ID_REELS_PHOTO_WITH_MUSIC), new LocalInjectionUnit.Item("Photo Carousel", "clips_mixed_media_photo_carousel.json", LocalMediaInjectionConstants.ID_REELS_PHOTO_CAROUSEL), new LocalInjectionUnit.Item("Video Carousel", "clips_mixed_media_video_carousel.json", LocalMediaInjectionConstants.ID_REELS_VIDEO_CAROUSEL), new LocalInjectionUnit.Item("Video && Photo Carousel", "clips_mixed_media_video_and_photo_carousel.json", LocalMediaInjectionConstants.ID_REELS_VIDEO_AND_PHOTO_CAROUSEL), new LocalInjectionUnit.Item("Carousel with Music", "clips_mixed_media_carousel_with_music.json", LocalMediaInjectionConstants.ID_REELS_CAROUSEL_WITH_MUSIC));
        ArrayList A0i = AbstractC167007dF.A0i(A1Q);
        int i = 0;
        for (Object obj : A1Q) {
            int i2 = i + 1;
            if (i < 0) {
                AbstractC16960so.A1U();
                throw C00O.createAndThrow();
            }
            LocalInjectionUnit.Item item = (LocalInjectionUnit.Item) obj;
            A0i.add(new LocalInjectionUnit(AbstractC65703TsZ.A16(item), AnonymousClass001.A0R("reels_organic/", item.filename), item.name, LocalInjectionUnit.InjectionUnitType.REELS_ORGANIC));
            i = i2;
        }
        ArrayList A0T = AbstractC001800i.A0T(new LocalInjectionUnit(LocalMediaInjectionConstants.ID_REELS_UNAVAILABLE, "", "Inject Unavailable Reel", LocalInjectionUnit.InjectionUnitType.REELS_ORGANIC), A0i);
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC167017dG.A01(AbstractC06950Ym.A1E(A0T, 10)));
        Iterator it = A0T.iterator();
        while (it.hasNext()) {
            AbstractC65703TsZ.A1Y(it, linkedHashMap);
        }
        return linkedHashMap;
    }

    @Override // com.instagram.debug.devoptions.section.localinjection.datastore.LocalMediaInjectionDataStoreManager
    public List getInjectedJSONStrings(Context context, Set set) {
        AbstractC167017dG.A1N(context, set);
        ArrayList arrayList = new ArrayList();
        for (Object obj : set) {
            if (!C14360o3.A0K(obj, LocalMediaInjectionConstants.ID_REELS_UNAVAILABLE)) {
                arrayList.add(obj);
            }
        }
        return LocalMediaInjectionDataStoreManager.CC.$default$getInjectedJSONStrings(this, context, AbstractC001800i.A0k(arrayList));
    }
}
