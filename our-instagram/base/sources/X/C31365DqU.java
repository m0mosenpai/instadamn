package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.profile.fragment.UserDetailFragment;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;
import org.webrtc.CameraEnumerationAndroid;

/* renamed from: X.DqU, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31365DqU {
    public final /* synthetic */ UserDetailFragment A00;

    public C31365DqU(UserDetailFragment userDetailFragment) {
        this.A00 = userDetailFragment;
    }

    public final void A00(int i) {
        Context context;
        UserDetailFragment userDetailFragment = this.A00;
        User user = userDetailFragment.A10.A03;
        if (userDetailFragment.isResumed() && userDetailFragment.getActivity() != null && user != null && user.B7L() == FollowStatus.A06) {
            FQ4 fq4 = userDetailFragment.A0v;
            UserSession userSession = userDetailFragment.A0I;
            if (i <= 0) {
                C31361DqQ c31361DqQ = fq4.A02;
                String id = user.getId();
                InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c31361DqQ.A00, "unfollow_chaining_failed_to_show");
                A0f.AAP("target_id", id);
                A0f.AAP("reason", "no_suggestions");
                A0f.Cht();
                return;
            }
            fq4.A01();
            UserDetailFragment userDetailFragment2 = fq4.A03;
            if (userDetailFragment2 == null || (context = userDetailFragment2.getContext()) == null) {
                return;
            }
            C36516G8o c36516G8o = new C36516G8o(4, fq4, user, userSession);
            C146106i8 A0K = AbstractC31171DnF.A0K();
            A0K.A0D = AbstractC31177DnL.A0a(context, i, 2131976083);
            A0K.A0D(context.getString(2131976082));
            A0K.A0L = true;
            A0K.A0A(c36516G8o);
            A0K.A01 = CameraEnumerationAndroid.AnonymousClass1.MIN_FPS_THRESHOLD;
            AbstractC31175DnJ.A0p(context.getResources(), A0K);
            C31349DqE A00 = A0K.A00();
            fq4.A01 = A00;
            AbstractC166997dE.A1O(C41451vu.A01, A00);
        }
    }
}
