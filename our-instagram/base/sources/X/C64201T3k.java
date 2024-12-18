package X;

import android.os.SystemClock;
import com.facebookpay.logging.FBPayLoggerData;
import java.util.HashMap;

/* renamed from: X.T3k, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64201T3k implements InterfaceC65392TjP {
    public final /* synthetic */ FBPayLoggerData A00;
    public final /* synthetic */ C62953SYv A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ boolean A03;

    public C64201T3k(FBPayLoggerData fBPayLoggerData, C62953SYv c62953SYv, String str, boolean z) {
        this.A01 = c62953SYv;
        this.A03 = z;
        this.A02 = str;
        this.A00 = fBPayLoggerData;
    }

    @Override // X.InterfaceC65392TjP
    public final /* bridge */ /* synthetic */ void Dx0(Object obj) {
        String str;
        C62953SYv c62953SYv = this.A01;
        Throwable th = ((C62678SLr) obj).A02;
        boolean A1Z = AbstractC25229BEm.A1Z(th);
        boolean z = this.A03;
        String str2 = this.A02;
        FBPayLoggerData fBPayLoggerData = this.A00;
        long elapsedRealtime = SystemClock.elapsedRealtime() - c62953SYv.A00;
        if (A1Z) {
            if (z) {
                str = "fetch_auth_flows_cached_content_success";
            } else {
                str = "fetch_auth_flows_content_success";
            }
        } else if (z) {
            str = "fetch_auth_flows_cached_content_fail";
        } else {
            str = "fetch_auth_flows_content_fail";
        }
        HashMap A1G = AbstractC166987dD.A1G();
        A1G.put("logger_data", fBPayLoggerData);
        if (th != null) {
            A1G.put("throwable", th);
        }
        if (elapsedRealtime != 0) {
            A1G.put("data_fetch_duration", Long.valueOf(elapsedRealtime));
        }
        A1G.put("product", str2);
        c62953SYv.A02.Chz(str, A1G);
    }
}
