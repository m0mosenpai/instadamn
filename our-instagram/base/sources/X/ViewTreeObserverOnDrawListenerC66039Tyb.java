package X;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: X.Tyb, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class ViewTreeObserverOnDrawListenerC66039Tyb implements ViewTreeObserver.OnDrawListener {
    public boolean A00;
    public final View A01;
    public final InterfaceC16820sZ A02;

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        if (!this.A00) {
            this.A00 = true;
            Looper myLooper = Looper.myLooper();
            if (myLooper != null) {
                new Handler(myLooper).postAtFrontOfQueue(new RunnableC66050Tyn(this));
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
        this.A01.post(new RunnableC71393Wt2(this));
    }

    public ViewTreeObserverOnDrawListenerC66039Tyb(View view, InterfaceC16820sZ interfaceC16820sZ) {
        this.A01 = view;
        this.A02 = interfaceC16820sZ;
    }
}
