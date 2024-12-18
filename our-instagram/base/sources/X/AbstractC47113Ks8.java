package X;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import androidx.fragment.app.Fragment;
import com.facebook.R;

/* renamed from: X.Ks8, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC47113Ks8 {
    public static Animation A00(Fragment fragment, int i, boolean z) {
        View view = fragment.mView;
        if (i == R.anim.right_in && z) {
            Animation loadAnimation = AnimationUtils.loadAnimation(fragment.requireContext(), R.anim.right_in);
            loadAnimation.setAnimationListener(new AnimationAnimationListenerC35726Fq0(view, 7));
            return loadAnimation;
        }
        if (view != null) {
            view.setTranslationZ(0.0f);
            return null;
        }
        return null;
    }
}
