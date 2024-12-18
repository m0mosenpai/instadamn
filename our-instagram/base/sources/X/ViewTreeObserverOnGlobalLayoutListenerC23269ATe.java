package X;

import android.view.ViewTreeObserver;

/* renamed from: X.ATe, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC23269ATe implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ C194648jP A00;
    public final /* synthetic */ boolean A01;

    public ViewTreeObserverOnGlobalLayoutListenerC23269ATe(C194648jP c194648jP, boolean z) {
        this.A00 = c194648jP;
        this.A01 = z;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        C194648jP c194648jP = this.A00;
        if (c194648jP.A03) {
            c194648jP.A02(this.A01);
        }
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = c194648jP.A01;
        if (onGlobalLayoutListener != null) {
            AbstractC166997dE.A1K(c194648jP.A0D, onGlobalLayoutListener);
        }
    }
}
