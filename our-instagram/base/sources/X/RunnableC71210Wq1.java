package X;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;

/* renamed from: X.Wq1, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71210Wq1 implements Runnable {
    public final /* synthetic */ WO8 A00;

    public RunnableC71210Wq1(WO8 wo8) {
        this.A00 = wo8;
    }

    @Override // java.lang.Runnable
    public final void run() {
        WO8 wo8 = this.A00;
        WO8.A00(wo8);
        View view = wo8.A07;
        if (view.isEnabled() && !view.isLongClickable() && wo8.A02()) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            view.onTouchEvent(obtain);
            obtain.recycle();
            wo8.A03 = true;
        }
    }
}
