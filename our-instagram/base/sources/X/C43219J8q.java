package X;

import com.instagram.common.session.UserSession;
import com.instagram.feed.ui.state.IntentAwareAdPivotState;

/* renamed from: X.J8q, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C43219J8q extends C0YY implements InterfaceC16660sJ {
    public final /* synthetic */ int A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ C38321qM A02;
    public final /* synthetic */ IntentAwareAdPivotState A03;
    public final /* synthetic */ C64052vQ A04;
    public final /* synthetic */ HBC A05;
    public final /* synthetic */ C64042vP A06;
    public final /* synthetic */ C60662pp A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C43219J8q(UserSession userSession, C38321qM c38321qM, IntentAwareAdPivotState intentAwareAdPivotState, C64052vQ c64052vQ, HBC hbc, C64042vP c64042vP, C60662pp c60662pp, int i) {
        super(1);
        this.A07 = c60662pp;
        this.A02 = c38321qM;
        this.A01 = userSession;
        this.A05 = hbc;
        this.A04 = c64052vQ;
        this.A06 = c64042vP;
        this.A03 = intentAwareAdPivotState;
        this.A00 = i;
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C60662pp c60662pp = this.A07;
        C38321qM c38321qM = this.A02;
        c60662pp.A0H(c38321qM);
        UserSession userSession = this.A01;
        HBC hbc = this.A05;
        C28492Chk.A04(userSession, c38321qM, this.A04, hbc);
        this.A06.A0F(this.A03, hbc, C05F.A01, this.A00);
        return C0eB.A00;
    }
}
