package X;

/* renamed from: X.PRl, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class RunnableC57020PRl implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ AbstractC55102ObF A01;

    public RunnableC57020PRl(AbstractC55102ObF abstractC55102ObF, long j) {
        this.A01 = abstractC55102ObF;
        this.A00 = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC58005Pnp interfaceC58005Pnp = this.A01.A02;
        if (interfaceC58005Pnp != null) {
            interfaceC58005Pnp.DCi(this.A00);
        }
    }
}
