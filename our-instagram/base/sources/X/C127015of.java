package X;

/* renamed from: X.5of, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C127015of {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final String A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C127015of) {
                C127015of c127015of = (C127015of) obj;
                if (!C14360o3.A0K(this.A02, c127015of.A02) || this.A01 != c127015of.A01 || this.A00 != c127015of.A00 || !C14360o3.A0K(this.A03, c127015of.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Object obj = this.A02;
        return ((((((obj == null ? 0 : obj.hashCode()) * 31) + this.A01) * 31) + this.A00) * 31) + this.A03.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Range(item=");
        sb.append(this.A02);
        sb.append(", start=");
        sb.append(this.A01);
        sb.append(", end=");
        sb.append(this.A00);
        sb.append(", tag=");
        sb.append(this.A03);
        sb.append(')');
        return sb.toString();
    }

    public C127015of(Object obj, int i, int i2) {
        this(obj, "", i, i2);
    }

    public C127015of(Object obj, String str, int i, int i2) {
        this.A02 = obj;
        this.A01 = i;
        this.A00 = i2;
        this.A03 = str;
        if (i <= i2) {
        } else {
            throw new IllegalArgumentException("Reversed range is not supported");
        }
    }
}
