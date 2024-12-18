package X;

import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.GraphQLSubscriptionID;

/* renamed from: X.Hxx, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40515Hxx {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        Object A01 = c6fw.A01();
        C14360o3.A0C(A01, "null cannot be cast to non-null type com.instagram.common.bloks.BloksContext");
        Object A02 = c6fw.A02();
        C14360o3.A0C(A02, AbstractC111324zv.A00(15));
        C102884kP c102884kP = ((C1338462s) A02).A02;
        C14360o3.A07(c102884kP);
        C102884kP A00 = VSB.A00((C6FG) A01, c6fq, c102884kP);
        C14360o3.A07(A00);
        String A0G = A00.A0G();
        String A0E = A00.A0E();
        AbstractC12990ll A0B = C6BQ.A0B(c6fq);
        if ((A0B instanceof UserSession) && A0G != null) {
            String str = "DEFAULT";
            if (!C14360o3.A0K(A0E, GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT) && C14360o3.A0K(A0E, "caption")) {
                str = "caption";
            }
            C140966Yy A0r = AbstractC25225BEi.A0r(C6BQ.A04(c6fq), A0B);
            A0r.A0B(null, WE2.A02((UserSession) A0B, AbstractC1120253r.A00(A0G), C6BQ.A08(c6fq).getModuleName(), str));
            A0r.A04();
        }
        return null;
    }
}
