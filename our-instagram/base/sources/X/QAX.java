package X;

import android.graphics.PointF;

/* loaded from: classes10.dex */
public final class QAX extends QAe {
    public final int A0B(C63366SiP c63366SiP, float f) {
        Object obj;
        Float f2;
        Number number;
        Object obj2 = c63366SiP.A0E;
        if (obj2 != null && (obj = c63366SiP.A08) != null) {
            C62961SZe c62961SZe = this.A03;
            if (c62961SZe != null && (f2 = c63366SiP.A07) != null && (number = (Number) c62961SZe.A01(obj2, obj, c63366SiP.A0A, f2.floatValue(), f, A05(), this.A02)) != null) {
                return number.intValue();
            }
            PointF pointF = AbstractC63251Sg7.A00;
            return AbstractC63043SbM.A02(AbstractC58322PtE.A01(1.0f, f, 0.0f), AbstractC166987dD.A0H(obj2), AbstractC166987dD.A0H(c63366SiP.A08));
        }
        throw AbstractC166987dD.A14("Missing values for keyframe.");
    }
}
