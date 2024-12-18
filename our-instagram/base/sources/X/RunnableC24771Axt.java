package X;

/* renamed from: X.Axt, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24771Axt implements Runnable {
    public final /* synthetic */ C174757qB A00;
    public final /* synthetic */ C9R2 A01;
    public final /* synthetic */ InterfaceC16820sZ A02;

    public RunnableC24771Axt(C174757qB c174757qB, C9R2 c9r2, InterfaceC16820sZ interfaceC16820sZ) {
        this.A00 = c174757qB;
        this.A01 = c9r2;
        this.A02 = interfaceC16820sZ;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A00.A0H.A00().setVisibility(0);
        this.A01.A01 = true;
        this.A02.invoke();
    }
}
