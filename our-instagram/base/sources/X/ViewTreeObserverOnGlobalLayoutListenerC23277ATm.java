package X;

import android.view.ViewTreeObserver;
import com.instagram.common.ui.widget.imageview.RoundedCornerImageView;

/* renamed from: X.ATm, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC23277ATm implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ float A00;
    public final /* synthetic */ float A01;
    public final /* synthetic */ float A02;
    public final /* synthetic */ RoundedCornerImageView A03;

    public ViewTreeObserverOnGlobalLayoutListenerC23277ATm(RoundedCornerImageView roundedCornerImageView, float f, float f2, float f3) {
        this.A03 = roundedCornerImageView;
        this.A00 = f;
        this.A01 = f2;
        this.A02 = f3;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        RoundedCornerImageView roundedCornerImageView = this.A03;
        AbstractC166997dE.A1K(roundedCornerImageView, this);
        roundedCornerImageView.setPivotX(roundedCornerImageView.getMeasuredWidth());
        roundedCornerImageView.setPivotY(roundedCornerImageView.getMeasuredHeight());
        roundedCornerImageView.setRotation(this.A00);
        float f = this.A01;
        roundedCornerImageView.setScaleX(f);
        roundedCornerImageView.setScaleY(f);
        roundedCornerImageView.setTranslationX(this.A02);
    }
}
