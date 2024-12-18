package X;

import com.instagram.api.schemas.StoryTemplateFillableMusicStickerDict;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Huc, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC40332Huc {
    public static Map A00(StoryTemplateFillableMusicStickerDict storyTemplateFillableMusicStickerDict) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (storyTemplateFillableMusicStickerDict.Ayd() != null) {
            A1I.put("display_type", storyTemplateFillableMusicStickerDict.Ayd());
        }
        if (storyTemplateFillableMusicStickerDict.BDR() != null) {
            AbstractC37303Gc4.A1L(storyTemplateFillableMusicStickerDict.BDR(), A1I);
        }
        if (storyTemplateFillableMusicStickerDict.Bpa() != null) {
            AbstractC37303Gc4.A1M(storyTemplateFillableMusicStickerDict.Bpa(), A1I);
        }
        if (storyTemplateFillableMusicStickerDict.CHf() != null) {
            AbstractC37303Gc4.A1K(storyTemplateFillableMusicStickerDict.CHf(), A1I);
        }
        if (storyTemplateFillableMusicStickerDict.CI1() != null) {
            AbstractC37302Gc3.A1V(storyTemplateFillableMusicStickerDict.CI1(), A1I);
        }
        if (storyTemplateFillableMusicStickerDict.CIa() != null) {
            AbstractC37303Gc4.A1I(storyTemplateFillableMusicStickerDict.CIa(), A1I);
        }
        if (storyTemplateFillableMusicStickerDict.CIi() != null) {
            A1I.put("z_index", storyTemplateFillableMusicStickerDict.CIi());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
