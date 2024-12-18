package X;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.model.fundraiser.FundraiserCampaignTypeEnum;

/* renamed from: X.GfO, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37506GfO implements JH2 {
    public final Fragment A00;
    public final InterfaceC11380iw A01;
    public final UserSession A02;

    public C37506GfO(Fragment fragment, InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        C14360o3.A0B(interfaceC11380iw, 3);
        this.A02 = userSession;
        this.A00 = fragment;
        this.A01 = interfaceC11380iw;
    }

    @Override // X.JH2
    public final void DIg(C38321qM c38321qM, C75113Zb c75113Zb) {
        String str;
        InterfaceC39031rc B99 = c38321qM.A0C.B99();
        if (B99 != null) {
            str = B99.getFundraiserId();
        } else {
            str = null;
        }
        UserSession userSession = this.A02;
        AbstractC55215Oed.A08(this.A01, userSession, "evergreen_donate_button", "FEED_POST", str, null);
        InterfaceC39031rc B992 = c38321qM.A0C.B99();
        if (B992 != null) {
            FundraiserCampaignTypeEnum B9C = B992.B9C();
            if (B9C != null && B9C.ordinal() == 9) {
                String fundraiserId = B992.getFundraiserId();
                if (fundraiserId != null) {
                    Context requireContext = this.A00.requireContext();
                    String Biv = c38321qM.Biv();
                    String A2u = c38321qM.A2u();
                    if (A2u != null) {
                        AbstractC55224Oeq.A02(requireContext, userSession, fundraiserId, Biv, A2u);
                        return;
                    }
                    throw AbstractC166997dE.A0g();
                }
                return;
            }
            String fundraiserId2 = B992.getFundraiserId();
            String A2u2 = c38321qM.A2u();
            if (A2u2 != null) {
                AbstractC72143Ln.A01 = A2u2;
                AbstractC72143Ln.A00 = fundraiserId2;
                if (fundraiserId2 == null) {
                    return;
                }
                Fragment fragment = this.A00;
                FragmentActivity requireActivity = fragment.requireActivity();
                String Biv2 = c38321qM.Biv();
                String A2u3 = c38321qM.A2u();
                if (A2u3 != null) {
                    AbstractC55224Oeq.A0A(requireActivity, userSession, fundraiserId2, "FEED_POST", Biv2, A2u3, true);
                    Context requireContext2 = fragment.requireContext();
                    String Biv3 = c38321qM.Biv();
                    String A2u4 = c38321qM.A2u();
                    if (A2u4 != null) {
                        AbstractC55224Oeq.A03(requireContext2, userSession, fundraiserId2, "FEED_POST", Biv3, A2u4);
                        return;
                    }
                    throw AbstractC166987dD.A14("Required value was null.");
                }
                throw AbstractC166987dD.A14("Required value was null.");
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
    }

    @Override // X.JH2
    public final void EDI(View view, C38321qM c38321qM) {
        String fundraiserId;
        InterfaceC39031rc B99 = c38321qM.A0C.B99();
        if (B99 != null && (fundraiserId = B99.getFundraiserId()) != null) {
            Context requireContext = this.A00.requireContext();
            UserSession userSession = this.A02;
            String Biv = c38321qM.Biv();
            String A2u = c38321qM.A2u();
            if (A2u != null) {
                AbstractC55224Oeq.A04(requireContext, userSession, fundraiserId, "FEED_POST", Biv, A2u);
                return;
            }
            throw AbstractC166997dE.A0g();
        }
    }
}
