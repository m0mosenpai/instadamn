package X;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: X.IkM, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class ViewOnTouchListenerC42053IkM implements View.OnTouchListener {
    public final /* synthetic */ InterfaceC11380iw A00;
    public final /* synthetic */ InterfaceC144936gD A01;

    public ViewOnTouchListenerC42053IkM(InterfaceC11380iw interfaceC11380iw, InterfaceC144936gD interfaceC144936gD) {
        this.A01 = interfaceC144936gD;
        this.A00 = interfaceC11380iw;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            this.A01.D6L(AbstractC166997dE.A0L(view), this.A00, motionEvent.getRawX(), motionEvent.getRawY());
        }
        return true;
    }
}
