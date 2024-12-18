package X;

import android.view.GestureDetector;
import android.view.MotionEvent;
import com.facebook.rtc.views.omnigridview.OmniGridView;

/* renamed from: X.Mbe, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50772Mbe extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ OmniGridView A00;

    public C50772Mbe(OmniGridView omniGridView) {
        this.A00 = omniGridView;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        OmniGridView omniGridView = this.A00;
        InterfaceC57800PkS interfaceC57800PkS = omniGridView.A06;
        if (interfaceC57800PkS != null) {
            ((C55751OpK) interfaceC57800PkS).A00.A00().A00.A04.A05(PE2.A00);
        }
        return AbstractC167007dF.A1W(omniGridView.A06);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        OmniGridView omniGridView = this.A00;
        InterfaceC57800PkS interfaceC57800PkS = omniGridView.A06;
        if (interfaceC57800PkS != null) {
            ((C55751OpK) interfaceC57800PkS).A00.A00().A00.A04.A07(PCY.A00);
        }
        return AbstractC167007dF.A1W(omniGridView.A06);
    }
}
