package X;

import java.util.TimerTask;

/* loaded from: classes5.dex */
public final class D3V extends TimerTask {
    public final /* synthetic */ C51762Yz A00;
    public final /* synthetic */ C26568BoR A01;

    public D3V(C51762Yz c51762Yz, C26568BoR c26568BoR) {
        this.A00 = c51762Yz;
        this.A01 = c26568BoR;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        this.A00.A03(DRP.A00(this.A01, 6));
    }
}
