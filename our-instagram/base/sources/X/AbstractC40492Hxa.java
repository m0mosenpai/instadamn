package X;

import com.facebook.quicklog.reliability.UserFlowConfig;
import com.facebook.quicklog.reliability.UserFlowLogger;
import com.instagram.common.session.UserSession;

/* renamed from: X.Hxa, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40492Hxa {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        UserFlowLogger A00;
        int A0D = AbstractC25230BEn.A0D(c6fw.A01(), "null cannot be cast to non-null type kotlin.Number");
        int A0D2 = AbstractC25230BEn.A0D(c6fw.A02(), "null cannot be cast to non-null type kotlin.Number");
        Object A002 = c6fw.A00();
        C14360o3.A0C(A002, "null cannot be cast to non-null type com.instagram.common.bloks.component.base.BloksModel");
        C102884kP c102884kP = (C102884kP) A002;
        AbstractC12990ll A0B = C6BQ.A0B(c6fq);
        if ((A0B instanceof UserSession) && A0B != null) {
            A00 = C1QS.A00(A0B);
        } else {
            A00 = AbstractC39723Hjt.A00();
        }
        boolean equals = "cancel".equals(c102884kP.A0E());
        String A0G = c102884kP.A0G();
        if (A0G == null) {
            A0G = "IgBloks";
        }
        long A03 = c102884kP.A03(38, -1);
        UserFlowConfig userFlowConfig = new UserFlowConfig(A0G, equals);
        userFlowConfig.mTtlMs = A03;
        A00.flowStart(A00.generateFlowId(A0D, A0D2), userFlowConfig);
        return null;
    }
}
