package X;

import android.os.Handler;
import android.os.Looper;

/* renamed from: X.ApG, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24249ApG implements Runnable {
    public final /* synthetic */ AG6 A00;

    public RunnableC24249ApG(AG6 ag6) {
        this.A00 = ag6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AG6 ag6 = this.A00;
        InterfaceC178297w3 interfaceC178297w3 = ag6.A00;
        Runnable runnable = ag6.A01;
        Handler handler = ((C178267w0) interfaceC178297w3).A00;
        handler.removeCallbacks(runnable);
        RunnableC24250ApH runnableC24250ApH = new RunnableC24250ApH(ag6);
        if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
            handler.post(runnableC24250ApH);
        }
    }
}
