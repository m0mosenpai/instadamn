package X;

import android.view.ViewTreeObserver;
import com.instagram.common.ui.base.IgSimpleImageView;

/* renamed from: X.LQz, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class ViewTreeObserverOnPreDrawListenerC48099LQz implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ IgSimpleImageView A00;
    public final /* synthetic */ C7GN A01;

    public ViewTreeObserverOnPreDrawListenerC48099LQz(IgSimpleImageView igSimpleImageView, C7GN c7gn) {
        this.A00 = igSimpleImageView;
        this.A01 = c7gn;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        IgSimpleImageView igSimpleImageView = this.A00;
        igSimpleImageView.getViewTreeObserver().removeOnPreDrawListener(this);
        C7GN.A03(igSimpleImageView, this.A01);
        return true;
    }
}
