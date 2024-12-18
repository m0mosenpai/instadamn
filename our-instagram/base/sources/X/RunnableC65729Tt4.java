package X;

import android.os.Handler;
import android.os.SystemClock;

/* renamed from: X.Tt4, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC65729Tt4 implements Runnable {
    public int A00;
    public long A01;
    public Handler A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ C65714Tsn A04;

    public RunnableC65729Tt4(C65714Tsn c65714Tsn, int i) {
        this.A04 = c65714Tsn;
        this.A03 = i;
        SystemClock.elapsedRealtime();
    }

    public final void A00(Handler handler) {
        this.A02 = handler;
        this.A01 = SystemClock.elapsedRealtime();
        int i = this.A00 + 1;
        this.A00 = i;
        this.A04.A03.markerPoint(566768946, this.A03, AnonymousClass001.A0O("post_ping_", i));
        Handler handler2 = this.A02;
        C14360o3.A0A(handler2);
        handler2.post(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (SystemClock.elapsedRealtime() - this.A01 >= 20 && this.A00 < 10) {
            A00(this.A02);
            return;
        }
        C65714Tsn c65714Tsn = this.A04;
        if (c65714Tsn.A04 != null) {
            String str = C26771Rh.A00().A00;
            C14360o3.A07(str);
            c65714Tsn.A03.markerAnnotate(566768946, this.A03, "completion_endpoint", str);
        }
        c65714Tsn.A03.markerEnd(566768946, this.A03, (short) 2);
    }
}
