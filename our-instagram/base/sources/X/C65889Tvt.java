package X;

import java.util.Comparator;
import java.util.List;

/* renamed from: X.Tvt, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C65889Tvt {
    public static final Comparator A05 = new C65903Tw9(2);
    public final List A00;
    public final float[] A01 = new float[3];
    public final int[] A02;
    public final int[] A03;
    public final InterfaceC71841X6z[] A04;

    public static void A00(int[] iArr, int i, int i2, int i3) {
        if (i != -2) {
            if (i != -1) {
                return;
            }
            while (i2 <= i3) {
                int i4 = iArr[i2];
                iArr[i2] = ((i4 >> 10) & 31) | ((i4 & 31) << 10) | (((i4 >> 5) & 31) << 5);
                i2++;
            }
            return;
        }
        while (i2 <= i3) {
            int i5 = iArr[i2];
            iArr[i2] = (i5 & 31) | (((i5 >> 5) & 31) << 10) | (((i5 >> 10) & 31) << 5);
            i2++;
        }
    }

    private boolean A01(float[] fArr) {
        int length;
        InterfaceC71841X6z[] interfaceC71841X6zArr = this.A04;
        if (interfaceC71841X6zArr == null || (length = interfaceC71841X6zArr.length) <= 0) {
            return false;
        }
        int i = 0;
        do {
            float f = fArr[2];
            if (f < 0.95f && f > 0.05f) {
                float f2 = fArr[0];
                if (f2 < 10.0f || f2 > 37.0f || fArr[1] > 0.82f) {
                    i++;
                }
            }
            return true;
        } while (i < length);
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x0141, code lost:
    
        if (r6 < r1) goto L49;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C65889Tvt(int[] r15, X.InterfaceC71841X6z[] r16, int r17) {
        /*
            Method dump skipped, instructions count: 447
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65889Tvt.<init>(int[], X.X6z[], int):void");
    }
}
