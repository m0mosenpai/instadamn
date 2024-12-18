package X;

import android.view.View;

/* renamed from: X.3sO, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC85943sO {
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0110, code lost:
    
        if (r8 > r2) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x011f, code lost:
    
        if (r8 > r2) goto L51;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v22, types: [X.0sl] */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v24, types: [java.util.AbstractCollection] */
    /* JADX WARN: Type inference failed for: r0v25, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A01(X.C2Vj r12, float r13, int r14, int r15) {
        /*
            Method dump skipped, instructions count: 314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC85943sO.A01(X.2Vj, float, int, int):void");
    }

    public static final int A00(int i) {
        int mode = View.MeasureSpec.getMode(i);
        int i2 = Integer.MIN_VALUE;
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                i2 = AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO;
                if (mode != 1073741824) {
                    throw new IllegalStateException("Unexpected size spec mode");
                }
            } else {
                return View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 0);
            }
        }
        return View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), i2);
    }
}
