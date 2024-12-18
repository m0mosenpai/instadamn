package org.tukaani.xz.lzma;

import X.AbstractC20480zP;
import X.AbstractC20490zQ;
import X.AbstractC20500zR;
import X.C12750lN;
import X.C12760lO;
import X.C12770lP;
import X.C20440zL;
import java.lang.reflect.Array;
import java.util.Arrays;
import org.tukaani.xz.lz.LZEncoder;
import org.tukaani.xz.rangecoder.RangeEncoder;

/* loaded from: classes.dex */
public abstract class LZMAEncoder extends AbstractC20480zP {
    public static /* synthetic */ Class A0F;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public final int A05;
    public final int A06;
    public final LZEncoder A07;
    public final C12770lP A08;
    public final C12770lP A09;
    public final C12750lN A0A;
    public final RangeEncoder A0B;
    public final int[] A0C;
    public final int[][] A0D;
    public final int[][] A0E;

    public LZMAEncoder(LZEncoder lZEncoder, RangeEncoder rangeEncoder, int i, int i2, int i3, int i4) {
        super(i2);
        this.A02 = 0;
        this.A00 = 0;
        Class cls = Integer.TYPE;
        this.A0E = (int[][]) Array.newInstance((Class<?>) cls, 4, 128);
        this.A0C = new int[16];
        this.A01 = 0;
        this.A03 = -1;
        this.A04 = 0;
        this.A0B = rangeEncoder;
        this.A07 = lZEncoder;
        this.A06 = i4;
        this.A0A = new C12750lN(this, i);
        this.A08 = new C12770lP(this, i2, i4);
        this.A09 = new C12770lP(this, i2, i4);
        int A00 = A00(i3 - 1) + 1;
        this.A05 = A00;
        this.A0D = (int[][]) Array.newInstance((Class<?>) cls, 4, A00);
        A01();
    }

    public static int A00(int i) {
        if (i <= 4) {
            return i;
        }
        int i2 = 31;
        int i3 = i;
        if (((-65536) & i) == 0) {
            i3 = i << 16;
            i2 = 15;
        }
        if (((-16777216) & i3) == 0) {
            i3 <<= 8;
            i2 -= 8;
        }
        if (((-268435456) & i3) == 0) {
            i3 <<= 4;
            i2 -= 4;
        }
        if (((-1073741824) & i3) == 0) {
            i3 <<= 2;
            i2 -= 2;
        }
        if ((i3 & Integer.MIN_VALUE) == 0) {
            i2--;
        }
        return (i2 << 1) + ((i >>> (i2 - 1)) & 1);
    }

    public abstract int A02();

    public final int A04(C20440zL c20440zL, int i, int i2) {
        short[][] sArr = super.A0A;
        int i3 = c20440zL.A00;
        short s = sArr[i3][i2];
        int[] iArr = RangeEncoder.A06;
        return A05(c20440zL, iArr[(s ^ 2047) >>> 4] + iArr[(super.A04[i3] ^ 2047) >>> 4], 0, i2) + this.A09.A00[i2][i - 2];
    }

    public final int A05(C20440zL c20440zL, int i, int i2, int i3) {
        int i4;
        short[] sArr = super.A05;
        if (i2 == 0) {
            int i5 = c20440zL.A00;
            short s = sArr[i5];
            int[] iArr = RangeEncoder.A06;
            i4 = iArr[s >>> 4] + iArr[(super.A0B[i5][i3] ^ 2047) >>> 4];
        } else {
            int i6 = c20440zL.A00;
            short s2 = sArr[i6];
            int[] iArr2 = RangeEncoder.A06;
            i += iArr2[(s2 ^ 2047) >>> 4];
            short s3 = super.A06[i6];
            if (i2 == 1) {
                i4 = iArr2[s3 >>> 4];
            } else {
                return i + iArr2[(s3 ^ 2047) >>> 4] + iArr2[(super.A07[i6] ^ ((-(i2 - 2)) & 2047)) >>> 4];
            }
        }
        return i + i4;
    }

    public final void A06(int i) {
        this.A03 += i;
        this.A07.A06(i);
    }

    public final int A03(int i, int i2, int i3, int i4) {
        int i5 = i3 - 2;
        int i6 = i + this.A08.A00[i4][i5];
        int i7 = 3;
        if (i3 < 6) {
            i7 = i5;
        }
        if (i2 < 128) {
            return i6 + this.A0E[i7][i2];
        }
        return i6 + this.A0D[i7][A00(i2)] + this.A0C[i2 & 15];
    }

    public final boolean A07() {
        LZEncoder lZEncoder = this.A07;
        int i = lZEncoder.A02;
        boolean z = false;
        if (i != -1) {
            z = true;
        }
        if (!z) {
            if (i >= lZEncoder.A01) {
                return false;
            }
            A06(1);
            this.A0B.A03(super.A0A[super.A01.A00], 0, 0);
            this.A0A.A00[0].A00();
            this.A03--;
            this.A04++;
        }
        while (this.A04 <= 2096879) {
            RangeEncoder rangeEncoder = this.A0B;
            if (((rangeEncoder.A01 + rangeEncoder.A02) + 5) - 1 > 65510) {
                break;
            }
            if (lZEncoder.A02 - (this.A03 + 1) >= lZEncoder.A01) {
                return false;
            }
            int A02 = A02();
            int i2 = lZEncoder.A02;
            int i3 = this.A03;
            int i4 = (i2 - i3) & super.A00;
            int i5 = this.A01;
            if (i5 == -1) {
                rangeEncoder.A03(super.A0A[super.A01.A00], i4, 0);
                C12750lN c12750lN = this.A0A;
                LZMAEncoder lZMAEncoder = c12750lN.A01;
                LZEncoder lZEncoder2 = lZMAEncoder.A07;
                int i6 = lZMAEncoder.A03;
                byte[] bArr = lZEncoder2.A08;
                int i7 = lZEncoder2.A02;
                int i8 = bArr[i7 - (i6 + 1)] & 255;
                int i9 = ((AbstractC20490zQ) c12750lN).A00;
                c12750lN.A00[(i8 >> (8 - i9)) + (((i7 - i6) & ((AbstractC20490zQ) c12750lN).A01) << i9)].A00();
            } else {
                short[][] sArr = super.A0A;
                C20440zL c20440zL = super.A01;
                int i10 = c20440zL.A00;
                rangeEncoder.A03(sArr[i10], i4, 1);
                short[] sArr2 = super.A04;
                if (i5 < 4) {
                    rangeEncoder.A03(sArr2, i10, 1);
                    int i11 = 0;
                    if (i5 == 0) {
                        rangeEncoder.A03(super.A05, i10, 0);
                        short[] sArr3 = super.A0B[i10];
                        if (A02 != 1) {
                            i11 = 1;
                        }
                        rangeEncoder.A03(sArr3, i4, i11);
                    } else {
                        int[] iArr = super.A02;
                        int i12 = iArr[i5];
                        rangeEncoder.A03(super.A05, i10, 1);
                        short[] sArr4 = super.A06;
                        if (i5 == 1) {
                            rangeEncoder.A03(sArr4, i10, 0);
                        } else {
                            rangeEncoder.A03(sArr4, i10, 1);
                            rangeEncoder.A03(super.A07, i10, i5 - 2);
                            if (i5 == 3) {
                                iArr[3] = iArr[2];
                            }
                            iArr[2] = iArr[1];
                        }
                        iArr[1] = iArr[0];
                        iArr[0] = i12;
                    }
                    if (A02 == 1) {
                        int i13 = 11;
                        if (i10 < 7) {
                            i13 = 9;
                        }
                        c20440zL.A00 = i13;
                    } else {
                        this.A09.A02(A02, i4);
                        c20440zL.A01();
                    }
                } else {
                    rangeEncoder.A03(sArr2, i10, 0);
                    int i14 = i5 - 4;
                    c20440zL.A02();
                    this.A08.A02(A02, i4);
                    int A00 = A00(i14);
                    short[][] sArr5 = super.A08;
                    int i15 = 3;
                    if (A02 < 6) {
                        i15 = A02 - 2;
                    }
                    rangeEncoder.A02(sArr5[i15], A00);
                    if (A00 >= 4) {
                        int i16 = (A00 >>> 1) - 1;
                        int i17 = i14 - (((A00 & 1) | 2) << i16);
                        if (A00 < 14) {
                            short[] sArr6 = super.A09[A00 - 4];
                            int length = i17 | sArr6.length;
                            int i18 = 1;
                            do {
                                int i19 = length & 1;
                                length >>>= 1;
                                rangeEncoder.A03(sArr6, i18, i19);
                                i18 = (i18 << 1) | i19;
                            } while (length != 1);
                        } else {
                            int i20 = i17 >>> 4;
                            int i21 = i16 - 4;
                            do {
                                int i22 = rangeEncoder.A03 >>> 1;
                                rangeEncoder.A03 = i22;
                                i21--;
                                rangeEncoder.A04 += (-((i20 >>> i21) & 1)) & i22;
                                if (((-16777216) & i22) == 0) {
                                    rangeEncoder.A03 = i22 << 8;
                                    RangeEncoder.A01(rangeEncoder);
                                }
                            } while (i21 != 0);
                            short[] sArr7 = super.A03;
                            int i23 = (i17 & 15) | 16;
                            int i24 = 1;
                            do {
                                int i25 = i23 & 1;
                                i23 >>>= 1;
                                rangeEncoder.A03(sArr7, i24, i25);
                                i24 = (i24 << 1) | i25;
                            } while (i23 != 1);
                            this.A00--;
                        }
                    }
                    int[] iArr2 = super.A02;
                    iArr2[3] = iArr2[2];
                    iArr2[2] = iArr2[1];
                    iArr2[1] = iArr2[0];
                    iArr2[0] = i14;
                    this.A02--;
                }
            }
            this.A03 = i3 - A02;
            this.A04 += A02;
        }
        return true;
    }

    static {
        try {
            A0F = Class.forName("org.tukaani.xz.lzma.LZMAEncoder");
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError().initCause(e);
        }
    }

    @Override // X.AbstractC20480zP
    public void A01() {
        super.A01();
        C12750lN c12750lN = this.A0A;
        int i = 0;
        while (true) {
            C12760lO[] c12760lOArr = c12750lN.A00;
            if (i < c12760lOArr.length) {
                Arrays.fill(((AbstractC20500zR) c12760lOArr[i]).A00, (short) 1024);
                i++;
            } else {
                this.A08.A00();
                this.A09.A00();
                this.A02 = 0;
                this.A00 = 0;
                this.A04 += this.A03 + 1;
                this.A03 = -1;
                return;
            }
        }
    }
}
