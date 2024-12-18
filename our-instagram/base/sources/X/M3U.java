package X;

/* loaded from: classes8.dex */
public final class M3U implements Runnable {
    public final /* synthetic */ InterfaceC25207BDf A00;
    public final /* synthetic */ Throwable A01;

    public M3U(InterfaceC25207BDf interfaceC25207BDf, Throwable th) {
        this.A00 = interfaceC25207BDf;
        this.A01 = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC25207BDf interfaceC25207BDf = this.A00;
        if (interfaceC25207BDf != null) {
            interfaceC25207BDf.onFinish();
            interfaceC25207BDf.DFi((Exception) this.A01);
        }
    }
}
