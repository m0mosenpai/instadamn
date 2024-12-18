package X;

import android.content.Context;
import androidx.sharetarget.ShortcutInfoCompatSaverImpl;
import com.facebook.smartcapture.logging.SmartCaptureLogger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface;

/* renamed from: X.PwS, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class CallableC58499PwS implements Callable {
    public final int A00;
    public final Object A01;

    public CallableC58499PwS(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, X.SAF] */
    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        C1QW A00;
        C1QX c1qx;
        C1Ef c1Ef;
        C26371Ps A0e;
        InterfaceC26421Px A002;
        switch (this.A00) {
            case 0:
                ArrayList A1E = AbstractC166987dD.A1E();
                Iterator A16 = AbstractC166997dE.A16(((ShortcutInfoCompatSaverImpl) this.A01).A04);
                while (A16.hasNext()) {
                    A1E.add(new C72081XMz(((C58495PwN) A16.next()).A00).A00());
                }
                return A1E;
            case 1:
                JsReplyProxyBoundaryInterface jsReplyProxyBoundaryInterface = (JsReplyProxyBoundaryInterface) this.A01;
                ?? obj = new Object();
                obj.A00 = jsReplyProxyBoundaryInterface;
                return obj;
            case 2:
                C51032Vz c51032Vz = (C51032Vz) this.A01;
                C14360o3.A0B(c51032Vz, 0);
                return Integer.valueOf(AbstractC52762bI.A00(c51032Vz.A00, "next_alarm_manager_id"));
            case 3:
                A00 = ((C26371Ps) this.A01).A00();
                c1qx = new C1QX();
                c1qx.A04 = EnumC23341Bw.Undefined;
                c1Ef = C1Ef.OnScreen;
                c1qx.A03 = c1Ef;
                return AbstractC58319PtB.A0d(A00, c1qx);
            case 4:
                SZG szg = (SZG) this.A01;
                Context context = (Context) szg.A06.get();
                if (context == null) {
                    return null;
                }
                try {
                    SmartCaptureLogger smartCaptureLogger = szg.A04;
                    smartCaptureLogger.qplMarkerStart(33888866);
                    smartCaptureLogger.qplMarkerAnnotate(33888866, "event", "download");
                    smartCaptureLogger.qplMarkerAnnotate(33888866, "tracker", "aml");
                    Map BUU = szg.A02.BUU(context);
                    smartCaptureLogger.qplMarkerEnd(33888866, true);
                    smartCaptureLogger.qplMarkerStart(33888866);
                    smartCaptureLogger.qplMarkerAnnotate(33888866, "event", "init");
                    smartCaptureLogger.qplMarkerAnnotate(33888866, "tracker", "aml");
                    SWH swh = new SWH(BUU);
                    smartCaptureLogger.qplMarkerEnd(33888866, true);
                    synchronized (szg) {
                        szg.A08 = BUU;
                        szg.A07 = swh;
                        szg.A01.post(new TO8(szg, C05F.A0N));
                    }
                    return null;
                } catch (Exception e) {
                    szg.A04.qplMarkerEnd(33888866, false);
                    szg.A01(e);
                    return null;
                }
            case 5:
                return C62969SZm.A00((C62969SZm) this.A01);
            case 6:
            case 8:
            default:
                A002 = ((C1Ee) this.A01).A00(true);
                A002.getClass();
                A0e = AbstractC58319PtB.A0e();
                A0e.A02("https://secure.facebook.com/payments/generate_token");
                A0e.A01(C05F.A01);
                A0e.A00 = A002;
                A00 = A0e.A00();
                c1qx = MSY.A0J();
                c1qx.A03 = C1Ef.OffScreen;
                c1qx.A0A = "FetchPaymentToken";
                return AbstractC58319PtB.A0d(A00, c1qx);
            case 7:
                A0e = AbstractC58319PtB.A0e();
                A0e.A02("https://secure.facebook.com/payments/generate_token");
                A0e.A01(C05F.A01);
                A002 = ((C1Ee) this.A01).A00(true);
                A0e.A00 = A002;
                A00 = A0e.A00();
                c1qx = MSY.A0J();
                c1qx.A03 = C1Ef.OffScreen;
                c1qx.A0A = "FetchPaymentToken";
                return AbstractC58319PtB.A0d(A00, c1qx);
            case 9:
                C26371Ps A0e2 = AbstractC58319PtB.A0e();
                RcW rcW = (RcW) this.A01;
                A0e2.A02(rcW.A00.toString());
                A0e2.A01(C05F.A0N);
                A00 = A0e2.A00();
                c1qx = new C1QX();
                c1qx.A04 = rcW.A02;
                c1Ef = rcW.A01;
                c1qx.A03 = c1Ef;
                return AbstractC58319PtB.A0d(A00, c1qx);
        }
    }
}
