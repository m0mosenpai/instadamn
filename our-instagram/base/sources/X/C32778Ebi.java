package X;

/* renamed from: X.Ebi, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32778Ebi extends FKR {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C32778Ebi) {
                C32778Ebi c32778Ebi = (C32778Ebi) obj;
                if (!C14360o3.A0K(this.A03, c32778Ebi.A03) || !C14360o3.A0K(this.A00, c32778Ebi.A00) || !C14360o3.A0K(this.A02, c32778Ebi.A02) || !C14360o3.A0K(this.A01, c32778Ebi.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public C32778Ebi(String str, String str2, String str3, String str4) {
        super(C2EY.A1U, str);
        this.A03 = str;
        this.A00 = str2;
        this.A02 = str3;
        this.A01 = str4;
    }

    public final int hashCode() {
        return (((((AbstractC167017dG.A0O(this.A03) * 31) + AbstractC167017dG.A0O(this.A00)) * 31) + AbstractC167017dG.A0O(this.A02)) * 31) + AbstractC25227BEk.A07(this.A01);
    }
}
