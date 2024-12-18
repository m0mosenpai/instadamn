package X;

/* renamed from: X.Muc, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51772Muc extends C0T6 implements InterfaceC58209PrF {
    public final String A00;
    public final String A01;
    public final boolean A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51772Muc) {
                C51772Muc c51772Muc = (C51772Muc) obj;
                if (!C14360o3.A0K(this.A00, c51772Muc.A00) || !C14360o3.A0K(this.A01, c51772Muc.A01) || this.A02 != c51772Muc.A02) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A02, AbstractC166997dE.A0K(this.A01, AbstractC166987dD.A0J(this.A00)));
    }

    public C51772Muc(String str, String str2, boolean z) {
        AbstractC167017dG.A1P(str, str2);
        this.A00 = str;
        this.A01 = str2;
        this.A02 = z;
    }
}
