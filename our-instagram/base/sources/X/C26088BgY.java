package X;

/* renamed from: X.BgY, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26088BgY extends C0T6 implements InterfaceC30923Dia {
    public final EnumC191908em A00;
    public final boolean A01;

    public C26088BgY(EnumC191908em enumC191908em, boolean z) {
        C14360o3.A0B(enumC191908em, 1);
        this.A00 = enumC191908em;
        this.A01 = z;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26088BgY) {
                C26088BgY c26088BgY = (C26088BgY) obj;
                if (this.A00 != c26088BgY.A00 || this.A01 != c26088BgY.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A01, AbstractC166987dD.A0G(this.A00));
    }

    @Override // X.InterfaceC30923Dia
    public final boolean CSM() {
        return this.A01;
    }
}
