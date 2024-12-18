package X;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* renamed from: X.Mbd, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50771Mbd extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ C56161OwT A00;

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        C141796aw A00;
        PYu pYu;
        C14360o3.A0B(motionEvent, 0);
        float x = motionEvent.getX();
        C56161OwT c56161OwT = this.A00;
        float A07 = AbstractC166987dD.A07(AbstractC166987dD.A0d(c56161OwT.A06)) / 2.0f;
        C50947MfG c50947MfG = c56161OwT.A00;
        if (x >= A07) {
            if (c50947MfG != null) {
                A00 = AbstractC141776au.A00(c50947MfG);
                pYu = new PYu(c50947MfG, null, 0);
                AbstractC166987dD.A1Z(pYu, A00);
                return true;
            }
            C14360o3.A0F("viewModel");
            throw C00O.createAndThrow();
        }
        if (c50947MfG != null) {
            A00 = AbstractC141776au.A00(c50947MfG);
            pYu = new PYu(c50947MfG, null, 7);
            AbstractC166987dD.A1Z(pYu, A00);
            return true;
        }
        C14360o3.A0F("viewModel");
        throw C00O.createAndThrow();
    }

    public C50771Mbd(C56161OwT c56161OwT) {
        this.A00 = c56161OwT;
    }
}
