package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.Ey6, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC33904Ey6 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, X.Fvv, X.1vN] */
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        Object A01 = c6fw.A01();
        C14360o3.A0C(A01, "null cannot be cast to non-null type kotlin.Number");
        String A19 = AbstractC166987dD.A19(A01);
        int A0D = AbstractC25230BEn.A0D(c6fw.A02(), "null cannot be cast to non-null type kotlin.Int");
        InterfaceC103384lE A0H = AbstractC31175DnJ.A0H(c6fw);
        UserSession A0S = AbstractC31177DnL.A0S(c6fq);
        User A0k = AbstractC31174DnI.A0k(A0S, A19);
        if (A0k != null) {
            C14360o3.A0B(A0S, 2);
            C25671My A00 = AbstractC25651Mw.A00(A0S);
            ?? obj = new Object();
            obj.A01 = A0k;
            obj.A00 = A0D;
            A00.E4s(obj);
        } else {
            C4LM.A02.A02(A0S, new GIK(A0S, A0D, 1), A19);
        }
        AbstractC31171DnF.A1K(c6fq, A0H);
        return null;
    }
}
