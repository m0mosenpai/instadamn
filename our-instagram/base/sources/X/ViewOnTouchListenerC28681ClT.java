package X;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: X.ClT, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class ViewOnTouchListenerC28681ClT implements View.OnTouchListener {
    public final /* synthetic */ C84823qW A00;
    public final /* synthetic */ InterfaceC145486h7 A01;

    public ViewOnTouchListenerC28681ClT(C84823qW c84823qW, InterfaceC145486h7 interfaceC145486h7) {
        this.A01 = interfaceC145486h7;
        this.A00 = c84823qW;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0) {
            return this.A01.Ddk(this.A00, (int) motionEvent.getRawX(), (int) motionEvent.getRawY());
        }
        return false;
    }
}
