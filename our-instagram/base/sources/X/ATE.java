package X;

import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes4.dex */
public final class ATE implements View.OnTouchListener {
    public final /* synthetic */ C88R A00;

    public ATE(C88R c88r) {
        this.A00 = c88r;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C88R c88r = this.A00;
        c88r.A09.A03();
        c88r.A0B.E4u(new C188068Ux());
        return false;
    }
}
