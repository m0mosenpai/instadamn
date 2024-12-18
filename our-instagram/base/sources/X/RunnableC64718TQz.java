package X;

import android.os.Bundle;
import java.util.HashMap;

/* renamed from: X.TQz, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class RunnableC64718TQz implements Runnable {
    public final /* synthetic */ android.net.Uri A00;
    public final /* synthetic */ Bundle A01;
    public final /* synthetic */ C63217SfN A02;
    public final /* synthetic */ InterfaceC172727mi A03;
    public final /* synthetic */ QF6 A04;

    public RunnableC64718TQz(android.net.Uri uri, Bundle bundle, C63217SfN c63217SfN, InterfaceC172727mi interfaceC172727mi, QF6 qf6) {
        this.A03 = interfaceC172727mi;
        this.A04 = qf6;
        this.A00 = uri;
        this.A02 = c63217SfN;
        this.A01 = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j;
        String str;
        String obj;
        InterfaceC172727mi interfaceC172727mi = this.A03;
        QF6 qf6 = this.A04;
        android.net.Uri uri = this.A00;
        C63217SfN c63217SfN = this.A02;
        interfaceC172727mi.ChS(uri, qf6, null, c63217SfN.A04.A00());
        Bundle bundle = this.A01;
        Object obj2 = bundle.get("ad_id");
        if (obj2 != null && (obj = obj2.toString()) != null) {
            j = Long.parseLong(obj);
        } else {
            j = 0;
        }
        Object obj3 = bundle.get("iab_session_id");
        String str2 = "";
        if (obj3 == null || (str = obj3.toString()) == null) {
            str = "";
        }
        HashMap A1G = AbstractC166987dD.A1G();
        A1G.put("pageLoadSource", "EXTERNAL_LINK_PAGE_LOAD");
        A1G.put("tokenSource", AbstractC61709RsQ.A00(c63217SfN.A03.A01));
        A1G.put("is_organic", String.valueOf(c63217SfN.A02));
        String A0t = AbstractC58321PtD.A0t(bundle, "media_id");
        if (A0t != null) {
            str2 = A0t;
        }
        A1G.put("media_id", str2);
        C63305ShB.A00().A04(j, "PAGE_LOADED", str, A1G);
    }
}
