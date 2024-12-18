package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.quicklog.reliability.UserFlowLoggerImpl;
import com.instagram.common.session.UserSession;

/* loaded from: classes5.dex */
public final class CVK {
    public Long A00;
    public final InterfaceC09390do A01;

    public CVK(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A01 = AbstractC09440dt.A01(new D87(userSession, 16));
    }

    public final void A02(String str) {
        C14360o3.A0B(str, 0);
        Long l = this.A00;
        if (l != null) {
            ((UserFlowLoggerImpl) this.A01.getValue()).flowEndCancel(l.longValue(), "load_restarted_on_another_tab");
        }
        this.A00 = null;
        InterfaceC09390do interfaceC09390do = this.A01;
        long flowStartForMarker = ((UserFlowLoggerImpl) interfaceC09390do.getValue()).flowStartForMarker(203562165, PublicKeyCredentialControllerUtility.JSON_KEY_USER, false);
        Long valueOf = Long.valueOf(flowStartForMarker);
        this.A00 = valueOf;
        if (valueOf != null) {
            ((UserFlowLoggerImpl) interfaceC09390do.getValue()).flowAnnotate(flowStartForMarker, "tab", str);
        }
    }

    public final void A00() {
        Long l = this.A00;
        if (l != null) {
            ((UserFlowLoggerImpl) this.A01.getValue()).flowEndSuccess(l.longValue());
        }
        this.A00 = null;
    }

    public final void A01(String str) {
        String A00 = AbstractC43591JPw.A00(371);
        C14360o3.A0B(str, 1);
        Long l = this.A00;
        if (l != null) {
            ((UserFlowLoggerImpl) this.A01.getValue()).flowEndFail(l.longValue(), A00, str);
        }
        this.A00 = null;
    }
}
