package X;

import com.facebook.common.dextricks.StringTreeSet;
import java.util.Arrays;

/* renamed from: X.0vk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18570vk extends AbstractC004801n {
    public int A00;

    public final void A05() {
        this.A01 = 0;
        long[] jArr = this.A02;
        if (jArr != AbstractC004701m.A00) {
            Arrays.fill(jArr, 0, jArr.length, -9187201950435737472L);
            long[] jArr2 = this.A02;
            int i = super.A00;
            int i2 = i >> 3;
            long j = 255 << ((i & 7) << 3);
            jArr2[i2] = (jArr2[i2] & ((-1) ^ j)) | j;
        }
        AbstractC06960Yn.A0V(this.A03, 0, super.A00);
        A02();
    }

    private final int A00(int i) {
        int i2 = super.A00;
        int i3 = i & i2;
        int i4 = 0;
        while (true) {
            long[] jArr = this.A02;
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

    public static final int A01(C18570vk c18570vk, Object obj) {
        int i;
        int i2;
        int i3;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        int i4 = i * (-862048943);
        int i5 = i4 ^ (i4 << 16);
        int i6 = i5 >>> 7;
        int i7 = i5 & StringTreeSet.MAX_SYMBOL_COUNT;
        int i8 = ((AbstractC004801n) c18570vk).A00;
        int i9 = i6 & i8;
        int i10 = 0;
        while (true) {
            long[] jArr = c18570vk.A02;
            int i11 = i9 >> 3;
            int i12 = (i9 & 7) << 3;
            long j = ((jArr[i11 + 1] << (64 - i12)) & ((-i12) >> 63)) | (jArr[i11] >>> i12);
            long j2 = i7;
            long j3 = j ^ (j2 * 72340172838076673L);
            for (long j4 = (j3 - 72340172838076673L) & (j3 ^ (-1)) & (-9187201950435737472L); j4 != 0; j4 &= j4 - 1) {
                int numberOfTrailingZeros = ((Long.numberOfTrailingZeros(j4) >> 3) + i9) & i8;
                if (C14360o3.A0K(c18570vk.A03[numberOfTrailingZeros], obj)) {
                    return numberOfTrailingZeros;
                }
            }
            if ((j & ((j ^ (-1)) << 6) & (-9187201950435737472L)) != 0) {
                int A00 = c18570vk.A00(i6);
                if (c18570vk.A00 == 0) {
                    long[] jArr2 = c18570vk.A02;
                    if (((jArr2[A00 >> 3] >> ((A00 & 7) << 3)) & 255) != 254) {
                        int i13 = ((AbstractC004801n) c18570vk).A00;
                        if (i13 > 8) {
                            if (((c18570vk.A01 * 32) ^ Long.MIN_VALUE) <= ((i13 * 25) ^ Long.MIN_VALUE)) {
                                Object[] objArr = c18570vk.A03;
                                AbstractC004701m.A01(jArr2, i13);
                                int i14 = 0;
                                int i15 = -1;
                                do {
                                    int i16 = i14 >> 3;
                                    int i17 = (i14 & 7) << 3;
                                    long j5 = (jArr2[i16] >> i17) & 255;
                                    if (j5 == 128) {
                                        i15 = i14;
                                        i14++;
                                    } else {
                                        if (j5 == 254) {
                                            Object obj2 = objArr[i14];
                                            if (obj2 != null) {
                                                i3 = obj2.hashCode();
                                            } else {
                                                i3 = 0;
                                            }
                                            int i18 = i3 * (-862048943);
                                            int i19 = i18 ^ (i18 << 16);
                                            int i20 = i19 >>> 7;
                                            int A002 = c18570vk.A00(i20);
                                            int i21 = i20 & i13;
                                            if (((A002 - i21) & i13) / 8 == ((i14 - i21) & i13) / 8) {
                                                jArr2[i16] = ((i19 & StringTreeSet.MAX_SYMBOL_COUNT) << i17) | (((255 << i17) ^ (-1)) & jArr2[i16]);
                                            } else {
                                                int i22 = A002 >> 3;
                                                long j6 = jArr2[i22];
                                                int i23 = (A002 & 7) << 3;
                                                long j7 = (j6 >> i23) & 255;
                                                int i24 = i19 & StringTreeSet.MAX_SYMBOL_COUNT;
                                                if (j7 == 128) {
                                                    jArr2[i22] = (j6 & ((255 << i23) ^ (-1))) | (i24 << i23);
                                                    jArr2[i16] = (jArr2[i16] & ((255 << i17) ^ (-1))) | (128 << i17);
                                                    objArr[A002] = objArr[i14];
                                                    objArr[i14] = null;
                                                    i15 = i14;
                                                } else {
                                                    jArr2[i22] = (i24 << i23) | (j6 & ((255 << i23) ^ (-1)));
                                                    if (i15 == -1) {
                                                        i15 = AbstractC004701m.A00(jArr2, i14 + 1, i13);
                                                    }
                                                    objArr[i15] = objArr[A002];
                                                    objArr[A002] = objArr[i14];
                                                    objArr[i14] = objArr[i15];
                                                    i14--;
                                                }
                                            }
                                            jArr2[jArr2.length - 1] = (jArr2[0] & 72057594037927935L) | Long.MIN_VALUE;
                                        }
                                        i14++;
                                    }
                                } while (i14 != i13);
                                c18570vk.A02();
                                A00 = c18570vk.A00(i6);
                            }
                        }
                        C18590vm c18590vm = AbstractC004701m.A01;
                        int i25 = 6;
                        if (i13 != 0) {
                            i25 = (i13 * 2) + 1;
                        }
                        Object[] objArr2 = c18570vk.A03;
                        c18570vk.A03(i25);
                        long[] jArr3 = c18570vk.A02;
                        Object[] objArr3 = c18570vk.A03;
                        int i26 = ((AbstractC004801n) c18570vk).A00;
                        for (int i27 = 0; i27 < i13; i27++) {
                            if (((jArr2[i27 >> 3] >> ((i27 & 7) << 3)) & 255) < 128) {
                                Object obj3 = objArr2[i27];
                                if (obj3 != null) {
                                    i2 = obj3.hashCode();
                                } else {
                                    i2 = 0;
                                }
                                int i28 = i2 * (-862048943);
                                int A003 = c18570vk.A00((i28 ^ (i28 << 16)) >>> 7);
                                int i29 = A003 >> 3;
                                int i30 = (A003 & 7) << 3;
                                long j8 = (jArr3[i29] & ((255 << i30) ^ (-1))) | ((r1 & StringTreeSet.MAX_SYMBOL_COUNT) << i30);
                                jArr3[i29] = j8;
                                jArr3[(((A003 - 7) & i26) + (i26 & 7)) >> 3] = j8;
                                objArr3[A003] = obj3;
                            }
                        }
                        A00 = c18570vk.A00(i6);
                    }
                }
                c18570vk.A01++;
                int i31 = c18570vk.A00;
                long[] jArr4 = c18570vk.A02;
                int i32 = A00 >> 3;
                long j9 = jArr4[i32];
                int i33 = (A00 & 7) << 3;
                int i34 = 0;
                if (((j9 >> i33) & 255) == 128) {
                    i34 = 1;
                }
                c18570vk.A00 = i31 - i34;
                int i35 = ((AbstractC004801n) c18570vk).A00;
                long j10 = (((255 << i33) ^ (-1)) & j9) | (j2 << i33);
                jArr4[i32] = j10;
                jArr4[(((A00 - 7) & i35) + (i35 & 7)) >> 3] = j10;
                return A00;
            }
            i10 += 8;
            i9 = (i9 + i10) & i8;
        }
    }

    private final void A02() {
        int i;
        int i2 = super.A00;
        C18590vm c18590vm = AbstractC004701m.A01;
        if (i2 == 7) {
            i = 6;
        } else {
            i = i2 - (i2 / 8);
        }
        this.A00 = i - this.A01;
    }

    private final void A03(int i) {
        int i2;
        long[] jArr;
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
            int i3 = ((((i2 + 1) + 7) + 7) & (-8)) >> 3;
            jArr = new long[i3];
            Arrays.fill(jArr, 0, i3, -9187201950435737472L);
        }
        this.A02 = jArr;
        int i4 = i2 >> 3;
        long j = 255 << ((i2 & 7) << 3);
        jArr[i4] = (jArr[i4] & ((-1) ^ j)) | j;
        A02();
        this.A03 = new Object[i2];
    }

    public final void A06(int i) {
        this.A01--;
        long[] jArr = this.A02;
        int i2 = super.A00;
        int i3 = i >> 3;
        int i4 = (i & 7) << 3;
        long j = (jArr[i3] & ((255 << i4) ^ (-1))) | (254 << i4);
        jArr[i3] = j;
        jArr[(((i - 7) & i2) + (i2 & 7)) >> 3] = j;
        this.A03[i] = null;
    }

    public final void A07(AbstractC004801n abstractC004801n) {
        Object[] objArr = abstractC004801n.A03;
        long[] jArr = abstractC004801n.A02;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if (((((-1) ^ j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - (((i - length) ^ (-1)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            Object obj = objArr[(i << 3) + i3];
                            this.A03[A01(this, obj)] = obj;
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        return;
                    }
                }
                if (i != length) {
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public final boolean A08(Iterable iterable) {
        int i = this.A01;
        for (Object obj : iterable) {
            this.A03[A01(this, obj)] = obj;
        }
        if (i == this.A01) {
            return false;
        }
        return true;
    }

    public final boolean A09(Object obj) {
        int i = this.A01;
        this.A03[A01(this, obj)] = obj;
        if (this.A01 == i) {
            return false;
        }
        return true;
    }

    public final boolean A0A(Object obj) {
        int i;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        int i2 = i * (-862048943);
        int i3 = i2 ^ (i2 << 16);
        int i4 = i3 & StringTreeSet.MAX_SYMBOL_COUNT;
        int i5 = super.A00;
        int i6 = (i3 >>> 7) & i5;
        int i7 = 0;
        while (true) {
            long[] jArr = this.A02;
            int i8 = i6 >> 3;
            int i9 = (i6 & 7) << 3;
            long j = ((jArr[i8 + 1] << (64 - i9)) & ((-i9) >> 63)) | (jArr[i8] >>> i9);
            long j2 = (i4 * 72340172838076673L) ^ j;
            for (long j3 = (j2 ^ (-1)) & (j2 - 72340172838076673L) & (-9187201950435737472L); j3 != 0; j3 &= j3 - 1) {
                int numberOfTrailingZeros = ((Long.numberOfTrailingZeros(j3) >> 3) + i6) & i5;
                if (C14360o3.A0K(this.A03[numberOfTrailingZeros], obj)) {
                    if (numberOfTrailingZeros >= 0) {
                        A06(numberOfTrailingZeros);
                        return true;
                    }
                    return false;
                }
            }
            if ((j & ((j ^ (-1)) << 6) & (-9187201950435737472L)) == 0) {
                i7 += 8;
                i6 = (i6 + i7) & i5;
            } else {
                return false;
            }
        }
    }

    public C18570vk(int i) {
        C18590vm c18590vm = AbstractC004701m.A01;
        A03(i + ((i - 1) / 7));
    }

    public C18570vk() {
        this(6);
    }
}
