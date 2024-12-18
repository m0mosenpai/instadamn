package X;

import android.view.MotionEvent;

/* renamed from: X.Tvd, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC65874Tvd implements Runnable {
    public final /* synthetic */ MotionEvent A00;
    public final /* synthetic */ ScaleGestureDetectorOnScaleGestureListenerC65851TvC A01;

    public RunnableC65874Tvd(MotionEvent motionEvent, ScaleGestureDetectorOnScaleGestureListenerC65851TvC scaleGestureDetectorOnScaleGestureListenerC65851TvC) {
        this.A01 = scaleGestureDetectorOnScaleGestureListenerC65851TvC;
        this.A00 = motionEvent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ScaleGestureDetectorOnScaleGestureListenerC65851TvC scaleGestureDetectorOnScaleGestureListenerC65851TvC = this.A01;
        scaleGestureDetectorOnScaleGestureListenerC65851TvC.A01 = C05F.A00;
        XEZ xez = scaleGestureDetectorOnScaleGestureListenerC65851TvC.A06;
        C120985dq c120985dq = scaleGestureDetectorOnScaleGestureListenerC65851TvC.A04;
        C37644Ghd C09 = scaleGestureDetectorOnScaleGestureListenerC65851TvC.A05.C09(c120985dq);
        MotionEvent motionEvent = this.A00;
        xez.DQg(c120985dq, C09, motionEvent.getX(), motionEvent.getY());
    }
}
