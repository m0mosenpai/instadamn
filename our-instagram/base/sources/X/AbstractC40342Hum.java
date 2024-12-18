package X;

import com.instagram.api.schemas.StoryThenAndNowStickerDictIntf;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Hum, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC40342Hum {
    public static Map A00(StoryThenAndNowStickerDictIntf storyThenAndNowStickerDictIntf) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (storyThenAndNowStickerDictIntf.AaS() != null) {
            A1I.put("after_string", storyThenAndNowStickerDictIntf.AaS());
        }
        if (storyThenAndNowStickerDictIntf.Aft() != null) {
            A1I.put("before_string", storyThenAndNowStickerDictIntf.Aft());
        }
        if (storyThenAndNowStickerDictIntf.getId() != null) {
            AbstractC37300Gc1.A12(storyThenAndNowStickerDictIntf.getId(), A1I);
        }
        if (storyThenAndNowStickerDictIntf.CQX() != null) {
            A1I.put("is_before", storyThenAndNowStickerDictIntf.CQX());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
