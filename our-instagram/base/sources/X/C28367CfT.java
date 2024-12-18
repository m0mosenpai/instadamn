package X;

/* renamed from: X.CfT, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28367CfT {
    public static final C28367CfT A03 = new C28367CfT(null, null, null);
    public final InterfaceC16660sJ A00;
    public final InterfaceC16660sJ A01;
    public final InterfaceC16660sJ A02;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28367CfT)) {
            return false;
        }
        C28367CfT c28367CfT = (C28367CfT) obj;
        return this.A00 == c28367CfT.A00 && this.A01 == c28367CfT.A01 && this.A02 == c28367CfT.A02;
    }

    public final int hashCode() {
        int i = 0;
        int A05 = AbstractC25225BEi.A05(AbstractC25235BEs.A06(this.A00) * 31 * 31, AbstractC25235BEs.A06(this.A01)) * 31;
        InterfaceC16660sJ interfaceC16660sJ = this.A02;
        if (interfaceC16660sJ != null) {
            i = interfaceC16660sJ.hashCode();
        }
        return A05 + i;
    }

    public C28367CfT(InterfaceC16660sJ interfaceC16660sJ, InterfaceC16660sJ interfaceC16660sJ2, InterfaceC16660sJ interfaceC16660sJ3) {
        this.A00 = interfaceC16660sJ;
        this.A01 = interfaceC16660sJ2;
        this.A02 = interfaceC16660sJ3;
    }

    public C28367CfT() {
        this(null, null, null);
    }
}
