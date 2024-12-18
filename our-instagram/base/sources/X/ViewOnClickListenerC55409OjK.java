package X;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.leadads.activity.LeadAdsActivity;
import com.instagram.ui.widget.spinner.SpinnerImageView;
import instagram.features.stories.dashboard.fragment.ReelDashboardFragment;

/* renamed from: X.OjK, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class ViewOnClickListenerC55409OjK implements View.OnClickListener {
    public final int A00;
    public final Object A01;
    public final String A02;
    public final String A03;

    public ViewOnClickListenerC55409OjK(Object obj, String str, String str2, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A03 = str;
        this.A02 = str2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05;
        int i;
        String str;
        switch (this.A00) {
            case 0:
                A05 = C0f9.A05(1447475628);
                C67680Uvx c67680Uvx = (C67680Uvx) this.A01;
                String str2 = this.A03;
                C67680Uvx.A05(c67680Uvx, "user_click_payouthub_atomic", this.A02, str2, null, null, null, null);
                C58252li c58252li = ((UFZ) c67680Uvx).A03;
                C2FP.A02().A08();
                c58252li.A0B(new C63167SeR(new Wb0(str2)));
                i = 1370527218;
                break;
            case 1:
                A05 = C0f9.A05(-574451825);
                C52352NEq c52352NEq = (C52352NEq) this.A01;
                AbstractC35253Fgm.A02(c52352NEq.A00, c52352NEq.A03, c52352NEq.A04, this.A02, this.A03, "tap_on_code");
                i = -461360852;
                break;
            case 2:
                A05 = C0f9.A05(1750044924);
                C52352NEq c52352NEq2 = (C52352NEq) this.A01;
                AbstractC35253Fgm.A02(c52352NEq2.A00, c52352NEq2.A03, c52352NEq2.A04, this.A02, this.A03, "copy_button");
                i = -1160614120;
                break;
            case 3:
                A05 = C0f9.A05(-890888527);
                C52352NEq c52352NEq3 = (C52352NEq) this.A01;
                AbstractC35253Fgm.A01(c52352NEq3.A00, c52352NEq3.A01, c52352NEq3.A03, c52352NEq3.A04, this.A02, this.A03, c52352NEq3.A06, null);
                i = 933233944;
                break;
            case 4:
                A05 = C0f9.A05(1825283075);
                C67884V0q c67884V0q = (C67884V0q) this.A01;
                String str3 = this.A02;
                String str4 = this.A03;
                FragmentActivity activity = c67884V0q.getActivity();
                if (activity != null) {
                    InterfaceC09390do interfaceC09390do = c67884V0q.A0F;
                    C70399WUb.A00(AbstractC166987dD.A0r(interfaceC09390do)).A0G(VG4.A0P, "boost_packages_suggested_badge");
                    C189448aO A0g = AbstractC25231BEo.A0g(interfaceC09390do);
                    A0g.A0d = str3;
                    C189478aR A00 = A0g.A00();
                    N49 n49 = new N49();
                    n49.setArguments(AbstractC167017dG.A0T("boost_packages_badge_description", str4, MSY.A0n(AbstractC166987dD.A0r(interfaceC09390do))));
                    A00.A02(activity, n49);
                }
                i = -1346309591;
                break;
            case 5:
                A05 = C0f9.A05(1840195376);
                LeadAdsActivity leadAdsActivity = (LeadAdsActivity) this.A01;
                SpinnerImageView spinnerImageView = leadAdsActivity.A01;
                if (spinnerImageView == null) {
                    str = "spinnerImageView";
                } else {
                    AbstractC31171DnF.A1M(spinnerImageView);
                    String str5 = leadAdsActivity.A02;
                    if (str5 == null) {
                        str = "formId";
                    } else {
                        LeadAdsActivity.A00(AbstractC166987dD.A0r(leadAdsActivity.A0A), leadAdsActivity, str5, this.A03, this.A02, true);
                        i = -1370216540;
                        break;
                    }
                }
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 6:
                A05 = C0f9.A05(-996858730);
                C55099ObA c55099ObA = (C55099ObA) this.A01;
                String str6 = this.A03;
                String str7 = this.A02;
                C193328hC A0I = AbstractC31171DnF.A0I(c55099ObA.A0A);
                A0I.A05 = str6;
                A0I.A0r(str7);
                AbstractC31175DnJ.A1O(A0I);
                AbstractC31176DnK.A1W(A0I);
                i = -753664981;
                break;
            case 7:
                int A052 = C0f9.A05(1694445942);
                C37675GiC c37675GiC = (C37675GiC) this.A01;
                UserSession userSession = c37675GiC.A0C;
                String str8 = this.A03;
                if (str8 != null) {
                    c37675GiC.A0V.A01(FCY.A00(userSession, str8), this.A02);
                    C0f9.A0C(892760457, A052);
                    return;
                } else {
                    IllegalStateException A0g2 = AbstractC166997dE.A0g();
                    C0f9.A0C(-644282171, A052);
                    throw A0g2;
                }
            case 8:
                C38262Gs5 c38262Gs5 = (C38262Gs5) this.A01;
                String str9 = this.A02;
                String str10 = this.A03;
                ReelDashboardFragment reelDashboardFragment = c38262Gs5.A0B;
                FragmentActivity activity2 = reelDashboardFragment.getActivity();
                if (activity2 == null) {
                    return;
                }
                AbstractC35258Fgs.A05(activity2, reelDashboardFragment.A06, str9, str10);
                return;
            default:
                return;
        }
        C0f9.A0C(i, A05);
    }
}
