package X;

import android.view.View;

/* renamed from: X.Tym, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66049Tym {
    public boolean A00;
    public final View A01;
    public final InterfaceC16820sZ A02;
    public final boolean A03;

    public C66049Tym(View view, InterfaceC16820sZ interfaceC16820sZ, boolean z) {
        C14360o3.A0B(view, 1);
        this.A01 = view;
        this.A02 = interfaceC16820sZ;
        this.A03 = z;
    }

    public final void A00() {
        if (!this.A00) {
            this.A00 = true;
            View view = this.A01;
            ViewTreeObserverOnDrawListenerC66039Tyb viewTreeObserverOnDrawListenerC66039Tyb = new ViewTreeObserverOnDrawListenerC66039Tyb(view, this.A02);
            view.getViewTreeObserver().addOnDrawListener(viewTreeObserverOnDrawListenerC66039Tyb);
            if (this.A03) {
                view.addOnAttachStateChangeListener(new BJ6(4, viewTreeObserverOnDrawListenerC66039Tyb, this));
            }
        }
    }
}
