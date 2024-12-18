package X;

import com.facebook.quicklog.reliability.UserFlowConfig;

/* renamed from: X.Hxb, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40493Hxb {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        int A0D = AbstractC25230BEn.A0D(c6fw.A01(), "null cannot be cast to non-null type kotlin.Number");
        int A0D2 = AbstractC25230BEn.A0D(c6fw.A02(), "null cannot be cast to non-null type kotlin.Number");
        Object A00 = c6fw.A00();
        AbstractC25225BEi.A1S(A00);
        boolean A01 = C6DZ.A01(c6fw.A03(3));
        C1QT A002 = C1QS.A00(AbstractC31175DnJ.A0J(c6fq));
        A002.flowStartIfNotOngoing(A002.generateFlowId(A0D, A0D2), new UserFlowConfig((String) A00, A01));
        return null;
    }
}
