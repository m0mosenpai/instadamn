package X;

/* renamed from: X.2YH, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2YH {
    public final Long A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C2YH) {
                C2YH c2yh = (C2YH) obj;
                if (!C14360o3.A0K(this.A01, c2yh.A01) || !C14360o3.A0K(this.A00, c2yh.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.A01.hashCode() * 31;
        Long l = this.A00;
        return hashCode + (l == null ? 0 : l.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Preference(key=");
        sb.append(this.A01);
        sb.append(", value=");
        sb.append(this.A00);
        sb.append(')');
        return sb.toString();
    }

    public C2YH(String str, Long l) {
        this.A01 = str;
        this.A00 = l;
    }
}
