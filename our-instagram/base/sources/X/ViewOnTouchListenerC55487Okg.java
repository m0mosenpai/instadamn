package X;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

/* renamed from: X.Okg, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class ViewOnTouchListenerC55487Okg implements View.OnTouchListener {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public ViewOnTouchListenerC55487Okg(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj;
        this.A01 = obj2;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.A00) {
            case 0:
                boolean A1R = AbstractC167007dF.A1R(0, view, motionEvent);
                OM7 om7 = (OM7) this.A02;
                View view2 = (View) this.A01;
                C56236Oxj c56236Oxj = om7.A02;
                if (c56236Oxj != null) {
                    c56236Oxj.CJr(view, motionEvent);
                }
                if (motionEvent.getActionMasked() == 0) {
                    om7.A00 = 0;
                } else if (motionEvent.getActionMasked() == 2) {
                    int i = om7.A00 + 1;
                    om7.A00 = i;
                    if (i > 10) {
                        view2.setVisibility(0);
                        om7.A03.CoQ();
                    }
                } else if (motionEvent.getActionMasked() == A1R) {
                    view2.setVisibility(4);
                }
                if (motionEvent.getActionMasked() == A1R && om7.A00 < 10) {
                    om7.A03.onClick(view);
                    return false;
                }
                return false;
            case 1:
                boolean onTouchEvent = ((GestureDetector) this.A02).onTouchEvent(motionEvent);
                int actionMasked = motionEvent.getActionMasked();
                if (actionMasked != 1 && actionMasked != 3) {
                    return onTouchEvent;
                }
                ((InterfaceC145436h2) this.A01).Dwo(onTouchEvent);
                return onTouchEvent;
            default:
                if (((OMc) this.A02).A03) {
                    return ((GestureDetector) this.A01).onTouchEvent(motionEvent);
                }
                return false;
        }
    }
}
