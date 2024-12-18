package X;

/* renamed from: X.8m8, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8m8 {
    public String A01 = "unknown";
    public boolean A02 = true;
    public String A00 = "";

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C8m8) {
                C8m8 c8m8 = (C8m8) obj;
                if (!C14360o3.A0K(this.A01, c8m8.A01) || this.A02 != c8m8.A02 || !C14360o3.A0K(this.A00, c8m8.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FxSurfaceToXpostEligibility(surface=");
        sb.append(this.A01);
        sb.append(", isEligible=");
        sb.append(this.A02);
        sb.append(", ineligibleReason=");
        sb.append(this.A00);
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.A01.hashCode() * 31;
        int i = 1237;
        if (this.A02) {
            i = 1231;
        }
        return ((hashCode + i) * 31) + this.A00.hashCode();
    }
}
