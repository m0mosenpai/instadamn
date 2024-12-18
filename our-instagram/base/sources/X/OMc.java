package X;

import android.content.Context;
import android.os.Handler;
import android.view.GestureDetector;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* loaded from: classes9.dex */
public final class OMc {
    public C190458c3 A00;
    public C54496O5y A01;
    public boolean A02;
    public boolean A03;
    public Handler A04;
    public String A05;
    public AnonymousClass195 A06;
    public boolean A07;
    public final View A08;
    public final EditText A09;
    public final InterfaceC216113n A0A;
    public final AbstractC59962oe A0B;
    public final UserSession A0C;
    public final User A0D;
    public final InterfaceC147636ko A0E;
    public final EnumC142806cg A0F;
    public final OT2 A0G;
    public final OLC A0H;
    public final AbstractC147826l7 A0I;
    public final C55128Obp A0J;

    public final void A03(String str) {
        if (!this.A07) {
            this.A07 = true;
            AbstractC166997dE.A1Y(this.A0I.A02().A0G, true);
            String str2 = this.A05;
            if (str2 != null && !AbstractC50102Ry.A00(str2, str)) {
                throw AbstractC166987dD.A1D("IgLiveReactionsPresenter started with different broadcastId");
            }
            this.A04 = AbstractC167007dF.A0J();
            this.A08.setVisibility(0);
            if (this.A05 == null) {
                this.A05 = str;
                View A0S = AbstractC166997dE.A0S(this.A0B.requireView(), R.id.dismiss_view_background);
                A0S.setVisibility(4);
                A0S.setOnTouchListener(new ViewOnTouchListenerC55487Okg(2, this, new GestureDetector(A0S.getContext(), new C51471MoI(this, 2))));
            }
            if (this.A06 == null) {
                this.A06 = AbstractC18560vj.A03(AbstractC25235BEs.A0S(this.A0B), MSW.A1I(new C57154PYy(this, null, 3), AbstractC147826l7.A0K.A00(this.A0C, this.A0F).A04.A08));
            }
        }
    }

    public final void A00() {
        AbstractC13880nE.A0O(this.A0B.requireView());
    }

    public final void A01() {
        if (this.A07) {
            this.A07 = false;
            AbstractC166997dE.A1Y(this.A0I.A02().A0G, false);
            AnonymousClass195 anonymousClass195 = this.A06;
            if (anonymousClass195 != null) {
                anonymousClass195.AGH(null);
            }
            this.A06 = null;
            this.A08.setVisibility(8);
            C171547kk.A02 = null;
            Handler handler = this.A04;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
        }
    }

    public final void A02(int i) {
        Context context;
        C3DN A01;
        if (!this.A02) {
            boolean z = this.A03;
            boolean A1S = AbstractC25230BEn.A1S(i, AbstractC166987dD.A0H(this.A0A.get()));
            this.A03 = A1S;
            if (A1S && (context = this.A0B.getContext()) != null && (A01 = C3DN.A00.A01(context)) != null && ((C3DP) A01).A0h) {
                return;
            }
            C55128Obp c55128Obp = this.A0J;
            if (c55128Obp != null) {
                c55128Obp.A01 = i;
                C55128Obp.A02(c55128Obp, C05F.A00, true);
            }
            boolean z2 = this.A03;
            if (z == z2 || z2 || AbstractC13440mV.A07()) {
                return;
            }
            AbstractC59962oe abstractC59962oe = this.A0B;
            Window A0H = AbstractC31174DnI.A0H(abstractC59962oe);
            C14360o3.A07(A0H);
            AbstractC56402iY.A07(abstractC59962oe.mView, A0H, false);
        }
    }

    public final void A04(boolean z) {
        C55128Obp c55128Obp;
        if (this.A07 && (c55128Obp = this.A0J) != null && c55128Obp.A03 != z) {
            c55128Obp.A03 = z;
            C55128Obp.A01(c55128Obp);
        }
    }

    public /* synthetic */ OMc(InterfaceC216113n interfaceC216113n, AbstractC59962oe abstractC59962oe, UserSession userSession, User user, InterfaceC147636ko interfaceC147636ko, EnumC142806cg enumC142806cg, AbstractC147826l7 abstractC147826l7, C55128Obp c55128Obp) {
        OLC A02 = abstractC147826l7.A02();
        AbstractC167007dF.A1I(interfaceC216113n, 5, A02);
        this.A0C = userSession;
        this.A0B = abstractC59962oe;
        this.A0D = user;
        this.A0J = c55128Obp;
        this.A0A = interfaceC216113n;
        this.A0I = abstractC147826l7;
        this.A0H = A02;
        this.A0F = enumC142806cg;
        this.A0E = interfaceC147636ko;
        this.A0G = new OT2(abstractC59962oe, userSession);
        this.A08 = AbstractC166987dD.A0c(abstractC59962oe.requireView(), R.id.iglive_reactions_extensions);
        this.A09 = (EditText) AbstractC166997dE.A0R(abstractC59962oe.requireView(), R.id.comment_composer_edit_text);
        this.A00 = new C190458c3(abstractC59962oe, userSession);
        if (enumC142806cg == EnumC142806cg.A05 && C18U.A06(C06090Tz.A05, userSession, 36321219867976940L)) {
            PYu.A01(this, AbstractC25229BEm.A0a(abstractC59962oe), 12);
        }
    }
}
