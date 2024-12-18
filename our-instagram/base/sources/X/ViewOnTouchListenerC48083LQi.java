package X;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: X.LQi, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class ViewOnTouchListenerC48083LQi implements View.OnTouchListener {
    public static final ViewOnTouchListenerC48083LQi A00 = new ViewOnTouchListenerC48083LQi();

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        return AbstractC25230BEn.A1P((motionEvent.getY() > 0.0f ? 1 : (motionEvent.getY() == 0.0f ? 0 : -1)));
    }
}
