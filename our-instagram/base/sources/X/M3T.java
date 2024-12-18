package X;

/* loaded from: classes8.dex */
public final class M3T implements Runnable {
    public final /* synthetic */ InterfaceC25207BDf A00;
    public final /* synthetic */ String A01;

    public M3T(InterfaceC25207BDf interfaceC25207BDf, String str) {
        this.A00 = interfaceC25207BDf;
        this.A01 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC25207BDf interfaceC25207BDf = this.A00;
        if (interfaceC25207BDf != null) {
            interfaceC25207BDf.onFinish();
            interfaceC25207BDf.DqC(this.A01);
        }
    }
}
