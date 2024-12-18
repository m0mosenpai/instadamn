package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public abstract class F14 {
    public static final void A00(UserSession userSession) {
        "continuous_contact_upload_job_scheduled".getClass();
        C19280xC A01 = C19280xC.A01("continuous_contact_upload_job_scheduled", null);
        C19U A012 = AbstractC31172DnG.A0P(userSession).A01(C19T.A1R);
        if (A012 != null) {
            A01.A0C("phone_id", A012.A01);
        }
        AbstractC31173DnH.A1S(A01, userSession);
    }
}
