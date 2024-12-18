package X;

/* loaded from: classes10.dex */
public final class QIg extends C0T6 {
    public String A00 = null;
    public final int A01;
    public final String A02;
    public final String A03;

    public QIg(String str, String str2, int i) {
        this.A01 = i;
        this.A02 = str;
        this.A03 = str2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof QIg) {
                QIg qIg = (QIg) obj;
                if (this.A01 != qIg.A01 || !C14360o3.A0K(this.A02, qIg.A02) || !C14360o3.A0K(this.A03, qIg.A03) || !C14360o3.A0K(this.A00, qIg.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (AbstractC25225BEi.A05(((this.A01 * 31) + AbstractC167017dG.A0O(this.A02)) * 31, AbstractC167017dG.A0O(this.A03)) * 31 * 31) + AbstractC25227BEk.A07(this.A00);
    }
}
