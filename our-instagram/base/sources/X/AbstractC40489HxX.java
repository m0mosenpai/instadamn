package X;

import com.facebook.quicklog.reliability.UserFlowLogger;
import com.instagram.common.session.UserSession;

/* renamed from: X.HxX, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40489HxX {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        UserFlowLogger A00;
        int A0D = AbstractC25230BEn.A0D(c6fw.A01(), "null cannot be cast to non-null type kotlin.Number");
        int A0D2 = AbstractC25230BEn.A0D(c6fw.A02(), "null cannot be cast to non-null type kotlin.Number");
        AbstractC12990ll A0B = C6BQ.A0B(c6fq);
        if ((A0B instanceof UserSession) && A0B != null) {
            A00 = C1QS.A00(A0B);
        } else {
            A00 = AbstractC39723Hjt.A00();
        }
        A00.flowEndSuccess(A00.generateFlowId(A0D, A0D2));
        return null;
    }
}
