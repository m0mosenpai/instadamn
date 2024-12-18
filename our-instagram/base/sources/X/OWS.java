package X;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes9.dex */
public final class OWS {
    public Throwable A00;
    public final C0f5 A01;
    public final String A02;
    public final Map A03;

    public OWS(C0f6 c0f6, String str, int i) {
        C14360o3.A0B(c0f6, 1);
        this.A02 = str;
        this.A03 = AbstractC166987dD.A1I();
        this.A01 = c0f6.AEp(str, i);
    }

    public final void A02(String str, String str2) {
        C14360o3.A0B(str2, 1);
        this.A01.ABW(str, str2);
        this.A03.put(str, str2);
    }

    public final void A01() {
        this.A01.report();
        C0K8.A0C("RtcUnexpectedEvent", this.A02);
        Throwable th = this.A00;
        if (th != null) {
            C0K8.A0C("RtcUnexpectedEvent", String.valueOf(C2Ql.A00(th)));
        }
        Iterator A15 = AbstractC166997dE.A15(this.A03);
        while (A15.hasNext()) {
            Map.Entry A1K = AbstractC166987dD.A1K(A15);
            C0K8.A0C("RtcUnexpectedEvent", AnonymousClass001.A0u("\t ", AbstractC31172DnG.A17(A1K), " = ", (String) A1K.getValue()));
        }
    }

    public static void A00(C0f5 c0f5, String str, Throwable th, Map map) {
        c0f5.report();
        C0K8.A0C("RtcUnexpectedEvent", str);
        C0K8.A0C("RtcUnexpectedEvent", String.valueOf(C2Ql.A00(th)));
        Iterator A15 = AbstractC166997dE.A15(map);
        while (A15.hasNext()) {
            Map.Entry A1K = AbstractC166987dD.A1K(A15);
            C0K8.A0C("RtcUnexpectedEvent", AnonymousClass001.A0u("\t ", AbstractC31172DnG.A17(A1K), " = ", (String) A1K.getValue()));
        }
    }
}
