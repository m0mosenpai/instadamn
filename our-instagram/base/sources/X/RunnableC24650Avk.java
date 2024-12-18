package X;

/* renamed from: X.Avk, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24650Avk implements Runnable {
    public final /* synthetic */ InterfaceC25207BDf A00;
    public final /* synthetic */ Throwable A01;

    public RunnableC24650Avk(InterfaceC25207BDf interfaceC25207BDf, Throwable th) {
        this.A00 = interfaceC25207BDf;
        this.A01 = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC25207BDf interfaceC25207BDf = this.A00;
        interfaceC25207BDf.onFinish();
        interfaceC25207BDf.DFi(new Exception(this.A01));
    }
}
