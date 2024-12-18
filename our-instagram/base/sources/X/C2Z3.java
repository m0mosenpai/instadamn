package X;

/* renamed from: X.2Z3, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2Z3 {
    public final long A00;

    public static final int A00(C2XH c2xh, long j) {
        C14360o3.A0B(c2xh, 1);
        if ((j & 9221120237041090560L) != 9221120237041090560L) {
            return c2xh.A00((float) Double.longBitsToDouble(j));
        }
        if ((j & 9221401712017801216L) == 9221401712017801216L) {
            return (int) (j & 4294967295L);
        }
        if ((j & 9221683186994511872L) == 9221683186994511872L) {
            return C2WL.A00(Float.intBitsToFloat((int) (j & 4294967295L)) * c2xh.A01.getDisplayMetrics().scaledDensity);
        }
        throw new IllegalArgumentException(AnonymousClass001.A0R("Got unexpected NaN: ", Long.toHexString(j)));
    }

    public static final long A02(long j) {
        double d;
        int floatToRawIntBits;
        if ((j & 9221120237041090560L) != 9221120237041090560L) {
            d = Double.longBitsToDouble(j) / 2.0d;
        } else {
            long j2 = 9221401712017801216L;
            if ((j & 9221401712017801216L) == 9221401712017801216L) {
                floatToRawIntBits = ((int) (j & 4294967295L)) / 2;
            } else {
                j2 = 9221683186994511872L;
                if ((j & 9221683186994511872L) == 9221683186994511872L) {
                    floatToRawIntBits = Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) / 2.0f);
                } else {
                    d = Double.NaN;
                }
            }
            return floatToRawIntBits | j2;
        }
        return Double.doubleToRawLongBits(d);
    }

    public static final long A01(float f, long j) {
        double d;
        int floatToRawIntBits;
        if ((j & 9221120237041090560L) != 9221120237041090560L) {
            d = Double.longBitsToDouble(j) * f;
        } else {
            long j2 = 9221401712017801216L;
            if ((j & 9221401712017801216L) == 9221401712017801216L) {
                floatToRawIntBits = (int) (((int) (j & 4294967295L)) * f);
            } else {
                j2 = 9221683186994511872L;
                if ((j & 9221683186994511872L) == 9221683186994511872L) {
                    floatToRawIntBits = Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) * f);
                } else {
                    d = Double.NaN;
                }
            }
            return floatToRawIntBits | j2;
        }
        return Double.doubleToRawLongBits(d);
    }

    public static final long A03(long j) {
        double d;
        int floatToRawIntBits;
        if ((j & 9221120237041090560L) != 9221120237041090560L) {
            d = Double.longBitsToDouble(j) * (-1.0d);
        } else {
            long j2 = 9221401712017801216L;
            if ((j & 9221401712017801216L) == 9221401712017801216L) {
                floatToRawIntBits = -((int) (j & 4294967295L));
            } else {
                j2 = 9221683186994511872L;
                if ((j & 9221683186994511872L) == 9221683186994511872L) {
                    floatToRawIntBits = Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) * (-1.0f));
                } else {
                    d = Double.NaN;
                }
            }
            return floatToRawIntBits | j2;
        }
        return Double.doubleToRawLongBits(d);
    }

    public static String A04(long j) {
        StringBuilder sb;
        String str;
        if ((j & 9221120237041090560L) != 9221120237041090560L) {
            sb = new StringBuilder();
            sb.append((float) Double.longBitsToDouble(j));
            str = " dp";
        } else if ((j & 9221401712017801216L) == 9221401712017801216L) {
            sb = new StringBuilder();
            sb.append((int) (j & 4294967295L));
            str = " px";
        } else if ((j & 9221683186994511872L) == 9221683186994511872L) {
            sb = new StringBuilder();
            sb.append(Float.intBitsToFloat((int) (j & 4294967295L)));
            str = " sp";
        } else {
            return "NaN";
        }
        sb.append(str);
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        long j = this.A00;
        if (!(obj instanceof C2Z3) || j != ((C2Z3) obj).A00) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j = this.A00;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        return A04(this.A00);
    }

    public /* synthetic */ C2Z3(long j) {
        this.A00 = j;
    }
}
