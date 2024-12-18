package X;

/* loaded from: classes10.dex */
public final class QIf extends C0T6 {
    public boolean A03 = false;
    public String A01 = null;
    public String A00 = null;
    public String A02 = null;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof QIf) {
                QIf qIf = (QIf) obj;
                if (this.A03 != qIf.A03 || !C14360o3.A0K(this.A01, qIf.A01) || !C14360o3.A0K(this.A00, qIf.A00) || !C14360o3.A0K(this.A02, qIf.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = 1237;
        if (this.A03) {
            i = 1231;
        }
        return (((((i * 31) + AbstractC167017dG.A0O(this.A01)) * 31) + AbstractC167017dG.A0O(this.A00)) * 31) + AbstractC25227BEk.A07(this.A02);
    }
}
