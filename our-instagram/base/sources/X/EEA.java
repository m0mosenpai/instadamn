package X;

/* loaded from: classes6.dex */
public final class EEA extends AbstractC46377Kfz {
    public final String A00;
    public final String A01;
    public final String A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof EEA) {
                EEA eea = (EEA) obj;
                if (!C14360o3.A0K(this.A02, eea.A02) || !C14360o3.A0K(this.A00, eea.A00) || !C14360o3.A0K(this.A01, eea.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166997dE.A0K(this.A00, AbstractC166987dD.A0J(this.A02)) + AbstractC167017dG.A0O(this.A01);
    }

    public EEA(String str, String str2, String str3) {
        this.A02 = str;
        this.A00 = str2;
        this.A01 = str3;
    }
}
