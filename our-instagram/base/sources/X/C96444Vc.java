package X;

/* renamed from: X.4Vc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C96444Vc extends C0T6 {
    public final int A00;
    public final int A01;
    public final boolean A02;
    public final boolean A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C96444Vc) {
                C96444Vc c96444Vc = (C96444Vc) obj;
                if (this.A01 != c96444Vc.A01 || this.A00 != c96444Vc.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.A01 * 31) + this.A00;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000b, code lost:
    
        if (r4 <= 0) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C96444Vc(int r3, int r4) {
        /*
            r2 = this;
            r2.<init>()
            r2.A01 = r3
            r2.A00 = r4
            r1 = 1
            if (r3 <= 0) goto Ld
            r0 = 1
            if (r4 > 0) goto Le
        Ld:
            r0 = 0
        Le:
            r2.A03 = r0
            if (r3 <= 0) goto L19
            if (r4 <= 0) goto L19
            if (r3 <= r4) goto L19
        L16:
            r2.A02 = r1
            return
        L19:
            r1 = 0
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C96444Vc.<init>(int, int):void");
    }
}
