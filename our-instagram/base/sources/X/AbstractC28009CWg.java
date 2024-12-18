package X;

/* renamed from: X.CWg, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC28009CWg {
    public static final float A00(BVY bvy) {
        C6M3 c6m3 = AbstractC25230BEn.A0S(bvy.A0C).A09;
        C6M3 c6m32 = C6M3.Horizontal;
        long j = ((C119365at) bvy.A0X.getValue()).A00;
        if (c6m3 == c6m32) {
            return C119365at.A01(j);
        }
        return C119365at.A02(j);
    }

    public static final boolean A01(BVY bvy) {
        boolean z = AbstractC25230BEn.A0S(bvy.A0C).A0H;
        if (A00(bvy) <= 0.0f || !z) {
            if (A00(bvy) <= 0.0f && !z) {
                return true;
            }
            return false;
        }
        return true;
    }
}
