package X;

/* loaded from: classes6.dex */
public final class EPJ extends AbstractC33529Es3 {
    public final int A00;
    public final String A01;
    public final String A02;
    public final boolean A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof EPJ) {
                EPJ epj = (EPJ) obj;
                if (!C14360o3.A0K(this.A01, epj.A01) || !C14360o3.A0K(this.A02, epj.A02) || this.A00 != epj.A00 || this.A03 != epj.A03) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A03, (AbstractC166997dE.A0K(this.A02, AbstractC167017dG.A0O(this.A01) * 31) + this.A00) * 31);
    }

    public EPJ(String str, String str2, int i, boolean z) {
        this.A01 = str;
        this.A02 = str2;
        this.A00 = i;
        this.A03 = z;
    }
}
