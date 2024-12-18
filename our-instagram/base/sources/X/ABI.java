package X;

/* loaded from: classes4.dex */
public final class ABI {
    public final Object A00;
    public final InterfaceC74963Ym A01;
    public final ABI A02;

    public final boolean A00() {
        if (this.A01.getValue() == this.A00) {
            ABI abi = this.A02;
            if (abi != null && abi.A00()) {
                return true;
            }
            return false;
        }
        return true;
    }

    public ABI(InterfaceC74963Ym interfaceC74963Ym, ABI abi) {
        this.A01 = interfaceC74963Ym;
        this.A02 = abi;
        this.A00 = interfaceC74963Ym.getValue();
    }
}
