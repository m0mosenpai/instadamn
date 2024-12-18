package X;

import android.view.Surface;

/* renamed from: X.Wu3, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71441Wu3 implements Runnable {
    public final /* synthetic */ Surface A00;
    public final /* synthetic */ WL0 A01;

    public RunnableC71441Wu3(Surface surface, WL0 wl0) {
        this.A00 = surface;
        this.A01 = wl0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A00.release();
    }
}
