package X;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: X.Wv1, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71497Wv1 implements Runnable {
    public final /* synthetic */ MotionEvent A00;
    public final /* synthetic */ WjE A01;

    public RunnableC71497Wv1(MotionEvent motionEvent, WjE wjE) {
        this.A01 = wjE;
        this.A00 = motionEvent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        WjE wjE = this.A01;
        View view = wjE.A01;
        view.getLocationOnScreen(WjE.A06);
        MotionEvent motionEvent = this.A00;
        view.setPivotX(motionEvent.getRawX() - r4[0]);
        view.setPivotY(motionEvent.getRawY() - r4[1]);
        wjE.A03.A09(0.92f);
        wjE.A04.A09(0.92f);
        C65726Tt0 c65726Tt0 = wjE.A02;
        if (c65726Tt0 != null) {
            c65726Tt0.A09(0.5f);
        }
        wjE.A00 = null;
    }
}
