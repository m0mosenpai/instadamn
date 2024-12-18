package X;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: X.Okc, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class ViewOnTouchListenerC55483Okc implements View.OnTouchListener {
    public final /* synthetic */ C31349DqE A00;
    public final /* synthetic */ C3O0 A01;

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C14360o3.A0B(motionEvent, 1);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    C3O0 c3o0 = this.A01;
                    float y = c3o0.A00 - motionEvent.getY();
                    float f = c3o0.A02;
                    ((C55982hj) c3o0.A0N.getValue()).A06(Math.min((f + y) / f, 1.0d));
                }
                return false;
            }
            C3O0 c3o02 = this.A01;
            float y2 = c3o02.A00 - motionEvent.getY();
            float f2 = c3o02.A02;
            if ((f2 + y2) / f2 < 0.75d) {
                c3o02.A09(this.A00);
                return true;
            }
            ((C55982hj) c3o02.A0N.getValue()).A06(1.0d);
            return true;
        }
        this.A01.A00 = motionEvent.getY();
        return true;
    }

    public ViewOnTouchListenerC55483Okc(C31349DqE c31349DqE, C3O0 c3o0) {
        this.A01 = c3o0;
        this.A00 = c31349DqE;
    }
}
