package X;

import com.facebook.litho.LithoView;

/* renamed from: X.D1t, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class RunnableC29592D1t implements Runnable {
    public final /* synthetic */ LithoView A00;
    public final /* synthetic */ C138746Qe A01;

    public RunnableC29592D1t(LithoView lithoView, C138746Qe c138746Qe) {
        this.A00 = lithoView;
        this.A01 = c138746Qe;
    }

    @Override // java.lang.Runnable
    public final void run() {
        LithoView lithoView = this.A00;
        lithoView.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC28688Cla(0, lithoView, this.A01));
    }
}
