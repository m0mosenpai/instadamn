package X;

/* loaded from: classes12.dex */
public final class YHA implements Runnable {
    public final /* synthetic */ InterfaceC176207sd A00;
    public final /* synthetic */ Throwable A01;

    public YHA(InterfaceC176207sd interfaceC176207sd, Throwable th) {
        this.A00 = interfaceC176207sd;
        this.A01 = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A00.onError(this.A01);
    }
}
