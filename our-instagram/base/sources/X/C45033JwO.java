package X;

/* renamed from: X.JwO, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45033JwO extends C0T6 {
    public final C51761Mtk A00;
    public final EnumC46167Kc5 A01;
    public final EnumC46140Kbe A02;
    public final C45086JxG A03;

    public C45033JwO(C51761Mtk c51761Mtk, EnumC46167Kc5 enumC46167Kc5, EnumC46140Kbe enumC46140Kbe, C45086JxG c45086JxG) {
        AbstractC167027dH.A0a(1, enumC46140Kbe, enumC46167Kc5, c51761Mtk, c45086JxG);
        this.A02 = enumC46140Kbe;
        this.A01 = enumC46167Kc5;
        this.A00 = c51761Mtk;
        this.A03 = c45086JxG;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C45033JwO) {
                C45033JwO c45033JwO = (C45033JwO) obj;
                if (this.A02 != c45033JwO.A02 || this.A01 != c45033JwO.A01 || !C14360o3.A0K(this.A00, c45033JwO.A00) || !C14360o3.A0K(this.A03, c45033JwO.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A03, AbstractC166997dE.A0J(this.A00, AbstractC166997dE.A0J(this.A01, AbstractC166987dD.A0G(this.A02))));
    }
}
