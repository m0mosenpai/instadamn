package X;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* loaded from: classes4.dex */
public final class ATQ implements View.OnTouchListener {
    public int A00 = -1;
    public MotionEvent A01;
    public final /* synthetic */ AK9 A02;

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        MotionEvent obtainNoHistory;
        C14360o3.A0B(motionEvent, 1);
        AK9 ak9 = this.A02;
        View view2 = ak9.A02;
        if (view2.getVisibility() == 0) {
            return view2.dispatchTouchEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            obtainNoHistory = null;
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    MotionEvent motionEvent2 = this.A01;
                    if (motionEvent2 != null) {
                        if (this.A00 < 0) {
                            this.A00 = ViewConfiguration.get(view2.getContext()).getScaledTouchSlop();
                        }
                        float x = motionEvent2.getX() - motionEvent.getX();
                        float y = motionEvent2.getY() - motionEvent.getY();
                        if (Math.sqrt((x * x) + (y * y)) >= this.A00) {
                            view2.dispatchTouchEvent(this.A01);
                            this.A01 = null;
                        }
                    }
                    view2.dispatchTouchEvent(motionEvent);
                }
            } else {
                if (this.A01 != null) {
                    C55982hj c55982hj = ak9.A06.A01;
                    c55982hj.A06 = true;
                    c55982hj.A06(0.8999999761581421d);
                    c55982hj.A08(1.0d, false);
                }
                view2.dispatchTouchEvent(motionEvent);
            }
            return true;
        }
        obtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
        this.A01 = obtainNoHistory;
        return true;
    }

    public ATQ(AK9 ak9) {
        this.A02 = ak9;
    }
}
