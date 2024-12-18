package X;

import android.os.SystemClock;

/* renamed from: X.WwM, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71572WwM implements Runnable {
    public final XDK A00;
    public final Object A01;
    public final /* synthetic */ C70783Wgw A02;

    public RunnableC71572WwM(C70783Wgw c70783Wgw, XDK xdk, Object obj) {
        C14360o3.A0B(xdk, 2);
        this.A02 = c70783Wgw;
        this.A00 = xdk;
        this.A01 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        SystemClock.elapsedRealtime();
        this.A00.DVo(this.A01);
    }
}
