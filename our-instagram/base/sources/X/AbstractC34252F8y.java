package X;

import com.instagram.model.direct.DirectPendingLayeredXma;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.user.model.User;
import java.io.IOException;

/* renamed from: X.F8y, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34252F8y {
    public static DirectPendingLayeredXma parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Boolean bool = null;
            Boolean bool2 = null;
            String str = null;
            String str2 = null;
            User user = null;
            ExtendedImageUrl extendedImageUrl = null;
            ExtendedImageUrl extendedImageUrl2 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if (AbstractC31171DnF.A1a(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("subtitle".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if (AbstractC31171DnF.A1Z(A0s)) {
                    user = AbstractC31171DnF.A0S(c16l, false);
                } else if ("allow_share_comment_to_story".equals(A0s)) {
                    bool = AbstractC166997dE.A0d(c16l);
                } else if ("preview_url".equals(A0s)) {
                    extendedImageUrl = C17Y.parseFromJson(c16l);
                } else if (AbstractC43591JPw.A00(155).equals(A0s)) {
                    extendedImageUrl2 = C17Y.parseFromJson(c16l);
                } else if ("show_sucess_toast".equals(A0s)) {
                    bool2 = AbstractC166997dE.A0d(c16l);
                }
                c16l.A0z();
            }
            if (bool == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("allow_share_comment_to_story", c16l, "DirectPendingLayeredXma");
            } else if (bool2 == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("show_sucess_toast", c16l, "DirectPendingLayeredXma");
            } else {
                return new DirectPendingLayeredXma(extendedImageUrl, extendedImageUrl2, user, str, str2, bool.booleanValue(), bool2.booleanValue());
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
