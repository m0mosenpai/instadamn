package X;

import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;

/* renamed from: X.F2k, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34082F2k {
    public static final void A00(View view) {
        ViewGroup viewGroup = (ViewGroup) view.getRootView().findViewById(R.id.direct_thread_content_below_action_bar);
        if (viewGroup != null) {
            AutoTransition autoTransition = new AutoTransition();
            autoTransition.setDuration(200L);
            TransitionManager.beginDelayedTransition(viewGroup, autoTransition);
        }
        view.setVisibility(8);
    }
}
