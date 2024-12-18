package X;

import com.instagram.common.session.UserSession;
import com.instagram.leadgen.organic.model.LeadGenConsumerFormData;

/* renamed from: X.NOa, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52580NOa extends AbstractC50967Mfa {
    public final UserSession A00;
    public final OMD A01;
    public final LeadGenConsumerFormData A02;

    public C52580NOa(C152406tQ c152406tQ, UserSession userSession) {
        this.A00 = userSession;
        this.A01 = new OMD(userSession);
        this.A02 = (LeadGenConsumerFormData) c152406tQ.A00("args_consumer_form_data");
    }
}
