package X;

/* renamed from: X.59r, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1132959r {
    public final int A00;
    public final long A01;
    public final String A02;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AbstractC1132959r abstractC1132959r = (AbstractC1132959r) obj;
        if (this.A00 != abstractC1132959r.A00 || !C14360o3.A0K(this.A02, abstractC1132959r.A02) || this.A01 != abstractC1132959r.A01) {
            return false;
        }
        return true;
    }

    public final float A00(int i) {
        if (this instanceof C1132859q) {
            return ((C1132859q) this).A00;
        }
        if (this instanceof C5A7) {
            if (i != 0) {
                return 0.5f;
            }
            return 1.0f;
        }
        if (this instanceof C5A5) {
            return 2.0f;
        }
        if (i != 0) {
            return 128.0f;
        }
        return 100.0f;
    }

    public final float A01(int i) {
        float f;
        if (this instanceof C1132859q) {
            return ((C1132859q) this).A01;
        }
        if (this instanceof C5A7) {
            f = -0.5f;
        } else {
            if (this instanceof C5A5) {
                return -2.0f;
            }
            f = -128.0f;
        }
        if (i != 0) {
            return f;
        }
        return 0.0f;
    }

    public int hashCode() {
        int hashCode = this.A02.hashCode() * 31;
        long j = this.A01;
        return ((hashCode + ((int) (j ^ (j >>> 32)))) * 31) + this.A00;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.A02);
        sb.append(" (id=");
        sb.append(this.A00);
        sb.append(", model=");
        long j = this.A01;
        if (j == AbstractC1133459w.A02) {
            str = "Rgb";
        } else if (j == AbstractC1133459w.A03) {
            str = "Xyz";
        } else if (j == AbstractC1133459w.A01) {
            str = "Lab";
        } else if (j == AbstractC1133459w.A00) {
            str = "Cmyk";
        } else {
            str = "Unknown";
        }
        sb.append((Object) str);
        sb.append(')');
        return sb.toString();
    }

    public AbstractC1132959r(int i, String str, long j) {
        this.A02 = str;
        this.A01 = j;
        this.A00 = i;
        if (str.length() == 0) {
            throw new IllegalArgumentException("The name of a color space cannot be null and must contain at least 1 character");
        }
    }
}
