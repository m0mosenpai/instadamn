package X;

import com.instagram.common.session.UserSession;
import com.instagram.leadgen.organic.model.LeadGenFormData;

/* renamed from: X.NOw, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52601NOw extends AbstractC50903MeY {
    public final UserSession A00;
    public final LeadGenFormData A01;
    public final String A02;

    public C52601NOw(C152406tQ c152406tQ, UserSession userSession, P4X p4x) {
        super(new O3T(p4x));
        this.A00 = userSession;
        Object A00 = c152406tQ.A00("args_form_data");
        if (A00 != null) {
            LeadGenFormData leadGenFormData = (LeadGenFormData) A00;
            this.A01 = leadGenFormData;
            this.A02 = MSZ.A0t(leadGenFormData.A01);
            String str = leadGenFormData.A04;
            C14360o3.A0B(str, 0);
            super.A00 = str;
            return;
        }
        throw AbstractC166997dE.A0g();
    }
}
