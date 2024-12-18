package X;

import android.content.Context;
import com.facebook.cameracore.ardelivery.model.VersionedCapability;
import com.facebook.cameracore.ardelivery.model.XplatAssetType;
import com.facebook.cameracore.ardelivery.util.hardwarebackend.chipset.ChipsetInfoUtil;
import com.facebook.cameracore.ardelivery.xplat.async.XplatAsyncMetadataFetcher;
import com.facebook.cameracore.ardelivery.xplat.cacheprovider.XplatFileCacheCreator;
import com.facebook.cameracore.ardelivery.xplat.cacheprovider.XplatFileCacheDescriptor;
import com.facebook.cameracore.ardelivery.xplat.connectioninfo.XplatDataConnectionManager;
import com.facebook.cameracore.ardelivery.xplat.effectmanager.XplatEffectManager;
import com.facebook.cameracore.ardelivery.xplat.effectmanager.XplatFeaturesConfig;
import com.facebook.cameracore.ardelivery.xplat.modelmanager.XplatModelMetadataFetcher;
import com.facebook.cameracore.ardelivery.xplat.modelmanager.versionfetcher.XplatRemoteModelVersionFetcher;
import com.facebook.cameracore.ardelivery.xplat.scripting.XplatScriptingMetadataFetcher;
import com.facebook.cameracore.ardelivery.xplat.sparkvision.SparkVisionMetadataDownloader;
import com.facebook.common.jniexecutors.AndroidAsyncExecutorFactory;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.instagram.ar.core.voltron.IgArVoltronModuleLoader;
import com.instagram.common.session.UserSession;
import com.instagram.service.tigon.IGTigonService;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* renamed from: X.6qP, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C150686qP {
    public static C149946on A0C;
    public Boolean A00;
    public final Context A01;
    public final AbstractC150536q2 A02;
    public final C150666qM A03;
    public final InterfaceC150356pk A04;
    public final QuickPerformanceLogger A05;
    public final IgArVoltronModuleLoader A06;
    public final AbstractC12990ll A07;
    public final C1B4 A08 = AbstractC23881Ey.A00();
    public final C40701ud A09;
    public final Executor A0A;
    public volatile C150156pL A0B;

    /* JADX WARN: Type inference failed for: r0v70, types: [X.6oj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v12, types: [X.6oj, java.lang.Object] */
    public static synchronized void A00(C150686qP c150686qP) {
        C149906oj c149906oj;
        ChipsetInfoUtil chipsetInfoUtil;
        String str;
        C149906oj c149906oj2;
        C149926ol c149926ol;
        synchronized (c150686qP) {
            if (c150686qP.A0B == null) {
                C149886oh c149886oh = null;
                AbstractC150536q2 abstractC150536q2 = c150686qP.A02;
                AbstractC12990ll abstractC12990ll = ((C150526q1) abstractC150536q2).A01;
                C06090Tz c06090Tz = C06090Tz.A05;
                if (C18U.A06(c06090Tz, abstractC12990ll, 2342154101548188079L)) {
                    AbstractC12990ll abstractC12990ll2 = c150686qP.A07;
                    if (abstractC12990ll2 instanceof UserSession) {
                        UserSession userSession = (UserSession) abstractC12990ll2;
                        C14360o3.A0B(userSession, 0);
                        c149886oh = new C149886oh(((C150696qQ) userSession.A01(C150696qQ.class, new C57243PbR(userSession, 3))).A00, abstractC12990ll2);
                    }
                }
                File AXd = c150686qP.A08.AXd(null, 1567356230);
                QuickPerformanceLogger quickPerformanceLogger = c150686qP.A05;
                Context context = c150686qP.A01;
                InterfaceC150356pk interfaceC150356pk = c150686qP.A04;
                if (A0C == null) {
                    synchronized (C150686qP.class) {
                        try {
                            if (A0C == null) {
                                synchronized (C149906oj.class) {
                                    C149906oj c149906oj3 = C149906oj.A01;
                                    c149906oj2 = c149906oj3;
                                    if (c149906oj3 == null) {
                                        ?? obj = new Object();
                                        obj.A00 = context;
                                        C149906oj.A01 = obj;
                                        c149906oj2 = obj;
                                    }
                                }
                                synchronized (C149926ol.class) {
                                    c149926ol = C149926ol.A00;
                                    if (c149926ol == null) {
                                        c149926ol = C149926ol.A01;
                                        C149926ol.A00 = c149926ol;
                                    }
                                }
                                A0C = new C149946on(c149906oj2, abstractC150536q2, c149926ol, interfaceC150356pk, quickPerformanceLogger);
                            }
                        } finally {
                        }
                    }
                }
                C149946on c149946on = A0C;
                synchronized (C149906oj.class) {
                    try {
                        C149906oj c149906oj4 = C149906oj.A01;
                        c149906oj = c149906oj4;
                        if (c149906oj4 == null) {
                            ?? obj2 = new Object();
                            obj2.A00 = context;
                            C149906oj.A01 = obj2;
                            c149906oj = obj2;
                        }
                    } finally {
                    }
                }
                if (C18U.A06(c06090Tz, abstractC12990ll, 36316748806361730L)) {
                    synchronized (ChipsetInfoUtil.class) {
                        try {
                            if (ChipsetInfoUtil.THE_ONE == null) {
                                try {
                                    ChipsetInfoUtil.THE_ONE = new ChipsetInfoUtil();
                                } catch (UnsatisfiedLinkError e) {
                                    C0K8.A0G("ChipsetInfoUtil", "Unsatisfied link error when initializing chipsetInfoUtil", e);
                                    if (e.getMessage() != null) {
                                        str = e.getMessage();
                                    } else {
                                        str = "Unsatisfied link error when initializing chipsetInfoUtil, missing detailed error message.";
                                    }
                                    C0w9.A03("ChipsetInfoUtil", str);
                                }
                            }
                            chipsetInfoUtil = ChipsetInfoUtil.THE_ONE;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                } else {
                    chipsetInfoUtil = null;
                }
                AbstractC12990ll abstractC12990ll3 = c150686qP.A07;
                XplatModelMetadataFetcher xplatModelMetadataFetcher = new XplatModelMetadataFetcher(new C149996ot(c149906oj, c149946on, chipsetInfoUtil, abstractC12990ll3));
                InterfaceC150016ox interfaceC150016ox = new InterfaceC150016ox() { // from class: X.6ow
                    public final InterfaceC19630xq A00 = AbstractC19750y3.A01("ig_ard_versioned_capability_experiment");

                    @Override // X.InterfaceC150016ox
                    public final boolean AHC(VersionedCapability versionedCapability, String str2) {
                        InterfaceC19630xq interfaceC19630xq = this.A00;
                        String name = versionedCapability.name();
                        String string = interfaceC19630xq.getString(name, null);
                        boolean z = false;
                        if (!C2I7.A00(str2, string)) {
                            InterfaceC19610xo ARD = interfaceC19630xq.ARD();
                            if (string != null && str2 == null) {
                                ARD.EEj(name);
                            } else {
                                ARD.E7K(name, str2);
                                z = true;
                            }
                            ARD.apply();
                        }
                        return z;
                    }
                };
                C150026oy c150026oy = new C150026oy();
                C40701ud c40701ud = c150686qP.A09;
                XplatRemoteModelVersionFetcher xplatRemoteModelVersionFetcher = new XplatRemoteModelVersionFetcher(new C150066p2(interfaceC150016ox, c150026oy, c40701ud), C0w9.A01);
                XplatAsyncMetadataFetcher xplatAsyncMetadataFetcher = new XplatAsyncMetadataFetcher(new C150076p5(context, c40701ud, new AnonymousClass569(abstractC12990ll3)));
                XplatScriptingMetadataFetcher xplatScriptingMetadataFetcher = new XplatScriptingMetadataFetcher(new C150096p8(c40701ud));
                SparkVisionMetadataDownloader sparkVisionMetadataDownloader = new SparkVisionMetadataDownloader(c40701ud);
                XplatDataConnectionManager xplatDataConnectionManager = new XplatDataConnectionManager(c149906oj);
                XplatFeaturesConfig xplatFeaturesConfig = new XplatFeaturesConfig(true, true, false, true, C18U.A06(c06090Tz, abstractC12990ll3, 36325682338346252L));
                long j = 800 << 20;
                long j2 = 50 << 20;
                ArrayList arrayList = new ArrayList(Arrays.asList(new XplatFileCacheDescriptor(XplatAssetType.AREffect.getValue(), "AREffect", j), new XplatFileCacheDescriptor(XplatAssetType.SparkVision.getValue(), "SparkVision", j), new XplatFileCacheDescriptor(XplatAssetType.Async.getValue(), "Async", j), new XplatFileCacheDescriptor(XplatAssetType.Remote.getValue(), "Remote", j), new XplatFileCacheDescriptor(XplatAssetType.ScriptingPackage.getValue(), "ScriptingPackage", 1 << 20), new XplatFileCacheDescriptor(XplatAssetType.FaceTrackerModel.getValue(), "FaceTrackerModel", j2), new XplatFileCacheDescriptor(XplatAssetType.SegmentationModel.getValue(), "SegmentationModel", j2), new XplatFileCacheDescriptor(XplatAssetType.HairSegmentationModel.getValue(), "HairSegmentationModel", j2), new XplatFileCacheDescriptor(XplatAssetType.MSuggestionsCoreModel.getValue(), "MSuggestionsCoreModel", 3 << 20)));
                XplatFileCacheCreator xplatFileCacheCreator = new XplatFileCacheCreator(new C150116pF(abstractC150536q2), null, abstractC150536q2);
                String path = AXd.getPath();
                AndroidAsyncExecutorFactory androidAsyncExecutorFactory = AndroidAsyncExecutorFactory.$redex_init_class;
                AndroidAsyncExecutorFactory androidAsyncExecutorFactory2 = new AndroidAsyncExecutorFactory(C14250np.A00().A00);
                IGTigonService tigonService = IGTigonService.getTigonService(abstractC12990ll3);
                C150666qM c150666qM = c150686qP.A03;
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = C14250np.A00().A00;
                IgArVoltronModuleLoader igArVoltronModuleLoader = c150686qP.A06;
                List<C150046p0> A00 = AbstractC150036oz.A00();
                C150136pI c150136pI = new C150136pI(context, abstractC150536q2, interfaceC150356pk);
                boolean booleanValue = c150686qP.A00.booleanValue();
                C14360o3.A0B(path, 0);
                C14360o3.A0B(tigonService, 10);
                C14360o3.A0B(c150666qM, 13);
                C14360o3.A0B(scheduledThreadPoolExecutor, 14);
                C14360o3.A0B(igArVoltronModuleLoader, 16);
                C14360o3.A0B(c149946on, 17);
                C14360o3.A0B(A00, 19);
                int A0L = AbstractC16850sd.A0L(AbstractC06950Ym.A1E(A00, 10));
                if (A0L < 16) {
                    A0L = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(A0L);
                for (C150046p0 c150046p0 : A00) {
                    linkedHashMap.put(Integer.valueOf(c150046p0.A01.getXplatValue()), Integer.valueOf(c150046p0.A00));
                }
                c150686qP.A0B = new C150156pL(c149946on, c150136pI, abstractC150536q2, c150666qM, new XplatEffectManager(androidAsyncExecutorFactory2, path, xplatModelMetadataFetcher, xplatRemoteModelVersionFetcher, xplatAsyncMetadataFetcher, xplatScriptingMetadataFetcher, sparkVisionMetadataDownloader, xplatDataConnectionManager, 1, xplatFeaturesConfig, tigonService, arrayList, xplatFileCacheCreator, 50L, linkedHashMap, false, false), c149886oh, c150026oy, igArVoltronModuleLoader, A00, scheduledThreadPoolExecutor, booleanValue);
            }
        }
    }

    public C150686qP(Context context, AbstractC150536q2 abstractC150536q2, C150666qM c150666qM, InterfaceC150356pk interfaceC150356pk, QuickPerformanceLogger quickPerformanceLogger, IgArVoltronModuleLoader igArVoltronModuleLoader, AbstractC12990ll abstractC12990ll, Executor executor) {
        C40701ud A00;
        this.A01 = context;
        this.A07 = abstractC12990ll;
        this.A0A = executor;
        this.A02 = abstractC150536q2;
        this.A03 = c150666qM;
        this.A06 = igArVoltronModuleLoader;
        this.A05 = quickPerformanceLogger;
        this.A04 = interfaceC150356pk;
        if (abstractC12990ll instanceof UserSession) {
            A00 = AbstractC40691uc.A01((UserSession) abstractC12990ll);
        } else {
            A00 = AbstractC40691uc.A00((C07270a1) abstractC12990ll);
        }
        this.A09 = A00;
        this.A00 = Boolean.valueOf(C18U.A06(C06090Tz.A05, abstractC12990ll, 36325377395668003L));
    }
}
