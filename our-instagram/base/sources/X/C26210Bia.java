package X;

/* renamed from: X.Bia, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26210Bia extends C0T6 implements InterfaceC30824Dgz {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26210Bia) {
                C26210Bia c26210Bia = (C26210Bia) obj;
                if (!C14360o3.A0K(this.A02, c26210Bia.A02) || !C14360o3.A0K(this.A00, c26210Bia.A00) || !C14360o3.A0K(this.A01, c26210Bia.A01) || !C14360o3.A0K(this.A03, c26210Bia.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((AbstractC166997dE.A0K(this.A00, AbstractC166987dD.A0J(this.A02)) + AbstractC167017dG.A0O(this.A01)) * 31) + AbstractC25227BEk.A07(this.A03);
    }

    public C26210Bia(String str, String str2, String str3, String str4) {
        AbstractC167017dG.A1P(str, str2);
        this.A02 = str;
        this.A00 = str2;
        this.A01 = str3;
        this.A03 = str4;
    }
}
