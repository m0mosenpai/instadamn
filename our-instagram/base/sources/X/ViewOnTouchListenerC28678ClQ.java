package X;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: X.ClQ, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class ViewOnTouchListenerC28678ClQ implements View.OnTouchListener {
    public final C101094gP A00;

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C14360o3.A0B(motionEvent, 1);
        return this.A00.DGb(motionEvent);
    }

    public ViewOnTouchListenerC28678ClQ(C101044gK c101044gK, C905741s c905741s, C75113Zb c75113Zb) {
        this.A00 = (C101094gP) ((InterfaceC16620sF) c101044gK.A04.A09).invoke(c905741s, c75113Zb);
    }
}
