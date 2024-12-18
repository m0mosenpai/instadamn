package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.ImageURIDict;
import com.instagram.api.schemas.StoryUnlockableStickerData;
import com.instagram.api.schemas.UnlockableStickerStatus;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Huv, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC40351Huv {
    public static Map A00(StoryUnlockableStickerData storyUnlockableStickerData) {
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (storyUnlockableStickerData.getId() != null) {
            AbstractC37300Gc1.A12(storyUnlockableStickerData.getId(), A1I);
        }
        if (storyUnlockableStickerData.getName() != null) {
            AbstractC37300Gc1.A14(storyUnlockableStickerData.getName(), A1I);
        }
        String str = null;
        if (storyUnlockableStickerData.C83() != null) {
            ImageURIDict C83 = storyUnlockableStickerData.C83();
            if (C83 != null) {
                treeUpdaterJNI = C83.F7o();
            } else {
                treeUpdaterJNI = null;
            }
            A1I.put("thumbnail_image", treeUpdaterJNI);
        }
        if (storyUnlockableStickerData.CCl() != null) {
            UnlockableStickerStatus CCl = storyUnlockableStickerData.CCl();
            if (CCl != null) {
                str = CCl.A00;
            }
            A1I.put("unlock_status", str);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
