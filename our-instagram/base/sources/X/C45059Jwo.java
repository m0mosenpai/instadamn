package X;

/* renamed from: X.Jwo, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45059Jwo extends C0T6 {
    public final int A00;
    public final int A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C45059Jwo) {
                C45059Jwo c45059Jwo = (C45059Jwo) obj;
                if (!C14360o3.A0K(this.A06, c45059Jwo.A06) || !C14360o3.A0K(this.A07, c45059Jwo.A07) || !C14360o3.A0K(this.A02, c45059Jwo.A02) || !C14360o3.A0K(this.A05, c45059Jwo.A05) || !C14360o3.A0K(this.A03, c45059Jwo.A03) || this.A01 != c45059Jwo.A01 || this.A00 != c45059Jwo.A00 || !C14360o3.A0K(this.A04, c45059Jwo.A04)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC25226BEj.A03(this.A04, (((AbstractC166997dE.A0K(this.A03, AbstractC166997dE.A0K(this.A05, AbstractC166997dE.A0K(this.A02, AbstractC166997dE.A0K(this.A07, AbstractC166987dD.A0J(this.A06))))) + this.A01) * 31) + this.A00) * 31);
    }

    public C45059Jwo(String str, String str2, String str3, String str4, String str5, String str6, int i, int i2) {
        JQ0.A1O(str, str2, str3, str4, str5);
        C14360o3.A0B(str6, 8);
        this.A06 = str;
        this.A07 = str2;
        this.A02 = str3;
        this.A05 = str4;
        this.A03 = str5;
        this.A01 = i;
        this.A00 = i2;
        this.A04 = str6;
    }
}
