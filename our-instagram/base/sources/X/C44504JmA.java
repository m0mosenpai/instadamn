package X;

import com.instagram.business.promote.model.PromoteData;
import com.instagram.business.promote.model.PromoteState;
import com.instagram.common.session.UserSession;

/* renamed from: X.JmA, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44504JmA extends AbstractC52922bZ {
    public final C2GT A00;
    public final P4U A01;
    public final PromoteData A02;
    public final PromoteState A03;
    public final UserSession A04;
    public final Long A05;
    public final String A06;
    public final C05A A07;

    public C44504JmA(C152406tQ c152406tQ, P4U p4u, PromoteData promoteData, PromoteState promoteState) {
        this.A02 = promoteData;
        this.A03 = promoteState;
        this.A01 = p4u;
        UserSession userSession = promoteData.A0y;
        C14360o3.A06(userSession);
        this.A04 = userSession;
        this.A06 = (String) c152406tQ.A00(MSV.A00(500));
        this.A05 = AbstractC25233BEq.A0n(AbstractC166997dE.A0Y(userSession).A03.getFbidV2());
        C008002u A00 = C10E.A00(promoteData.A0d);
        this.A07 = A00;
        this.A00 = AbstractC31172DnG.A0E(A00);
    }
}
