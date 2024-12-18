package X;

import com.facebook.common.dextricks.StringTreeSet;
import java.util.Arrays;

/* renamed from: X.0vq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18630vq extends AbstractC004001f {
    public int A00;

    private final int A00(int i) {
        int i2 = super.A00;
        int i3 = i & i2;
        int i4 = 0;
        while (true) {
            long[] jArr = this.A03;
            int i5 = i3 >> 3;
            int i6 = (i3 & 7) << 3;
            long j = ((jArr[i5 + 1] << (64 - i6)) & ((-i6) >> 63)) | (jArr[i5] >>> i6);
            long j2 = j & (((-1) ^ j) << 7) & (-9187201950435737472L);
            if (j2 != 0) {
                return (i3 + (Long.numberOfTrailingZeros(j2) >> 3)) & i2;
            }
            i4 += 8;
            i3 = (i3 + i4) & i2;
        }
    }

    public static final int A01(C18630vq c18630vq, Object obj) {
        int i;
        int i2;
        int i3;
        int i4;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        int i5 = i * (-862048943);
        int i6 = i5 ^ (i5 << 16);
        int i7 = i6 >>> 7;
        int i8 = i6 & StringTreeSet.MAX_SYMBOL_COUNT;
        int i9 = ((AbstractC004001f) c18630vq).A00;
        int i10 = i7 & i9;
        int i11 = 0;
        while (true) {
            long[] jArr = c18630vq.A03;
            int i12 = i10 >> 3;
            int i13 = (i10 & 7) << 3;
            long j = ((jArr[i12 + 1] << (64 - i13)) & ((-i13) >> 63)) | (jArr[i12] >>> i13);
            long j2 = i8;
            long j3 = j ^ (j2 * 72340172838076673L);
            for (long j4 = (j3 - 72340172838076673L) & (j3 ^ (-1)) & (-9187201950435737472L); j4 != 0; j4 &= j4 - 1) {
                int numberOfTrailingZeros = ((Long.numberOfTrailingZeros(j4) >> 3) + i10) & i9;
                if (C14360o3.A0K(c18630vq.A04[numberOfTrailingZeros], obj)) {
                    return numberOfTrailingZeros;
                }
            }
            if ((j & ((j ^ (-1)) << 6) & (-9187201950435737472L)) != 0) {
                int A00 = c18630vq.A00(i7);
                if (c18630vq.A00 == 0) {
                    long[] jArr2 = c18630vq.A03;
                    if (((jArr2[A00 >> 3] >> ((A00 & 7) << 3)) & 255) != 254) {
                        int i14 = ((AbstractC004001f) c18630vq).A00;
                        if (i14 > 8) {
                            if (((c18630vq.A01 * 32) ^ Long.MIN_VALUE) <= ((i14 * 25) ^ Long.MIN_VALUE)) {
                                Object[] objArr = c18630vq.A04;
                                int[] iArr = c18630vq.A02;
                                AbstractC004701m.A01(jArr2, i14);
                                int i15 = 0;
                                int i16 = -1;
                                do {
                                    int i17 = i15 >> 3;
                                    int i18 = (i15 & 7) << 3;
                                    long j5 = (jArr2[i17] >> i18) & 255;
                                    if (j5 == 128) {
                                        i16 = i15;
                                        i15++;
                                    } else {
                                        if (j5 == 254) {
                                            Object obj2 = objArr[i15];
                                            if (obj2 != null) {
                                                i3 = obj2.hashCode();
                                            } else {
                                                i3 = 0;
                                            }
                                            int i19 = i3 * (-862048943);
                                            int i20 = i19 ^ (i19 << 16);
                                            int i21 = i20 >>> 7;
                                            int A002 = c18630vq.A00(i21);
                                            int i22 = i21 & i14;
                                            if (((A002 - i22) & i14) / 8 == ((i15 - i22) & i14) / 8) {
                                                jArr2[i17] = ((i20 & StringTreeSet.MAX_SYMBOL_COUNT) << i18) | (((255 << i18) ^ (-1)) & jArr2[i17]);
                                            } else {
                                                int i23 = A002 >> 3;
                                                long j6 = jArr2[i23];
                                                int i24 = (A002 & 7) << 3;
                                                long j7 = (j6 >> i24) & 255;
                                                int i25 = i20 & StringTreeSet.MAX_SYMBOL_COUNT;
                                                if (j7 == 128) {
                                                    jArr2[i23] = (j6 & ((255 << i24) ^ (-1))) | (i25 << i24);
                                                    jArr2[i17] = (jArr2[i17] & ((255 << i18) ^ (-1))) | (128 << i18);
                                                    objArr[A002] = objArr[i15];
                                                    objArr[i15] = null;
                                                    iArr[A002] = iArr[i15];
                                                    iArr[i15] = 0;
                                                    i16 = i15;
                                                } else {
                                                    jArr2[i23] = (i25 << i24) | (j6 & ((255 << i24) ^ (-1)));
                                                    if (i16 == -1) {
                                                        i16 = AbstractC004701m.A00(jArr2, i15 + 1, i14);
                                                    }
                                                    objArr[i16] = objArr[A002];
                                                    objArr[A002] = objArr[i15];
                                                    objArr[i15] = objArr[i16];
                                                    iArr[i16] = iArr[A002];
                                                    iArr[A002] = iArr[i15];
                                                    iArr[i15] = iArr[i16];
                                                    i15--;
                                                }
                                            }
                                            jArr2[jArr2.length - 1] = (jArr2[0] & 72057594037927935L) | Long.MIN_VALUE;
                                        }
                                        i15++;
                                    }
                                } while (i15 != i14);
                                int i26 = ((AbstractC004001f) c18630vq).A00;
                                if (i26 == 7) {
                                    i4 = 6;
                                } else {
                                    i4 = i26 - (i26 / 8);
                                }
                                c18630vq.A00 = i4 - c18630vq.A01;
                                A00 = c18630vq.A00(i7);
                            }
                        }
                        C18590vm c18590vm = AbstractC004701m.A01;
                        int i27 = 6;
                        if (i14 != 0) {
                            i27 = (i14 * 2) + 1;
                        }
                        Object[] objArr2 = c18630vq.A04;
                        int[] iArr2 = c18630vq.A02;
                        c18630vq.A02(i27);
                        long[] jArr3 = c18630vq.A03;
                        Object[] objArr3 = c18630vq.A04;
                        int[] iArr3 = c18630vq.A02;
                        int i28 = ((AbstractC004001f) c18630vq).A00;
                        for (int i29 = 0; i29 < i14; i29++) {
                            if (((jArr2[i29 >> 3] >> ((i29 & 7) << 3)) & 255) < 128) {
                                Object obj3 = objArr2[i29];
                                if (obj3 != null) {
                                    i2 = obj3.hashCode();
                                } else {
                                    i2 = 0;
                                }
                                int i30 = i2 * (-862048943);
                                int A003 = c18630vq.A00((i30 ^ (i30 << 16)) >>> 7);
                                int i31 = A003 >> 3;
                                int i32 = (A003 & 7) << 3;
                                long j8 = ((r1 & StringTreeSet.MAX_SYMBOL_COUNT) << i32) | (jArr3[i31] & ((255 << i32) ^ (-1)));
                                jArr3[i31] = j8;
                                jArr3[(((A003 - 7) & i28) + (i28 & 7)) >> 3] = j8;
                                objArr3[A003] = obj3;
                                iArr3[A003] = iArr2[i29];
                            }
                        }
                        A00 = c18630vq.A00(i7);
                    }
                }
                c18630vq.A01++;
                int i33 = c18630vq.A00;
                long[] jArr4 = c18630vq.A03;
                int i34 = A00 >> 3;
                long j9 = jArr4[i34];
                int i35 = (A00 & 7) << 3;
                int i36 = 0;
                if (((j9 >> i35) & 255) == 128) {
                    i36 = 1;
                }
                c18630vq.A00 = i33 - i36;
                int i37 = ((AbstractC004001f) c18630vq).A00;
                long j10 = (((255 << i35) ^ (-1)) & j9) | (j2 << i35);
                jArr4[i34] = j10;
                jArr4[(((A00 - 7) & i37) + (i37 & 7)) >> 3] = j10;
                return A00 ^ (-1);
            }
            i11 += 8;
            i10 = (i10 + i11) & i9;
        }
    }

    private final void A02(int i) {
        int i2;
        long[] jArr;
        int i3;
        if (i > 0) {
            C18590vm c18590vm = AbstractC004701m.A01;
            i2 = Math.max(7, (-1) >>> Integer.numberOfLeadingZeros(i));
        } else {
            i2 = 0;
        }
        super.A00 = i2;
        if (i2 == 0) {
            jArr = AbstractC004701m.A00;
        } else {
            int i4 = ((((i2 + 1) + 7) + 7) & (-8)) >> 3;
            jArr = new long[i4];
            Arrays.fill(jArr, 0, i4, -9187201950435737472L);
        }
        this.A03 = jArr;
        int i5 = i2 >> 3;
        long j = 255 << ((i2 & 7) << 3);
        jArr[i5] = (jArr[i5] & ((-1) ^ j)) | j;
        int i6 = super.A00;
        C18590vm c18590vm2 = AbstractC004701m.A01;
        if (i6 == 7) {
            i3 = 6;
        } else {
            i3 = i6 - (i6 / 8);
        }
        this.A00 = i3 - this.A01;
        this.A04 = new Object[i2];
        this.A02 = new int[i2];
    }

    public final void A05(int i) {
        this.A01--;
        long[] jArr = this.A03;
        int i2 = super.A00;
        int i3 = i >> 3;
        int i4 = (i & 7) << 3;
        long j = (jArr[i3] & ((255 << i4) ^ (-1))) | (254 << i4);
        jArr[i3] = j;
        jArr[(((i - 7) & i2) + (i2 & 7)) >> 3] = j;
        this.A04[i] = null;
    }

    public C18630vq(int i) {
        int i2;
        if (i >= 0) {
            C18590vm c18590vm = AbstractC004701m.A01;
            if (i == 7) {
                i2 = 8;
            } else {
                i2 = i + ((i - 1) / 7);
            }
            A02(i2);
            return;
        }
        AbstractC005601v.A00("Capacity must be a positive value.");
        throw C00O.createAndThrow();
    }

    public final void A06(Object obj, int i) {
        int A01 = A01(this, obj);
        if (A01 < 0) {
            A01 ^= -1;
        }
        this.A04[A01] = obj;
        this.A02[A01] = i;
    }

    public C18630vq() {
        this(6);
    }
}
