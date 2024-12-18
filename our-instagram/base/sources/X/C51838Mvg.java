package X;

/* renamed from: X.Mvg, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51838Mvg extends C0T6 implements InterfaceC57833Pkz {
    public final EnumC53270Nh8 A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51838Mvg) {
                C51838Mvg c51838Mvg = (C51838Mvg) obj;
                if (!C14360o3.A0K(this.A01, c51838Mvg.A01) || this.A00 != c51838Mvg.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A00, AbstractC166987dD.A0J(this.A01));
    }

    public C51838Mvg(EnumC53270Nh8 enumC53270Nh8, String str) {
        AbstractC167017dG.A1P(str, enumC53270Nh8);
        this.A01 = str;
        this.A00 = enumC53270Nh8;
    }
}
