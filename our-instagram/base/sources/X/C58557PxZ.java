package X;

import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.PxZ, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58557PxZ extends AbstractC61611Rqa {
    public int A00;
    public int A01 = Integer.MAX_VALUE;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public final InputStream A06;
    public final byte[] A07;

    public C58557PxZ(InputStream inputStream) {
        Charset charset = AbstractC62398S9x.A04;
        this.A06 = inputStream;
        this.A07 = new byte[4096];
        this.A00 = 0;
        this.A03 = 0;
        this.A04 = 0;
    }

    public static void A01(C58557PxZ c58557PxZ) {
        int i = c58557PxZ.A00 + c58557PxZ.A05;
        c58557PxZ.A00 = i;
        int i2 = c58557PxZ.A04 + i;
        int i3 = c58557PxZ.A01;
        if (i2 > i3) {
            int i4 = i2 - i3;
            c58557PxZ.A05 = i4;
            c58557PxZ.A00 = i - i4;
            return;
        }
        c58557PxZ.A05 = 0;
    }

    public static boolean A03(C58557PxZ c58557PxZ, int i) {
        int i2 = c58557PxZ.A03;
        int i3 = i2 + i;
        int i4 = c58557PxZ.A00;
        if (i3 > i4) {
            int i5 = c58557PxZ.A04;
            if (i <= (Integer.MAX_VALUE - i5) - i2 && i5 + i2 + i <= c58557PxZ.A01) {
                if (i2 > 0) {
                    if (i4 > i2) {
                        byte[] bArr = c58557PxZ.A07;
                        System.arraycopy(bArr, i2, bArr, 0, i4 - i2);
                    }
                    i5 = c58557PxZ.A04 + i2;
                    c58557PxZ.A04 = i5;
                    i4 = c58557PxZ.A00 - i2;
                    c58557PxZ.A00 = i4;
                    c58557PxZ.A03 = 0;
                }
                InputStream inputStream = c58557PxZ.A06;
                try {
                    int read = inputStream.read(c58557PxZ.A07, i4, Math.min(4096 - i4, (Integer.MAX_VALUE - i5) - i4));
                    if (read != 0 && read >= -1 && read <= 4096) {
                        if (read > 0) {
                            c58557PxZ.A00 += read;
                            A01(c58557PxZ);
                            if (c58557PxZ.A00 >= i) {
                                return true;
                            }
                            return A03(c58557PxZ, i);
                        }
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append(inputStream.getClass());
                        sb.append("#read(byte[]) returned invalid result: ");
                        sb.append(read);
                        sb.append("\nThe InputStream implementation is buggy.");
                        throw new IllegalStateException(sb.toString());
                    }
                } catch (C61032Re1 e) {
                    e.A01 = true;
                    throw e;
                }
            }
            return false;
        }
        throw new IllegalStateException(AnonymousClass001.A0c("refillBuffer() called when ", " bytes were already available in buffer", i));
    }

    public static byte[] A05(C58557PxZ c58557PxZ, int i) {
        if (i >= 0) {
            int i2 = c58557PxZ.A04;
            int i3 = c58557PxZ.A03;
            int i4 = i2 + i3 + i;
            if (i4 - Integer.MAX_VALUE <= 0) {
                int i5 = c58557PxZ.A01;
                if (i4 <= i5) {
                    int i6 = c58557PxZ.A00 - i3;
                    int i7 = i - i6;
                    if (i7 >= 4096) {
                        try {
                            if (i7 > c58557PxZ.A06.available()) {
                                return null;
                            }
                        } catch (C61032Re1 e) {
                            e.A01 = true;
                            throw e;
                        }
                    }
                    byte[] bArr = new byte[i];
                    System.arraycopy(c58557PxZ.A07, c58557PxZ.A03, bArr, 0, i6);
                    c58557PxZ.A04 += c58557PxZ.A00;
                    c58557PxZ.A03 = 0;
                    c58557PxZ.A00 = 0;
                    while (i6 < i) {
                        int read = c58557PxZ.A06.read(bArr, i6, i - i6);
                        if (read != -1) {
                            c58557PxZ.A04 += read;
                            i6 += read;
                        }
                    }
                    return bArr;
                }
                c58557PxZ.A0X((i5 - i2) - i3);
                throw C61032Re1.A01("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            throw C61032Re1.A01("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }
        throw C61032Re1.A01("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public final int A0S() {
        int i = this.A03;
        if (this.A00 - i < 4) {
            A02(this, 4);
            i = this.A03;
        }
        byte[] bArr = this.A07;
        this.A03 = i + 4;
        return AbstractC58321PtD.A0F(bArr, i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x003a, code lost:
    
        if (r4[r2] < 0) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int A0T() {
        /*
            r5 = this;
            int r0 = r5.A03
            int r1 = r5.A00
            if (r1 == r0) goto L3c
            byte[] r4 = r5.A07
            int r2 = r0 + 1
            r3 = r4[r0]
            if (r3 < 0) goto L5d
            r5.A03 = r2
            return r3
        L11:
            int r2 = r1 + 1
            r1 = r4[r1]
            int r0 = r1 << 28
            r3 = r3 ^ r0
            r0 = 266354560(0xfe03f80, float:2.2112565E-29)
            r3 = r3 ^ r0
            if (r1 >= 0) goto L4d
            int r1 = r2 + 1
            r0 = r4[r2]
            if (r0 >= 0) goto L6d
            int r2 = r1 + 1
            r0 = r4[r1]
            if (r0 >= 0) goto L4d
            int r1 = r2 + 1
            r0 = r4[r2]
            if (r0 >= 0) goto L6d
            int r2 = r1 + 1
            r0 = r4[r1]
            if (r0 >= 0) goto L4d
            int r1 = r2 + 1
            r0 = r4[r2]
            if (r0 >= 0) goto L6d
        L3c:
            long r0 = r5.A0W()
            int r3 = (int) r0
            return r3
        L42:
            int r2 = r1 + 1
            r0 = r4[r1]
            int r0 = r0 << 14
            r3 = r3 ^ r0
            if (r3 < 0) goto L4f
            r3 = r3 ^ 16256(0x3f80, float:2.278E-41)
        L4d:
            r1 = r2
            goto L6d
        L4f:
            int r1 = r2 + 1
            r0 = r4[r2]
            int r0 = r0 << 21
            r3 = r3 ^ r0
            if (r3 >= 0) goto L11
            r0 = -2080896(0xffffffffffe03f80, float:NaN)
            r3 = r3 ^ r0
            goto L6d
        L5d:
            int r1 = r1 - r2
            r0 = 9
            if (r1 < r0) goto L3c
            int r1 = r2 + 1
            r0 = r4[r2]
            int r0 = r0 << 7
            r3 = r3 ^ r0
            if (r3 >= 0) goto L42
            r3 = r3 ^ (-128(0xffffffffffffff80, float:NaN))
        L6d:
            r5.A03 = r1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58557PxZ.A0T():int");
    }

    public final long A0U() {
        int i = this.A03;
        if (this.A00 - i < 8) {
            A02(this, 8);
            i = this.A03;
        }
        byte[] bArr = this.A07;
        this.A03 = i + 8;
        return AbstractC58321PtD.A0I(bArr, i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0023, code lost:
    
        if (r5[r9] < 0) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long A0V() {
        /*
            r10 = this;
            int r0 = r10.A03
            int r3 = r10.A00
            if (r3 == r0) goto L25
            byte[] r5 = r10.A07
            int r2 = r0 + 1
            r1 = r5[r0]
            if (r1 < 0) goto L96
            r10.A03 = r2
            long r3 = (long) r1
            return r3
        L12:
            int r9 = r6 + 1
            long r3 = X.AbstractC58321PtD.A0J(r5, r6, r1)
            int r0 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r0 >= 0) goto L36
            int r6 = r9 + 1
            r0 = r5[r9]
            long r1 = (long) r0
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r0 >= 0) goto La7
        L25:
            long r3 = r10.A0W()
            return r3
        L2a:
            int r9 = r6 + 1
            r0 = r5[r6]
            int r0 = r0 << 14
            r1 = r1 ^ r0
            if (r1 < 0) goto L38
            r0 = r1 ^ 16256(0x3f80, float:2.278E-41)
            long r3 = (long) r0
        L36:
            r6 = r9
            goto La7
        L38:
            int r6 = r9 + 1
            r0 = r5[r9]
            int r0 = r0 << 21
            r1 = r1 ^ r0
            if (r1 >= 0) goto L46
            r0 = -2080896(0xffffffffffe03f80, float:NaN)
            r1 = r1 ^ r0
            goto La6
        L46:
            long r1 = (long) r1
            int r9 = r6 + 1
            r0 = r5[r6]
            long r3 = (long) r0
            r0 = 28
            long r3 = r3 << r0
            long r1 = r1 ^ r3
            r7 = 0
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r0 < 0) goto L5b
            r3 = 266354560(0xfe03f80, double:1.315966377E-315)
        L59:
            long r3 = r3 ^ r1
            goto L36
        L5b:
            int r6 = r9 + 1
            r0 = r5[r9]
            long r3 = (long) r0
            r0 = 35
            long r3 = r3 << r0
            long r1 = r1 ^ r3
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r0 >= 0) goto L70
            r7 = -34093383808(0xfffffff80fe03f80, double:NaN)
        L6d:
            long r3 = r1 ^ r7
            goto La7
        L70:
            int r9 = r6 + 1
            r0 = r5[r6]
            long r3 = (long) r0
            r0 = 42
            long r3 = r3 << r0
            long r1 = r1 ^ r3
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r0 < 0) goto L83
            r3 = 4363953127296(0x3f80fe03f80, double:2.1560793202584E-311)
            goto L59
        L83:
            int r6 = r9 + 1
            r0 = r5[r9]
            long r3 = (long) r0
            r0 = 49
            long r3 = r3 << r0
            long r1 = r1 ^ r3
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r0 >= 0) goto L12
            r7 = -558586000294016(0xfffe03f80fe03f80, double:NaN)
            goto L6d
        L96:
            int r3 = r3 - r2
            r0 = 9
            if (r3 < r0) goto L25
            int r6 = r2 + 1
            r0 = r5[r2]
            int r0 = r0 << 7
            r1 = r1 ^ r0
            if (r1 >= 0) goto L2a
            r1 = r1 ^ (-128(0xffffffffffffff80, float:NaN))
        La6:
            long r3 = (long) r1
        La7:
            r10.A03 = r6
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58557PxZ.A0V():long");
    }

    public final long A0W() {
        long j = 0;
        int i = 0;
        do {
            if (this.A03 == this.A00) {
                A02(this, 1);
            }
            byte[] bArr = this.A07;
            int i2 = this.A03;
            this.A03 = i2 + 1;
            j |= (r2 & Byte.MAX_VALUE) << i;
            if ((bArr[i2] & 128) == 0) {
                return j;
            }
            i += 7;
        } while (i < 64);
        throw C61032Re1.A01("CodedInputStream encountered a malformed varint.");
    }

    public final void A0X(final int size) {
        int i;
        int i2 = this.A00;
        int i3 = this.A03;
        int i4 = i2 - i3;
        if (size <= i4) {
            if (size >= 0) {
                i = i3 + size;
                this.A03 = i;
                return;
            }
            throw C61032Re1.A01("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (size >= 0) {
            int i5 = this.A04;
            int i6 = i5 + i3;
            int i7 = i6 + size;
            int i8 = this.A01;
            if (i7 <= i8) {
                this.A04 = i6;
                this.A00 = 0;
                this.A03 = 0;
                while (i4 < size) {
                    int i9 = size - i4;
                    try {
                        InputStream inputStream = this.A06;
                        long j = i9;
                        try {
                            long skip = inputStream.skip(j);
                            if (skip >= 0 && skip <= j) {
                                if (skip == 0) {
                                    break;
                                } else {
                                    i4 += (int) skip;
                                }
                            } else {
                                StringBuilder A1C = AbstractC166987dD.A1C();
                                AbstractC58318PtA.A1U(A1C, inputStream);
                                A1C.append("#skip returned invalid result: ");
                                A1C.append(skip);
                                throw AbstractC58320PtC.A0o("\nThe InputStream implementation is buggy.", A1C);
                            }
                        } catch (C61032Re1 e) {
                            e.A01 = true;
                            throw e;
                        }
                    } finally {
                        this.A04 += i4;
                        A01(this);
                    }
                }
                if (i4 >= size) {
                    return;
                }
                int i10 = this.A00;
                int i11 = i10 - this.A03;
                this.A03 = i10;
                while (true) {
                    A02(this, 1);
                    i = size - i11;
                    int i12 = this.A00;
                    if (i <= i12) {
                        break;
                    }
                    i11 += i12;
                    this.A03 = i12;
                }
                this.A03 = i;
                return;
            }
            A0X((i8 - i5) - i3);
            throw C61032Re1.A01("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        throw C61032Re1.A01("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static ArrayList A00(C58557PxZ c58557PxZ, int i) {
        ArrayList A1E = AbstractC166987dD.A1E();
        while (i > 0) {
            int min = Math.min(i, 4096);
            byte[] bArr = new byte[min];
            int i2 = 0;
            while (i2 < min) {
                int read = c58557PxZ.A06.read(bArr, i2, min - i2);
                if (read != -1) {
                    c58557PxZ.A04 += read;
                    i2 += read;
                } else {
                    throw C61032Re1.A01("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
            }
            i -= min;
            A1E.add(bArr);
        }
        return A1E;
    }

    public static void A02(C58557PxZ c58557PxZ, int i) {
        if (!A03(c58557PxZ, i)) {
            if (i > (Integer.MAX_VALUE - c58557PxZ.A04) - c58557PxZ.A03) {
                throw C61032Re1.A01("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
            }
            throw C61032Re1.A01("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    public static byte[] A04(final C58557PxZ size, int ensureNoLeakedReferences) {
        byte[] A05 = A05(size, ensureNoLeakedReferences);
        if (A05 == null) {
            int i = size.A03;
            int i2 = size.A00;
            int i3 = i2 - i;
            size.A04 += i2;
            size.A03 = 0;
            size.A00 = 0;
            ArrayList A00 = A00(size, ensureNoLeakedReferences - i3);
            A05 = new byte[ensureNoLeakedReferences];
            System.arraycopy(size.A07, i, A05, 0, i3);
            Iterator it = A00.iterator();
            while (it.hasNext()) {
                i3 = AbstractC58320PtC.A00(A05, it, i3);
            }
        }
        return A05;
    }
}
