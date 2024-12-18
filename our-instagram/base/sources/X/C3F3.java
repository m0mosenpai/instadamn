package X;

import java.util.Arrays;

/* renamed from: X.3F3, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3F3 implements C3F4 {
    public int A00;
    public int A01;
    public int A02;
    public int[] A03;

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0039, code lost:
    
        if (r0 != false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A00(androidx.recyclerview.widget.RecyclerView r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 480
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3F3.A00(androidx.recyclerview.widget.RecyclerView, boolean):void");
    }

    @Override // X.C3F4
    public final void A9v(int i, int i2) {
        if (i >= 0) {
            if (i2 >= 0) {
                int i3 = this.A00 * 2;
                int[] iArr = this.A03;
                if (iArr == null) {
                    int[] iArr2 = new int[4];
                    this.A03 = iArr2;
                    Arrays.fill(iArr2, -1);
                } else if (i3 >= iArr.length) {
                    int[] iArr3 = new int[i3 * 2];
                    this.A03 = iArr3;
                    System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                }
                int[] iArr4 = this.A03;
                iArr4[i3] = i;
                iArr4[i3 + 1] = i2;
                this.A00++;
                return;
            }
            throw new IllegalArgumentException("Pixel distance must be non-negative");
        }
        throw new IllegalArgumentException("Layout positions must be non-negative");
    }
}
