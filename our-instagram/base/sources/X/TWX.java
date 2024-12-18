package X;

import com.facebook.common.dextricks.Constants;
import com.facebook.common.dextricks.OdexSchemeArtXdex;
import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;

/* loaded from: classes10.dex */
public final class TWX implements InterfaceC65701TsN, InterfaceC65700TsM, Cloneable, ByteChannel {
    public static final byte[] A02 = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};
    public long A00;
    public C63304ShA A01;

    public final byte A00(long j) {
        C63304ShA c63304ShA;
        int i;
        long j2 = j;
        SUN.A00(this.A00, j2, 1L);
        long j3 = this.A00;
        if (j3 - j > j) {
            c63304ShA = this.A01;
            while (true) {
                int i2 = c63304ShA.A00;
                i = c63304ShA.A01;
                long j4 = i2 - i;
                if (j2 < j4) {
                    break;
                }
                j2 -= j4;
                c63304ShA = c63304ShA.A02;
            }
        } else {
            j2 = j - j3;
            c63304ShA = this.A01;
            do {
                c63304ShA = c63304ShA.A03;
                int i3 = c63304ShA.A00;
                i = c63304ShA.A01;
                j2 += i3 - i;
            } while (j2 < 0);
        }
        return c63304ShA.A06[i + ((int) j2)];
    }

    public final int A02(byte[] bArr, int i, int i2) {
        SUN.A00(bArr.length, i, i2);
        C63304ShA c63304ShA = this.A01;
        if (c63304ShA == null) {
            return -1;
        }
        int i3 = c63304ShA.A00;
        int i4 = c63304ShA.A01;
        int min = Math.min(i2, i3 - i4);
        System.arraycopy(c63304ShA.A06, i4, bArr, i, min);
        int i5 = c63304ShA.A01 + min;
        c63304ShA.A01 = i5;
        this.A00 -= min;
        if (i5 != c63304ShA.A00) {
            return min;
        }
        C63304ShA.A01(this, c63304ShA);
        return min;
    }

    public final C63304ShA A09(int i) {
        if (i >= 1 && i <= 8192) {
            C63304ShA c63304ShA = this.A01;
            if (c63304ShA == null) {
                C63304ShA A00 = C63109SdD.A00();
                this.A01 = A00;
                A00.A03 = A00;
                A00.A02 = A00;
                return A00;
            }
            C63304ShA c63304ShA2 = c63304ShA.A03;
            if (c63304ShA2.A00 + i <= 8192 && c63304ShA2.A04) {
                return c63304ShA2;
            }
            C63304ShA A002 = C63109SdD.A00();
            c63304ShA2.A05(A002);
            return A002;
        }
        throw AbstractC58318PtA.A0Y();
    }

    public final void A0B(int i) {
        C63304ShA A09 = A09(1);
        byte[] bArr = A09.A06;
        int i2 = A09.A00;
        A09.A00 = i2 + 1;
        bArr[i2] = (byte) i;
        this.A00++;
    }

    public final void A0C(int i) {
        C63304ShA A09 = A09(4);
        byte[] bArr = A09.A06;
        int i2 = A09.A00;
        int i3 = i2 + 1;
        AbstractC58318PtA.A19(i >>> 24, bArr, i2);
        int i4 = i3 + 1;
        AbstractC58318PtA.A19(i >>> 16, bArr, i3);
        int i5 = i4 + 1;
        AbstractC58318PtA.A19(i >>> 8, bArr, i4);
        AbstractC58318PtA.A19(i, bArr, i5);
        A09.A00 = i5 + 1;
        this.A00 += 4;
    }

    public final void A0D(int i) {
        C63304ShA A09 = A09(2);
        byte[] bArr = A09.A06;
        int i2 = A09.A00;
        int i3 = i2 + 1;
        AbstractC58318PtA.A19(i >>> 8, bArr, i2);
        AbstractC58318PtA.A19(i, bArr, i3);
        A09.A00 = i3 + 1;
        this.A00 += 2;
    }

    public final void A0H(TWX twx, long j, long j2) {
        long j3 = j2;
        long j4 = j;
        if (twx != null) {
            SUN.A00(this.A00, j4, j3);
            if (j2 != 0) {
                twx.A00 += j2;
                C63304ShA c63304ShA = this.A01;
                while (j4 >= C63304ShA.A00(c63304ShA)) {
                    j4 -= C63304ShA.A00(c63304ShA);
                    c63304ShA = c63304ShA.A02;
                }
                while (j3 > 0) {
                    C63304ShA A03 = c63304ShA.A03();
                    int i = (int) (A03.A01 + j4);
                    A03.A01 = i;
                    A03.A00 = Math.min(i + ((int) j3), A03.A00);
                    C63304ShA c63304ShA2 = twx.A01;
                    if (c63304ShA2 == null) {
                        A03.A03 = A03;
                        A03.A02 = A03;
                        twx.A01 = A03;
                    } else {
                        c63304ShA2.A03.A05(A03);
                    }
                    j3 -= C63304ShA.A00(A03);
                    c63304ShA = c63304ShA.A02;
                    j4 = 0;
                }
                return;
            }
            return;
        }
        throw AbstractC166987dD.A12("out == null");
    }

    public final void A0J(byte[] bArr, int i) {
        int i2 = 0;
        if (bArr != null) {
            long j = i;
            SUN.A00(bArr.length, 0L, j);
            while (i2 < i) {
                C63304ShA A09 = A09(1);
                int i3 = A09.A00;
                int min = Math.min(i - i2, 8192 - i3);
                System.arraycopy(bArr, i2, A09.A06, i3, min);
                i2 += min;
                A09.A00 += min;
            }
            this.A00 += j;
            return;
        }
        throw AbstractC166987dD.A12("source == null");
    }

    @Override // X.InterfaceC65701TsN
    public final TWX AEK() {
        return this;
    }

    @Override // X.InterfaceC65700TsM
    public final InterfaceC65700TsM ARO() {
        return this;
    }

    @Override // X.InterfaceC65701TsN
    public final TWX Aid() {
        return this;
    }

    @Override // X.InterfaceC65701TsN
    public final long CNM(byte b) {
        return A03((byte) 0, 0L, Long.MAX_VALUE);
    }

    @Override // X.InterfaceC65701TsN
    public final int EMo(TZE tze) {
        int A01 = A01(tze, false);
        if (A01 == -1) {
            return -1;
        }
        try {
            Em6(tze.A01[A01].A05());
            return A01;
        } catch (EOFException unused) {
            throw AbstractC58318PtA.A0V();
        }
    }

    @Override // X.InterfaceC65679Tr9
    public final void FEM(TWX twx, long j) {
        int i;
        C63304ShA A00;
        C63304ShA c63304ShA;
        int i2;
        long j2 = j;
        if (twx != null) {
            if (twx != this) {
                SUN.A00(twx.A00, 0L, j2);
                while (j2 > 0) {
                    C63304ShA c63304ShA2 = twx.A01;
                    int i3 = c63304ShA2.A00 - c63304ShA2.A01;
                    if (j2 < i3) {
                        C63304ShA c63304ShA3 = this.A01;
                        if (c63304ShA3 != null && (c63304ShA = c63304ShA3.A03) != null && c63304ShA.A04) {
                            long j3 = c63304ShA.A00 + j2;
                            if (c63304ShA.A05) {
                                i2 = 0;
                            } else {
                                i2 = c63304ShA.A01;
                            }
                            if (j3 - i2 <= OdexSchemeArtXdex.STATE_PGO_ATTEMPTED) {
                                c63304ShA2.A06(c63304ShA, (int) j2);
                                twx.A00 -= j2;
                                this.A00 += j2;
                                return;
                            }
                        }
                        int i4 = (int) j2;
                        if (i4 > 0 && i4 <= i3) {
                            if (i4 >= 1024) {
                                A00 = c63304ShA2.A03();
                            } else {
                                A00 = C63109SdD.A00();
                                System.arraycopy(c63304ShA2.A06, c63304ShA2.A01, A00.A06, 0, i4);
                            }
                            A00.A00 = A00.A01 + i4;
                            c63304ShA2.A01 += i4;
                            c63304ShA2.A03.A05(A00);
                            twx.A01 = A00;
                            c63304ShA2 = A00;
                        } else {
                            throw AbstractC58318PtA.A0Y();
                        }
                    }
                    int i5 = c63304ShA2.A00 - c63304ShA2.A01;
                    long j4 = i5;
                    twx.A01 = c63304ShA2.A02();
                    C63304ShA c63304ShA4 = this.A01;
                    if (c63304ShA4 == null) {
                        this.A01 = c63304ShA2;
                        c63304ShA2.A03 = c63304ShA2;
                        c63304ShA2.A02 = c63304ShA2;
                    } else {
                        c63304ShA4.A03.A05(c63304ShA2);
                        C63304ShA c63304ShA5 = c63304ShA2.A03;
                        if (c63304ShA5 != c63304ShA2) {
                            if (c63304ShA5.A04) {
                                int i6 = 8192 - c63304ShA5.A00;
                                if (c63304ShA5.A05) {
                                    i = 0;
                                } else {
                                    i = c63304ShA5.A01;
                                }
                                if (i5 <= i6 + i) {
                                    c63304ShA2.A06(c63304ShA5, i5);
                                    c63304ShA2.A02();
                                    C63109SdD.A01(c63304ShA2);
                                }
                            }
                        } else {
                            throw AbstractC58318PtA.A0Z();
                        }
                    }
                    twx.A00 -= j4;
                    this.A00 += j4;
                    j2 -= j4;
                }
                return;
            }
            throw AbstractC166987dD.A12("source == this");
        }
        throw AbstractC166987dD.A12("source == null");
    }

    @Override // X.InterfaceC65677Tr7, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
    }

    @Override // X.InterfaceC65700TsM, X.InterfaceC65679Tr9, java.io.Flushable
    public final void flush() {
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    @Override // X.InterfaceC65701TsN
    public final void readFully(byte[] bArr) {
        int i = 0;
        while (true) {
            int length = bArr.length;
            if (i < length) {
                int A022 = A02(bArr, i, length - i);
                if (A022 != -1) {
                    i += A022;
                } else {
                    throw new EOFException();
                }
            } else {
                return;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x004f, code lost:
    
        r0 = r7[r1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007f, code lost:
    
        if (r17 != false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0081, code lost:
    
        return r13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int A01(X.TZE r16, boolean r17) {
        /*
            r15 = this;
            X.ShA r9 = r15.A01
            r14 = -2
            r1 = r16
            if (r9 != 0) goto L10
            if (r17 != 0) goto L82
            X.TIl r0 = X.C64531TIl.A02
            int r0 = r1.indexOf(r0)
            return r0
        L10:
            byte[] r3 = r9.A06
            int r2 = r9.A01
            int r8 = r9.A00
            int[] r7 = r1.A00
            r6 = -1
            r5 = r9
            r1 = 0
            r13 = -1
        L1c:
            int r0 = r1 + 1
            r11 = r7[r1]
            int r10 = r0 + 1
            r0 = r7[r0]
            if (r0 == r6) goto L27
            r13 = r0
        L27:
            if (r5 == 0) goto L7f
            r12 = 0
            if (r11 >= 0) goto L57
            int r0 = -r11
            int r11 = r10 + r0
        L2f:
            int r4 = r2 + 1
            r0 = r3[r2]
            r2 = r0 & 255(0xff, float:3.57E-43)
            int r1 = r10 + 1
            r0 = r7[r10]
            if (r2 == r0) goto L3c
            return r13
        L3c:
            boolean r0 = X.AbstractC167007dF.A1P(r1, r11)
            if (r4 != r8) goto L52
            X.ShA r5 = r5.A02
            int r4 = r5.A01
            byte[] r3 = r5.A06
            int r8 = r5.A00
            if (r5 != r9) goto L52
            if (r0 == 0) goto L7f
            r5 = r12
        L4f:
            r0 = r7[r1]
            goto L76
        L52:
            if (r0 != 0) goto L4f
            r2 = r4
            r10 = r1
            goto L2f
        L57:
            int r4 = r2 + 1
            r0 = r3[r2]
            r2 = r0 & 255(0xff, float:3.57E-43)
            int r1 = r10 + r11
        L5f:
            if (r10 != r1) goto L62
            return r13
        L62:
            r0 = r7[r10]
            if (r2 != r0) goto L79
            int r10 = r10 + r11
            r0 = r7[r10]
            if (r4 != r8) goto L76
            X.ShA r5 = r5.A02
            int r4 = r5.A01
            byte[] r3 = r5.A06
            int r8 = r5.A00
            if (r5 != r9) goto L76
            r5 = r12
        L76:
            if (r0 < 0) goto L7c
            return r0
        L79:
            int r10 = r10 + 1
            goto L5f
        L7c:
            int r1 = -r0
            r2 = r4
            goto L1c
        L7f:
            if (r17 != 0) goto L82
            return r13
        L82:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: X.TWX.A01(X.TZE, boolean):int");
    }

    public final long A03(byte b, long j, long j2) {
        C63304ShA c63304ShA;
        long j3 = 0;
        if (j >= 0 && j2 >= j) {
            long j4 = this.A00;
            if (j2 > j4) {
                j2 = j4;
            }
            if (j != j2 && (c63304ShA = this.A01) != null) {
                if (j4 - j < j) {
                    while (j4 > j) {
                        c63304ShA = c63304ShA.A03;
                        j4 -= C63304ShA.A00(c63304ShA);
                    }
                } else {
                    while (true) {
                        long A00 = C63304ShA.A00(c63304ShA) + j3;
                        if (A00 >= j) {
                            break;
                        }
                        c63304ShA = c63304ShA.A02;
                        j3 = A00;
                    }
                    j4 = j3;
                }
                while (j4 < j2) {
                    byte[] bArr = c63304ShA.A06;
                    int i = c63304ShA.A00;
                    long j5 = c63304ShA.A01;
                    int min = (int) Math.min(i, (j5 + j2) - j4);
                    for (int i2 = (int) ((j5 + j) - j4); i2 < min; i2++) {
                        if (bArr[i2] == b) {
                            return (i2 - r6) + j4;
                        }
                    }
                    j4 += i - r6;
                    c63304ShA = c63304ShA.A02;
                    j = j4;
                }
            }
            return -1L;
        }
        throw AbstractC58319PtB.A0j("size=%s fromIndex=%s toIndex=%s", new Object[]{Long.valueOf(this.A00), Long.valueOf(j), Long.valueOf(j2)});
    }

    public final long A04(C64531TIl c64531TIl, long j) {
        int i;
        int i2;
        long j2 = 0;
        if (j >= 0) {
            C63304ShA c63304ShA = this.A01;
            if (c63304ShA != null) {
                long j3 = this.A00;
                if (j3 - j < j) {
                    while (j3 > j) {
                        c63304ShA = c63304ShA.A03;
                        j3 -= C63304ShA.A00(c63304ShA);
                    }
                } else {
                    while (true) {
                        long A00 = C63304ShA.A00(c63304ShA) + j2;
                        if (A00 >= j) {
                            break;
                        }
                        c63304ShA = c63304ShA.A02;
                        j2 = A00;
                    }
                    j3 = j2;
                }
                if (c64531TIl.A05() == 2) {
                    byte A04 = c64531TIl.A04(0);
                    byte A042 = c64531TIl.A04(1);
                    while (j3 < this.A00) {
                        byte[] bArr = c63304ShA.A06;
                        i = c63304ShA.A01;
                        i2 = (int) ((i + j) - j3);
                        int i3 = c63304ShA.A00;
                        while (i2 < i3) {
                            byte b = bArr[i2];
                            if (b != A04 && b != A042) {
                                i2++;
                            }
                            return (i2 - i) + j3;
                        }
                        j3 += i3 - i;
                        c63304ShA = c63304ShA.A02;
                        j = j3;
                    }
                } else {
                    byte[] bArr2 = c64531TIl.data;
                    while (j3 < this.A00) {
                        byte[] bArr3 = c63304ShA.A06;
                        i = c63304ShA.A01;
                        i2 = (int) ((i + j) - j3);
                        int i4 = c63304ShA.A00;
                        while (i2 < i4) {
                            byte b2 = bArr3[i2];
                            for (byte b3 : bArr2) {
                                if (b2 == b3) {
                                    return (i2 - i) + j3;
                                }
                            }
                            i2++;
                        }
                        j3 += i4 - i;
                        c63304ShA = c63304ShA.A02;
                        j = j3;
                    }
                }
            }
            return -1L;
        }
        throw AbstractC166987dD.A12("fromIndex < 0");
    }

    public final String A05() {
        try {
            return A07(SUN.A00, this.A00);
        } catch (EOFException e) {
            throw AbstractC58318PtA.A0W(e);
        }
    }

    public final String A06(long j) {
        String A07;
        long j2 = 1;
        if (j > 0) {
            long j3 = j - 1;
            if (A00(j3) == 13) {
                A07 = A07(SUN.A00, j3);
                j2 = 2;
                Em6(j2);
                return A07;
            }
        }
        A07 = A07(SUN.A00, j);
        Em6(j2);
        return A07;
    }

    public final String A07(Charset charset, long j) {
        SUN.A00(this.A00, 0L, j);
        if (charset != null) {
            if (j <= 2147483647L) {
                if (j == 0) {
                    return "";
                }
                C63304ShA c63304ShA = this.A01;
                int i = c63304ShA.A01;
                if (i + j > c63304ShA.A00) {
                    return AbstractC58318PtA.A0m(charset, E7v(j));
                }
                String A0n = AbstractC58318PtA.A0n(charset, c63304ShA.A06, i, (int) j);
                int i2 = (int) (c63304ShA.A01 + j);
                c63304ShA.A01 = i2;
                this.A00 -= j;
                if (i2 != c63304ShA.A00) {
                    return A0n;
                }
                C63304ShA.A01(this, c63304ShA);
                return A0n;
            }
            throw AbstractC58319PtB.A0h("byteCount > Integer.MAX_VALUE: ", j);
        }
        throw AbstractC166987dD.A12("charset == null");
    }

    public final C64531TIl A08() {
        try {
            return new C64531TIl(E7v(this.A00));
        } catch (EOFException e) {
            throw AbstractC58318PtA.A0W(e);
        }
    }

    public final void A0A() {
        try {
            Em6(this.A00);
        } catch (EOFException e) {
            throw AbstractC58318PtA.A0W(e);
        }
    }

    public final void A0E(int i) {
        int i2;
        int i3;
        if (i >= 128) {
            if (i < 2048) {
                i3 = (i >> 6) | 192;
            } else {
                if (i < 65536) {
                    if (i >= 55296 && i <= 57343) {
                        A0B(63);
                        return;
                    }
                    i2 = (i >> 12) | 224;
                } else if (i <= 1114111) {
                    A0B((i >> 18) | 240);
                    i2 = ((i >> 12) & 63) | 128;
                } else {
                    throw AbstractC167007dF.A0c("Unexpected code point: ", Integer.toHexString(i));
                }
                A0B(i2);
                i3 = ((i >> 6) & 63) | 128;
            }
            A0B(i3);
            i = (i & 63) | 128;
        }
        A0B(i);
    }

    public final void A0F(long j) {
        if (j == 0) {
            A0B(48);
            return;
        }
        int numberOfTrailingZeros = (Long.numberOfTrailingZeros(Long.highestOneBit(j)) / 4) + 1;
        C63304ShA A09 = A09(numberOfTrailingZeros);
        byte[] bArr = A09.A06;
        int i = A09.A00;
        int i2 = i + numberOfTrailingZeros;
        while (true) {
            i2--;
            if (i2 >= i) {
                bArr[i2] = A02[(int) (15 & j)];
                j >>>= 4;
            } else {
                A09.A00 = i2;
                this.A00 += numberOfTrailingZeros;
                return;
            }
        }
    }

    public final void A0G(String str, int i, int i2) {
        int i3;
        int i4;
        char c;
        if (i >= 0) {
            if (i2 >= i) {
                int length = str.length();
                if (i2 > length) {
                    throw AbstractC166987dD.A12(AnonymousClass001.A02(i2, length, "endIndex > string.length: ", " > "));
                }
                while (i < i2) {
                    char charAt = str.charAt(i);
                    if (charAt < 128) {
                        C63304ShA A09 = A09(1);
                        byte[] bArr = A09.A06;
                        int i5 = A09.A00 - i;
                        int min = Math.min(i2, 8192 - i5);
                        i3 = i + 1;
                        bArr[i + i5] = (byte) charAt;
                        while (i3 < min) {
                            char charAt2 = str.charAt(i3);
                            if (charAt2 >= 128) {
                                break;
                            }
                            bArr[i3 + i5] = (byte) charAt2;
                            i3++;
                        }
                        int i6 = A09.A00;
                        int i7 = (i5 + i3) - i6;
                        A09.A00 = i6 + i7;
                        this.A00 += i7;
                    } else {
                        if (charAt < 2048) {
                            i4 = (charAt >> 6) | 192;
                        } else if (charAt >= 55296 && charAt <= 57343) {
                            i3 = i + 1;
                            if (i3 < i2) {
                                c = str.charAt(i3);
                            } else {
                                c = 0;
                            }
                            if (charAt <= 56319 && c >= 56320 && c <= 57343) {
                                int i8 = (((charAt & 10239) << 10) | (9215 & c)) + Constants.LOAD_RESULT_PGO_ATTEMPTED;
                                A0B((i8 >> 18) | 240);
                                A0B(((i8 >> 12) & 63) | 128);
                                A0B(((i8 >> 6) & 63) | 128);
                                A0B((i8 & 63) | 128);
                                i += 2;
                            } else {
                                A0B(63);
                            }
                        } else {
                            A0B((charAt >> '\f') | 224);
                            i4 = ((charAt >> 6) & 63) | 128;
                        }
                        A0B(i4);
                        A0B((charAt & '?') | 128);
                        i++;
                    }
                    i = i3;
                }
                return;
            }
            throw AbstractC166987dD.A12(AnonymousClass001.A02(i2, i, "endIndex < beginIndex: ", " < "));
        }
        throw AbstractC25230BEn.A0n("beginIndex < 0: ", i);
    }

    public final void A0I(byte[] bArr) {
        if (bArr != null) {
            A0J(bArr, bArr.length);
            return;
        }
        throw AbstractC166987dD.A12("source == null");
    }

    @Override // X.InterfaceC65701TsN
    public final boolean ATd() {
        return AbstractC167007dF.A1N((this.A00 > 0L ? 1 : (this.A00 == 0L ? 0 : -1)));
    }

    @Override // X.InterfaceC65701TsN
    public final long CNO(C64531TIl c64531TIl) {
        return A04(c64531TIl, 0L);
    }

    @Override // X.InterfaceC65701TsN
    public final InputStream COZ() {
        return new C61039ReB(this);
    }

    @Override // X.InterfaceC65677Tr7
    public final long E7q(TWX twx, long j) {
        if (twx != null) {
            if (j >= 0) {
                long j2 = this.A00;
                if (j2 == 0) {
                    return -1L;
                }
                if (j > j2) {
                    j = j2;
                }
                twx.FEM(this, j);
                return j;
            }
            throw AbstractC58319PtB.A0h("byteCount < 0: ", j);
        }
        throw AbstractC166987dD.A12("sink == null");
    }

    @Override // X.InterfaceC65701TsN
    public final byte[] E7v(long j) {
        SUN.A00(this.A00, 0L, j);
        if (j <= 2147483647L) {
            byte[] bArr = new byte[(int) j];
            readFully(bArr);
            return bArr;
        }
        throw AbstractC58319PtB.A0h("byteCount > Integer.MAX_VALUE: ", j);
    }

    @Override // X.InterfaceC65701TsN
    public final void E87(TWX twx, long j) {
        long j2 = this.A00;
        if (j2 >= j) {
            twx.FEM(this, j);
        } else {
            twx.FEM(this, j2);
            throw new EOFException();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0058 A[EDGE_INSN: B:36:0x0058->B:33:0x0058 BREAK  A[LOOP:0: B:4:0x000c->B:35:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x005f  */
    /* JADX WARN: Type inference failed for: r0v16, types: [X.TWX, java.lang.Object] */
    @Override // X.InterfaceC65701TsN
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long E89() {
        /*
            r15 = this;
            long r1 = r15.A00
            r13 = 0
            int r0 = (r1 > r13 ? 1 : (r1 == r13 ? 0 : -1))
            if (r0 == 0) goto L8d
            r6 = 0
            r4 = 0
            r12 = 0
        Lc:
            X.ShA r8 = r15.A01
            byte[] r7 = r8.A06
            int r3 = r8.A01
            int r2 = r8.A00
        L14:
            if (r3 >= r2) goto L4d
            r9 = r7[r3]
            r0 = 48
            if (r9 < r0) goto L4a
            r0 = 57
            if (r9 > r0) goto L32
            int r1 = r9 + (-48)
        L22:
            r10 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r10 = r10 & r4
            int r0 = (r10 > r13 ? 1 : (r10 == r13 ? 0 : -1))
            if (r0 != 0) goto L62
            r0 = 4
            long r4 = r4 << r0
            long r0 = (long) r1
            long r4 = r4 | r0
            int r3 = r3 + 1
            int r6 = r6 + 1
            goto L14
        L32:
            r0 = 97
            if (r9 < r0) goto L3f
            r0 = 102(0x66, float:1.43E-43)
            if (r9 > r0) goto L4a
            int r0 = r9 + (-97)
        L3c:
            int r1 = r0 + 10
            goto L22
        L3f:
            r0 = 65
            if (r9 < r0) goto L4a
            r0 = 70
            if (r9 > r0) goto L4a
            int r0 = r9 + (-65)
            goto L3c
        L4a:
            if (r6 == 0) goto L7d
            r12 = 1
        L4d:
            if (r3 != r2) goto L5f
            X.C63304ShA.A01(r15, r8)
        L52:
            if (r12 != 0) goto L58
            X.ShA r0 = r15.A01
            if (r0 != 0) goto Lc
        L58:
            long r2 = r15.A00
            long r0 = (long) r6
            long r2 = r2 - r0
            r15.A00 = r2
            return r4
        L5f:
            r8.A01 = r3
            goto L52
        L62:
            X.TWX r0 = new X.TWX
            r0.<init>()
            r0.A0F(r4)
            r0.A0B(r9)
            java.lang.String r1 = "Number too large: "
            java.lang.String r0 = r0.A05()
            java.lang.String r0 = X.AnonymousClass001.A0R(r1, r0)
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            r1.<init>(r0)
            throw r1
        L7d:
            java.lang.String r1 = "Expected leading [0-9a-fA-F] character but was 0x"
            java.lang.String r0 = java.lang.Integer.toHexString(r9)
            java.lang.String r0 = X.AnonymousClass001.A0R(r1, r0)
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            r1.<init>(r0)
            throw r1
        L8d:
            java.lang.String r0 = "size == 0"
            java.lang.IllegalStateException r1 = X.AbstractC166987dD.A14(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.TWX.E89():long");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v1, types: [X.TWX, java.lang.Object] */
    @Override // X.InterfaceC65701TsN
    public final String E8V(long j) {
        if (j >= 0) {
            long j2 = Long.MAX_VALUE;
            if (j != Long.MAX_VALUE) {
                j2 = j + 1;
            }
            long A03 = A03((byte) 10, 0L, j2);
            if (A03 != -1) {
                return A06(A03);
            }
            if (j2 < this.A00 && A00(j2 - 1) == 13 && A00(j2) == 10) {
                return A06(j2);
            }
            ?? obj = new Object();
            A0H(obj, 0L, Math.min(32L, this.A00));
            StringBuilder A1C = AbstractC166987dD.A1C();
            A1C.append("\\n not found: limit=");
            A1C.append(Math.min(this.A00, j));
            A1C.append(" content=");
            A1C.append(obj.A08().A06());
            throw new EOFException(MSX.A0l(A1C, (char) 8230));
        }
        throw AbstractC58319PtB.A0h("limit < 0: ", j);
    }

    @Override // X.InterfaceC65701TsN
    public final boolean EIz(long j) {
        return MSY.A1R((this.A00 > j ? 1 : (this.A00 == j ? 0 : -1)));
    }

    @Override // X.InterfaceC65701TsN
    public final void EJO(long j) {
        if (this.A00 >= j) {
        } else {
            throw new EOFException();
        }
    }

    @Override // X.InterfaceC65701TsN
    public final void Em6(long j) {
        while (j > 0) {
            C63304ShA c63304ShA = this.A01;
            if (c63304ShA != null) {
                int i = c63304ShA.A00;
                int i2 = c63304ShA.A01;
                int min = (int) Math.min(j, i - i2);
                long j2 = min;
                this.A00 -= j2;
                j -= j2;
                int i3 = i2 + min;
                c63304ShA.A01 = i3;
                if (i3 == i) {
                    C63304ShA.A01(this, c63304ShA);
                }
            } else {
                throw new EOFException();
            }
        }
    }

    @Override // X.InterfaceC65677Tr7
    public final C63030Sb2 Eq9() {
        return C63030Sb2.A03;
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [X.TWX, java.lang.Object] */
    public final /* bridge */ /* synthetic */ Object clone() {
        ?? obj = new Object();
        long j = this.A00;
        if (j != 0) {
            C63304ShA A03 = this.A01.A03();
            obj.A01 = A03;
            A03.A03 = A03;
            A03.A02 = A03;
            C63304ShA c63304ShA = this.A01;
            while (true) {
                c63304ShA = c63304ShA.A02;
                if (c63304ShA == c63304ShA) {
                    break;
                }
                A03.A03.A05(c63304ShA.A03());
            }
            obj.A00 = j;
        }
        return obj;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof TWX) {
                TWX twx = (TWX) obj;
                long j = this.A00;
                if (j == twx.A00) {
                    long j2 = 0;
                    if (j != 0) {
                        C63304ShA c63304ShA = this.A01;
                        C63304ShA c63304ShA2 = twx.A01;
                        int i = c63304ShA.A01;
                        int i2 = c63304ShA2.A01;
                        while (j2 < j) {
                            long min = Math.min(c63304ShA.A00 - i, c63304ShA2.A00 - i2);
                            int i3 = 0;
                            while (i3 < min) {
                                int i4 = i + 1;
                                int i5 = i2 + 1;
                                if (c63304ShA.A06[i] == c63304ShA2.A06[i2]) {
                                    i3++;
                                    i = i4;
                                    i2 = i5;
                                }
                            }
                            if (i == c63304ShA.A00) {
                                c63304ShA = c63304ShA.A02;
                                i = c63304ShA.A01;
                            }
                            if (i2 == c63304ShA2.A00) {
                                c63304ShA2 = c63304ShA2.A02;
                                i2 = c63304ShA2.A01;
                            }
                            j2 += min;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        C63304ShA c63304ShA = this.A01;
        int i = 1;
        if (c63304ShA == null) {
            return 0;
        }
        do {
            int i2 = c63304ShA.A00;
            for (int i3 = c63304ShA.A01; i3 < i2; i3++) {
                i = (i * 31) + c63304ShA.A06[i3];
            }
            c63304ShA = c63304ShA.A02;
        } while (c63304ShA != c63304ShA);
        return i;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        C63304ShA c63304ShA = this.A01;
        if (c63304ShA == null) {
            return -1;
        }
        int remaining = byteBuffer.remaining();
        int i = c63304ShA.A00;
        int i2 = c63304ShA.A01;
        int min = Math.min(remaining, i - i2);
        byteBuffer.put(c63304ShA.A06, i2, min);
        int i3 = c63304ShA.A01 + min;
        c63304ShA.A01 = i3;
        this.A00 -= min;
        if (i3 != c63304ShA.A00) {
            return min;
        }
        C63304ShA.A01(this, c63304ShA);
        return min;
    }

    @Override // X.InterfaceC65701TsN
    public final byte readByte() {
        long j = this.A00;
        if (j != 0) {
            C63304ShA c63304ShA = this.A01;
            int i = c63304ShA.A01;
            int i2 = c63304ShA.A00;
            int i3 = i + 1;
            byte b = c63304ShA.A06[i];
            this.A00 = j - 1;
            if (i3 == i2) {
                C63304ShA.A01(this, c63304ShA);
                return b;
            }
            c63304ShA.A01 = i3;
            return b;
        }
        throw AbstractC166987dD.A14("size == 0");
    }

    @Override // X.InterfaceC65701TsN
    public final int readInt() {
        long j = this.A00;
        if (j >= 4) {
            C63304ShA c63304ShA = this.A01;
            int i = c63304ShA.A01;
            int i2 = c63304ShA.A00;
            if (i2 - i < 4) {
                return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
            }
            byte[] bArr = c63304ShA.A06;
            int i3 = i + 1;
            int i4 = i3 + 1;
            int i5 = ((bArr[i] & 255) << 24) | ((bArr[i3] & 255) << 16);
            int i6 = i4 + 1;
            int i7 = i5 | ((bArr[i4] & 255) << 8);
            int i8 = i6 + 1;
            int i9 = i7 | (bArr[i6] & 255);
            this.A00 = j - 4;
            if (i8 == i2) {
                C63304ShA.A01(this, c63304ShA);
                return i9;
            }
            c63304ShA.A01 = i8;
            return i9;
        }
        throw AbstractC166987dD.A14(AnonymousClass001.A0Q("size < 4: ", j));
    }

    @Override // X.InterfaceC65701TsN
    public final long readLong() {
        long j = this.A00;
        if (j >= 8) {
            C63304ShA c63304ShA = this.A01;
            int i = c63304ShA.A01;
            int i2 = c63304ShA.A00;
            if (i2 - i < 8) {
                return ((readInt() & 4294967295L) << 32) | (4294967295L & readInt());
            }
            byte[] bArr = c63304ShA.A06;
            int i3 = i + 1 + 1 + 1 + 1;
            long j2 = ((bArr[i] & 255) << 56) | ((bArr[r1] & 255) << 48) | ((bArr[r13] & 255) << 40) | ((bArr[r12] & 255) << 32);
            long j3 = j2 | ((bArr[i3] & 255) << 24) | ((bArr[r13] & 255) << 16);
            int i4 = i3 + 1 + 1 + 1 + 1;
            long j4 = (bArr[r11] & 255) | ((bArr[r12] & 255) << 8) | j3;
            this.A00 = j - 8;
            if (i4 == i2) {
                C63304ShA.A01(this, c63304ShA);
                return j4;
            }
            c63304ShA.A01 = i4;
            return j4;
        }
        throw AbstractC166987dD.A14(AnonymousClass001.A0Q("size < 8: ", j));
    }

    @Override // X.InterfaceC65701TsN
    public final short readShort() {
        int i;
        long j = this.A00;
        if (j >= 2) {
            C63304ShA c63304ShA = this.A01;
            int i2 = c63304ShA.A01;
            int i3 = c63304ShA.A00;
            if (i3 - i2 < 2) {
                i = ((readByte() & 255) << 8) | (readByte() & 255);
            } else {
                byte[] bArr = c63304ShA.A06;
                int i4 = i2 + 1;
                int i5 = i4 + 1;
                i = ((bArr[i2] & 255) << 8) | (bArr[i4] & 255);
                this.A00 = j - 2;
                if (i5 == i3) {
                    C63304ShA.A01(this, c63304ShA);
                } else {
                    c63304ShA.A01 = i5;
                }
            }
            return (short) i;
        }
        throw AbstractC166987dD.A14(AnonymousClass001.A0Q("size < 2: ", j));
    }

    public final String toString() {
        Object c65169Tei;
        long j = this.A00;
        if (j <= 2147483647L) {
            int i = (int) j;
            if (i == 0) {
                c65169Tei = C64531TIl.A02;
            } else {
                c65169Tei = new C65169Tei(this, i);
            }
            return c65169Tei.toString();
        }
        throw AbstractC58319PtB.A0h("size > Integer.MAX_VALUE: ", j);
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        if (byteBuffer != null) {
            int remaining = byteBuffer.remaining();
            int i = remaining;
            while (i > 0) {
                C63304ShA A09 = A09(1);
                int i2 = A09.A00;
                int min = Math.min(i, 8192 - i2);
                byteBuffer.get(A09.A06, i2, min);
                i -= min;
                A09.A00 += min;
            }
            this.A00 += remaining;
            return remaining;
        }
        throw AbstractC166987dD.A12("source == null");
    }

    @Override // X.InterfaceC65701TsN
    public final C64531TIl E7w(long j) {
        return new C64531TIl(E7v(j));
    }

    @Override // X.InterfaceC65701TsN
    public final int E8C() {
        int readInt = readInt();
        return ((readInt & 255) << 24) | (((-16777216) & readInt) >>> 24) | ((16711680 & readInt) >>> 8) | ((65280 & readInt) << 8);
    }

    @Override // X.InterfaceC65701TsN
    public final short E8Q() {
        int readShort = readShort() & 65535;
        return (short) (((readShort & 255) << 8) | ((65280 & readShort) >>> 8));
    }

    @Override // X.InterfaceC65700TsM
    public final /* bridge */ /* synthetic */ InterfaceC65700TsM FEG(byte[] bArr) {
        A0I(bArr);
        return this;
    }

    @Override // X.InterfaceC65700TsM
    public final /* bridge */ /* synthetic */ InterfaceC65700TsM FER(int i) {
        A0B(i);
        return this;
    }

    @Override // X.InterfaceC65700TsM
    public final /* bridge */ /* synthetic */ InterfaceC65700TsM FEX(long j) {
        A0F(j);
        return this;
    }

    @Override // X.InterfaceC65700TsM
    public final /* bridge */ /* synthetic */ InterfaceC65700TsM FEZ(int i) {
        A0C(i);
        return this;
    }

    @Override // X.InterfaceC65700TsM
    public final /* bridge */ /* synthetic */ InterfaceC65700TsM FEj(int i) {
        A0D(i);
        return this;
    }

    @Override // X.InterfaceC65700TsM
    public final /* bridge */ /* synthetic */ InterfaceC65700TsM FEs(String str) {
        A0G(str, 0, str.length());
        return this;
    }

    @Override // X.InterfaceC65701TsN
    public final String E8U() {
        return E8V(Long.MAX_VALUE);
    }
}
