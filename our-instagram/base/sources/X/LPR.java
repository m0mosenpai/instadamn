package X;

import android.app.Activity;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* loaded from: classes8.dex */
public final class LPR implements View.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final String A05;
    public final boolean A06;

    public LPR(Object obj, Object obj2, Object obj3, Object obj4, String str, int i, boolean z) {
        this.A00 = i;
        this.A04 = obj3;
        this.A01 = obj2;
        this.A03 = obj;
        this.A02 = obj4;
        this.A05 = str;
        this.A06 = z;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05;
        int i;
        switch (this.A00) {
            case 0:
                A05 = C0f9.A05(-102015967);
                UserSession userSession = (UserSession) this.A04;
                Activity activity = (Activity) this.A01;
                boolean z = this.A06;
                Object obj = this.A02;
                Object obj2 = this.A03;
                User A0k = AbstractC31174DnI.A0k(userSession, this.A05);
                if (A0k != null) {
                    C193328hC A0H = AbstractC31171DnF.A0H(activity);
                    A0H.A05 = AbstractC31178DnM.A0c(activity, A0k, 2131968771);
                    A0H.A09(2131968768);
                    A0H.A0s(true);
                    A0H.A0t(true);
                    A0H.A0L(new DialogInterfaceOnClickListenerC28543Cib(0, activity, A0k, userSession, obj2, obj, z), 2131968769);
                    AbstractC31176DnK.A16(DialogInterfaceOnClickListenerC48009LMe.A00, A0H, 2131968770);
                }
                AbstractC135966Db.A01(userSession).A0D(EnumC46303KeZ.A0I);
                i = 351335757;
                break;
            case 1:
                A05 = C0f9.A05(-1501391471);
                C47650L2j c47650L2j = (C47650L2j) this.A04;
                C49025LmD c49025LmD = new C49025LmD(c47650L2j.A00, (InterfaceC11380iw) this.A01, c47650L2j.A02);
                android.net.Uri uri = (android.net.Uri) this.A03;
                K2U k2u = (K2U) this.A02;
                c49025LmD.A00(uri, k2u.A01, this.A05, k2u.A02, this.A06);
                i = 1206123602;
                break;
            default:
                return;
        }
        C0f9.A0C(i, A05);
    }
}
