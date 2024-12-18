package X;

/* renamed from: X.Cyb, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29461Cyb implements InterfaceC30839DhE {
    public final Iterable A00;
    public final InterfaceC16660sJ A01;
    public final InterfaceC16620sF A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C29461Cyb) {
                C29461Cyb c29461Cyb = (C29461Cyb) obj;
                if (!C14360o3.A0K(this.A00, c29461Cyb.A00) || !C14360o3.A0K(this.A01, c29461Cyb.A01) || !C14360o3.A0K(this.A02, c29461Cyb.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A02, AbstractC166997dE.A0J(this.A01, AbstractC166987dD.A0G(this.A00)));
    }

    public C29461Cyb(Iterable iterable, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16620sF interfaceC16620sF) {
        this.A00 = iterable;
        this.A01 = interfaceC16660sJ;
        this.A02 = interfaceC16620sF;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("Children(items=");
        A1C.append(this.A00);
        A1C.append(", id=");
        A1C.append(this.A01);
        A1C.append(", componentFunction=");
        return AbstractC167017dG.A0o(this.A02, A1C);
    }
}
