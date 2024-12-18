package X;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import com.facebook.mobileconfig.common.FBMobileConfigGlobalContextHolder;
import com.facebook.quicklog.LightweightQuickPerformanceLogger;
import com.instagram.common.session.UserSession;
import com.instagram.direct.stella.StellaIpcDirectMessagingServiceClient;
import java.util.List;

/* renamed from: X.129, reason: invalid class name */
/* loaded from: classes.dex */
public final class AnonymousClass129 extends AbstractC211911v {
    public final Context A00;
    public final C211211o A01;
    public final InterfaceC09390do A02;

    public AnonymousClass129(Context context, C211211o c211211o, InterfaceC09390do interfaceC09390do) {
        C14360o3.A0B(context, 1);
        C14360o3.A0B(interfaceC09390do, 3);
        this.A00 = context;
        this.A01 = c211211o;
        this.A02 = interfaceC09390do;
    }

    @Override // X.AbstractC211911v
    public final void A04(C226418s c226418s) {
        C14360o3.A0B(c226418s, 0);
        long j = super.A01;
        long j2 = super.A00;
        c226418s.A0Q(c226418s.A02, "QE_INIT_START", j);
        c226418s.A0Q(c226418s.A02, "QE_INIT_END", j2);
    }

    @Override // X.AbstractC211911v
    public final String A06() {
        return "QEInitializer";
    }

    @Override // X.AbstractC211911v
    public final void A07() {
        LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger;
        final C229419w c229419w;
        FBMobileConfigGlobalContextHolder fBMobileConfigGlobalContextHolder = FBMobileConfigGlobalContextHolder.getInstance(C18Z.A02.A00());
        C14360o3.A07(fBMobileConfigGlobalContextHolder);
        if (C226218q.A01(AbstractC12960li.A00).A0L) {
            fBMobileConfigGlobalContextHolder.onFirstAppInstall();
        }
        Context context = this.A00;
        fBMobileConfigGlobalContextHolder.setCurrentVersion(AbstractC12880la.A04(context));
        fBMobileConfigGlobalContextHolder.onEnterSession("", 1);
        AbstractC12990ll A08 = ((AnonymousClass122) this.A01.A00()).A08();
        boolean z = A08 instanceof UserSession;
        if (z) {
            fBMobileConfigGlobalContextHolder.onEnterSession(((UserSession) A08).userId, 1);
        }
        AnonymousClass127 anonymousClass127 = (AnonymousClass127) this.A02.getValue();
        if (anonymousClass127 == null || (lightweightQuickPerformanceLogger = anonymousClass127.BjG()) == null) {
            lightweightQuickPerformanceLogger = C006802i.A0p;
        }
        C14360o3.A0A(lightweightQuickPerformanceLogger);
        C14360o3.A0B(context, 0);
        C14360o3.A0B(lightweightQuickPerformanceLogger, 1);
        final C19R c19r = new C19R(context, lightweightQuickPerformanceLogger);
        C18V.A01 = c19r;
        c19r.A01();
        C1AC A01 = c19r.A01();
        final C229419w c229419w2 = null;
        if (A01 != null) {
            c229419w = A01.A01.A00;
        } else {
            c229419w = null;
        }
        if (z) {
            final UserSession userSession = (UserSession) A08;
            c19r.A02(userSession);
            C14360o3.A0B(userSession, 0);
            if (!((C17210tG) userSession.A01(C17210tG.class, C02610Ak.A00)).A00) {
                C20150ym.A04(userSession);
            }
            C1AC A02 = c19r.A02(userSession);
            if (A02 != null) {
                c229419w2 = A02.A01.A00;
            }
            C23011Ag.A00(c229419w2, c229419w, C1AR.A01(userSession), C1AR.A00(), c19r.A01, userSession, C05F.A0C, AbstractC16960so.A1Q(new C22951Aa(AbstractC20100yh.A00(36329809801921056L)), new C22951Aa(AbstractC20100yh.A00(36892759755391955L))), AbstractC16960so.A1Q(new C22951Aa(AbstractC20070ye.A00(18315415587406369L)), new C22951Aa(AbstractC20070ye.A00(18878365540877268L))), 1536);
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: X.1Ap
                @Override // java.lang.Runnable
                public final void run() {
                    C229419w c229419w3 = C229419w.this;
                    UserSession userSession2 = userSession;
                    C1AS A012 = C1AR.A01(userSession2);
                    List A1Q = AbstractC16960so.A1Q(new C22951Aa(AbstractC20100yh.A00(36329818391855650L)), new C22951Aa(AbstractC20100yh.A00(36892768345326549L)));
                    C229419w c229419w4 = c229419w;
                    C1AS A00 = C1AR.A00();
                    List A1Q2 = AbstractC16960so.A1Q(new C22951Aa(AbstractC20070ye.A00(18315424177340963L)), new C22951Aa(AbstractC20070ye.A00(18878374130811862L)));
                    C23011Ag.A00(c229419w3, c229419w4, A012, A00, c19r.A01, userSession2, C05F.A01, A1Q, A1Q2, 1536);
                }
            }, StellaIpcDirectMessagingServiceClient.KEEP_CONNECTION_ALIVE_MS);
        } else {
            C1AS A00 = C1AR.A00();
            List A1Q = AbstractC16960so.A1Q(new C22951Aa(AbstractC20070ye.A00(18315415587406369L)), new C22951Aa(AbstractC20070ye.A00(18878365540877268L)));
            Integer num = C05F.A0N;
            LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger2 = c19r.A01;
            C14360o3.A0B(lightweightQuickPerformanceLogger2, 4);
            AbstractC23081An.A00(c229419w, A00, lightweightQuickPerformanceLogger2, C05F.A01, num, A1Q, 1, -1L, false);
            AbstractC23081An.A00(c229419w, A00, lightweightQuickPerformanceLogger2, C05F.A00, num, A1Q, 1, -1L, false);
        }
        C227619e c227619e = C227619e.A08;
        synchronized (c227619e.A04) {
            List<Pair> list = c227619e.A05;
            list.size();
            for (Pair pair : list) {
                C227619e.A00(c227619e, (String) pair.first, (String) pair.second);
            }
            list.clear();
        }
        c227619e.A06.set(true);
    }
}
