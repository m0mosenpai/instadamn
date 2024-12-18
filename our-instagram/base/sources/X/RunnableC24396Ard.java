package X;

/* renamed from: X.Ard, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24396Ard implements Runnable {
    public final /* synthetic */ InterfaceC25207BDf A00;

    public RunnableC24396Ard(InterfaceC25207BDf interfaceC25207BDf) {
        this.A00 = interfaceC25207BDf;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC25207BDf interfaceC25207BDf = this.A00;
        if (interfaceC25207BDf != null) {
            interfaceC25207BDf.onStart();
        }
    }
}
