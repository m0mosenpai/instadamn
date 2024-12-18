package X;

import android.app.Activity;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;

/* renamed from: X.LQx, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC48097LQx implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final String A04;

    public ViewTreeObserverOnGlobalLayoutListenerC48097LQx(Activity activity, FrameLayout frameLayout, C43750JWm c43750JWm, String str, int i) {
        this.A00 = i;
        if (i != 0) {
            this.A03 = c43750JWm;
            this.A02 = frameLayout;
        } else {
            this.A02 = frameLayout;
            this.A03 = c43750JWm;
        }
        this.A01 = activity;
        this.A04 = str;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        if (this.A00 != 0) {
            C43750JWm c43750JWm = (C43750JWm) this.A03;
            AbstractC166997dE.A1K(c43750JWm.A04, this);
            C43750JWm.A00((Activity) this.A01, (FrameLayout) this.A02, c43750JWm, this.A04);
            return;
        }
        FrameLayout frameLayout = (FrameLayout) this.A02;
        AbstractC166997dE.A1K(frameLayout, this);
        C43750JWm.A00((Activity) this.A01, frameLayout, (C43750JWm) this.A03, this.A04);
    }
}
