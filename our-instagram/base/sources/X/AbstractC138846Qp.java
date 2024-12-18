package X;

import android.graphics.Matrix;
import android.graphics.Rect;

/* renamed from: X.6Qp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC138846Qp {
    public static final C138856Qq[] A05;
    public static final C138856Qq[] A06;
    public static final Rect A01 = new Rect();
    public static final Matrix A00 = new Matrix();
    public static final Matrix A03 = new Matrix();
    public static final float[] A02 = new float[8];
    public static final float[] A04 = new float[2];

    public static void A01(Rect rect, InterfaceC84833qX interfaceC84833qX, float f, int i, int i2) {
        A02(rect, interfaceC84833qX, f, i, i2, 0);
    }

    public static void A02(Rect rect, InterfaceC84833qX interfaceC84833qX, float f, int i, int i2, int i3) {
        float f2 = i;
        float f3 = f2 / f;
        int round = Math.round(interfaceC84833qX.CHe() * f2);
        int round2 = Math.round(interfaceC84833qX.BDQ() * f3);
        int round3 = Math.round(interfaceC84833qX.CI0() * f2);
        int round4 = Math.round((interfaceC84833qX.CIZ() * f3) + ((i2 - f3) / 2.0f));
        int round5 = Math.round((-round) / 2.0f) + i3;
        int round6 = Math.round((-round2) / 2.0f);
        rect.set(round5, round6, round + round5, round2 + round6);
        rect.offset(round3, round4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        C138856Qq[] c138856QqArr = new C138856Qq[4];
        A05 = c138856QqArr;
        C138856Qq[] c138856QqArr2 = new C138856Qq[4];
        A06 = c138856QqArr2;
        int i = 0;
        do {
            c138856QqArr[i] = new Object();
            c138856QqArr2[i] = new Object();
            i++;
        } while (i < 4);
    }

    public static boolean A03(InterfaceC84833qX interfaceC84833qX, float f, float f2) {
        float[] fArr = A04;
        fArr[0] = f;
        fArr[1] = f2;
        Matrix matrix = A00;
        matrix.reset();
        Matrix matrix2 = A03;
        matrix2.reset();
        float BpY = interfaceC84833qX.BpY() * 360.0f;
        Rect rect = A01;
        matrix.setRotate(BpY, rect.exactCenterX(), rect.exactCenterY());
        matrix.invert(matrix2);
        matrix2.mapPoints(fArr);
        return rect.contains(Math.round(fArr[0]), Math.round(fArr[1]));
    }

    public static void A00(Rect rect, InterfaceC84833qX interfaceC84833qX, float f, int i, int i2) {
        A01(rect, interfaceC84833qX, f, i, i2);
        float BpY = interfaceC84833qX.BpY();
        float[] fArr = A02;
        float f2 = rect.left;
        fArr[0] = f2;
        float f3 = rect.top;
        fArr[1] = f3;
        float f4 = rect.right;
        fArr[2] = f4;
        fArr[3] = f3;
        fArr[4] = f4;
        float f5 = rect.bottom;
        fArr[5] = f5;
        fArr[6] = f2;
        fArr[7] = f5;
        Matrix matrix = A00;
        matrix.reset();
        matrix.setRotate(BpY * 360.0f, rect.exactCenterX(), rect.exactCenterY());
        matrix.mapPoints(fArr);
        int round = Math.round(fArr[0]);
        int round2 = Math.round(fArr[1]);
        rect.set(round, round2, round, round2);
        int i3 = 2;
        while (true) {
            int i4 = i3 + 1;
            if (i4 < 8) {
                rect.union(Math.round(fArr[i3]), Math.round(fArr[i4]));
                i3 += 2;
            } else {
                return;
            }
        }
    }
}
