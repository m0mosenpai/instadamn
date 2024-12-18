package X;

/* renamed from: X.Mw4, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51860Mw4 extends C0T6 implements InterfaceC57855PlL {
    public final boolean A00;
    public final boolean A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51860Mw4) {
                C51860Mw4 c51860Mw4 = (C51860Mw4) obj;
                if (this.A01 != c51860Mw4.A01 || this.A00 != c51860Mw4.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A00, AbstractC25225BEi.A08(this.A01));
    }

    public C51860Mw4(boolean z, boolean z2) {
        this.A01 = z;
        this.A00 = z2;
    }
}
