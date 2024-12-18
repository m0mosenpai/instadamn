package X;

import android.view.MotionEvent;
import android.view.View;
import com.instagram.user.model.User;

/* loaded from: classes8.dex */
public final class LQZ implements View.OnTouchListener {
    public final /* synthetic */ C6XW A00;
    public final /* synthetic */ User A01;

    public LQZ(C6XW c6xw, User user) {
        this.A00 = c6xw;
        this.A01 = user;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            int rawX = (int) motionEvent.getRawX();
            int rawY = (int) motionEvent.getRawY();
            InterfaceC16610sE interfaceC16610sE = this.A00.A04;
            if (interfaceC16610sE != null) {
                interfaceC16610sE.invoke(this.A01, Integer.valueOf(rawX), Integer.valueOf(rawY));
            }
            view.performClick();
            return true;
        }
        return false;
    }
}
