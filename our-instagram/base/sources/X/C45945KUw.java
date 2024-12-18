package X;

/* renamed from: X.KUw, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45945KUw extends AbstractC46449Kh9 {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public C45945KUw(String str, String str2, String str3, String str4) {
        C14360o3.A0B(str2, 2);
        this.A03 = str;
        this.A02 = str2;
        this.A01 = str3;
        this.A00 = str4;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C45945KUw) {
                C45945KUw c45945KUw = (C45945KUw) obj;
                if (!C14360o3.A0K(this.A03, c45945KUw.A03) || !C14360o3.A0K(this.A02, c45945KUw.A02) || !C14360o3.A0K(this.A01, c45945KUw.A01) || !C14360o3.A0K(this.A00, c45945KUw.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166997dE.A0K(this.A01, AbstractC166997dE.A0K(this.A02, AbstractC166987dD.A0J(this.A03))) + AbstractC167017dG.A0O(this.A00);
    }
}
