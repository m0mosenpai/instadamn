package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* loaded from: classes4.dex */
public final class AGL {
    public ViewGroup A00;
    public ViewGroup A01;
    public final View A02;
    public final FragmentActivity A03;
    public final C163987Vm A04;
    public final LIW A05;
    public final ACU A06;
    public final UserSession A07;

    public AGL(View view, FragmentActivity fragmentActivity, UserSession userSession, C163987Vm c163987Vm) {
        C14360o3.A0B(view, 3);
        this.A07 = userSession;
        this.A03 = fragmentActivity;
        this.A02 = view;
        this.A04 = c163987Vm;
        this.A06 = AbstractC22719A0p.A00(fragmentActivity.getApplicationContext());
        this.A05 = AbstractC47008KqR.A00(fragmentActivity.getApplicationContext());
    }

    public static final void A00(AGL agl, User user) {
        Integer Bkb = user.Bkb();
        if (Bkb != null) {
            int intValue = Bkb.intValue();
            C23031Ai A00 = AbstractC23021Ah.A00(agl.A07);
            String id = user.getId();
            InterfaceC19610xo A0w = AbstractC166987dD.A0w(A00);
            A0w.E77(AnonymousClass001.A0u("reachable_user_composer_block_dismissed/userid/", id, "/type/", String.valueOf(intValue)), true);
            A0w.apply();
        }
    }
}
