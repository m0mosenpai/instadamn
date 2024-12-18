package X;

import android.content.Context;
import android.content.DialogInterface;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.Fcu, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC35083Fcu {
    public static final void A01(FragmentActivity fragmentActivity, UserSession userSession, String str) {
        C14360o3.A0B(userSession, 2);
        if (fragmentActivity != null && str != null && str.length() != 0) {
            C146106i8 A0X = AbstractC31173DnH.A0X(str);
            AbstractC31175DnJ.A0l(fragmentActivity, A0X, 2131970207);
            A0X.A0A = new G9A(14, fragmentActivity, userSession);
            A0X.A0L = true;
            AbstractC25233BEq.A1F(A0X);
        }
    }

    public static final void A02(FragmentActivity fragmentActivity, UserSession userSession, boolean z) {
        if (fragmentActivity != null) {
            C193328hC A0H = AbstractC31171DnF.A0H(fragmentActivity);
            A0H.A0A(2131977171);
            A0H.A09(2131977172);
            A0H.A06();
            AbstractC31176DnK.A17(new DialogInterfaceOnClickListenerC35447Fk4(4, fragmentActivity, userSession, z), A0H, 2131956675);
        }
    }

    public static final void A00(Context context, DialogInterface.OnClickListener onClickListener) {
        C193328hC A0I = AbstractC31171DnF.A0I(context);
        A0I.A0A(2131976209);
        A0I.A09(2131976208);
        A0I.A0I(null, 2131968555);
        AbstractC31176DnK.A17(onClickListener, A0I, 2131977166);
    }
}
