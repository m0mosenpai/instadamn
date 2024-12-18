package X;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes8.dex */
public final class LQQ implements View.OnTouchListener {
    public final GestureDetector A00;

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C14360o3.A0B(motionEvent, 1);
        return this.A00.onTouchEvent(motionEvent);
    }

    public LQQ(C4FM c4fm, C44768Jrp c44768Jrp, boolean z) {
        this.A00 = new GestureDetector(AbstractC31172DnG.A05(c44768Jrp), new C44402Jjf(c4fm, c44768Jrp, z));
    }
}
