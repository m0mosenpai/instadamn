package X;

/* renamed from: X.6El, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6El {
    public int A00;
    public final int A01;
    public final Object A02;
    public final String A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C6El) {
                C6El c6El = (C6El) obj;
                if (!C14360o3.A0K(this.A02, c6El.A02) || this.A01 != c6El.A01 || this.A00 != c6El.A00 || !C14360o3.A0K(this.A03, c6El.A03)) {
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
        sb.append("MutableRange(item=");
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

    public final C127015of A00(int i) {
        int i2 = this.A00;
        if (i2 == Integer.MIN_VALUE) {
            if (i == Integer.MIN_VALUE) {
                throw new IllegalStateException("Item.end should be set first");
            }
        } else {
            i = i2;
        }
        return new C127015of(this.A02, this.A03, this.A01, i);
    }

    public C6El(Object obj, String str, int i, int i2) {
        this.A02 = obj;
        this.A01 = i;
        this.A00 = i2;
        this.A03 = str;
    }
}
