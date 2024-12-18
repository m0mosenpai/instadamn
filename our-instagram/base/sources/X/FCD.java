package X;

import android.app.Activity;
import android.content.Context;
import android.text.SpannableStringBuilder;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* loaded from: classes6.dex */
public abstract class FCD {
    public static final void A00(Activity activity, Context context, Fragment fragment, InterfaceC11380iw interfaceC11380iw, UserSession userSession, InterfaceC37203GaE interfaceC37203GaE, User user) {
        C14360o3.A0B(context, 0);
        AbstractC167027dH.A13(activity, userSession, interfaceC11380iw);
        DialogInterfaceOnClickListenerC35448Fk5 dialogInterfaceOnClickListenerC35448Fk5 = new DialogInterfaceOnClickListenerC35448Fk5(13, activity, userSession, interfaceC37203GaE, user);
        DialogInterfaceOnClickListenerC35319Fhu dialogInterfaceOnClickListenerC35319Fhu = new DialogInterfaceOnClickListenerC35319Fhu(interfaceC37203GaE, 4);
        String A0p = AbstractC166997dE.A0p(context, 2131972218);
        SpannableStringBuilder A0H = AbstractC25225BEi.A0H(AbstractC31178DnM.A0c(context, user, 2131972217));
        C193328hC A0I = AbstractC31171DnF.A0I(context);
        A0I.A0m(fragment, userSession);
        A0I.A05 = A0p;
        A0I.A0r(A0H);
        A0I.A0o(user.Bhu(), interfaceC11380iw);
        A0I.A0J(dialogInterfaceOnClickListenerC35448Fk5, 2131972214);
        AbstractC31176DnK.A14(dialogInterfaceOnClickListenerC35319Fhu, A0I);
    }
}
