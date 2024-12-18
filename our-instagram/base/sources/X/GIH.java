package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.SellerShoppableFeedType;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* loaded from: classes6.dex */
public final class GIH implements GZT {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ GIE A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;

    public GIH(FragmentActivity fragmentActivity, UserSession userSession, GIE gie, String str, String str2) {
        this.A02 = gie;
        this.A00 = fragmentActivity;
        this.A01 = userSession;
        this.A03 = str;
        this.A04 = str2;
    }

    @Override // X.GZT
    public final void Dxp() {
        FragmentActivity fragmentActivity = this.A00;
        if (fragmentActivity != null) {
            C193328hC A0I = AbstractC31171DnF.A0I(fragmentActivity);
            A0I.A0A(2131974440);
            A0I.A09(2131974439);
            A0I.A0F(new DialogInterfaceOnClickListenerC35319Fhu(this, 1));
            A0I.A0s(true);
            A0I.A0t(true);
            DialogInterfaceOnCancelListenerC35300FhZ.A00(A0I, this, 12);
            AbstractC166987dD.A1W(A0I);
        }
    }

    @Override // X.GZT
    public final void Dxq(C2045893s c2045893s) {
        InterfaceC128135qh interfaceC128135qh = c2045893s.A04;
        if (interfaceC128135qh == null) {
            AbstractC31171DnF.A0w();
            throw C00O.createAndThrow();
        }
        User CDj = interfaceC128135qh.CDj();
        FragmentActivity fragmentActivity = this.A00;
        if (fragmentActivity != null) {
            CDj.getClass();
            if (CDj.A0A() != SellerShoppableFeedType.A06) {
                GIE.A01(fragmentActivity, this.A01, this.A02, CDj, this.A03);
            } else {
                UserSession userSession = this.A01;
                C31368DqX.A01(AbstractC31180DnO.A0C(fragmentActivity, userSession), userSession, AbstractC31364DqT.A02(), AbstractC31402Dr6.A02(userSession, this.A04, "deep_link", "shop_url"));
                C193328hC A0I = AbstractC31171DnF.A0I(fragmentActivity);
                A0I.A0A(2131974440);
                A0I.A09(2131974439);
                A0I.A07();
                AbstractC31178DnM.A1R(A0I, true);
            }
            ((BaseFragmentActivity) fragmentActivity).A0a();
        }
    }
}
