package X;

import com.instagram.common.session.UserSession;
import com.instagram.leadgen.organic.model.LeadGenFormData;

/* renamed from: X.Mf2, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50933Mf2 extends AbstractC52922bZ {
    public String A00;
    public final UserSession A01;
    public final O3T A02;
    public final LeadGenFormData A03;
    public final String A04;
    public final InterfaceC24731Iq A05;
    public final InterfaceC19390xP A06;

    public C50933Mf2(C152406tQ c152406tQ, UserSession userSession, P4X p4x) {
        this.A01 = userSession;
        C24721Ip A0q = MSX.A0q();
        this.A05 = A0q;
        this.A06 = AbstractC07080Za.A03(A0q);
        Object A00 = c152406tQ.A00("args_form_data");
        if (A00 != null) {
            LeadGenFormData leadGenFormData = (LeadGenFormData) A00;
            this.A03 = leadGenFormData;
            this.A04 = MSZ.A0t(leadGenFormData.A01);
            this.A00 = leadGenFormData.A04;
            this.A02 = new O3T(p4x);
            return;
        }
        throw AbstractC166997dE.A0g();
    }
}
