package X;

import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes4.dex */
public final class ATI implements View.OnTouchListener {
    public final /* synthetic */ C86863ty A00;

    public ATI(C86863ty c86863ty) {
        this.A00 = c86863ty;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        AbstractC167007dF.A1K(view, motionEvent);
        if (motionEvent.getAction() == 0) {
            C75113Zb c75113Zb = this.A00.A03;
            if (false != c75113Zb.A25) {
                c75113Zb.A25 = false;
            }
            view.getParent().requestDisallowInterceptTouchEvent(false);
        }
        return false;
    }
}
