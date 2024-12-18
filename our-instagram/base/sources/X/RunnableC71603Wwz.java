package X;

import android.view.InputEvent;

/* renamed from: X.Wwz, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71603Wwz implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ W4R A01;
    public final /* synthetic */ Long A02;
    public final /* synthetic */ String A03;

    public RunnableC71603Wwz(W4R w4r, Long l, String str, long j) {
        this.A01 = w4r;
        this.A00 = j;
        this.A03 = str;
        this.A02 = l;
    }

    @Override // java.lang.Runnable
    public final void run() {
        W4R w4r = this.A01;
        try {
            InputEvent inputEvent = (InputEvent) ((C106974ry) w4r.A01.A01(C106974ry.class, C106984rz.A00)).A00.takeFirst();
            if (inputEvent != null) {
                W4R.A00(inputEvent, w4r, this.A02, this.A03, this.A00);
                return;
            }
        } catch (InterruptedException unused) {
        }
        w4r.A00.flowEndFail(this.A00, "EVENT_FETCH_FAILED", null);
    }
}
