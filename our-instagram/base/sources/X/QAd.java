package X;

import android.graphics.PointF;
import java.util.List;

/* loaded from: classes10.dex */
public final class QAd extends QAe {
    public final PointF A00;

    public final PointF A0B(C63366SiP c63366SiP, float f, float f2, float f3) {
        Object obj;
        PointF pointF;
        Object obj2 = c63366SiP.A0E;
        if (obj2 != null && (obj = c63366SiP.A08) != null) {
            PointF pointF2 = (PointF) obj2;
            PointF pointF3 = (PointF) obj;
            C62961SZe c62961SZe = this.A03;
            if (c62961SZe != null && (pointF = (PointF) c62961SZe.A01(pointF2, pointF3, c63366SiP.A0A, c63366SiP.A07.floatValue(), f, A05(), this.A02)) != null) {
                return pointF;
            }
            PointF pointF4 = this.A00;
            float f4 = pointF2.x;
            float f5 = f4 + (f2 * (pointF3.x - f4));
            float f6 = pointF2.y;
            pointF4.set(f5, f6 + (f3 * (pointF3.y - f6)));
            return pointF4;
        }
        throw AbstractC166987dD.A14("Missing values for keyframe.");
    }

    public QAd(List list) {
        super(list);
        this.A00 = new PointF();
    }
}
