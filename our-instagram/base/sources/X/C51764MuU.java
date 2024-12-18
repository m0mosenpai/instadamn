package X;

/* renamed from: X.MuU, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51764MuU extends C0T6 implements InterfaceC58104PpT {
    public final MVC A00;
    public final String A01;
    public final Integer A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51764MuU) {
                C51764MuU c51764MuU = (C51764MuU) obj;
                if (!C14360o3.A0K(this.A01, c51764MuU.A01) || this.A02 != c51764MuU.A02 || !C14360o3.A0K(this.A00, c51764MuU.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC58104PpT
    public final String Ar1() {
        return this.A01;
    }

    @Override // X.InterfaceC58104PpT
    public final Integer Ar7() {
        return this.A02;
    }

    @Override // X.InterfaceC58104PpT
    public final boolean Cff() {
        return false;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A00, (AbstractC166987dD.A0J(this.A01) + AbstractC53739Npr.A00(this.A02)) * 31);
    }

    public C51764MuU(MVC mvc, Integer num, String str) {
        AbstractC167017dG.A1P(str, num);
        this.A01 = str;
        this.A02 = num;
        this.A00 = mvc;
    }
}
