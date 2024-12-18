package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.modal.TransparentModalActivity;

/* renamed from: X.I5d, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40775I5d {
    public static void A00(Bundle bundle, FragmentActivity fragmentActivity, UserSession userSession, String str) {
        bundle.putString("content_fragment_type", str);
        C6XJ A0L = AbstractC31171DnF.A0L(fragmentActivity, bundle, userSession, TransparentModalActivity.class, "reel_swipe_up");
        A0L.A0J = new int[]{R.anim.modal_slide_up_enter, R.anim.modal_empty_animation, R.anim.modal_empty_animation, R.anim.modal_slide_down_exit};
        A0L.A0C(fragmentActivity);
    }
}
