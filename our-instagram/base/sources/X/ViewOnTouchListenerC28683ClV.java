package X;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: X.ClV, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class ViewOnTouchListenerC28683ClV implements View.OnTouchListener {
    public final /* synthetic */ InterfaceC60442pS A00;
    public final /* synthetic */ CWU A01;
    public final /* synthetic */ C25993Beh A02;

    public ViewOnTouchListenerC28683ClV(InterfaceC60442pS interfaceC60442pS, CWU cwu, C25993Beh c25993Beh) {
        this.A01 = cwu;
        this.A02 = c25993Beh;
        this.A00 = interfaceC60442pS;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C14360o3.A0B(motionEvent, 1);
        if (motionEvent.getAction() == 0) {
            View.OnTouchListener A02 = this.A01.A02(this.A00, this.A02);
            if (A02 != null) {
                return A02.onTouch(view, motionEvent);
            }
            return false;
        }
        return false;
    }
}
