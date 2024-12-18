package X;

import android.graphics.Matrix;

/* loaded from: classes4.dex */
public abstract class AMG {
    public static final boolean A04(C84B c84b) {
        C206169Az c206169Az;
        if (c84b == null) {
            return false;
        }
        int size = c84b.A01.size();
        for (int i = 0; i < size; i++) {
            AbstractC115485Ki abstractC115485Ki = (AbstractC115485Ki) c84b.A04(i);
            if (abstractC115485Ki != null) {
                c206169Az = abstractC115485Ki.A04();
            } else {
                c206169Az = null;
            }
            if (A01(c206169Az).A00()) {
                return true;
            }
        }
        return false;
    }

    public static final float A00(float f) {
        float f2 = f % 360.0f;
        if (f2 > 180.0f) {
            f2 -= 360.0f;
        } else if (f2 < -180.0f) {
            f2 += 360.0f;
        }
        float rint = ((float) Math.rint(f2 / 90.0f)) * 90.0f;
        if (rint == -180.0f) {
            return 180.0f;
        }
        return rint;
    }

    public static final C206169Az A01(C206169Az c206169Az) {
        if (c206169Az != null) {
            return new C206169Az(2, c206169Az.A02, c206169Az.A01, c206169Az.A00, c206169Az.A03);
        }
        return new C206169Az(0.0f, 0.0f, 15, 0.0f, 2, 0.0f);
    }

    public static final C206169Az A02(C206169Az c206169Az) {
        return new C206169Az(3, c206169Az.A03, c206169Az.A00, c206169Az.A01, c206169Az.A02);
    }

    public static final C206169Az A03(C206169Az c206169Az, C206169Az c206169Az2) {
        C14360o3.A0B(c206169Az, 0);
        float[] fArr = {c206169Az.A00 * 0.5625f, c206169Az.A01};
        Matrix A0Q = AbstractC166987dD.A0Q();
        float f = c206169Az2.A02 - c206169Az.A02;
        A0Q.setRotate(f);
        A0Q.mapPoints(fArr);
        float f2 = c206169Az2.A03;
        return new C206169Az(2, f2 * c206169Az.A03, f, c206169Az2.A00 + ((fArr[0] / 0.5625f) * f2), c206169Az2.A01 + (fArr[1] * f2));
    }
}
