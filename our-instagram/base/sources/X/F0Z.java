package X;

import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public abstract class F0Z {
    public static final void A00(FragmentActivity fragmentActivity, UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        C23031Ai A00 = AbstractC23021Ah.A00(userSession);
        if (!A00.A01.getBoolean(AbstractC111324zv.A00(2441), false)) {
            C193328hC A0H = AbstractC31171DnF.A0H(fragmentActivity);
            A0H.A0k(fragmentActivity.getDrawable(R.drawable.ig_illustrations_qp_messages_refresh));
            A0H.A0A(2131966439);
            A0H.A09(2131966438);
            A0H.A0K(DialogInterfaceOnClickListenerC35455FkC.A00(fragmentActivity, userSession, 9), 2131966437);
            A0H.A0H(DialogInterfaceOnClickListenerC35452Fk9.A00(fragmentActivity, 26), 2131968687);
            A0H.A0h(new AP9(A00, 0));
            AbstractC166987dD.A1W(A0H);
            return;
        }
        fragmentActivity.onBackPressed();
    }
}
