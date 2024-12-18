package X;

import com.instagram.api.schemas.StoryTemplateAvatarStickerOverlayDictImpl;
import java.io.IOException;

/* renamed from: X.Hua, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40330Hua {
    public static StoryTemplateAvatarStickerOverlayDictImpl parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            String str = null;
            Float f = null;
            String str2 = null;
            String str3 = null;
            Float f2 = null;
            Float f3 = null;
            Float f4 = null;
            Float f5 = null;
            Integer num = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("expression_id".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if (AbstractC37300Gc1.A1H(A0s)) {
                    f = AbstractC167007dF.A0a(c16l);
                } else if (AbstractC111324zv.A00(122).equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if (AbstractC37300Gc1.A1O(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str3 = null;
                    } else {
                        str3 = c16l.A1P();
                    }
                } else if (AbstractC37300Gc1.A1K(A0s)) {
                    f2 = AbstractC167007dF.A0a(c16l);
                } else if (AbstractC37300Gc1.A1G(A0s)) {
                    f3 = AbstractC167007dF.A0a(c16l);
                } else if (AbstractC37300Gc1.A1A(A0s)) {
                    f4 = AbstractC167007dF.A0a(c16l);
                } else if (AbstractC37300Gc1.A1B(A0s)) {
                    f5 = AbstractC167007dF.A0a(c16l);
                } else {
                    num = AbstractC31178DnM.A0V(c16l, num, A0s, "z_index");
                }
                c16l.A0z();
            }
            return new StoryTemplateAvatarStickerOverlayDictImpl(f, f2, f3, f4, f5, num, str, str2, str3);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
