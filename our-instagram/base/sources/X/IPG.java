package X;

import com.instagram.api.schemas.StoryThenAndNowStickerDict;
import java.io.IOException;

/* loaded from: classes7.dex */
public abstract class IPG {
    public static StoryThenAndNowStickerDict parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            String str = null;
            String str2 = null;
            String str3 = null;
            Boolean bool = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("after_string".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("before_string".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if (AbstractC31171DnF.A1Y(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str3 = null;
                    } else {
                        str3 = c16l.A1P();
                    }
                } else {
                    bool = AbstractC37303Gc4.A0K(c16l, bool, A0s, "is_before");
                }
                c16l.A0z();
            }
            return new StoryThenAndNowStickerDict(bool, str, str2, str3);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, StoryThenAndNowStickerDict storyThenAndNowStickerDict, boolean z) {
        if (z) {
            anonymousClass182.A0d();
        }
        String str = storyThenAndNowStickerDict.A01;
        if (str != null) {
            anonymousClass182.A0S("after_string", str);
        }
        String str2 = storyThenAndNowStickerDict.A02;
        if (str2 != null) {
            anonymousClass182.A0S("before_string", str2);
        }
        AbstractC37301Gc2.A1D(anonymousClass182, storyThenAndNowStickerDict.A03);
        Boolean bool = storyThenAndNowStickerDict.A00;
        if (bool != null) {
            anonymousClass182.A0T("is_before", bool.booleanValue());
        }
        if (z) {
            anonymousClass182.A0a();
        }
    }
}
