package X;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: X.ATh, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC23272ATh implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ C8J8 A02;

    public ViewTreeObserverOnGlobalLayoutListenerC23272ATh(View view, C8J8 c8j8, int i) {
        this.A02 = c8j8;
        this.A00 = i;
        this.A01 = view;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        ((C8J9) this.A02).A01.A08(this.A00);
        AbstractC166997dE.A1K(this.A01, this);
    }
}
