package X;

import com.instagram.api.schemas.LeadGenEntryPoint;
import com.instagram.business.promote.model.PromoteData;
import com.instagram.business.promote.model.PromoteState;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class NPB extends AbstractC50969Mfc {
    public final PromoteData A00;
    public final PromoteState A01;
    public final UserSession A02;
    public final String A03;
    public final P4U A04;

    public NPB(P4U p4u, PromoteData promoteData, PromoteState promoteState) {
        super(new OH4(p4u));
        this.A00 = promoteData;
        this.A01 = promoteState;
        this.A04 = p4u;
        UserSession userSession = promoteData.A0y;
        C14360o3.A06(userSession);
        this.A02 = userSession;
        this.A03 = AbstractC167007dF.A0h(LeadGenEntryPoint.A06.A00);
        AbstractC43594JPz.A1T(super.A04);
    }
}
