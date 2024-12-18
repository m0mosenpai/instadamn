package X;

import android.os.SystemClock;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class OWQ {
    public final C006802i A00;
    public final C18920wW A01;
    public final String A02;

    public OWQ(UserSession userSession) {
        String str;
        C14360o3.A0B(userSession, 1);
        this.A00 = AbstractC43592JPx.A0N();
        C12210kP c12210kP = new C12210kP(userSession);
        c12210kP.A01 = "ig_fos_headers";
        this.A01 = c12210kP.A00();
        C19U A01 = C11830jh.A04.A01(userSession).A01(C19T.A1C);
        if (A01 != null) {
            str = A01.A01;
        } else {
            str = null;
        }
        this.A02 = str;
    }

    private final void A00(String str, String str2, String str3) {
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A01, "ig_fos_headers_client_logs");
        if (A0f.isSampled()) {
            AbstractC31171DnF.A1B(A0f, str);
            A0f.AAP("extra", str3);
            A0f.AAP("flow_id", str2);
            String str4 = this.A02;
            if (str4 == null) {
                str4 = "";
            }
            A0f.AAP(AbstractC50532MSl.A01(0, 9, 53), str4);
            A0f.A9K("client_timestamp", Long.valueOf(SystemClock.elapsedRealtime()));
            A0f.Cht();
        }
    }

    public final void A01(Exception exc, String str) {
        this.A00.markEventBuilder(1048055047, "UNEXPECTED_FAILURE").annotate("event", "UNEXPECTED_FAILURE").annotate("error_message", exc.getMessage()).annotate("error_type", AbstractC31173DnH.A0q(exc)).annotate("flow_id", str).annotate("extra", exc.getMessage()).annotate("stacktrace", C2Ql.A00(exc)).setLevel(3).report();
        A00("UNEXPECTED_FAILURE", str, C2Ql.A00(exc));
    }

    public final void A02(String str, Integer num, String str2) {
        C006802i c006802i = this.A00;
        String A00 = AbstractC54320Nze.A00(num);
        c006802i.markEventBuilder(1048055047, A00).annotate("event", A00).annotate("flow_id", str).annotate("extra", str2).setLevel(7).report();
        A00(A00, str, str2);
    }
}
