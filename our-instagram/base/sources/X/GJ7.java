package X;

/* loaded from: classes6.dex */
public final class GJ7 implements InterfaceC37205GaG {
    public final /* synthetic */ C6WQ A00;
    public final /* synthetic */ InterfaceC16820sZ A01;
    public final /* synthetic */ InterfaceC16820sZ A02;

    public GJ7(C6WQ c6wq, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2) {
        this.A00 = c6wq;
        this.A02 = interfaceC16820sZ;
        this.A01 = interfaceC16820sZ2;
    }

    @Override // X.InterfaceC37205GaG
    public final void DFj(Integer num) {
        this.A01.invoke();
    }

    @Override // X.InterfaceC37205GaG
    public final void onFinish() {
        this.A00.dismiss();
    }

    @Override // X.InterfaceC37205GaG
    public final void onStart() {
        C0fJ.A00(this.A00);
    }

    @Override // X.InterfaceC37205GaG
    public final void onSuccess() {
        this.A02.invoke();
    }
}
