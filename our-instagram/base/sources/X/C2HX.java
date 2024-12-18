package X;

import java.math.BigDecimal;

/* renamed from: X.2HX, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2HX extends Number {
    public final String A00;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2HX)) {
            return false;
        }
        String str = this.A00;
        String str2 = ((C2HX) obj).A00;
        return str == str2 || str.equals(str2);
    }

    @Override // java.lang.Number
    public final double doubleValue() {
        return Double.parseDouble(this.A00);
    }

    @Override // java.lang.Number
    public final float floatValue() {
        return Float.parseFloat(this.A00);
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    @Override // java.lang.Number
    public final int intValue() {
        try {
            try {
                return Integer.parseInt(this.A00);
            } catch (NumberFormatException unused) {
                return (int) Long.parseLong(this.A00);
            }
        } catch (NumberFormatException unused2) {
            return new BigDecimal(this.A00).intValue();
        }
    }

    @Override // java.lang.Number
    public final long longValue() {
        try {
            return Long.parseLong(this.A00);
        } catch (NumberFormatException unused) {
            return new BigDecimal(this.A00).longValue();
        }
    }

    public final String toString() {
        return this.A00;
    }

    public C2HX(String str) {
        this.A00 = str;
    }
}
