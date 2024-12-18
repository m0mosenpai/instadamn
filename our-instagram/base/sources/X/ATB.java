package X;

import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes4.dex */
public final class ATB implements View.OnTouchListener {
    public final /* synthetic */ C23709Aei A00;

    public ATB(C23709Aei c23709Aei) {
        this.A00 = c23709Aei;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        View view2;
        View view3;
        C23709Aei c23709Aei = this.A00;
        if (c23709Aei.A04 == null && (view3 = c23709Aei.A02) != null) {
            AJq.A00(view3);
        }
        if (c23709Aei.A03 == null && (view2 = c23709Aei.A01) != null) {
            AJq.A00(view2);
        }
        view.performClick();
        return true;
    }
}
