package X;

import com.facebook.proxygen.LigerSamplePolicy;
import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class M4Q implements Runnable {
    public final /* synthetic */ C116155Nu A00;
    public final /* synthetic */ C48525LdN A01;

    public M4Q(C116155Nu c116155Nu, C48525LdN c48525LdN) {
        this.A00 = c116155Nu;
        this.A01 = c48525LdN;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C116155Nu c116155Nu = this.A00;
        String str = c116155Nu.A0g;
        if (str == null) {
            str = "";
        }
        android.net.Uri A0B = AbstractC25227BEk.A0B(str);
        String A00 = AbstractC43609JQq.A00(A0B);
        if (A00 == null) {
            C0w9.A03("StellaMessageNotificationHandler", "Null message id from notification");
            return;
        }
        C48525LdN c48525LdN = this.A01;
        c48525LdN.A05.put(A00, c116155Nu);
        UserSession userSession = c48525LdN.A04;
        AbstractC25651Mw.A00(userSession).A01(c48525LdN.A03, C2Io.class);
        HandlerC25861Nt handlerC25861Nt = c48525LdN.A00;
        if (handlerC25861Nt == null) {
            C14360o3.A0F("handler");
            throw C00O.createAndThrow();
        }
        handlerC25861Nt.A02(new M4P(c48525LdN, A00), 33735910, LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT);
        String A01 = AbstractC43609JQq.A01(A0B);
        if (A01 == null) {
            return;
        }
        C83403nh BSh = AbstractC28761aE.A00(userSession).BSh(AbstractC43593JPy.A0f(A01), A00);
        if (BSh == null) {
            return;
        }
        C48525LdN.A00(c48525LdN, A00);
        C48525LdN.A01(c116155Nu, BSh, c48525LdN);
    }
}
