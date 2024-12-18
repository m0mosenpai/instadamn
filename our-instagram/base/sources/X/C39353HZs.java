package X;

/* renamed from: X.HZs, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39353HZs extends IN1 {
    public final IN1 A00;
    public final Integer A01;
    public final String A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C39353HZs) {
                C39353HZs c39353HZs = (C39353HZs) obj;
                if (!C14360o3.A0K(this.A02, c39353HZs.A02) || !C14360o3.A0K(this.A01, c39353HZs.A01) || !C14360o3.A0K(this.A00, c39353HZs.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public C39353HZs(IN1 in1, Integer num, String str) {
        super(in1.A01, C05F.A0u, str, "see_all", 1.0f);
        this.A02 = str;
        this.A01 = num;
        this.A00 = in1;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A00, AbstractC166997dE.A0J(this.A01, AbstractC166987dD.A0J(this.A02)) * 31 * 31);
    }
}
