package X;

import android.graphics.RectF;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.profilecard.domain.ProfileCardViewModel;

/* renamed from: X.Byy, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27179Byy extends G1K {
    public final FragmentActivity A00;
    public final InterfaceC11380iw A01;
    public final UserSession A02;
    public final O7E A03;
    public final ProfileCardViewModel A04;

    public C27179Byy(FragmentActivity fragmentActivity, InterfaceC11380iw interfaceC11380iw, UserSession userSession, O7E o7e, ProfileCardViewModel profileCardViewModel) {
        AbstractC25233BEq.A0w(1, userSession, o7e, profileCardViewModel);
        this.A02 = userSession;
        this.A00 = fragmentActivity;
        this.A03 = o7e;
        this.A04 = profileCardViewModel;
        this.A01 = interfaceC11380iw;
    }

    @Override // X.G1K, X.InterfaceC37290Gbr
    public final void DN4() {
        ProfileCardViewModel profileCardViewModel = this.A04;
        FragmentActivity fragmentActivity = this.A00;
        C14360o3.A0B(fragmentActivity, 0);
        CJA.A00(fragmentActivity, EnumC33510Erj.PROFILE_CARD, profileCardViewModel.A0F, false, false);
    }

    @Override // X.G1K, X.InterfaceC37290Gbr
    public final void DBh() {
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putInt("header_res_key", 2131961149);
        C26717Bqy c26717Bqy = new C26717Bqy();
        c26717Bqy.setArguments(A0b);
        UserSession userSession = this.A02;
        boolean A06 = C18U.A06(C06090Tz.A05, userSession, 36327335901542919L);
        ProfileCardViewModel profileCardViewModel = this.A04;
        InterfaceC11380iw interfaceC11380iw = this.A01;
        DHP dhp = new DHP(21, this, A06);
        C14360o3.A0B(profileCardViewModel, 0);
        AbstractC167017dG.A1P(userSession, interfaceC11380iw);
        c26717Bqy.A00 = new C54695ODv(interfaceC11380iw, userSession, profileCardViewModel, dhp, false, A06);
        C189448aO A0y = AbstractC25225BEi.A0y(userSession);
        A0y.A0k = true;
        A0y.A1O = true;
        A0y.A00().A02(this.A00, c26717Bqy);
    }

    @Override // X.G1K, X.InterfaceC37290Gbr
    public final void Dgb(RectF rectF, int i) {
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putInt("header_res_key", 2131952408);
        C26717Bqy c26717Bqy = new C26717Bqy();
        c26717Bqy.setArguments(A0b);
        ProfileCardViewModel profileCardViewModel = this.A04;
        UserSession userSession = this.A02;
        InterfaceC11380iw interfaceC11380iw = this.A01;
        C57748Pjb c57748Pjb = new C57748Pjb(this, 40);
        C14360o3.A0B(profileCardViewModel, 0);
        AbstractC167007dF.A1D(userSession, 1, interfaceC11380iw);
        c26717Bqy.A00 = new C54695ODv(interfaceC11380iw, userSession, profileCardViewModel, c57748Pjb, true, false);
        C189448aO A0y = AbstractC25225BEi.A0y(userSession);
        A0y.A0k = true;
        A0y.A1O = true;
        A0y.A00().A02(this.A00, c26717Bqy);
    }
}
