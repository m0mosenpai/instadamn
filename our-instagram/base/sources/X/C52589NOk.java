package X;

import com.instagram.common.session.UserSession;
import com.instagram.leadgen.core.model.LeadGenBaseFormList;
import com.instagram.leadgen.organic.model.LeadGenFormData;

/* renamed from: X.NOk, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52589NOk extends AbstractC51032Mgg {
    public final UserSession A00;
    public final LeadGenBaseFormList A01;
    public final P4X A02;
    public final EnumC53251Ngp A03;
    public final LeadGenFormData A04;
    public final Long A05;
    public final String A06;
    public final boolean A07;

    public C52589NOk(C152406tQ c152406tQ, UserSession userSession, P4X p4x) {
        super(new OMD(userSession));
        this.A00 = userSession;
        this.A02 = p4x;
        Object A00 = c152406tQ.A00("args_form_data");
        if (A00 != null) {
            LeadGenFormData leadGenFormData = (LeadGenFormData) A00;
            this.A04 = leadGenFormData;
            EnumC53251Ngp enumC53251Ngp = leadGenFormData.A01;
            this.A03 = enumC53251Ngp;
            this.A06 = MSZ.A0t(enumC53251Ngp);
            this.A05 = AbstractC25233BEq.A0n(AbstractC50522MSa.A0k(this.A00));
            LeadGenBaseFormList leadGenBaseFormList = (LeadGenBaseFormList) c152406tQ.A00("args_form_list_data");
            this.A01 = leadGenBaseFormList == null ? new LeadGenBaseFormList(null, null, null, "", AbstractC166987dD.A1E(), false) : leadGenBaseFormList;
            this.A07 = AbstractC50523MSb.A1Z(c152406tQ, "args_is_from_one_tap_onboarding_custom_form_flow");
            return;
        }
        throw AbstractC166997dE.A0g();
    }
}
