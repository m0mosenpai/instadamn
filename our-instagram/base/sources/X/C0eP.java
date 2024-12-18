package X;

/* renamed from: X.0eP, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0eP {
    public final int A00;
    public final Object A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C0eP) {
                C0eP c0eP = (C0eP) obj;
                if (this.A00 != c0eP.A00 || !C14360o3.A0K(this.A01, c0eP.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = this.A00 * 31;
        Object obj = this.A01;
        return i + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("IndexedValue(index=");
        sb.append(this.A00);
        sb.append(", value=");
        sb.append(this.A01);
        sb.append(')');
        return sb.toString();
    }

    public C0eP(int i, Object obj) {
        this.A00 = i;
        this.A01 = obj;
    }
}
