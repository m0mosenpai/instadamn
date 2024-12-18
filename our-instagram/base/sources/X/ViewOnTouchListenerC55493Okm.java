package X;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: X.Okm, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class ViewOnTouchListenerC55493Okm implements View.OnTouchListener {
    public static final ViewOnTouchListenerC55493Okm A00 = new ViewOnTouchListenerC55493Okm();

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        return AbstractC25230BEn.A1P((motionEvent.getY() > 0.0f ? 1 : (motionEvent.getY() == 0.0f ? 0 : -1)));
    }
}
