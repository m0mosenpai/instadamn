package X;

import android.view.MotionEvent;

/* renamed from: X.3PH, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3PH implements Runnable {
    public MotionEvent A00;
    public boolean A01;
    public final C3PF A02;

    @Override // java.lang.Runnable
    public final void run() {
        this.A01 = true;
        MotionEvent motionEvent = this.A00;
        if (motionEvent != null) {
            C3PF.A00(motionEvent, this.A02);
            motionEvent.recycle();
            this.A00 = null;
        }
    }

    public C3PH(C3PF c3pf) {
        this.A02 = c3pf;
    }
}
