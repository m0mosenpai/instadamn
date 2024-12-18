package X;

import androidx.media3.common.util.Util;
import com.google.common.collect.ImmutableSet;
import java.nio.charset.Charset;
import java.util.Arrays;

/* loaded from: classes11.dex */
public final class WFa {
    public int A00;
    public int A01;
    public byte[] A02;
    public static final char[] A04 = {'\r', '\n'};
    public static final char[] A05 = {'\n'};
    public static final ImmutableSet A03 = ImmutableSet.A05(new Object[]{AbstractC50482Ts.A01, AbstractC50482Ts.A05, AbstractC50482Ts.A02, AbstractC50482Ts.A03, AbstractC50482Ts.A04}, 5);

    public final String A0F() {
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

    public static int A00(WFa wFa, Charset charset) {
        byte A00;
        byte b;
        byte b2;
        int i = 2;
        if (charset.equals(AbstractC50482Ts.A05) || charset.equals(AbstractC50482Ts.A01)) {
            if (wFa.A00 - wFa.A01 >= 1) {
                A00 = (byte) AbstractC131915xR.A00(wFa.A02[r1] & 255);
                i = 1;
                return (AbstractC131915xR.A00(A00) << 16) + i;
            }
        }
        if (charset.equals(AbstractC50482Ts.A02) || charset.equals(AbstractC50482Ts.A03)) {
            int i2 = wFa.A00;
            int i3 = wFa.A01;
            if (i2 - i3 >= 2) {
                byte[] bArr = wFa.A02;
                b = bArr[i3];
                b2 = bArr[i3 + 1];
                A00 = (byte) ((char) ((b << 8) | (b2 & 255)));
                return (AbstractC131915xR.A00(A00) << 16) + i;
            }
        }
        if (charset.equals(AbstractC50482Ts.A04)) {
            int i4 = wFa.A00;
            int i5 = wFa.A01;
            if (i4 - i5 >= 2) {
                byte[] bArr2 = wFa.A02;
                b = bArr2[i5 + 1];
                b2 = bArr2[i5];
                A00 = (byte) ((char) ((b << 8) | (b2 & 255)));
                return (AbstractC131915xR.A00(A00) << 16) + i;
            }
            return 0;
        }
        return 0;
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
        int i2 = i + 1;
        int i3 = i2 + 1;
        int i4 = (bArr[i] & 255) | ((bArr[i2] & 255) << 8);
        int i5 = i3 + 1;
        int i6 = i4 | ((bArr[i3] & 255) << 16);
        this.A01 = i5 + 1;
        return ((bArr[i5] & 255) << 24) | i6;
    }

    public final int A03() {
        byte[] bArr = this.A02;
        int i = this.A01;
        int i2 = i + 1;
        int i3 = bArr[i] & 255;
        this.A01 = i2 + 1;
        return ((bArr[i2] & 255) << 8) | i3;
    }

    public final int A05() {
        byte[] bArr = this.A02;
        int i = this.A01;
        this.A01 = i + 1;
        return bArr[i] & 255;
    }

    public final int A06() {
        byte[] bArr = this.A02;
        int i = this.A01;
        int i2 = i + 1;
        int i3 = i2 + 1;
        int i4 = ((bArr[i] & 255) << 16) | ((bArr[i2] & 255) << 8);
        this.A01 = i3 + 1;
        return (bArr[i3] & 255) | i4;
    }

    public final int A08() {
        byte[] bArr = this.A02;
        int i = this.A01;
        int i2 = i + 1;
        int i3 = (bArr[i] & 255) << 8;
        this.A01 = i2 + 1;
        return (bArr[i2] & 255) | i3;
    }

    public final long A09() {
        byte[] bArr = this.A02;
        long j = (bArr[r0] & 255) | ((bArr[r1] & 255) << 8) | ((bArr[r6] & 255) << 16);
        long j2 = j | ((bArr[r5] & 255) << 24);
        long j3 = j2 | ((bArr[r6] & 255) << 32);
        long j4 = j3 | ((bArr[r5] & 255) << 40);
        long j5 = j4 | ((bArr[r6] & 255) << 48);
        this.A01 = this.A01 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1;
        return ((bArr[r5] & 255) << 56) | j5;
    }

    public final long A0A() {
        byte[] bArr = this.A02;
        long j = (bArr[r0] & 255) | ((bArr[r1] & 255) << 8) | ((bArr[r6] & 255) << 16);
        this.A01 = this.A01 + 1 + 1 + 1 + 1;
        return ((bArr[r5] & 255) << 24) | j;
    }

    public final long A0B() {
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

    public final long A0C() {
        byte[] bArr = this.A02;
        long j = ((bArr[r0] & 255) << 24) | ((bArr[r1] & 255) << 16);
        long j2 = j | ((bArr[r6] & 255) << 8);
        this.A01 = this.A01 + 1 + 1 + 1 + 1;
        return (bArr[r1] & 255) | j2;
    }

    public final long A0E() {
        int i;
        byte[] bArr = this.A02;
        int i2 = this.A01;
        long j = bArr[i2];
        int i3 = 7;
        while (true) {
            if (i3 < 0) {
                break;
            }
            if (((1 << i3) & j) != 0) {
                i3--;
            } else if (i3 < 6) {
                j &= r13 - 1;
                i = 7 - i3;
                if (i != 0) {
                    for (int i4 = 1; i4 < i; i4++) {
                        if ((bArr[i2 + i4] & 192) == 128) {
                            j = (j << 6) | (r9 & 63);
                        } else {
                            throw new NumberFormatException(AnonymousClass001.A0Q("Invalid UTF-8 sequence continuation byte: ", j));
                        }
                    }
                    this.A01 = i2 + i;
                    return j;
                }
            } else if (i3 == 7) {
                i = 1;
                this.A01 = i2 + i;
                return j;
            }
        }
        throw new NumberFormatException(AnonymousClass001.A0Q("Invalid UTF-8 sequence first byte: ", j));
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0015, code lost:
    
        if (r5.A02[r1] != 0) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String A0G(int r6) {
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
        throw new UnsupportedOperationException("Method not decompiled: X.WFa.A0G(int):java.lang.String");
    }

    public final String A0H(Charset charset) {
        int i;
        byte b;
        WDn.A03(A03.contains(charset), AbstractC167017dG.A0n(charset, "Unsupported charset: ", new StringBuilder()));
        if (this.A00 - this.A01 == 0) {
            return null;
        }
        Charset charset2 = AbstractC50482Ts.A01;
        if (!charset.equals(charset2)) {
            A0J();
        }
        Charset charset3 = AbstractC50482Ts.A05;
        if (!charset.equals(charset3) && !charset.equals(charset2)) {
            if (!charset.equals(AbstractC50482Ts.A02) && !charset.equals(AbstractC50482Ts.A04) && !charset.equals(AbstractC50482Ts.A03)) {
                throw AbstractC37303Gc4.A0M(charset, "Unsupported charset: ", new StringBuilder());
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
        String A0I = A0I(charset, i2 - this.A01);
        if (this.A01 == this.A00) {
            return A0I;
        }
        char[] cArr = A04;
        int A00 = A00(this, charset);
        if (A00 == 0) {
            return A0I;
        }
        char c = (char) (A00 >> 16);
        int i4 = 0;
        while (cArr[i4] != c) {
            i4++;
            if (i4 >= 2) {
                return A0I;
            }
        }
        this.A01 += A00 & 65535;
        if (c != '\r') {
            return A0I;
        }
        char[] cArr2 = A05;
        int A002 = A00(this, charset);
        if (A002 == 0) {
            return A0I;
        }
        if (cArr2[0] != ((char) (A002 >> 16))) {
            return A0I;
        }
        this.A01 += A002 & 65535;
        return A0I;
    }

    public final String A0I(Charset charset, int i) {
        String str = new String(this.A02, this.A01, i, charset);
        this.A01 += i;
        return str;
    }

    public final Charset A0J() {
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

    public final short A0K() {
        byte[] bArr = this.A02;
        int i = this.A01;
        int i2 = i + 1;
        int i3 = (bArr[i] & 255) << 8;
        this.A01 = i2 + 1;
        return (short) ((bArr[i2] & 255) | i3);
    }

    public final void A0L(int i) {
        byte[] bArr = this.A02;
        if (i > bArr.length) {
            this.A02 = Arrays.copyOf(bArr, i);
        }
    }

    public final void A0M(int i) {
        byte[] bArr = this.A02;
        if (bArr.length < i) {
            bArr = new byte[i];
        }
        A0Q(bArr, i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0006, code lost:
    
        if (r3 > r2.A02.length) goto L5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0N(int r3) {
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
            X.WDn.A01(r0)
            r2.A00 = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WFa.A0N(int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0005, code lost:
    
        if (r3 > r2.A00) goto L5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0O(int r3) {
        /*
            r2 = this;
            if (r3 < 0) goto L7
            int r1 = r2.A00
            r0 = 1
            if (r3 <= r1) goto L8
        L7:
            r0 = 0
        L8:
            X.WDn.A01(r0)
            r2.A01 = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WFa.A0O(int):void");
    }

    public final void A0P(int i) {
        A0O(this.A01 + i);
    }

    public final void A0Q(byte[] bArr, int i) {
        this.A02 = bArr;
        this.A00 = i;
        this.A01 = 0;
    }

    public final void A0R(byte[] bArr, int i, int i2) {
        System.arraycopy(this.A02, this.A01, bArr, i, i2);
        this.A01 += i2;
    }

    public WFa(int i) {
        this.A02 = new byte[i];
        this.A00 = i;
    }

    public final int A04() {
        return (A05() << 21) | (A05() << 14) | (A05() << 7) | A05();
    }

    public final int A07() {
        int A01 = A01();
        if (A01 >= 0) {
            return A01;
        }
        throw AbstractC31175DnJ.A0U("Top bit not zero: ", A01);
    }

    public final long A0D() {
        long A0B = A0B();
        if (A0B >= 0) {
            return A0B;
        }
        throw new IllegalStateException(AnonymousClass001.A0Q("Top bit not zero: ", A0B));
    }

    public WFa(byte[] bArr) {
        this.A02 = bArr;
        this.A00 = bArr.length;
    }

    public WFa() {
        this.A02 = Util.A07;
    }
}
