package X;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: X.IkH, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class ViewOnTouchListenerC42048IkH implements View.OnTouchListener {
    public final /* synthetic */ C7ET A00;

    public ViewOnTouchListenerC42048IkH(C7ET c7et) {
        this.A00 = c7et;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C7ET.A03(motionEvent, this.A00);
        return true;
    }
}
