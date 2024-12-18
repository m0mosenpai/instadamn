package X;

import android.content.Context;
import android.view.animation.Animation;
import android.widget.TextView;
import com.facebook.R;

/* renamed from: X.Ol5, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class AnimationAnimationListenerC55512Ol5 implements Animation.AnimationListener {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ TextView A01;

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    public AnimationAnimationListenerC55512Ol5(TextView textView, Context context) {
        this.A01 = textView;
        this.A00 = context;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        this.A01.setVisibility(8);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        AbstractC43594JPz.A0G(this.A01).setDuration(this.A00.getResources().getInteger(R.integer.config_activityLongDur));
    }
}
