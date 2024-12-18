package com.facebook.react.bridge;

import X.AbstractC05810Sj;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC25225BEi;
import X.AbstractC58318PtA;
import X.AbstractC62631SJo;
import X.AnonymousClass001;
import X.C00O;
import X.C0I2;
import X.C0ev;
import X.C0f2;
import X.C0f4;
import X.C0fY;
import X.C62481SDi;
import X.C62483SDk;
import X.C62544SFv;
import X.C62856SUd;
import X.C64738TRw;
import X.InterfaceC65214Tg5;
import X.InterfaceC65352Tig;
import X.MSW;
import X.RhX;
import X.Rl6;
import X.SBH;
import X.SBJ;
import X.STV;
import X.SWC;
import X.T23;
import android.content.res.AssetManager;
import android.os.Looper;
import com.facebook.common.dextricks.OdexSchemeArtXdex;
import com.facebook.jni.HybridData;
import com.facebook.react.bridge.CatalystInstanceImpl;
import com.facebook.react.bridge.ModuleHolder;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.queue.MessageQueueThread;
import com.facebook.react.bridge.queue.MessageQueueThreadImpl;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.turbomodule.core.CallInvokerHolderImpl;
import com.facebook.react.turbomodule.core.NativeMethodCallInvokerHolderImpl;
import com.facebook.react.uimanager.UIManagerModule;
import java.lang.ref.WeakReference;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes10.dex */
public class CatalystInstanceImpl implements CatalystInstance {
    public static final AtomicInteger sNextInstanceIdForTrace;
    public final CopyOnWriteArrayList mBridgeIdleListeners;
    public final HybridData mHybridData;
    public ReactInstanceManagerInspectorTarget mInspectorTarget;
    public boolean mJSBundleHasLoaded;
    public final AbstractC62631SJo mJSBundleLoader;
    public final InterfaceC65352Tig mJSExceptionHandler;
    public final SBJ mJSModuleRegistry;
    public Rl6 mJavaScriptContextHolder;
    public final C62481SDi mNativeModuleRegistry;
    public final MessageQueueThread mNativeModulesQueueThread;
    public final C62544SFv mReactQueueConfiguration;
    public String mSourceURL;
    public final C0f2 mTraceListener;
    public final AtomicInteger mPendingJSCalls = MSW.A1C(0);
    public final String mJsPendingCallsTitleForTrace = AnonymousClass001.A0O("pending_js_calls_instance", sNextInstanceIdForTrace.getAndIncrement());
    public volatile boolean mDestroyed = false;
    public final ArrayList mJSCallsPendingInit = AbstractC166987dD.A1E();
    public final Object mJSCallsPendingInitLock = AbstractC58318PtA.A0b();
    public boolean mInitialized = false;
    public volatile boolean mAcceptCalls = false;

    /* loaded from: classes10.dex */
    public class InstanceCallback {
        public final WeakReference mOuter;

        public static /* synthetic */ void lambda$onBatchComplete$0(CatalystInstanceImpl catalystInstanceImpl) {
            boolean A1W;
            AtomicInteger atomicInteger = CatalystInstanceImpl.sNextInstanceIdForTrace;
            ModuleHolder moduleHolder = (ModuleHolder) catalystInstanceImpl.mNativeModuleRegistry.A01.get(UIManagerModule.NAME);
            if (moduleHolder != null) {
                synchronized (moduleHolder) {
                    A1W = AbstractC167007dF.A1W(moduleHolder.mModule);
                }
                if (A1W) {
                    ((UIManagerModule) moduleHolder.getModule()).onBatchComplete();
                }
            }
        }

        public void decrementPendingJSCalls() {
            final CatalystInstanceImpl catalystInstanceImpl = (CatalystInstanceImpl) this.mOuter.get();
            if (catalystInstanceImpl != null) {
                AtomicInteger atomicInteger = CatalystInstanceImpl.sNextInstanceIdForTrace;
                int decrementAndGet = catalystInstanceImpl.mPendingJSCalls.decrementAndGet();
                boolean A1N = AbstractC167007dF.A1N(decrementAndGet);
                com.facebook.systrace.Systrace.A08(OdexSchemeArtXdex.STATE_PGO_ATTEMPTED, catalystInstanceImpl.mJsPendingCallsTitleForTrace, decrementAndGet);
                if (A1N && !catalystInstanceImpl.mBridgeIdleListeners.isEmpty()) {
                    catalystInstanceImpl.mNativeModulesQueueThread.runOnQueue(new Runnable() { // from class: X.TKW
                        @Override // java.lang.Runnable
                        public final void run() {
                            Iterator it = CatalystInstanceImpl.this.mBridgeIdleListeners.iterator();
                            if (it.hasNext()) {
                                it.next();
                                throw AbstractC166987dD.A15("onTransitionToBridgeIdle");
                            }
                        }
                    });
                }
            }
        }

        public void incrementPendingJSCalls() {
            final CatalystInstanceImpl catalystInstanceImpl = (CatalystInstanceImpl) this.mOuter.get();
            if (catalystInstanceImpl != null) {
                AtomicInteger atomicInteger = CatalystInstanceImpl.sNextInstanceIdForTrace;
                int andIncrement = catalystInstanceImpl.mPendingJSCalls.getAndIncrement();
                boolean A1N = AbstractC167007dF.A1N(andIncrement);
                com.facebook.systrace.Systrace.A08(OdexSchemeArtXdex.STATE_PGO_ATTEMPTED, catalystInstanceImpl.mJsPendingCallsTitleForTrace, andIncrement + 1);
                if (A1N && !catalystInstanceImpl.mBridgeIdleListeners.isEmpty()) {
                    catalystInstanceImpl.mNativeModulesQueueThread.runOnQueue(new Runnable() { // from class: X.TKa
                        @Override // java.lang.Runnable
                        public final void run() {
                            Iterator it = CatalystInstanceImpl.this.mBridgeIdleListeners.iterator();
                            if (it.hasNext()) {
                                it.next();
                                throw AbstractC166987dD.A15("onTransitionToBridgeBusy");
                            }
                        }
                    });
                }
            }
        }

        public void onBatchComplete() {
            final CatalystInstanceImpl catalystInstanceImpl = (CatalystInstanceImpl) this.mOuter.get();
            if (catalystInstanceImpl != null) {
                AtomicInteger atomicInteger = CatalystInstanceImpl.sNextInstanceIdForTrace;
                catalystInstanceImpl.mNativeModulesQueueThread.runOnQueue(new Runnable() { // from class: X.TKb
                    @Override // java.lang.Runnable
                    public final void run() {
                        CatalystInstanceImpl.InstanceCallback.lambda$onBatchComplete$0(CatalystInstanceImpl.this);
                    }
                });
            }
        }

        public InstanceCallback(CatalystInstanceImpl catalystInstanceImpl) {
            this.mOuter = AbstractC25225BEi.A16(catalystInstanceImpl);
        }
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [X.Rl6, java.lang.Object] */
    public CatalystInstanceImpl(C62483SDk c62483SDk, JavaScriptExecutor javaScriptExecutor, C62481SDi c62481SDi, AbstractC62631SJo abstractC62631SJo, InterfaceC65352Tig interfaceC65352Tig, ReactInstanceManagerInspectorTarget reactInstanceManagerInspectorTarget) {
        C0fY.A01(OdexSchemeArtXdex.STATE_PGO_ATTEMPTED, "createCatalystInstanceImpl", -1708221279);
        this.mHybridData = initHybrid();
        SBH sbh = new SBH(this);
        C62544SFv c62544SFv = new C62544SFv(MessageQueueThreadImpl.A00(sbh, SWC.A02), MessageQueueThreadImpl.A00(sbh, c62483SDk.A01), MessageQueueThreadImpl.A00(sbh, c62483SDk.A00));
        this.mReactQueueConfiguration = c62544SFv;
        this.mBridgeIdleListeners = new CopyOnWriteArrayList();
        this.mNativeModuleRegistry = c62481SDi;
        this.mJSModuleRegistry = new SBJ();
        this.mJSBundleLoader = abstractC62631SJo;
        this.mJSExceptionHandler = interfaceC65352Tig;
        MessageQueueThread messageQueueThread = c62544SFv.A01;
        this.mNativeModulesQueueThread = messageQueueThread;
        this.mTraceListener = new T23(this);
        this.mInspectorTarget = reactInstanceManagerInspectorTarget;
        C0fY.A00(OdexSchemeArtXdex.STATE_PGO_ATTEMPTED, -104626886);
        C0fY.A01(OdexSchemeArtXdex.STATE_PGO_ATTEMPTED, "initializeCxxBridge", 1677961192);
        InstanceCallback instanceCallback = new InstanceCallback(this);
        MessageQueueThread messageQueueThread2 = c62544SFv.A00;
        ArrayList A1E = AbstractC166987dD.A1E();
        Map map = c62481SDi.A01;
        Iterator A15 = AbstractC166997dE.A15(map);
        while (A15.hasNext()) {
            Map.Entry A1K = AbstractC166987dD.A1K(A15);
            if (!((ModuleHolder) A1K.getValue()).mReactModuleInfo.A04) {
                A1E.add(new JavaModuleWrapper(this, (ModuleHolder) A1K.getValue()));
            }
        }
        ArrayList A1E2 = AbstractC166987dD.A1E();
        Iterator A152 = AbstractC166997dE.A15(map);
        while (A152.hasNext()) {
            Map.Entry A1K2 = AbstractC166987dD.A1K(A152);
            if (((ModuleHolder) A1K2.getValue()).mReactModuleInfo.A04) {
                A1E2.add(A1K2.getValue());
            }
        }
        initializeBridge(instanceCallback, javaScriptExecutor, messageQueueThread2, messageQueueThread, A1E, A1E2, this.mInspectorTarget);
        C0fY.A00(OdexSchemeArtXdex.STATE_PGO_ATTEMPTED, 992871011);
        getJavaScriptContext();
        this.mJavaScriptContextHolder = new Object();
    }

    private native long getJavaScriptContext();

    public static native HybridData initHybrid();

    private native void initializeBridge(InstanceCallback instanceCallback, JavaScriptExecutor javaScriptExecutor, MessageQueueThread messageQueueThread, MessageQueueThread messageQueueThread2, Collection collection, Collection collection2, ReactInstanceManagerInspectorTarget reactInstanceManagerInspectorTarget);

    private native void jniCallJSCallback(int i, NativeArray nativeArray);

    /* JADX INFO: Access modifiers changed from: private */
    public native void jniCallJSFunction(String str, String str2, NativeArray nativeArray);

    private native void jniExtendNativeModules(Collection collection, Collection collection2);

    private native void jniHandleMemoryPressure(int i);

    private native void jniLoadScriptFromAssets(AssetManager assetManager, String str, boolean z);

    private native void jniLoadScriptFromFile(String str, String str2, boolean z);

    private native void jniRegisterSegment(int i, String str);

    private native void jniSetSourceURL(String str);

    private native void unregisterFromInspector();

    public native CallInvokerHolderImpl getJSCallInvokerHolder();

    public native NativeMethodCallInvokerHolderImpl getNativeMethodCallInvokerHolder();

    public native RuntimeExecutor getRuntimeExecutor();

    public native RuntimeScheduler getRuntimeScheduler();

    public native void setGlobalVariable(String str, String str2);

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, X.RqI] */
    @Override // com.facebook.react.bridge.CatalystInstance
    public void callFunction(String str, String str2, NativeArray nativeArray) {
        ?? obj = new Object();
        obj.A02 = str;
        obj.A01 = str2;
        obj.A00 = nativeArray;
        if (this.mDestroyed) {
            C0I2.A04("ReactNative", AnonymousClass001.A0R("Calling JS function after bridge has been destroyed: ", obj.toString()));
            return;
        }
        if (!this.mAcceptCalls) {
            synchronized (this.mJSCallsPendingInitLock) {
                if (!this.mAcceptCalls) {
                    this.mJSCallsPendingInit.add(obj);
                    return;
                }
            }
        }
        NativeArray nativeArray2 = obj.A00;
        if (nativeArray2 == null) {
            nativeArray2 = new WritableNativeArray();
        }
        jniCallJSFunction(obj.A02, obj.A01, nativeArray2);
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public void destroy() {
        if (!this.mDestroyed) {
            ReactInstanceManagerInspectorTarget reactInstanceManagerInspectorTarget = this.mInspectorTarget;
            if (reactInstanceManagerInspectorTarget != null) {
                AbstractC05810Sj.A03(reactInstanceManagerInspectorTarget.mHybridData.isValid(), "ReactInstanceManager inspector target destroyed before instance was unregistered");
            }
            unregisterFromInspector();
            ReactMarker.logMarker(RhX.A0X);
            this.mDestroyed = true;
            this.mNativeModulesQueueThread.runOnQueue(new Runnable() { // from class: X.TKU
                @Override // java.lang.Runnable
                public final void run() {
                    final CatalystInstanceImpl catalystInstanceImpl = CatalystInstanceImpl.this;
                    C62481SDi c62481SDi = catalystInstanceImpl.mNativeModuleRegistry;
                    c62481SDi.A00.A07();
                    C0fY.A01(OdexSchemeArtXdex.STATE_PGO_ATTEMPTED, "NativeModuleRegistry_notifyJSInstanceDestroy", -1996504252);
                    try {
                        Iterator A16 = AbstractC166997dE.A16(c62481SDi.A01);
                        while (A16.hasNext()) {
                            ModuleHolder moduleHolder = (ModuleHolder) A16.next();
                            synchronized (moduleHolder) {
                                NativeModule nativeModule = moduleHolder.mModule;
                                if (nativeModule != null) {
                                    nativeModule.invalidate();
                                }
                            }
                        }
                        C0fY.A00(OdexSchemeArtXdex.STATE_PGO_ATTEMPTED, -2141050097);
                        boolean z = false;
                        if (catalystInstanceImpl.mPendingJSCalls.getAndSet(0) == 0) {
                            z = true;
                        }
                        if (!catalystInstanceImpl.mBridgeIdleListeners.isEmpty()) {
                            Iterator it = catalystInstanceImpl.mBridgeIdleListeners.iterator();
                            if (it.hasNext()) {
                                it.next();
                                if (!z) {
                                    throw AbstractC166987dD.A15("onTransitionToBridgeIdle");
                                }
                                throw AbstractC166987dD.A15("onBridgeDestroyed");
                            }
                        }
                        catalystInstanceImpl.mReactQueueConfiguration.A00.runOnQueue(new Runnable() { // from class: X.TKV
                            @Override // java.lang.Runnable
                            public final void run() {
                                final CatalystInstanceImpl catalystInstanceImpl2 = CatalystInstanceImpl.this;
                                new Thread(new Runnable() { // from class: X.TKX
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        CatalystInstanceImpl catalystInstanceImpl3 = CatalystInstanceImpl.this;
                                        synchronized (catalystInstanceImpl3.mJavaScriptContextHolder) {
                                        }
                                        catalystInstanceImpl3.mHybridData.resetNative();
                                        C62544SFv c62544SFv = catalystInstanceImpl3.mReactQueueConfiguration;
                                        MessageQueueThreadImpl messageQueueThreadImpl = c62544SFv.A01;
                                        if (messageQueueThreadImpl.A00 != Looper.getMainLooper()) {
                                            messageQueueThreadImpl.quitSynchronous();
                                        }
                                        MessageQueueThreadImpl messageQueueThreadImpl2 = c62544SFv.A00;
                                        if (messageQueueThreadImpl2.A00 != Looper.getMainLooper()) {
                                            messageQueueThreadImpl2.quitSynchronous();
                                        }
                                        C0I2.A04("ReactNative", "CatalystInstanceImpl.destroy() end");
                                        ReactMarker.logMarker(RhX.A0W);
                                    }
                                }, "destroy_react_context").start();
                            }
                        });
                    } catch (Throwable th) {
                        C0fY.A00(OdexSchemeArtXdex.STATE_PGO_ATTEMPTED, -1666469188);
                        throw th;
                    }
                }
            });
            C0f2 c0f2 = this.mTraceListener;
            String[][] strArr = com.facebook.systrace.Systrace.A03;
            C0f4 c0f4 = C0ev.A01;
            synchronized (c0f4.A01) {
                c0f4.A02.remove(c0f2);
                if (c0f4.A00) {
                    c0f2.DuT();
                }
            }
        }
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public JavaScriptModule getJSModule(Class cls) {
        JavaScriptModule javaScriptModule;
        SBJ sbj = this.mJSModuleRegistry;
        synchronized (sbj) {
            HashMap hashMap = sbj.A00;
            javaScriptModule = (JavaScriptModule) hashMap.get(cls);
            if (javaScriptModule == null) {
                javaScriptModule = (JavaScriptModule) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new C64738TRw(this, cls));
                hashMap.put(cls, javaScriptModule);
            }
        }
        return javaScriptModule;
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public NativeModule getNativeModule(Class cls) {
        ReactModule reactModule = (ReactModule) cls.getAnnotation(ReactModule.class);
        if (reactModule != null) {
            String name = reactModule.name();
            if (C62856SUd.A00.useTurboModules()) {
                AbstractC05810Sj.A01(null, "TurboModules are enabled, but mTurboModuleRegistry hasn't been set.");
                throw C00O.createAndThrow();
            }
            if (!this.mNativeModuleRegistry.A01.containsKey(name)) {
                return null;
            }
            Object obj = this.mNativeModuleRegistry.A01.get(name);
            AbstractC05810Sj.A01(obj, AnonymousClass001.A0R("Could not find module with name ", name));
            return ((ModuleHolder) obj).getModule();
        }
        throw AbstractC167007dF.A0c("Could not find @ReactModule annotation in ", cls.getCanonicalName());
    }

    @Override // X.InterfaceC65354Tii
    public void handleMemoryPressure(int i) {
        if (!this.mDestroyed) {
            jniHandleMemoryPressure(i);
        }
    }

    @Override // com.facebook.react.bridge.CatalystInstance, X.InterfaceC65353Tih
    public void invokeCallback(int i, InterfaceC65214Tg5 interfaceC65214Tg5) {
        if (this.mDestroyed) {
            C0I2.A04("ReactNative", "Invoking JS callback after bridge has been destroyed.");
        } else {
            jniCallJSCallback(i, (NativeArray) interfaceC65214Tg5);
        }
    }

    @Override // X.InterfaceC65351Tif
    public void loadScriptFromFile(String str, String str2, boolean z) {
        this.mSourceURL = "Ig4aBundle.js.hbc";
        jniLoadScriptFromFile(str, "Ig4aBundle.js.hbc", false);
    }

    static {
        STV.A00();
        sNextInstanceIdForTrace = MSW.A1C(1);
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public void registerSegment(int i, String str) {
        jniRegisterSegment(i, str);
    }
}
