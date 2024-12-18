package X;

/* renamed from: X.9B9, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9B9 extends C0T6 {
    public int A00;
    public int A01;
    public final int A02;
    public final int A03;
    public final boolean A04;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C9B9(int r8, int r9, int r10) {
        /*
            r7 = this;
            r3 = r9
            r4 = r8
            r2 = 0
            r1 = r7
            r7.A02 = r2
            r0 = r10 & 1
            if (r0 == 0) goto Lb
            r4 = 0
        Lb:
            r0 = r10 & 2
            if (r0 == 0) goto L10
            r3 = 0
        L10:
            r5 = r2
            r6 = r2
            r1.<init>(r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9B9.<init>(int, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x000b, code lost:
    
        if (r6.A03 < r8) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C9B9 A00(int r7, int r8) {
        /*
            r6 = this;
            boolean r0 = r6.A04
            if (r0 == 0) goto Ld
            int r0 = r6.A00
            if (r0 < r7) goto Ld
            int r0 = r6.A03
            r1 = 1
            if (r0 >= r8) goto Le
        Ld:
            r1 = 0
        Le:
            int r0 = r6.A00
            int r2 = java.lang.Math.max(r0, r7)
            int r0 = r6.A03
            int r4 = java.lang.Math.max(r0, r8)
            int r3 = r6.A01
            r5 = 0
            X.9B9 r0 = new X.9B9
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9B9.A00(int, int):X.9B9");
    }

    public final boolean equals(Object obj) {
        if (1 - this.A02 != 0) {
            return super.equals(obj);
        }
        if (this != obj) {
            if (obj instanceof C9B9) {
                C9B9 c9b9 = (C9B9) obj;
                if (c9b9.A02 != 1 || this.A00 != c9b9.A00 || this.A01 != c9b9.A01 || this.A03 != c9b9.A03 || this.A04 != c9b9.A04) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        if (1 - this.A02 != 0) {
            return super.hashCode();
        }
        int i = ((((this.A00 * 31) + this.A01) * 31) + this.A03) * 31;
        int i2 = 1237;
        if (this.A04) {
            i2 = 1231;
        }
        return i + i2;
    }

    public C9B9(boolean z, int i, int i2, int i3, int i4) {
        this.A02 = i4;
        this.A00 = i;
        this.A01 = i2;
        this.A03 = i3;
        this.A04 = z;
    }
}
