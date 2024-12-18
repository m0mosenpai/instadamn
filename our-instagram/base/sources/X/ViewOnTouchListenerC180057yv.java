package X;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: X.7yv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class ViewOnTouchListenerC180057yv implements View.OnTouchListener {
    public C174867qM A00;

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C174867qM c174867qM = this.A00;
        if (c174867qM != null) {
            return c174867qM.A02(motionEvent);
        }
        return false;
    }
}
