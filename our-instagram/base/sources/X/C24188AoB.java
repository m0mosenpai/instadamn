package X;

import android.graphics.Bitmap;

/* renamed from: X.AoB, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C24188AoB implements InterfaceC58173Pqd {
    public Bitmap A00;
    public long A02;
    public final long A05;
    public long A03 = -1;
    public boolean A04 = true;
    public long A01 = -2147483648L;

    /* JADX WARN: Code restructure failed: missing block: B:18:0x007b, code lost:
    
        if ((X.AbstractC166987dD.A0N(r13.get(r9)) - r5) < (r5 - X.AbstractC166987dD.A0N(r13.get(r10)))) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    @Override // X.InterfaceC58173Pqd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Long AVb(java.util.List r13) {
        /*
            r12 = this;
            r1 = 0
            X.C14360o3.A0B(r13, r1)
            boolean r0 = r13.isEmpty()
            r11 = 0
            if (r0 != 0) goto L56
            long r5 = r12.A05
            r10 = 0
            java.lang.Object r0 = r13.get(r1)
            long r1 = X.AbstractC166987dD.A0N(r0)
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 <= 0) goto L7e
            int r0 = r13.size()
            int r0 = r0 + (-1)
            java.lang.Object r0 = r13.get(r0)
            long r1 = X.AbstractC166987dD.A0N(r0)
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 < 0) goto L57
            int r0 = r13.size()
            int r9 = r0 + (-1)
        L32:
            java.lang.Object r0 = r13.get(r9)
        L36:
            long r3 = X.AbstractC166987dD.A0N(r0)
            long r0 = r3 - r5
            long r6 = java.lang.Math.abs(r0)
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.MICROSECONDS
            r1 = 250(0xfa, double:1.235E-321)
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r1 = r5.convert(r1, r0)
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 > 0) goto L56
            r12.A03 = r3
            r12.A02 = r3
            java.lang.Long r11 = java.lang.Long.valueOf(r3)
        L56:
            return r11
        L57:
            java.lang.Long r0 = java.lang.Long.valueOf(r5)
            int r9 = java.util.Collections.binarySearch(r13, r0)
            if (r9 >= 0) goto L32
            int r0 = -r9
            int r9 = r0 + (-1)
            java.lang.Object r0 = r13.get(r9)
            long r7 = X.AbstractC166987dD.A0N(r0)
            long r7 = r7 - r5
            int r10 = r9 + (-1)
            java.lang.Object r0 = r13.get(r10)
            long r3 = X.AbstractC166987dD.A0N(r0)
            long r1 = r5 - r3
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 >= 0) goto L7e
            goto L32
        L7e:
            java.lang.Object r0 = r13.get(r10)
            goto L36
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C24188AoB.AVb(java.util.List):java.lang.Long");
    }

    @Override // X.InterfaceC58173Pqd
    public final boolean Ehv(int i, long j) {
        return this.A01 == j + this.A02;
    }

    @Override // X.InterfaceC58173Pqd
    public final boolean Cs9() {
        return this.A04;
    }

    @Override // X.InterfaceC58173Pqd
    public final void CzY(long j, int i, Bitmap bitmap) {
        this.A00 = bitmap;
        this.A01 = j + this.A02;
    }

    @Override // X.InterfaceC58173Pqd
    public final void DMF(long j) {
        long j2 = j + this.A02;
        if (this.A03 == j2) {
            this.A01 = j2;
        } else {
            long j3 = this.A05;
            if (Math.abs(j3 - j2) < Math.abs(this.A01 - j3)) {
                this.A01 = j2;
                return;
            }
        }
        this.A04 = false;
    }

    public C24188AoB(long j, long j2) {
        this.A02 = j;
        this.A05 = j2;
    }
}
