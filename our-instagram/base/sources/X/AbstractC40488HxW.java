package X;

import com.facebook.quicklog.reliability.UserFlowLogger;
import com.instagram.common.session.UserSession;

/* renamed from: X.HxW, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40488HxW {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        UserFlowLogger A00;
        int A0D = AbstractC25230BEn.A0D(c6fw.A01(), "null cannot be cast to non-null type kotlin.Number");
        int A0D2 = AbstractC25230BEn.A0D(c6fw.A02(), "null cannot be cast to non-null type kotlin.Number");
        Object A002 = c6fw.A00();
        AbstractC25225BEi.A1S(A002);
        String str = (String) A002;
        String A0s = AbstractC31173DnH.A0s(c6fw.A00, 3);
        AbstractC12990ll A0B = C6BQ.A0B(c6fq);
        if ((A0B instanceof UserSession) && A0B != null) {
            A00 = C1QS.A00(A0B);
        } else {
            A00 = AbstractC39723Hjt.A00();
        }
        A00.flowEndFail(A00.generateFlowId(A0D, A0D2), str, A0s);
        return null;
    }
}
