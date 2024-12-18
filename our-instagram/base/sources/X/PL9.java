package X;

/* loaded from: classes9.dex */
public final class PL9 implements Runnable {
    public final /* synthetic */ C55742OpB A00;

    public PL9(C55742OpB c55742OpB) {
        this.A00 = c55742OpB;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C55742OpB c55742OpB = this.A00;
        c55742OpB.A01 = -1;
        InterfaceC16820sZ interfaceC16820sZ = c55742OpB.A03;
        if (interfaceC16820sZ != null) {
            interfaceC16820sZ.invoke();
        }
    }
}
