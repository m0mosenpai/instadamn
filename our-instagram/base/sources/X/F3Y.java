package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.DecelerateInterpolator;
import com.facebook.R;
import com.instagram.common.ui.base.IgSimpleImageView;

/* loaded from: classes6.dex */
public abstract class F3Y {
    public static final void A00(Drawable drawable, View view, IgSimpleImageView igSimpleImageView, InterfaceC16820sZ interfaceC16820sZ) {
        AbstractC167007dF.A1K(igSimpleImageView, view);
        Context A0L = AbstractC166997dE.A0L(igSimpleImageView);
        float A00 = AbstractC13690mv.A00(A0L, 30.0f);
        if (drawable != null) {
            igSimpleImageView.setImageDrawable(drawable);
        } else {
            igSimpleImageView.setImageResource(R.drawable.instagram_heart_pano_filled_24);
        }
        AbstractC31173DnH.A11(A0L, igSimpleImageView, R.color.igds_creation_tools_pink);
        igSimpleImageView.setVisibility(0);
        igSimpleImageView.setScaleX(0.0f);
        igSimpleImageView.setScaleY(0.0f);
        if (view.getVisibility() != 0) {
            view.setVisibility(4);
        }
        float A002 = AbstractC13690mv.A00(A0L, 4.5f);
        ViewPropertyAnimator interpolator = igSimpleImageView.animate().scaleX(2.0f).scaleY(2.0f).translationY(-A00).setDuration(300L).setInterpolator(new DecelerateInterpolator());
        C14360o3.A07(interpolator);
        interpolator.withEndAction(new GO3(igSimpleImageView, new RunnableC36967GQk(view, igSimpleImageView, new GLP(view), interfaceC16820sZ, A002)));
    }
}
