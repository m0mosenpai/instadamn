package X;

import com.instagram.common.session.UserSession;
import com.instagram.leadgen.organic.model.LeadGenConsumerFormData;

/* renamed from: X.Meq, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50921Meq extends AbstractC52922bZ {
    public final OMD A00;
    public final LeadGenConsumerFormData A01;
    public final InterfaceC24731Iq A02;
    public final InterfaceC19390xP A03;
    public final C05A A04 = MSZ.A0y();
    public final UserSession A05;

    public C50921Meq(C152406tQ c152406tQ, UserSession userSession) {
        this.A05 = userSession;
        this.A00 = new OMD(userSession);
        this.A01 = (LeadGenConsumerFormData) c152406tQ.A00("args_consumer_form_data");
        C24721Ip A0q = MSX.A0q();
        this.A02 = A0q;
        this.A03 = AbstractC07080Za.A03(A0q);
    }
}
