package X;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.RqZ, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC61610RqZ {
    public int A00;
    public C58408Pum A01;

    public final AbstractC58387PuR A0F() {
        C58383PuN c58383PuN = (C58383PuN) this;
        int A0N = c58383PuN.A0N();
        int i = c58383PuN.A00;
        int i2 = c58383PuN.A03;
        if (A0N <= i - i2 && A0N > 0) {
            byte[] bArr = c58383PuN.A07;
            AbstractC58387PuR.A00(i2, i2 + A0N, bArr.length);
            C58386PuQ c58386PuQ = new C58386PuQ(AbstractC58387PuR.A01.AKv(bArr, i2, A0N));
            c58383PuN.A03 += A0N;
            return c58386PuQ;
        }
        if (A0N == 0) {
            return AbstractC58387PuR.A02;
        }
        byte[] A05 = C58383PuN.A05(c58383PuN, A0N);
        if (A05 != null) {
            int length = A05.length;
            AbstractC58387PuR.A00(0, length, length);
            return new C58386PuQ(AbstractC58387PuR.A01.AKv(A05, 0, length));
        }
        int i3 = c58383PuN.A03;
        int i4 = c58383PuN.A00;
        int i5 = i4 - i3;
        c58383PuN.A04 += i4;
        c58383PuN.A03 = 0;
        c58383PuN.A00 = 0;
        ArrayList A00 = C58383PuN.A00(c58383PuN, A0N - i5);
        byte[] bArr2 = new byte[A0N];
        System.arraycopy(c58383PuN.A07, i3, bArr2, 0, i5);
        Iterator it = A00.iterator();
        while (it.hasNext()) {
            i5 = AbstractC58320PtC.A00(bArr2, it, i5);
        }
        return new C58386PuQ(bArr2);
    }

    public final String A0G() {
        String A0n;
        C58383PuN c58383PuN = (C58383PuN) this;
        int A0N = c58383PuN.A0N();
        if (A0N > 0) {
            int i = c58383PuN.A00;
            int i2 = c58383PuN.A03;
            if (A0N <= i - i2) {
                A0n = AbstractC58318PtA.A0n(AbstractC58376PuG.A03, c58383PuN.A07, i2, A0N);
                c58383PuN.A03 += A0N;
                return A0n;
            }
        } else if (A0N == 0) {
            return "";
        }
        if (A0N <= c58383PuN.A00) {
            C58383PuN.A02(c58383PuN, A0N);
            A0n = AbstractC58318PtA.A0n(AbstractC58376PuG.A03, c58383PuN.A07, c58383PuN.A03, A0N);
            c58383PuN.A03 += A0N;
            return A0n;
        }
        return AbstractC58318PtA.A0m(AbstractC58376PuG.A03, C58383PuN.A04(c58383PuN, A0N));
    }

    /* JADX WARN: Code restructure failed: missing block: B:110:0x0199, code lost:
    
        throw X.AbstractC58318PtA.A0H("Protocol message had invalid UTF-8.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x01ad, code lost:
    
        throw X.AbstractC58318PtA.A0H("Protocol message had invalid UTF-8.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00dc, code lost:
    
        throw X.AbstractC58318PtA.A0H("Protocol message had invalid UTF-8.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00ce, code lost:
    
        throw X.AbstractC58318PtA.A0H("Protocol message had invalid UTF-8.");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String A0H() {
        /*
            Method dump skipped, instructions count: 435
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC61610RqZ.A0H():java.lang.String");
    }

    public final int A06() {
        if (this instanceof C58383PuN) {
            return ((C58383PuN) this).A0N();
        }
        return ((C58377PuH) this).A0M();
    }

    public final int A07() {
        if (this instanceof C58383PuN) {
            return ((C58383PuN) this).A0N();
        }
        return ((C58377PuH) this).A0M();
    }

    public final int A08() {
        if (this instanceof C58383PuN) {
            return AbstractC58319PtB.A01(((C58383PuN) this).A0N());
        }
        return AbstractC58319PtB.A01(((C58377PuH) this).A0M());
    }

    public final int A09() {
        if (this instanceof C58383PuN) {
            C58383PuN c58383PuN = (C58383PuN) this;
            if (c58383PuN.A0J()) {
                c58383PuN.A02 = 0;
                return 0;
            }
            int A0N = c58383PuN.A0N();
            c58383PuN.A02 = A0N;
            if ((A0N >>> 3) != 0) {
                return A0N;
            }
            throw AbstractC58318PtA.A0H("Protocol message contained an invalid tag (zero).");
        }
        C58377PuH c58377PuH = (C58377PuH) this;
        if (c58377PuH.A0J()) {
            c58377PuH.A02 = 0;
            return 0;
        }
        int A0M = c58377PuH.A0M();
        c58377PuH.A02 = A0M;
        if ((A0M >>> 3) != 0) {
            return A0M;
        }
        throw AbstractC58318PtA.A0H("Protocol message contained an invalid tag (zero).");
    }

    public final int A0A() {
        if (this instanceof C58383PuN) {
            return ((C58383PuN) this).A0N();
        }
        return ((C58377PuH) this).A0M();
    }

    public final int A0B(int i) {
        if (this instanceof C58383PuN) {
            C58383PuN c58383PuN = (C58383PuN) this;
            if (i >= 0) {
                int i2 = i + c58383PuN.A04 + c58383PuN.A03;
                int i3 = c58383PuN.A01;
                if (i2 <= i3) {
                    c58383PuN.A01 = i2;
                    C58383PuN.A01(c58383PuN);
                    return i3;
                }
                throw AbstractC58321PtD.A0P();
            }
            throw AbstractC58318PtA.A0H("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        C58377PuH c58377PuH = (C58377PuH) this;
        if (i >= 0) {
            int i4 = i + c58377PuH.A04;
            int i5 = c58377PuH.A01;
            if (i4 <= i5) {
                c58377PuH.A01 = i4;
                int i6 = c58377PuH.A03 + c58377PuH.A00;
                c58377PuH.A03 = i6;
                if (i6 > i4) {
                    int i7 = i6 - i4;
                    c58377PuH.A00 = i7;
                    c58377PuH.A03 = i6 - i7;
                    return i5;
                }
                c58377PuH.A00 = 0;
                return i5;
            }
            throw AbstractC58321PtD.A0P();
        }
        throw AbstractC58318PtA.A0H("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public final long A0C() {
        if (this instanceof C58383PuN) {
            return ((C58383PuN) this).A0P();
        }
        return ((C58377PuH) this).A0N();
    }

    public final long A0D() {
        if (this instanceof C58383PuN) {
            return AbstractC58320PtC.A07(((C58383PuN) this).A0P());
        }
        return AbstractC58320PtC.A07(((C58377PuH) this).A0N());
    }

    public final long A0E() {
        if (this instanceof C58383PuN) {
            return ((C58383PuN) this).A0P();
        }
        return ((C58377PuH) this).A0N();
    }

    public final void A0I(int i) {
        if (this instanceof C58383PuN) {
            if (((C58383PuN) this).A02 != i) {
                throw AbstractC58318PtA.A0H("Protocol message end-group tag did not match expected tag.");
            }
        } else if (((C58377PuH) this).A02 != i) {
            throw AbstractC58318PtA.A0H("Protocol message end-group tag did not match expected tag.");
        }
    }

    public final boolean A0J() {
        if (this instanceof C58383PuN) {
            C58383PuN c58383PuN = (C58383PuN) this;
            if (c58383PuN.A03 == c58383PuN.A00 && !C58383PuN.A03(c58383PuN, 1)) {
                return true;
            }
            return false;
        }
        C58377PuH c58377PuH = (C58377PuH) this;
        return AbstractC167007dF.A1P(c58377PuH.A04, c58377PuH.A03);
    }

    public final boolean A0K() {
        if (this instanceof C58383PuN) {
            return AbstractC167007dF.A1M((((C58383PuN) this).A0P() > 0L ? 1 : (((C58383PuN) this).A0P() == 0L ? 0 : -1)));
        }
        return AbstractC167007dF.A1M((((C58377PuH) this).A0N() > 0L ? 1 : (((C58377PuH) this).A0N() == 0L ? 0 : -1)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x00f7, code lost:
    
        if (r0[r1] >= 0) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x00f9, code lost:
    
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x00fb, code lost:
    
        if (r3 < 10) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0103, code lost:
    
        throw X.AbstractC58318PtA.A0H("CodedInputStream encountered a malformed varint.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0110, code lost:
    
        throw X.AbstractC58321PtD.A0P();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0042, code lost:
    
        if ((r0 - r2) >= 10) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0044, code lost:
    
        r2 = r5.A07;
        r0 = r1;
        r1 = r1 + 1;
        r5.A03 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x004d, code lost:
    
        if (r2[r0] >= 0) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x004f, code lost:
    
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0051, code lost:
    
        if (r3 < 10) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0059, code lost:
    
        throw X.AbstractC58318PtA.A0H("CodedInputStream encountered a malformed varint.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x005c, code lost:
    
        if (r2 != r5.A00) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x005e, code lost:
    
        X.C58383PuN.A02(r5, 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0061, code lost:
    
        r1 = r5.A07;
        r0 = r5.A03;
        r2 = r0 + 1;
        r5.A03 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x006b, code lost:
    
        if (r1[r0] >= 0) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x006d, code lost:
    
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x006f, code lost:
    
        if (r3 < 10) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0077, code lost:
    
        throw X.AbstractC58318PtA.A0H("CodedInputStream encountered a malformed varint.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x00d4, code lost:
    
        if ((r5 - r2) >= 10) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x00d6, code lost:
    
        r2 = r6.A05;
        r0 = r1;
        r1 = r1 + 1;
        r6.A04 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x00df, code lost:
    
        if (r2[r0] >= 0) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x00e1, code lost:
    
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x00e3, code lost:
    
        if (r3 < 10) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x00eb, code lost:
    
        throw X.AbstractC58318PtA.A0H("CodedInputStream encountered a malformed varint.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x00ec, code lost:
    
        r1 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x00ed, code lost:
    
        if (r2 == r5) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x00ef, code lost:
    
        r0 = r6.A05;
        r2 = r2 + 1;
        r6.A04 = r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A0L(int r9) {
        /*
            Method dump skipped, instructions count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC61610RqZ.A0L(int):boolean");
    }
}
