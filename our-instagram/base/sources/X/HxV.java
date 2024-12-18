package X;

import com.facebook.quicklog.reliability.CancelReason;
import com.facebook.quicklog.reliability.UserFlowLogger;
import com.instagram.common.session.UserSession;

/* loaded from: classes7.dex */
public abstract class HxV {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        UserFlowLogger A00;
        int A0D = AbstractC25230BEn.A0D(c6fw.A01(), "null cannot be cast to non-null type kotlin.Number");
        int A0D2 = AbstractC25230BEn.A0D(c6fw.A02(), "null cannot be cast to non-null type kotlin.Number");
        String A0s = AbstractC31173DnH.A0s(c6fw.A00, 2);
        if (A0s == null) {
            A0s = CancelReason.USER_CANCELLED;
        }
        AbstractC12990ll A0B = C6BQ.A0B(c6fq);
        if ((A0B instanceof UserSession) && A0B != null) {
            A00 = C1QS.A00(A0B);
        } else {
            A00 = AbstractC39723Hjt.A00();
        }
        A00.flowEndCancel(A00.generateFlowId(A0D, A0D2), A0s);
        return null;
    }
}
