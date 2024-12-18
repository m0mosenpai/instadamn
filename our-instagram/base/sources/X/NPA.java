package X;

import com.instagram.common.session.UserSession;
import com.instagram.leadgen.organic.model.LeadGenFormData;

/* loaded from: classes9.dex */
public final class NPA extends AbstractC50969Mfc {
    public final UserSession A00;
    public final EnumC53251Ngp A01;
    public final LeadGenFormData A02;
    public final String A03;

    public NPA(C152406tQ c152406tQ, UserSession userSession, P4X p4x) {
        super(new OH4(p4x));
        this.A00 = userSession;
        Object A00 = c152406tQ.A00("args_form_data");
        if (A00 != null) {
            LeadGenFormData leadGenFormData = (LeadGenFormData) A00;
            this.A02 = leadGenFormData;
            EnumC53251Ngp enumC53251Ngp = leadGenFormData.A01;
            this.A01 = enumC53251Ngp;
            this.A03 = MSZ.A0t(enumC53251Ngp);
            return;
        }
        throw AbstractC166997dE.A0g();
    }
}
