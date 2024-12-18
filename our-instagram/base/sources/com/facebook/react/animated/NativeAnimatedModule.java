package com.facebook.react.animated;

import X.AbstractC05810Sj;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC58321PtD;
import X.AbstractC61534RpE;
import X.AbstractC62479SDg;
import X.AbstractC62966SZj;
import X.AbstractChoreographerFrameCallbackC63492So6;
import X.C05F;
import X.C1EM;
import X.C60521R2l;
import X.C60522R2m;
import X.C60523R2n;
import X.C60524R2o;
import X.C60525R2p;
import X.C62667SLd;
import X.C63192Seu;
import X.C63347Si4;
import X.C64133Szw;
import X.EnumC61159RgK;
import X.InterfaceC65355Tij;
import X.InterfaceC65542TmH;
import X.InterfaceC65589TnT;
import X.MSW;
import X.R2f;
import X.R2j;
import X.R2k;
import X.R3M;
import X.R5K;
import X.T0Z;
import X.T0a;
import X.T0q;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.fbreact.specs.NativeAnimatedModuleSpec;
import com.facebook.forker.Process;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableNativeArray;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.UIManagerModule;
import com.instagram.react.modules.base.IgReactQEModule;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.atomic.AtomicReference;

@ReactModule(name = NativeAnimatedModuleSpec.NAME)
/* loaded from: classes10.dex */
public class NativeAnimatedModule extends NativeAnimatedModuleSpec implements InterfaceC65542TmH, InterfaceC65355Tij {
    public static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final boolean ANIMATED_MODULE_DEBUG = false;
    public final AbstractChoreographerFrameCallbackC63492So6 mAnimatedFrameCallback;
    public boolean mBatchingControlledByJS;
    public volatile long mCurrentBatchNumber;
    public volatile long mCurrentFrameNumber;
    public boolean mEnqueuedAnimationOnFrame;
    public boolean mInitializedForFabric;
    public boolean mInitializedForNonFabric;
    public final AtomicReference mNodesManager;
    public int mNumFabricAnimations;
    public int mNumNonFabricAnimations;
    public final C62667SLd mOperations;
    public final C62667SLd mPreOperations;
    public final C63192Seu mReactChoreographer;
    public int mUIManagerType;

    /* JADX INFO: Access modifiers changed from: private */
    public void decrementInFlightAnimationsForViewTag(int i) {
        if ((i % 2 != 0 ? (char) 1 : (char) 2) == 2) {
            this.mNumFabricAnimations--;
        } else {
            this.mNumNonFabricAnimations--;
        }
        int i2 = this.mNumNonFabricAnimations;
        if (i2 == 0 && this.mNumFabricAnimations > 0 && this.mUIManagerType != 2) {
            this.mUIManagerType = 2;
        } else {
            if (this.mNumFabricAnimations != 0 || i2 <= 0 || this.mUIManagerType == 1) {
                return;
            }
            this.mUIManagerType = 1;
        }
    }

    private void initializeLifecycleEventListenersForViewTag(int i) {
        boolean z;
        R3M A0b;
        InterfaceC65589TnT A03;
        boolean z2;
        InterfaceC65589TnT A032;
        int i2 = i % 2 != 0 ? 1 : 2;
        this.mUIManagerType = i2;
        if (i2 == 2) {
            this.mNumFabricAnimations++;
        } else {
            this.mNumNonFabricAnimations++;
        }
        C63347Si4 nodesManager = getNodesManager();
        if (nodesManager != null) {
            int i3 = this.mUIManagerType;
            if (i3 == 2) {
                z2 = nodesManager.A00;
            } else {
                z2 = nodesManager.A01;
            }
            if (!z2 && (A032 = UIManagerHelper.A03(nodesManager.A07, i3, true)) != null) {
                ((T0q) ((UIManagerModule) A032).mEventDispatcher).A0B.add(nodesManager);
                if (i3 == 2) {
                    nodesManager.A00 = true;
                } else {
                    nodesManager.A01 = true;
                }
            }
        } else {
            ReactSoftExceptionLogger.logSoftException(NativeAnimatedModuleSpec.NAME, AbstractC166987dD.A18("initializeLifecycleEventListenersForViewTag could not get NativeAnimatedNodesManager"));
        }
        if (this.mUIManagerType == 2) {
            z = this.mInitializedForFabric;
        } else {
            z = this.mInitializedForNonFabric;
        }
        if (!z && (A0b = AbstractC58321PtD.A0b(this)) != null && (A03 = UIManagerHelper.A03(A0b, this.mUIManagerType, true)) != null) {
            A03.addUIManagerEventListener(this);
            if (this.mUIManagerType == 2) {
                this.mInitializedForFabric = true;
            } else {
                this.mInitializedForNonFabric = true;
            }
        }
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void addAnimatedEventToView(double d, String str, ReadableMap readableMap) {
        int i = (int) d;
        initializeLifecycleEventListenersForViewTag(i);
        addOperation(new C60522R2m(this, readableMap, str, i));
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void addListener(String str) {
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void connectAnimatedNodeToView(double d, double d2) {
        int i = (int) d2;
        initializeLifecycleEventListenersForViewTag(i);
        addOperation(new C60521R2l(this, (int) d, i, 2));
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void connectAnimatedNodes(double d, double d2) {
        addOperation(new C60521R2l(this, (int) d, (int) d2, 0));
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void createAnimatedNode(double d, ReadableMap readableMap) {
        addOperation(new C60525R2p(this, readableMap, (int) d, 2));
    }

    public void didMountItems(InterfaceC65589TnT interfaceC65589TnT) {
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void disconnectAnimatedNodeFromView(double d, double d2) {
        int i = (int) d2;
        decrementInFlightAnimationsForViewTag(i);
        addOperation(new C60521R2l(this, (int) d, i, 3));
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void disconnectAnimatedNodes(double d, double d2) {
        addOperation(new C60521R2l(this, (int) d, (int) d2, 1));
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void dropAnimatedNode(double d) {
        addOperation(new R2j(this, (int) d, 5));
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void extractAnimatedNodeOffset(double d) {
        addOperation(new R2j(this, (int) d, 1));
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void finishOperationBatch() {
        this.mBatchingControlledByJS = false;
        this.mCurrentBatchNumber++;
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void flattenAnimatedNodeOffset(double d) {
        addOperation(new R2j(this, (int) d, 0));
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void getValue(double d, Callback callback) {
        addOperation(new C60525R2p(this, callback, (int) d));
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void removeAnimatedEventFromView(double d, String str, double d2) {
        int i = (int) d;
        decrementInFlightAnimationsForViewTag(i);
        addOperation(new C60523R2n(this, str, i, (int) d2));
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void removeListeners(double d) {
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void restoreDefaultValues(double d) {
        addPreOperation(new R2j(this, (int) d, 3));
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void setAnimatedNodeOffset(double d, double d2) {
        addOperation(new R2k(this, d2, (int) d, 1));
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void setAnimatedNodeValue(double d, double d2) {
        addOperation(new R2k(this, d2, (int) d, 0));
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void startAnimatingNode(double d, double d2, ReadableMap readableMap, Callback callback) {
        addUnbatchedOperation(new C60524R2o(this, callback, readableMap, (int) d, (int) d2));
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void startListeningToAnimatedNodeValue(double d) {
        int i = (int) d;
        addOperation(new C60525R2p(new C64133Szw(this, i), this, i));
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void startOperationBatch() {
        this.mBatchingControlledByJS = true;
        this.mCurrentBatchNumber++;
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void stopAnimation(double d) {
        addOperation(new R2j(this, (int) d, 2));
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void stopListeningToAnimatedNodeValue(double d) {
        addOperation(new R2j(this, (int) d, 4));
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void updateAnimatedNodeConfig(double d, ReadableMap readableMap) {
        addOperation(new C60525R2p(this, readableMap, (int) d, 3));
    }

    public void willMountItems(InterfaceC65589TnT interfaceC65589TnT) {
    }

    private void addOperation(AbstractC62479SDg abstractC62479SDg) {
        abstractC62479SDg.A00 = this.mCurrentBatchNumber;
        this.mOperations.A01.add(abstractC62479SDg);
    }

    private void addPreOperation(AbstractC62479SDg abstractC62479SDg) {
        abstractC62479SDg.A00 = this.mCurrentBatchNumber;
        this.mPreOperations.A01.add(abstractC62479SDg);
    }

    private void addUnbatchedOperation(AbstractC62479SDg abstractC62479SDg) {
        abstractC62479SDg.A00 = -1L;
        this.mOperations.A01.add(abstractC62479SDg);
    }

    private void clearFrameCallback() {
        C63192Seu c63192Seu = this.mReactChoreographer;
        AbstractC05810Sj.A00(c63192Seu);
        c63192Seu.A03(this.mAnimatedFrameCallback, EnumC61159RgK.A05);
        this.mEnqueuedAnimationOnFrame = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void enqueueFrameCallback() {
        if (!this.mEnqueuedAnimationOnFrame) {
            C63192Seu c63192Seu = this.mReactChoreographer;
            AbstractC05810Sj.A00(c63192Seu);
            c63192Seu.A02(this.mAnimatedFrameCallback, EnumC61159RgK.A05);
            this.mEnqueuedAnimationOnFrame = true;
        }
    }

    public void didDispatchMountItems(InterfaceC65589TnT interfaceC65589TnT) {
        if (this.mUIManagerType == 2) {
            long j = this.mCurrentBatchNumber - 1;
            if (!this.mBatchingControlledByJS) {
                this.mCurrentFrameNumber++;
                if (this.mCurrentFrameNumber - this.mCurrentBatchNumber > 2) {
                    this.mCurrentBatchNumber = this.mCurrentFrameNumber;
                    j = this.mCurrentBatchNumber;
                }
            }
            this.mPreOperations.A00(getNodesManager(), j);
            this.mOperations.A00(getNodesManager(), j);
        }
    }

    public void didScheduleMountItems(InterfaceC65589TnT interfaceC65589TnT) {
        this.mCurrentFrameNumber++;
    }

    public C63347Si4 getNodesManager() {
        R3M reactApplicationContextIfActiveOrWarn;
        if (this.mNodesManager.get() == null && (reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn()) != null) {
            C1EM.A00(null, new C63347Si4(reactApplicationContextIfActiveOrWarn), this.mNodesManager);
        }
        return (C63347Si4) this.mNodesManager.get();
    }

    public void setNodesManager(C63347Si4 c63347Si4) {
        this.mNodesManager.set(c63347Si4);
    }

    public void userDrivenScrollEnded(int i) {
        int i2;
        List list;
        C63347Si4 c63347Si4 = (C63347Si4) this.mNodesManager.get();
        if (c63347Si4 != null) {
            HashSet A1H = AbstractC166987dD.A1H();
            ListIterator listIterator = c63347Si4.A08.listIterator();
            while (listIterator.hasNext()) {
                EventAnimationDriver eventAnimationDriver = (EventAnimationDriver) listIterator.next();
                if (eventAnimationDriver != null && "topScrollEnded".equals(eventAnimationDriver.eventName) && i == (i2 = eventAnimationDriver.viewTag)) {
                    AbstractC166997dE.A1W(A1H, i2);
                    R2f r2f = eventAnimationDriver.valueNode;
                    if (r2f != null && (list = r2f.A03) != null) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            AbstractC166997dE.A1W(A1H, ((AbstractC62966SZj) it.next()).A02);
                        }
                    }
                }
            }
            if (!A1H.isEmpty()) {
                WritableNativeArray writableNativeArray = new WritableNativeArray();
                Iterator it2 = A1H.iterator();
                while (it2.hasNext()) {
                    writableNativeArray.pushInt(AbstractC167007dF.A0B(it2));
                }
                WritableNativeMap A0c = AbstractC58321PtD.A0c();
                A0c.putArray("tags", writableNativeArray);
                R3M reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn();
                if (reactApplicationContextIfActiveOrWarn != null) {
                    reactApplicationContextIfActiveOrWarn.A0E("onUserDrivenAnimationEnded", A0c);
                }
            }
        }
    }

    @Override // X.InterfaceC65355Tij
    public void willDispatchViewUpdates(InterfaceC65589TnT interfaceC65589TnT) {
        C62667SLd c62667SLd = this.mOperations;
        if (c62667SLd.A01.isEmpty() && c62667SLd.A00 == null) {
            C62667SLd c62667SLd2 = this.mPreOperations;
            if (c62667SLd2.A01.isEmpty() && c62667SLd2.A00 == null) {
                return;
            }
        }
        if (this.mUIManagerType == 2) {
            return;
        }
        long j = this.mCurrentBatchNumber;
        this.mCurrentBatchNumber = 1 + j;
        T0Z t0z = new T0Z(this, j);
        T0a t0a = new T0a(this, j);
        UIManagerModule uIManagerModule = (UIManagerModule) interfaceC65589TnT;
        uIManagerModule.prependUIBlock(t0z);
        uIManagerModule.addUIBlock(t0a);
    }

    public NativeAnimatedModule(R3M r3m) {
        super(r3m);
        this.mOperations = new C62667SLd(this);
        this.mPreOperations = new C62667SLd(this);
        this.mNodesManager = new AtomicReference();
        this.mBatchingControlledByJS = false;
        this.mInitializedForFabric = false;
        this.mInitializedForNonFabric = false;
        this.mEnqueuedAnimationOnFrame = false;
        this.mUIManagerType = 1;
        this.mNumFabricAnimations = 0;
        this.mNumNonFabricAnimations = 0;
        C63192Seu c63192Seu = C63192Seu.A05;
        if (c63192Seu != null) {
            this.mReactChoreographer = c63192Seu;
            this.mAnimatedFrameCallback = new R5K(this, r3m);
            return;
        }
        throw AbstractC166987dD.A14("ReactChoreographer needs to be initialized.");
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void initialize() {
        AbstractC58321PtD.A0b(this).A0A(this);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void invalidate() {
        AbstractC58321PtD.A0b(this).A0B(this);
    }

    @Override // X.InterfaceC65542TmH
    public void onHostDestroy() {
        clearFrameCallback();
    }

    @Override // X.InterfaceC65542TmH
    public void onHostPause() {
        clearFrameCallback();
    }

    @Override // X.InterfaceC65542TmH
    public void onHostResume() {
        enqueueFrameCallback();
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void queueAndExecuteBatchedOperations(ReadableArray readableArray) {
        int size = readableArray.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            int i3 = readableArray.getInt(i);
            Integer[] numArr = AbstractC61534RpE.A00;
            if (numArr == null) {
                numArr = C05F.A00(21);
                AbstractC61534RpE.A00 = numArr;
            }
            switch (MSW.A07(numArr, i3 - 1)) {
                case 0:
                case 1:
                case 5:
                case 6:
                case 9:
                case 10:
                case 14:
                    i = i2 + 2;
                    break;
                case 2:
                case 3:
                case 4:
                case 8:
                case 11:
                case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                case Process.SIGTERM /* 15 */:
                case 16:
                case Process.SIGSTOP /* 19 */:
                case 20:
                    i = i2 + 1;
                    break;
                case 7:
                case 18:
                    i = i2 + 3;
                    break;
                case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                    int i4 = i2 + 1;
                    i = i4 + 1;
                    initializeLifecycleEventListenersForViewTag(readableArray.getInt(i4));
                    break;
                case 17:
                    initializeLifecycleEventListenersForViewTag(readableArray.getInt(i2));
                    i = i2 + 1 + 1 + 1;
                    break;
                default:
                    throw AbstractC166987dD.A12("Batch animation execution op: fetching viewTag: unknown op code");
            }
        }
        startOperationBatch();
        addUnbatchedOperation(new C60525R2p(this, readableArray, size));
        finishOperationBatch();
    }
}
