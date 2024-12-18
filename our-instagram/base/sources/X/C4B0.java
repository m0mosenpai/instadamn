package X;

/* renamed from: X.4B0, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4B0 {
    public int A00;
    public final long A01;
    public final long A02;
    public final String A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C4B0 c4b0 = (C4B0) obj;
            if (this.A02 != c4b0.A02 || this.A01 != c4b0.A01 || !this.A03.equals(c4b0.A03)) {
                return false;
            }
        }
        return true;
    }

    public final android.net.Uri A00(String str) {
        return android.net.Uri.parse(AbstractC92174Ax.A00(str, this.A03));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C4B0 A01(X.C4B0 r16, java.lang.String r17) {
        /*
            r15 = this;
            java.lang.String r0 = r15.A03
            r1 = r17
            java.lang.String r10 = X.AbstractC92174Ax.A00(r1, r0)
            r9 = 0
            r5 = r16
            if (r16 == 0) goto L38
            java.lang.String r0 = r5.A03
            java.lang.String r0 = X.AbstractC92174Ax.A00(r1, r0)
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L38
            long r2 = r15.A01
            r13 = -1
            int r0 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
            if (r0 == 0) goto L39
            long r11 = r15.A02
            long r6 = r11 + r2
            long r0 = r5.A02
            int r4 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r4 != 0) goto L39
            long r0 = r5.A01
            int r4 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
        L2f:
            if (r4 == 0) goto L33
            long r2 = r2 + r0
            r13 = r2
        L33:
            X.4B0 r9 = new X.4B0
            r9.<init>(r10, r11, r13)
        L38:
            return r9
        L39:
            long r0 = r5.A01
            int r4 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r4 == 0) goto L38
            long r11 = r5.A02
            long r7 = r11 + r0
            long r4 = r15.A02
            int r6 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r6 != 0) goto L38
            int r4 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
            goto L2f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4B0.A01(X.4B0, java.lang.String):X.4B0");
    }

    public final int hashCode() {
        int i = this.A00;
        if (i == 0) {
            int hashCode = ((((527 + ((int) this.A02)) * 31) + ((int) this.A01)) * 31) + this.A03.hashCode();
            this.A00 = hashCode;
            return hashCode;
        }
        return i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("RangedUri(referenceUri=");
        sb.append(this.A03);
        sb.append(", start=");
        sb.append(this.A02);
        sb.append(MSV.A00(291));
        sb.append(this.A01);
        sb.append(")");
        return sb.toString();
    }

    public C4B0(String str, long j, long j2) {
        this.A03 = str == null ? "" : str;
        this.A02 = j;
        this.A01 = j2;
    }
}
