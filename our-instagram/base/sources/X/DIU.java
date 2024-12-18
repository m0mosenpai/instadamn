package X;

import com.instagram.common.session.UserSession;
import com.instagram.feed.ui.state.IntentAwareAdPivotState;

/* loaded from: classes5.dex */
public final class DIU extends C0YY implements InterfaceC16660sJ {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;
    public final Object A08;
    public final Object A09;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DIU(UserSession userSession, C38321qM c38321qM, IntentAwareAdPivotState intentAwareAdPivotState, C75113Zb c75113Zb, C64052vQ c64052vQ, HBC hbc, C64042vP c64042vP, C60662pp c60662pp, int i, int i2) {
        super(1);
        this.A00 = i2;
        this.A04 = c60662pp;
        this.A02 = c38321qM;
        this.A08 = c75113Zb;
        this.A01 = i;
        this.A09 = userSession;
        this.A03 = hbc;
        this.A07 = c64052vQ;
        this.A05 = c64042vP;
        this.A06 = intentAwareAdPivotState;
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        int i;
        HBC hbc;
        C64042vP c64042vP;
        IntentAwareAdPivotState intentAwareAdPivotState;
        Integer num;
        int i2 = this.A00;
        Object obj2 = this.A04;
        if (i2 != 0) {
            C38321qM c38321qM = (C38321qM) this.A02;
            C75113Zb c75113Zb = (C75113Zb) this.A08;
            i = this.A01;
            ((C60662pp) obj2).A0L(c38321qM, c75113Zb, i);
            UserSession userSession = (UserSession) this.A09;
            hbc = (HBC) this.A03;
            C28492Chk.A04(userSession, c38321qM, (C64052vQ) this.A07, hbc);
            c64042vP = (C64042vP) this.A05;
            intentAwareAdPivotState = (IntentAwareAdPivotState) this.A06;
            num = C05F.A0C;
        } else {
            C38321qM c38321qM2 = (C38321qM) this.A02;
            C75113Zb c75113Zb2 = (C75113Zb) this.A08;
            i = this.A01;
            ((C60662pp) obj2).A0K(c38321qM2, c75113Zb2, i);
            UserSession userSession2 = (UserSession) this.A09;
            hbc = (HBC) this.A03;
            C28492Chk.A04(userSession2, c38321qM2, (C64052vQ) this.A07, hbc);
            c64042vP = (C64042vP) this.A05;
            intentAwareAdPivotState = (IntentAwareAdPivotState) this.A06;
            num = C05F.A0N;
        }
        c64042vP.A0F(intentAwareAdPivotState, hbc, num, i);
        return C0eB.A00;
    }
}
