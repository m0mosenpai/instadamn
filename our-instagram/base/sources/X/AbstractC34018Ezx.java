package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.Ezx, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34018Ezx {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        C0Zx c0Zx;
        Object A03 = c6fw.A03(0);
        String A0f = AbstractC31171DnF.A0f(A03);
        String str = (String) A03;
        String A0Z = AbstractC31175DnJ.A0Z(c6fw, A0f);
        String A0n = AbstractC31176DnK.A0n(c6fw, A0f);
        String A0o = AbstractC31176DnK.A0o(c6fw, A0f, 3);
        String A0o2 = AbstractC31176DnK.A0o(c6fw, A0f, 4);
        String A0i = AbstractC31180DnO.A0i(c6fw, 5);
        UserSession A0S = AbstractC31177DnL.A0S(c6fq);
        if (!AbstractC31171DnF.A1V(A0S, str)) {
            C41768Iek c41768Iek = C41768Iek.A00;
            if (!C41768Iek.A02(A0S, c41768Iek).getBoolean("has_shown_mini_shop_legal_dialog", false)) {
                G7U g7u = new G7U(A0Z);
                FragmentActivity A04 = C6BQ.A04(c6fq);
                C14360o3.A0B(A04, 0);
                C14360o3.A0B(A0n, 3);
                C14360o3.A0B(A0o, 4);
                AbstractC25229BEm.A1I(A0o2, 5, str);
                String A0g = AnonymousClass001.A0g(AbstractC166997dE.A0p(A04, 2131966710), "\n\n", AbstractC166997dE.A0p(A04, 2131966712));
                C193328hC A0H = AbstractC31171DnF.A0H(A04);
                A0H.A0A(2131966714);
                A0H.A0r(A0g);
                A0H.A0F(DialogInterfaceOnClickListenerC35438Fjv.A00);
                A0H.A0b(new DialogInterfaceOnClickListenerC35376Fir(A04, A0S, g7u, A0n, A0o, A0o2, str, 1), AbstractC166997dE.A0p(A04, 2131957627));
                AbstractC166987dD.A1W(A0H);
                InterfaceC02590Ai A0f2 = AbstractC166987dD.A0f(AbstractC12220kQ.A01(g7u, A0S), "instagram_shopping_mini_shop_legal_nux_impression");
                if (A0f2.isSampled()) {
                    AbstractC31181DnP.A0j(A0f2, str, A0n, A0o, A0o2);
                    if (A0i == null) {
                        c0Zx = null;
                    } else {
                        c0Zx = new C0Zx();
                        c0Zx.A06("m_pk", A0i);
                        c0Zx.A06("tracking_token", AbstractC41071vF.A0I(A0S, A0i));
                    }
                    A0f2.AAQ(c0Zx, "ads_tracking_info");
                    A0f2.Cht();
                }
                AbstractC31177DnL.A1N(C41768Iek.A02(A0S, c41768Iek), "has_shown_mini_shop_legal_dialog", true);
                return null;
            }
            return null;
        }
        return null;
    }
}
