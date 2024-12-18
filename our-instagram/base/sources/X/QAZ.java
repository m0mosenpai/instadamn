package X;

/* loaded from: classes10.dex */
public final class QAZ extends QAe {
    public final float A0B() {
        return A0C(this.A06.AuW(), A04());
    }

    public final float A0C(C63366SiP c63366SiP, float f) {
        Object obj;
        Number number;
        Object obj2 = c63366SiP.A0E;
        if (obj2 != null && (obj = c63366SiP.A08) != null) {
            C62961SZe c62961SZe = this.A03;
            if (c62961SZe != null && (number = (Number) c62961SZe.A01(obj2, obj, c63366SiP.A0A, c63366SiP.A07.floatValue(), f, A05(), this.A02)) != null) {
                return number.floatValue();
            }
            float f2 = c63366SiP.A02;
            if (f2 == -3987645.8f) {
                f2 = AbstractC166987dD.A09(obj2);
                c63366SiP.A02 = f2;
            }
            float f3 = c63366SiP.A00;
            if (f3 == -3987645.8f) {
                f3 = AbstractC166987dD.A09(c63366SiP.A08);
                c63366SiP.A00 = f3;
            }
            return AbstractC58321PtD.A01(f3, f2, f);
        }
        throw AbstractC166987dD.A14("Missing values for keyframe.");
    }
}
