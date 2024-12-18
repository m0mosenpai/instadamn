package X;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes8.dex */
public final class LQW implements View.OnTouchListener {
    public final /* synthetic */ View A00;
    public final /* synthetic */ ViewGroup A01;

    public LQW(ViewGroup viewGroup, View view) {
        this.A00 = view;
        this.A01 = viewGroup;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        AbstractC43594JPz.A0G(view).withEndAction(new RunnableC49949M3q(this.A01, this.A00)).start();
        return true;
    }
}
