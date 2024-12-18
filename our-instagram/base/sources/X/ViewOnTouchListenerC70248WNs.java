package X;

import android.view.MotionEvent;
import android.view.View;
import android.widget.PopupWindow;

/* renamed from: X.WNs, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class ViewOnTouchListenerC70248WNs implements View.OnTouchListener {
    public final /* synthetic */ WPW A00;

    public ViewOnTouchListenerC70248WNs(WPW wpw) {
        this.A00 = wpw;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        if (action == 0) {
            WPW wpw = this.A00;
            PopupWindow popupWindow = wpw.A09;
            if (popupWindow != null && popupWindow.isShowing() && x >= 0 && x < popupWindow.getWidth() && y >= 0 && y < popupWindow.getHeight()) {
                wpw.A0I.postDelayed(wpw.A0K, 250L);
                return false;
            }
            return false;
        }
        if (action != 1) {
            return false;
        }
        WPW wpw2 = this.A00;
        wpw2.A0I.removeCallbacks(wpw2.A0K);
        return false;
    }
}
