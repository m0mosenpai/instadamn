package X;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: X.IkO, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class ViewOnTouchListenerC42055IkO implements View.OnTouchListener {
    public final /* synthetic */ InterfaceC11380iw A00;
    public final /* synthetic */ C41181vS A01;
    public final /* synthetic */ InterfaceC144936gD A02;

    public ViewOnTouchListenerC42055IkO(InterfaceC11380iw interfaceC11380iw, C41181vS c41181vS, InterfaceC144936gD interfaceC144936gD) {
        this.A02 = interfaceC144936gD;
        this.A00 = interfaceC11380iw;
        this.A01 = c41181vS;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            this.A02.DTW(AbstractC166997dE.A0L(view), this.A00, this.A01, motionEvent.getRawX(), motionEvent.getRawY());
        }
        return true;
    }
}
