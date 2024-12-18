package X;

import android.view.ViewTreeObserver;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.Clb, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC28689Clb implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ float A00;
    public final /* synthetic */ float A01;
    public final /* synthetic */ IgImageView A02;

    public ViewTreeObserverOnGlobalLayoutListenerC28689Clb(IgImageView igImageView, float f, float f2) {
        this.A02 = igImageView;
        this.A00 = f;
        this.A01 = f2;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        IgImageView igImageView = this.A02;
        igImageView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        igImageView.setPivotX(igImageView.getMeasuredWidth());
        igImageView.setPivotY(igImageView.getMeasuredHeight());
        igImageView.setRotation(this.A00);
        float f = this.A01;
        igImageView.setScaleX(f);
        igImageView.setScaleY(f);
    }
}
