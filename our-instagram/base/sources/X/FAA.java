package X;

import android.app.Activity;
import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.user.model.User;
import java.util.List;

/* loaded from: classes6.dex */
public abstract class FAA {
    public static final void A00(Activity activity, Context context, UserSession userSession, IgTextView igTextView, InterfaceC678133v interfaceC678133v, User user, List list, int i) {
        String A0r = AbstractC166997dE.A0r(context.getResources(), Integer.valueOf(i), 2131953638);
        C14360o3.A07(A0r);
        igTextView.setText(A0r);
        igTextView.setVisibility(0);
        C0fQ.A00(new ViewOnClickListenerC35675FpA(8, activity, userSession, interfaceC678133v, user, list), igTextView);
    }
}
