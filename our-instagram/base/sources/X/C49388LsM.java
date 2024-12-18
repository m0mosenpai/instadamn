package X;

import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.model.hashtag.Hashtag;
import com.instagram.model.reels.Reel;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.LsM, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49388LsM implements InterfaceC75453aC {
    public final UserSession A00;
    public final C38018Go6 A01;
    public final InterfaceC75453aC A02;
    public final AbstractC59962oe A03;
    public final C38E A04;
    public final String A05;

    public C49388LsM(AbstractC59962oe abstractC59962oe, UserSession userSession, C38018Go6 c38018Go6, InterfaceC75453aC interfaceC75453aC, C38E c38e, String str) {
        C14360o3.A0B(interfaceC75453aC, 1);
        AbstractC25234BEr.A1R(userSession, abstractC59962oe, c38018Go6, c38e, str);
        this.A02 = interfaceC75453aC;
        this.A00 = userSession;
        this.A03 = abstractC59962oe;
        this.A01 = c38018Go6;
        this.A04 = c38e;
        this.A05 = str;
    }

    public static InterfaceC75453aC A00(C49388LsM c49388LsM, Object obj) {
        C14360o3.A0B(obj, 0);
        return c49388LsM.A02;
    }

    @Override // X.InterfaceC75453aC
    public final void Cvh(C38321qM c38321qM, C75113Zb c75113Zb, Integer num, String str, boolean z) {
        AbstractC167017dG.A1N(c38321qM, c75113Zb);
        C14360o3.A0B(num, 3);
        this.A02.Cvh(c38321qM, c75113Zb, num, str, z);
    }

    @Override // X.InterfaceC75453aC
    public final void D3v(C38321qM c38321qM, C75113Zb c75113Zb) {
        AbstractC167007dF.A1K(c38321qM, c75113Zb);
        UserSession userSession = this.A00;
        User A2E = c38321qM.A2E(userSession);
        if (A2E != null) {
            if (A2E.A0F() == FollowStatus.A06) {
                AbstractC59962oe abstractC59962oe = this.A03;
                C1ON A00 = AbstractC40595HzF.A00(userSession, A2E.getId());
                A00.A00 = new C32540EUq(8, c75113Zb, A2E, this);
                abstractC59962oe.schedule(A00);
                return;
            }
            if (A2E.A0F() != FollowStatus.A05 || !c75113Zb.A2v) {
                return;
            }
            c75113Zb.A2v = false;
            C38018Go6.A00(this.A01);
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.InterfaceC75453aC
    public final void D4C(C38321qM c38321qM, C75113Zb c75113Zb, String str) {
    }

    @Override // X.InterfaceC75453aC
    public final void D4G(C38321qM c38321qM, C75113Zb c75113Zb, Boolean bool, int i, boolean z) {
        AbstractC167017dG.A1N(c38321qM, c75113Zb);
        this.A02.D4G(c38321qM, c75113Zb, bool, i, z);
    }

    @Override // X.InterfaceC75453aC
    public final void D4I(C38321qM c38321qM, C75113Zb c75113Zb, Reel reel, C3Ow c3Ow) {
        C14360o3.A0B(reel, 0);
        AbstractC167027dH.A13(c38321qM, c75113Zb, c3Ow);
        this.A02.D4I(c38321qM, c75113Zb, reel, c3Ow);
    }

    @Override // X.InterfaceC75453aC
    public final void D4L(C38321qM c38321qM, C75113Zb c75113Zb, Reel reel, C3Ow c3Ow) {
        AbstractC167007dF.A1E(reel, 0, c3Ow);
        List A1J = AbstractC166987dD.A1J(reel);
        C38E c38e = this.A04;
        c38e.A0C = this.A05;
        c38e.A05 = new C31559Dtj(this.A03.getActivity(), c3Ow.Aek(), new GF3(this, 4));
        c38e.A06(reel, C3G2.A0p, c3Ow, A1J, A1J, A1J);
    }

    @Override // X.InterfaceC75453aC
    public final void D4g(C38321qM c38321qM, C75113Zb c75113Zb, String str, int i, boolean z) {
        AbstractC167027dH.A12(c38321qM, c75113Zb, str);
        this.A02.D4g(c38321qM, c75113Zb, str, i, z);
    }

    @Override // X.InterfaceC75453aC
    public final void D4x(C8JW c8jw, C3x9 c3x9, C38321qM c38321qM, C75113Zb c75113Zb) {
        C14360o3.A0B(c38321qM, 0);
        AbstractC167027dH.A13(c75113Zb, c8jw, c3x9);
        this.A02.D4x(c8jw, c3x9, c38321qM, c75113Zb);
    }

    @Override // X.C37A
    public final InterfaceC690038m BDf() {
        return this.A02.BDf();
    }

    @Override // X.InterfaceC75453aC
    public final void D4D() {
        this.A02.D4D();
    }

    @Override // X.InterfaceC75453aC
    public final void Coc(View view, String str) {
        AbstractC167017dG.A1N(view, str);
        this.A02.Coc(view, str);
    }

    @Override // X.InterfaceC75453aC
    public final void Cop(View view, String str) {
        AbstractC167017dG.A1N(view, str);
        this.A02.Cop(view, str);
    }

    @Override // X.InterfaceC75453aC
    public final void CyL(C38321qM c38321qM) {
        A00(this, c38321qM).CyL(c38321qM);
    }

    @Override // X.InterfaceC75453aC
    public final void CzQ(C76623c7 c76623c7, C75113Zb c75113Zb) {
        AbstractC167017dG.A1N(c76623c7, c75113Zb);
        this.A02.CzQ(c76623c7, c75113Zb);
    }

    @Override // X.InterfaceC75453aC
    public final void CzS(C38321qM c38321qM, String str) {
        AbstractC167017dG.A1N(str, c38321qM);
        this.A02.CzS(c38321qM, str);
    }

    @Override // X.InterfaceC75453aC
    public final void D3Y(C38321qM c38321qM, C75113Zb c75113Zb, User user, int i) {
        AbstractC167027dH.A12(user, c38321qM, c75113Zb);
        this.A02.D3Y(c38321qM, c75113Zb, user, i);
    }

    @Override // X.InterfaceC75453aC
    public final void D3Z(C38321qM c38321qM, C75113Zb c75113Zb) {
        AbstractC167017dG.A1N(c38321qM, c75113Zb);
        this.A02.D3Z(c38321qM, c75113Zb);
    }

    @Override // X.InterfaceC75453aC
    public final void D3a(User user) {
        A00(this, user).D3a(user);
    }

    @Override // X.InterfaceC75453aC
    public final void D3e(C38321qM c38321qM) {
        A00(this, c38321qM).D3e(c38321qM);
    }

    @Override // X.InterfaceC75453aC
    public final void D3f(C38321qM c38321qM, C75113Zb c75113Zb, int i) {
        AbstractC167017dG.A1N(c38321qM, c75113Zb);
        this.A02.D3f(c38321qM, c75113Zb, i);
    }

    @Override // X.InterfaceC75453aC
    public final void D3h(C38321qM c38321qM) {
        A00(this, c38321qM).D3h(c38321qM);
    }

    @Override // X.InterfaceC75453aC
    public final void D3k(C38321qM c38321qM, C75113Zb c75113Zb, int i, boolean z) {
        AbstractC167017dG.A1N(c38321qM, c75113Zb);
        this.A02.D3k(c38321qM, c75113Zb, i, z);
    }

    @Override // X.InterfaceC75453aC
    public final void D3l(C38321qM c38321qM, C75113Zb c75113Zb, int i, boolean z) {
        AbstractC167017dG.A1N(c38321qM, c75113Zb);
        this.A02.D3l(c38321qM, c75113Zb, i, z);
    }

    @Override // X.InterfaceC75453aC
    public final void D3q(C38321qM c38321qM, C75113Zb c75113Zb) {
        AbstractC167017dG.A1N(c38321qM, c75113Zb);
        this.A02.D3q(c38321qM, c75113Zb);
    }

    @Override // X.InterfaceC75453aC
    public final void D3y(C38321qM c38321qM) {
        A00(this, c38321qM).D3y(c38321qM);
    }

    @Override // X.InterfaceC75453aC
    public final void D41(C38321qM c38321qM, C75113Zb c75113Zb, Hashtag hashtag, int i) {
        AbstractC167027dH.A12(c38321qM, hashtag, c75113Zb);
        this.A02.D41(c38321qM, c75113Zb, hashtag, i);
    }

    @Override // X.InterfaceC75453aC
    public final void D43(C38321qM c38321qM) {
        A00(this, c38321qM).D43(c38321qM);
    }

    @Override // X.InterfaceC75453aC
    public final void D46(C38321qM c38321qM) {
        A00(this, c38321qM).D46(c38321qM);
    }

    @Override // X.InterfaceC75453aC
    public final void D47(String str) {
        A00(this, str).D47(str);
    }

    @Override // X.InterfaceC75453aC
    public final void D48(C38321qM c38321qM, C75113Zb c75113Zb, int i) {
        AbstractC167017dG.A1N(c38321qM, c75113Zb);
        this.A02.D48(c38321qM, c75113Zb, i);
    }

    @Override // X.InterfaceC75453aC
    public final void D49(C38321qM c38321qM, C75113Zb c75113Zb) {
        AbstractC167017dG.A1N(c38321qM, c75113Zb);
        this.A02.D49(c38321qM, c75113Zb);
    }

    @Override // X.InterfaceC75453aC
    public final void D4M(C38321qM c38321qM) {
        A00(this, c38321qM).D4M(c38321qM);
    }

    @Override // X.InterfaceC75453aC
    public final void D4X(C38321qM c38321qM, C75113Zb c75113Zb, int i) {
        AbstractC167017dG.A1N(c38321qM, c75113Zb);
        this.A02.D4X(c38321qM, c75113Zb, i);
    }

    @Override // X.InterfaceC75453aC
    public final void D4Y(C38321qM c38321qM, C75113Zb c75113Zb) {
        AbstractC167017dG.A1N(c38321qM, c75113Zb);
        this.A02.D4Y(c38321qM, c75113Zb);
    }

    @Override // X.InterfaceC75453aC
    public final void D4Z(C38321qM c38321qM, C75113Zb c75113Zb, boolean z) {
        AbstractC167017dG.A1N(c38321qM, c75113Zb);
        this.A02.D4Z(c38321qM, c75113Zb, z);
    }

    @Override // X.InterfaceC75453aC
    public final void D4e(C38321qM c38321qM, C75113Zb c75113Zb, boolean z) {
        AbstractC167017dG.A1N(c38321qM, c75113Zb);
        this.A02.D4e(c38321qM, c75113Zb, z);
    }

    @Override // X.InterfaceC75453aC
    public final void D4h(User user) {
        A00(this, user).D4h(user);
    }

    @Override // X.InterfaceC75453aC
    public final void D4i(C38321qM c38321qM, C75113Zb c75113Zb, int i) {
        AbstractC167017dG.A1N(c38321qM, c75113Zb);
        this.A02.D4i(c38321qM, c75113Zb, i);
    }

    @Override // X.InterfaceC75453aC
    public final void D4j(C38321qM c38321qM) {
        A00(this, c38321qM).D4j(c38321qM);
    }

    @Override // X.InterfaceC75453aC
    public final View.OnTouchListener D4y(C38321qM c38321qM) {
        return A00(this, c38321qM).D4y(c38321qM);
    }

    @Override // X.InterfaceC75453aC
    public final void D4z(C38321qM c38321qM, boolean z) {
        A00(this, c38321qM).D4z(c38321qM, z);
    }

    @Override // X.InterfaceC75453aC
    public final void D5K(C38321qM c38321qM) {
        A00(this, c38321qM).D5K(c38321qM);
    }

    @Override // X.InterfaceC75453aC
    public final void D5R(C38321qM c38321qM) {
        A00(this, c38321qM).D5R(c38321qM);
    }

    @Override // X.InterfaceC75453aC
    public final void D5Z(String str) {
        A00(this, str).D5Z(str);
    }

    @Override // X.InterfaceC75453aC
    public final void D5k(C38321qM c38321qM) {
        A00(this, c38321qM).D5k(c38321qM);
    }

    @Override // X.InterfaceC75453aC
    public final void DS6(View view, C38321qM c38321qM) {
        AbstractC167017dG.A1N(c38321qM, view);
        this.A02.DS6(view, c38321qM);
    }

    @Override // X.InterfaceC75453aC
    public final void DWZ(String str) {
        A00(this, str).DWZ(str);
    }

    @Override // X.InterfaceC75453aC
    public final void DX5(C38321qM c38321qM) {
        A00(this, c38321qM).DX5(c38321qM);
    }

    @Override // X.InterfaceC75453aC
    public final void DX6(C38321qM c38321qM, C75113Zb c75113Zb) {
        AbstractC167017dG.A1N(c38321qM, c75113Zb);
        this.A02.DX6(c38321qM, c75113Zb);
    }

    @Override // X.InterfaceC75453aC
    public final void Dcz(C38321qM c38321qM) {
        A00(this, c38321qM).Dcz(c38321qM);
    }

    @Override // X.InterfaceC75453aC
    public final View.OnTouchListener DuE(C38321qM c38321qM, String str, String str2) {
        AbstractC167027dH.A12(c38321qM, str, str2);
        return this.A02.DuE(c38321qM, str, str2);
    }

    @Override // X.InterfaceC75453aC
    public final View.OnTouchListener DuF(C38321qM c38321qM, String str, String str2) {
        AbstractC167027dH.A12(c38321qM, str, str2);
        return this.A02.DuF(c38321qM, str, str2);
    }

    @Override // X.InterfaceC75453aC
    public final View.OnTouchListener DuM(C38321qM c38321qM, String str, String str2) {
        AbstractC167027dH.A12(c38321qM, str, str2);
        return this.A02.DuM(c38321qM, str, str2);
    }

    @Override // X.InterfaceC75453aC
    public final void Dvc(C38321qM c38321qM) {
        A00(this, c38321qM).Dvc(c38321qM);
    }
}
