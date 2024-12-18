package X;

import com.google.android.exoplayer2.util.Util;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.HashSet;

/* renamed from: X.4ac, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C97974ac {
    public static final char[] A03 = {'\r', '\n'};
    public static final char[] A04 = {'\n'};
    public static final java.util.Set A05 = new HashSet(AbstractC16960so.A1Q(Arrays.copyOf(new Charset[]{AbstractC50482Ts.A01, AbstractC50482Ts.A05, AbstractC50482Ts.A02, AbstractC50482Ts.A03, AbstractC50482Ts.A04}, 5)));
    public int A00;
    public int A01;
    public byte[] A02;

    public final String A09() {
        int i = this.A00;
        int i2 = this.A01;
        if (i - i2 == 0) {
            return null;
        }
        int i3 = i2;
        while (i3 < i && this.A02[i3] != 0) {
            i3++;
        }
        String str = new String(this.A02, i2, i3 - i2, AbstractC50482Ts.A05);
        this.A01 = i3;
        if (i3 >= this.A00) {
            return str;
        }
        this.A01 = i3 + 1;
        return str;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private char A00(java.nio.charset.Charset r7, char[] r8) {
        /*
            r6 = this;
            java.nio.charset.Charset r0 = X.AbstractC50482Ts.A05
            boolean r0 = r7.equals(r0)
            r5 = 0
            r4 = 2
            r2 = 1
            if (r0 != 0) goto L13
            java.nio.charset.Charset r0 = X.AbstractC50482Ts.A01
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L3c
        L13:
            int r0 = r6.A00
            int r1 = r6.A01
            int r0 = r0 - r1
            if (r0 < r2) goto L3c
            byte[] r0 = r6.A02
            r0 = r0[r1]
            r0 = r0 & 255(0xff, float:3.57E-43)
            long r0 = (long) r0
            char r0 = X.AbstractC131915xR.A00(r0)
            r4 = 1
        L26:
            int r3 = r8.length
            r2 = 0
        L28:
            if (r2 >= r3) goto L7a
            char r1 = r8[r2]
            if (r1 != r0) goto L39
            int r1 = r6.A01
            int r1 = r1 + r4
            r6.A01 = r1
            long r0 = (long) r0
            char r0 = X.AbstractC131915xR.A00(r0)
            return r0
        L39:
            int r2 = r2 + 1
            goto L28
        L3c:
            java.nio.charset.Charset r0 = X.AbstractC50482Ts.A02
            boolean r0 = r7.equals(r0)
            if (r0 != 0) goto L4c
            java.nio.charset.Charset r0 = X.AbstractC50482Ts.A03
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L62
        L4c:
            int r1 = r6.A00
            int r0 = r6.A01
            int r1 = r1 - r0
            if (r1 < r4) goto L62
            byte[] r1 = r6.A02
            r3 = r1[r0]
            int r0 = r0 + 1
            r0 = r1[r0]
        L5b:
            int r1 = r3 << 8
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1 = r1 | r0
            char r0 = (char) r1
            goto L26
        L62:
            java.nio.charset.Charset r0 = X.AbstractC50482Ts.A04
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L7a
            int r0 = r6.A00
            int r2 = r6.A01
            int r0 = r0 - r2
            if (r0 < r4) goto L7a
            byte[] r1 = r6.A02
            int r0 = r2 + 1
            r3 = r1[r0]
            r0 = r1[r2]
            goto L5b
        L7a:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C97974ac.A00(java.nio.charset.Charset, char[]):char");
    }

    public final int A01() {
        byte[] bArr = this.A02;
        int i = this.A01;
        int i2 = i + 1;
        int i3 = i2 + 1;
        int i4 = ((bArr[i] & 255) << 24) | ((bArr[i2] & 255) << 16);
        int i5 = i3 + 1;
        int i6 = i4 | ((bArr[i3] & 255) << 8);
        this.A01 = i5 + 1;
        return (bArr[i5] & 255) | i6;
    }

    public final int A02() {
        byte[] bArr = this.A02;
        int i = this.A01;
        this.A01 = i + 1;
        return bArr[i] & 255;
    }

    public final int A03() {
        byte[] bArr = this.A02;
        int i = this.A01;
        int i2 = i + 1;
        int i3 = i2 + 1;
        int i4 = ((bArr[i] & 255) << 16) | ((bArr[i2] & 255) << 8);
        this.A01 = i3 + 1;
        return (bArr[i3] & 255) | i4;
    }

    public final int A05() {
        byte[] bArr = this.A02;
        int i = this.A01;
        int i2 = i + 1;
        int i3 = (bArr[i] & 255) << 8;
        this.A01 = i2 + 1;
        return (bArr[i2] & 255) | i3;
    }

    public final long A06() {
        byte[] bArr = this.A02;
        long j = ((bArr[r0] & 255) << 56) | ((bArr[r1] & 255) << 48);
        long j2 = j | ((bArr[r6] & 255) << 40);
        long j3 = j2 | ((bArr[r1] & 255) << 32);
        long j4 = j3 | ((bArr[r6] & 255) << 24);
        long j5 = j4 | ((bArr[r1] & 255) << 16);
        long j6 = j5 | ((bArr[r6] & 255) << 8);
        this.A01 = this.A01 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1;
        return (bArr[r1] & 255) | j6;
    }

    public final long A07() {
        byte[] bArr = this.A02;
        long j = ((bArr[r0] & 255) << 24) | ((bArr[r1] & 255) << 16);
        long j2 = j | ((bArr[r6] & 255) << 8);
        this.A01 = this.A01 + 1 + 1 + 1 + 1;
        return (bArr[r1] & 255) | j2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0015, code lost:
    
        if (r5.A02[r1] != 0) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String A0A(int r6) {
        /*
            r5 = this;
            if (r6 != 0) goto L5
            java.lang.String r1 = ""
            return r1
        L5:
            int r4 = r5.A01
            int r0 = r4 + r6
            int r1 = r0 + (-1)
            int r0 = r5.A00
            if (r1 >= r0) goto L17
            byte[] r0 = r5.A02
            r0 = r0[r1]
            int r3 = r6 + (-1)
            if (r0 == 0) goto L18
        L17:
            r3 = r6
        L18:
            byte[] r2 = r5.A02
            java.nio.charset.Charset r0 = X.AbstractC50482Ts.A05
            java.lang.String r1 = new java.lang.String
            r1.<init>(r2, r4, r3, r0)
            int r0 = r5.A01
            int r0 = r0 + r6
            r5.A01 = r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C97974ac.A0A(int):java.lang.String");
    }

    public final String A0B(Charset charset) {
        int i;
        byte b;
        boolean contains = A05.contains(charset);
        StringBuilder sb = new StringBuilder();
        sb.append("Unsupported charset: ");
        sb.append(charset);
        C4B8.A05(contains, sb.toString());
        if (this.A00 - this.A01 == 0) {
            return null;
        }
        Charset charset2 = AbstractC50482Ts.A01;
        if (!charset.equals(charset2)) {
            A0C();
        }
        Charset charset3 = AbstractC50482Ts.A05;
        if (!charset.equals(charset3) && !charset.equals(charset2)) {
            if (!charset.equals(AbstractC50482Ts.A02) && !charset.equals(AbstractC50482Ts.A04) && !charset.equals(AbstractC50482Ts.A03)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Unsupported charset: ");
                sb2.append(charset);
                throw new IllegalArgumentException(sb2.toString());
            }
            i = 2;
        } else {
            i = 1;
        }
        int i2 = this.A01;
        while (true) {
            int i3 = this.A00;
            if (i2 < i3 - (i - 1)) {
                if ((charset.equals(charset3) || charset.equals(charset2)) && ((b = this.A02[i2]) == 10 || b == 13)) {
                    break;
                }
                if (charset.equals(AbstractC50482Ts.A02) || charset.equals(AbstractC50482Ts.A03)) {
                    byte[] bArr = this.A02;
                    if (bArr[i2] == 0) {
                        byte b2 = bArr[i2 + 1];
                        if (b2 == 10) {
                            break;
                        }
                        if (b2 == 13) {
                            break;
                        }
                    }
                }
                if (charset.equals(AbstractC50482Ts.A04)) {
                    byte[] bArr2 = this.A02;
                    if (bArr2[i2 + 1] == 0) {
                        byte b3 = bArr2[i2];
                        if (b3 == 10 || b3 == 13) {
                            break;
                        }
                    } else {
                        continue;
                    }
                }
                i2 += i;
            } else {
                i2 = i3;
                break;
            }
        }
        int i4 = this.A01;
        int i5 = i2 - i4;
        String str = new String(this.A02, i4, i5, charset);
        int i6 = this.A01 + i5;
        this.A01 = i6;
        if (i6 == this.A00 || A00(charset, A03) != '\r') {
            return str;
        }
        A00(charset, A04);
        return str;
    }

    public final Charset A0C() {
        int i = this.A00;
        int i2 = this.A01;
        int i3 = i - i2;
        if (i3 >= 3) {
            byte[] bArr = this.A02;
            if (bArr[i2] == -17 && bArr[i2 + 1] == -69 && bArr[i2 + 2] == -65) {
                this.A01 = i2 + 3;
                return AbstractC50482Ts.A05;
            }
        } else if (i3 < 2) {
            return null;
        }
        byte[] bArr2 = this.A02;
        byte b = bArr2[i2];
        if (b == -2) {
            if (bArr2[i2 + 1] == -1) {
                this.A01 = i2 + 2;
                return AbstractC50482Ts.A03;
            }
            return null;
        }
        if (b == -1 && bArr2[i2 + 1] == -2) {
            this.A01 = i2 + 2;
            return AbstractC50482Ts.A04;
        }
        return null;
    }

    public final short A0D() {
        byte[] bArr = this.A02;
        int i = this.A01;
        int i2 = i + 1;
        int i3 = (bArr[i] & 255) << 8;
        this.A01 = i2 + 1;
        return (short) ((bArr[i2] & 255) | i3);
    }

    public final void A0E(int i) {
        byte[] bArr = this.A02;
        if (bArr.length < i) {
            bArr = new byte[i];
        }
        A0I(bArr, i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0006, code lost:
    
        if (r3 > r2.A02.length) goto L5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0F(int r3) {
        /*
            r2 = this;
            if (r3 < 0) goto L8
            byte[] r0 = r2.A02
            int r1 = r0.length
            r0 = 1
            if (r3 <= r1) goto L9
        L8:
            r0 = 0
        L9:
            X.C4B8.A03(r0)
            r2.A00 = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C97974ac.A0F(int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0005, code lost:
    
        if (r3 > r2.A00) goto L5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0G(int r3) {
        /*
            r2 = this;
            if (r3 < 0) goto L7
            int r1 = r2.A00
            r0 = 1
            if (r3 <= r1) goto L8
        L7:
            r0 = 0
        L8:
            X.C4B8.A03(r0)
            r2.A01 = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C97974ac.A0G(int):void");
    }

    public final void A0H(int i) {
        A0G(this.A01 + i);
    }

    public final void A0I(byte[] bArr, int i) {
        this.A02 = bArr;
        this.A00 = i;
        this.A01 = 0;
    }

    public final void A0J(byte[] bArr, int i, int i2) {
        System.arraycopy(this.A02, this.A01, bArr, i, i2);
        this.A01 += i2;
    }

    public C97974ac(int i) {
        this.A02 = new byte[i];
        this.A00 = i;
    }

    public final int A04() {
        int A01 = A01();
        if (A01 >= 0) {
            return A01;
        }
        throw new IllegalStateException(AnonymousClass001.A0O("Top bit not zero: ", A01));
    }

    public final long A08() {
        long A06 = A06();
        if (A06 >= 0) {
            return A06;
        }
        throw new IllegalStateException(AnonymousClass001.A0Q("Top bit not zero: ", A06));
    }

    public C97974ac(byte[] bArr) {
        this.A02 = bArr;
        this.A00 = bArr.length;
    }

    public C97974ac() {
        this.A02 = Util.A06;
    }
}
