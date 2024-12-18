package X;

/* renamed from: X.SOf, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62739SOf {
    public final InterfaceC65512Tlh A00;
    public final InterfaceC16660sJ A01;

    public C62739SOf(InterfaceC65512Tlh interfaceC65512Tlh, InterfaceC16660sJ interfaceC16660sJ) {
        C14360o3.A0B(interfaceC65512Tlh, 1);
        this.A00 = interfaceC65512Tlh;
        this.A01 = interfaceC16660sJ;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C62739SOf) {
                C62739SOf c62739SOf = (C62739SOf) obj;
                if (!C14360o3.A0K(this.A00, c62739SOf.A00) || !C14360o3.A0K(this.A01, c62739SOf.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A01, AbstractC166987dD.A0G(this.A00));
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("MediatorEntry(observable=");
        A1C.append(this.A00);
        A1C.append(", callback=");
        return AbstractC167017dG.A0o(this.A01, A1C);
    }
}
