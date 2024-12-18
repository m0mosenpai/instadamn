package X;

import android.view.MotionEvent;
import android.view.VelocityTracker;

/* renamed from: X.6ns, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC149416ns {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public int A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public final VelocityTracker A08 = VelocityTracker.obtain();
    public final C141876b5 A09;
    public final C149396nq A0A;

    /* JADX WARN: Removed duplicated region for block: B:67:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A01(android.view.MotionEvent r13) {
        /*
            Method dump skipped, instructions count: 369
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC149416ns.A01(android.view.MotionEvent):boolean");
    }

    public AbstractC149416ns(C141876b5 c141876b5, C149396nq c149396nq) {
        this.A09 = c141876b5;
        this.A0A = c149396nq;
    }

    public final void A00(MotionEvent motionEvent) {
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.setLocation(motionEvent.getRawX(), motionEvent.getRawY());
        this.A08.addMovement(obtain);
    }
}
