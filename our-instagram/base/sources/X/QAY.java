package X;

import android.graphics.PointF;

/* loaded from: classes10.dex */
public final class QAY extends QAe {
    public final int A0B(C63366SiP c63366SiP, float f) {
        Object obj;
        Number number;
        Object obj2 = c63366SiP.A0E;
        if (obj2 != null && (obj = c63366SiP.A08) != null) {
            C62961SZe c62961SZe = this.A03;
            if (c62961SZe != null && (number = (Number) c62961SZe.A01(obj2, obj, c63366SiP.A0A, c63366SiP.A07.floatValue(), f, A05(), this.A02)) != null) {
                return number.intValue();
            }
            int i = c63366SiP.A04;
            if (i == 784923401) {
                i = AbstractC166987dD.A0H(obj2);
                c63366SiP.A04 = i;
            }
            int i2 = c63366SiP.A03;
            if (i2 == 784923401) {
                i2 = AbstractC166987dD.A0H(c63366SiP.A08);
                c63366SiP.A03 = i2;
            }
            PointF pointF = AbstractC63251Sg7.A00;
            return (int) (i + (f * (i2 - i)));
        }
        throw AbstractC166987dD.A14("Missing values for keyframe.");
    }
}
