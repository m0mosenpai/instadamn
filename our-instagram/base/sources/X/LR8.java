package X;

import android.content.Context;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.R;

/* loaded from: classes8.dex */
public final class LR8 implements Animation.AnimationListener {
    public final /* synthetic */ View A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ ConstraintLayout A02;
    public final /* synthetic */ ConstraintLayout A03;

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    public LR8(View view, View view2, ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2) {
        this.A01 = view;
        this.A02 = constraintLayout;
        this.A00 = view2;
        this.A03 = constraintLayout2;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        ConstraintLayout constraintLayout = this.A02;
        Context context = this.A00.getContext();
        AbstractC31173DnH.A0z(context, constraintLayout, R.drawable.reel_lead_gen_card_rounded_top_corner_background);
        this.A03.startAnimation(AnimationUtils.loadAnimation(context, R.anim.button_slide_down_20_to_0));
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        View view = this.A01;
        view.setAlpha(0.0f);
        AbstractC43594JPz.A0H(view).setDuration(400L).setInterpolator(new DecelerateInterpolator()).start();
    }
}
