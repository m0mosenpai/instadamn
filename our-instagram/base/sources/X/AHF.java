package X;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes4.dex */
public final class AHF {
    public int A00;
    public long A01;
    public final C1QT A03;
    public final Map A04 = AbstractC166987dD.A1I();
    public String A02 = "default_trigger";

    public final long A01() {
        C1QT c1qt = this.A03;
        this.A01 = c1qt.flowStartForMarker(this.A00, this.A02, false);
        Iterator A15 = AbstractC166997dE.A15(this.A04);
        while (A15.hasNext()) {
            Map.Entry A1K = AbstractC166987dD.A1K(A15);
            c1qt.flowAnnotate(this.A01, (String) A1K.getKey(), (String) A1K.getValue());
        }
        return this.A01;
    }

    public final void A02() {
        Iterator A15 = AbstractC166997dE.A15(this.A04);
        while (A15.hasNext()) {
            A00(this, A15);
        }
        this.A03.flowEndSuccess(this.A01);
    }

    public final void A03(String str) {
        Iterator A15 = AbstractC166997dE.A15(this.A04);
        while (A15.hasNext()) {
            A00(this, A15);
        }
        this.A03.flowEndCancel(this.A01, str);
    }

    public final void A04(String str) {
        Iterator A15 = AbstractC166997dE.A15(this.A04);
        while (A15.hasNext()) {
            A00(this, A15);
        }
        this.A03.flowMarkPoint(this.A01, str);
    }

    public final void A05(String str, int i) {
        this.A04.put(str, String.valueOf(i));
    }

    public final void A06(String str, String str2) {
        Iterator A15 = AbstractC166997dE.A15(this.A04);
        while (A15.hasNext()) {
            A00(this, A15);
        }
        this.A03.flowEndFail(this.A01, str, str2);
    }

    public AHF(C1QT c1qt) {
        this.A03 = c1qt;
    }

    public static void A00(AHF ahf, Iterator it) {
        Map.Entry entry = (Map.Entry) it.next();
        ahf.A03.flowAnnotate(ahf.A01, (String) entry.getKey(), (String) entry.getValue());
    }
}
