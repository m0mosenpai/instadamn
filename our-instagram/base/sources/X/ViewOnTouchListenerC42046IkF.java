package X;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: X.IkF, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class ViewOnTouchListenerC42046IkF implements View.OnTouchListener {
    public final InterfaceC81103jf A00;

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C14360o3.A0B(motionEvent, 1);
        return this.A00.DGb(motionEvent);
    }

    public ViewOnTouchListenerC42046IkF(C38666Gz7 c38666Gz7, C41157IJw c41157IJw, IJZ ijz) {
        this.A00 = new C42613ItW(ijz.A01, ijz.A03.BQv(), c38666Gz7, c41157IJw);
    }
}
