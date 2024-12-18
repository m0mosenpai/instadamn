package X;

import java.util.Arrays;

/* renamed from: X.SYd, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62935SYd {
    public final int A00;
    public final short A01;
    public final String[] A02;

    /* JADX WARN: Code restructure failed: missing block: B:22:0x005f, code lost:
    
        return new X.C62935SYd(X.AbstractC58319PtB.A1b(r4, r4.size()), r2 - r9, r3);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C62935SYd A00(byte[] r8, int r9) {
        /*
            int r7 = r8.length
            r0 = 1
            if (r7 < r0) goto L60
            java.util.ArrayList r4 = X.AbstractC166987dD.A1E()
            java.lang.StringBuilder r6 = X.AbstractC166987dD.A1C()
            r5 = r9
        Ld:
            r0 = r8[r5]
            r3 = 0
            if (r0 == 0) goto L4f
            r1 = r0 & 192(0xc0, float:2.69E-43)
            r0 = r0 & 63
            if (r1 != 0) goto L3d
            byte r2 = (byte) r0
            int r1 = r5 + 1
            int r5 = r1 + r2
            int r0 = r5 + 1
            if (r7 < r0) goto L36
            r6.setLength(r3)
        L24:
            if (r3 >= r2) goto L32
            int r0 = r1 + r3
            r0 = r8[r0]
            char r0 = (char) r0
            r6.append(r0)
            int r0 = r3 + 1
            byte r3 = (byte) r0
            goto L24
        L32:
            X.AbstractC166997dE.A1S(r6, r4)
            goto Ld
        L36:
            java.lang.String r0 = "bytes is incomplete"
            java.lang.IllegalArgumentException r0 = X.AbstractC166987dD.A12(r0)
            throw r0
        L3d:
            byte r1 = (byte) r0
            int r0 = r5 + 1
            r2 = r8[r0]
            int r1 = r1 << 8
            r0 = 65280(0xff00, float:9.1477E-41)
            r1 = r1 & r0
            r0 = r2 & 255(0xff, float:3.57E-43)
            r1 = r1 | r0
            short r3 = (short) r1
            int r2 = r5 + 2
            goto L51
        L4f:
            int r2 = r5 + 1
        L51:
            int r0 = r4.size()
            java.lang.String[] r1 = X.AbstractC58319PtB.A1b(r4, r0)
            int r2 = r2 - r9
            X.SYd r0 = new X.SYd
            r0.<init>(r1, r2, r3)
            return r0
        L60:
            java.lang.String r0 = "insufficient data"
            java.lang.IllegalArgumentException r0 = X.AbstractC166987dD.A12(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C62935SYd.A00(byte[], int):X.SYd");
    }

    public C62935SYd(String[] strArr, int i, short s) {
        this.A02 = strArr;
        this.A01 = s;
        this.A00 = i;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("DnsQname{qname=");
        A1C.append(Arrays.toString(this.A02));
        A1C.append(", pointer=");
        A1C.append((int) this.A01);
        A1C.append(", numberOfBytes=");
        A1C.append(this.A00);
        return AbstractC167027dH.A0R(A1C);
    }
}
