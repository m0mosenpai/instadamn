package X;

import android.graphics.drawable.Drawable;
import com.instagram.api.schemas.StoryPromptType;
import com.instagram.reels.prompt.model.PromptStickerModel;

/* renamed from: X.9No, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC209309No {
    public static final boolean A00(Drawable drawable) {
        C221009pO c221009pO;
        PromptStickerModel promptStickerModel;
        if (drawable instanceof C194808jg) {
            C194808jg c194808jg = (C194808jg) drawable;
            if (c194808jg.A04() instanceof C221009pO) {
                Drawable A04 = c194808jg.A04();
                StoryPromptType storyPromptType = null;
                if ((A04 instanceof C221009pO) && (c221009pO = (C221009pO) A04) != null && (promptStickerModel = c221009pO.A06) != null) {
                    storyPromptType = promptStickerModel.A03();
                }
                if (storyPromptType == StoryPromptType.A06) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final boolean A01(Drawable drawable) {
        C202588xc c202588xc;
        EnumC150226pU enumC150226pU;
        if (!(drawable instanceof C194808jg)) {
            return false;
        }
        C194808jg c194808jg = (C194808jg) drawable;
        if (!(c194808jg.A04() instanceof C202588xc)) {
            return false;
        }
        Drawable A04 = c194808jg.A04();
        if (!(A04 instanceof C202588xc) || (c202588xc = (C202588xc) A04) == null || (enumC150226pU = c202588xc.A0M) == EnumC150226pU.A0C || enumC150226pU == EnumC150226pU.A0A) {
            return false;
        }
        return true;
    }

    public static final boolean A02(Drawable drawable) {
        if ((drawable instanceof C194808jg) && (((C194808jg) drawable).A04() instanceof C74P)) {
            return true;
        }
        return false;
    }
}
