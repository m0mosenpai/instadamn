package X;

import android.widget.TextView;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.user.model.User;
import java.util.List;

/* loaded from: classes11.dex */
public final class VAE extends AbstractC71026Wmh {
    public final int A00;
    public final Object A01;

    public VAE(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.AbstractC71026Wmh, X.XLU
    public final void D3d(Reel reel, C3Ow c3Ow, Tx0 tx0, C65741TtG c65741TtG, boolean z) {
        String str;
        if (1 - this.A00 == 0) {
            List A1J = AbstractC166987dD.A1J(reel);
            V1F v1f = (V1F) this.A01;
            C38E c38e = v1f.A01;
            if (c38e == null) {
                str = "reelViewerLauncher";
            } else {
                String str2 = v1f.A08;
                if (str2 == null) {
                    str = "reelTraySessionId";
                } else {
                    c38e.A0C = str2;
                    c38e.A05 = new C31559Dtj(v1f.getActivity(), c3Ow.Aek(), new Wm5(v1f, 1));
                    c38e.A01 = new C70589WdR(1, tx0, v1f);
                    c38e.A06(reel, C3G2.A1l, c3Ow, A1J, A1J, A1J);
                    return;
                }
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
    }

    @Override // X.XLU
    public final void Dxi(InterfaceC11380iw interfaceC11380iw, Tx0 tx0, C65741TtG c65741TtG) {
        String str;
        if (this.A00 != 0) {
            AbstractC167017dG.A1N(c65741TtG, tx0);
            V1F v1f = (V1F) this.A01;
            V1F.A00(c65741TtG, tx0, v1f);
            C66151U1s c66151U1s = v1f.A05;
            if (c66151U1s == null) {
                str = "searchNavigationController";
            } else {
                c66151U1s.A0A(c65741TtG.A06(), v1f.A07, tx0.A06, tx0.A00);
                return;
            }
        } else {
            C14360o3.A0B(c65741TtG, 0);
            AbstractC167017dG.A1P(tx0, interfaceC11380iw);
            User A06 = c65741TtG.A06();
            int i = tx0.A00;
            WFL wfl = (WFL) this.A01;
            C67910V2a c67910V2a = wfl.A00;
            if (c67910V2a == null) {
                str = "suggestionsAdapter";
            } else {
                String str2 = c67910V2a.A00;
                String id = A06.getId();
                String username = A06.getUsername();
                UserSession userSession = wfl.A0D;
                boolean CPH = C0BQ.A00(userSession).CPH(A06.getId());
                AbstractC19330xH A00 = AbstractC11060iN.A00(userSession);
                C19280xC A002 = C19280xC.A00(interfaceC11380iw, "profile_tagging_search_result_click");
                A002.A0C("link_type", PublicKeyCredentialControllerUtility.JSON_KEY_USER);
                A002.A08(Integer.valueOf(i), "position");
                A002.A0C("link_id", id);
                A002.A0C("link_text", username);
                if (str2 != null) {
                    A002.A0C("rank_token", str2);
                }
                A002.A09("is_mas", Boolean.valueOf(CPH));
                A00.EHW(A002);
                if (!A06.A2D()) {
                    WFL.A02(wfl, A06);
                    FDR.A00(AbstractC12220kQ.A01(interfaceC11380iw, userSession), userSession, A06, "profile_bio", "click", AbstractC111324zv.A00(67));
                    return;
                }
                C7OR.A00(wfl.A06, wfl.A0F, A06.getUsername(), false);
                TextView textView = wfl.A08;
                if (textView != null) {
                    textView.setClickable(true);
                    textView.setSelected(false);
                    return;
                }
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC71026Wmh, X.XLU
    public final void Dxr(InterfaceC11380iw interfaceC11380iw, Tx0 tx0, C65741TtG c65741TtG) {
        if (1 - this.A00 == 0) {
            V1F.A00(c65741TtG, tx0, (V1F) this.A01);
        }
    }
}
