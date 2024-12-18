package X;

/* loaded from: classes8.dex */
public final class K2H extends C0T6 implements MNE {
    public final int A00;
    public final String A01;
    public final String A02;

    public K2H(String str, String str2, int i) {
        this.A00 = i;
        this.A02 = str;
        this.A01 = str2;
    }

    public final boolean equals(Object obj) {
        int i;
        switch (this.A00) {
            case 0:
                if (this != obj) {
                    i = 0;
                    break;
                } else {
                    return true;
                }
            case 1:
                if (this != obj) {
                    i = 1;
                    break;
                } else {
                    return true;
                }
            default:
                if (this != obj) {
                    i = 2;
                    break;
                } else {
                    return true;
                }
        }
        if (obj instanceof K2H) {
            K2H k2h = (K2H) obj;
            if (k2h.A00 != i || !C14360o3.A0K(this.A02, k2h.A02) || !C14360o3.A0K(this.A01, k2h.A01)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0J(this.A02) + AbstractC167017dG.A0O(this.A01);
    }
}
