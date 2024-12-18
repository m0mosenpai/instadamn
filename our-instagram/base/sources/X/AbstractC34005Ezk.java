package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Ezk, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34005Ezk {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        UserSession userSession;
        String A0d = AbstractC31177DnL.A0d(c6fw);
        int A0D = AbstractC25230BEn.A0D(c6fw.A02(), "null cannot be cast to non-null type kotlin.Number");
        AbstractC12990ll A0B = C6BQ.A0B(c6fq);
        if ((A0B instanceof UserSession) && (userSession = (UserSession) A0B) != null) {
            AbstractC167007dF.A18(C1AT.A01(userSession).A03(C1AV.A3X), A0d, A0D);
            return null;
        }
        throw AbstractC166987dD.A12(AbstractC111324zv.A00(25));
    }
}
