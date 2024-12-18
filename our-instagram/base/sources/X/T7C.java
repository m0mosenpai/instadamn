package X;

/* loaded from: classes10.dex */
public final class T7C implements YO1 {
    public final int A00;
    public final Object A01;

    public T7C(int i, InterfaceC16660sJ interfaceC16660sJ) {
        this.A00 = i;
        this.A01 = interfaceC16660sJ;
    }

    @Override // X.YO1
    public final void onSuccess(Object obj) {
        InterfaceC16660sJ interfaceC16660sJ;
        switch (this.A00) {
            case 0:
                interfaceC16660sJ = (InterfaceC16660sJ) this.A01;
                C14360o3.A0B(interfaceC16660sJ, 0);
                break;
            case 1:
            case 2:
            case 3:
            case 4:
                interfaceC16660sJ = (InterfaceC16660sJ) this.A01;
                break;
            default:
                return;
        }
        interfaceC16660sJ.invoke(obj);
    }
}
