package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Hxw, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40514Hxw {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        C2EY c2ey;
        Object A01 = c6fw.A01();
        C14360o3.A0C(A01, "null cannot be cast to non-null type com.instagram.common.bloks.BloksContext");
        Object A03 = c6fw.A03(1);
        C14360o3.A0C(A03, AbstractC111324zv.A00(15));
        C102884kP c102884kP = ((C1338462s) A03).A02;
        C14360o3.A07(c102884kP);
        C102884kP A00 = VSB.A00((C6FG) A01, c6fq, c102884kP);
        C14360o3.A07(A00);
        String A0E = A00.A0E();
        String A002 = AbstractC111324zv.A00(1101);
        String str = A002;
        String A0G = A00.A0G();
        if (A0G != null) {
            str = A0G;
        }
        if (str.equals(A002)) {
            c2ey = C2EY.A1F;
        } else if (str.equals("clips_share")) {
            c2ey = C2EY.A0W;
        } else {
            C0w9.A03("invalid_content_type", AnonymousClass001.A0R(str, " is not a valid content type to share"));
            return null;
        }
        AbstractC12990ll A0B = C6BQ.A0B(c6fq);
        if (A0B instanceof UserSession) {
            C34726FRp A07 = C28531Zo.A04.A02.A07(C6BQ.A08(c6fq), (UserSession) A0B, c2ey);
            if (A0E != null) {
                A07.A06(A0E);
            }
            C3DN A012 = C3DN.A00.A01(C6BQ.A01(c6fq).getContext());
            if (A012 != null) {
                A012.A0K(A07.A00());
            }
        }
        return null;
    }
}
