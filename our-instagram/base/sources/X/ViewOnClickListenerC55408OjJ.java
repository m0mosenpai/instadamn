package X;

import android.view.View;
import android.widget.CompoundButton;
import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.IGRevShareProductType;
import com.instagram.api.schemas.IGTVAccountLevelMonetizationToggleSetting;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import com.instagram.video.live.mvvm.viewmodel.optionsdialog.IgLiveOptionsDialogViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.OjJ, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class ViewOnClickListenerC55408OjJ implements View.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final String A03;

    public ViewOnClickListenerC55408OjJ(Object obj, Object obj2, String str, int i) {
        this.A00 = i;
        this.A02 = obj2;
        this.A03 = str;
        this.A01 = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0004. Please report as an issue. */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        int A05;
        int i;
        IGTVAccountLevelMonetizationToggleSetting iGTVAccountLevelMonetizationToggleSetting;
        String str2;
        Long l;
        long j;
        Long A0j;
        switch (this.A00) {
            case 0:
                A05 = C0f9.A05(-1714869134);
                NMX nmx = (NMX) this.A02;
                nmx.A0I = this.A03;
                ((C14510oO) this.A01).A00 = false;
                nmx.A0K = true;
                NMX.A09(nmx);
                i = -799193732;
                C0f9.A0C(i, A05);
                return;
            case 1:
                A05 = C0f9.A05(1609194014);
                if (((CompoundButton) this.A01).isChecked()) {
                    iGTVAccountLevelMonetizationToggleSetting = IGTVAccountLevelMonetizationToggleSetting.A05;
                } else {
                    iGTVAccountLevelMonetizationToggleSetting = IGTVAccountLevelMonetizationToggleSetting.A04;
                }
                String str3 = iGTVAccountLevelMonetizationToggleSetting.A00;
                N61 n61 = (N61) this.A02;
                C51043Mgu c51043Mgu = n61.A00;
                if (c51043Mgu == null) {
                    str2 = "productOnboardingViewModel";
                } else {
                    String str4 = ((IGRevShareProductType) n61.A03.getValue()).A00;
                    C14360o3.A0B(str3, 0);
                    C2GS c2gs = c51043Mgu.A02;
                    C51571MqP c51571MqP = (C51571MqP) c2gs.A02();
                    if (c51571MqP != null) {
                        c51571MqP.A05 = true;
                    }
                    AbstractC50523MSb.A0s(c2gs);
                    C41761wQ c41761wQ = c51043Mgu.A03;
                    OTV otv = c51043Mgu.A01;
                    if (otv == null) {
                        str2 = "partnerProgramEligibilityRepository";
                    } else {
                        c41761wQ.A02(AbstractC34046F0z.A00(otv.A00.A00(str3, str4)), new PKD(c51043Mgu, 5));
                        N61.A00(n61, "primary_button_clicked", this.A03);
                        i = 1902309963;
                        C0f9.A0C(i, A05);
                        return;
                    }
                }
                C14360o3.A0F(str2);
                throw C00O.createAndThrow();
            case 2:
                int A052 = C0f9.A05(361178584);
                N76 n76 = (N76) this.A02;
                FragmentActivity requireActivity = n76.requireActivity();
                AbstractC12990ll A0o = AbstractC166987dD.A0o(n76.A0G);
                C54721OEy c54721OEy = (C54721OEy) this.A01;
                String str5 = c54721OEy.A03;
                if (str5 == null || (str = AbstractC43592JPx.A10(str5, this.A03)) == null) {
                    str = this.A03;
                }
                List list = c54721OEy.A05;
                ArrayList A0q = AbstractC167017dG.A0q(list);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    AbstractC167017dG.A1V(A0q, it);
                }
                C14360o3.A0B(A0o, 1);
                C189448aO A0y = AbstractC25225BEi.A0y(A0o);
                A0y.A0d = str;
                AbstractC25225BEi.A1Q(A0y, true);
                A0y.A03 = 0.75f;
                A0y.A04 = 0.75f;
                A0y.A1R = true;
                C189478aR A00 = A0y.A00();
                N7C n7c = new N7C();
                n7c.setArguments(AbstractC167017dG.A0T("ARG_LIST_NAME", str, AbstractC166987dD.A1L("ARG_AUDIENCE_LIST", AbstractC166987dD.A1F(A0q))));
                A00.A02(requireActivity, n7c);
                C0f9.A0C(-31624192, A052);
                return;
            case 3:
                A05 = C0f9.A05(1235356051);
                C51355MmG c51355MmG = (C51355MmG) this.A02;
                int i2 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                FragmentActivity fragmentActivity = c51355MmG.A09;
                UserSession userSession = c51355MmG.A0A;
                C140966Yy A0r = AbstractC25225BEi.A0r(fragmentActivity, userSession);
                OK9 A002 = AbstractC34338FCg.A00().A00();
                String str6 = this.A03;
                C51636MrT c51636MrT = (C51636MrT) this.A01;
                String str7 = c51636MrT.A05;
                String valueOf = String.valueOf(c51636MrT.A00);
                Integer valueOf2 = Integer.valueOf(c51636MrT.A01);
                Integer num = C05F.A0C;
                String str8 = c51636MrT.A07;
                Integer num2 = c51636MrT.A02;
                if (num2 != null) {
                    l = AbstractC25229BEm.A0n(num2);
                } else {
                    l = null;
                }
                A0r.A0B(null, A002.A01(valueOf2, num, l, str6, str7, valueOf, str6, str8, false, true));
                A0r.A04();
                C56136Ovw A003 = AbstractC35078Fcp.A00(userSession);
                EnumC33479ErE enumC33479ErE = EnumC33479ErE.A02;
                String str9 = c51636MrT.A06;
                InterfaceC02590Ai A053 = AbstractC50524MSc.A05(A003.A00, "ig_user_pay_badges_see_supporters", "live", "badges", "User Pay Earnings");
                A053.A8R(enumC33479ErE, "origin");
                MSW.A1S(A053, null);
                A053.AAP("insights_id", str9);
                A053.Cht();
                i = -1868082049;
                C0f9.A0C(i, A05);
                return;
            default:
                A05 = C0f9.A05(1832108708);
                IgLiveOptionsDialogViewModel A004 = C55064OaK.A00(this.A02);
                User user = (User) this.A01;
                String str10 = this.A03;
                C14360o3.A0B(str10, 1);
                C51709Mse A0U = MSX.A0U(A004.A0C);
                if (A0U != null) {
                    AbstractC166987dD.A1Z(new C57168PZm(user, A0U, A004, (InterfaceC23621Ds) null, 23), AbstractC141776au.A00(A004));
                    C54810OKj c54810OKj = A004.A08;
                    String id = user.getId();
                    String str11 = A0U.A08;
                    String A005 = C51709Mse.A00(A0U);
                    String str12 = A0U.A09;
                    InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c54810OKj.A01, "ig_live_moderator_revoke");
                    MSY.A16(A0f, A005);
                    AbstractC31171DnF.A1A(A0f, "confirm");
                    if (str11 != null && (A0j = AbstractC166997dE.A0j(str11)) != null) {
                        j = A0j.longValue();
                    } else {
                        j = 0;
                    }
                    MSY.A12(A0f, j);
                    if (str12 == null) {
                        str12 = "0";
                    }
                    AbstractC37300Gc1.A0l(A0f, str12);
                    AbstractC37301Gc2.A15(A0f, c54810OKj.A00);
                    A0f.A9K("target_user_id", Long.valueOf(MSZ.A0D(id)));
                    MSX.A1D(A0f);
                    A0f.AAP("method", str10);
                    A0f.Cht();
                }
                i = 1706452876;
                C0f9.A0C(i, A05);
                return;
        }
    }
}
