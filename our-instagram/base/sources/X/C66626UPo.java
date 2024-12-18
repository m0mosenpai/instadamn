package X;

/* renamed from: X.UPo, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66626UPo extends C0T6 {
    public final float A00;
    public final float A01;
    public final int A02;
    public final int A03;
    public final boolean A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C66626UPo) {
                C66626UPo c66626UPo = (C66626UPo) obj;
                if (this.A03 != c66626UPo.A03 || this.A02 != c66626UPo.A02 || Float.compare(this.A01, c66626UPo.A01) != 0) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((this.A03 * 31) + this.A02) * 31) + Float.floatToIntBits(this.A01);
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0011, code lost:
    
        if (r5 <= 0.0f) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C66626UPo(int r3, int r4, float r5) {
        /*
            r2 = this;
            r2.<init>()
            r2.A03 = r3
            r2.A02 = r4
            r2.A01 = r5
            if (r3 <= 0) goto L13
            if (r4 <= 0) goto L13
            r0 = 0
            int r1 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            r0 = 1
            if (r1 > 0) goto L14
        L13:
            r0 = 0
        L14:
            r2.A04 = r0
            if (r0 != 0) goto L1d
            r1 = 1065353216(0x3f800000, float:1.0)
        L1a:
            r2.A00 = r1
            return
        L1d:
            float r1 = (float) r3
            float r1 = r1 * r5
            float r0 = (float) r4
            float r1 = r1 / r0
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66626UPo.<init>(int, int, float):void");
    }

    public C66626UPo() {
        this(0, 0, 0.0f);
    }
}
