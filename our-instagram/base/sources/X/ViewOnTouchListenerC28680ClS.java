package X;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: X.ClS, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class ViewOnTouchListenerC28680ClS implements View.OnTouchListener {
    public final /* synthetic */ C41181vS A00;
    public final /* synthetic */ InterfaceC145416h0 A01;

    public ViewOnTouchListenerC28680ClS(C41181vS c41181vS, InterfaceC145416h0 interfaceC145416h0) {
        this.A01 = interfaceC145416h0;
        this.A00 = c41181vS;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0) {
            this.A01.DMY(this.A00, motionEvent.getRawX(), motionEvent.getRawY());
            return false;
        }
        return false;
    }
}
