package X;

import android.view.MotionEvent;
import android.view.View;
import java.util.List;

/* loaded from: classes8.dex */
public final class LQO implements View.OnTouchListener {
    public final /* synthetic */ L5R A00;

    public LQO(L5R l5r) {
        this.A00 = l5r;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        L5R l5r = this.A00;
        boolean onTouchEvent = l5r.A0C.onTouchEvent(motionEvent);
        float rawX = l5r.A00 - motionEvent.getRawX();
        float rawY = l5r.A01 - motionEvent.getRawY();
        if (!l5r.A08 && !l5r.A07) {
            boolean z = false;
            boolean A1O = AbstractC167007dF.A1O((AbstractC43594JPz.A00(rawX, rawY) > l5r.A0B ? 1 : (AbstractC43594JPz.A00(rawX, rawY) == l5r.A0B ? 0 : -1)));
            double A01 = AbstractC43594JPz.A01(rawY, rawX);
            if (A1O) {
                if (A01 < 45.0d) {
                    l5r.A07 = true;
                } else {
                    if (l5r.A01 > l5r.A0A) {
                        z = true;
                    }
                    l5r.A08 = z;
                }
            }
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 1 && actionMasked != 3) {
            return onTouchEvent;
        }
        int i = 0;
        while (true) {
            List list = l5r.A0G;
            if (i < list.size()) {
                ((InterfaceC1829689r) list.get(i)).DJG(l5r.A03, l5r.A04, l5r.A00, l5r.A01, l5r.A02, l5r.A07, l5r.A08);
                i++;
            } else {
                l5r.A02 = 0.0f;
                l5r.A03 = 0.0f;
                l5r.A04 = 0.0f;
                return onTouchEvent;
            }
        }
    }
}
