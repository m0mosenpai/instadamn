package X;

import com.instagram.api.schemas.LeadGenEntryPoint;
import com.instagram.business.promote.model.PromoteData;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class NOT extends AbstractC50891MeM {
    public final PromoteData A00;
    public final UserSession A01;
    public final String A02;
    public final P4U A03;

    public NOT(P4U p4u, PromoteData promoteData) {
        super(new O3R(p4u));
        this.A00 = promoteData;
        this.A03 = p4u;
        UserSession userSession = promoteData.A0y;
        C14360o3.A06(userSession);
        this.A01 = userSession;
        this.A02 = AbstractC167007dF.A0h(LeadGenEntryPoint.A06.A00);
    }
}
