package X;

/* renamed from: X.KUy, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45947KUy extends AbstractC46449Kh9 {
    public final C1NB A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C45947KUy) {
                C45947KUy c45947KUy = (C45947KUy) obj;
                if (!C14360o3.A0K(this.A02, c45947KUy.A02) || !C14360o3.A0K(this.A04, c45947KUy.A04) || !C14360o3.A0K(this.A00, c45947KUy.A00) || !C14360o3.A0K(this.A03, c45947KUy.A03) || !C14360o3.A0K(this.A01, c45947KUy.A01) || !C14360o3.A0K(this.A05, c45947KUy.A05)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC25226BEj.A03(this.A05, (AbstractC166997dE.A0K(this.A03, AbstractC166997dE.A0J(this.A00, AbstractC166997dE.A0K(this.A04, AbstractC166987dD.A0J(this.A02)))) + AbstractC167017dG.A0O(this.A01)) * 31);
    }

    public C45947KUy(C1NB c1nb, String str, String str2, String str3, String str4, String str5) {
        AbstractC25234BEr.A1P(str, str2, str3);
        C14360o3.A0B(str5, 6);
        this.A02 = str;
        this.A04 = str2;
        this.A00 = c1nb;
        this.A03 = str3;
        this.A01 = str4;
        this.A05 = str5;
    }
}
