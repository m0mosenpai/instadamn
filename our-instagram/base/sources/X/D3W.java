package X;

import java.util.TimerTask;

/* loaded from: classes5.dex */
public final class D3W extends TimerTask {
    public final /* synthetic */ C51762Yz A00;
    public final /* synthetic */ C26588Bol A01;

    public D3W(C51762Yz c51762Yz, C26588Bol c26588Bol) {
        this.A00 = c51762Yz;
        this.A01 = c26588Bol;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        this.A00.A03(DRP.A00(this.A01, 28));
    }
}
