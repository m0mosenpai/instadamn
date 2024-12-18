package X;

/* renamed from: X.MrD, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51620MrD extends C0T6 {
    public final int A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51620MrD) {
                C51620MrD c51620MrD = (C51620MrD) obj;
                if (!C14360o3.A0K(this.A03, c51620MrD.A03) || !C14360o3.A0K(this.A05, c51620MrD.A05) || !C14360o3.A0K(this.A02, c51620MrD.A02) || !C14360o3.A0K(this.A01, c51620MrD.A01) || !C14360o3.A0K(this.A04, c51620MrD.A04) || this.A00 != c51620MrD.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166997dE.A0K(this.A04, AbstractC166997dE.A0K(this.A01, AbstractC166997dE.A0K(this.A02, AbstractC166997dE.A0K(this.A05, AbstractC166987dD.A0J(this.A03))))) + this.A00;
    }

    public C51620MrD(String str, String str2, String str3, String str4, String str5, int i) {
        this.A03 = str;
        this.A05 = str2;
        this.A02 = str3;
        this.A01 = str4;
        this.A04 = str5;
        this.A00 = i;
    }
}
