package X;

import android.app.Activity;
import android.content.DialogInterface;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class FQH {
    public GZM A00;
    public final Fragment A01;
    public final Activity A02;
    public final DialogInterface.OnClickListener A03 = DialogInterfaceOnClickListenerC35454FkB.A00(this, 45);
    public final UserSession A04;

    public final void A00(GZM gzm) {
        this.A00 = gzm;
        C193328hC A0H = AbstractC31171DnF.A0H(this.A02);
        UserSession userSession = this.A04;
        Fragment fragment = this.A01;
        A0H.A0m(fragment, userSession);
        A0H.A0f(this.A03, new CharSequence[]{AbstractC25227BEk.A0v(fragment, 2131976856), AbstractC25227BEk.A0v(fragment, 2131969214)});
        A0H.A04();
        AbstractC166987dD.A1W(A0H);
    }

    public FQH(Activity activity, Fragment fragment, UserSession userSession) {
        this.A02 = activity;
        this.A04 = userSession;
        this.A01 = fragment;
    }
}
