package X;

import java.util.TimerTask;

/* loaded from: classes4.dex */
public final class B50 extends TimerTask {
    public final /* synthetic */ C51762Yz A00;

    public B50(C51762Yz c51762Yz) {
        this.A00 = c51762Yz;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        this.A00.A00();
    }
}
