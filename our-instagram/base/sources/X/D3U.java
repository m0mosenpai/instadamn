package X;

import android.os.Handler;
import java.util.TimerTask;

/* loaded from: classes5.dex */
public final class D3U extends TimerTask {
    public final /* synthetic */ Handler A00;
    public final /* synthetic */ Runnable A01;

    public D3U(Handler handler, Runnable runnable) {
        this.A00 = handler;
        this.A01 = runnable;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        this.A00.post(this.A01);
    }
}
