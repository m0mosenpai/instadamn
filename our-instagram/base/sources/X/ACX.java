package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.quicklog.reliability.UserFlowLoggerImpl;
import com.instagram.common.session.UserSession;

/* loaded from: classes4.dex */
public final class ACX {
    public long A00;
    public final InterfaceC09390do A01;

    public ACX(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A01 = AbstractC09440dt.A01(new MHO(userSession, 44));
    }

    public final void A02(String str) {
        long j = 0;
        if (this.A00 == 0) {
            Long flowStartIfNotOngoingForMarker = ((UserFlowLoggerImpl) this.A01.getValue()).flowStartIfNotOngoingForMarker(658058235, str.hashCode(), PublicKeyCredentialControllerUtility.JSON_KEY_USER, false, 30000L);
            if (flowStartIfNotOngoingForMarker != null) {
                j = flowStartIfNotOngoingForMarker.longValue();
            }
            this.A00 = j;
        }
    }

    public final void A00() {
        if (this.A00 != 0) {
            ((UserFlowLoggerImpl) this.A01.getValue()).flowEndSuccess(this.A00);
            this.A00 = 0L;
        }
    }

    public final void A01(String str) {
        if (this.A00 != 0) {
            ((UserFlowLoggerImpl) this.A01.getValue()).flowMarkPoint(this.A00, str);
        }
    }
}
