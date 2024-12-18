package X;

/* renamed from: X.AxH, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24733AxH implements Runnable {
    public final /* synthetic */ AbstractC223559ty A00;
    public final /* synthetic */ InterfaceC25203BDb A01;
    public final /* synthetic */ C176097sS A02;

    public RunnableC24733AxH(AbstractC223559ty abstractC223559ty, InterfaceC25203BDb interfaceC25203BDb, C176097sS c176097sS) {
        this.A02 = c176097sS;
        this.A00 = abstractC223559ty;
        this.A01 = interfaceC25203BDb;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C212409b9 c212409b9;
        AbstractC223559ty abstractC223559ty = this.A00;
        boolean z = abstractC223559ty instanceof C212409b9;
        InterfaceC25203BDb interfaceC25203BDb = this.A01;
        if (z) {
            c212409b9 = (C212409b9) abstractC223559ty;
        } else {
            c212409b9 = new C212409b9(abstractC223559ty);
        }
        interfaceC25203BDb.D2K(c212409b9);
    }
}
