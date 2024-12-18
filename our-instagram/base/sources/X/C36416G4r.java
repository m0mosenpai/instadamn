package X;

import android.view.MotionEvent;
import com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout;

/* renamed from: X.G4r, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36416G4r implements C7QJ {
    public final /* synthetic */ FOK A00;

    @Override // X.C7QJ
    public final /* bridge */ /* synthetic */ void DTA(MotionEvent motionEvent, Object obj, boolean z) {
        boolean A1R = AbstractC167007dF.A1R(0, obj, motionEvent);
        FOK fok = this.A00;
        C32716Eah c32716Eah = fok.A01;
        if (c32716Eah != null) {
            TouchInterceptorFrameLayout touchInterceptorFrameLayout = fok.A00;
            if (touchInterceptorFrameLayout == null) {
                C14360o3.A0F("cardView");
                throw C00O.createAndThrow();
            }
            touchInterceptorFrameLayout.performHapticFeedback(0);
            LFb lFb = LFb.A00;
            float rawX = motionEvent.getRawX();
            float rawY = motionEvent.getRawY();
            lFb.A00(fok.A05.requireActivity(), fok.A06, c32716Eah.A01, fok.A07, fok.A09, c32716Eah.A08, "questions", rawX, rawY, A1R);
        }
    }

    public C36416G4r(FOK fok) {
        this.A00 = fok;
    }

    @Override // X.C7QJ
    public final /* bridge */ /* synthetic */ boolean DBa(Object obj) {
        return false;
    }

    @Override // X.C7QJ
    public final /* bridge */ /* synthetic */ boolean DT5(MotionEvent motionEvent, Object obj) {
        return false;
    }

    @Override // X.C7QJ
    public final /* bridge */ /* synthetic */ boolean Dtz(MotionEvent motionEvent, Object obj) {
        return false;
    }
}
