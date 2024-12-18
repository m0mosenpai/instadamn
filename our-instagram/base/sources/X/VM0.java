package X;

/* loaded from: classes11.dex */
public abstract class VM0 {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        C102884kP A0P = AbstractC65702TsY.A0P(c6fw, 0);
        float A00 = AbstractC43593JPy.A00(c6fw.A02(), "null cannot be cast to non-null type kotlin.Number");
        boolean A01 = C6DZ.A01(c6fw.A00());
        U4G u4g = (U4G) AnonymousClass634.A06(C103064kh.A00(c6fq, c6fw, 3), A0P);
        if (u4g != null) {
            int A002 = (int) VSI.A00(C1LZ.A00().A00, A00);
            if (AbstractC79383gk.A03()) {
                if (AbstractC79383gk.A03()) {
                    u4g.A00(A002 - u4g.A02.A04, 0, A01);
                    return null;
                }
                throw new RuntimeException("Cannot getScroll off the main thread!");
            }
            throw new RuntimeException("setXOffset cannot be called from a background thread.");
        }
        return null;
    }
}
