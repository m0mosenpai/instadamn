package X;

import com.instagram.api.schemas.LeadGenEntryPoint;
import com.instagram.business.promote.model.PromoteData;
import com.instagram.common.session.UserSession;
import com.instagram.leadgen.core.model.LeadGenBaseFormList;

/* loaded from: classes9.dex */
public final class NP6 extends AbstractC51028Mgb {
    public final LeadGenEntryPoint A00;
    public final PromoteData A01;
    public final UserSession A02;
    public final LeadGenBaseFormList A03;
    public final String A04;

    public NP6(P4U p4u, PromoteData promoteData) {
        super(new C55017OWq(p4u));
        this.A01 = promoteData;
        UserSession userSession = promoteData.A0y;
        C14360o3.A06(userSession);
        this.A02 = userSession;
        LeadGenEntryPoint leadGenEntryPoint = LeadGenEntryPoint.A06;
        this.A00 = leadGenEntryPoint;
        this.A03 = new LeadGenBaseFormList(null, null, null, "", AbstractC166987dD.A1E(), false);
        this.A04 = AbstractC167007dF.A0h(leadGenEntryPoint.A00);
    }
}
