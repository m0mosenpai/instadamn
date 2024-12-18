package X;

import com.facebook.secure.securewebview.SecureWebView;
import com.instagram.common.session.UserSession;
import com.instagram.direct.stella.StellaIpcDirectMessagingServiceClient;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: X.Sed, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63178Sed {
    public ScheduledFuture A00;
    public final C0JO A01;
    public final UserSession A02;
    public final Map A03;
    public final ScheduledExecutorService A04;

    /* JADX WARN: Type inference failed for: r0v2, types: [X.0JO, java.lang.Object] */
    public C63178Sed(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A02 = userSession;
        this.A03 = AbstractC58318PtA.A14();
        this.A01 = new Object();
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = C14250np.A00().A00;
        C14360o3.A07(scheduledThreadPoolExecutor);
        this.A04 = scheduledThreadPoolExecutor;
        this.A00 = scheduledThreadPoolExecutor.scheduleAtFixedRate(new RunnableC64607TLt(this), 0L, StellaIpcDirectMessagingServiceClient.KEEP_CONNECTION_ALIVE_MS, TimeUnit.MILLISECONDS);
    }

    public static final synchronized void A01(C63178Sed c63178Sed, long j) {
        ScheduledFuture scheduledFuture;
        synchronized (c63178Sed) {
            Map map = c63178Sed.A03;
            Long valueOf = Long.valueOf(j);
            SJV sjv = (SJV) map.get(valueOf);
            if (sjv != null) {
                SecureWebView secureWebView = sjv.A03;
                if (secureWebView != null) {
                    AbstractC62806SSa.A00(secureWebView);
                }
                map.remove(valueOf);
                if (map.isEmpty() && (scheduledFuture = c63178Sed.A00) != null) {
                    scheduledFuture.cancel(true);
                }
            }
        }
    }

    public final synchronized void A02(long j, int i, String str) {
        SJV sjv = (SJV) this.A03.get(Long.valueOf(j));
        if (sjv != null) {
            sjv.A04 = C05F.A01;
            sjv.A00 = i;
            sjv.A05 = str;
            A00(this, j);
            A01(this, j);
        }
    }

    public static final void A00(C63178Sed c63178Sed, long j) {
        InterfaceC103384lE interfaceC103384lE;
        long j2;
        C6FQ c6fq;
        int i;
        C6FX c6fx;
        SJV sjv = (SJV) c63178Sed.A03.get(Long.valueOf(j));
        if (sjv != null) {
            int intValue = sjv.A04.intValue();
            if (intValue != 2) {
                if (intValue != 1) {
                    i = 0;
                    interfaceC103384lE = sjv.A09;
                    if (interfaceC103384lE != null) {
                        j2 = sjv.A01;
                        c6fq = sjv.A06;
                    } else {
                        return;
                    }
                } else {
                    interfaceC103384lE = sjv.A07;
                    if (interfaceC103384lE == null) {
                        return;
                    }
                    long j3 = sjv.A01;
                    int i2 = sjv.A00;
                    String str = sjv.A05;
                    c6fq = sjv.A06;
                    c6fx = AbstractC25225BEi.A0s();
                    c6fx.A01(Long.valueOf(j3));
                    c6fx.A03(Integer.valueOf(i2), 1);
                    c6fx.A03(str, 2);
                    AbstractC25227BEk.A1M(c6fq, c6fx, interfaceC103384lE);
                }
            } else {
                interfaceC103384lE = sjv.A08;
                if (interfaceC103384lE == null) {
                    return;
                }
                j2 = sjv.A01;
                c6fq = sjv.A06;
                i = 0;
            }
            c6fx = AbstractC25225BEi.A0s();
            c6fx.A03(Long.valueOf(j2), i);
            AbstractC25227BEk.A1M(c6fq, c6fx, interfaceC103384lE);
        }
    }
}
