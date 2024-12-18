package X;

import android.app.Activity;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.List;
import java.util.Map;

/* renamed from: X.Grr, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class ViewOnClickListenerC38248Grr implements View.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final String A06;

    public ViewOnClickListenerC38248Grr(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, String str, int i) {
        this.A00 = i;
        this.A04 = obj4;
        this.A05 = obj3;
        this.A02 = obj2;
        this.A01 = obj;
        this.A03 = obj5;
        this.A06 = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05;
        int i;
        String str;
        switch (this.A00) {
            case 0:
                A05 = C0f9.A05(859351516);
                ((C37251oO) this.A01).Cgm((FragmentActivity) this.A02, (UserSession) this.A05, (User) this.A04, this.A06, AbstractC111324zv.A00(1818), (Map) this.A03);
                i = 1547907683;
                break;
            case 1:
                A05 = C0f9.A05(2046141235);
                OX3 ox3 = (OX3) this.A05;
                OX3.A00((FragmentActivity) this.A01, (InterfaceC11380iw) this.A02, (UserSession) this.A04, ox3, (C55011OVw) this.A03, null, this.A06, 2);
                i = 1992139274;
                break;
            case 2:
                A05 = C0f9.A05(1108338718);
                InterfaceC16620sF interfaceC16620sF = (InterfaceC16620sF) this.A03;
                Object obj = this.A04;
                Object obj2 = this.A02;
                C14360o3.A0A(obj2);
                interfaceC16620sF.invoke(obj, obj2);
                String str2 = this.A06;
                UserSession userSession = (UserSession) this.A05;
                InterfaceC11380iw interfaceC11380iw = (InterfaceC11380iw) this.A01;
                C5Hb c5Hb = AbstractC28507Ci0.A00;
                if (C2TN.A05(userSession, str2)) {
                    str = "opal_self_profile";
                } else {
                    str = "opal_profile";
                }
                AbstractC34277F9x.A00(interfaceC11380iw, userSession, "tap", "profile_picture", str, str2, null);
                i = 1927963753;
                break;
            default:
                A05 = C0f9.A05(-1457042115);
                List list = C37549Gg5.A07;
                C38240Grj c38240Grj = (C38240Grj) this.A04;
                UserSession userSession2 = (UserSession) this.A05;
                C38238Grh.A02((Activity) this.A01, (InterfaceC11380iw) this.A02, userSession2, c38240Grj, (C37524Gfg) this.A03, this.A06, list, true);
                C63702ur c63702ur = C37549Gg5.A06;
                if (c63702ur != null) {
                    InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c63702ur.A01, AbstractC111324zv.A00(5160));
                    A0f.AAP(AbstractC111324zv.A00(1367), "suggested_users_reels_netego");
                    AbstractC31171DnF.A1I(A0f, c63702ur.A02);
                    A0f.Cht();
                }
                i = -1728573542;
                break;
        }
        C0f9.A0C(i, A05);
    }
}
