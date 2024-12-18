package X;

import android.os.Handler;
import java.util.concurrent.TimeUnit;

/* renamed from: X.Wgw, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70783Wgw implements XDK {
    public final long A00;
    public final Handler A01 = new Handler();
    public final XDK A02;

    public C70783Wgw(XDK xdk, TimeUnit timeUnit) {
        this.A02 = xdk;
        this.A00 = timeUnit.toMillis(250L);
    }

    @Override // X.XDK
    public final void DVo(Object obj) {
        long j = this.A00;
        Handler handler = this.A01;
        handler.removeCallbacksAndMessages(null);
        handler.postDelayed(new RunnableC71572WwM(this, this.A02, obj), j);
    }

    @Override // X.XDK
    public final void onComplete() {
        this.A02.onComplete();
        this.A01.removeCallbacksAndMessages(null);
    }

    @Override // X.XDK
    public final void onError(Throwable th) {
        this.A02.onError(th);
        this.A01.removeCallbacksAndMessages(null);
    }
}
