package X;

/* renamed from: X.Avj, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24649Avj implements Runnable {
    public final /* synthetic */ InterfaceC25207BDf A00;
    public final /* synthetic */ String A01;

    public RunnableC24649Avj(InterfaceC25207BDf interfaceC25207BDf, String str) {
        this.A00 = interfaceC25207BDf;
        this.A01 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC25207BDf interfaceC25207BDf = this.A00;
        interfaceC25207BDf.onFinish();
        interfaceC25207BDf.DqC(this.A01);
    }
}
