package X;

import java.util.Arrays;

/* renamed from: X.2WG, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2WG implements C2VB {
    public static final int A03 = AbstractC77773e1.A00.size();
    public long A00 = -1;
    public boolean A01;
    public float[] A02;

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0023, code lost:
    
        if (r10 == X.EnumC77763e0.BOTTOM) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0035, code lost:
    
        if (r3 == 15) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final float A02(X.EnumC77763e0 r10) {
        /*
            r9 = this;
            r8 = 0
            long r1 = r9.A00
            r3 = -1
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 == 0) goto L3e
            int r0 = r10.A00
            int r0 = r0 * 4
            long r3 = r1 >> r0
            r6 = 15
            long r3 = r3 & r6
            int r0 = (int) r3
            byte r3 = (byte) r0
            r5 = 15
            if (r3 != r5) goto L37
            boolean r0 = r9.A01
            if (r0 == 0) goto L3e
            X.3e0 r0 = X.EnumC77763e0.TOP
            if (r10 == r0) goto L25
            X.3e0 r3 = X.EnumC77763e0.BOTTOM
            r0 = 6
            if (r10 != r3) goto L26
        L25:
            r0 = 7
        L26:
            int r0 = r0 * 4
            long r3 = r1 >> r0
            long r3 = r3 & r6
            int r0 = (int) r3
            byte r3 = (byte) r0
            if (r3 != r5) goto L37
            r0 = 32
            long r1 = r1 >> r0
            long r1 = r1 & r6
            int r0 = (int) r1
            byte r3 = (byte) r0
            if (r3 == r5) goto L3e
        L37:
            float[] r0 = A00(r9)
            r0 = r0[r3]
            return r0
        L3e:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2WG.A02(X.3e0):float");
    }

    public static final float[] A00(C2WG c2wg) {
        float[] fArr = c2wg.A02;
        if (fArr != null) {
            return fArr;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final float A01(int i) {
        byte b = (byte) ((this.A00 >> (i * 4)) & 15);
        if (b == 15) {
            return Float.NaN;
        }
        return A00(this)[b];
    }

    public final void A03(EnumC77763e0 enumC77763e0, float f) {
        float[] A00;
        float f2;
        int i = enumC77763e0.A00;
        float A01 = A01(i);
        boolean isNaN = Float.isNaN(A01);
        boolean isNaN2 = Float.isNaN(f);
        if (!isNaN) {
            if (!isNaN2 && Math.abs(f - A01) < 1.0E-5f) {
                return;
            }
        } else if (isNaN2) {
            return;
        }
        boolean z = false;
        long j = this.A00;
        int i2 = i * 4;
        byte b = (byte) ((j >> i2) & 15);
        if (C3e2.A00(f)) {
            long j2 = (15 << i2) | j;
            this.A00 = j2;
            j = j2;
            A00 = A00(this);
            f = Float.NaN;
        } else {
            if (b == 15) {
                b = 0;
                if (this.A02 == null) {
                    this.A02 = new float[]{Float.NaN, Float.NaN};
                } else {
                    float[] A002 = A00(this);
                    int length = A002.length;
                    int i3 = 0;
                    while (true) {
                        if (i3 < length) {
                            if (C3e2.A00(A002[i3])) {
                                b = (byte) i3;
                                break;
                            }
                            i3++;
                        } else {
                            int min = Math.min(length * 2, A03);
                            float[] fArr = new float[min];
                            for (int i4 = 0; i4 < min; i4++) {
                                if (i4 >= 0 && i4 < length) {
                                    f2 = A002[i4];
                                } else {
                                    f2 = Float.NaN;
                                }
                                fArr[i4] = f2;
                            }
                            this.A02 = fArr;
                            b = (byte) length;
                        }
                    }
                }
                if (b < A03) {
                    long j3 = (((15 << i2) ^ (-1)) & this.A00) | (b << i2);
                    this.A00 = j3;
                    j = j3;
                } else {
                    throw new IllegalStateException("The newIndex for the array cannot be bigger than the amount of Yoga Edges.");
                }
            }
            A00 = A00(this);
        }
        A00[b] = f;
        if (((((int) (j >> 24)) ^ (-1)) & 4095) != 0) {
            z = true;
        }
        this.A01 = z;
    }

    @Override // X.C2VB
    public final /* bridge */ /* synthetic */ boolean CTz(Object obj) {
        C2WG c2wg = (C2WG) obj;
        if (this == c2wg || (c2wg != null && this.A00 == c2wg.A00 && this.A01 == c2wg.A01 && Arrays.equals(this.A02, c2wg.A02))) {
            return true;
        }
        return false;
    }
}
