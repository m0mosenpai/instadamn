package X;

import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.instagram.common.ui.base.IgSimpleImageView;

/* renamed from: X.ATc, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC23267ATc implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ IgSimpleImageView A00;
    public final /* synthetic */ C23709Aei A01;

    public ViewTreeObserverOnGlobalLayoutListenerC23267ATc(IgSimpleImageView igSimpleImageView, C23709Aei c23709Aei) {
        this.A00 = igSimpleImageView;
        this.A01 = c23709Aei;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        IgSimpleImageView igSimpleImageView = this.A00;
        ViewTreeObserver viewTreeObserver = igSimpleImageView.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeOnGlobalLayoutListener(this);
        }
        C23709Aei c23709Aei = this.A01;
        igSimpleImageView.setLayoutParams(new FrameLayout.LayoutParams(c23709Aei.A0G, c23709Aei.A0F));
    }
}
