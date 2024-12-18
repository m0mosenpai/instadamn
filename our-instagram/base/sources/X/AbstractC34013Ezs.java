package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.Ezs, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34013Ezs {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        String A0e = AbstractC31177DnL.A0e(c6fw, 0);
        boolean A01 = C6DZ.A01(c6fw.A02());
        UserSession A0S = AbstractC31177DnL.A0S(c6fq);
        User A10 = AbstractC166987dD.A10(A0S);
        int hashCode = A0e.hashCode();
        if (hashCode != -1804233150) {
            if (hashCode != -957868191) {
                if (hashCode == -868192944 && A0e.equals("muted_words_global_list")) {
                    new C131305wJ(A0S).A00(null, A01);
                    if (A01 && C18U.A06(AbstractC25225BEi.A0j(A0S, 0), A0S, 36311912675083066L)) {
                        AbstractC23043ADz.A00(A0S);
                    }
                    A10.A0c(A0S);
                    return null;
                }
            } else if (A0e.equals("hide_more_comments")) {
                A10.A03.EVl(Boolean.valueOf(A01));
                A10.A0c(A0S);
                return null;
            }
        } else if (A0e.equals("muted_words_custom_list")) {
            new C131305wJ(A0S).A02(A01);
            return null;
        }
        AbstractC25241Le.A02(AbstractC111324zv.A00(1657), AnonymousClass001.A0R("Unknown Content Filter setting: ", A0e));
        return null;
    }
}
