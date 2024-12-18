package X;

/* renamed from: X.Mw5, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51861Mw5 extends C0T6 implements InterfaceC57855PlL {
    public final boolean A00;
    public final boolean A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51861Mw5) {
                C51861Mw5 c51861Mw5 = (C51861Mw5) obj;
                if (this.A00 != c51861Mw5.A00 || this.A01 != c51861Mw5.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A01, AbstractC25225BEi.A08(this.A00));
    }

    public C51861Mw5(boolean z, boolean z2) {
        this.A00 = z;
        this.A01 = z2;
    }
}
