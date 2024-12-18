package X;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.location.Criteria;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.preference.PreferenceManager;
import android.telephony.CellInfo;
import android.telephony.CellLocation;
import android.telephony.ServiceState;
import android.telephony.TelephonyManager;
import android.util.LruCache;
import com.facebook.avatar.expresso.odr.assetdownloader.ig.IgODRAssetDownloader;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.common.dextricks.DalvikInternals;
import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import com.facebook.common.jniexecutors.AndroidAsyncExecutorFactory;
import com.facebook.odin.model.Example;
import com.facebook.odin.model.ExampleContext;
import com.facebook.odin.model.FeatureData;
import com.facebook.odin.model.Type;
import com.facebook.onecamera.components.logging.functionalcorrectness.cppimpl.QPLUserFlowImpl;
import com.facebook.onecamera.components.logging.xlogger.cppimpl.OneCameraXLoggerCpp;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.ppml.enigma.EnigmaSQLite;
import com.facebook.proxygen.LigerSamplePolicy;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.quicklog.LightweightQuickPerformanceLogger;
import com.facebook.quicklog.MarkerEditor;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.facebook.quicklog.QuickPerformanceLoggerProvider;
import com.facebook.react.modules.intent.IntentModule;
import com.facebook.reliability.ulimit.Ulimit;
import com.facebook.rsys.log.gen.CallSummaryInfo;
import com.facebook.rtc.logging.connectfunnel.logger.gen.ConnectFunnel;
import com.facebook.systrace.Systrace;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.google.common.collect.ImmutableList;
import com.google.gson.Gson;
import com.instagram.api.schemas.ClipsPrefetchTriggerType;
import com.instagram.common.gallery.Medium;
import com.instagram.common.resources.downloadable.impl.VoltronLanguagePackDownloader;
import com.instagram.common.session.UserSession;
import com.instagram.direct.capabilities.Capabilities;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import com.instagram.security.attestation.keystore.worker.KeyAttestationWorker;
import com.instagram.security.attestation.playintegrity.worker.PlayIntegrityAttestationWorker;
import com.instagram.service.tigon.IGTigonService;
import com.instagram.service.tigon.mobileprober.IGMobileProberJob;
import com.instagram.share.facebook.cxpnotice.noticestate.internal.CXPNoticeStateApi;
import com.instagram.share.facebook.cxpnotice.noticestate.internal.CXPNoticeStateRepository;
import com.instagram.traffic.nts.tigonprovider.IGTrafficNTSTigonProvider;
import com.instagram.transientanalysis.InstagramTransientNetworkDataCollector;
import com.instagram.url.InstagramHelpDeeplinkAliasActivity;
import com.instagram.url.InstagramShortenDeeplinkAliasActivity;
import com.instagram.zero.dogfooding.IgZeroDogfoodingInit;
import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReadWriteLock;
import org.webrtc.CameraVideoCapturer;

/* renamed from: X.2NX, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2NX implements InterfaceC13000lm, CallerContextable {
    public static final CallerContext A08 = new CallerContext(C2NX.class);
    public static final String __redex_internal_original_name = "StartupManager";
    public final Context A01;
    public final C49172Nq A02;
    public final UserSession A04;
    public final C49132Nk A05;
    public final WeakReference A06;
    public final InterfaceC12870lZ A03 = new InterfaceC12870lZ() { // from class: X.2Nm
        @Override // X.InterfaceC12870lZ
        public final void onAppBackgrounded() {
            C0f9.A0A(-76205127, C0f9.A03(-1419908713));
        }

        @Override // X.InterfaceC12870lZ
        public final void onAppForegrounded() {
            int A03 = C0f9.A03(-1480109489);
            AbstractC24641Ih.A02.Ep8(new C65803TuL());
            C0f9.A0A(1974007318, A03);
        }
    };
    public final C19L A07 = AnonymousClass194.A02(C12L.A00.AOT(1740784364, 2));
    public AtomicBoolean A00 = new AtomicBoolean(false);

    private final int A00() {
        String A04 = C18U.A04(C06090Tz.A05, this.A04, 36881730279375247L);
        if ("anytime".equalsIgnoreCase(A04)) {
            return 5;
        }
        if (!"low".equalsIgnoreCase(A04)) {
            return 3;
        }
        return 4;
    }

    public static final void A01(C2NX c2nx) {
        UserSession userSession = c2nx.A04;
        C14360o3.A0B(userSession, 0);
        boolean A06 = C18U.A06(C06090Tz.A05, userSession, 36324767511294408L);
        C50154MDh c50154MDh = new C50154MDh(userSession, 0);
        if (A06) {
            userSession.A01(C65911TwI.class, c50154MDh);
        } else {
            ((C65911TwI) userSession.A01(C65911TwI.class, c50154MDh)).A02(false, X4O.A00);
        }
    }

    public static final void A02(final C2NX c2nx, boolean z) {
        int i;
        AbstractC18280vF abstractC18280vF;
        AbstractC18280vF abstractC18280vF2;
        UserSession userSession = c2nx.A04;
        if (!userSession.hasEnded() && !c2nx.A00.getAndSet(true)) {
            if (Systrace.A0E(1L)) {
                C0fO.A01("StartupManager.runJobs", 166658086);
            }
            if (z) {
                try {
                    if (Systrace.A0E(1L)) {
                        C0fO.A01("scheduleNetworkJobs", -1943015948);
                    }
                    try {
                        InterfaceC24811Iz interfaceC24811Iz = AbstractC24641Ih.A02;
                        C14360o3.A07(interfaceC24811Iz);
                        interfaceC24811Iz.Ep8(new AbstractC18280vF() { // from class: X.3mf
                            {
                                super("prefetchNewsfeed", 353, 5, false, false);
                            }

                            @Override // X.AbstractC18280vF
                            public final void loggedRun() {
                                C2NX c2nx2 = C2NX.this;
                                CallerContext callerContext = C2NX.A08;
                                UserSession userSession2 = c2nx2.A04;
                                if (!C18U.A06(C06090Tz.A05, userSession2, 36328057458539630L)) {
                                    C4DU.A00(userSession2, new C4DT(userSession2)).A03(false);
                                }
                            }
                        });
                        C06090Tz c06090Tz = C06090Tz.A05;
                        if (!C18U.A06(c06090Tz, userSession, 36328057458277482L) && !C18U.A06(c06090Tz, userSession, 36329092542382089L)) {
                            boolean A06 = C18U.A06(c06090Tz, userSession, 36324673025552763L);
                            boolean z2 = C23051Ak.A05;
                            boolean A00 = C23061Al.A00(userSession).A00(EnumC23071Am.A0d);
                            if (!A06 || !A00) {
                                interfaceC24811Iz.Ep8(new AbstractC18280vF() { // from class: X.3mg
                                    {
                                        super("prefetchSelfProfile", 1791138859, 5, false, false);
                                    }

                                    @Override // X.AbstractC18280vF
                                    public final void loggedRun() {
                                        C2NX c2nx2 = C2NX.this;
                                        CallerContext callerContext = C2NX.A08;
                                        UserSession userSession2 = c2nx2.A04;
                                        AbstractC2044993i.A00(userSession2).A09(c2nx2.A01, userSession2.userId, false, true);
                                    }
                                });
                            }
                        }
                        interfaceC24811Iz.EpA(new AbstractC18280vF() { // from class: X.3mh
                            {
                                super("maybeLogResurrection", 354);
                            }

                            @Override // X.AbstractC18280vF
                            public final void loggedRun() {
                                C2NX c2nx2 = C2NX.this;
                                CallerContext callerContext = C2NX.A08;
                                UserSession userSession2 = c2nx2.A04;
                                Context context = c2nx2.A01;
                                C14360o3.A0B(userSession2, 0);
                                C14360o3.A0B(context, 1);
                                InterfaceC19630xq interfaceC19630xq = AbstractC23021Ah.A00(userSession2).A01;
                                long j = interfaceC19630xq.getLong("last_resurrection_logged_date", 0L);
                                if (j == 0 || System.currentTimeMillis() - j > 86400000) {
                                    VPV.A00(context, userSession2).A01(EnumC33361Eou.A06);
                                    long currentTimeMillis = System.currentTimeMillis();
                                    InterfaceC19610xo ARD = interfaceC19630xq.ARD();
                                    ARD.E7G("last_resurrection_logged_date", currentTimeMillis);
                                    ARD.apply();
                                }
                            }
                        });
                        interfaceC24811Iz.EpA(new AbstractC18280vF() { // from class: X.3mi
                            {
                                super("runServerTimingFetch", 357, 5, false, false);
                            }

                            @Override // X.AbstractC18280vF
                            public final void loggedRun() {
                                CallerContext callerContext = C2NX.A08;
                            }
                        });
                        interfaceC24811Iz.Ep8(new AbstractC18280vF() { // from class: X.3mj
                            {
                                super("initTA", 358, 5, false, false);
                            }

                            @Override // X.AbstractC18280vF
                            public final void loggedRun() {
                                CallerContext callerContext = C2NX.A08;
                                InstagramTransientNetworkDataCollector.Companion.A00();
                            }
                        });
                        interfaceC24811Iz.Ep8(new AbstractC18280vF() { // from class: X.3mk
                            {
                                super("purgeTempFiles", 299650753, 5, false, false);
                            }

                            @Override // X.AbstractC18280vF
                            public final void loggedRun() {
                                final C2NX c2nx2 = C2NX.this;
                                CallerContext callerContext = C2NX.A08;
                                C218914p c218914p = C218914p.A08;
                                C218914p.A03(EnumC220415e.A03, new InterfaceC12870lZ() { // from class: X.93r
                                    @Override // X.InterfaceC12870lZ
                                    public final void onAppBackgrounded() {
                                        int A03 = C0f9.A03(-1556932612);
                                        C14120nc.A00().ATO(new AbstractRunnableC14200nk(299650753) { // from class: X.0vQ
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                runnable.run();
                                            }
                                        });
                                        C0f9.A0A(-1420881869, A03);
                                    }

                                    @Override // X.InterfaceC12870lZ
                                    public final void onAppForegrounded() {
                                        C0f9.A0A(524361787, C0f9.A03(1580860225));
                                    }
                                });
                            }
                        });
                        interfaceC24811Iz.EpA(new AbstractC18280vF() { // from class: X.3ml
                            {
                                super("maybeSyncContactPoints", 359);
                            }

                            @Override // X.AbstractC18280vF
                            public final void loggedRun() {
                                C2NX c2nx2 = C2NX.this;
                                CallerContext callerContext = C2NX.A08;
                                Context context = c2nx2.A01;
                                UserSession userSession2 = c2nx2.A04;
                                C14360o3.A0B(userSession2, 1);
                                if (AbstractC23021Ah.A00(userSession2).A01.getLong(AbstractC111324zv.A00(1074), 0L) <= System.currentTimeMillis() - 259200000 && context != null) {
                                    C1GJ.A03(new EZG(context, userSession2));
                                }
                            }
                        });
                        interfaceC24811Iz.Ep8(new AbstractC18280vF() { // from class: X.3mm
                            {
                                super("prefetchDeveloperOptions", 360, 5, false, false);
                            }

                            @Override // X.AbstractC18280vF
                            public final void loggedRun() {
                                C2NX c2nx2 = C2NX.this;
                                CallerContext callerContext = C2NX.A08;
                                UserSession userSession2 = c2nx2.A04;
                                if (C2TN.A00(userSession2)) {
                                    C1RQ A002 = C1RQ.A00();
                                    MTC mtc = new MTC(EnumC27091Ti.A0M);
                                    mtc.A03 = C05F.A01;
                                    A002.A03(userSession2, new MTD(mtc));
                                }
                            }
                        });
                        interfaceC24811Iz.Ep8(new AbstractC18280vF() { // from class: X.3mn
                            {
                                super("ensureFreshBootstrap", 361, 5, false, false);
                            }

                            @Override // X.AbstractC18280vF
                            public final void loggedRun() {
                                C2NX c2nx2 = C2NX.this;
                                CallerContext callerContext = C2NX.A08;
                                UserSession userSession2 = c2nx2.A04;
                                C2046193v A002 = AbstractC2045993t.A00(userSession2);
                                synchronized (A002) {
                                    if (((Boolean) A002.A03.getValue()).booleanValue()) {
                                        InterfaceC09390do interfaceC09390do = A002.A04;
                                        if (!((C195298kV) interfaceC09390do.getValue()).A02) {
                                            ((C195298kV) interfaceC09390do.getValue()).A03();
                                        }
                                    }
                                }
                                C195218kN.A00(userSession2).A05();
                                if (!C18U.A06(C06090Tz.A05, userSession2, 36330939378451546L)) {
                                    C124155jU A003 = AbstractC124145jT.A00(userSession2);
                                    synchronized (A003) {
                                        if (!((Boolean) A003.A07.getValue()).booleanValue()) {
                                            InterfaceC09390do interfaceC09390do2 = A003.A06;
                                            if (!((C195298kV) interfaceC09390do2.getValue()).A02) {
                                                ((C195298kV) interfaceC09390do2.getValue()).A03();
                                                C195298kV c195298kV = (C195298kV) interfaceC09390do2.getValue();
                                                long j = c195298kV.A00;
                                                if (j == -1) {
                                                    j = c195298kV.A03.getLong(AbstractC111324zv.A00(4397), -1L);
                                                    c195298kV.A00 = j;
                                                }
                                                if (j < System.currentTimeMillis()) {
                                                    A003.A01();
                                                    C124155jU.A00(A003);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        });
                        interfaceC24811Iz.Ep8(new AbstractC18280vF() { // from class: X.3mo
                            {
                                super("initCCUPlugin", 362, 5, false, false);
                            }

                            @Override // X.AbstractC18280vF
                            public final void loggedRun() {
                                C2NX c2nx2 = C2NX.this;
                                CallerContext callerContext = C2NX.A08;
                                Context context = c2nx2.A01;
                                UserSession userSession2 = c2nx2.A04;
                                if (C54P.A01(context, userSession2)) {
                                    FPV fpv = FPV.A01;
                                    if (fpv == null) {
                                        fpv = new FPV();
                                        FPV.A01 = fpv;
                                    }
                                    fpv.A00(context, userSession2);
                                }
                            }
                        });
                        if (C18U.A06(c06090Tz, userSession, 36315902697934526L)) {
                            interfaceC24811Iz.Ep8(new AbstractC18280vF() { // from class: X.4gc
                                {
                                    super("initPandoParsingJNI", 2017988039, 5, false, false);
                                }

                                @Override // X.AbstractC18280vF
                                public final void loggedRun() {
                                    C2NX c2nx2 = C2NX.this;
                                    CallerContext callerContext = C2NX.A08;
                                    UserSession userSession2 = c2nx2.A04;
                                    C14360o3.A0B(userSession2, 0);
                                    ((AnonymousClass506) userSession2.A01(AnonymousClass506.class, new C57509Pfj(userSession2, 2))).createApiFrameworkParser(false);
                                }
                            });
                        }
                        if (C18U.A06(c06090Tz, userSession, 36325815482594706L)) {
                            interfaceC24811Iz.Ep8(new AbstractC18280vF() { // from class: X.9jd
                                {
                                    super("syncLauncher", 603243895, 5, false, false);
                                }

                                @Override // X.AbstractC18280vF
                                public final void loggedRun() {
                                    C2NX c2nx2 = C2NX.this;
                                    CallerContext callerContext = C2NX.A08;
                                    AbstractC51082We.A00(c2nx2.A04).A01();
                                }
                            });
                        }
                        if (Systrace.A0E(1L)) {
                            C0fO.A00(1723040653);
                        }
                    } catch (Throwable th) {
                        th = th;
                        if (Systrace.A0E(1L)) {
                            i = -906186335;
                            C0fO.A00(i);
                            throw th;
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    if (Systrace.A0E(1L)) {
                        C0fO.A00(1992819192);
                    }
                    throw th2;
                }
            }
            if (Systrace.A0E(1L)) {
                C0fO.A01("scheduleStartupJobs", -530183289);
            }
            try {
                InterfaceC24811Iz interfaceC24811Iz2 = AbstractC24641Ih.A02;
                C14360o3.A07(interfaceC24811Iz2);
                interfaceC24811Iz2.Ep8(new AbstractC18280vF() { // from class: X.3mp
                    {
                        super("perf_hint_manager_setup", 1763559808, 3, false, true);
                    }

                    @Override // X.AbstractC18280vF
                    public final void loggedRun() {
                        C2NX.this.A04();
                    }
                });
                interfaceC24811Iz2.EpA(new AbstractC18280vF() { // from class: X.3mq
                    @Override // X.AbstractC18280vF
                    public final void loggedRun() {
                        C1JN.A00 = true;
                    }
                });
                interfaceC24811Iz2.Ep8(new AbstractC18280vF() { // from class: X.3mr
                    {
                        super("registerHeliumBackgroundDetector", 610639448, 5, false, false);
                    }

                    @Override // X.AbstractC18280vF
                    public final void loggedRun() {
                        C2NX c2nx2 = C2NX.this;
                        CallerContext callerContext = C2NX.A08;
                        AnonymousClass942 anonymousClass942 = AnonymousClass942.A03;
                        Context context = c2nx2.A01;
                        UserSession userSession2 = c2nx2.A04;
                        C14360o3.A0B(context, 0);
                        C14360o3.A0B(userSession2, 1);
                        AnonymousClass942.A00 = context;
                        AnonymousClass942.A02 = userSession2;
                        C218914p.A03(EnumC220415e.A03, anonymousClass942);
                        anonymousClass942.onAppForegrounded();
                    }
                });
                interfaceC24811Iz2.Ep8(new AbstractC18280vF() { // from class: X.3ms
                    {
                        super("maybeDownloadHeliumSplit", 1572057322, 5, false, false);
                    }

                    /* JADX WARN: Code restructure failed: missing block: B:48:0x0120, code lost:
                    
                        if (X.C18U.A06(r2, r5, 36321361601635686L) != false) goto L35;
                     */
                    @Override // X.AbstractC18280vF
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final void loggedRun() {
                        /*
                            Method dump skipped, instructions count: 306
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C82893ms.loggedRun():void");
                    }
                });
                C06090Tz c06090Tz2 = C06090Tz.A05;
                if (C18U.A06(c06090Tz2, userSession, 36325175533056855L)) {
                    interfaceC24811Iz2.Ep8(new AbstractC18280vF() { // from class: X.3mt
                        {
                            super("initIGTrafficNTSTigonProvider", 1161737115, 2, false, true);
                        }

                        @Override // X.AbstractC18280vF
                        public final void loggedRun() {
                            C1BQ c1bq = IGTrafficNTSTigonProvider.Companion;
                            C2NX c2nx2 = C2NX.this;
                            CallerContext callerContext = C2NX.A08;
                            c1bq.A01(c2nx2.A04);
                        }
                    });
                }
                if (C18U.A06(c06090Tz2, userSession, 36316216230547593L)) {
                    interfaceC24811Iz2.Ep8(new NH0(c2nx));
                }
                if (C18U.A06(c06090Tz2, userSession, 36323096770063335L)) {
                    InterfaceC24811Iz interfaceC24811Iz3 = AbstractC24641Ih.A02;
                    C14360o3.A07(interfaceC24811Iz3);
                    interfaceC24811Iz3.Ep8(new C27094BxJ(c2nx));
                }
                InterfaceC24811Iz interfaceC24811Iz4 = AbstractC24641Ih.A02;
                C14360o3.A07(interfaceC24811Iz4);
                interfaceC24811Iz4.Ep8(new AbstractC18280vF() { // from class: X.3mu
                    {
                        super("device_compute_platform_init", 675609327, 5, false, false);
                    }

                    @Override // X.AbstractC18280vF
                    public final void loggedRun() {
                        AnonymousClass943 anonymousClass943 = AnonymousClass943.$redex_init_class;
                        C2NX c2nx2 = C2NX.this;
                        CallerContext callerContext = C2NX.A08;
                        Context context = c2nx2.A01;
                        UserSession userSession2 = c2nx2.A04;
                        C14360o3.A0B(context, 0);
                        C14360o3.A0B(userSession2, 1);
                        AnonymousClass943 anonymousClass9432 = (AnonymousClass943) userSession2.A01(AnonymousClass943.class, new C57254Pbc(11, context, userSession2));
                        try {
                            InterfaceC10260gi interfaceC10260gi = anonymousClass9432.A00.A00;
                            if (interfaceC10260gi != null && interfaceC10260gi.AhA(36315477496040703L)) {
                                List list = anonymousClass9432.A03;
                                ArrayList arrayList = new ArrayList();
                                for (Object obj : list) {
                                    C3RU c3ru = (C3RU) obj;
                                    if (c3ru.BfO() != C05F.A01 || c3ru.Bvt()) {
                                        arrayList.add(obj);
                                    }
                                }
                                if (!arrayList.isEmpty()) {
                                    AbstractC2046994d.A00(anonymousClass9432.A01).A01(arrayList);
                                }
                                Iterator it = anonymousClass9432.A02.iterator();
                                while (it.hasNext()) {
                                    ((C94A) it.next()).COI();
                                }
                                return;
                            }
                            Iterator it2 = anonymousClass9432.A02.iterator();
                            while (it2.hasNext()) {
                                ((C94A) it2.next()).cleanup();
                            }
                        } catch (Exception e) {
                            C0f5 AEp = C18950wb.A01.AEp("error on IgMLEngineSessionManager.init", 1011495295);
                            AEp.ERI(e);
                            AEp.report();
                        }
                    }
                });
                InterfaceC24811Iz interfaceC24811Iz5 = AbstractC24641Ih.A02;
                C14360o3.A07(interfaceC24811Iz5);
                interfaceC24811Iz5.Ep8(new AbstractC18280vF() { // from class: X.3mv
                    {
                        super("under_age_upload_app_job", 498115063, 5, true, false);
                    }

                    @Override // X.AbstractC18280vF
                    public final void loggedRun() {
                        Map map;
                        C2NX c2nx2 = C2NX.this;
                        CallerContext callerContext = C2NX.A08;
                        Context context = c2nx2.A01;
                        UserSession userSession2 = c2nx2.A04;
                        C14360o3.A0B(context, 0);
                        C14360o3.A0B(userSession2, 1);
                        C2048994x c2048994x = (C2048994x) userSession2.A01(C2048994x.class, new C57533Pg7(24, context, userSession2));
                        C06090Tz c06090Tz3 = C06090Tz.A05;
                        if (C1AD.A06(c06090Tz3, 18316643948053644L)) {
                            C73673Rt c73673Rt = c2048994x.A01;
                            c73673Rt.A00();
                            try {
                                Context context2 = c2048994x.A00;
                                C14360o3.A0B(context2, 1);
                                C1AD.A01(c06090Tz3, 18598118924818834L);
                                Gson gson = new Gson();
                                String A002 = MSV.A00(1683);
                                C54369O1b c54369O1b = new C54369O1b(AbstractC50543MSw.A00(context2, null, A002, new C50361MLn(A002, 43)));
                                C03250Di c03250Di = C03250Di.A00;
                                C14360o3.A07(c03250Di);
                                C54519O6w c54519O6w = new C54519O6w(new C2047794l(AbstractC40691uc.A01(c2048994x.A02)), new C54582O9j(c03250Di, c54369O1b, gson));
                                C206999Ee c206999Ee = new C206999Ee(c2048994x, 28);
                                C206999Ee c206999Ee2 = new C206999Ee(c2048994x, 29);
                                C54582O9j c54582O9j = c54519O6w.A01;
                                InterfaceC100484fC interfaceC100484fC = c54582O9j.A01.A00;
                                MBX mbx = new MBX(interfaceC100484fC, "", "underage", (InterfaceC23621Ds) null, 0);
                                AnonymousClass191 anonymousClass191 = AnonymousClass191.A00;
                                String str = (String) C2ST.A00(anonymousClass191, mbx);
                                if (str.length() == 0) {
                                    map = AbstractC06930Yk.A0E();
                                } else {
                                    Object A09 = c54582O9j.A02.A09(str, new C60849RVm().type);
                                    C14360o3.A07(A09);
                                    map = (HashMap) A09;
                                }
                                if (map.isEmpty()) {
                                    c206999Ee.invoke("no data to upload");
                                    return;
                                }
                                C3R9[] c3r9Arr = Example.A04;
                                Example example = new Example(ExampleContext.A05, "u13_example", new HashMap());
                                Iterator it = map.entrySet().iterator();
                                while (it.hasNext()) {
                                    String str2 = (String) ((Map.Entry) it.next()).getKey();
                                    example.A02.put(str2, new FeatureData(Type.A09, str2, null, null, 0.0d, 16376, ((Number) r7.getValue()).intValue()));
                                }
                                C2047794l c2047794l = c54519O6w.A00;
                                Integer num = C05F.A01;
                                List singletonList = Collections.singletonList(example);
                                C14360o3.A07(singletonList);
                                long longValue = ((Number) C2ST.A00(anonymousClass191, new C50111MAj(interfaceC100484fC, MSV.A00(1684), null, 0, 0L))).longValue();
                                C57533Pg7 c57533Pg7 = new C57533Pg7(23, c206999Ee, c54519O6w);
                                C50358MLk c50358MLk = new C50358MLk(c206999Ee2, 24);
                                C14360o3.A0B(num, 2);
                                C14360o3.A07(c2047794l.A00(num, "AGE_SIGMA", "0.0.1", singletonList, c57533Pg7, c50358MLk, longValue).get());
                            } catch (Exception e) {
                                String message = e.getMessage();
                                if (message == null) {
                                    message = "exception";
                                }
                                c73673Rt.A01.markerAnnotate(310644286, "end_reason", message);
                                c73673Rt.A04(false, null);
                            }
                        }
                    }
                });
                InterfaceC24811Iz interfaceC24811Iz6 = AbstractC24641Ih.A02;
                C14360o3.A07(interfaceC24811Iz6);
                interfaceC24811Iz6.Ep8(new AbstractC18280vF() { // from class: X.3mw
                    {
                        super("zero_day_language_signal_extract", 2118577885, 5, true, false);
                    }

                    /* JADX WARN: Removed duplicated region for block: B:141:0x0333 A[Catch: Exception -> 0x04bb, TryCatch #0 {Exception -> 0x04bb, blocks: (B:7:0x00a6, B:10:0x00d6, B:12:0x00ea, B:13:0x0105, B:15:0x010b, B:17:0x0118, B:18:0x011a, B:21:0x0120, B:26:0x0137, B:27:0x013b, B:29:0x0143, B:31:0x014b, B:33:0x0151, B:34:0x0157, B:35:0x0167, B:37:0x016d, B:38:0x0183, B:40:0x0189, B:43:0x019f, B:46:0x01ac, B:52:0x01ca, B:54:0x01dd, B:56:0x01e3, B:57:0x01e7, B:59:0x01ee, B:62:0x01ff, B:64:0x0203, B:66:0x020f, B:67:0x021a, B:69:0x0220, B:74:0x0237, B:75:0x025e, B:77:0x0264, B:79:0x0274, B:85:0x0276, B:86:0x027f, B:88:0x0285, B:89:0x0296, B:91:0x029e, B:94:0x02a2, B:95:0x02aa, B:97:0x02b0, B:98:0x02ba, B:100:0x02c4, B:102:0x02cc, B:105:0x02d0, B:112:0x02d4, B:115:0x02dc, B:122:0x02e6, B:123:0x02ed, B:125:0x02f7, B:127:0x02ff, B:131:0x0306, B:133:0x0311, B:135:0x0319, B:138:0x0321, B:139:0x032d, B:141:0x0333, B:142:0x0341, B:144:0x0347, B:147:0x0353, B:150:0x0379, B:152:0x0383, B:159:0x03bb, B:161:0x03c9, B:163:0x0409, B:164:0x041b, B:165:0x0442, B:167:0x0448, B:168:0x0467, B:170:0x046d, B:172:0x0486, B:174:0x048d, B:178:0x04b5, B:179:0x04ba, B:181:0x0304, B:186:0x0134), top: B:6:0x00a6, inners: #1 }] */
                    /* JADX WARN: Removed duplicated region for block: B:149:0x0378  */
                    /* JADX WARN: Removed duplicated region for block: B:152:0x0383 A[Catch: Exception -> 0x04bb, TryCatch #0 {Exception -> 0x04bb, blocks: (B:7:0x00a6, B:10:0x00d6, B:12:0x00ea, B:13:0x0105, B:15:0x010b, B:17:0x0118, B:18:0x011a, B:21:0x0120, B:26:0x0137, B:27:0x013b, B:29:0x0143, B:31:0x014b, B:33:0x0151, B:34:0x0157, B:35:0x0167, B:37:0x016d, B:38:0x0183, B:40:0x0189, B:43:0x019f, B:46:0x01ac, B:52:0x01ca, B:54:0x01dd, B:56:0x01e3, B:57:0x01e7, B:59:0x01ee, B:62:0x01ff, B:64:0x0203, B:66:0x020f, B:67:0x021a, B:69:0x0220, B:74:0x0237, B:75:0x025e, B:77:0x0264, B:79:0x0274, B:85:0x0276, B:86:0x027f, B:88:0x0285, B:89:0x0296, B:91:0x029e, B:94:0x02a2, B:95:0x02aa, B:97:0x02b0, B:98:0x02ba, B:100:0x02c4, B:102:0x02cc, B:105:0x02d0, B:112:0x02d4, B:115:0x02dc, B:122:0x02e6, B:123:0x02ed, B:125:0x02f7, B:127:0x02ff, B:131:0x0306, B:133:0x0311, B:135:0x0319, B:138:0x0321, B:139:0x032d, B:141:0x0333, B:142:0x0341, B:144:0x0347, B:147:0x0353, B:150:0x0379, B:152:0x0383, B:159:0x03bb, B:161:0x03c9, B:163:0x0409, B:164:0x041b, B:165:0x0442, B:167:0x0448, B:168:0x0467, B:170:0x046d, B:172:0x0486, B:174:0x048d, B:178:0x04b5, B:179:0x04ba, B:181:0x0304, B:186:0x0134), top: B:6:0x00a6, inners: #1 }] */
                    /* JADX WARN: Removed duplicated region for block: B:167:0x0448 A[Catch: Exception -> 0x04bb, TryCatch #0 {Exception -> 0x04bb, blocks: (B:7:0x00a6, B:10:0x00d6, B:12:0x00ea, B:13:0x0105, B:15:0x010b, B:17:0x0118, B:18:0x011a, B:21:0x0120, B:26:0x0137, B:27:0x013b, B:29:0x0143, B:31:0x014b, B:33:0x0151, B:34:0x0157, B:35:0x0167, B:37:0x016d, B:38:0x0183, B:40:0x0189, B:43:0x019f, B:46:0x01ac, B:52:0x01ca, B:54:0x01dd, B:56:0x01e3, B:57:0x01e7, B:59:0x01ee, B:62:0x01ff, B:64:0x0203, B:66:0x020f, B:67:0x021a, B:69:0x0220, B:74:0x0237, B:75:0x025e, B:77:0x0264, B:79:0x0274, B:85:0x0276, B:86:0x027f, B:88:0x0285, B:89:0x0296, B:91:0x029e, B:94:0x02a2, B:95:0x02aa, B:97:0x02b0, B:98:0x02ba, B:100:0x02c4, B:102:0x02cc, B:105:0x02d0, B:112:0x02d4, B:115:0x02dc, B:122:0x02e6, B:123:0x02ed, B:125:0x02f7, B:127:0x02ff, B:131:0x0306, B:133:0x0311, B:135:0x0319, B:138:0x0321, B:139:0x032d, B:141:0x0333, B:142:0x0341, B:144:0x0347, B:147:0x0353, B:150:0x0379, B:152:0x0383, B:159:0x03bb, B:161:0x03c9, B:163:0x0409, B:164:0x041b, B:165:0x0442, B:167:0x0448, B:168:0x0467, B:170:0x046d, B:172:0x0486, B:174:0x048d, B:178:0x04b5, B:179:0x04ba, B:181:0x0304, B:186:0x0134), top: B:6:0x00a6, inners: #1 }] */
                    /* JADX WARN: Removed duplicated region for block: B:37:0x016d A[Catch: Exception -> 0x04bb, TryCatch #0 {Exception -> 0x04bb, blocks: (B:7:0x00a6, B:10:0x00d6, B:12:0x00ea, B:13:0x0105, B:15:0x010b, B:17:0x0118, B:18:0x011a, B:21:0x0120, B:26:0x0137, B:27:0x013b, B:29:0x0143, B:31:0x014b, B:33:0x0151, B:34:0x0157, B:35:0x0167, B:37:0x016d, B:38:0x0183, B:40:0x0189, B:43:0x019f, B:46:0x01ac, B:52:0x01ca, B:54:0x01dd, B:56:0x01e3, B:57:0x01e7, B:59:0x01ee, B:62:0x01ff, B:64:0x0203, B:66:0x020f, B:67:0x021a, B:69:0x0220, B:74:0x0237, B:75:0x025e, B:77:0x0264, B:79:0x0274, B:85:0x0276, B:86:0x027f, B:88:0x0285, B:89:0x0296, B:91:0x029e, B:94:0x02a2, B:95:0x02aa, B:97:0x02b0, B:98:0x02ba, B:100:0x02c4, B:102:0x02cc, B:105:0x02d0, B:112:0x02d4, B:115:0x02dc, B:122:0x02e6, B:123:0x02ed, B:125:0x02f7, B:127:0x02ff, B:131:0x0306, B:133:0x0311, B:135:0x0319, B:138:0x0321, B:139:0x032d, B:141:0x0333, B:142:0x0341, B:144:0x0347, B:147:0x0353, B:150:0x0379, B:152:0x0383, B:159:0x03bb, B:161:0x03c9, B:163:0x0409, B:164:0x041b, B:165:0x0442, B:167:0x0448, B:168:0x0467, B:170:0x046d, B:172:0x0486, B:174:0x048d, B:178:0x04b5, B:179:0x04ba, B:181:0x0304, B:186:0x0134), top: B:6:0x00a6, inners: #1 }] */
                    /* JADX WARN: Removed duplicated region for block: B:56:0x01e3 A[Catch: Exception -> 0x04bb, TryCatch #0 {Exception -> 0x04bb, blocks: (B:7:0x00a6, B:10:0x00d6, B:12:0x00ea, B:13:0x0105, B:15:0x010b, B:17:0x0118, B:18:0x011a, B:21:0x0120, B:26:0x0137, B:27:0x013b, B:29:0x0143, B:31:0x014b, B:33:0x0151, B:34:0x0157, B:35:0x0167, B:37:0x016d, B:38:0x0183, B:40:0x0189, B:43:0x019f, B:46:0x01ac, B:52:0x01ca, B:54:0x01dd, B:56:0x01e3, B:57:0x01e7, B:59:0x01ee, B:62:0x01ff, B:64:0x0203, B:66:0x020f, B:67:0x021a, B:69:0x0220, B:74:0x0237, B:75:0x025e, B:77:0x0264, B:79:0x0274, B:85:0x0276, B:86:0x027f, B:88:0x0285, B:89:0x0296, B:91:0x029e, B:94:0x02a2, B:95:0x02aa, B:97:0x02b0, B:98:0x02ba, B:100:0x02c4, B:102:0x02cc, B:105:0x02d0, B:112:0x02d4, B:115:0x02dc, B:122:0x02e6, B:123:0x02ed, B:125:0x02f7, B:127:0x02ff, B:131:0x0306, B:133:0x0311, B:135:0x0319, B:138:0x0321, B:139:0x032d, B:141:0x0333, B:142:0x0341, B:144:0x0347, B:147:0x0353, B:150:0x0379, B:152:0x0383, B:159:0x03bb, B:161:0x03c9, B:163:0x0409, B:164:0x041b, B:165:0x0442, B:167:0x0448, B:168:0x0467, B:170:0x046d, B:172:0x0486, B:174:0x048d, B:178:0x04b5, B:179:0x04ba, B:181:0x0304, B:186:0x0134), top: B:6:0x00a6, inners: #1 }] */
                    /* JADX WARN: Removed duplicated region for block: B:88:0x0285 A[Catch: Exception -> 0x04bb, TryCatch #0 {Exception -> 0x04bb, blocks: (B:7:0x00a6, B:10:0x00d6, B:12:0x00ea, B:13:0x0105, B:15:0x010b, B:17:0x0118, B:18:0x011a, B:21:0x0120, B:26:0x0137, B:27:0x013b, B:29:0x0143, B:31:0x014b, B:33:0x0151, B:34:0x0157, B:35:0x0167, B:37:0x016d, B:38:0x0183, B:40:0x0189, B:43:0x019f, B:46:0x01ac, B:52:0x01ca, B:54:0x01dd, B:56:0x01e3, B:57:0x01e7, B:59:0x01ee, B:62:0x01ff, B:64:0x0203, B:66:0x020f, B:67:0x021a, B:69:0x0220, B:74:0x0237, B:75:0x025e, B:77:0x0264, B:79:0x0274, B:85:0x0276, B:86:0x027f, B:88:0x0285, B:89:0x0296, B:91:0x029e, B:94:0x02a2, B:95:0x02aa, B:97:0x02b0, B:98:0x02ba, B:100:0x02c4, B:102:0x02cc, B:105:0x02d0, B:112:0x02d4, B:115:0x02dc, B:122:0x02e6, B:123:0x02ed, B:125:0x02f7, B:127:0x02ff, B:131:0x0306, B:133:0x0311, B:135:0x0319, B:138:0x0321, B:139:0x032d, B:141:0x0333, B:142:0x0341, B:144:0x0347, B:147:0x0353, B:150:0x0379, B:152:0x0383, B:159:0x03bb, B:161:0x03c9, B:163:0x0409, B:164:0x041b, B:165:0x0442, B:167:0x0448, B:168:0x0467, B:170:0x046d, B:172:0x0486, B:174:0x048d, B:178:0x04b5, B:179:0x04ba, B:181:0x0304, B:186:0x0134), top: B:6:0x00a6, inners: #1 }] */
                    @Override // X.AbstractC18280vF
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final void loggedRun() {
                        /*
                            Method dump skipped, instructions count: 1218
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C82933mw.loggedRun():void");
                    }
                });
                if (C18U.A06(c06090Tz2, userSession, 36320317924581732L)) {
                    final int A01 = (int) C18U.A01(c06090Tz2, userSession, 36601792901812596L);
                    InterfaceC24811Iz interfaceC24811Iz7 = AbstractC24641Ih.A02;
                    C14360o3.A07(interfaceC24811Iz7);
                    interfaceC24811Iz7.Ep8(new AbstractC18280vF(A01) { // from class: X.9jc
                        @Override // X.AbstractC18280vF
                        public final void loggedRun() {
                            C006802i c006802i;
                            short s;
                            C2NX c2nx2 = C2NX.this;
                            CallerContext callerContext = C2NX.A08;
                            UserSession userSession2 = c2nx2.A04;
                            C14360o3.A0B(userSession2, 0);
                            if (A4A.A02 == null) {
                                A4A.A02 = C006802i.A0p;
                            }
                            AnonymousClass945 anonymousClass945 = new AnonymousClass945(userSession2);
                            C006802i c006802i2 = A4A.A02;
                            if (c006802i2 != null) {
                                c006802i2.markerStart(424087700);
                            }
                            C006802i c006802i3 = A4A.A02;
                            if (c006802i3 != null) {
                                c006802i3.markerAnnotate(424087700, "use_case_name", anonymousClass945.CDV());
                            }
                            C006802i c006802i4 = A4A.A02;
                            if (c006802i4 != null) {
                                c006802i4.markerAnnotate(424087700, "use_case_version", anonymousClass945.CDY());
                            }
                            C4QF c4qf = ((C2048494s) userSession2.A01(C2048494s.class, new C57510Pfk(userSession2, 28))).A00;
                            C3SN A002 = A1P.A00(c4qf, "FOR_IMAGE_TYPE");
                            A4A.A00 = A002;
                            ((Number) A002.A00).floatValue();
                            C3SN A003 = A1P.A00(c4qf, "FOR_VIDEO_TYPE");
                            A4A.A01 = A003;
                            ((Number) A003.A00).floatValue();
                            C006802i c006802i5 = A4A.A02;
                            if (c006802i5 != null) {
                                c006802i5.markerAnnotate(424087700, "load_failure_reason_for_image", A4A.A00.A01);
                            }
                            C006802i c006802i6 = A4A.A02;
                            if (c006802i6 != null) {
                                c006802i6.markerAnnotate(424087700, "load_failure_reason_for_video", A4A.A01.A01);
                            }
                            if (!A4A.A00.A02 && !A4A.A01.A02) {
                                c006802i = A4A.A02;
                                if (c006802i != null) {
                                    s = 3;
                                } else {
                                    return;
                                }
                            } else {
                                c006802i = A4A.A02;
                                if (c006802i == null) {
                                    return;
                                } else {
                                    s = 2;
                                }
                            }
                            c006802i.markerEnd(424087700, s);
                        }
                    });
                }
                if (C18U.A06(c06090Tz2, userSession, 36324213459988455L)) {
                    final int A012 = (int) C18U.A01(c06090Tz2, userSession, 36605688436626766L);
                    InterfaceC24811Iz interfaceC24811Iz8 = AbstractC24641Ih.A02;
                    C14360o3.A07(interfaceC24811Iz8);
                    interfaceC24811Iz8.Ep8(new AbstractC18280vF(A012) { // from class: X.9ji
                        @Override // X.AbstractC18280vF
                        public final void loggedRun() {
                            short s;
                            C2NX c2nx2 = C2NX.this;
                            CallerContext callerContext = C2NX.A08;
                            UserSession userSession2 = c2nx2.A04;
                            C14360o3.A0B(userSession2, 0);
                            if (AbstractC224069up.A01 == null) {
                                AbstractC224069up.A01 = C006802i.A0p;
                            }
                            AnonymousClass946 anonymousClass946 = new AnonymousClass946(userSession2);
                            C006802i c006802i = AbstractC224069up.A01;
                            if (c006802i != null) {
                                c006802i.markerStart(424087700);
                            }
                            C006802i c006802i2 = AbstractC224069up.A01;
                            if (c006802i2 != null) {
                                c006802i2.markerAnnotate(424087700, "use_case_name", anonymousClass946.CDV());
                            }
                            C006802i c006802i3 = AbstractC224069up.A01;
                            if (c006802i3 != null) {
                                c006802i3.markerAnnotate(424087700, "use_case_version", anonymousClass946.CDY());
                            }
                            int i2 = ((C2048594t) userSession2.A01(C2048594t.class, new C57510Pfk(userSession2, 38))).A00.A00.getInt(AnonymousClass001.A0T("p_video_seek", "prediction_score", '_'), -2);
                            AbstractC224069up.A00 = i2;
                            C006802i c006802i4 = AbstractC224069up.A01;
                            if (c006802i4 != null) {
                                c006802i4.markerAnnotate(424087700, "prediction_score", i2);
                            }
                            int i3 = AbstractC224069up.A00;
                            C006802i c006802i5 = AbstractC224069up.A01;
                            if (i3 < 0) {
                                if (c006802i5 != null) {
                                    c006802i5.markerAnnotate(424087700, TraceFieldType.FailureReason, "prediction cache empty");
                                }
                                c006802i5 = AbstractC224069up.A01;
                                if (c006802i5 != null) {
                                    s = 3;
                                } else {
                                    return;
                                }
                            } else if (c006802i5 == null) {
                                return;
                            } else {
                                s = 2;
                            }
                            c006802i5.markerEnd(424087700, s);
                        }
                    });
                }
                if (C18U.A06(c06090Tz2, userSession, 36325699518543143L)) {
                    final int A013 = (int) C18U.A01(c06090Tz2, userSession, 36607174495180333L);
                    InterfaceC24811Iz interfaceC24811Iz9 = AbstractC24641Ih.A02;
                    C14360o3.A07(interfaceC24811Iz9);
                    interfaceC24811Iz9.Ep8(new AbstractC18280vF(A013) { // from class: X.9GU
                        @Override // X.AbstractC18280vF
                        public final void loggedRun() {
                            C2NX c2nx2 = C2NX.this;
                            CallerContext callerContext = C2NX.A08;
                            UserSession userSession2 = c2nx2.A04;
                            C14360o3.A0B(userSession2, 0);
                            A8W a8w = (A8W) userSession2.A01(A8W.class, new C57510Pfk(userSession2, 37));
                            if (a8w.A00 == null) {
                                a8w.A00 = C006802i.A0p;
                            }
                            UserSession userSession3 = a8w.A01;
                            C2048694u c2048694u = new C2048694u(userSession3);
                            C006802i c006802i = a8w.A00;
                            if (c006802i != null) {
                                c006802i.markerStart(424087700);
                            }
                            C006802i c006802i2 = a8w.A00;
                            if (c006802i2 != null) {
                                c006802i2.markerAnnotate(424087700, "use_case_name", c2048694u.CDV());
                            }
                            C006802i c006802i3 = a8w.A00;
                            if (c006802i3 != null) {
                                c006802i3.markerAnnotate(424087700, "use_case_version", c2048694u.CDY());
                            }
                            C14360o3.A0B(userSession3, 0);
                            AGF agf = (AGF) ((C94X) userSession3.A01(C94X.class, new C57510Pfk(userSession3, 36))).A02.getValue();
                            C3SN ATr = new C73613Rn(agf.A01, agf.A03.CDV()).ATr(null);
                            C006802i c006802i4 = a8w.A00;
                            if (c006802i4 != null) {
                                c006802i4.markerAnnotate(424087700, "feature_download_result", ATr.A02);
                            }
                            C006802i c006802i5 = a8w.A00;
                            if (c006802i5 != null) {
                                c006802i5.markerAnnotate(424087700, TraceFieldType.FailureReason, ATr.A01);
                            }
                            for (FeatureData featureData : (List) ATr.A00) {
                                a8w.A02.put(featureData.A03, Float.valueOf((float) featureData.A00));
                            }
                            C006802i c006802i6 = a8w.A00;
                            if (c006802i6 != null) {
                                c006802i6.markerAnnotate(424087700, "available_features_count", a8w.A02.size());
                            }
                            for (Object obj : AbstractC16960so.A1Q("4275", "4276", "4277", "4278", "4279", "4280", "4281", "4300")) {
                                ConcurrentHashMap concurrentHashMap = a8w.A02;
                                if (!concurrentHashMap.containsKey(obj)) {
                                    concurrentHashMap.put(obj, Float.valueOf(0.0f));
                                }
                            }
                            C006802i c006802i7 = a8w.A00;
                            if (c006802i7 != null) {
                                c006802i7.markerEnd(424087700, (short) 2);
                            }
                        }
                    });
                }
                if (C18U.A06(c06090Tz2, userSession, 36324943604494947L)) {
                    final int A014 = (int) C18U.A01(c06090Tz2, userSession, 36606418581067206L);
                    InterfaceC24811Iz interfaceC24811Iz10 = AbstractC24641Ih.A02;
                    C14360o3.A07(interfaceC24811Iz10);
                    interfaceC24811Iz10.Ep8(new AbstractC18280vF(A014) { // from class: X.49b
                        /* JADX WARN: Code restructure failed: missing block: B:27:0x008f, code lost:
                        
                            if (r0 != null) goto L37;
                         */
                        @Override // X.AbstractC18280vF
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final void loggedRun() {
                            /*
                                Method dump skipped, instructions count: 298
                                To view this dump add '--comments-level debug' option
                            */
                            throw new UnsupportedOperationException("Method not decompiled: X.C49b.loggedRun():void");
                        }
                    });
                }
                if (C18U.A06(c06090Tz2, userSession, 2342166612788194713L)) {
                    InterfaceC24811Iz interfaceC24811Iz11 = AbstractC24641Ih.A02;
                    C14360o3.A07(interfaceC24811Iz11);
                    final Date date = new Date(System.currentTimeMillis());
                    interfaceC24811Iz11.Ep8(new AbstractC18280vF() { // from class: X.3mx
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super("uploadProductConnectFunnelLogJob", 2081040861, 5, false, false);
                        }

                        @Override // X.AbstractC18280vF
                        public final void loggedRun() {
                            AnonymousClass957.A00();
                            ConnectFunnel.CProxy.uploadLogsAtColdStartIfNecessary(AnonymousClass001.A0R("file://", AbstractC23881Ey.A00().AXd(null, 2027409170).getPath()), date, C0MF.A01(C0Pe.A0A, null), null, null);
                        }
                    });
                }
                if (C18U.A06(C06090Tz.A06, userSession, 36325184122336092L)) {
                    InterfaceC24811Iz interfaceC24811Iz12 = AbstractC24641Ih.A02;
                    C14360o3.A07(interfaceC24811Iz12);
                    interfaceC24811Iz12.Ep8(new C52403NGy(c2nx));
                }
                interfaceC24811Iz2.Ep8(new AbstractC18280vF() { // from class: X.3my
                    {
                        super("igPermissionSnapshots", 614, 5, false, false);
                    }

                    /* JADX WARN: Removed duplicated region for block: B:32:0x00c4 A[Catch: NullPointerException -> 0x0123, TryCatch #3 {NullPointerException -> 0x0123, blocks: (B:8:0x0058, B:10:0x005c, B:12:0x0064, B:14:0x0069, B:17:0x0072, B:19:0x0077, B:22:0x0081, B:25:0x0087, B:26:0x008e, B:30:0x00a8, B:32:0x00c4, B:33:0x00cd, B:35:0x00e8, B:46:0x0103, B:37:0x0109, B:42:0x011d, B:49:0x0092, B:50:0x00a6, B:53:0x009b), top: B:7:0x0058, inners: #0, #1, #2 }] */
                    /* JADX WARN: Removed duplicated region for block: B:35:0x00e8 A[Catch: NullPointerException -> 0x0123, TryCatch #3 {NullPointerException -> 0x0123, blocks: (B:8:0x0058, B:10:0x005c, B:12:0x0064, B:14:0x0069, B:17:0x0072, B:19:0x0077, B:22:0x0081, B:25:0x0087, B:26:0x008e, B:30:0x00a8, B:32:0x00c4, B:33:0x00cd, B:35:0x00e8, B:46:0x0103, B:37:0x0109, B:42:0x011d, B:49:0x0092, B:50:0x00a6, B:53:0x009b), top: B:7:0x0058, inners: #0, #1, #2 }] */
                    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
                    /* JADX WARN: Type inference failed for: r9v0, types: [X.0iw, java.lang.Object, X.95B] */
                    @Override // X.AbstractC18280vF
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final void loggedRun() {
                        /*
                            Method dump skipped, instructions count: 300
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C82953my.loggedRun():void");
                    }
                });
                interfaceC24811Iz2.Ep8(new AbstractC18280vF() { // from class: X.3mz
                    {
                        super("igLogPersistence", 168, 5, false, false);
                    }

                    @Override // X.AbstractC18280vF
                    public final void loggedRun() {
                        File[] listFiles;
                        String str;
                        C2NX c2nx2 = C2NX.this;
                        CallerContext callerContext = C2NX.A08;
                        C95I c95i = new C95I(c2nx2.A04);
                        Context context = c2nx2.A01;
                        C14360o3.A0B(context, 0);
                        long j = C226218q.A00(context).getLong("last_app_start_timestamp", -1L);
                        long currentTimeMillis = System.currentTimeMillis();
                        C17050sx A015 = AbstractC09440dt.A01(new C9EU(c95i, 33));
                        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
                        C14360o3.A07(defaultSharedPreferences);
                        C17320tT c17320tT = new C17320tT(defaultSharedPreferences, "IgLogPersistenceAppJob");
                        String string = c17320tT.getString(MSV.A00(1557), "");
                        long j2 = c17320tT.getLong(MSV.A00(1558), -1L);
                        C95L c95l = (C95L) A015.getValue();
                        C14360o3.A0B(c95l, 4);
                        if (C95J.A00 != null) {
                            long j3 = currentTimeMillis - 172800000;
                            File file = C95K.A00;
                            if (file != null && (listFiles = file.listFiles()) != null) {
                                int length = listFiles.length;
                                for (int i2 = 0; i2 < length; i2++) {
                                    File file2 = listFiles[i2];
                                    if (file2.lastModified() <= j) {
                                        try {
                                            try {
                                                if (file2.lastModified() > j3) {
                                                    String A062 = AbstractC57194Pae.A06(file2, C15W.A05);
                                                    String name = file2.getName();
                                                    C14360o3.A07(name);
                                                    if (C14360o3.A0K(AbstractC001900j.A0L(name, ".", name), AbstractC58317Pt9.A00(237))) {
                                                        CallSummaryInfo callSummaryInfo = new CallSummaryInfo(AbstractC72885XqK.A00(A062));
                                                        CallSummaryInfo.Builder A002 = AbstractC72885XqK.A00(A062);
                                                        Long l = callSummaryInfo.batteryEndLevel;
                                                        C0Pe c0Pe = C0Pe.A0A;
                                                        if (c0Pe != null) {
                                                            str = C0MF.A01(c0Pe, l);
                                                        } else {
                                                            str = "not_init";
                                                        }
                                                        A002.coldStartReason = str;
                                                        String str2 = callSummaryInfo.localCallId;
                                                        C14360o3.A06(str2);
                                                        long j4 = j2;
                                                        if (!C14360o3.A0K(string, str2)) {
                                                            j4 = -1;
                                                        }
                                                        A002.deviceShutdownTime = Long.valueOf(j4);
                                                        CallSummaryInfo callSummaryInfo2 = new CallSummaryInfo(A002);
                                                        C18920wW c18920wW = (C18920wW) c95l.A00;
                                                        InterfaceC02590Ai A003 = c18920wW.A00(c18920wW.A00, "ls_rtc_call_summary");
                                                        if (A003.isSampled()) {
                                                            A003.AAP(MSV.A00(1389), callSummaryInfo2.localCallId);
                                                            A003.A9K("system_time", Long.valueOf(callSummaryInfo2.systemTime));
                                                            A003.A9K("steady_time", Long.valueOf(callSummaryInfo2.steadyTime));
                                                            A003.A9K("call_created_time", Long.valueOf(callSummaryInfo2.callCreatedTime));
                                                            A003.A9K("call_answered_time", Long.valueOf(callSummaryInfo2.callAnsweredTime));
                                                            A003.A9K("call_connected_time", Long.valueOf(callSummaryInfo2.callConnectedTime));
                                                            A003.A9K("call_ended_time", Long.valueOf(callSummaryInfo2.callEndedTime));
                                                            A003.A9K(AbstractC111324zv.A00(465), Long.valueOf(callSummaryInfo2.lastUpdatedTime));
                                                            A003.AAP("call_trigger", callSummaryInfo2.callTrigger);
                                                            A003.A7v("is_caller", Boolean.valueOf(callSummaryInfo2.isCaller));
                                                            String str3 = callSummaryInfo2.sharedCallId;
                                                            if (str3 != null) {
                                                                A003.AAP(MSV.A00(1601), str3);
                                                            }
                                                            Long l2 = callSummaryInfo2.engineCreatedTime;
                                                            if (l2 != null) {
                                                                A003.A9K("engine_created_time", l2);
                                                            }
                                                            Long l3 = callSummaryInfo2.joinableCompleteTime;
                                                            if (l3 != null) {
                                                                A003.A9K("joinable_complete_time", l3);
                                                            }
                                                            String str4 = callSummaryInfo2.peerId;
                                                            if (str4 != null) {
                                                                A003.AAP("peer_id", str4);
                                                            }
                                                            String str5 = callSummaryInfo2.endCallReason;
                                                            if (str5 != null) {
                                                                A003.AAP("end_call_reason", str5);
                                                            }
                                                            Boolean bool = callSummaryInfo2.remoteEnded;
                                                            if (bool != null) {
                                                                A003.A7v(MSV.A00(1541), bool);
                                                            }
                                                            Boolean bool2 = callSummaryInfo2.inviteRequestedVideo;
                                                            if (bool2 != null) {
                                                                A003.A7v("invite_requested_video", bool2);
                                                            }
                                                            Long l4 = callSummaryInfo2.mediaGateBlockedFrameCount;
                                                            if (l4 != null) {
                                                                A003.A9K("media_gate_blocked_frame_count", l4);
                                                            }
                                                            String str6 = callSummaryInfo2.videoEscalationStatus;
                                                            if (str6 != null) {
                                                                A003.AAP("video_escalation_status", str6);
                                                            }
                                                            Long l5 = callSummaryInfo2.localVideoDuration;
                                                            if (l5 != null) {
                                                                A003.A9K("local_video_duration", l5);
                                                            }
                                                            Long l6 = callSummaryInfo2.remoteVideoDuration;
                                                            if (l6 != null) {
                                                                A003.A9K("remote_video_duration", l6);
                                                            }
                                                            Long l7 = callSummaryInfo2.batteryStartLevel;
                                                            if (l7 != null) {
                                                                A003.A9K("battery_start_level", l7);
                                                            }
                                                            Long l8 = callSummaryInfo2.batteryEndLevel;
                                                            if (l8 != null) {
                                                                A003.A9K("battery_end_level", l8);
                                                            }
                                                            Boolean bool3 = callSummaryInfo2.wasDeviceCharged;
                                                            if (bool3 != null) {
                                                                A003.A7v("was_device_charged", bool3);
                                                            }
                                                            String str7 = callSummaryInfo2.joiningContext;
                                                            if (str7 != null) {
                                                                A003.AAP(MSV.A00(1365), str7);
                                                            }
                                                            String str8 = callSummaryInfo2.webDeviceId;
                                                            if (str8 != null) {
                                                                A003.AAP(AbstractC111324zv.A00(3314), str8);
                                                            }
                                                            String str9 = callSummaryInfo2.endCallSubreason;
                                                            if (str9 != null) {
                                                                A003.AAP("end_call_subreason", str9);
                                                            }
                                                            String str10 = callSummaryInfo2.coldStartReason;
                                                            if (str10 != null) {
                                                                A003.AAP("cold_start_reason", str10);
                                                            }
                                                            Boolean bool4 = callSummaryInfo2.isConnectedEnd;
                                                            if (bool4 != null) {
                                                                A003.A7v("is_connected_end", bool4);
                                                            }
                                                            Long l9 = callSummaryInfo2.deviceShutdownTime;
                                                            if (l9 != null) {
                                                                A003.A9K("device_shutdown_time", l9);
                                                            }
                                                            Long l10 = callSummaryInfo2.maxConcurrentConnectedParticipant;
                                                            if (l10 != null) {
                                                                A003.A9K("max_concurrent_connected_participant", l10);
                                                            }
                                                            Long l11 = callSummaryInfo2.rtcActorId;
                                                            if (l11 != null) {
                                                                A003.A9K("rtc_actor_id", l11);
                                                            }
                                                            Long l12 = callSummaryInfo2.autoRejoinCount;
                                                            if (l12 != null) {
                                                                A003.A9K("auto_rejoin_count", l12);
                                                            }
                                                            String str11 = callSummaryInfo2.joinMode;
                                                            if (str11 != null) {
                                                                A003.AAP("join_mode", str11);
                                                            }
                                                            Long l13 = callSummaryInfo2.autoRejoinSuccessfulCount;
                                                            if (l13 != null) {
                                                                A003.A9K("auto_rejoin_successful_count", l13);
                                                            }
                                                            String str12 = callSummaryInfo2.webrtcVersion;
                                                            if (str12 != null) {
                                                                A003.AAP("webrtc_version", str12);
                                                            }
                                                            A003.Cht();
                                                        }
                                                    } else {
                                                        throw new IllegalArgumentException(AbstractC111324zv.A00(1672));
                                                        break;
                                                    }
                                                }
                                            } catch (IOException e) {
                                                C0K8.A0L("AppLogPersistenceAppJobBase", "Unable to upload crashed call summary:\n%s\ncannot be parsed", e, file2);
                                            } catch (Exception e2) {
                                                C0K8.A0G("AppLogPersistenceAppJobBase", "Unable to upload crashed call summary", e2);
                                            }
                                        } finally {
                                            file2.delete();
                                        }
                                    }
                                }
                            }
                        }
                    }
                });
                if (C18U.A06(c06090Tz2, userSession, 36318033003878220L)) {
                    interfaceC24811Iz2.Ep8(new C45733KMk(c2nx));
                }
                interfaceC24811Iz2.Ep8(new AbstractC18280vF() { // from class: X.3n0
                    {
                        super("setupDrawableLogging", 580, 5, false, false);
                    }

                    @Override // X.AbstractC18280vF
                    public final void loggedRun() {
                        InterfaceC09390do interfaceC09390do = C27351Un.A05;
                        ((C27351Un) interfaceC09390do.getValue()).A02 = true;
                        C27351Un c27351Un = (C27351Un) interfaceC09390do.getValue();
                        final C2NX c2nx2 = C2NX.this;
                        c27351Un.A01 = new InterfaceC08830cm() { // from class: X.95M
                            @Override // X.InterfaceC08830cm
                            public final /* bridge */ /* synthetic */ Object get() {
                                C2NX c2nx3 = C2NX.this;
                                CallerContext callerContext = C2NX.A08;
                                return Boolean.valueOf(AbstractC15820qc.A0E(c2nx3.A01));
                            }
                        };
                    }
                });
                interfaceC24811Iz2.Ep8(new AbstractC18280vF() { // from class: X.3n1
                    {
                        super("tryRegisterPushToken", 365, 5, false, false);
                    }

                    @Override // X.AbstractC18280vF
                    public final void loggedRun() {
                        C2NX c2nx2 = C2NX.this;
                        CallerContext callerContext = C2NX.A08;
                        String str = c2nx2.A04.token;
                        Integer num = C05F.A00;
                        C3UN A002 = C74063Tx.A00();
                        C19740y2 A003 = AbstractC19730y1.A00(AbstractC12960li.A00);
                        String str2 = A002.BjD().A01;
                        long j = C3JG.A01;
                        C14360o3.A0B(str2, 0);
                        String A0R = AnonymousClass001.A0R("push_reg_date", str2);
                        InterfaceC19630xq interfaceC19630xq = A003.A00;
                        long j2 = interfaceC19630xq.getLong("push_reg_date", -1L);
                        if (j2 != -1) {
                            InterfaceC19610xo ARD = interfaceC19630xq.ARD();
                            ARD.EEj("push_reg_date");
                            ARD.E7G(A0R, j2);
                            ARD.apply();
                        }
                        if (interfaceC19630xq.contains(A0R)) {
                            if (Math.abs(interfaceC19630xq.getLong(A0R, 0L) - System.currentTimeMillis()) <= j) {
                                C41451vu.A01.E4s(new C71903Kn(str));
                                return;
                            }
                        }
                        A002.ED2(num);
                    }
                });
                interfaceC24811Iz2.Ep8(new AbstractC18280vF() { // from class: X.3n2
                    {
                        super("mprotectCode", 366, 5, false, false);
                    }

                    @Override // X.AbstractC18280vF
                    public final void loggedRun() {
                        C2NX c2nx2 = C2NX.this;
                        CallerContext callerContext = C2NX.A08;
                        DalvikInternals.mprotectExecCode();
                        C218914p.A03(EnumC220415e.A03, c2nx2.A03);
                    }
                });
                if (!A03(c2nx)) {
                    interfaceC24811Iz2.EpA(new AbstractC18280vF() { // from class: X.4rM
                        {
                            super("warmDirectInboxCache", 367, 5, false, false);
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, X.1vN] */
                        @Override // X.AbstractC18280vF
                        public final void loggedRun() {
                            C2NX c2nx2 = C2NX.this;
                            CallerContext callerContext = C2NX.A08;
                            AbstractC25651Mw.A00(c2nx2.A04).A05(new Object());
                        }
                    });
                }
                interfaceC24811Iz2.EpA(new AbstractC18280vF() { // from class: X.3n3
                    {
                        super("refreshCloseFriendsCount", 368);
                    }

                    @Override // X.AbstractC18280vF
                    public final void loggedRun() {
                        C2NX c2nx2 = C2NX.this;
                        CallerContext callerContext = C2NX.A08;
                        UserSession userSession2 = c2nx2.A04;
                        if (!C18U.A06(C06090Tz.A05, userSession2, 36328057455918155L) && !C684436h.A02) {
                            ESO eso = new ESO();
                            if (userSession2 != null) {
                                C1ON A002 = C34974Faz.A00(userSession2);
                                A002.A00 = eso;
                                C1GJ.A03(A002);
                            }
                        }
                    }
                });
                interfaceC24811Iz2.EpA(new AbstractC18280vF() { // from class: X.3n4
                    {
                        super("tryEnableRTI", 375);
                    }

                    @Override // X.AbstractC18280vF
                    public final void loggedRun() {
                        C2NX c2nx2 = C2NX.this;
                        CallerContext callerContext = C2NX.A08;
                        UserSession userSession2 = c2nx2.A04;
                        C14360o3.A0B(userSession2, 0);
                        userSession2.A01(C33773Evz.class, C37009GSb.A00);
                    }
                });
                interfaceC24811Iz2.EpA(new AbstractC18280vF() { // from class: X.3n5
                    {
                        super("updateSessionCountForPushPermission", 1147742495);
                    }

                    @Override // X.AbstractC18280vF
                    public final void loggedRun() {
                        CallerContext callerContext = C2NX.A08;
                        InterfaceC19630xq interfaceC19630xq = AbstractC19730y1.A00(AbstractC12960li.A00).A00;
                        String A002 = AbstractC111324zv.A00(3074);
                        int i2 = interfaceC19630xq.getInt(A002, 0) + 1;
                        InterfaceC19610xo ARD = interfaceC19630xq.ARD();
                        ARD.E7D(A002, i2);
                        ARD.apply();
                    }
                });
                interfaceC24811Iz2.EpA(new AbstractC18280vF() { // from class: X.3n6
                    {
                        super("sendSupportedCameraCapabilities", 376);
                    }

                    @Override // X.AbstractC18280vF
                    public final void loggedRun() {
                        C2NX c2nx2 = C2NX.this;
                        CallerContext callerContext = C2NX.A08;
                        UserSession userSession2 = c2nx2.A04;
                        C14360o3.A0B(userSession2, 0);
                        InterfaceC19630xq interfaceC19630xq = IBB.A00;
                        if (interfaceC19630xq == null) {
                            interfaceC19630xq = AbstractC19750y3.A01("SupportedCapabilitiesPreferences");
                            IBB.A00 = interfaceC19630xq;
                        }
                        long j = -1;
                        if (interfaceC19630xq != null) {
                            j = interfaceC19630xq.getLong(AbstractC111324zv.A00(1683), -1L);
                        }
                        long currentTimeMillis = System.currentTimeMillis() - j;
                        if (j >= 0 && currentTimeMillis < 86400000) {
                            return;
                        }
                        C39016HFs c39016HFs = new C39016HFs(userSession2);
                        C1ON A002 = IBB.A00(userSession2);
                        A002.A00 = c39016HFs;
                        C1GJ.A03(A002);
                    }
                });
                interfaceC24811Iz2.EpA(new AbstractC18280vF() { // from class: X.3n7
                    {
                        super("maybeLogOneTapStatus", 377);
                    }

                    @Override // X.AbstractC18280vF
                    public final void loggedRun() {
                        String str;
                        C2NX c2nx2 = C2NX.this;
                        CallerContext callerContext = C2NX.A08;
                        UserSession userSession2 = c2nx2.A04;
                        InterfaceC19630xq interfaceC19630xq = AbstractC23021Ah.A00(userSession2).A01;
                        long j = interfaceC19630xq.getLong("last_one_tap_status_logged_date", 0L);
                        if (j == 0 || System.currentTimeMillis() - j > 604800000) {
                            String str2 = userSession2.userId;
                            C18920wW A02 = AbstractC12220kQ.A02(userSession2);
                            InterfaceC02590Ai A002 = A02.A00(A02.A00, "sso_status");
                            if (C83743oJ.A01(userSession2).A0K(str2)) {
                                str = "YES";
                            } else {
                                str = "NO";
                            }
                            A002.AAP("enabled", str);
                            A002.A9K(AbstractC111324zv.A00(2310), Long.valueOf(Long.parseLong(str2)));
                            A002.AAP("containermodule", "sso_status");
                            A002.Cht();
                            long currentTimeMillis = System.currentTimeMillis();
                            InterfaceC19610xo ARD = interfaceC19630xq.ARD();
                            ARD.E7G("last_one_tap_status_logged_date", currentTimeMillis);
                            ARD.apply();
                        }
                    }
                });
                if (C18U.A06(c06090Tz2, userSession, 36320403825369553L)) {
                    interfaceC24811Iz2.EpA(new AbstractC18280vF() { // from class: X.3n8
                        {
                            super("LoadIGDGenAIAgents", 197228604);
                        }

                        @Override // X.AbstractC18280vF
                        public final void loggedRun() {
                            C2NX.A01(C2NX.this);
                        }
                    });
                } else {
                    interfaceC24811Iz2.Ep8(new AbstractC18280vF() { // from class: X.3v3
                        {
                            super("LoadIGDGenAIAgents", 197228604, 2, true, true);
                        }

                        @Override // X.AbstractC18280vF
                        public final void loggedRun() {
                            C2NX.A01(C2NX.this);
                        }
                    });
                }
                interfaceC24811Iz2.Ep8(new AbstractC18280vF() { // from class: X.3n9
                    {
                        super("setFileDescriptorLimit", 379, 5, false, false);
                    }

                    @Override // X.AbstractC18280vF
                    public final void loggedRun() {
                        CallerContext callerContext = C2NX.A08;
                        if (Ulimit.sNativeLibLoaded) {
                            Ulimit.setNativeMaxUlimit();
                        }
                    }
                });
                interfaceC24811Iz2.Ep8(new AbstractC18280vF() { // from class: X.3nA
                    {
                        super("maybeFetchAccountLinkingInfo", 380, 5, false, false);
                    }

                    @Override // X.AbstractC18280vF
                    public final void loggedRun() {
                        C2NX c2nx2 = C2NX.this;
                        CallerContext callerContext = C2NX.A08;
                        long j = C23051Ak.A02;
                        UserSession userSession2 = c2nx2.A04;
                        boolean A002 = C23061Al.A00(userSession2).A00(EnumC23071Am.A03);
                        C06090Tz c06090Tz3 = C06090Tz.A05;
                        if (!C18U.A06(c06090Tz3, userSession2, 36328057455262789L)) {
                            if (C18U.A06(c06090Tz3, userSession2, 36328057455328326L) && A002) {
                                return;
                            }
                            C95P.A00(userSession2, "startup_manager").A02();
                        }
                    }
                });
                interfaceC24811Iz2.Ep8(new AbstractC18280vF() { // from class: X.3nB
                    {
                        super("registerAuthDataBackgroundMigrationListener", 2022138370, 5, false, false);
                    }

                    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, X.95R] */
                    @Override // X.AbstractC18280vF
                    public final void loggedRun() {
                        C2NX c2nx2 = C2NX.this;
                        CallerContext callerContext = C2NX.A08;
                        UserSession userSession2 = c2nx2.A04;
                        C14360o3.A0B(userSession2, 0);
                        C95R c95r = C95R.A01;
                        C95R c95r2 = c95r;
                        if (c95r == null) {
                            ?? obj = new Object();
                            obj.A00 = userSession2;
                            C95R.A01 = obj;
                            c95r2 = obj;
                        }
                        C218914p.A03(EnumC220415e.A03, c95r2);
                    }
                });
                interfaceC24811Iz2.Ep8(new AbstractC18280vF() { // from class: X.3nC
                    {
                        super("initCameraLeakDetector", 381, 5, false, false);
                    }

                    @Override // X.AbstractC18280vF
                    public final void loggedRun() {
                        C2NX c2nx2 = C2NX.this;
                        CallerContext callerContext = C2NX.A08;
                        if (C18U.A06(C06090Tz.A05, c2nx2.A04, 36312522558538908L) && C73299Xzp.A02 == null) {
                            C73299Xzp.A02 = new C73299Xzp();
                        }
                    }
                });
                interfaceC24811Iz2.Ep8(new AbstractC18280vF() { // from class: X.3nD
                    {
                        super("maybeInitializeMobileBoostProvider", 384, 5, false, false);
                    }

                    @Override // X.AbstractC18280vF
                    public final void loggedRun() {
                        C2NX c2nx2 = C2NX.this;
                        CallerContext callerContext = C2NX.A08;
                        try {
                            Context context = c2nx2.A01;
                            C1J4.A00(context).A08(context, C006802i.A0p, c2nx2.A04);
                        } catch (Throwable th3) {
                            C0w9.A06(AbstractC111324zv.A00(691), "failed to initialize mobileboost", th3);
                        }
                    }
                });
                interfaceC24811Iz2.Ep8(new AbstractC18280vF() { // from class: X.3nE
                    {
                        super("initializeAutofillScriptStore", 385, 5, false, false);
                    }

                    @Override // X.AbstractC18280vF
                    public final void loggedRun() {
                        C2NX c2nx2 = C2NX.this;
                        CallerContext callerContext = C2NX.A08;
                        AnonymousClass960.A00(c2nx2.A01, c2nx2.A04);
                    }
                });
                interfaceC24811Iz2.Ep8(new AbstractC18280vF() { // from class: X.3nF
                    {
                        super("maybeDisableJit", 386, 5, false, false);
                    }

                    @Override // X.AbstractC18280vF
                    public final void loggedRun() {
                        CallerContext callerContext = C2NX.A08;
                    }
                });
                interfaceC24811Iz2.Ep8(new AbstractC18280vF() { // from class: X.3nG
                    @Override // X.AbstractC18280vF
                    public final void loggedRun() {
                        C56E.A00(C56E.A05, false);
                        C56E.A00(C56E.A06, false);
                    }
                });
                if (C18U.A06(c06090Tz2, userSession, 36316315014664427L)) {
                    interfaceC24811Iz2.Ep8(new AbstractC18280vF() { // from class: X.9jW
                        @Override // X.AbstractC18280vF
                        public final void loggedRun() {
                            if (!C14360o3.A0K(Looper.myLooper(), Looper.getMainLooper())) {
                                OneCameraXLoggerCpp.loadSoLibrary();
                                QPLUserFlowImpl.loadSoLibrary();
                                return;
                            }
                            throw AbstractC166987dD.A18("OC warm up should not be called from Main Thread");
                        }
                    });
                }
                interfaceC24811Iz2.Ep8(new AbstractC18280vF() { // from class: X.3nH
                    {
                        super("initializeLocationManagerDetours", 389, 5, false, false);
                    }

                    @Override // X.AbstractC18280vF
                    public final void loggedRun() {
                        C2NX c2nx2 = C2NX.this;
                        CallerContext callerContext = C2NX.A08;
                        UserSession userSession2 = c2nx2.A04;
                        if (userSession2 != null) {
                            C06090Tz c06090Tz3 = C06090Tz.A05;
                            if (C18U.A06(c06090Tz3, userSession2, 36311397277237770L)) {
                                final boolean z3 = false;
                                if (C18U.A06(c06090Tz3, userSession2, 36311397277172233L)) {
                                    z3 = true;
                                }
                                final boolean z4 = false;
                                if (C18U.A06(c06090Tz3, userSession2, 36311397277106696L)) {
                                    z4 = true;
                                }
                                C0T7 c0t7 = new C0T7() { // from class: X.964
                                    @Override // X.C0T7
                                    public final List DJL(TelephonyManager telephonyManager) {
                                        C14360o3.A0B(telephonyManager, 0);
                                        if (z4 && C218914p.A08()) {
                                            C0w9.A04("IgLocationRequestDetector", "TELEPHONY_MANAGER_DETOUR_getAllCellInfo()", 1);
                                        }
                                        if (!z3 || !AbstractC202008wf.A00()) {
                                            C0fZ c0fZ = C0fZ.$redex_init_class;
                                            List<CellInfo> allCellInfo = telephonyManager.getAllCellInfo();
                                            if (allCellInfo != null) {
                                                return allCellInfo;
                                            }
                                        }
                                        return new ArrayList();
                                    }

                                    @Override // X.C0T7
                                    public final CellLocation DJN(TelephonyManager telephonyManager) {
                                        C14360o3.A0B(telephonyManager, 0);
                                        if (z4 && C218914p.A08()) {
                                            C0w9.A04("IgLocationRequestDetector", "TELEPHONY_MANAGER_DETOUR_getCellLocation()", 1);
                                        }
                                        if (z3 && AbstractC202008wf.A00()) {
                                            return null;
                                        }
                                        C0fZ c0fZ = C0fZ.$redex_init_class;
                                        try {
                                            return telephonyManager.getCellLocation();
                                        } catch (Exception unused) {
                                            return null;
                                        }
                                    }

                                    @Override // X.C0T7
                                    public final WifiInfo DJP(WifiManager wifiManager) {
                                        C14360o3.A0B(wifiManager, 0);
                                        if (z4 && C218914p.A08()) {
                                            C0w9.A04("IgLocationRequestDetector", "WIFI_MANAGER_DETOUR_getConnectionInfo()", 1);
                                        }
                                        if (z3 && AbstractC202008wf.A00()) {
                                            return null;
                                        }
                                        AbstractC09830fh abstractC09830fh = AbstractC09830fh.$redex_init_class;
                                        return wifiManager.getConnectionInfo();
                                    }

                                    @Override // X.C0T7
                                    public final Location DJS(LocationManager locationManager, String str) {
                                        C14360o3.A0B(locationManager, 0);
                                        C14360o3.A0B(str, 1);
                                        if (z4 && C218914p.A08()) {
                                            C0w9.A04("IgLocationRequestDetector", "LOCATION_MANAGER_DETOUR_getLastKnownLocation()", 1);
                                        }
                                        if (z3 && AbstractC202008wf.A00()) {
                                            return null;
                                        }
                                        C0fS c0fS = C0fS.$redex_init_class;
                                        return locationManager.getLastKnownLocation(str);
                                    }

                                    @Override // X.C0T7
                                    public final List DJT(WifiManager wifiManager) {
                                        C14360o3.A0B(wifiManager, 0);
                                        if (z4 && C218914p.A08()) {
                                            C0w9.A04("IgLocationRequestDetector", "WIFI_MANAGER_DETOUR_getScanResults()", 1);
                                        }
                                        if (z3 && AbstractC202008wf.A00()) {
                                            return new ArrayList();
                                        }
                                        AbstractC09830fh abstractC09830fh = AbstractC09830fh.$redex_init_class;
                                        List<ScanResult> scanResults = wifiManager.getScanResults();
                                        C14360o3.A07(scanResults);
                                        return scanResults;
                                    }

                                    @Override // X.C0T7
                                    public final ServiceState DJU(TelephonyManager telephonyManager) {
                                        C14360o3.A0B(telephonyManager, 0);
                                        if (z4 && C218914p.A08()) {
                                            C0w9.A04("IgLocationRequestDetector", "TELEPHONY_MANAGER_DETOUR_getServiceState()", 1);
                                        }
                                        if (z3 && AbstractC202008wf.A00()) {
                                            return null;
                                        }
                                        C0fZ c0fZ = C0fZ.$redex_init_class;
                                        return telephonyManager.getServiceState();
                                    }

                                    @Override // X.C0T7
                                    public final void DfB(LocationListener locationListener, LocationManager locationManager) {
                                        C14360o3.A0B(locationManager, 0);
                                        C14360o3.A0B(locationListener, 1);
                                        if (z4 && C218914p.A08()) {
                                            C0w9.A04("IgLocationRequestDetector", "LOCATION_MANAGER_DETOUR_removeUpdates()", 1);
                                        }
                                        C0fS c0fS = C0fS.$redex_init_class;
                                        locationManager.removeUpdates(locationListener);
                                    }

                                    @Override // X.C0T7
                                    public final void Dg8(LocationListener locationListener, LocationManager locationManager, String str, float f, int i2, long j) {
                                        C14360o3.A0B(locationManager, 0);
                                        C14360o3.A0B(str, 1);
                                        C14360o3.A0B(locationListener, 4);
                                        if (z4 && C218914p.A08()) {
                                            C0w9.A04("IgLocationRequestDetector", "LOCATION_MANAGER_DETOUR_requestLocationUpdates()", 1);
                                        }
                                        if (z3 && AbstractC202008wf.A00()) {
                                            return;
                                        }
                                        C0fS c0fS = C0fS.$redex_init_class;
                                        locationManager.requestLocationUpdates(str, j, f, locationListener);
                                    }

                                    @Override // X.C0T7
                                    public final boolean Do8(WifiManager wifiManager) {
                                        C14360o3.A0B(wifiManager, 0);
                                        if (z4 && C218914p.A08()) {
                                            C0w9.A04("IgLocationRequestDetector", "WIFI_MANAGER_DETOUR_startScan()", 1);
                                        }
                                        if (z3 && AbstractC202008wf.A00()) {
                                            return false;
                                        }
                                        AbstractC09830fh abstractC09830fh = AbstractC09830fh.$redex_init_class;
                                        return wifiManager.startScan();
                                    }

                                    @Override // X.C0T7
                                    public final void Dg7(Criteria criteria, LocationListener locationListener, LocationManager locationManager, Looper looper, float f, int i2, long j) {
                                        C14360o3.A0B(locationManager, 0);
                                        C14360o3.A0B(looper, 5);
                                        if (z4 && C218914p.A08()) {
                                            C0w9.A04("IgLocationRequestDetector", "LOCATION_MANAGER_DETOUR_requestLocationUpdates()", 1);
                                        }
                                        if (z3 && AbstractC202008wf.A00()) {
                                            return;
                                        }
                                        C0fS c0fS = C0fS.$redex_init_class;
                                        locationManager.requestLocationUpdates(0L, 0.0f, criteria, locationListener, looper);
                                    }
                                };
                                try {
                                    ReadWriteLock readWriteLock = C0T8.A01;
                                    readWriteLock.writeLock().lock();
                                    C0T8.A00 = c0t7;
                                    readWriteLock.writeLock().unlock();
                                } catch (Throwable th3) {
                                    C0T8.A01.writeLock().unlock();
                                    throw th3;
                                }
                            }
                        }
                    }
                });
                interfaceC24811Iz2.Ep8(new AbstractC18280vF() { // from class: X.3nI
                    {
                        super("initDeviceStorageMonitors", 394, 5, false, false);
                    }

                    /* JADX WARN: Type inference failed for: r0v32, types: [java.lang.Object, X.S4l] */
                    @Override // X.AbstractC18280vF
                    public final void loggedRun() {
                        C89173yJ c89173yJ;
                        ArrayList arrayList;
                        C124265jg c124265jg;
                        C1MY c1my;
                        C2NX c2nx2 = C2NX.this;
                        CallerContext callerContext = C2NX.A08;
                        Context context = c2nx2.A01;
                        UserSession userSession2 = c2nx2.A04;
                        C14360o3.A0B(userSession2, 1);
                        C06090Tz c06090Tz3 = C06090Tz.A05;
                        if (C18U.A06(c06090Tz3, userSession2, 36310765916913935L)) {
                            AnonymousClass966 anonymousClass966 = AnonymousClass965.A03;
                            if (context != null) {
                                synchronized (anonymousClass966) {
                                    if (AnonymousClass965.A02 == null) {
                                        synchronized (AnonymousClass965.class) {
                                            if (AnonymousClass965.A02 == null) {
                                                Context applicationContext = context.getApplicationContext();
                                                C14360o3.A07(applicationContext);
                                                AnonymousClass965 anonymousClass965 = new AnonymousClass965(applicationContext, userSession2);
                                                AnonymousClass965.A02 = anonymousClass965;
                                                C218914p c218914p = C218914p.A08;
                                                C218914p.A03(EnumC220415e.A03, anonymousClass965);
                                            }
                                        }
                                    }
                                }
                            } else {
                                throw new IllegalStateException("Required value was null.");
                            }
                        }
                        if (C0JK.A01().A09()) {
                            C006802i c006802i = C006802i.A0p;
                            synchronized (C124265jg.class) {
                                C124265jg c124265jg2 = new C124265jg(c006802i);
                                C124265jg.A0A = c124265jg2;
                                C218914p.A08.A0A(c124265jg2);
                                if (!C218914p.A08()) {
                                    C124265jg.A0A.A00();
                                }
                                c124265jg = C124265jg.A0A;
                            }
                            C14360o3.A07(c124265jg);
                            c124265jg.A01 = C18U.A01(c06090Tz3, userSession2, 36595603853150409L);
                            C006802i c006802i2 = C006802i.A0p;
                            synchronized (C1MY.class) {
                                c1my = new C1MY(c006802i2);
                                C1MY.A07 = c1my;
                            }
                            AbstractC61543RpN.A00 = c1my;
                            try {
                                LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = c124265jg.A05;
                                lightweightQuickPerformanceLogger.markerStart(43253762);
                                Map map = c124265jg.A07;
                                synchronized (map) {
                                    map.put(c1my, 1);
                                }
                                lightweightQuickPerformanceLogger.markerEnd(43253762, (short) 2);
                                ?? obj = new Object();
                                C1MY c1my2 = AbstractC61543RpN.A00;
                                if (c1my2 != null) {
                                    c1my2.A00 = obj;
                                    c1my2.EDD(C25821No.A00());
                                    C1MY c1my3 = AbstractC61543RpN.A00;
                                    if (c1my3 != null) {
                                        C70401WUd.A00 = userSession2;
                                        c1my3.EDD(C70401WUd.A01);
                                        C1MY c1my4 = AbstractC61543RpN.A00;
                                        if (c1my4 != null) {
                                            c1my4.EDD(C63974Sx0.A00);
                                            C1MY c1my5 = AbstractC61543RpN.A00;
                                            if (c1my5 != null) {
                                                c1my5.EDD(C25A.A00(userSession2).A03);
                                            }
                                        }
                                    }
                                }
                                C14360o3.A0F("diskTrimmableManager");
                                throw C00O.createAndThrow();
                            } catch (Throwable th3) {
                                c124265jg.A05.markerEnd(43253762, (short) 2);
                                throw th3;
                            }
                        }
                        if (C18U.A06(c06090Tz3, userSession2, 36311947032986444L)) {
                            if (C89163yI.A05 == null) {
                                C89163yI c89163yI = new C89163yI(C23111Aq.A00());
                                C89163yI.A05 = c89163yI;
                                C218914p.A08.A0A(c89163yI);
                            }
                            synchronized (C89173yJ.class) {
                                c89173yJ = C89173yJ.A02;
                                if (c89173yJ == null) {
                                    c89173yJ = new C89173yJ();
                                    C89173yJ.A02 = c89173yJ;
                                }
                            }
                            C18920wW A015 = AbstractC12220kQ.A01(new C29130Csv(), userSession2);
                            synchronized (c89173yJ) {
                                c89173yJ.A00 = A015;
                                LruCache lruCache = c89173yJ.A01;
                                arrayList = new ArrayList(lruCache.snapshot().values());
                                lruCache.evictAll();
                            }
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                C89173yJ.A00(A015, (C70113W4l) it.next());
                            }
                        }
                        C1F0 A002 = C1F0.A00();
                        C14360o3.A07(A002);
                        C17280tP A003 = C17280tP.A4E.A00();
                        A002.A00.A04("dev_media_store_external_files", A003.A1y.CES(A003, C17280tP.A4G[179]), IntentModule.EXTRA_MAP_KEY_FOR_VALUE);
                    }
                });
                interfaceC24811Iz2.Ep8(new AbstractC18280vF() { // from class: X.3nJ
                    {
                        super("initPushTokenBackgroundRefresh", 1560068420, 5, false, false);
                    }

                    @Override // X.AbstractC18280vF
                    public final void loggedRun() {
                        C2NX c2nx2 = C2NX.this;
                        CallerContext callerContext = C2NX.A08;
                        UserSession userSession2 = c2nx2.A04;
                        InterfaceC09390do interfaceC09390do = C96A.A00;
                        C14360o3.A0B(userSession2, 0);
                        QuickPerformanceLogger qPLInstance = QuickPerformanceLoggerProvider.getQPLInstance();
                        if (qPLInstance == null) {
                            qPLInstance = QuickPerformanceLoggerProvider.A01;
                        }
                        qPLInstance.markerStart(813775312);
                        InterfaceC09390do interfaceC09390do2 = C96A.A00;
                        long j = ((InterfaceC19630xq) interfaceC09390do2.getValue()).getLong("REFRESH_PUSH_TOKEN_EXPERIMENT_EXPERIMENT_VERSION_PREF_KEY", 0L);
                        long A015 = C18U.A01(C06090Tz.A06, userSession2, 36607071416096294L);
                        InterfaceC19610xo ARD = ((InterfaceC19630xq) interfaceC09390do2.getValue()).ARD();
                        if (qPLInstance.isMarkerOn(813775312)) {
                            MarkerEditor withMarker = qPLInstance.withMarker(813775312);
                            C14360o3.A0A(withMarker);
                            withMarker.annotate("deviceExperimentVersion", j);
                            withMarker.annotate("experimentVersion", A015);
                            withMarker.markerEditingCompleted();
                        }
                        String A002 = AbstractC58317Pt9.A00(198);
                        String A003 = AbstractC58317Pt9.A00(197);
                        String A004 = AbstractC58317Pt9.A00(199);
                        if ((A015 != 0 || j == 0) && A015 <= j) {
                            qPLInstance.markerAnnotate(813775312, "skipped_reset_experiment", true);
                        } else {
                            qPLInstance.markerPoint(813775312, "reset_experiment_start");
                            ARD.E7G("REFRESH_PUSH_TOKEN_EXPERIMENT_EXPERIMENT_VERSION_PREF_KEY", A015);
                            ARD.EEj(A004);
                            ARD.EEj("REFRESH_PUSH_TOKEN_EXPERIMENT_USER_ID_PREF_KEY");
                            ARD.EEj(A003);
                            ARD.EEj(A002);
                            qPLInstance.markerPoint(813775312, "reset_experiment_end");
                        }
                        if (((InterfaceC19630xq) interfaceC09390do2.getValue()).contains("REFRESH_PUSH_TOKEN_EXPERIMENT_USER_ID_PREF_KEY") && !C14360o3.A0K(userSession2.userId, ((InterfaceC19630xq) interfaceC09390do2.getValue()).getString("REFRESH_PUSH_TOKEN_EXPERIMENT_USER_ID_PREF_KEY", "-1"))) {
                            qPLInstance.markerAnnotate(813775312, "skipped_non_first_exposure", true);
                        } else {
                            qPLInstance.markerAnnotate(813775312, "skipped_non_first_exposure", false);
                            qPLInstance.markerPoint(813775312, "set_params_start");
                            ARD.E7K("REFRESH_PUSH_TOKEN_EXPERIMENT_USER_ID_PREF_KEY", userSession2.userId);
                            C06090Tz c06090Tz3 = C06090Tz.A04;
                            C14360o3.A08(c06090Tz3);
                            boolean A062 = C18U.A06(c06090Tz3, userSession2, 36325596439065792L);
                            ARD.E77(A004, A062);
                            long A016 = C18U.A01(c06090Tz3, userSession2, 36607071415899683L);
                            ARD.E7G(A002, A016);
                            long A017 = C18U.A01(c06090Tz3, userSession2, 36607071415834146L);
                            ARD.E7G(A003, A017);
                            if (qPLInstance.isMarkerOn(813775312)) {
                                MarkerEditor withMarker2 = qPLInstance.withMarker(813775312);
                                C14360o3.A0A(withMarker2);
                                withMarker2.annotate("should_refresh", A062);
                                withMarker2.annotate(AbstractC58317Pt9.A00(350), A016);
                                withMarker2.annotate("job_interval", A017);
                                withMarker2.markerEditingCompleted();
                            }
                            qPLInstance.markerPoint(813775312, "set_params_end");
                        }
                        ARD.apply();
                        qPLInstance.markerEnd(813775312, (short) 2);
                        C96P.A01.A00(c2nx2.A01);
                    }
                });
                interfaceC24811Iz2.Ep8(new AbstractC18280vF() { // from class: X.3nK
                    {
                        super("maybeFetchRemoteFontsDownload", 586, 5, false, false);
                    }

                    @Override // X.AbstractC18280vF
                    public final void loggedRun() {
                        C2NX c2nx2 = C2NX.this;
                        CallerContext callerContext = C2NX.A08;
                        AbstractC15960qq.A00(c2nx2.A01).A03();
                    }
                });
                interfaceC24811Iz2.Ep8(new AbstractC18280vF() { // from class: X.3nL
                    {
                        super("maybeFetchRemoteChannelsAssets", 795, 5, false, false);
                    }

                    @Override // X.AbstractC18280vF
                    public final void loggedRun() {
                        C2NX c2nx2 = C2NX.this;
                        CallerContext callerContext = C2NX.A08;
                        C2051096a c2051096a = C96Z.A04;
                        Context context = c2nx2.A01;
                        UserSession userSession2 = c2nx2.A04;
                        C14360o3.A0B(context, 0);
                        C14360o3.A0B(userSession2, 1);
                        C96Z c96z = C96Z.A03;
                        if (c96z == null) {
                            synchronized (c2051096a) {
                                c96z = C96Z.A03;
                                if (c96z == null) {
                                    Context applicationContext = context.getApplicationContext();
                                    C14360o3.A07(applicationContext);
                                    c96z = new C96Z(applicationContext, userSession2);
                                    C96Z.A03 = c96z;
                                }
                            }
                        }
                        UserSession userSession3 = c96z.A01;
                        if (C5SJ.A00(userSession3) && C18U.A06(C06090Tz.A06, userSession3, 36319042319162266L)) {
                            for (C3LX c3lx : AbstractC47195KtU.A01) {
                                if (c3lx != null) {
                                    C6VI c6vi = new C6VI(new C6VF(c96z.A00, c3lx, InterfaceC58742mX.A00));
                                    c6vi.A00();
                                    c96z.A02.put(c3lx, c6vi);
                                }
                            }
                        }
                        if (C5SJ.A00(userSession3) && C18U.A06(C06090Tz.A06, userSession3, 36322671566334349L)) {
                            for (C3LX c3lx2 : AbstractC47195KtU.A00) {
                                if (c3lx2 != null) {
                                    C6VI c6vi2 = new C6VI(new C6VF(c96z.A00, c3lx2, InterfaceC58742mX.A00));
                                    c6vi2.A00();
                                    c96z.A02.put(c3lx2, c6vi2);
                                }
                            }
                        }
                    }
                });
                if (C18U.A06(c06090Tz2, userSession, 36325355920831505L)) {
                    interfaceC24811Iz2.Ep8(new AbstractC18280vF() { // from class: X.3nM
                        {
                            super("initializeMobileProber", 1577914900, 5, false, false);
                        }

                        @Override // X.AbstractC18280vF
                        public final void loggedRun() {
                            C2051696h c2051696h = IGMobileProberJob.Companion;
                            C2NX c2nx2 = C2NX.this;
                            CallerContext callerContext = C2NX.A08;
                            UserSession userSession2 = c2nx2.A04;
                            C14360o3.A0B(userSession2, 0);
                            AndroidAsyncExecutorFactory androidAsyncExecutorFactory = AndroidAsyncExecutorFactory.$redex_init_class;
                            AndroidAsyncExecutorFactory androidAsyncExecutorFactory2 = new AndroidAsyncExecutorFactory(C14250np.A00().A00);
                            IGTigonService tigonService = IGTigonService.getTigonService(userSession2);
                            C14360o3.A07(tigonService);
                            IGMobileProberJob.initializeMobileProberNative(androidAsyncExecutorFactory2, tigonService);
                        }
                    });
                }
                interfaceC24811Iz2.Ep8(new AbstractC18280vF() { // from class: X.3nN
                    {
                        super("startEmojiCompatFontDownload", 395, 5, false, false);
                    }

                    @Override // X.AbstractC18280vF
                    public final void loggedRun() {
                        C2NX c2nx2 = C2NX.this;
                        CallerContext callerContext = C2NX.A08;
                        C2UX.A00().CNc(c2nx2.A01, c2nx2.A04, 5);
                    }
                });
                interfaceC24811Iz2.Ep8(new AbstractC18280vF() { // from class: X.3nO
                    {
                        super("exposePeopleTaggingAutocompleteFix", 674, 5, false, false);
                    }

                    @Override // X.AbstractC18280vF
                    public final void loggedRun() {
                        C2NX c2nx2 = C2NX.this;
                        CallerContext callerContext = C2NX.A08;
                        C18U.A06(C06090Tz.A05, c2nx2.A04, 36310546873647288L);
                    }
                });
                AbstractC18280vF abstractC18280vF3 = new AbstractC18280vF() { // from class: X.3nP
                    {
                        super("maybePrefetchVideoTabFeed", 678, 5, false, false);
                    }

                    @Override // X.AbstractC18280vF
                    public final void loggedRun() {
                        C2NX c2nx2 = C2NX.this;
                        CallerContext callerContext = C2NX.A08;
                        UserSession userSession2 = c2nx2.A04;
                        if (!C18U.A06(C06090Tz.A05, userSession2, 36328057458343019L)) {
                            C77453dV.A05.A09(userSession2, c2nx2.A01, ClipsPrefetchTriggerType.A05.A00);
                        }
                    }
                };
                if (!C18U.A06(c06090Tz2, userSession, 36316989325775629L)) {
                    if (C18U.A06(c06090Tz2, userSession, 36316989325644555L)) {
                        interfaceC24811Iz2.Ep8(abstractC18280vF3);
                    } else {
                        interfaceC24811Iz2.EpA(abstractC18280vF3);
                    }
                }
                if (C18U.A06(c06090Tz2, userSession, 36327516289383045L)) {
                    C39103HJb c39103HJb = new C39103HJb(c2nx);
                    if (C18U.A06(c06090Tz2, userSession, 36316989325710092L)) {
                        interfaceC24811Iz2.Ep8(c39103HJb);
                    } else {
                        interfaceC24811Iz2.EpA(c39103HJb);
                    }
                }
                interfaceC24811Iz2.Ep8(new AbstractC18280vF() { // from class: X.3nQ
                    {
                        super("fetchSessionSurveyEligibility", 708, 5, false, false);
                    }

                    @Override // X.AbstractC18280vF
                    public final void loggedRun() {
                        C2NX c2nx2 = C2NX.this;
                        CallerContext callerContext = C2NX.A08;
                        UserSession userSession2 = c2nx2.A04;
                        if (C18U.A06(C06090Tz.A05, userSession2, 36311388687172101L)) {
                            Context context = c2nx2.A01;
                            C14360o3.A0B(userSession2, 0);
                            C14360o3.A0B(context, 1);
                            final C2052096l c2052096l = (C2052096l) userSession2.A01(C2052096l.class, new C43208J8f(40, context.getApplicationContext(), userSession2));
                            if (AbstractC23021Ah.A00(c2052096l.A05).A01.getInt(MSV.A00(113), 0) == 1 && C2052096l.A00(c2052096l)) {
                                c2052096l.A00 = System.currentTimeMillis();
                                InterfaceC12870lZ interfaceC12870lZ = new InterfaceC12870lZ() { // from class: X.96m
                                    @Override // X.InterfaceC12870lZ
                                    public final void onAppBackgrounded() {
                                        int A03 = C0f9.A03(-836549613);
                                        boolean z3 = C218914p.A04;
                                        long currentTimeMillis = System.currentTimeMillis() - LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT;
                                        C2052096l c2052096l2 = C2052096l.this;
                                        long j = currentTimeMillis - c2052096l2.A00;
                                        UserSession userSession3 = c2052096l2.A05;
                                        if (j >= ((long) (1000.0d * C18U.A00(C06090Tz.A06, userSession3, 37155813617434638L))) && j <= TimeUnit.HOURS.toMillis(24L)) {
                                            C60898RbD c60898RbD = new C60898RbD(c2052096l2);
                                            String BdA = AbstractC11060iN.A00(userSession3).BdA();
                                            if (BdA != null && BdA.length() != 0) {
                                                ArrayList arrayList = new ArrayList();
                                                HashMap hashMap = C34H.A00;
                                                for (Map.Entry entry : hashMap.entrySet()) {
                                                    String str = (String) entry.getKey();
                                                    String str2 = (String) entry.getValue();
                                                    C2JO c2jo = new C2JO();
                                                    c2jo.A09(str, AbstractC111324zv.A00(846));
                                                    c2jo.A09(str2, AbstractC111324zv.A00(847));
                                                    arrayList.add(c2jo);
                                                }
                                                ImmutableList copyOf = ImmutableList.copyOf((Collection) arrayList);
                                                C14360o3.A07(copyOf);
                                                hashMap.clear();
                                                C2JM c2jm = new C2JM();
                                                C2JM c2jm2 = new C2JM();
                                                c2jm.A04(AbstractC65709Tsi.A02(42, 10, 99), BdA);
                                                c2jm.A04(AbstractC111324zv.A00(2578), "449092836056930");
                                                c2jm.A05("survey_context_data", copyOf);
                                                C2JQ c2jq = PandoGraphQLRequest.Companion;
                                                AbstractC40691uc.A01(userSession3).A06(new PandoGraphQLRequest(AbstractC40511uK.A00(), "SessionSurveyUriQuery", c2jm.getParamsCopy(), c2jm2.getParamsCopy(), C59809Qnx.class, false, null, 0, null, "ig_end_session_survey_uri_root_query", new ArrayList()), c60898RbD);
                                            } else {
                                                C0w9.A03(AbstractC58317Pt9.A00(967), "Pigeon session id is null");
                                            }
                                        }
                                        C0f9.A0A(-480622648, A03);
                                    }

                                    @Override // X.InterfaceC12870lZ
                                    public final void onAppForegrounded() {
                                        int A03 = C0f9.A03(-1231753962);
                                        C2052096l c2052096l2 = C2052096l.this;
                                        long currentTimeMillis = System.currentTimeMillis();
                                        c2052096l2.A00 = currentTimeMillis;
                                        long j = currentTimeMillis - AbstractC23021Ah.A00(c2052096l2.A05).A01.getLong(AbstractC58317Pt9.A00(307), 0L);
                                        if (c2052096l2.A03 && TimeUnit.MILLISECONDS.toMinutes(j) >= 5) {
                                            C1X8.A00().A03(null, AbstractC58317Pt9.A00(966), 0);
                                            c2052096l2.A03 = false;
                                        }
                                        C0f9.A0A(-1010960715, A03);
                                    }
                                };
                                c2052096l.A01 = interfaceC12870lZ;
                                C218914p.A03(EnumC220415e.A03, interfaceC12870lZ);
                            }
                        }
                    }
                });
                if (C18U.A06(c06090Tz2, userSession, 36316220528857248L)) {
                    interfaceC24811Iz2.Ep8(new AbstractC18280vF() { // from class: X.3nR
                        {
                            super("supInitializeConnection", 635062881, 5, false, false);
                        }

                        @Override // X.AbstractC18280vF
                        public final void loggedRun() {
                            C2NX c2nx2 = C2NX.this;
                            CallerContext callerContext = C2NX.A08;
                            Context context = c2nx2.A01;
                            UserSession userSession2 = c2nx2.A04;
                            C14360o3.A0B(context, 0);
                            C14360o3.A0B(userSession2, 1);
                            boolean A015 = AbstractC195888lY.A01(context.getApplicationContext(), userSession2);
                            C195988ln c195988ln = AbstractC195978lm.A02;
                            String A1D = AnonymousClass001.A1D("Start voltron download: ", A015);
                            String A002 = AbstractC111324zv.A00(3194);
                            c195988ln.A01(A002, A1D);
                            if (A015) {
                                OIB A003 = C37101o8.A00(AbstractC195888lY.A00());
                                Context applicationContext = context.getApplicationContext();
                                C14360o3.A07(applicationContext);
                                A003.A00(applicationContext, userSession2, AmB.A00, A002);
                            }
                        }
                    });
                }
                C1ZS c1zs = C1ZS.A01;
                Context context = c2nx.A01;
                if (c1zs.A00(context, userSession) != null && userSession.userId.equals(AbstractC19750y3.A01("stella_direct_shared_preference").getString("pairedIgUserId", null)) && C18U.A06(c06090Tz2, userSession, 36328233548987752L)) {
                    interfaceC24811Iz2.Ep8(new C52404NGz(c2nx));
                }
                interfaceC24811Iz2.Ep8(new AbstractC18280vF() { // from class: X.3nS
                    {
                        super("checkLocalRbsMediaInfo", 508125143, 5, false, false);
                    }

                    /* JADX WARN: Type inference failed for: r0v50, types: [X.0bW, java.lang.Object] */
                    /* JADX WARN: Type inference failed for: r0v62, types: [X.0bW, java.lang.Object] */
                    @Override // X.AbstractC18280vF
                    public final void loggedRun() {
                        List<Medium> list;
                        List list2;
                        boolean z3;
                        AbstractC224309vG A002;
                        String A03;
                        List list3;
                        C72739XmB c72739XmB;
                        String str;
                        String str2;
                        String A003;
                        String str3;
                        ArrayList arrayList;
                        List A1Q;
                        C2NX c2nx2 = C2NX.this;
                        CallerContext callerContext = C2NX.A08;
                        Context context2 = c2nx2.A01;
                        UserSession userSession2 = c2nx2.A04;
                        C14360o3.A0B(context2, 0);
                        C14360o3.A0B(userSession2, 1);
                        C2052396o c2052396o = (C2052396o) userSession2.A01(C2052396o.class, new C57532Pg6(8, context2, userSession2));
                        long currentTimeMillis = System.currentTimeMillis();
                        Context context3 = c2052396o.A00;
                        if (AbstractC93174Ft.A03(context3)) {
                            UserSession userSession3 = c2052396o.A01;
                            InterfaceC19630xq interfaceC19630xq = AbstractC23021Ah.A00(userSession3).A01;
                            String A004 = AbstractC111324zv.A00(2948);
                            if (interfaceC19630xq.getLong(A004, 0L) == 0 || AbstractC23021Ah.A00(userSession3).A01.getLong(A004, 0L) + C18U.A01(C06090Tz.A06, userSession3, 36601393469067453L) < currentTimeMillis) {
                                C06090Tz c06090Tz3 = C06090Tz.A05;
                                if (C18U.A06(c06090Tz3, userSession3, 36319918492229472L)) {
                                    try {
                                        C14360o3.A0B(context3, 0);
                                        list2 = C16930sl.A00;
                                        List list4 = list2;
                                        try {
                                            ContentResolver contentResolver = context3.getContentResolver();
                                            C14360o3.A07(contentResolver);
                                            list4 = C8a1.A02(contentResolver, "Meta View", true);
                                        } catch (SecurityException unused) {
                                        }
                                        List list5 = list2;
                                        try {
                                            ContentResolver contentResolver2 = context3.getContentResolver();
                                            C14360o3.A07(contentResolver2);
                                            list5 = C8a1.A02(contentResolver2, AbstractC43591JPw.A00(684), true);
                                        } catch (SecurityException unused2) {
                                        }
                                        list = AbstractC001800i.A0S(list5, list4);
                                    } catch (IllegalArgumentException e) {
                                        C0f5 AEp = C18950wb.A01.AEp("Rbs Media Failure", 20134884);
                                        AEp.ERI(e);
                                        AEp.report();
                                        list = C16930sl.A00;
                                        list2 = list;
                                    }
                                    InterfaceC19610xo ARD = AbstractC23021Ah.A00(userSession3).A01.ARD();
                                    ARD.E7G(A004, currentTimeMillis);
                                    ARD.apply();
                                    if (!list.isEmpty()) {
                                        C18920wW A02 = AbstractC12220kQ.A02(userSession3);
                                        C12180kM c12180kM = A02.A00;
                                        InterfaceC02590Ai A005 = A02.A00(c12180kM, "rayban_stories_automontage_eligibility");
                                        if (C18U.A06(c06090Tz3, userSession3, 36319918492295009L)) {
                                            C14360o3.A0B(userSession3, 1);
                                            C18920wW A022 = AbstractC12220kQ.A02(userSession3);
                                            C12180kM c12180kM2 = A022.A00;
                                            InterfaceC02590Ai A006 = A022.A00(c12180kM2, "ig_wearable_automontage_am_found");
                                            InterfaceC02590Ai A007 = A022.A00(c12180kM2, "ig_wearable_automontage_am_not_found");
                                            InterfaceC02590Ai A008 = A022.A00(c12180kM2, "ig_wearable_automontage_clips_found");
                                            InterfaceC02590Ai A009 = A022.A00(c12180kM2, "ig_wearable_automontage_clips_not_found");
                                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                                            Iterator it = list.iterator();
                                            while (true) {
                                                if (!it.hasNext()) {
                                                    break;
                                                }
                                                Medium medium = (Medium) it.next();
                                                if (medium.Cff()) {
                                                    String str4 = medium.A0X;
                                                    C14360o3.A0B(str4, 0);
                                                    android.net.Uri A0010 = AbstractC08820cl.A00(new Object(), str4);
                                                    if (A0010 != null && (A003 = C9NG.A00(A0010)) != null) {
                                                        List<String> A0R = AbstractC001900j.A0R(A003, new String[]{"&"}, 0);
                                                        int A0L = AbstractC16850sd.A0L(AbstractC06950Ym.A1E(A0R, 10));
                                                        if (A0L < 16) {
                                                            A0L = 16;
                                                        }
                                                        LinkedHashMap linkedHashMap2 = new LinkedHashMap(A0L);
                                                        for (String str5 : A0R) {
                                                            if (AbstractC001900j.A0R(str5, new String[]{InbandTelemetryBweEstimate.KEY_VALUE_SEPARATOR}, 0).size() == 2) {
                                                                A1Q = AbstractC001900j.A0R(str5, new String[]{InbandTelemetryBweEstimate.KEY_VALUE_SEPARATOR}, 0);
                                                            } else {
                                                                A1Q = AbstractC16960so.A1Q("", "");
                                                            }
                                                            linkedHashMap2.put(A1Q.get(0), A1Q.get(1));
                                                        }
                                                        if (linkedHashMap2.containsKey("media_type") && (str3 = (String) linkedHashMap2.get("media_type")) != null && str3.equalsIgnoreCase("AUTO_MONTAGE")) {
                                                            String str6 = (String) linkedHashMap2.get("montage_source_media_ids");
                                                            ArrayList arrayList2 = null;
                                                            if (str6 != null) {
                                                                List A0R2 = AbstractC001900j.A0R(str6, new String[]{InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1}, 0);
                                                                arrayList = new ArrayList();
                                                                for (Object obj : A0R2) {
                                                                    if (!AbstractC001900j.A0T((String) obj)) {
                                                                        arrayList.add(obj);
                                                                    }
                                                                }
                                                            } else {
                                                                arrayList = null;
                                                            }
                                                            String str7 = (String) linkedHashMap2.get("highlight_start_ms");
                                                            if (str7 != null) {
                                                                List A0R3 = AbstractC001900j.A0R(str7, new String[]{InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1}, 0);
                                                                arrayList2 = new ArrayList();
                                                                for (Object obj2 : A0R3) {
                                                                    if (!AbstractC001900j.A0T((String) obj2)) {
                                                                        arrayList2.add(obj2);
                                                                    }
                                                                }
                                                            }
                                                            if (arrayList != null && arrayList2 != null && arrayList.size() == arrayList2.size()) {
                                                                int size = arrayList.size();
                                                                for (int i2 = 0; i2 < size; i2++) {
                                                                    linkedHashMap.put(arrayList.get(i2), Integer.valueOf((int) Float.parseFloat((String) arrayList2.get(i2))));
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            if (linkedHashMap.isEmpty()) {
                                                A007.Cht();
                                                Collection values = linkedHashMap.values();
                                                C14360o3.A07(values);
                                                c72739XmB = new C72739XmB(list2, AbstractC001800i.A0a(values));
                                            } else {
                                                A006.Cht();
                                                java.util.Set keySet = linkedHashMap.keySet();
                                                C14360o3.A07(keySet);
                                                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                                                for (Medium medium2 : list) {
                                                    if (medium2.Cff()) {
                                                        String str8 = medium2.A0X;
                                                        C14360o3.A0B(str8, 0);
                                                        android.net.Uri A0011 = AbstractC08820cl.A00(new Object(), str8);
                                                        if (A0011 != null) {
                                                            str2 = C9NG.A00(A0011);
                                                        } else {
                                                            str2 = null;
                                                        }
                                                        str = AbstractC178007vZ.A04(str2);
                                                    } else if (medium2.A05()) {
                                                        String str9 = medium2.A0X;
                                                        C14360o3.A0B(str9, 0);
                                                        str = C197098ne.A05(str9);
                                                    } else {
                                                        str = "";
                                                    }
                                                    if ((!AbstractC001900j.A0T(str)) && keySet.contains(str) && !linkedHashMap3.containsKey(str)) {
                                                        linkedHashMap3.put(str, medium2);
                                                    }
                                                }
                                                ArrayList arrayList3 = new ArrayList();
                                                for (Object obj3 : keySet) {
                                                    C14360o3.A07(obj3);
                                                    Object obj4 = linkedHashMap3.get(obj3);
                                                    if (obj4 != null) {
                                                        arrayList3.add(obj4);
                                                    }
                                                }
                                                if (keySet.size() == arrayList3.size() && arrayList3.size() == linkedHashMap.values().size()) {
                                                    A008.Cht();
                                                    list3 = arrayList3;
                                                } else {
                                                    A009.Cht();
                                                    list3 = list2;
                                                }
                                                Collection values2 = linkedHashMap.values();
                                                C14360o3.A07(values2);
                                                c72739XmB = new C72739XmB(list3, AbstractC001800i.A0a(values2));
                                            }
                                            z3 = Boolean.valueOf(!c72739XmB.A00.isEmpty());
                                        } else {
                                            z3 = false;
                                        }
                                        A005.A7v("has_eligible_auto_montage", z3);
                                        A005.Cht();
                                        if (C18U.A06(c06090Tz3, userSession3, 36326601461348333L)) {
                                            InterfaceC02590Ai A0012 = A02.A00(c12180kM, "ig_smart_glasses_detected");
                                            int min = Math.min(10, list.size());
                                            ArrayList arrayList4 = new ArrayList();
                                            for (int i3 = 0; i3 < min; i3++) {
                                                Medium medium3 = (Medium) AbstractC001800i.A0O(list, i3);
                                                if (medium3 != null && (A002 = AbstractC178007vZ.A00(null, userSession3, medium3.A0X, medium3.A05())) != null && (A03 = A002.A03()) != null && !arrayList4.contains(A03)) {
                                                    arrayList4.add(A03);
                                                }
                                            }
                                            if ((!arrayList4.isEmpty()) && A0012.isSampled()) {
                                                A0012.AAk("smart_glasses_models", arrayList4);
                                                A0012.Cht();
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                });
                interfaceC24811Iz2.Ep8(new AbstractC18280vF() { // from class: X.3nT
                    {
                        super("fetchFacebookCrosspostingSettingFromServer", 763, 5, false, false);
                    }

                    @Override // X.AbstractC18280vF
                    public final void loggedRun() {
                        final C2NX c2nx2 = C2NX.this;
                        CallerContext callerContext = C2NX.A08;
                        UserSession userSession2 = c2nx2.A04;
                        new C196188m9(userSession2).A06("app_start", true);
                        boolean A062 = C18U.A06(C06090Tz.A05, userSession2, 36329629413294537L);
                        C196058lv A002 = C196068lw.A00(userSession2);
                        if (A062) {
                            A002.A01(C2NX.A08, new InterfaceC196338mP() { // from class: X.96q
                                @Override // X.InterfaceC196338mP
                                public final /* synthetic */ void DeN() {
                                }

                                @Override // X.InterfaceC196338mP
                                public final void DeO() {
                                    C131975xX c131975xX = C131965xW.A05;
                                    C2NX c2nx3 = C2NX.this;
                                    CallerContext callerContext2 = C2NX.A08;
                                    UserSession userSession3 = c2nx3.A04;
                                    C14360o3.A0B(userSession3, 0);
                                    if (C131975xX.A01(userSession3)) {
                                        C131975xX.A00(userSession3).A08(null);
                                    }
                                    AbstractC132005xa.A00(userSession3).A01(null);
                                }
                            }, "app_start");
                            return;
                        }
                        A002.A01(C2NX.A08, null, "app_start");
                        C131975xX c131975xX = C131965xW.A05;
                        C14360o3.A0B(userSession2, 0);
                        if (C131975xX.A01(userSession2)) {
                            C131975xX.A00(userSession2).A08(null);
                        }
                        AbstractC132005xa.A00(userSession2).A01(null);
                    }
                });
                final int A002 = c2nx.A00();
                interfaceC24811Iz2.Ep8(new AbstractC18280vF(A002) { // from class: X.3nU
                    @Override // X.AbstractC18280vF
                    public final void loggedRun() {
                        C2NX c2nx2 = C2NX.this;
                        CallerContext callerContext = C2NX.A08;
                        UserSession userSession2 = c2nx2.A04;
                        C14360o3.A0B(userSession2, 0);
                        CXPNoticeStateRepository cXPNoticeStateRepository = new CXPNoticeStateRepository(userSession2, C05F.A00);
                        LinkedHashMap A003 = C5SP.A00(userSession2);
                        if (cXPNoticeStateRepository.A04(A003)) {
                            CXPNoticeStateApi cXPNoticeStateApi = cXPNoticeStateRepository.A01;
                            C9E2 c9e2 = new C9E2(cXPNoticeStateRepository, 3);
                            C1GJ.A06(AnonymousClass963.A00(cXPNoticeStateApi.A00.A03(CXPNoticeStateApi.A00(CXPNoticeStateApi.A01(A003))).A02(new C23660Adv(cXPNoticeStateApi, A003, c9e2), 1158112076, 3, true, true)), 1158112076, 3, true, true);
                        }
                    }
                });
                final int A003 = c2nx.A00();
                interfaceC24811Iz2.Ep8(new AbstractC18280vF(A003) { // from class: X.3nV
                    @Override // X.AbstractC18280vF
                    public final void loggedRun() {
                        C2NX c2nx2 = C2NX.this;
                        CallerContext callerContext = C2NX.A08;
                        C2052496p.A01(c2nx2.A04);
                    }
                });
                final int A004 = AbstractC54472f1.A00(c2nx.A00());
                final boolean A04 = AbstractC54472f1.A04(18301933687214340L, true);
                final boolean A042 = AbstractC54472f1.A04(18301933687279877L, true);
                interfaceC24811Iz2.Ep8(new AbstractC18280vF(A004, A04, A042) { // from class: X.3nW
                    @Override // X.AbstractC18280vF
                    public final void loggedRun() {
                        final C2NX c2nx2 = C2NX.this;
                        CallerContext callerContext = C2NX.A08;
                        UserSession userSession2 = c2nx2.A04;
                        C2Ne A005 = AbstractC49092Nc.A00(userSession2);
                        CallerContext callerContext2 = C2NX.A08;
                        A005.A02(callerContext2, new InterfaceC196048lu() { // from class: X.96s
                            @Override // X.InterfaceC196048lu
                            public final void onFailure() {
                            }

                            /* JADX WARN: Multi-variable type inference failed */
                            /* JADX WARN: Type inference failed for: r0v2, types: [X.1vw, java.lang.Object] */
                            @Override // X.InterfaceC196048lu
                            public final void onSuccess() {
                                C2NX c2nx3 = C2NX.this;
                                CallerContext callerContext3 = C2NX.A08;
                                UserSession userSession3 = c2nx3.A04;
                                AbstractC54332en.A00(userSession3).A04(EnumC54222eY.A0Z);
                                C41451vu.A01.E4s(new Object());
                                AbstractC08690cX.A00(userSession3);
                            }
                        }, "app_start");
                        C40921uz A006 = AbstractC40751ui.A00(userSession2);
                        if (AbstractC41611wB.A02(A006.A06)) {
                            C14360o3.A0B(userSession2, 0);
                            if (C18U.A06(C06090Tz.A05, userSession2, 36319815413407422L)) {
                                A006.A0K(callerContext2, null, "app_start", true, false);
                            }
                        }
                    }
                });
                interfaceC24811Iz2.Ep8(new AbstractC18280vF() { // from class: X.3nX
                    {
                        super("FxStoreFamilyDeviceIdInSharedPrefs", 668963102, 3, false, false);
                    }

                    @Override // X.AbstractC18280vF
                    public final void loggedRun() {
                        String str;
                        C2NX c2nx2 = C2NX.this;
                        CallerContext callerContext = C2NX.A08;
                        C1UM A005 = C1U4.A00(c2nx2.A01).A00("FX_CACHE_FDID_STORE");
                        C19U A015 = C11830jh.A04.A01(c2nx2.A04).A01(C19T.A2K);
                        if (A015 != null) {
                            str = A015.A01;
                        } else {
                            str = "";
                        }
                        C1ZT AR9 = A005.AR9();
                        AR9.A09("fdid", str);
                        AR9.A0B();
                    }
                });
                final int A005 = AbstractC54472f1.A00(c2nx.A00());
                final boolean A043 = AbstractC54472f1.A04(18301933687214340L, true);
                final boolean A044 = AbstractC54472f1.A04(18301933687279877L, true);
                interfaceC24811Iz2.Ep8(new AbstractC18280vF(A005, A043, A044) { // from class: X.3nY
                    @Override // X.AbstractC18280vF
                    public final void loggedRun() {
                        C218914p c218914p = C218914p.A08;
                        C2NX c2nx2 = C2NX.this;
                        CallerContext callerContext = C2NX.A08;
                        C218914p.A04(EnumC220415e.A02, c2nx2.A05, false, false);
                    }
                });
                if (C18U.A06(c06090Tz2, userSession, 36322203414833203L)) {
                    final int A006 = AbstractC54472f1.A00(c2nx.A00());
                    final boolean A045 = AbstractC54472f1.A04(18301933687214340L, true);
                    final boolean A046 = AbstractC54472f1.A04(18301933687279877L, true);
                    interfaceC24811Iz2.Ep8(new AbstractC18280vF(A006, A045, A046) { // from class: X.9je
                        @Override // X.AbstractC18280vF
                        public final void loggedRun() {
                            C2NX c2nx2 = C2NX.this;
                            CallerContext callerContext = C2NX.A08;
                            AbstractC49092Nc.A00(c2nx2.A04);
                            boolean z3 = C218914p.A04;
                            C218914p.A04(EnumC220415e.A02, new C23626AdL(c2nx2), false, false);
                        }
                    });
                }
                interfaceC24811Iz2.Ep8(new AbstractC18280vF() { // from class: X.3nZ
                    {
                        super("cpdp_mvp_prefetcher", 2041201927, 5, true, false);
                    }

                    @Override // X.AbstractC18280vF
                    public final void loggedRun() {
                        C2NX c2nx2 = C2NX.this;
                        CallerContext callerContext = C2NX.A08;
                        UserSession userSession2 = c2nx2.A04;
                        C14360o3.A0B(userSession2, 1);
                        if (C18U.A06(C06090Tz.A05, userSession2, 36312174666253251L)) {
                            AbstractC40565Hyl.A00(userSession2, null);
                        }
                    }
                });
                if (C18U.A06(c06090Tz2, userSession, 36324144740183989L)) {
                    interfaceC24811Iz2.Ep8(new AbstractC18280vF() { // from class: X.50D
                        {
                            super("igds_ui_tracking_logging", 1635172738, 3, false, true);
                        }

                        @Override // X.AbstractC18280vF
                        public final void loggedRun() {
                            C2NX c2nx2 = C2NX.this;
                            CallerContext callerContext = C2NX.A08;
                            UserSession userSession2 = c2nx2.A04;
                            C14360o3.A0B(userSession2, 0);
                            ((C56057OuY) userSession2.A01(C56057OuY.class, new C57241PbP(userSession2, 24))).onAppForegrounded();
                            C218914p c218914p = C218914p.A08;
                            C218914p.A03(EnumC220415e.A03, new C56055OuW(c2nx2));
                        }
                    });
                }
                interfaceC24811Iz2.Ep8(new AbstractC18280vF() { // from class: X.3na
                    {
                        super("setupLocalNotifications", 416812969, 5, false, false);
                    }

                    @Override // X.AbstractC18280vF
                    public final void loggedRun() {
                        C2NX c2nx2 = C2NX.this;
                        CallerContext callerContext = C2NX.A08;
                        Context context2 = c2nx2.A01;
                        AnonymousClass970 anonymousClass970 = new AnonymousClass970(context2);
                        UserSession userSession2 = c2nx2.A04;
                        C14360o3.A0B(context2, 0);
                        C14360o3.A0B(userSession2, 1);
                        final AnonymousClass971 anonymousClass971 = (AnonymousClass971) userSession2.A01(AnonymousClass971.class, new C29900DGo(34, context2, userSession2, anonymousClass970));
                        if (AnonymousClass971.A01(anonymousClass971)) {
                            InterfaceC12870lZ interfaceC12870lZ = new InterfaceC12870lZ() { // from class: X.972
                                @Override // X.InterfaceC12870lZ
                                public final void onAppBackgrounded() {
                                    int A03 = C0f9.A03(960751612);
                                    AnonymousClass971 anonymousClass9712 = AnonymousClass971.this;
                                    ESZ esz = new ESZ(anonymousClass9712, new C206919Dw(anonymousClass9712, 19));
                                    C1ON A007 = FXB.A00(anonymousClass9712.A03, AbstractC111324zv.A00(2885));
                                    A007.A00 = esz;
                                    C1GJ.A03(A007);
                                    C0f9.A0A(-186478108, A03);
                                }

                                @Override // X.InterfaceC12870lZ
                                public final void onAppForegrounded() {
                                    int A03 = C0f9.A03(-587697691);
                                    AnonymousClass971 anonymousClass9712 = AnonymousClass971.this;
                                    PendingIntent A007 = AnonymousClass971.A00(anonymousClass9712);
                                    if (A007 != null) {
                                        anonymousClass9712.A01.cancel(A007);
                                    }
                                    C0f9.A0A(2017332168, A03);
                                }
                            };
                            anonymousClass971.A00 = interfaceC12870lZ;
                            C218914p.A03(EnumC220415e.A03, interfaceC12870lZ);
                        }
                    }
                });
                interfaceC24811Iz2.Ep8(new AbstractC18280vF() { // from class: X.3nb
                    {
                        super("initUiiDetector", 1241229546, 5, false, true);
                    }

                    @Override // X.AbstractC18280vF
                    public final void loggedRun() {
                        C2NX c2nx2 = C2NX.this;
                        CallerContext callerContext = C2NX.A08;
                        UserSession userSession2 = c2nx2.A04;
                        C14360o3.A0B(userSession2, 1);
                        C06090Tz c06090Tz3 = C06090Tz.A05;
                        if (C18U.A06(c06090Tz3, userSession2, 36314962100095919L)) {
                            Object obj = new Object();
                            synchronized (AbstractC08000bK.class) {
                                AbstractC08000bK.A00.add(obj);
                            }
                            AbstractC41301vf.A00(userSession2);
                            Object obj2 = new Object();
                            int A015 = (int) C18U.A01(c06090Tz3, userSession2, 36596437076871667L);
                            boolean A062 = C18U.A06(c06090Tz3, userSession2, 36314962100226992L);
                            List singletonList = Collections.singletonList(obj2);
                            C14360o3.A07(singletonList);
                            C62666SLc c62666SLc = new C62666SLc(AbstractC12220kQ.A02(userSession2), C18950wb.A01, A062);
                            Arrays.copyOf(new Object[]{Integer.valueOf(singletonList.size()), Integer.valueOf(A015)}, 2);
                            C62899SWf c62899SWf = new C62899SWf(c62666SLc, singletonList, A015);
                            synchronized (S8h.A01) {
                                S8h.A00 = c62899SWf;
                            }
                        }
                    }
                });
                interfaceC24811Iz2.Ep8(new AbstractC18280vF() { // from class: X.3nc
                    {
                        super("initCasdDetector", 1606061422);
                    }

                    /* JADX WARN: Type inference failed for: r9v0, types: [X.973, X.0Uu, java.lang.Object] */
                    @Override // X.AbstractC18280vF
                    public final void loggedRun() {
                        int i2;
                        C06260Ur[] c06260UrArr;
                        int i3;
                        C2NX c2nx2 = C2NX.this;
                        CallerContext callerContext = C2NX.A08;
                        UserSession userSession2 = c2nx2.A04;
                        C14360o3.A0B(userSession2, 1);
                        C06090Tz c06090Tz3 = C06090Tz.A05;
                        if (C18U.A06(c06090Tz3, userSession2, 36314962100030382L)) {
                            i2 = (int) C18U.A01(c06090Tz3, userSession2, 36596437076675058L);
                        } else {
                            i2 = 0;
                        }
                        C18950wb c18950wb = C18950wb.A01;
                        ?? obj = new Object();
                        obj.A00 = c18950wb;
                        C06250Uq c06250Uq = new C06250Uq(obj, i2);
                        synchronized (C06280Ut.class) {
                            C06280Ut.A01 = c06250Uq;
                            c06260UrArr = C06280Ut.A02;
                            i3 = C06280Ut.A00;
                            C06280Ut.A02 = null;
                        }
                        if (i2 > 0 && c06260UrArr != null) {
                            int length = c06260UrArr.length;
                            int min = Math.min(i3, length);
                            for (int i4 = 0; i4 < min; i4++) {
                                C06260Ur c06260Ur = c06260UrArr[i4];
                                c06250Uq.A00(c06260Ur.A02, c06260Ur.A00, c06260Ur.A01);
                            }
                            if (min < i3) {
                                C0f5 AEp = obj.A00.AEp("content_resolver_dropped", 817892585);
                                AEp.ABU("early_calls_count", i3);
                                AEp.ABU("buffer_size", length);
                                AEp.report();
                            }
                        }
                    }
                });
                interfaceC24811Iz2.Ep8(new AbstractC18280vF() { // from class: X.3nd
                    {
                        super("initializeRiskyStartupConfig", 1053074567, 5, false, false);
                    }

                    @Override // X.AbstractC18280vF
                    public final void loggedRun() {
                        C2NX c2nx2 = C2NX.this;
                        CallerContext callerContext = C2NX.A08;
                        Context context2 = c2nx2.A01;
                        UserSession userSession2 = c2nx2.A04;
                        C14360o3.A0B(context2, 1);
                        C14360o3.A0B(userSession2, 2);
                        C17050sx A015 = AbstractC09440dt.A01(new C206859Dq(userSession2, 4));
                        boolean z3 = ((AnonymousClass974) A015.getValue()).A00;
                        int i2 = AnonymousClass976.A00;
                        if (28 == i2 || z3) {
                            C0JJ c0jj = new C0JJ();
                            boolean z4 = ((AnonymousClass974) A015.getValue()).A00;
                            if (28 - i2 == 0 || z4) {
                                c0jj.A1D = ((AnonymousClass974) A015.getValue()).A01;
                                c0jj.A1E = ((AnonymousClass974) A015.getValue()).A02;
                            }
                            if (!c0jj.equals(C0JJ.A2c)) {
                                try {
                                    DataOutputStream dataOutputStream = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(context2.getFileStreamPath("risky_startup_config"), false)));
                                    try {
                                        dataOutputStream.writeBoolean(c0jj.A18);
                                        dataOutputStream.writeBoolean(c0jj.A0z);
                                        dataOutputStream.writeBoolean(c0jj.A10);
                                        dataOutputStream.writeBoolean(c0jj.A0y);
                                        dataOutputStream.writeBoolean(c0jj.A0v);
                                        dataOutputStream.writeInt(c0jj.A0E);
                                        dataOutputStream.writeBoolean(c0jj.A0w);
                                        dataOutputStream.writeInt(c0jj.A0F);
                                        dataOutputStream.writeBoolean(c0jj.A0x);
                                        dataOutputStream.writeInt(c0jj.A0G);
                                        dataOutputStream.writeBoolean(c0jj.A2b);
                                        dataOutputStream.writeInt(c0jj.A0n);
                                        dataOutputStream.writeBoolean(c0jj.A28);
                                        dataOutputStream.writeInt(c0jj.A0X);
                                        dataOutputStream.writeBoolean(c0jj.A2F);
                                        dataOutputStream.writeInt(c0jj.A0b);
                                        dataOutputStream.writeBoolean(c0jj.A1G);
                                        dataOutputStream.writeInt(c0jj.A0O);
                                        dataOutputStream.writeBoolean(c0jj.A0u);
                                        dataOutputStream.writeInt(c0jj.A0D);
                                        dataOutputStream.writeBoolean(c0jj.A2W);
                                        dataOutputStream.writeBoolean(c0jj.A2V);
                                        dataOutputStream.writeBoolean(c0jj.A17);
                                        dataOutputStream.writeBoolean(c0jj.A16);
                                        dataOutputStream.writeBoolean(c0jj.A2T);
                                        dataOutputStream.writeBoolean(c0jj.A2J);
                                        dataOutputStream.writeBoolean(c0jj.A2P);
                                        dataOutputStream.writeInt(c0jj.A0k);
                                        dataOutputStream.writeBoolean(c0jj.A2S);
                                        dataOutputStream.writeInt(c0jj.A0l);
                                        dataOutputStream.writeBoolean(c0jj.A2K);
                                        dataOutputStream.writeInt(c0jj.A0f);
                                        dataOutputStream.writeBoolean(c0jj.A2N);
                                        dataOutputStream.writeInt(c0jj.A0i);
                                        dataOutputStream.writeBoolean(c0jj.A2M);
                                        dataOutputStream.writeInt(c0jj.A0h);
                                        dataOutputStream.writeBoolean(c0jj.A2O);
                                        dataOutputStream.writeInt(c0jj.A0j);
                                        dataOutputStream.writeBoolean(c0jj.A2L);
                                        dataOutputStream.writeInt(c0jj.A0g);
                                        dataOutputStream.writeBoolean(c0jj.A2R);
                                        dataOutputStream.writeBoolean(c0jj.A2Q);
                                        dataOutputStream.writeBoolean(c0jj.A2I);
                                        dataOutputStream.writeBoolean(c0jj.A1g);
                                        dataOutputStream.writeDouble(c0jj.A01);
                                        dataOutputStream.writeDouble(c0jj.A02);
                                        dataOutputStream.writeDouble(c0jj.A03);
                                        dataOutputStream.writeDouble(c0jj.A09);
                                        dataOutputStream.writeDouble(c0jj.A07);
                                        dataOutputStream.writeDouble(c0jj.A08);
                                        dataOutputStream.writeDouble(c0jj.A04);
                                        dataOutputStream.writeDouble(c0jj.A00);
                                        dataOutputStream.writeBoolean(c0jj.A19);
                                        dataOutputStream.writeBoolean(c0jj.A1b);
                                        dataOutputStream.writeBoolean(c0jj.A1f);
                                        dataOutputStream.writeBoolean(c0jj.A2X);
                                        dataOutputStream.writeBoolean(c0jj.A1K);
                                        dataOutputStream.writeBoolean(c0jj.A1Z);
                                        dataOutputStream.writeBoolean(c0jj.A1j);
                                        dataOutputStream.writeBoolean(c0jj.A1W);
                                        dataOutputStream.writeBoolean(c0jj.A1X);
                                        dataOutputStream.writeBoolean(c0jj.A1O);
                                        dataOutputStream.writeBoolean(c0jj.A1V);
                                        dataOutputStream.writeBoolean(c0jj.A1h);
                                        dataOutputStream.writeBoolean(c0jj.A1I);
                                        dataOutputStream.writeBoolean(c0jj.A1c);
                                        dataOutputStream.writeBoolean(c0jj.A1l);
                                        dataOutputStream.writeBoolean(c0jj.A1Y);
                                        dataOutputStream.writeBoolean(c0jj.A1k);
                                        dataOutputStream.writeBoolean(c0jj.A1J);
                                        dataOutputStream.writeBoolean(c0jj.A1e);
                                        dataOutputStream.writeBoolean(c0jj.A1m);
                                        dataOutputStream.writeDouble(c0jj.A05);
                                        dataOutputStream.writeBoolean(c0jj.A1d);
                                        dataOutputStream.writeInt(c0jj.A0P);
                                        dataOutputStream.writeInt(c0jj.A0Q);
                                        dataOutputStream.writeBoolean(c0jj.A1U);
                                        dataOutputStream.writeBoolean(c0jj.A1M);
                                        dataOutputStream.writeBoolean(c0jj.A1L);
                                        dataOutputStream.writeBoolean(c0jj.A1P);
                                        dataOutputStream.writeBoolean(c0jj.A1S);
                                        dataOutputStream.writeBoolean(c0jj.A1a);
                                        dataOutputStream.writeBoolean(c0jj.A1R);
                                        dataOutputStream.writeBoolean(c0jj.A1Q);
                                        dataOutputStream.writeBoolean(c0jj.A1H);
                                        dataOutputStream.writeBoolean(c0jj.A1i);
                                        dataOutputStream.writeBoolean(c0jj.A1T);
                                        dataOutputStream.writeBoolean(c0jj.A1N);
                                        dataOutputStream.writeBoolean(c0jj.A2Y);
                                        dataOutputStream.writeDouble(c0jj.A06);
                                        dataOutputStream.writeBoolean(c0jj.A1v);
                                        dataOutputStream.writeInt(c0jj.A0S);
                                        dataOutputStream.writeBoolean(c0jj.A1t);
                                        dataOutputStream.writeInt(c0jj.A0R);
                                        dataOutputStream.writeBoolean(c0jj.A1u);
                                        dataOutputStream.writeLong(c0jj.A0o);
                                        dataOutputStream.writeBoolean(c0jj.A1s);
                                        dataOutputStream.writeFloat(c0jj.A0A);
                                        dataOutputStream.writeBoolean(c0jj.A1z);
                                        dataOutputStream.writeFloat(c0jj.A0C);
                                        dataOutputStream.writeBoolean(c0jj.A1y);
                                        dataOutputStream.writeFloat(c0jj.A0B);
                                        dataOutputStream.writeBoolean(c0jj.A1x);
                                        dataOutputStream.writeBoolean(c0jj.A1w);
                                        dataOutputStream.writeBoolean(c0jj.A2E);
                                        dataOutputStream.writeBoolean(c0jj.A2C);
                                        dataOutputStream.writeBoolean(c0jj.A2D);
                                        dataOutputStream.writeInt(c0jj.A0a);
                                        dataOutputStream.writeBoolean(c0jj.A2B);
                                        dataOutputStream.writeInt(c0jj.A0Z);
                                        dataOutputStream.writeBoolean(c0jj.A2A);
                                        dataOutputStream.writeInt(c0jj.A0Y);
                                        dataOutputStream.writeBoolean(c0jj.A0s);
                                        dataOutputStream.writeBoolean(c0jj.A29);
                                        dataOutputStream.writeBoolean(c0jj.A11);
                                        dataOutputStream.writeInt(c0jj.A0e);
                                        dataOutputStream.writeBoolean(c0jj.A12);
                                        dataOutputStream.writeInt(c0jj.A0m);
                                        dataOutputStream.writeBoolean(c0jj.A2U);
                                        dataOutputStream.writeBoolean(c0jj.A0p);
                                        dataOutputStream.writeBoolean(c0jj.A0t);
                                        dataOutputStream.writeBoolean(false);
                                        dataOutputStream.writeBoolean(false);
                                        dataOutputStream.writeBoolean(false);
                                        dataOutputStream.writeBoolean(c0jj.A14);
                                        dataOutputStream.writeBoolean(c0jj.A0r);
                                        dataOutputStream.writeBoolean(c0jj.A0q);
                                        dataOutputStream.writeBoolean(c0jj.A2G);
                                        dataOutputStream.writeInt(c0jj.A0c);
                                        dataOutputStream.writeBoolean(c0jj.A2H);
                                        dataOutputStream.writeInt(c0jj.A0d);
                                        dataOutputStream.writeBoolean(c0jj.A15);
                                        dataOutputStream.writeBoolean(c0jj.A2a);
                                        dataOutputStream.writeBoolean(false);
                                        dataOutputStream.writeBoolean(false);
                                        dataOutputStream.writeBoolean(false);
                                        dataOutputStream.writeBoolean(c0jj.A1F);
                                        dataOutputStream.writeInt(c0jj.A0N);
                                        dataOutputStream.writeInt(c0jj.A0H);
                                        dataOutputStream.writeInt(c0jj.A0M);
                                        dataOutputStream.writeInt(c0jj.A0I);
                                        dataOutputStream.writeInt(c0jj.A0J);
                                        dataOutputStream.writeInt(c0jj.A0L);
                                        dataOutputStream.writeInt(c0jj.A0K);
                                        dataOutputStream.writeBoolean(c0jj.A1A);
                                        dataOutputStream.writeBoolean(c0jj.A1B);
                                        dataOutputStream.writeInt(1000);
                                        dataOutputStream.writeBoolean(false);
                                        dataOutputStream.writeInt(4);
                                        dataOutputStream.writeInt(CameraVideoCapturer.CameraStatistics.CAMERA_OBSERVER_PERIOD_MS);
                                        dataOutputStream.writeInt(10);
                                        dataOutputStream.writeBoolean(true);
                                        dataOutputStream.writeInt(1000);
                                        dataOutputStream.writeBoolean(false);
                                        dataOutputStream.writeBoolean(c0jj.A13);
                                        dataOutputStream.writeBoolean(c0jj.A22);
                                        dataOutputStream.writeBoolean(c0jj.A20);
                                        dataOutputStream.writeBoolean(c0jj.A24);
                                        dataOutputStream.writeBoolean(c0jj.A26);
                                        dataOutputStream.writeInt(c0jj.A0W);
                                        dataOutputStream.writeInt(c0jj.A0U);
                                        dataOutputStream.writeBoolean(c0jj.A1C);
                                        dataOutputStream.writeBoolean(c0jj.A23);
                                        dataOutputStream.writeBoolean(c0jj.A21);
                                        dataOutputStream.writeBoolean(c0jj.A25);
                                        dataOutputStream.writeBoolean(c0jj.A27);
                                        dataOutputStream.writeInt(c0jj.A0V);
                                        dataOutputStream.writeInt(c0jj.A0T);
                                        dataOutputStream.writeBoolean(c0jj.A1n);
                                        dataOutputStream.writeBoolean(c0jj.A1o);
                                        dataOutputStream.writeBoolean(c0jj.A2Z);
                                        dataOutputStream.writeBoolean(c0jj.A1D);
                                        dataOutputStream.writeBoolean(c0jj.A1E);
                                        dataOutputStream.writeBoolean(false);
                                        dataOutputStream.writeBoolean(false);
                                        dataOutputStream.writeInt(42);
                                        dataOutputStream.writeBoolean(c0jj.A1q);
                                        dataOutputStream.writeBoolean(c0jj.A1r);
                                        dataOutputStream.writeBoolean(c0jj.A1p);
                                        dataOutputStream.close();
                                    } finally {
                                    }
                                } catch (IOException e) {
                                    android.util.Log.e("RiskyStartupConfig", String.format("Cannot write to file %s", "risky_startup_config"), e);
                                }
                            }
                            File A007 = C0eS.A00(context2, 1832390025);
                            A007.mkdirs();
                            if (A007.exists()) {
                                for (File file : A007.listFiles()) {
                                    if (!file.delete()) {
                                        android.util.Log.w("RiskyStartupConfig", String.format("Could not delete config read state: %s", file));
                                    }
                                }
                                if (!A007.delete()) {
                                    android.util.Log.w("RiskyStartupConfig", "Could not delete all risky start up config state");
                                }
                            }
                        }
                    }
                });
                final int A007 = c2nx.A00();
                interfaceC24811Iz2.Ep8(new AbstractC18280vF(A007) { // from class: X.3ne
                    @Override // X.AbstractC18280vF
                    public final void loggedRun() {
                        C2NX c2nx2 = C2NX.this;
                        CallerContext callerContext = C2NX.A08;
                        UserSession userSession2 = c2nx2.A04;
                        C20Y.A00(userSession2).A05(AnonymousClass975.A00, userSession2);
                    }
                });
                interfaceC24811Iz2.Ep8(new AbstractC18280vF() { // from class: X.3nf
                    {
                        super("initProfileInstaller", 609119367, 3, false, false);
                    }

                    @Override // X.AbstractC18280vF
                    public final void loggedRun() {
                        final C2NX c2nx2 = C2NX.this;
                        CallerContext callerContext = C2NX.A08;
                        if (C20150ym.A07(AbstractC20100yh.A00(2342159285573652699L))) {
                            UserSession userSession2 = c2nx2.A04;
                            C14360o3.A0B(userSession2, 0);
                            C18920wW A02 = AbstractC12220kQ.A02(userSession2);
                            InterfaceC02590Ai A008 = A02.A00(A02.A00, AbstractC111324zv.A00(2486));
                            A008.AAP(OptSvcAnalyticsStore.LOGGING_KEY_STEP, "profile_write_start");
                            A008.Cht();
                            C08D.A00(c2nx2.A01, new C08C() { // from class: X.977
                                @Override // X.C08C
                                public final void Dh5(int i2, Object obj) {
                                    String str;
                                    C2NX c2nx3 = C2NX.this;
                                    CallerContext callerContext2 = C2NX.A08;
                                    UserSession userSession3 = c2nx3.A04;
                                    C14360o3.A0B(userSession3, 0);
                                    C18920wW A022 = AbstractC12220kQ.A02(userSession3);
                                    InterfaceC02590Ai A009 = A022.A00(A022.A00, AbstractC111324zv.A00(2486));
                                    try {
                                        str = String.valueOf(obj);
                                    } catch (Exception unused) {
                                        str = null;
                                    }
                                    A009.AAP(OptSvcAnalyticsStore.LOGGING_KEY_STEP, "profile_write_result");
                                    A009.A9K("result_code", Long.valueOf(i2));
                                    A009.AAP("extra_result_data", str);
                                    A009.Cht();
                                }
                            }, new ExecutorC14110nb(609119367), false);
                        }
                    }
                });
                if (C18U.A06(c06090Tz2, userSession, 36317530490410322L)) {
                    abstractC18280vF = new AbstractC18280vF() { // from class: X.3ng
                        {
                            super("AttestationKeystorePeriodic", 1800671267, 3, true, true);
                        }

                        @Override // X.AbstractC18280vF
                        public final void loggedRun() {
                            C2NX c2nx2 = C2NX.this;
                            CallerContext callerContext = C2NX.A08;
                            AnonymousClass979 anonymousClass979 = AnonymousClass978.A00;
                            Context context2 = c2nx2.A01;
                            C14360o3.A0B(context2, 0);
                            try {
                                UserSession A082 = C023409i.A0A.A08(anonymousClass979);
                                C06090Tz c06090Tz3 = C06090Tz.A05;
                                boolean A062 = C18U.A06(c06090Tz3, A082, 2342160539704431956L);
                                long A015 = C18U.A01(c06090Tz3, A082, 36599005467315588L);
                                long A016 = C18U.A01(c06090Tz3, A082, 36599005467184514L);
                                long A017 = C18U.A01(c06090Tz3, A082, 36599005467250051L);
                                String A008 = AbstractC111324zv.A00(1680);
                                if (A015 < A016) {
                                    C0f5 AEp = C18950wb.A01.AEp(A008, 817903298);
                                    AEp.ABW("error", "Key attestation scheduling failed due to incorrect intervals");
                                    AEp.report();
                                    return;
                                }
                                try {
                                    C48362Kd c48362Kd = new C48362Kd();
                                    c48362Kd.A01(C05F.A01);
                                    c48362Kd.A03 = A062;
                                    C48562Ky A009 = c48362Kd.A00();
                                    TimeUnit timeUnit = TimeUnit.MINUTES;
                                    AbstractC48382Kf abstractC48382Kf = new AbstractC48382Kf(KeyAttestationWorker.class);
                                    abstractC48382Kf.A00.A01(timeUnit.toMillis(A015 * 60), timeUnit.toMillis(A016 * 60));
                                    abstractC48382Kf.A02(A017, timeUnit);
                                    abstractC48382Kf.A03(A009);
                                    AbstractC49102Nf.A00(abstractC48382Kf.A00(), C2L1.A00(context2), A008);
                                } catch (UnsupportedOperationException e) {
                                    C0f5 AEp2 = C18950wb.A01.AEp(A008, 817903298);
                                    AEp2.ABW("error", "Key attestation scheduling failed due to unsupported operation");
                                    AEp2.ERI(e);
                                    AEp2.report();
                                }
                            } catch (IllegalStateException unused) {
                            }
                        }
                    };
                } else {
                    abstractC18280vF = new AbstractC18280vF() { // from class: X.9jf
                        {
                            super("AttestationKeystorePeriodicCancel", 335424623, 3, false, true);
                        }

                        @Override // X.AbstractC18280vF
                        public final void loggedRun() {
                            C2NX c2nx2 = C2NX.this;
                            CallerContext callerContext = C2NX.A08;
                            Context context2 = c2nx2.A01;
                            C14360o3.A0B(context2, 0);
                            C2L1.A00(context2).A05(AbstractC111324zv.A00(1680));
                        }
                    };
                }
                interfaceC24811Iz2.Ep8(abstractC18280vF);
                if (C18U.A06(c06090Tz2, userSession, 36317839728055932L)) {
                    abstractC18280vF2 = new AbstractC18280vF() { // from class: X.3ni
                        {
                            super("AttestationPlayIntegrityPeriodic", 718484570, 3, true, true);
                        }

                        @Override // X.AbstractC18280vF
                        public final void loggedRun() {
                            C0f5 AEp;
                            String str;
                            C2NX c2nx2 = C2NX.this;
                            CallerContext callerContext = C2NX.A08;
                            C97B c97b = C97A.A00;
                            Context context2 = c2nx2.A01;
                            C14360o3.A0B(context2, 0);
                            try {
                                UserSession A082 = C023409i.A0A.A08(c97b);
                                C06090Tz c06090Tz3 = C06090Tz.A05;
                                boolean A062 = C18U.A06(c06090Tz3, A082, 2342160848942077566L);
                                long A015 = C18U.A01(c06090Tz3, A082, 36599314704961026L);
                                long A016 = C18U.A01(c06090Tz3, A082, 36599314704829952L);
                                long A017 = C18U.A01(c06090Tz3, A082, 36599314704895489L);
                                long A018 = C18U.A01(c06090Tz3, A082, 36599314705223172L);
                                long A019 = C18U.A01(c06090Tz3, A082, 36599314705157635L);
                                String A008 = AbstractC111324zv.A00(1715);
                                if (A015 < A016) {
                                    AEp = C18950wb.A01.AEp(A008, 817896512);
                                    str = "Play Integrity attestation scheduling failed due to incorrect intervals";
                                } else if (A019 < 10000) {
                                    AEp = C18950wb.A01.AEp(A008, 817896512);
                                    str = "Play Integrity attestation scheduling failed due to incorrect retry wait duration";
                                } else {
                                    try {
                                        C48362Kd c48362Kd = new C48362Kd();
                                        c48362Kd.A01(C05F.A01);
                                        c48362Kd.A03 = A062;
                                        C48562Ky A009 = c48362Kd.A00();
                                        TimeUnit timeUnit = TimeUnit.MINUTES;
                                        AbstractC48382Kf abstractC48382Kf = new AbstractC48382Kf(PlayIntegrityAttestationWorker.class);
                                        abstractC48382Kf.A00.A01(timeUnit.toMillis(A015 * 60), timeUnit.toMillis(A016 * 60));
                                        abstractC48382Kf.A02(A017, timeUnit);
                                        abstractC48382Kf.A03(A009);
                                        if (A018 > 0) {
                                            abstractC48382Kf.A04(C05F.A00, TimeUnit.MILLISECONDS, A019);
                                        }
                                        AbstractC49102Nf.A00(abstractC48382Kf.A00(), C2L1.A00(context2), A008);
                                        return;
                                    } catch (UnsupportedOperationException e) {
                                        C0f5 AEp2 = C18950wb.A01.AEp(A008, 817896512);
                                        AEp2.ABW("error", "Play Integrity attestation scheduling failed due to unsupported operation");
                                        AEp2.ERI(e);
                                        AEp2.report();
                                        return;
                                    }
                                }
                                AEp.ABW("error", str);
                                AEp.report();
                            } catch (IllegalStateException unused) {
                            }
                        }
                    };
                } else {
                    abstractC18280vF2 = new AbstractC18280vF() { // from class: X.9jg
                        {
                            super("AttestationPlayIntegrityPeriodicCancel", 2030374634, 3, false, true);
                        }

                        @Override // X.AbstractC18280vF
                        public final void loggedRun() {
                            C2NX c2nx2 = C2NX.this;
                            CallerContext callerContext = C2NX.A08;
                            Context context2 = c2nx2.A01;
                            C14360o3.A0B(context2, 0);
                            C2L1.A00(context2).A05(AbstractC111324zv.A00(1715));
                        }
                    };
                }
                interfaceC24811Iz2.Ep8(abstractC18280vF2);
                interfaceC24811Iz2.Ep8(new AbstractC18280vF() { // from class: X.3nj
                    {
                        super("SyncNotificationSettings", 378);
                    }

                    /* JADX WARN: Code restructure failed: missing block: B:4:0x0018, code lost:
                    
                        if (X.C18U.A06(X.C06090Tz.A05, r5, 36319437455891888L) == false) goto L6;
                     */
                    @Override // X.AbstractC18280vF
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final void loggedRun() {
                        /*
                            r8 = this;
                            X.2NX r1 = X.C2NX.this
                            com.facebook.common.callercontext.CallerContext r0 = X.C2NX.A08
                            android.content.Context r2 = r1.A01
                            com.instagram.common.session.UserSession r5 = r1.A04
                            r3 = 0
                            r7 = 1
                            if (r5 == 0) goto L1a
                            X.0Tz r4 = X.C06090Tz.A05
                            r0 = 36319437455891888(0x81085600001db0, double:3.0318967215175376E-306)
                            boolean r0 = X.C18U.A06(r4, r5, r0)
                            r6 = 1
                            if (r0 != 0) goto L1b
                        L1a:
                            r6 = 0
                        L1b:
                            boolean r0 = X.AbstractC14480oK.A01(r2)
                            r4 = 2
                            if (r0 == 0) goto L23
                            r4 = 1
                        L23:
                            X.1Ai r0 = X.AbstractC23021Ah.A00(r5)
                            X.0xq r1 = r0.A01
                            r0 = 113(0x71, float:1.58E-43)
                            java.lang.String r0 = X.MSV.A00(r0)
                            int r0 = r1.getInt(r0, r3)
                            if (r6 != 0) goto L39
                            if (r0 == 0) goto L39
                            if (r4 == r0) goto L77
                        L39:
                            X.1Ms r6 = new X.1Ms
                            r6.<init>(r5)
                            java.lang.Integer r0 = X.C05F.A01
                            r6.A09(r0)
                            java.lang.String r0 = "notifications/store_client_push_permissions/"
                            r6.A0B(r0)
                            if (r4 != r7) goto L4b
                            r3 = 1
                        L4b:
                            java.lang.String r0 = "enabled"
                            r6.A0I(r0, r3)
                            X.0qx r0 = X.C16030qx.A02
                            java.lang.String r3 = r0.A05(r2)
                            r2 = 0
                            r1 = 9
                            r0 = 92
                            java.lang.String r0 = X.AbstractC31186DnV.A01(r2, r1, r0)
                            r6.A9s(r0, r3)
                            java.lang.Class<X.1ul> r1 = X.C40781ul.class
                            java.lang.Class<X.2hA> r0 = X.C55702hA.class
                            r6.A0S(r1, r0)
                            X.1ON r1 = r6.A0N()
                            X.9gA r0 = new X.9gA
                            r0.<init>()
                            r1.A00 = r0
                            X.C1GJ.A03(r1)
                        L77:
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C83423nj.loggedRun():void");
                    }
                });
                interfaceC24811Iz2.Ep8(new AbstractC18280vF() { // from class: X.3nl
                    {
                        super("maybeFetchWhatsappBusinessInfo", 1481009581, 5, false, false);
                    }

                    @Override // X.AbstractC18280vF
                    public final void loggedRun() {
                        C2NX c2nx2 = C2NX.this;
                        CallerContext callerContext = C2NX.A08;
                        C97D.A00.A09(c2nx2.A04, C2NX.class);
                    }
                });
                interfaceC24811Iz2.Ep8(new AbstractC18280vF() { // from class: X.3nm
                    {
                        super("FetchBuildInfo", 2053690886, 5, false, false);
                    }

                    @Override // X.AbstractC18280vF
                    public final void loggedRun() {
                        C2NX c2nx2 = C2NX.this;
                        CallerContext callerContext = C2NX.A08;
                        UserSession userSession2 = c2nx2.A04;
                        C97E.A00(userSession2).A01();
                        C97T A008 = C97S.A00(userSession2);
                        InterfaceC19630xq interfaceC19630xq = A008.A01;
                        String A009 = AbstractC111324zv.A00(1724);
                        if (A008.A00 == interfaceC19630xq.getInt(A009, -1)) {
                            A008.A03.A00("install_confirmed");
                            InterfaceC19610xo ARD = interfaceC19630xq.ARD();
                            ARD.EEj(A009);
                            ARD.apply();
                        }
                    }
                });
                final int A008 = c2nx.A00();
                interfaceC24811Iz2.Ep8(new AbstractC18280vF(A008) { // from class: X.3nn
                    @Override // X.AbstractC18280vF
                    public final void loggedRun() {
                        C2NX c2nx2 = C2NX.this;
                        C08730cb c08730cb = C17060sy.A01;
                        CallerContext callerContext = C2NX.A08;
                        UserSession userSession2 = c2nx2.A04;
                        if (c08730cb.A01(userSession2).A1u()) {
                            C14360o3.A0B(userSession2, 0);
                            ((C70806WhM) userSession2.A01(C70806WhM.class, new C43205J8c(userSession2, 18))).A00(null);
                        }
                    }
                });
                interfaceC24811Iz2.Ep8(new AbstractC18280vF() { // from class: X.3np
                    {
                        super("CoreXDeeplinkSetup", 1422822022, 3, true, false);
                    }

                    @Override // X.AbstractC18280vF
                    public final void loggedRun() {
                        C2NX c2nx2 = C2NX.this;
                        CallerContext callerContext = C2NX.A08;
                        Context context2 = c2nx2.A01;
                        ComponentName componentName = new ComponentName(context2, (Class<?>) InstagramShortenDeeplinkAliasActivity.class);
                        PackageManager packageManager = context2.getPackageManager();
                        if (packageManager != null) {
                            UserSession userSession2 = c2nx2.A04;
                            C06090Tz c06090Tz3 = C06090Tz.A05;
                            int i2 = 2;
                            int i3 = 2;
                            if (C18U.A06(c06090Tz3, userSession2, 36318591347398983L)) {
                                i3 = 1;
                            }
                            packageManager.setComponentEnabledSetting(componentName, i3, 1);
                            ComponentName componentName2 = new ComponentName(context2, (Class<?>) InstagramHelpDeeplinkAliasActivity.class);
                            PackageManager packageManager2 = context2.getPackageManager();
                            if (packageManager2 != null) {
                                if (C18U.A06(c06090Tz3, userSession2, 36318591347661129L)) {
                                    i2 = 1;
                                }
                                packageManager2.setComponentEnabledSetting(componentName2, i2, 1);
                                return;
                            }
                            throw new IllegalStateException("Required value was null.");
                        }
                        throw new IllegalStateException("Required value was null.");
                    }
                });
                interfaceC24811Iz2.Ep8(new AbstractC18280vF() { // from class: X.3nq
                    {
                        super("ClipsFlashCacheWarmup", 1452655717, 3, false, false);
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, X.97e] */
                    @Override // X.AbstractC18280vF
                    public final void loggedRun() {
                        C2NX c2nx2 = C2NX.this;
                        CallerContext callerContext = C2NX.A08;
                        Context context2 = c2nx2.A01;
                        UserSession userSession2 = c2nx2.A04;
                        C14360o3.A0B(context2, 0);
                        C14360o3.A0B(userSession2, 1);
                        final C97Z c97z = new C97Z(context2, userSession2);
                        UserSession userSession3 = c97z.A01;
                        EnumC37328GcW enumC37328GcW = EnumC37328GcW.A04;
                        C37327GcV.A00(userSession3, enumC37328GcW).B6V(new Object(), new C97c() { // from class: X.97b
                            @Override // X.C97c
                            public final void Dh8(Collection collection) {
                                C14360o3.A0B(collection, 0);
                                C38321qM c38321qM = (C38321qM) AbstractC001800i.A0A(collection);
                                if (c38321qM != null) {
                                    C4AG.A00(C97Z.this.A01).A01(new C4AD(c38321qM.CFR(), " ReelsViewerVideoPreWarmer"));
                                }
                            }
                        }, enumC37328GcW);
                    }
                });
                interfaceC24811Iz2.Ep8(new AbstractC18280vF() { // from class: X.3nr
                    {
                        super("LoadIGDResharedContent", 1330836973, 3, true, true);
                    }

                    @Override // X.AbstractC18280vF
                    public final void loggedRun() {
                        C2NX c2nx2 = C2NX.this;
                        CallerContext callerContext = C2NX.A08;
                        C5e4 A009 = AbstractC121115e3.A00(c2nx2.A04);
                        if (C5e4.A00(A009)) {
                            synchronized (A009) {
                            }
                        }
                    }
                });
                C18U.A06(c06090Tz2, userSession, 36316400914731376L);
                interfaceC24811Iz2.Ep8(new AbstractC18280vF() { // from class: X.3ns
                    {
                        super("ODIRPurgeJob", 1998884021, 3, false, false);
                    }

                    @Override // X.AbstractC18280vF
                    public final void loggedRun() {
                        C97h A009;
                        C2NX c2nx2 = C2NX.this;
                        CallerContext callerContext = C2NX.A08;
                        UserSession userSession2 = c2nx2.A04;
                        C14360o3.A0B(userSession2, 0);
                        C2053797f c2053797f = (C2053797f) userSession2.A01(C2053797f.class, new C57510Pfk(userSession2, 39));
                        if (C18U.A06(C06090Tz.A05, c2053797f.A02, 36319016549161861L) && (A009 = C97g.A00()) != null) {
                            long j = c2053797f.A01;
                            long j2 = c2053797f.A00;
                            long seconds = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
                            try {
                                ((EnigmaSQLite) A009.A00.getValue()).purgeInstallReferrerV2(seconds - j, seconds - j2);
                            } catch (Exception e) {
                                C97h.A00(A009, "purgev2", "0", null, e.getMessage(), -1L);
                            }
                        }
                    }
                });
                final int i2 = 3;
                C19K A02 = AnonymousClass194.A02(C12L.A00.CPG(854662762, 3));
                AbstractC23641Du.A03(C05F.A00, AnonymousClass191.A00, new C206649Cv(c2nx, null, 37), A02);
                interfaceC24811Iz2.Ep8(new AbstractC18280vF() { // from class: X.3nt
                    {
                        super("PreloadBanyan", 1450141882, 2, true, true);
                    }

                    @Override // X.AbstractC18280vF
                    public final void loggedRun() {
                        C2NX c2nx2 = C2NX.this;
                        CallerContext callerContext = C2NX.A08;
                        AbstractC121115e3.A00(c2nx2.A04);
                    }
                });
                if (C18U.A06(c06090Tz2, userSession, 36313566238017670L)) {
                    i2 = 2;
                }
                final Boolean valueOf = Boolean.valueOf(C18U.A06(c06090Tz2, userSession, 2342156575451777159L));
                interfaceC24811Iz2.Ep8(new AbstractC18280vF(valueOf, i2) { // from class: X.3nv
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super("CreateClickIDPool", 541648596, i2, valueOf.booleanValue(), true);
                        C14360o3.A0A(valueOf);
                    }

                    @Override // X.AbstractC18280vF
                    public final void loggedRun() {
                        C2NX c2nx2 = C2NX.this;
                        CallerContext callerContext = C2NX.A08;
                        C2JG.A01(c2nx2.A04).A03();
                    }
                });
                interfaceC24811Iz2.Ep8(new AbstractC18280vF() { // from class: X.3nx
                    {
                        super("FXIGAccessLibrarySSOAndRegFlagAppJob", 557413411, 3, true, false);
                    }

                    @Override // X.AbstractC18280vF
                    public final void loggedRun() {
                        C2NX c2nx2 = C2NX.this;
                        CallerContext callerContext = C2NX.A08;
                        C2054197m A009 = AbstractC2054097l.A00(c2nx2.A04);
                        if (C18U.A06(C06090Tz.A05, A009.A00, 36321228457256175L)) {
                            A009.A03(null, false);
                        }
                    }
                });
                if (C18U.A06(c06090Tz2, userSession, 36319888428900086L)) {
                    interfaceC24811Iz2.Ep8(new C27095BxK(c2nx));
                }
                if (C18U.A06(c06090Tz2, userSession, 36319888430407434L)) {
                    interfaceC24811Iz2.Ep8(new C27096BxL(c2nx));
                }
                C18720vz c18720vz = AbstractC12960li.A00;
                if (!AbstractC19730y1.A00(c18720vz).A00.getBoolean("preference_has_logged_static_attributes", false) && AbstractC19730y1.A00(c18720vz).A00.getInt("preference_static_attributes_logging_failure_count", 0) < 3 && C18U.A06(c06090Tz2, userSession, 36322207709800501L)) {
                    interfaceC24811Iz2.Ep8(new AbstractC18280vF() { // from class: X.4mG
                        {
                            super("LogStaticAttributes", 588907844, 3, false, false);
                        }

                        @Override // X.AbstractC18280vF
                        public final void loggedRun() {
                            C2NX c2nx2 = C2NX.this;
                            CallerContext callerContext = C2NX.A08;
                            UserSession userSession2 = c2nx2.A04;
                            Context context2 = (Context) c2nx2.A06.get();
                            C14360o3.A0B(userSession2, 0);
                            if (context2 != null) {
                                try {
                                    boolean z3 = false;
                                    if (Y6y.A00(context2) != null) {
                                        z3 = true;
                                    }
                                    if (Boolean.valueOf(z3).booleanValue()) {
                                        C18920wW A022 = AbstractC12220kQ.A02(userSession2);
                                        GRF grf = new GRF(new C25531Mh(A022.A00(A022.A00, "ig_device_static_attributes"), 215));
                                        if (Y6y.A3W == null) {
                                            synchronized (Y6y.class) {
                                                if (Y6y.A3W == null) {
                                                    Y6y.A3W = new Y6y(context2);
                                                }
                                            }
                                        }
                                        Y6y y6y = Y6y.A3W;
                                        y6y.A03.post(new YI6(y6y, grf, Y6y.A3V));
                                    }
                                } catch (Exception unused) {
                                    InterfaceC19630xq interfaceC19630xq = AbstractC19730y1.A00(AbstractC12960li.A00).A00;
                                    int i3 = interfaceC19630xq.getInt("preference_static_attributes_logging_failure_count", 0) + 1;
                                    InterfaceC19610xo ARD = interfaceC19630xq.ARD();
                                    ARD.E7D("preference_static_attributes_logging_failure_count", i3);
                                    ARD.apply();
                                    interfaceC19630xq.getInt("preference_static_attributes_logging_failure_count", 0);
                                }
                            }
                        }
                    });
                }
                InterfaceC19630xq interfaceC19630xq = AbstractC19730y1.A00(c18720vz).A00;
                C16910sj c16910sj = C16910sj.A00;
                java.util.Set stringSet = interfaceC19630xq.getStringSet("preference_logged_performance_benchmarks", c16910sj);
                if (stringSet == null) {
                    stringSet = c16910sj;
                }
                if (stringSet.size() < C18U.A01(c06090Tz2, userSession, 36603682686637019L)) {
                    interfaceC24811Iz2.Ep8(new AbstractC18280vF() { // from class: X.3nz
                        {
                            super("LogPerfBenchmark", 1688637810, 3, false, false);
                        }

                        /* JADX WARN: Code restructure failed: missing block: B:45:0x01ef, code lost:
                        
                            if (r1 != false) goto L47;
                         */
                        @Override // X.AbstractC18280vF
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final void loggedRun() {
                            /*
                                Method dump skipped, instructions count: 531
                                To view this dump add '--comments-level debug' option
                            */
                            throw new UnsupportedOperationException("Method not decompiled: X.C83583nz.loggedRun():void");
                        }
                    });
                }
                AbstractC24641Ih.A02.Ep8(new AbstractC18280vF() { // from class: X.3o0
                    {
                        super("UpdateArCapabilitiesInPreferences", 1915160355, 5, false, false);
                    }

                    @Override // X.AbstractC18280vF
                    public final void loggedRun() {
                        C2NX c2nx2 = C2NX.this;
                        CallerContext callerContext = C2NX.A08;
                        UserSession userSession2 = c2nx2.A04;
                        C19740y2 A009 = AbstractC19730y1.A00(AbstractC12960li.A00);
                        String obj = AnonymousClass566.A03(userSession2).toString();
                        InterfaceC19610xo ARD = A009.A00.ARD();
                        ARD.E7K("preference_supported_ar_capabilities_as_json", obj);
                        ARD.apply();
                    }
                });
                interfaceC24811Iz2.Ep8(new AbstractC18280vF() { // from class: X.3o1
                    {
                        super("NotifyStartupPrefetcherStartFinished", 288230301, 3, false, false);
                    }

                    @Override // X.AbstractC18280vF
                    public final void loggedRun() {
                        C2NX c2nx2 = C2NX.this;
                        CallerContext callerContext = C2NX.A08;
                        C1CJ c1cj = C1CH.A00(c2nx2.A04).A08;
                        c1cj.A01 = true;
                        if (c1cj.A00 != null) {
                            c1cj.A00 = null;
                        }
                    }
                });
                if (C18U.A06(c06090Tz2, userSession, 36322048796076008L)) {
                    interfaceC24811Iz2.Ep8(new AbstractC18280vF() { // from class: X.3o2
                        {
                            super("PrefetchVoltronLanguagePack", 1352867137, 3, false, false);
                        }

                        @Override // X.AbstractC18280vF
                        public final void loggedRun() {
                            List list;
                            C2NX c2nx2 = C2NX.this;
                            CallerContext callerContext = C2NX.A08;
                            Context context2 = c2nx2.A01;
                            UserSession userSession2 = c2nx2.A04;
                            VoltronLanguagePackDownloader voltronLanguagePackDownloader = new VoltronLanguagePackDownloader(context2, userSession2);
                            Locale AcO = AbstractC216813u.A00(new C215813k()).AcO();
                            if (!AcO.equals(Locale.ENGLISH)) {
                                voltronLanguagePackDownloader.A01(AcO);
                            }
                            List A03 = new C11L(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1).A03(C18U.A04(C06090Tz.A05, userSession2, 36884998749553245L));
                            if (!A03.isEmpty()) {
                                ListIterator listIterator = A03.listIterator(A03.size());
                                while (listIterator.hasPrevious()) {
                                    if (((String) listIterator.previous()).length() != 0) {
                                        list = AbstractC001800i.A0d(A03, listIterator.nextIndex() + 1);
                                        break;
                                    }
                                }
                            }
                            list = C16930sl.A00;
                            String[] strArr = (String[]) list.toArray(new String[0]);
                            AbstractC216813u.A00(new C215813k());
                            Locale locale = Resources.getSystem().getConfiguration().locale;
                            C14360o3.A07(locale);
                            if (AbstractC16960so.A1Q(Arrays.copyOf(strArr, strArr.length)).contains(locale.getLanguage())) {
                                voltronLanguagePackDownloader.A01(locale);
                            }
                        }
                    });
                }
                C3o3.A00(userSession);
                if (C3o4.A00(context) && C18U.A06(c06090Tz2, userSession, 36321361602291053L)) {
                    interfaceC24811Iz2.Ep8(new AbstractC18280vF() { // from class: X.4r0
                        {
                            super("maybeWarmHeliumWebView", 1539081353, 5, false, false);
                        }

                        @Override // X.AbstractC18280vF
                        public final void loggedRun() {
                            C2NX c2nx2 = C2NX.this;
                            CallerContext callerContext = C2NX.A08;
                            UserSession userSession2 = c2nx2.A04;
                            C006802i c006802i = C006802i.A0p;
                            C14360o3.A07(c006802i);
                            try {
                                c006802i.markerStart(47654996);
                                c006802i.markerPoint(47654996, "warm_provider_start");
                                AbstractC61712RsT.A00();
                                c006802i.markerPoint(47654996, "warm_provider_end");
                                c006802i.markerEnd(47654996, (short) 2);
                            } catch (Exception e) {
                                c006802i.markerPoint(47654996, "error_while_warming");
                                C0K8.A0F("HeliumWebViewWarmer", "Error preloading Webview", e);
                                c006802i.markerEnd(47654996, (short) 3);
                            }
                            if (C18U.A06(C06090Tz.A05, userSession2, 36330879248778300L)) {
                                Context context2 = c2nx2.A01;
                                C14360o3.A0B(context2, 0);
                                if (AbstractC83633o6.A00 != null) {
                                    EnumC61128Rfi A009 = AbstractC106254qf.A00();
                                    EnumC61128Rfi enumC61128Rfi = EnumC61128Rfi.A02;
                                    if (A009 == enumC61128Rfi || AbstractC106254qf.A00() == EnumC61128Rfi.A03) {
                                        if (AbstractC106254qf.A00() != enumC61128Rfi && AbstractC106254qf.A00() != EnumC61128Rfi.A03) {
                                            StringBuilder sb = new StringBuilder();
                                            sb.append(AbstractC58317Pt9.A00(459));
                                            sb.append(AbstractC106254qf.A00());
                                            throw new IllegalStateException(sb.toString());
                                        }
                                        C61606RqV c61606RqV = AbstractC106254qf.A00;
                                        if (c61606RqV != null) {
                                            c61606RqV.A03(context2);
                                            return;
                                        }
                                        throw new RuntimeException(AbstractC58317Pt9.A00(646));
                                    }
                                }
                            }
                        }
                    });
                }
                if (C3o4.A00(context)) {
                    interfaceC24811Iz2.Ep8(new AbstractC18280vF() { // from class: X.4r1
                        {
                            super("maybeRestoreCookiesForSession", 575743522, 5, false, false);
                        }

                        /* JADX WARN: Code restructure failed: missing block: B:4:0x002d, code lost:
                        
                            if (r8.A02 == false) goto L6;
                         */
                        /* JADX WARN: Type inference failed for: r0v12, types: [X.1Ke, java.lang.Object] */
                        /* JADX WARN: Type inference failed for: r0v22, types: [X.1Ke, java.lang.Object] */
                        /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, X.CC9] */
                        @Override // X.AbstractC18280vF
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final void loggedRun() {
                            /*
                                r9 = this;
                                X.2NX r1 = X.C2NX.this
                                com.facebook.common.callercontext.CallerContext r0 = X.C2NX.A08
                                android.content.Context r6 = r1.A01
                                X.02i r5 = X.C006802i.A0p
                                X.C14360o3.A07(r5)
                                X.CC9 r4 = new X.CC9
                                r4.<init>()
                                com.instagram.common.session.UserSession r3 = r1.A04
                                X.0Tz r2 = X.C06090Tz.A05
                                r0 = 36321361602422126(0x810a160012256e, double:3.033113559531176E-306)
                                boolean r0 = X.C18U.A06(r2, r3, r0)
                                X.CS3 r8 = new X.CS3
                                r8.<init>(r6, r4, r5, r0)
                                android.content.Context r0 = r8.A00
                                boolean r0 = X.C3o4.A00(r0)
                                if (r0 == 0) goto L2f
                                boolean r1 = r8.A02
                                r0 = 1
                                if (r1 != 0) goto L30
                            L2f:
                                r0 = 0
                            L30:
                                java.lang.String r3 = "HeliumCookieRestorer"
                                if (r0 != 0) goto L5a
                                X.1B4 r2 = X.AbstractC23881Ey.A00()
                                r1 = 924283537(0x37177291, float:9.026976E-6)
                                r0 = 0
                                java.io.File r2 = r2.AXd(r0, r1)
                                java.lang.String r1 = "Cookies"
                                java.io.File r0 = new java.io.File
                                r0.<init>(r2, r1)
                                r0.delete()
                                java.lang.String r0 = "Backup/restore disabled"
                                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                                r1.<init>(r0)
                            L51:
                                X.K5v r0 = new X.K5v
                                r0.<init>()
                                r0.setException(r1)
                                return
                            L5a:
                                com.facebook.quicklog.QuickPerformanceLogger r6 = r8.A01
                                r5 = 47655239(0x2d72947, float:3.1615103E-37)
                                r6.markerStart(r5)
                                X.1B4 r2 = X.AbstractC23881Ey.A00()
                                r1 = 924283537(0x37177291, float:9.026976E-6)
                                r0 = 0
                                java.io.File r1 = r2.AXd(r0, r1)
                                java.lang.String r0 = "Cookies"
                                java.io.File r7 = new java.io.File
                                r7.<init>(r1, r0)
                                boolean r0 = r7.exists()
                                r2 = 3
                                if (r0 != 0) goto L8c
                                java.lang.String r0 = "no_backup"
                                r6.markerPoint(r5, r0)
                                r6.markerEnd(r5, r2)
                                java.lang.String r0 = "No backup found"
                                java.io.IOException r1 = new java.io.IOException
                                r1.<init>(r0)
                                goto L51
                            L8c:
                                java.lang.String r4 = r7.getCanonicalPath()     // Catch: java.io.IOException -> Lcd
                                android.webkit.CookieManager r1 = android.webkit.CookieManager.getInstance()
                                X.C14360o3.A0A(r1)
                                r0 = 0
                                X.C14360o3.A0B(r1, r0)
                                X.Tkx r0 = X.AbstractC83633o6.A01
                                if (r0 == 0) goto Lb8
                                X.Tky r3 = r0.Ari(r1)
                                java.lang.String r0 = "restore_start"
                                r6.markerPoint(r5, r0)
                                com.google.common.util.concurrent.SettableFuture r2 = new com.google.common.util.concurrent.SettableFuture
                                r2.<init>()
                                r1 = 22
                                X.DHZ r0 = new X.DHZ
                                r0.<init>(r1, r7, r8, r2)
                                r3.EKU(r4, r0)
                                return
                            Lb8:
                                java.lang.String r0 = "Not using Helium, skipping cookie store restore"
                                X.C0K8.A0D(r3, r0)
                                java.lang.String r0 = "helium_inactive"
                                r6.markerPoint(r5, r0)
                                r6.markerEnd(r5, r2)
                                java.lang.String r0 = "Helium inactive"
                                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                                r1.<init>(r0)
                                goto L51
                            Lcd:
                                r1 = move-exception
                                java.lang.String r0 = "Failed to resolve cookie backup path"
                                X.C0K8.A0F(r3, r0, r1)
                                java.lang.String r0 = "invalid_path"
                                r6.markerPoint(r5, r0)
                                r6.markerEnd(r5, r2)
                                X.K5v r0 = new X.K5v
                                r0.<init>()
                                r0.setException(r1)
                                return
                            */
                            throw new UnsupportedOperationException("Method not decompiled: X.C106474r1.loggedRun():void");
                        }
                    });
                }
                if (C18U.A06(c06090Tz2, userSession, 36330879248843837L)) {
                    interfaceC24811Iz2.Ep8(new AbstractC18280vF() { // from class: X.3o7
                        {
                            super("uploadHeliumRendererCrashLogs", 1664732868, 5, false, false);
                        }

                        @Override // X.AbstractC18280vF
                        public final void loggedRun() {
                            C2NX c2nx2 = C2NX.this;
                            CallerContext callerContext = C2NX.A08;
                            Context context2 = c2nx2.A01;
                            SharedPreferences sharedPreferences = context2.getSharedPreferences("ig4a_helium_renderer_crash_logs", 0);
                            long j = sharedPreferences.getLong("upload_timestamp", 0L);
                            sharedPreferences.edit().putLong("upload_timestamp", Math.max(j, AbstractC2054497p.A00(context2, j))).apply();
                        }
                    });
                }
                if (AbstractC54472f1.A05(userSession)) {
                    final int A015 = (int) C18U.A01(c06090Tz2, userSession, 36607376358643288L);
                    interfaceC24811Iz2.Ep8(new AbstractC18280vF(A015) { // from class: X.9jh
                        @Override // X.AbstractC18280vF
                        public final void loggedRun() {
                            C2NX c2nx2 = C2NX.this;
                            CallerContext callerContext = C2NX.A08;
                            UserSession userSession2 = c2nx2.A04;
                            C14360o3.A0B(userSession2, 0);
                            ((C23654Ado) userSession2.A01(C23654Ado.class, new C50152MDf(userSession2, 15))).A00(CallerContext.A01(AbstractC111324zv.A00(691)), userSession2);
                        }
                    });
                }
                if (C18U.A06(c06090Tz2, userSession, 36319716630011504L)) {
                    interfaceC24811Iz2.Ep8(new AbstractC18280vF() { // from class: X.3oA
                        {
                            super("FxAppStartMigrateClientImpression", 1652689082, 3, false, false);
                        }

                        /* JADX WARN: Removed duplicated region for block: B:13:0x0058 A[SYNTHETIC] */
                        /* JADX WARN: Removed duplicated region for block: B:25:0x007b A[SYNTHETIC] */
                        /* JADX WARN: Removed duplicated region for block: B:28:0x00ba A[SYNTHETIC] */
                        /* JADX WARN: Removed duplicated region for block: B:37:0x0083 A[SYNTHETIC] */
                        /* JADX WARN: Removed duplicated region for block: B:56:0x0022 A[SYNTHETIC] */
                        /* JADX WARN: Removed duplicated region for block: B:67:0x0022 A[SYNTHETIC] */
                        @Override // X.AbstractC18280vF
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final void loggedRun() {
                            /*
                                Method dump skipped, instructions count: 317
                                To view this dump add '--comments-level debug' option
                            */
                            throw new UnsupportedOperationException("Method not decompiled: X.C83653oA.loggedRun():void");
                        }
                    });
                }
                if (C18U.A06(c06090Tz2, userSession, 36325175532663633L)) {
                    interfaceC24811Iz2.Ep8(new NH1(c2nx));
                }
                interfaceC24811Iz2.Ep8(new AbstractC18280vF() { // from class: X.3oB
                    {
                        super("ZeroRatingDogfooding", 1940672999, 5, false, false);
                    }

                    @Override // X.AbstractC18280vF
                    public final void loggedRun() {
                        C2NX c2nx2 = C2NX.this;
                        CallerContext callerContext = C2NX.A08;
                        UserSession userSession2 = c2nx2.A04;
                        C14360o3.A0B(userSession2, 0);
                        userSession2.A01(IgZeroDogfoodingInit.class, new C29892DGg(userSession2, 24));
                    }
                });
                interfaceC24811Iz2.Ep8(new AbstractC18280vF() { // from class: X.3oD
                    {
                        super("XAVHoldout", 1987925144, 5, false, false);
                    }

                    @Override // X.AbstractC18280vF
                    public final void loggedRun() {
                        C2NX c2nx2 = C2NX.this;
                        CallerContext callerContext = C2NX.A08;
                        C18U.A06(C06090Tz.A05, c2nx2.A04, 36327808347159427L);
                    }
                });
                interfaceC24811Iz2.Ep8(new AbstractC18280vF() { // from class: X.3oH
                    {
                        super("DirectThreadPreload", 948467465, 4, false, false);
                    }

                    @Override // X.AbstractC18280vF
                    public final void loggedRun() {
                        int i3;
                        AnonymousClass983 A009;
                        if (C20150ym.A07(AbstractC20100yh.A00(36328143355067630L))) {
                            C2NX c2nx2 = C2NX.this;
                            CallerContext callerContext = C2NX.A08;
                            UserSession userSession2 = c2nx2.A04;
                            C14360o3.A0B(userSession2, 0);
                            List singletonList = Collections.singletonList(new PendingRecipient(userSession2.userId));
                            C14360o3.A07(singletonList);
                            C122145g6 c122145g6 = new C122145g6(singletonList);
                            C2054597s c2054597s = C2054597s.A00;
                            C16930sl c16930sl = C16930sl.A00;
                            Capabilities createWithAdditionalCapabilities = c2054597s.createWithAdditionalCapabilities(c16930sl, c16930sl);
                            C14360o3.A0B(c122145g6, 0);
                            C14360o3.A0B(createWithAdditionalCapabilities, 4);
                            Bundle bundle = new Bundle();
                            AbstractC2054897w.A02(bundle, c122145g6, "DirectFragment.DIRECT_FRAGMENT_ARGUMENT_THREAD_TARGET");
                            bundle.putBoolean("DirectThreadFragment.DIRECT_FRAGMENT_FIRST_MESSAGE_SENT", false);
                            bundle.putBoolean("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_META_AI_SHOULD_SKIP_GENAI_EVAL", false);
                            bundle.putBoolean("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_META_AI_LAUNCHING_WITH_PRE_SENT_MESSAGE", false);
                            bundle.putString("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_SCROLL_TO_MESSAGE_ID", null);
                            bundle.putBoolean("DirectThreadFragment.ARGUMENT_SHOW_PERMISSIONS", false);
                            bundle.putParcelable("DirectFragment.DIRECT_FRAGMENT_THREAD_CAPABILITIES", createWithAdditionalCapabilities);
                            bundle.putInt("DirectThreadFragment.ARGUMENT_OPEN_TO", 0);
                            bundle.putString("DirectFragment.ENTRY_POINT", "direct_thread_preload");
                            bundle.putBoolean("direct_is_creating_social_channel", false);
                            bundle.putInt("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_CURRENT_THEME_ID", 0);
                            bundle.putBoolean("DirectThreadFragment.ARGUMENT_IS_BOTTOM_SHEET", false);
                            bundle.putBoolean("DirectFragment.DIRECT_THREAD_FRAGMENT_ARGUMENT_CREATE_BACKSTACK", false);
                            bundle.putBoolean("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_IS_GROUP_INVITE", false);
                            bundle.putBoolean("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_IS_ELIGIBLE_FOR_DMM", false);
                            bundle.putBoolean("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_SKIP_ENTER_THREAD_LOGGING", true);
                            bundle.putBoolean("bundle_extra_is_navigating_from_ctd_ad", false);
                            bundle.putBoolean("DirectThreadFragment.DIRECT_THREAD_FRAGMENT_OPEN_WITH_QUOTED_MEDIA", false);
                            bundle.putBoolean("DirectThreadFragment.DIRECT_THREAD_FRAGMENT_SHOW_KEYBOARD_ON_THREAD_OPEN", false);
                            AbstractC60492pY.A03(bundle, userSession2);
                            if (Systrace.A0E(1L)) {
                                C0fO.A01("PreloadThreadToggleFragment", -358925796);
                            }
                            try {
                                A009 = AbstractC2054997y.A00(bundle, new C51C(), userSession2, true);
                                if (Systrace.A0E(1L)) {
                                    C0fO.A00(2081485051);
                                }
                                if (Systrace.A0E(1L)) {
                                    C0fO.A01("PreloadThreadFragment", 1636856865);
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                if (Systrace.A0E(1L)) {
                                    i3 = 515624541;
                                } else {
                                    throw th;
                                }
                            }
                            try {
                                C164067Vv c164067Vv = new C164067Vv(A009.A1J, A009.A1M);
                                UserSession userSession3 = A009.A10;
                                C7VF c7vf = A009.A1L;
                                C164077Vw c164077Vw = new C164077Vw(userSession3, A009.A1F, A009.A1H, A009.A0K, c7vf, c164067Vv);
                                UserSession userSession4 = c164077Vw.A00;
                                C7VF c7vf2 = c164077Vw.A04;
                                A009.A0J = new C164087Vx(userSession4, c164077Vw.A01, c164077Vw.A02, c164077Vw.A03, c7vf2, c164077Vw.A05);
                                if (userSession3.sessionState.ordinal() == 0) {
                                    AnonymousClass983.A02(A009.A0r, A009, true);
                                }
                                if (Systrace.A0E(1L)) {
                                    C0fO.A00(495906161);
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                if (Systrace.A0E(1L)) {
                                    i3 = -281017705;
                                    C0fO.A00(i3);
                                    throw th;
                                }
                                throw th;
                            }
                        }
                    }
                });
                if (C18U.A06(c06090Tz2, userSession, 36324260704759857L)) {
                    InterfaceC24811Iz interfaceC24811Iz13 = AbstractC24641Ih.A02;
                    C14360o3.A07(interfaceC24811Iz13);
                    interfaceC24811Iz13.Ep8(new C52402NGx(c2nx));
                }
                if (C1AD.A06(c06090Tz2, 2324155869295950265L) && C83743oJ.A01(userSession).A04(userSession.userId).booleanValue()) {
                    AnonymousClass253 A009 = AnonymousClass252.A00(userSession);
                    CallerContext.A01(__redex_internal_original_name);
                    if (A009.A01) {
                        C83743oJ.A01(userSession).A08((Context) c2nx.A06.get(), new C19270xB("aymh"), userSession, true, false, C05F.A0C, userSession.userId, true);
                    } else {
                        interfaceC24811Iz2.Ep8(new C27097BxM(c2nx));
                    }
                }
                interfaceC24811Iz2.Ep8(new AbstractC18280vF() { // from class: X.3oU
                    {
                        super("IABJSOTAUpdateJsScriptsJob", 1829444833, 3, false, false);
                    }

                    @Override // X.AbstractC18280vF
                    public final void loggedRun() {
                        C2NX c2nx2 = C2NX.this;
                        CallerContext callerContext = C2NX.A08;
                        if (C18U.A06(C06090Tz.A05, c2nx2.A04, 36329689542967793L)) {
                            C218914p.A05(c2nx2.A02);
                        }
                    }
                });
                interfaceC24811Iz2.Ep8(new AbstractC18280vF() { // from class: X.3oW
                    {
                        super("OnDeviceRenderingStartupJob", 637710289);
                    }

                    @Override // X.AbstractC18280vF
                    public final void loggedRun() {
                        C2NX c2nx2 = C2NX.this;
                        CallerContext callerContext = C2NX.A08;
                        UserSession userSession2 = c2nx2.A04;
                        if (C18U.A06(C06090Tz.A05, userSession2, 36324393849073813L)) {
                            HashMap hashMap = new HashMap();
                            hashMap.put(EnumC46129KbT.A02, userSession2);
                            Context context2 = c2nx2.A01;
                            C14090nZ c14090nZ = IgODRAssetDownloader.A01;
                            C14360o3.A0B(context2, 1);
                            C19K A022 = AnonymousClass194.A02(c14090nZ);
                            C14360o3.A0A(AbstractC23641Du.A04(AnonymousClass191.A00, new MCH(context2, hashMap, (InterfaceC23621Ds) null, 1), A022));
                        }
                    }
                });
                interfaceC24811Iz2.Ep8(new AbstractC18280vF() { // from class: X.3oX
                    {
                        super("SwitcherFetchLoggedInFBAccount", 121269570);
                    }

                    /* JADX WARN: Type inference failed for: r6v0, types: [X.AMj, java.lang.Object] */
                    @Override // X.AbstractC18280vF
                    public final void loggedRun() {
                        if (AbstractC54472f1.A04(18316575228576871L, true)) {
                            C2NX c2nx2 = C2NX.this;
                            CallerContext callerContext = C2NX.A08;
                            Context context2 = c2nx2.A01;
                            UserSession userSession2 = c2nx2.A04;
                            C14360o3.A0B(context2, 0);
                            C14360o3.A0B(userSession2, 1);
                            java.util.Set singleton = Collections.singleton(new A9D(null, null, EnumC200808uN.A03, EnumC200938ua.ACTIVE_ACCOUNT));
                            C14360o3.A07(singleton);
                            if (Systrace.A0E(1L)) {
                                C0fO.A01("SwitcherStartupHelper.fetchAndCacheLoggedInFBAccountName", -237401268);
                            }
                            try {
                                C2OD.A03(new C70561Wcu(), new Object().A07(context2, userSession2, "fx_company_identity_switcher_linking_cache", "SwitcherStartupHelper", singleton), new ExecutorC14110nb(121269570));
                                if (Systrace.A0E(1L)) {
                                    C0fO.A00(-1563088168);
                                }
                            } catch (Throwable th3) {
                                if (Systrace.A0E(1L)) {
                                    C0fO.A00(285840538);
                                }
                                throw th3;
                            }
                        }
                    }
                });
                if (Systrace.A0E(1L)) {
                    C0fO.A00(1527506004);
                }
                if (Systrace.A0E(1L)) {
                    C0fO.A00(74979090);
                }
            } catch (Throwable th3) {
                th = th3;
                if (Systrace.A0E(1L)) {
                    i = -2107037527;
                    C0fO.A00(i);
                    throw th;
                }
                throw th;
            }
        }
    }

    public static final boolean A03(C2NX c2nx) {
        UserSession userSession = c2nx.A04;
        C06090Tz c06090Tz = C06090Tz.A05;
        boolean A06 = C18U.A06(c06090Tz, userSession, 36326154785207990L);
        boolean A062 = C18U.A06(c06090Tz, userSession, 36326154786977484L);
        boolean A063 = C18U.A06(c06090Tz, userSession, 36326154786911947L);
        if (A062) {
            return true;
        }
        if (!A063) {
            return A06;
        }
        return false;
    }

    public final void A04() {
        if (Build.VERSION.SDK_INT >= 31) {
            UserSession userSession = this.A04;
            C06090Tz c06090Tz = C06090Tz.A05;
            if (C18U.A06(c06090Tz, userSession, 36330106154664641L)) {
                WDB.A00.A02((int) C18U.A01(c06090Tz, userSession, 36611581131430189L));
            }
        }
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        if (AbstractC201688vy.A01(this.A04, C05F.A02)) {
            C218914p.A07(this.A05);
            C218914p.A06(this.A03);
            C218914p.A06(this.A02);
        }
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [X.2Nq] */
    public C2NX(final Context context, final UserSession userSession, WeakReference weakReference) {
        this.A06 = weakReference;
        this.A01 = context;
        this.A04 = userSession;
        this.A05 = new C49132Nk(AbstractC49092Nc.A00(userSession), this);
        this.A02 = new InterfaceC12870lZ(context, userSession) { // from class: X.2Nq
            public C55010OVt A00;
            public final Context A01;
            public final UserSession A02;

            {
                C55010OVt c55010OVt;
                C14360o3.A0B(context, 1);
                C14360o3.A0B(userSession, 2);
                this.A01 = context;
                this.A02 = userSession;
                C06090Tz c06090Tz = C06090Tz.A05;
                if (C18U.A06(c06090Tz, userSession, 36329689542967793L)) {
                    C55010OVt c55010OVt2 = C55010OVt.A06;
                    if (c55010OVt2 == null) {
                        c55010OVt2 = new C55010OVt(context);
                        C55010OVt.A06 = c55010OVt2;
                    }
                    this.A00 = c55010OVt2;
                }
                if (C18U.A06(c06090Tz, userSession, 36329689542967793L) && (c55010OVt = this.A00) != null) {
                    c55010OVt.A01();
                }
            }

            @Override // X.InterfaceC12870lZ
            public final void onAppBackgrounded() {
                C0f9.A0A(1984112876, C0f9.A03(-116608823));
            }

            @Override // X.InterfaceC12870lZ
            public final void onAppForegrounded() {
                C55010OVt c55010OVt;
                int A03 = C0f9.A03(1033598085);
                if (C18U.A06(C06090Tz.A05, this.A02, 36329689542967793L) && (c55010OVt = this.A00) != null) {
                    c55010OVt.A01();
                }
                C0f9.A0A(1666203710, A03);
            }
        };
    }
}
