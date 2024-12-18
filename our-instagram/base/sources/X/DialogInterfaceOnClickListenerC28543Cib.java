package X;

import android.content.Context;
import android.content.DialogInterface;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.Cib, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class DialogInterfaceOnClickListenerC28543Cib implements DialogInterface.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final boolean A06;

    public DialogInterfaceOnClickListenerC28543Cib(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, boolean z) {
        this.A00 = i;
        this.A06 = z;
        this.A01 = obj;
        this.A05 = obj3;
        this.A03 = obj4;
        this.A04 = obj2;
        this.A02 = obj5;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        InterfaceC11380iw A01;
        if (this.A00 != 0) {
            if (this.A06) {
                FragmentActivity activity = ((Fragment) this.A01).getActivity();
                UserSession userSession = (UserSession) this.A05;
                String A2u = ((C38321qM) this.A03).A2u();
                C14360o3.A0B(userSession, 1);
                if (A2u != null && (A01 = C150856qj.A01(activity)) != null) {
                    AbstractC37670Gi3.A09(EnumC120795dP.A0I, BQL.A0e, A01, userSession, A2u);
                }
            }
            UserSession userSession2 = (UserSession) this.A05;
            String id = ((C38321qM) this.A03).getId();
            if (id != null) {
                C1ON A03 = AbstractC55151OdE.A03(userSession2, id);
                Fragment fragment = (Fragment) this.A01;
                C1P1 c1p1 = (C1P1) this.A04;
                if (c1p1 != null) {
                    A03.A00 = c1p1;
                }
                Context context = fragment.getContext();
                if (context != null) {
                    C1GJ.A00(context, AbstractC018607g.A00(fragment), A03);
                }
                AbstractC25228BEl.A1P(this.A02);
                return;
            }
            throw AbstractC166997dE.A0g();
        }
        C37476Geu c37476Geu = new C37476Geu(2, this.A03, this.A06);
        Context context2 = (Context) this.A01;
        UserSession userSession3 = (UserSession) this.A05;
        User user = (User) this.A04;
        AbstractC35095Fd6.A01(context2, c37476Geu, userSession3, user, ((InterfaceC11380iw) this.A02).getModuleName(), true);
        user.getId();
    }
}
