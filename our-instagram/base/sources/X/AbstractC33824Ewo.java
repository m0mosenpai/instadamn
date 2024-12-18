package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Ewo, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC33824Ewo {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        boolean A01 = C6DZ.A01(c6fw.A00.get(0));
        Object A02 = c6fw.A02();
        C14360o3.A0C(A02, "null cannot be cast to non-null type kotlin.Number");
        long A0N = AbstractC166987dD.A0N(A02);
        C6FG c6fg = c6fq.A03;
        if (c6fg != null) {
            UserSession A0L = AbstractC31179DnN.A0L(c6fq);
            if (A01) {
                C35256Fgp.A04(A0L, A0N);
                return null;
            }
            C35256Fgp.A01(c6fg.A00, A0L, A0N);
            return null;
        }
        throw AbstractC166997dE.A0g();
    }
}
