package X;

import android.view.ViewTreeObserver;
import com.facebook.litho.widget.LithoScrollView;

/* renamed from: X.TvF, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class ViewTreeObserverOnPreDrawListenerC65854TvF implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ C65853TvE A00;
    public final /* synthetic */ LithoScrollView A01;

    public ViewTreeObserverOnPreDrawListenerC65854TvF(C65853TvE c65853TvE, LithoScrollView lithoScrollView) {
        this.A01 = lithoScrollView;
        this.A00 = c65853TvE;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        LithoScrollView lithoScrollView = this.A01;
        lithoScrollView.setScrollY(this.A00.A00);
        ViewTreeObserver viewTreeObserver = lithoScrollView.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(this);
            return true;
        }
        return true;
    }
}
