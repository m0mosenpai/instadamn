package X;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: X.WNv, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class ViewOnTouchListenerC70250WNv implements View.OnTouchListener {
    public final /* synthetic */ C65958TxA A00;
    public final /* synthetic */ C38011Gnx A01;

    public ViewOnTouchListenerC70250WNv(C65958TxA c65958TxA, C38011Gnx c38011Gnx) {
        this.A00 = c65958TxA;
        this.A01 = c38011Gnx;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C65958TxA c65958TxA = this.A00;
        C14360o3.A0A(view);
        C14360o3.A0A(motionEvent);
        int bindingAdapterPosition = this.A01.getBindingAdapterPosition();
        AbstractC167017dG.A1N(view, motionEvent);
        return c65958TxA.A00.D5U(motionEvent, view, c65958TxA.A01, bindingAdapterPosition);
    }
}
