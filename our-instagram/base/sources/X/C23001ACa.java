package X;

/* renamed from: X.ACa, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23001ACa {
    public final EnumC222969sb A00;
    public final InterfaceC179077xJ A01;
    public final C1125456i A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C23001ACa) {
                C23001ACa c23001ACa = (C23001ACa) obj;
                if (!C14360o3.A0K(this.A01, c23001ACa.A01) || !C14360o3.A0K(this.A02, c23001ACa.A02) || this.A00 != c23001ACa.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public C23001ACa(InterfaceC179077xJ interfaceC179077xJ, C1125456i c1125456i) {
        EnumC222969sb enumC222969sb = EnumC222969sb.A0A;
        this.A01 = interfaceC179077xJ;
        this.A02 = c1125456i;
        this.A00 = enumC222969sb;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A00, AbstractC166997dE.A0J(this.A02, AbstractC166987dD.A0G(this.A01)));
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("TransitionEffect(mediaGraph=");
        A1C.append(this.A01);
        A1C.append(", timeRange=");
        A1C.append(this.A02);
        A1C.append(", effectType=");
        return AbstractC167017dG.A0o(this.A00, A1C);
    }
}
