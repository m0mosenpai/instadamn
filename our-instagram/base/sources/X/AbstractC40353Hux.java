package X;

import com.instagram.api.schemas.StoryUnlockableStickerData;
import com.instagram.api.schemas.StoryUnlockableStickerTappableObject;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.Hux, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC40353Hux {
    public static Map A00(StoryUnlockableStickerTappableObject storyUnlockableStickerTappableObject) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (storyUnlockableStickerTappableObject.C0p() != null) {
            List<StoryUnlockableStickerData> C0p = storyUnlockableStickerTappableObject.C0p();
            ArrayList arrayList = null;
            if (C0p != null) {
                arrayList = AbstractC166987dD.A1E();
                for (StoryUnlockableStickerData storyUnlockableStickerData : C0p) {
                    if (storyUnlockableStickerData != null) {
                        arrayList.add(storyUnlockableStickerData.F7o());
                    }
                }
            }
            A1I.put("stickers", arrayList);
        }
        if (storyUnlockableStickerTappableObject.getSubtitle() != null) {
            A1I.put("subtitle", storyUnlockableStickerTappableObject.getSubtitle());
        }
        if (storyUnlockableStickerTappableObject.getTitle() != null) {
            AbstractC37300Gc1.A17(storyUnlockableStickerTappableObject.getTitle(), A1I);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
