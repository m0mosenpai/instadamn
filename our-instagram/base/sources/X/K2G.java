package X;

/* loaded from: classes8.dex */
public final class K2G extends C0T6 implements MNE {
    public final String A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof K2G) {
                K2G k2g = (K2G) obj;
                if (!C14360o3.A0K(this.A00, k2g.A00) || !C14360o3.A0K(this.A01, k2g.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC25225BEi.A05(AbstractC167017dG.A0O(this.A00) * 31, AbstractC167017dG.A0O(this.A01));
    }

    public K2G(String str, String str2) {
        this.A00 = str;
        this.A01 = str2;
    }
}
