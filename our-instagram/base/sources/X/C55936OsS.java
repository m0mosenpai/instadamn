package X;

import android.content.Context;
import com.facebook.browser.iabjs.ota.instagram.IgIABJSScriptFetcher$handleHttpResponseOnComplete$1;
import com.facebook.quicklog.QuickPerformanceLogger;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;

/* renamed from: X.OsS, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55936OsS implements InterfaceC26491Qe {
    public C3JQ A00;
    public final ByteArrayOutputStream A01 = new ByteArrayOutputStream();
    public final /* synthetic */ int A02;
    public final /* synthetic */ Context A03;
    public final /* synthetic */ O1I A04;
    public final /* synthetic */ C55026OXd A05;
    public final /* synthetic */ QuickPerformanceLogger A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ String A09;
    public final /* synthetic */ String A0A;
    public final /* synthetic */ InterfaceC24901Jp A0B;

    @Override // X.InterfaceC26491Qe
    public final void onNewData(ByteBuffer byteBuffer) {
        C14360o3.A0B(byteBuffer, 0);
        AbstractC50522MSa.A1X(this.A01, byteBuffer);
    }

    public C55936OsS(Context context, O1I o1i, C55026OXd c55026OXd, QuickPerformanceLogger quickPerformanceLogger, String str, String str2, String str3, String str4, InterfaceC24901Jp interfaceC24901Jp, int i) {
        this.A06 = quickPerformanceLogger;
        this.A02 = i;
        this.A0B = interfaceC24901Jp;
        this.A05 = c55026OXd;
        this.A03 = context;
        this.A07 = str;
        this.A09 = str2;
        this.A08 = str3;
        this.A0A = str4;
        this.A04 = o1i;
    }

    @Override // X.InterfaceC26491Qe
    public final void onComplete() {
        Integer num;
        this.A0B.EKh(null, null);
        C55026OXd c55026OXd = this.A05;
        Context context = this.A03;
        String str = this.A07;
        String str2 = this.A09;
        String str3 = this.A08;
        String str4 = this.A0A;
        QuickPerformanceLogger quickPerformanceLogger = this.A06;
        int i = this.A02;
        C3JQ c3jq = this.A00;
        ByteArrayOutputStream byteArrayOutputStream = this.A01;
        O1I o1i = this.A04;
        Integer num2 = null;
        if (c3jq != null) {
            int i2 = c3jq.A01;
            if (Integer.valueOf(i2) != null && i2 >= 200 && i2 < 300 && byteArrayOutputStream.size() != 0) {
                quickPerformanceLogger.markerPoint(646459455, i, "http_response_success");
                quickPerformanceLogger.markerEnd(646459455, i, (short) 2);
                AbstractC166987dD.A1Z(new IgIABJSScriptFetcher$handleHttpResponseOnComplete$1(context, o1i, c55026OXd, quickPerformanceLogger, byteArrayOutputStream, str, str2, str3, str4, null, i), AbstractC24771Iv.A02(1027178141, 3));
                return;
            }
        }
        if (byteArrayOutputStream.size() == 0) {
            C55026OXd.A00(quickPerformanceLogger, "http_response_error", "empty_http_response", i, 646459455);
            C55026OXd.A01(null, "empty_http_response", str2, str3, str4, 646454053);
        } else {
            if (c3jq != null) {
                num = Integer.valueOf(c3jq.A01);
            } else {
                num = null;
            }
            C55026OXd.A00(quickPerformanceLogger, "http_response_error", String.valueOf(num), i, 646459455);
            StringBuilder A1C = AbstractC166987dD.A1C();
            A1C.append("http_response_error ");
            if (c3jq != null) {
                num2 = Integer.valueOf(c3jq.A01);
            }
            C55026OXd.A01(null, AbstractC166997dE.A0v(num2, A1C), str2, str3, str4, 646454053);
        }
        C55010OVt.A00(o1i.A00);
    }

    @Override // X.InterfaceC26491Qe
    public final void onFailed(IOException iOException) {
        String message;
        String str = null;
        this.A0B.EKh(null, null);
        QuickPerformanceLogger quickPerformanceLogger = this.A06;
        int i = this.A02;
        if (iOException != null) {
            str = iOException.getMessage();
        }
        String str2 = "";
        if (str == null) {
            str = "";
        }
        C55026OXd.A00(quickPerformanceLogger, "execute_http_request_error", str, i, 646459455);
        if (iOException != null && (message = iOException.getMessage()) != null) {
            str2 = message;
        }
        C55026OXd.A01(iOException, AnonymousClass001.A0R("execute_http_request_error ", str2), this.A09, this.A08, this.A0A, 646454053);
        C55010OVt.A00(this.A04.A00);
    }

    @Override // X.InterfaceC26491Qe
    public final void onResponseStarted(C3JQ c3jq) {
        this.A06.markerPoint(646459455, this.A02, "on_http_fetch_result");
        this.A00 = c3jq;
    }
}
