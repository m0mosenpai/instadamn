package X;

/* renamed from: X.9H6, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9H6 implements InterfaceC09250da, InterfaceC16660sJ {
    public final int A00;
    public final Object A01;

    public C9H6(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.InterfaceC16660sJ
    public final Object invoke(Object obj) {
        switch (this.A00) {
            case 1:
                ((C23845Agu) this.A01).A00((C47Z) obj);
                return C0eB.A00;
            case 2:
                C9GR.A08(((C187128Rf) this.A01).A0A.A05, 2131961168, 0);
                return C0eB.A00;
            case 3:
                return C2043892u.A00((C2043892u) this.A01, (InterfaceC23621Ds) obj);
            default:
                InterfaceC16660sJ interfaceC16660sJ = (InterfaceC16660sJ) this.A01;
                AbstractC167017dG.A1N(interfaceC16660sJ, obj);
                interfaceC16660sJ.invoke(obj);
                return C0eB.A00;
        }
    }
}
