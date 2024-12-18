package X;

import android.view.MotionEvent;

/* loaded from: classes5.dex */
public final class C5Z extends ScaleGestureDetectorOnScaleGestureListenerC65851TvC {
    public final AbstractC25398BLp A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5Z(JPb jPb, InterfaceC31137Dmc interfaceC31137Dmc, AbstractC25398BLp abstractC25398BLp, C54650OCc c54650OCc) {
        super(abstractC25398BLp.A06, null, abstractC25398BLp.A0D, jPb, abstractC25398BLp.A0H, interfaceC31137Dmc, c54650OCc);
        AbstractC167027dH.A13(interfaceC31137Dmc, jPb, abstractC25398BLp);
        this.A00 = abstractC25398BLp;
    }

    @Override // X.ScaleGestureDetectorOnScaleGestureListenerC65851TvC, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        C14360o3.A0B(motionEvent, 0);
        this.A00.A08();
        super.onLongPress(motionEvent);
    }
}
