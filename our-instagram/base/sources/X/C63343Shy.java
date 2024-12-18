package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Process;
import android.widget.FrameLayout;
import com.facebook.common.dextricks.OdexSchemeArtXdex;
import com.facebook.hermes.reactexecutor.HermesExecutor;
import com.facebook.react.CoreModulesPackage;
import com.facebook.react.DebugCorePackage;
import com.facebook.react.LazyReactPackage;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.CatalystInstance;
import com.facebook.react.bridge.CatalystInstanceImpl;
import com.facebook.react.bridge.JavaScriptExecutor;
import com.facebook.react.bridge.ModuleHolder;
import com.facebook.react.bridge.NativeArray;
import com.facebook.react.bridge.ReactCxxErrorHandler;
import com.facebook.react.bridge.ReactInstanceManagerInspectorTarget;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.WritableNativeArray;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.bridge.queue.MessageQueueThread;
import com.facebook.react.config.ReactFeatureFlags;
import com.facebook.react.devsupport.InspectorFlags;
import com.facebook.react.devsupport.JSCHeapCapture;
import com.facebook.react.devsupport.LogBoxModule;
import com.facebook.react.modules.appregistry.AppRegistry;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.facebook.react.modules.core.ExceptionsManagerModule;
import com.facebook.react.modules.core.HeadlessJsTaskSupportModule;
import com.facebook.react.modules.core.TimingModule;
import com.facebook.react.modules.debug.DevMenuModule;
import com.facebook.react.modules.debug.DevSettingsModule;
import com.facebook.react.modules.debug.SourceCodeModule;
import com.facebook.react.modules.deviceinfo.DeviceInfoModule;
import com.facebook.react.modules.systeminfo.AndroidInfoModule;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.systrace.Systrace;
import com.facebook.systrace.SystraceMessage;
import com.instagram.react.delegate.IgReactDelegate;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.Shy, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63343Shy {
    public Activity A00;
    public C62543SFu A01;
    public ReactInstanceManagerInspectorTarget A02;
    public InterfaceC65357Til A03;
    public List A04;
    public final Context A05;
    public final C62628SJl A06;
    public final ComponentCallbacks2C63414Sjs A07;
    public final AbstractC62631SJo A08;
    public final InterfaceC65352Tig A09;
    public final InterfaceC65655TqV A0A;
    public final String A0C;
    public final List A0E;
    public volatile Q21 A0G;
    public volatile Integer A0I;
    public volatile Thread A0J;
    public final java.util.Set A0F = AbstractC58322PtE.A11();
    public final Object A0B = AbstractC58318PtA.A0b();
    public final Collection A0D = AbstractC58322PtE.A0z();
    public volatile boolean A0K = false;
    public volatile Boolean A0H = false;
    public volatile boolean A0L = false;

    public C63343Shy(Context context, C62628SJl c62628SJl, AbstractC62631SJo abstractC62631SJo, InterfaceC65352Tig interfaceC65352Tig, Integer num, List list) {
        Method method;
        C09170dP.A05(context);
        C63356SiD.A04(context);
        this.A05 = context;
        this.A00 = null;
        this.A03 = null;
        this.A06 = c62628SJl;
        this.A08 = abstractC62631SJo;
        this.A0C = "RKJSModules/EntryPoints/Ig4aBundle";
        ArrayList A1E = AbstractC166987dD.A1E();
        this.A0E = A1E;
        C0fY.A01(OdexSchemeArtXdex.STATE_PGO_ATTEMPTED, "ReactInstanceManager.initDevSupportManager", 885313570);
        this.A0A = new T0P();
        C0fY.A00(OdexSchemeArtXdex.STATE_PGO_ATTEMPTED, 1902777683);
        this.A0I = num;
        this.A07 = new ComponentCallbacks2C63414Sjs(context);
        this.A09 = interfaceC65352Tig;
        synchronized (A1E) {
            A1E.add(new CoreModulesPackage(this, new T0V(this)));
            A1E.addAll(list);
        }
        STY sty = STY.A00;
        C14360o3.A0B(sty, 0);
        if (C63192Seu.A05 == null) {
            C63192Seu.A05 = new C63192Seu(sty);
        }
        try {
            method = C63343Shy.class.getMethod("handleCxxError", Exception.class);
        } catch (NoSuchMethodException e) {
            C0I2.A05("ReactInstanceHolder", "Failed to set cxx error handler function", e);
            method = null;
        }
        ReactCxxErrorHandler.setHandleErrorFunc(this, method);
    }

    public static synchronized void A01(C63343Shy c63343Shy) {
        synchronized (c63343Shy) {
            Q21 A04 = c63343Shy.A04();
            if (A04 != null) {
                if (c63343Shy.A0I == C05F.A0C) {
                    A04.A08();
                    c63343Shy.A0I = C05F.A01;
                }
                if (c63343Shy.A0I == C05F.A01) {
                    A04.A07 = C05F.A00;
                    Iterator it = A04.A0C.iterator();
                    while (it.hasNext()) {
                        try {
                            ((InterfaceC65542TmH) it.next()).onHostDestroy();
                        } catch (RuntimeException e) {
                            A04.A0D(e);
                        }
                    }
                    A04.A08 = null;
                }
            }
            c63343Shy.A0I = C05F.A00;
        }
    }

    public static void A02(C63343Shy c63343Shy, final InterfaceC65543TmI interfaceC65543TmI) {
        InterfaceC65657Tqj fromBundle;
        Q59 q59 = (Q59) interfaceC65543TmI;
        if (q59.A0I.compareAndSet(0, 1)) {
            C0fY.A01(OdexSchemeArtXdex.STATE_PGO_ATTEMPTED, "attachRootViewToInstance", -1723774482);
            InterfaceC65589TnT A03 = UIManagerHelper.A03(c63343Shy.A0G, q59.A02, true);
            if (A03 != null) {
                Bundle bundle = q59.A04;
                if (q59.A02 == 2) {
                    interfaceC65543TmI.getJSModuleName();
                    if (bundle == null) {
                        new WritableNativeMap();
                    } else {
                        Arguments.fromBundle(bundle);
                    }
                    throw AbstractC43592JPx.A11();
                }
                if (bundle == null) {
                    fromBundle = AbstractC58321PtD.A0c();
                } else {
                    fromBundle = Arguments.fromBundle(bundle);
                }
                final int addRootView = A03.addRootView(q59, fromBundle);
                q59.A01 = addRootView;
                interfaceC65543TmI.ELE();
                Systrace.A04(OdexSchemeArtXdex.STATE_PGO_ATTEMPTED, "pre_rootView.onAttachedToReactInstance", addRootView);
                C63255SgD.A01(new Runnable() { // from class: X.TNh
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i = addRootView;
                        InterfaceC65543TmI interfaceC65543TmI2 = interfaceC65543TmI;
                        Systrace.A06(OdexSchemeArtXdex.STATE_PGO_ATTEMPTED, "pre_rootView.onAttachedToReactInstance", i);
                        Q59 q592 = (Q59) interfaceC65543TmI2;
                        q592.A08 = new SZ4(q592);
                        if (ReactFeatureFlags.dispatchPointerEvents) {
                            q592.A07 = new C63362SiL(q592);
                        }
                        InterfaceC65212Tg2 interfaceC65212Tg2 = q592.A06;
                        if (interfaceC65212Tg2 != null) {
                            IgReactDelegate igReactDelegate = ((C64131Szu) interfaceC65212Tg2).A00;
                            Q21 A04 = C64489TFz.A01(igReactDelegate).A04();
                            if (igReactDelegate.A0B) {
                                if (A04 != null) {
                                    igReactDelegate.A0B = false;
                                } else {
                                    return;
                                }
                            } else if (A04 == null) {
                                return;
                            }
                            ((IgReactDelegate.RCTViewEventEmitter) A04.A03(IgReactDelegate.RCTViewEventEmitter.class)).emit("viewDidAppear", Integer.valueOf(q592.A01));
                        }
                    }
                });
                C0fY.A00(OdexSchemeArtXdex.STATE_PGO_ATTEMPTED, 1856424066);
                return;
            }
            throw AbstractC166987dD.A14("Unable to attach a rootView to ReactInstance when UIManager is not properly initialized.");
        }
    }

    public static void A00(final C62543SFu c62543SFu, final C63343Shy c63343Shy) {
        AbstractC05810Sj.A03(!c63343Shy.A0L, "Cannot create a new React context on an invalidated ReactInstanceManager");
        ReactMarker.logMarker(RhX.A1X);
        java.util.Set set = c63343Shy.A0F;
        synchronized (set) {
            synchronized (c63343Shy.A0B) {
                if (c63343Shy.A0G != null) {
                    Q21 q21 = c63343Shy.A0G;
                    if (c63343Shy.A0I == C05F.A0C) {
                        q21.A08();
                    }
                    Iterator it = set.iterator();
                    while (it.hasNext()) {
                        A03(q21, (InterfaceC65543TmI) it.next());
                    }
                    c63343Shy.A07.A00.remove(q21.A02());
                    q21.A06();
                    c63343Shy.A0G = null;
                }
            }
        }
        c63343Shy.A0J = new Thread(null, new Runnable() { // from class: X.TNg
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r3v0, types: [X.Q21, X.R3M, java.lang.Object, X.R3L] */
            /* JADX WARN: Type inference failed for: r5v9, types: [com.facebook.react.bridge.ReactInstanceManagerInspectorTarget$TargetDelegate, java.lang.Object, X.T0D] */
            /* JADX WARN: Type inference failed for: r8v21, types: [com.instagram.react.impl.IgReactPackage$$ReactModuleInfoProvider, java.lang.Object] */
            @Override // java.lang.Runnable
            public final void run() {
                RhX rhX;
                C62481SDi c62481SDi;
                C62483SDk c62483SDk;
                ReactInstanceManagerInspectorTarget reactInstanceManagerInspectorTarget;
                Iterable<ModuleHolder> iterable;
                InterfaceC65356Tik interfaceC65356Tik;
                final C63343Shy c63343Shy2 = c63343Shy;
                C62543SFu c62543SFu2 = c62543SFu;
                ReactMarker.logMarker(RhX.A1Y);
                synchronized (c63343Shy2.A0H) {
                    while (c63343Shy2.A0H.booleanValue()) {
                        try {
                            c63343Shy2.A0H.wait();
                        } catch (InterruptedException unused) {
                        }
                    }
                }
                c63343Shy2.A0K = true;
                try {
                    Process.setThreadPriority(-4);
                    ReactMarker.logMarker(RhX.A1r);
                    C0JA.A00();
                    JavaScriptExecutor javaScriptExecutor = new JavaScriptExecutor(HermesExecutor.initHybridDefaultConfig(null, 0.0d));
                    AbstractC62631SJo abstractC62631SJo = c62543SFu2.A01;
                    ReactMarker.logMarker(RhX.A0P, "HermesExecutor", 0);
                    final ?? q212 = new Q21(c63343Shy2.A05.getApplicationContext());
                    q212.A01 = false;
                    InterfaceC65352Tig interfaceC65352Tig = c63343Shy2.A09;
                    if (interfaceC65352Tig == null) {
                        interfaceC65352Tig = c63343Shy2.A0A;
                    }
                    q212.A01 = interfaceC65352Tig;
                    List<InterfaceC65493TlF> list = c63343Shy2.A0E;
                    HashMap A1G = AbstractC166987dD.A1G();
                    ReactMarker.logMarker(RhX.A1R);
                    synchronized (list) {
                        try {
                            for (InterfaceC65493TlF interfaceC65493TlF : list) {
                                C0fY.A01(OdexSchemeArtXdex.STATE_PGO_ATTEMPTED, "createAndProcessCustomReactPackage", -224461906);
                                try {
                                    AbstractC09720ep A00 = SystraceMessage.A00(SystraceMessage.A00, "processPackage", OdexSchemeArtXdex.STATE_PGO_ATTEMPTED);
                                    A00.A00(AbstractC31173DnH.A0q(interfaceC65493TlF), "className");
                                    A00.A02();
                                    boolean z = interfaceC65493TlF instanceof CoreModulesPackage;
                                    if (z) {
                                        ReactMarker.logMarker(RhX.A1N);
                                    }
                                    if (interfaceC65493TlF instanceof LazyReactPackage) {
                                        LazyReactPackage lazyReactPackage = (LazyReactPackage) interfaceC65493TlF;
                                        iterable = new C64533TIp(1, lazyReactPackage, new Object().Bkd(), lazyReactPackage.A01(q212));
                                    } else if (interfaceC65493TlF instanceof AbstractC64130Szs) {
                                        AbstractC64130Szs abstractC64130Szs = (AbstractC64130Szs) interfaceC65493TlF;
                                        if (abstractC64130Szs instanceof DebugCorePackage) {
                                            final HashMap A1G2 = AbstractC166987dD.A1G();
                                            AbstractC64130Szs.A00(A1G2, new Class[]{JSCHeapCapture.class}, 0);
                                            interfaceC65356Tik = new InterfaceC65356Tik() { // from class: X.T0U
                                                @Override // X.InterfaceC65356Tik
                                                public final Map Bkd() {
                                                    return A1G2;
                                                }
                                            };
                                        } else {
                                            int i = 0;
                                            Class[] clsArr = {AndroidInfoModule.class, DeviceEventManagerModule.class, DeviceInfoModule.class, DevMenuModule.class, DevSettingsModule.class, ExceptionsManagerModule.class, LogBoxModule.class, HeadlessJsTaskSupportModule.class, SourceCodeModule.class, TimingModule.class, UIManagerModule.class};
                                            final HashMap A1G3 = AbstractC166987dD.A1G();
                                            do {
                                                AbstractC64130Szs.A00(A1G3, clsArr, i);
                                                i++;
                                            } while (i < 11);
                                            interfaceC65356Tik = new InterfaceC65356Tik() { // from class: X.T0T
                                                @Override // X.InterfaceC65356Tik
                                                public final Map Bkd() {
                                                    return A1G3;
                                                }
                                            };
                                        }
                                        iterable = new C64533TIp(0, abstractC64130Szs, q212, AbstractC166997dE.A15(interfaceC65356Tik.Bkd()));
                                    } else {
                                        final List AMb = interfaceC65493TlF.AMb(q212);
                                        iterable = new Iterable() { // from class: X.Wpj
                                            @Override // java.lang.Iterable
                                            public final Iterator iterator() {
                                                return new C71661WyD(AMb);
                                            }
                                        };
                                    }
                                    for (ModuleHolder moduleHolder : iterable) {
                                        String str = moduleHolder.mName;
                                        if (A1G.containsKey(str)) {
                                            ModuleHolder moduleHolder2 = (ModuleHolder) A1G.get(str);
                                            if (moduleHolder.mReactModuleInfo.A02) {
                                                A1G.remove(moduleHolder2);
                                            } else {
                                                throw AbstractC166987dD.A14(AnonymousClass001.A11("Native module ", str, " tried to override ", moduleHolder2.mReactModuleInfo.A00, ". Check the getPackages() method in MainApplication.java, it might be that module is being created twice. If this was your intention, set canOverrideExistingModule=true. This error may also be present if the package is present only once in getPackages() but is also automatically added later during build time by autolinking. Try removing the existing entry and rebuild."));
                                            }
                                        }
                                        A1G.put(str, moduleHolder);
                                    }
                                    if (z) {
                                        ReactMarker.logMarker(RhX.A1M);
                                    }
                                    AbstractC58322PtE.A15();
                                    C0fY.A00(OdexSchemeArtXdex.STATE_PGO_ATTEMPTED, -1777810285);
                                } catch (Throwable th) {
                                    C0fY.A00(OdexSchemeArtXdex.STATE_PGO_ATTEMPTED, 2141200563);
                                    throw th;
                                }
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    ReactMarker.logMarker(RhX.A1Q);
                    ReactMarker.logMarker(RhX.A07);
                    C0fY.A01(OdexSchemeArtXdex.STATE_PGO_ATTEMPTED, "buildNativeModuleRegistry", -1765264759);
                    try {
                        c62481SDi = new C62481SDi(q212, A1G);
                        C0fY.A00(OdexSchemeArtXdex.STATE_PGO_ATTEMPTED, -1175681537);
                        ReactMarker.logMarker(RhX.A06);
                        Integer num = C05F.A01;
                        c62483SDk = new C62483SDk(new SWC(num, "native_modules"), new SWC(num, "js"));
                        if (c63343Shy2.A02 == null && InspectorFlags.getFuseboxEnabled()) {
                            ReactInstanceManagerInspectorTarget reactInstanceManagerInspectorTarget2 = ReactInstanceManagerInspectorTarget.$redex_init_class;
                            ?? obj = new Object();
                            obj.A00 = AbstractC25225BEi.A16(c63343Shy2);
                            c63343Shy2.A02 = new ReactInstanceManagerInspectorTarget(obj);
                        }
                        reactInstanceManagerInspectorTarget = c63343Shy2.A02;
                        ReactMarker.logMarker(RhX.A0F);
                        C0fY.A01(OdexSchemeArtXdex.STATE_PGO_ATTEMPTED, "createCatalystInstance", 1387698763);
                    } catch (Throwable th3) {
                        th = th3;
                        C0fY.A00(OdexSchemeArtXdex.STATE_PGO_ATTEMPTED, 1025245346);
                        rhX = RhX.A06;
                    }
                    try {
                        AtomicInteger atomicInteger = CatalystInstanceImpl.sNextInstanceIdForTrace;
                        AbstractC05810Sj.A00(abstractC62631SJo);
                        AbstractC05810Sj.A00(interfaceC65352Tig);
                        CatalystInstanceImpl catalystInstanceImpl = new CatalystInstanceImpl(c62483SDk, javaScriptExecutor, c62481SDi, abstractC62631SJo, interfaceC65352Tig, reactInstanceManagerInspectorTarget);
                        C0fY.A00(OdexSchemeArtXdex.STATE_PGO_ATTEMPTED, 60289572);
                        ReactMarker.logMarker(RhX.A0E);
                        if (q212.A00 == null) {
                            if (q212.A01) {
                                ReactSoftExceptionLogger.logSoftException("BridgeReactContext", AbstractC166987dD.A14("Cannot initialize ReactContext after it has been destroyed."));
                            }
                            q212.A00 = catalystInstanceImpl;
                            q212.A0C(catalystInstanceImpl.mReactQueueConfiguration);
                            q212.A02 = new SBM();
                            catalystInstanceImpl.getRuntimeScheduler();
                            C62856SUd.A00.useTurboModules();
                            if (Systrace.A0E(134348800L)) {
                                catalystInstanceImpl.setGlobalVariable("__RCTProfileIsProfiling", "true");
                            }
                            ReactMarker.logMarker(RhX.A1J);
                            C0fY.A01(OdexSchemeArtXdex.STATE_PGO_ATTEMPTED, "runJSBundle", -1779549206);
                            AbstractC05810Sj.A03(!catalystInstanceImpl.mJSBundleHasLoaded, "JS bundle was already loaded!");
                            catalystInstanceImpl.mJSBundleLoader.A00(catalystInstanceImpl);
                            synchronized (catalystInstanceImpl.mJSCallsPendingInitLock) {
                                try {
                                    catalystInstanceImpl.mAcceptCalls = true;
                                    Iterator it2 = catalystInstanceImpl.mJSCallsPendingInit.iterator();
                                    while (it2.hasNext()) {
                                        C61594RqI c61594RqI = (C61594RqI) it2.next();
                                        NativeArray nativeArray = c61594RqI.A00;
                                        if (nativeArray == null) {
                                            nativeArray = new WritableNativeArray();
                                        }
                                        catalystInstanceImpl.jniCallJSFunction(c61594RqI.A02, c61594RqI.A01, nativeArray);
                                    }
                                    catalystInstanceImpl.mJSCallsPendingInit.clear();
                                    catalystInstanceImpl.mJSBundleHasLoaded = true;
                                } catch (Throwable th4) {
                                    throw th4;
                                }
                            }
                            C0ev.A01(catalystInstanceImpl.mTraceListener);
                            C0fY.A00(OdexSchemeArtXdex.STATE_PGO_ATTEMPTED, 428111720);
                            try {
                                c63343Shy2.A0J = null;
                                ReactMarker.logMarker(RhX.A1L);
                                Runnable runnable = new Runnable() { // from class: X.TKS
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        C63343Shy c63343Shy3 = C63343Shy.this;
                                        C62543SFu c62543SFu3 = c63343Shy3.A01;
                                        if (c62543SFu3 != null) {
                                            C63343Shy.A00(c62543SFu3, c63343Shy3);
                                            c63343Shy3.A01 = null;
                                        }
                                    }
                                };
                                Q21.A00(q212, new Runnable() { // from class: X.TNf
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        final C63343Shy c63343Shy3 = C63343Shy.this;
                                        final R3M r3m = q212;
                                        try {
                                            ReactMarker.logMarker(RhX.A1K);
                                            ReactMarker.logMarker(RhX.A1m);
                                            C0fY.A01(OdexSchemeArtXdex.STATE_PGO_ATTEMPTED, "setupReactContext", -1122308870);
                                            java.util.Set set2 = c63343Shy3.A0F;
                                            synchronized (set2) {
                                                synchronized (c63343Shy3.A0B) {
                                                    AbstractC05810Sj.A00(r3m);
                                                    c63343Shy3.A0G = r3m;
                                                }
                                                CatalystInstance A02 = r3m.A02();
                                                AbstractC05810Sj.A00(A02);
                                                final CatalystInstanceImpl catalystInstanceImpl2 = (CatalystInstanceImpl) A02;
                                                AbstractC05810Sj.A03(!catalystInstanceImpl2.mInitialized, "This catalyst instance has already been initialized");
                                                AbstractC05810Sj.A03(catalystInstanceImpl2.mAcceptCalls, "RunJSBundle hasn't completed.");
                                                catalystInstanceImpl2.mInitialized = true;
                                                catalystInstanceImpl2.mNativeModulesQueueThread.runOnQueue(new Runnable() { // from class: X.TKZ
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        C62481SDi c62481SDi2 = CatalystInstanceImpl.this.mNativeModuleRegistry;
                                                        R3M r3m2 = c62481SDi2.A00;
                                                        if (r3m2.A09) {
                                                            MessageQueueThread messageQueueThread = r3m2.A04;
                                                            AbstractC05810Sj.A00(messageQueueThread);
                                                            messageQueueThread.assertIsOnThread("From version React Native v0.44, native modules are explicitly not initialized on the UI thread.");
                                                            ReactMarker.logMarker(RhX.A18);
                                                            C0fY.A01(OdexSchemeArtXdex.STATE_PGO_ATTEMPTED, "NativeModuleRegistry_notifyJSInstanceInitialized", 1763277720);
                                                            try {
                                                                Iterator A16 = AbstractC166997dE.A16(c62481SDi2.A01);
                                                                while (A16.hasNext()) {
                                                                    ((ModuleHolder) A16.next()).markInitializable();
                                                                }
                                                                C0fY.A00(OdexSchemeArtXdex.STATE_PGO_ATTEMPTED, 588637043);
                                                                ReactMarker.logMarker(RhX.A17);
                                                                return;
                                                            } catch (Throwable th5) {
                                                                C0fY.A00(OdexSchemeArtXdex.STATE_PGO_ATTEMPTED, -1508065495);
                                                                ReactMarker.logMarker(RhX.A17);
                                                                throw th5;
                                                            }
                                                        }
                                                        throw AbstractC166987dD.A14("Tried to call assertOnNativeModulesQueueThread(message) on an uninitialized ReactContext");
                                                    }
                                                });
                                                CopyOnWriteArrayList copyOnWriteArrayList = c63343Shy3.A07.A00;
                                                if (!copyOnWriteArrayList.contains(A02)) {
                                                    copyOnWriteArrayList.add(A02);
                                                }
                                                ReactMarker.logMarker(RhX.A05);
                                                Iterator it3 = set2.iterator();
                                                while (it3.hasNext()) {
                                                    C63343Shy.A02(c63343Shy3, (InterfaceC65543TmI) it3.next());
                                                }
                                                ReactMarker.logMarker(RhX.A04);
                                            }
                                            Collection collection = c63343Shy3.A0D;
                                            final Tg1[] tg1Arr = (Tg1[]) collection.toArray(new Tg1[collection.size()]);
                                            C63255SgD.A01(new Runnable() { // from class: X.TPs
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    C63343Shy c63343Shy4 = C63343Shy.this;
                                                    Tg1[] tg1Arr2 = tg1Arr;
                                                    synchronized (c63343Shy4) {
                                                        Integer num2 = c63343Shy4.A0I;
                                                        Integer num3 = C05F.A0C;
                                                        if (num2 == num3) {
                                                            Q21 A04 = c63343Shy4.A04();
                                                            if (A04 != null) {
                                                                A04.A09(c63343Shy4.A00);
                                                            }
                                                            c63343Shy4.A0I = num3;
                                                        }
                                                    }
                                                    for (Tg1 tg1 : tg1Arr2) {
                                                        if (tg1 != null) {
                                                            IgReactDelegate igReactDelegate = ((C64129Szr) tg1).A00;
                                                            FrameLayout frameLayout = igReactDelegate.mFrameLayout;
                                                            if (!igReactDelegate.A09 && frameLayout != null) {
                                                                frameLayout.removeView(igReactDelegate.mLoadingIndicator);
                                                                IgReactDelegate.A00(igReactDelegate);
                                                                C64489TFz.A01(igReactDelegate).A0D.remove(igReactDelegate.A02);
                                                                igReactDelegate.A02 = null;
                                                            }
                                                        }
                                                    }
                                                }
                                            });
                                            Runnable runnable2 = new Runnable() { // from class: X.TIy
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    Process.setThreadPriority(0);
                                                    ReactMarker.logMarker(RhX.A0A, "js_default", 0);
                                                }
                                            };
                                            MessageQueueThread messageQueueThread = r3m.A03;
                                            AbstractC05810Sj.A00(messageQueueThread);
                                            messageQueueThread.runOnQueue(runnable2);
                                            Q21.A00(r3m, new Runnable() { // from class: X.TIz
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    Process.setThreadPriority(0);
                                                }
                                            });
                                            C0fY.A00(OdexSchemeArtXdex.STATE_PGO_ATTEMPTED, -1133743366);
                                            ReactMarker.logMarker(RhX.A1l);
                                            ReactMarker.logMarker(RhX.A1W);
                                        } catch (Exception e) {
                                            c63343Shy3.A0A.handleException(e);
                                            throw null;
                                        }
                                    }
                                });
                                C63255SgD.A01(runnable);
                            } catch (Exception e) {
                                c63343Shy2.A0A.handleException(e);
                                throw null;
                            }
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        C0fY.A00(OdexSchemeArtXdex.STATE_PGO_ATTEMPTED, -1765565825);
                        rhX = RhX.A0E;
                        ReactMarker.logMarker(rhX);
                        throw th;
                    }
                } catch (Exception e2) {
                    c63343Shy2.A0K = false;
                    c63343Shy2.A0J = null;
                    c63343Shy2.A0A.handleException(e2);
                    throw null;
                }
            }
        }, "create_react_context");
        ReactMarker.logMarker(RhX.A1Z);
        c63343Shy.A0J.start();
    }

    public static void A03(Q21 q21, InterfaceC65543TmI interfaceC65543TmI) {
        Q59 q59 = (Q59) interfaceC65543TmI;
        AtomicInteger atomicInteger = q59.A0I;
        if (atomicInteger.compareAndSet(1, 0)) {
            if (q59.A02 == 2) {
                if (q59.A01 != -1) {
                    if (UIManagerHelper.A03(q21, 2, true) != null) {
                        throw AbstractC43592JPx.A11();
                    }
                    C0I2.A04("ReactNative", "Failed to stop surface, UIManager has already gone away");
                } else {
                    ReactSoftExceptionLogger.logSoftException("ReactInstanceManager", AbstractC166987dD.A18("detachRootViewFromInstance called with ReactRootView with invalid id"));
                }
                atomicInteger.compareAndSet(1, 0);
                q59.removeAllViews();
                q59.setId(-1);
                return;
            }
            ((AppRegistry) q21.A02().getJSModule(AppRegistry.class)).unmountApplicationComponentAtRootTag(q59.A01);
        }
    }

    public final Q21 A04() {
        Q21 q21;
        synchronized (this.A0B) {
            q21 = this.A0G;
        }
        return q21;
    }

    public final void A05() {
        if (!this.A0K) {
            this.A0K = true;
            C62543SFu c62543SFu = new C62543SFu(this.A06, this, this.A08);
            if (this.A0J == null) {
                A00(c62543SFu, this);
            } else {
                this.A01 = c62543SFu;
            }
        }
    }

    public void handleCxxError(Exception exc) {
        this.A0A.handleException(exc);
        throw null;
    }
}
