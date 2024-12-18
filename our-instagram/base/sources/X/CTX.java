package X;

/* loaded from: classes5.dex */
public final class CTX {
    public final InterfaceC138166Nw A00;

    public final boolean A00(int i) {
        if (i >= 0) {
            InterfaceC138166Nw interfaceC138166Nw = this.A00;
            if (i < ((C6Nv) interfaceC138166Nw).A00) {
                C6Nx AXC = interfaceC138166Nw.AXC(i);
                InterfaceC16660sJ interfaceC16660sJ = ((C28759Cmr) AXC.A02).A00;
                return interfaceC16660sJ != null && interfaceC16660sJ.invoke(Integer.valueOf(i - AXC.A01)) == C28146Cat.A00;
            }
        }
        return false;
    }

    public CTX(InterfaceC138166Nw interfaceC138166Nw) {
        this.A00 = interfaceC138166Nw;
    }
}
