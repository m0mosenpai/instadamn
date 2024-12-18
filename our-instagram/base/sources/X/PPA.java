package X;

/* loaded from: classes9.dex */
public final class PPA implements Runnable {
    public final /* synthetic */ C37662Ghv A00;

    public PPA(C37662Ghv c37662Ghv) {
        this.A00 = c37662Ghv;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC16820sZ interfaceC16820sZ = this.A00.A01;
        if (interfaceC16820sZ != null) {
            interfaceC16820sZ.invoke();
        }
    }
}
