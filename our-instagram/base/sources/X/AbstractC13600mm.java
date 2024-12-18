package X;

import android.graphics.PointF;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.0mm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC13600mm {
    public static final float A01(float f, float f2, float f3, float f4, float f5) {
        float f6 = f3 - f2;
        float f7 = f5 - f4;
        float f8 = 0.0f;
        if (f6 != 0.0f) {
            f8 = (f - f2) / f6;
        }
        return (f8 * f7) + f4;
    }

    public static final float A02(float f, float f2, float f3, float f4, float f5) {
        float f6 = f3 - f2;
        float f7 = f5 - f4;
        float f8 = 0.0f;
        if (f6 != 0.0f) {
            f8 = (f - f2) / f6;
        }
        return A00((f8 * f7) + f4, f4, f5);
    }

    public static final PointF A04(List list) {
        PointF pointF = new PointF(0.5f, 0.5f);
        if (list.size() == 1) {
            pointF.set((PointF) list.get(0));
        } else {
            if (list.size() == 2) {
                pointF.set((((PointF) list.get(0)).x + ((PointF) list.get(1)).x) / 2.0f, (((PointF) list.get(0)).y + ((PointF) list.get(1)).y) / 2.0f);
                return pointF;
            }
            if (list.size() > 2) {
                C138856Qq[] c138856QqArr = new C138856Qq[list.size()];
                Iterator it = list.iterator();
                int i = 0;
                while (it.hasNext()) {
                    PointF pointF2 = (PointF) it.next();
                    c138856QqArr[i] = new C138856Qq(pointF2.x, pointF2.y);
                    i++;
                }
                float[] A02 = AKZ.A02(c138856QqArr);
                pointF.set(A02[0], A02[1]);
                return pointF;
            }
        }
        return pointF;
    }

    public static final float A00(float f, float f2, float f3) {
        return Math.min(Math.max(f2, f3), Math.max(Math.min(f2, f3), f));
    }

    public static final int A03(int i, int i2, int i3) {
        return Math.min(Math.max(i2, i3), Math.max(Math.min(i2, i3), i));
    }
}
