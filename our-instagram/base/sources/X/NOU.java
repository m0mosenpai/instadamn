package X;

import com.instagram.common.session.UserSession;
import com.instagram.leadgen.organic.model.LeadGenFormData;

/* loaded from: classes9.dex */
public final class NOU extends AbstractC50891MeM {
    public final UserSession A00;
    public final LeadGenFormData A01;
    public final String A02;
    public final P4X A03;

    public NOU(C152406tQ c152406tQ, UserSession userSession, P4X p4x) {
        super(new O3R(p4x));
        this.A00 = userSession;
        this.A03 = p4x;
        Object A00 = c152406tQ.A00("args_form_data");
        if (A00 != null) {
            LeadGenFormData leadGenFormData = (LeadGenFormData) A00;
            this.A01 = leadGenFormData;
            this.A02 = MSZ.A0t(leadGenFormData.A01);
            return;
        }
        throw AbstractC166997dE.A0g();
    }
}
