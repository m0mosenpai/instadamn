package X;

import android.view.ViewTreeObserver;

/* renamed from: X.IkZ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class ViewTreeObserverOnPreDrawListenerC42066IkZ implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ C148176ln A00;

    public ViewTreeObserverOnPreDrawListenerC42066IkZ(C148176ln c148176ln) {
        this.A00 = c148176ln;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        C148176ln c148176ln = this.A00;
        c148176ln.A0C.getViewTreeObserver().removeOnPreDrawListener(this);
        C148176ln.A0A(c148176ln);
        return false;
    }
}
