package X;

import android.content.Context;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.BounceInterpolator;
import com.facebook.R;

/* loaded from: classes11.dex */
public abstract class VTB {
    public static final void A00(Context context, View view) {
        Animation loadAnimation = AnimationUtils.loadAnimation(context, R.anim.bounce_horizontal);
        loadAnimation.setInterpolator(new BounceInterpolator());
        Animation loadAnimation2 = AnimationUtils.loadAnimation(context, R.anim.lift_back);
        C14360o3.A07(loadAnimation2);
        loadAnimation.setAnimationListener(new WOU(1, view, loadAnimation2));
        loadAnimation2.setAnimationListener(new WOU(2, view, loadAnimation));
        view.startAnimation(loadAnimation);
    }
}
