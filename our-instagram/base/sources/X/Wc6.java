package X;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes11.dex */
public abstract class Wc6 implements InterfaceC92354Bq, InterfaceC92374Bs {
    public int A00;
    public int A01;
    public InterfaceC92344Bp A02;
    public byte[] A03;

    public static void A01(C2BD c2bd, String str, Map map) {
        List list = (List) map.get(str);
        if (list != null && !list.isEmpty()) {
            c2bd.DvD(str, list.get(0));
        }
    }

    @Override // X.InterfaceC92374Bs
    public final void changeHttpPriority(byte b, boolean z) {
    }

    public final void A02(C2BB c2bb, boolean z) {
        Map responseHeaders;
        InterfaceC92344Bp interfaceC92344Bp = this.A02;
        if (interfaceC92344Bp != null && c2bb != null && (responseHeaders = interfaceC92344Bp.getResponseHeaders()) != null) {
            List list = (List) responseHeaders.get("x-fb-origin-hit");
            if (list != null && !list.isEmpty()) {
                c2bb.DvD("x-fb-origin-hit", list.get(0));
            }
            A01(c2bb, "x-fb-edge-hit", responseHeaders);
            List A01 = C4J9.A01("X-FB-Connection-Quality", responseHeaders, z);
            if (A01 != null && !A01.isEmpty()) {
                c2bb.DvD("X-FB-Connection-Quality", A01.get(0));
            }
            A01(c2bb, "x-fb-response-time-ms", responseHeaders);
            A01(c2bb, "x-bwe-mean", responseHeaders);
            A01(c2bb, "x-bwe-std-dev", responseHeaders);
            A01(c2bb, AbstractC111324zv.A00(3318), responseHeaders);
            A01(c2bb, "x-fb-dynamic-predictive-response-chunk-size", responseHeaders);
            Iterator A15 = AbstractC166997dE.A15(responseHeaders);
            while (A15.hasNext()) {
                Map.Entry entry = (Map.Entry) A15.next();
                if (entry.getKey() != null && entry.getValue() != null && !((List) entry.getValue()).isEmpty() && (((String) entry.getKey()).startsWith("x-fb-dynamic-") || ((String) entry.getKey()).startsWith("x-fb-ull-"))) {
                    c2bb.DvD((String) entry.getKey(), ((List) entry.getValue()).get(0));
                }
            }
            A01(c2bb, "x-fb-dynamic-client-wallclock-offset-ms", responseHeaders);
        }
    }

    public boolean A03() {
        int i = this.A01;
        if (i >= 0 && i == this.A00) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC92354Bq
    public final android.net.Uri getUri() {
        InterfaceC92344Bp interfaceC92344Bp = this.A02;
        if (interfaceC92344Bp == null) {
            return null;
        }
        return interfaceC92344Bp.getUri();
    }

    @Override // X.InterfaceC92354Bq
    public final /* synthetic */ Map getResponseHeaders() {
        return Collections.emptyMap();
    }
}
