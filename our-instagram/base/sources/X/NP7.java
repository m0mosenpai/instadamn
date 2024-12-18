package X;

import com.instagram.api.schemas.LeadGenEntryPoint;
import com.instagram.common.session.UserSession;
import com.instagram.leadgen.core.model.LeadGenBaseFormList;

/* loaded from: classes9.dex */
public final class NP7 extends AbstractC51028Mgb {
    public String A00;
    public final LeadGenEntryPoint A01;
    public final UserSession A02;
    public final LeadGenBaseFormList A03;
    public final P4X A04;
    public final EnumC53251Ngp A05;
    public final Long A06;
    public final String A07;
    public final boolean A08;
    public final boolean A09;
    public final Object A0A;

    public NP7(C152406tQ c152406tQ, UserSession userSession, P4X p4x) {
        super(new C55017OWq(p4x));
        EnumC53251Ngp enumC53251Ngp;
        this.A02 = userSession;
        this.A04 = p4x;
        Object A00 = c152406tQ.A00("args_entry_point");
        if (A00 != null) {
            this.A0A = A00;
            boolean equals = A00.equals("lead_gen_support_link_fragment_entrypoint");
            this.A08 = equals;
            if (equals) {
                enumC53251Ngp = EnumC53251Ngp.A05;
            } else {
                enumC53251Ngp = EnumC53251Ngp.A04;
            }
            this.A05 = enumC53251Ngp;
            this.A07 = MSZ.A0t(enumC53251Ngp);
            this.A06 = AbstractC25233BEq.A0n(AbstractC50522MSa.A0k(this.A02));
            this.A01 = enumC53251Ngp.A01;
            Object A002 = c152406tQ.A00("args_form_list_data");
            if (A002 != null) {
                this.A03 = (LeadGenBaseFormList) A002;
                this.A09 = true;
                return;
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
        throw AbstractC166987dD.A14("Required value was null.");
    }

    public final boolean A05() {
        return this.A09;
    }
}
