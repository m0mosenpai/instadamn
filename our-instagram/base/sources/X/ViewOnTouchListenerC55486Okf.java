package X;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

/* renamed from: X.Okf, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class ViewOnTouchListenerC55486Okf implements View.OnTouchListener {
    public final /* synthetic */ GestureDetector A00;
    public final /* synthetic */ C56161OwT A01;

    public ViewOnTouchListenerC55486Okf(GestureDetector gestureDetector, C56161OwT c56161OwT) {
        this.A00 = gestureDetector;
        this.A01 = c56161OwT;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C50947MfG c50947MfG;
        C141796aw A00;
        int i;
        this.A00.onTouchEvent(motionEvent);
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1) {
                c50947MfG = this.A01.A00;
                if (c50947MfG != null) {
                    if (!MSZ.A1a(c50947MfG.A01.A02)) {
                        A00 = AbstractC141776au.A00(c50947MfG);
                        i = 4;
                        PYu.A01(c50947MfG, A00, i);
                    }
                }
                C14360o3.A0F("viewModel");
                throw C00O.createAndThrow();
            }
        } else {
            c50947MfG = this.A01.A00;
            if (c50947MfG != null) {
                A00 = AbstractC141776au.A00(c50947MfG);
                i = 3;
                PYu.A01(c50947MfG, A00, i);
            }
            C14360o3.A0F("viewModel");
            throw C00O.createAndThrow();
        }
        return true;
    }
}
