package X;

import android.view.View;

/* renamed from: X.Tyn, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC66050Tyn implements Runnable {
    public final /* synthetic */ ViewTreeObserverOnDrawListenerC66039Tyb A00;

    public RunnableC66050Tyn(ViewTreeObserverOnDrawListenerC66039Tyb viewTreeObserverOnDrawListenerC66039Tyb) {
        this.A00 = viewTreeObserverOnDrawListenerC66039Tyb;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewTreeObserverOnDrawListenerC66039Tyb viewTreeObserverOnDrawListenerC66039Tyb = this.A00;
        viewTreeObserverOnDrawListenerC66039Tyb.A02.invoke();
        View view = viewTreeObserverOnDrawListenerC66039Tyb.A01;
        if (view.getViewTreeObserver().isAlive()) {
            view.getViewTreeObserver().removeOnDrawListener(viewTreeObserverOnDrawListenerC66039Tyb);
        }
    }
}
