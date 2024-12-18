package X;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: X.Dtp, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class ViewOnTouchListenerC31564Dtp implements View.OnTouchListener {
    public final /* synthetic */ C72q A00;

    public ViewOnTouchListenerC31564Dtp(C72q c72q) {
        this.A00 = c72q;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C72q c72q = this.A00;
        EnumC31556Dtg enumC31556Dtg = EnumC31556Dtg.A05;
        C14360o3.A0A(motionEvent);
        return c72q.A07(motionEvent, enumC31556Dtg);
    }
}
