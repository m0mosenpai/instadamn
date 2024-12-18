package X;

import android.content.Context;
import android.net.TrafficStats;
import com.facebook.rsys.appstate.gen.AppstateApi;
import com.facebook.rsys.audiomodule.gen.AudioModule;
import com.facebook.rsys.callmanager.callclient.gen.CallEndedApi;
import com.facebook.rsys.callmanager.gen.CallApi;
import com.facebook.rsys.calltag.gen.CallTagApi;
import com.facebook.rsys.devxcallagent.gen.DevXAgentCallConfig;
import com.facebook.rsys.externalcall.gen.ExternalCallProxy;
import com.facebook.rsys.hdvideo.gen.HdVideoApi;
import com.facebook.rsys.trafficshaping.gen.TrafficShapingProxy;
import com.facebook.rtc.platform.client.sharedcontextholder.EglContextHolder;
import com.instagram.common.session.UserSession;
import com.instagram.model.rtc.RtcCallKey;
import com.instagram.rtc.rsys.proxies.IGRTCSyncedClockHolder;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.webrtc.EglBase;

/* renamed from: X.OUf, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C54996OUf {
    public static final EglBase.Context A0m;
    public AppstateApi A00;
    public CallEndedApi A01;
    public CallApi A02;
    public CallTagApi A03;
    public HdVideoApi A04;
    public RtcCallKey A05;
    public boolean A06;
    public final Context A07;
    public final C52020MzZ A08;
    public final C51996Myi A09;
    public final AudioModule A0A;
    public final DevXAgentCallConfig A0B;
    public final ExternalCallProxy A0C;
    public final UtF A0D;
    public final UserSession A0E;
    public final OId A0F;
    public final OHJ A0G;
    public final C52009Mz9 A0H;
    public final C52021Mzb A0I;
    public final C51998Myn A0J;
    public final C45344K4y A0K;
    public final C52018MzU A0L;
    public final C52019MzX A0M;
    public final C52022Mzd A0N;
    public final XX0 A0O;
    public final C52023Mzj A0P;
    public final C52024Mzm A0Q;
    public final C52025Mzo A0R;
    public final N04 A0S;
    public final N07 A0T;
    public final C26672Bq7 A0U;
    public final C214069e5 A0V;
    public final C54453O4h A0W;
    public final AbstractC52007Mz4 A0X;
    public final C52008Mz7 A0Y;
    public final C52010MzA A0Z;
    public final O5J A0a;
    public final IGRTCSyncedClockHolder A0b;
    public final C55074OaU A0c;
    public final N00 A0d;
    public final Integer A0e;
    public final String A0f;
    public final ExecutorService A0g;
    public final InterfaceC09390do A0h = C57548PgM.A00(this, 23);
    public final InterfaceC16660sJ A0i;
    public final InterfaceC16620sF A0j;
    public final boolean A0k;
    public final boolean A0l;

    static {
        EglBase.Context eglBaseContext = EglBase.CC.create().getEglBaseContext();
        C14360o3.A07(eglBaseContext);
        A0m = eglBaseContext;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, X.UtF] */
    /* JADX WARN: Type inference failed for: r0v23, types: [X.Ps5, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v25, types: [X.Mz9, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v26, types: [X.Mzb, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object, X.MzX] */
    /* JADX WARN: Type inference failed for: r0v28, types: [X.K4y, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v29, types: [java.lang.Object, X.Mzd] */
    /* JADX WARN: Type inference failed for: r0v33, types: [X.Mzm, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v37, types: [X.Mzo, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v38, types: [java.lang.Object, X.Bq7] */
    /* JADX WARN: Type inference failed for: r0v39, types: [X.9e5] */
    /* JADX WARN: Type inference failed for: r1v4, types: [X.A99, java.lang.Object] */
    public C54996OUf(Context context, C52020MzZ c52020MzZ, AudioModule audioModule, DevXAgentCallConfig devXAgentCallConfig, C23324AVj c23324AVj, final UserSession userSession, OId oId, C54156Nws c54156Nws, C54453O4h c54453O4h, AbstractC52007Mz4 abstractC52007Mz4, O5J o5j, IGRTCSyncedClockHolder iGRTCSyncedClockHolder, Integer num, String str, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16660sJ interfaceC16660sJ2, InterfaceC16620sF interfaceC16620sF, boolean z, boolean z2) {
        N07 n07;
        this.A0f = str;
        this.A07 = context;
        this.A0E = userSession;
        this.A0X = abstractC52007Mz4;
        this.A0b = iGRTCSyncedClockHolder;
        this.A0a = o5j;
        this.A0W = c54453O4h;
        this.A0j = interfaceC16620sF;
        this.A0i = interfaceC16660sJ2;
        this.A0e = num;
        this.A0F = oId;
        this.A0A = audioModule;
        this.A0l = z;
        this.A0k = z2;
        this.A08 = c52020MzZ;
        this.A0B = devXAgentCallConfig;
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        C14360o3.A07(newSingleThreadExecutor);
        this.A0g = newSingleThreadExecutor;
        this.A0D = new Object();
        this.A0Z = new C52010MzA(context, new C57753Pjg(this, 8));
        C06090Tz c06090Tz = C06090Tz.A05;
        if (C18U.A06(c06090Tz, userSession, 36313093789189866L)) {
            n07 = new Object();
        } else {
            n07 = null;
        }
        this.A0T = n07;
        this.A0C = C18U.A06(c06090Tz, userSession, 36315709424274937L) ? new C52012MzG(context) : new C52013MzH(context, new Object());
        this.A0L = new C52018MzU(c54453O4h);
        this.A0H = new Object();
        this.A0I = new Object();
        this.A0M = new Object();
        this.A0K = new Object();
        this.A0N = new Object();
        this.A0S = new N04(c23324AVj, userSession, c54453O4h);
        this.A0O = new XX0(context, userSession);
        this.A0P = new C52023Mzj();
        this.A0Q = new Object();
        this.A0Y = new C52008Mz7(userSession);
        this.A0J = new C51998Myn(c54453O4h);
        EglBase.Context context2 = A0m;
        this.A0c = new C55074OaU(context, this.A0A, userSession, c54453O4h, context2);
        this.A0R = new Object();
        this.A0U = new Object();
        final ?? obj = new Object();
        this.A0V = new TrafficShapingProxy(userSession, obj) { // from class: X.9e5
            public final UserSession A00;
            public final A99 A01;
            public final boolean A02;
            public final boolean A03;
            public final boolean A04;

            @Override // com.facebook.rsys.trafficshaping.gen.TrafficShapingProxy
            public final void startQueueingTraffic() {
                C1G0 c1g0;
                C1Rj.A00.set(true);
                if (this.A02) {
                    C006802i.A0p.markerStart(16263308);
                    A99 a99 = this.A01;
                    if (!a99.A03) {
                        a99.A03 = true;
                        a99.A02 = TrafficStats.getTotalTxBytes();
                        a99.A01 = TrafficStats.getTotalRxBytes();
                        a99.A00 = System.currentTimeMillis();
                    }
                }
                if (this.A03) {
                    synchronized (C1G1.A01) {
                        c1g0 = C1G1.A00;
                    }
                    if (c1g0 != null) {
                        c1g0.pause();
                    }
                }
            }

            @Override // com.facebook.rsys.trafficshaping.gen.TrafficShapingProxy
            public final void stopQueueingTraffic() {
                C1G0 c1g0;
                long totalTxBytes;
                C9ZS c9zs;
                C1Rj.A00.set(false);
                if (this.A02) {
                    A99 a99 = this.A01;
                    if (!a99.A03) {
                        c9zs = new C9ZS(0L, 0L, 0L, 1);
                    } else {
                        long j = -1;
                        if (a99.A02 == -1) {
                            totalTxBytes = -1;
                        } else {
                            totalTxBytes = TrafficStats.getTotalTxBytes() - a99.A02;
                        }
                        a99.A02 = totalTxBytes;
                        if (a99.A01 != -1) {
                            j = TrafficStats.getTotalRxBytes() - a99.A01;
                        }
                        a99.A01 = j;
                        long currentTimeMillis = System.currentTimeMillis() - a99.A00;
                        a99.A03 = false;
                        c9zs = new C9ZS(a99.A02, j, currentTimeMillis, 1);
                    }
                    C006802i c006802i = C006802i.A0p;
                    c006802i.markerAnnotate(16263308, "duration_ms", c9zs.A03);
                    c006802i.markerAnnotate(16263308, "bytes_received", c9zs.A01);
                    c006802i.markerAnnotate(16263308, "bytes_sent", c9zs.A02);
                    c006802i.markerEnd(16263308, (short) 2);
                }
                if (this.A03 && !this.A04) {
                    synchronized (C1G1.A01) {
                        c1g0 = C1G1.A00;
                    }
                    if (c1g0 != null) {
                        c1g0.EKd();
                    }
                }
            }

            {
                this.A00 = userSession;
                this.A01 = obj;
                C06090Tz c06090Tz2 = C06090Tz.A05;
                this.A02 = C18U.A06(c06090Tz2, userSession, 36323998711164677L);
                this.A03 = C18U.A06(c06090Tz2, userSession, 36323998711230214L);
                this.A04 = C18U.A06(c06090Tz2, userSession, 36323998711295751L);
            }
        };
        this.A0d = new N00(context, userSession);
        C51996Myi A00 = AbstractC57096PUj.A00(context, new C55737Op6(this), userSession, c54156Nws, str, new C14140ne(268542022, 3, false, false), null, C57548PgM.A01(interfaceC16660sJ, 22), false);
        this.A09 = A00;
        OHJ ohj = new OHJ(this);
        this.A0G = ohj;
        EglContextHolder.eglBaseContext = context2;
        if (C18U.A06(c06090Tz, userSession, 36313596300363947L)) {
            A00.A09.A00.A03.add(ohj);
        }
    }
}
