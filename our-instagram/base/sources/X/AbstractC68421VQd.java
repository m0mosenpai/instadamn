package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.VQd, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC68421VQd {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        Object A01 = c6fw.A01();
        C14360o3.A0C(A01, "null cannot be cast to non-null type com.instagram.common.bloks.BloksContext");
        Object A02 = c6fw.A02();
        C14360o3.A0C(A02, AbstractC111324zv.A00(15));
        C102884kP A00 = VSB.A00((C6FG) A01, c6fq, ((C1338462s) A02).A02);
        C14360o3.A07(A00);
        String A0E = A00.A0E();
        AbstractC12990ll A0B = C6BQ.A0B(c6fq);
        if ((A0B instanceof UserSession) && A0E != null) {
            FYE.A01(C6BQ.A04(c6fq), (UserSession) A0B, A0E).A04();
            return null;
        }
        return null;
    }
}
