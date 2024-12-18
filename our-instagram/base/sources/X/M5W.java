package X;

/* loaded from: classes8.dex */
public final class M5W implements Runnable {
    public final /* synthetic */ C47812L9u A00;
    public final /* synthetic */ InterfaceC16820sZ A01;
    public final /* synthetic */ InterfaceC16660sJ A02;

    public M5W(C47812L9u c47812L9u, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16660sJ interfaceC16660sJ) {
        this.A00 = c47812L9u;
        this.A02 = interfaceC16660sJ;
        this.A01 = interfaceC16820sZ;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C47812L9u c47812L9u = this.A00;
        c47812L9u.A01();
        this.A02.invoke(AbstractC166997dE.A0p(c47812L9u.A04, 2131958914));
        this.A01.invoke();
    }
}
