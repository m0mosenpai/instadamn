package X;

import com.facebook.common.dextricks.StringTreeSet;

/* renamed from: X.59l */
/* loaded from: classes3.dex */
public final class C1132359l {
    public final long A00;
    public static final long A01 = 4278190080L << 32;
    public static final long A03 = 4282664004L << 32;
    public static final long A04 = 4287137928L << 32;
    public static final long A09 = 4294967295L << 32;
    public static final long A06 = 4294901760L << 32;
    public static final long A05 = 4278255360L << 32;
    public static final long A02 = 4278190335L << 32;
    public static final long A07 = 0 << 32;
    public static final long A08 = C5AC.A02(AbstractC1132459m.A0H, 0.0f, 0.0f, 0.0f, 0.0f);

    public static final float A00(long j) {
        float A012;
        float f;
        if ((63 & j) == 0) {
            A012 = (float) AbstractC122695h4.A01((j >>> 56) & 255);
            f = 255.0f;
        } else {
            A012 = (float) AbstractC122695h4.A01((j >>> 6) & 1023);
            f = 1023.0f;
        }
        return A012 / f;
    }

    public static final float A01(long j) {
        int i;
        if ((63 & j) == 0) {
            return ((float) AbstractC122695h4.A01((j >>> 32) & 255)) / 255.0f;
        }
        int i2 = ((short) ((j >>> 16) & 65535)) & 65535;
        int i3 = 32768 & i2;
        int i4 = (i2 >>> 10) & 31;
        int i5 = i2 & 1023;
        int i6 = 0;
        if (i4 == 0) {
            if (i5 != 0) {
                float intBitsToFloat = Float.intBitsToFloat(i5 + 1056964608) - AbstractC62289S5k.A00;
                if (i3 == 0) {
                    return intBitsToFloat;
                }
                return -intBitsToFloat;
            }
            i = 0;
        } else {
            i = i5 << 13;
            if (i4 == 31) {
                if (i != 0) {
                    i |= 4194304;
                }
                i6 = 255;
            } else {
                i6 = (i4 - 15) + StringTreeSet.MAX_SYMBOL_COUNT;
            }
        }
        return Float.intBitsToFloat(i | (i3 << 16) | (i6 << 23));
    }

    public static final float A02(long j) {
        int i;
        if ((63 & j) == 0) {
            return ((float) AbstractC122695h4.A01((j >>> 40) & 255)) / 255.0f;
        }
        int i2 = ((short) ((j >>> 32) & 65535)) & 65535;
        int i3 = 32768 & i2;
        int i4 = (i2 >>> 10) & 31;
        int i5 = i2 & 1023;
        int i6 = 0;
        if (i4 == 0) {
            if (i5 != 0) {
                float intBitsToFloat = Float.intBitsToFloat(i5 + 1056964608) - AbstractC62289S5k.A00;
                if (i3 == 0) {
                    return intBitsToFloat;
                }
                return -intBitsToFloat;
            }
            i = 0;
        } else {
            i = i5 << 13;
            if (i4 == 31) {
                if (i != 0) {
                    i |= 4194304;
                }
                i6 = 255;
            } else {
                i6 = (i4 - 15) + StringTreeSet.MAX_SYMBOL_COUNT;
            }
        }
        return Float.intBitsToFloat(i | (i3 << 16) | (i6 << 23));
    }

    public static final float A03(long j) {
        int i;
        long j2 = 63 & j;
        long j3 = j >>> 48;
        if (j2 == 0) {
            return ((float) AbstractC122695h4.A01(j3 & 255)) / 255.0f;
        }
        int i2 = ((short) (j3 & 65535)) & 65535;
        int i3 = 32768 & i2;
        int i4 = (i2 >>> 10) & 31;
        int i5 = i2 & 1023;
        int i6 = 0;
        if (i4 == 0) {
            if (i5 != 0) {
                float intBitsToFloat = Float.intBitsToFloat(i5 + 1056964608) - AbstractC62289S5k.A00;
                if (i3 == 0) {
                    return intBitsToFloat;
                }
                return -intBitsToFloat;
            }
            i = 0;
        } else {
            i = i5 << 13;
            if (i4 == 31) {
                if (i != 0) {
                    i |= 4194304;
                }
                i6 = 255;
            } else {
                i6 = (i4 - 15) + StringTreeSet.MAX_SYMBOL_COUNT;
            }
        }
        return Float.intBitsToFloat(i | (i3 << 16) | (i6 << 23));
    }

    public static final long A05(AbstractC1132959r abstractC1132959r, long j) {
        C5AR c5ar;
        AbstractC1132959r abstractC1132959r2 = AbstractC1132459m.A0K[(int) (j & 63)];
        int i = abstractC1132959r2.A00;
        int i2 = abstractC1132959r.A00;
        if ((i | i2) < 0) {
            c5ar = AbstractC1133759z.A01(abstractC1132959r2, abstractC1132959r);
        } else {
            C18750w2 c18750w2 = C5AP.A00;
            int i3 = i | (i2 << 6);
            Object A032 = c18750w2.A03(i3);
            if (A032 == null) {
                A032 = AbstractC1133759z.A01(abstractC1132959r2, abstractC1132959r);
                c18750w2.A08(i3, A032);
            }
            c5ar = (C5AR) A032;
        }
        return c5ar.A00(j);
    }

    public static String A06(long j) {
        StringBuilder sb = new StringBuilder();
        sb.append("Color(");
        sb.append(A03(j));
        sb.append(", ");
        sb.append(A02(j));
        sb.append(", ");
        sb.append(A01(j));
        sb.append(", ");
        sb.append(A00(j));
        sb.append(", ");
        sb.append(AbstractC1132459m.A0K[(int) (j & 63)].A02);
        sb.append(')');
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        long j = this.A00;
        if (!(obj instanceof C1132359l) || j != ((C1132359l) obj).A00) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j = this.A00;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        return A06(this.A00);
    }

    public /* synthetic */ C1132359l(long j) {
        this.A00 = j;
    }

    public static /* synthetic */ long A04(float f, long j) {
        return C5AC.A02(AbstractC1132459m.A0K[(int) (j & 63)], A03(j), A02(j), A01(j), f);
    }
}
