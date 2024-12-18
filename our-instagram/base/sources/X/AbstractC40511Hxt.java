package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Hxt, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40511Hxt {
    public static Object A00(C6FQ c6fq, C6FW c6fw) {
        String str = (String) c6fw.A03(0);
        String str2 = (String) c6fw.A02();
        boolean A01 = C6DZ.A01(c6fw.A00());
        c6fw.A03(3);
        AbstractC12990ll A0B = C6BQ.A0B(c6fq);
        if (A0B instanceof UserSession) {
            UserSession userSession = (UserSession) A0B;
            AnonymousClass548.A00().A00().A00(C6BQ.A04(c6fq), null, new C26025BfE(EnumC120785dO.ACTIVITY, null, 0, 0, null, null, null, str, null, AbstractC111324zv.A00(986), str2, null, null, null, null, null, null, null, null, null, null, 0, A01, true, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, true, false, false, false, false, false, false, false, false), userSession, null, null, C18U.A06(C06090Tz.A05, userSession, 36318741671516604L), true, false);
            return null;
        }
        return null;
    }
}
