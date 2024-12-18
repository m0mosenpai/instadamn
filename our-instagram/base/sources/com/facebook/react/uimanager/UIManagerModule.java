package com.facebook.react.uimanager;

import X.AbstractC05810Sj;
import X.AbstractC09720ep;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC31174DnI;
import X.AbstractC31180DnO;
import X.AbstractC43592JPx;
import X.AbstractC58321PtD;
import X.AbstractC58322PtE;
import X.AnonymousClass001;
import X.C00O;
import X.C05F;
import X.C0I2;
import X.C0fY;
import X.C60534R5h;
import X.C60535R5i;
import X.C62313S6i;
import X.C62668SLf;
import X.C62829STb;
import X.C62856SUd;
import X.C62959SZc;
import X.C63104Sd8;
import X.C63192Seu;
import X.C63235Sfn;
import X.C63255SgD;
import X.C63309ShF;
import X.C63339Sht;
import X.C63356SiD;
import X.C63369SiY;
import X.C63389Sj5;
import X.C63592Spz;
import X.C64137T0d;
import X.C64138T0e;
import X.C64139T0f;
import X.C64140T0g;
import X.C64141T0h;
import X.ComponentCallbacks2C63413Sjr;
import X.ComponentCallbacks2C63415Sjt;
import X.EnumC61159RgK;
import X.InterfaceC65226TgI;
import X.InterfaceC65227TgJ;
import X.InterfaceC65228TgK;
import X.InterfaceC65355Tij;
import X.InterfaceC65361Tip;
import X.InterfaceC65542TmH;
import X.InterfaceC65543TmI;
import X.InterfaceC65589TnT;
import X.InterfaceC65657Tqj;
import X.Q21;
import X.R38;
import X.R39;
import X.R3C;
import X.R3M;
import X.R3N;
import X.R5Z;
import X.R5a;
import X.R5b;
import X.R5d;
import X.RhX;
import X.RunnableC64576TKn;
import X.RunnableC64635TNr;
import X.SBP;
import X.SKS;
import X.SZN;
import X.T0c;
import X.T0q;
import X.WDr;
import X.WF1;
import X.X9J;
import android.content.Context;
import android.util.SparseBooleanArray;
import android.view.View;
import com.facebook.common.dextricks.OdexSchemeArtXdex;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.queue.MessageQueueThread;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.modules.i18nmanager.I18nUtil;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.systrace.SystraceMessage;
import com.facebook.yoga.YogaNative;
import com.facebook.yoga.YogaNodeJNIBase;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

@ReactModule(name = UIManagerModule.NAME)
/* loaded from: classes10.dex */
public class UIManagerModule extends ReactContextBaseJavaModule implements InterfaceC65589TnT, InterfaceC65542TmH {
    public static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final boolean DEBUG = false;
    public static final String NAME = "UIManager";
    public static final String TAG = "UIManagerModule";
    public int mBatchId;
    public final Map mCustomDirectEvents;
    public final X9J mEventDispatcher;
    public final List mListeners;
    public final ComponentCallbacks2C63413Sjr mMemoryTrimCallback;
    public final Map mModuleConstants;
    public final C63339Sht mUIImplementation;
    public final CopyOnWriteArrayList mUIManagerListeners;
    public final ComponentCallbacks2C63415Sjt mViewManagerRegistry;

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    public void markActiveTouchForTag(int i, int i2) {
    }

    @Override // X.InterfaceC65589TnT
    @ReactMethod
    public void sendAccessibilityEvent(int i, int i2) {
        if (i % 2 == 0) {
            InterfaceC65589TnT A03 = UIManagerHelper.A03(AbstractC58321PtD.A0b(this), 2, true);
            if (A03 != null) {
                A03.sendAccessibilityEvent(i, i2);
                return;
            }
            return;
        }
        SZN szn = this.mUIImplementation.A05;
        szn.A0F.add(new R5a(szn, i, i2));
    }

    public void sweepActiveTouchForTag(int i, int i2) {
    }

    public static Map createConstants(InterfaceC65227TgJ interfaceC65227TgJ) {
        ReactMarker.logMarker(RhX.A0R);
        AbstractC09720ep A00 = SystraceMessage.A00(SystraceMessage.A00, "CreateUIManagerConstants", OdexSchemeArtXdex.STATE_PGO_ATTEMPTED);
        A00.A00(AbstractC166997dE.A0b(), "Lazy");
        A00.A02();
        try {
            WDr.A01();
            throw AbstractC166987dD.A15("getViewManagerNames");
        } catch (Throwable th) {
            C0fY.A00(OdexSchemeArtXdex.STATE_PGO_ATTEMPTED, -1768836471);
            ReactMarker.logMarker(RhX.A0Q);
            throw th;
        }
    }

    public static InterfaceC65657Tqj getConstantsForViewManager(ViewManager viewManager, Map map) {
        AbstractC09720ep A00 = SystraceMessage.A00(SystraceMessage.A00, "UIManagerModule.getConstantsForViewManager", OdexSchemeArtXdex.STATE_PGO_ATTEMPTED);
        A00.A00(viewManager.getName(), ViewManager.NAME);
        A00.A00(AbstractC166997dE.A0b(), "Lazy");
        A00.A02();
        try {
            return Arguments.makeNativeMap(C63235Sfn.A00(viewManager, null, map));
        } finally {
            AbstractC58322PtE.A15();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC65589TnT
    public int addRootView(View view, InterfaceC65657Tqj interfaceC65657Tqj) {
        int i;
        C0fY.A01(OdexSchemeArtXdex.STATE_PGO_ATTEMPTED, "UIManagerModule.addRootView", 1178866234);
        synchronized (C62313S6i.class) {
            i = C62313S6i.A00;
            C62313S6i.A00 = i + 10;
        }
        R3M A0b = AbstractC58321PtD.A0b(this);
        Context context = view.getContext();
        ((InterfaceC65543TmI) view).getSurfaceID();
        R3N r3n = new R3N(context, A0b);
        C63339Sht c63339Sht = this.mUIImplementation;
        synchronized (c63339Sht.A01) {
            ReactShadowNodeImpl reactShadowNodeImpl = new ReactShadowNodeImpl();
            if (I18nUtil.A00.A01(c63339Sht.A02)) {
                YogaNative.jni_YGNodeStyleSetDirectionJNI(((YogaNodeJNIBase) reactShadowNodeImpl.A0B).mNativePointer, 2);
            }
            reactShadowNodeImpl.A0E = "Root";
            reactShadowNodeImpl.A00 = i;
            reactShadowNodeImpl.Eff(r3n);
            Q21.A00(r3n, new RunnableC64635TNr(reactShadowNodeImpl, c63339Sht));
            C63309ShF c63309ShF = c63339Sht.A05.A0L;
            synchronized (c63309ShF) {
                synchronized (c63309ShF) {
                    if (view.getId() != -1) {
                        C0I2.A03("NativeViewHierarchyManager", AnonymousClass001.A0c("Trying to add a root view with an explicit id (", ") already set. React Native uses the id field to track react tags and will overwrite this field. If that is fine, explicitly overwrite the id field to View.NO_ID before calling addRootView.", view.getId()));
                    }
                    c63309ShF.A03.put(i, view);
                    c63309ShF.A02.put(i, c63309ShF.A06);
                    c63309ShF.A04.put(i, true);
                    view.setId(i);
                }
            }
        }
        C0fY.A00(OdexSchemeArtXdex.STATE_PGO_ATTEMPTED, -1278904987);
        return i;
    }

    public void addUIBlock(InterfaceC65361Tip interfaceC65361Tip) {
        SZN szn = this.mUIImplementation.A05;
        szn.A0F.add(new C64137T0d(interfaceC65361Tip, szn));
    }

    @Override // X.InterfaceC65589TnT
    public void addUIManagerEventListener(InterfaceC65355Tij interfaceC65355Tij) {
        this.mUIManagerListeners.add(interfaceC65355Tij);
    }

    @Deprecated
    public void addUIManagerListener(InterfaceC65226TgI interfaceC65226TgI) {
        this.mListeners.add(interfaceC65226TgI);
    }

    @ReactMethod
    public void clearJSResponder() {
        SZN szn = this.mUIImplementation.A05;
        szn.A0F.add(new R5d(szn, 0, 0, true, false));
    }

    @ReactMethod
    public void configureNextLayoutAnimation(ReadableMap readableMap, Callback callback, Callback callback2) {
        SZN szn = this.mUIImplementation.A05;
        szn.A0F.add(new C64138T0e(callback, readableMap, szn));
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0073, code lost:
    
        if (X.C63389Sj5.A07(r6) == false) goto L15;
     */
    @com.facebook.react.bridge.ReactMethod
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void createView(int r9, java.lang.String r10, int r11, com.facebook.react.bridge.ReadableMap r12) {
        /*
            r8 = this;
            X.Sht r4 = r8.mUIImplementation
            boolean r0 = r4.A09
            if (r0 == 0) goto L92
            java.lang.Object r3 = r4.A01
            monitor-enter(r3)
            X.Sjt r0 = r4.A06     // Catch: java.lang.Throwable -> L8f
            com.facebook.react.uimanager.ViewManager r0 = r0.A00(r10)     // Catch: java.lang.Throwable -> L8f
            com.facebook.react.uimanager.ReactShadowNode r2 = r0.createShadowNodeInstance()     // Catch: java.lang.Throwable -> L8f
            X.SLf r1 = r4.A04     // Catch: java.lang.Throwable -> L8f
            com.facebook.react.uimanager.ReactShadowNode r6 = r1.A00(r11)     // Catch: java.lang.Throwable -> L8f
            java.lang.String r5 = "Root node with tag "
            r0 = 3336(0xd08, float:4.675E-42)
            java.lang.String r0 = X.AbstractC111324zv.A00(r0)     // Catch: java.lang.Throwable -> L8f
            java.lang.String r0 = X.AnonymousClass001.A0c(r5, r0, r11)     // Catch: java.lang.Throwable -> L8f
            X.AbstractC05810Sj.A01(r6, r0)     // Catch: java.lang.Throwable -> L8f
            r5 = r2
            com.facebook.react.uimanager.ReactShadowNodeImpl r5 = (com.facebook.react.uimanager.ReactShadowNodeImpl) r5     // Catch: java.lang.Throwable -> L8f
            r5.A00 = r9     // Catch: java.lang.Throwable -> L8f
            r5.A0E = r10     // Catch: java.lang.Throwable -> L8f
            com.facebook.react.uimanager.ReactShadowNodeImpl r6 = (com.facebook.react.uimanager.ReactShadowNodeImpl) r6     // Catch: java.lang.Throwable -> L8f
            int r0 = r6.A00     // Catch: java.lang.Throwable -> L8f
            r5.A01 = r0     // Catch: java.lang.Throwable -> L8f
            X.R3N r0 = r6.A0A     // Catch: java.lang.Throwable -> L8f
            X.AbstractC05810Sj.A00(r0)     // Catch: java.lang.Throwable -> L8f
            r2.Eff(r0)     // Catch: java.lang.Throwable -> L8f
            X.SKR r0 = r1.A02     // Catch: java.lang.Throwable -> L8f
            r0.A00()     // Catch: java.lang.Throwable -> L8f
            android.util.SparseArray r1 = r1.A00     // Catch: java.lang.Throwable -> L8f
            int r0 = r5.A00     // Catch: java.lang.Throwable -> L8f
            r1.put(r0, r2)     // Catch: java.lang.Throwable -> L8f
            r6 = 0
            if (r12 == 0) goto L54
            X.SKS r6 = new X.SKS     // Catch: java.lang.Throwable -> L8f
            r6.<init>(r12)     // Catch: java.lang.Throwable -> L8f
            r2.FBr(r6)     // Catch: java.lang.Throwable -> L8f
        L54:
            boolean r0 = r2.Cfz()     // Catch: java.lang.Throwable -> L8f
            if (r0 != 0) goto L8d
            X.Sj5 r7 = r4.A03     // Catch: java.lang.Throwable -> L8f
            X.R3N r4 = r5.A0A     // Catch: java.lang.Throwable -> L8f
            X.AbstractC05810Sj.A00(r4)     // Catch: java.lang.Throwable -> L8f
            java.lang.String r1 = r5.A0E     // Catch: java.lang.Throwable -> L8f
            X.AbstractC05810Sj.A00(r1)     // Catch: java.lang.Throwable -> L8f
            java.lang.String r0 = "RCTView"
            boolean r0 = r1.equals(r0)     // Catch: java.lang.Throwable -> L8f
            if (r0 == 0) goto L75
            boolean r1 = X.C63389Sj5.A07(r6)     // Catch: java.lang.Throwable -> L8f
            r0 = 1
            if (r1 != 0) goto L76
        L75:
            r0 = 0
        L76:
            r2.EWX(r0)     // Catch: java.lang.Throwable -> L8f
            java.lang.Integer r1 = r2.BWB()     // Catch: java.lang.Throwable -> L8f
            java.lang.Integer r0 = X.C05F.A0C     // Catch: java.lang.Throwable -> L8f
            if (r1 == r0) goto L8d
            X.SZN r2 = r7.A02     // Catch: java.lang.Throwable -> L8f
            int r1 = r5.A00     // Catch: java.lang.Throwable -> L8f
            java.lang.String r0 = r5.A0E     // Catch: java.lang.Throwable -> L8f
            X.AbstractC05810Sj.A00(r0)     // Catch: java.lang.Throwable -> L8f
            r2.A01(r6, r4, r0, r1)     // Catch: java.lang.Throwable -> L8f
        L8d:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L8f
            return
        L8f:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L8f
            throw r0
        L92:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.uimanager.UIManagerModule.createView(int, java.lang.String, int, com.facebook.react.bridge.ReadableMap):void");
    }

    @Override // X.InterfaceC65589TnT
    @Deprecated
    public void dispatchCommand(int i, int i2, ReadableArray readableArray) {
        C63339Sht c63339Sht = this.mUIImplementation;
        String A0O = AnonymousClass001.A0O("dispatchViewManagerCommand: ", i2);
        if (c63339Sht.A04.A00(i) != null) {
            SZN szn = c63339Sht.A05;
            szn.A0G.add(new C60534R5h(readableArray, szn, i, i2));
            return;
        }
        C0I2.A04("ReactNative", AnonymousClass001.A09(i, "Unable to execute operation ", A0O, " on view with tag: ", ", since the view does not exist"));
    }

    @ReactMethod
    public void findSubviewIn(int i, ReadableArray readableArray, Callback callback) {
        C63339Sht c63339Sht = this.mUIImplementation;
        float round = Math.round(WF1.A01((float) readableArray.getDouble(0)));
        float round2 = Math.round(WF1.A01((float) readableArray.getDouble(1)));
        SZN szn = c63339Sht.A05;
        szn.A0F.add(new C64141T0h(callback, szn, round, round2, i));
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map getConstants() {
        return this.mModuleConstants;
    }

    @Deprecated
    public SBP getDirectEventNamesResolver() {
        return new SBP(this);
    }

    public X9J getEventDispatcher() {
        return this.mEventDispatcher;
    }

    public Map getPerformanceCounters() {
        SZN szn = this.mUIImplementation.A05;
        HashMap A1G = AbstractC166987dD.A1G();
        A1G.put("CommitStartTime", Long.valueOf(szn.A04));
        A1G.put("CommitEndTime", Long.valueOf(szn.A03));
        A1G.put("LayoutTime", Long.valueOf(szn.A06));
        A1G.put("DispatchViewUpdatesTime", Long.valueOf(szn.A05));
        A1G.put("RunStartTime", Long.valueOf(szn.A09));
        A1G.put("RunEndTime", Long.valueOf(szn.A08));
        A1G.put("BatchedExecutionTime", Long.valueOf(szn.A02));
        A1G.put("NonBatchedExecutionTime", Long.valueOf(szn.A07));
        A1G.put("NativeModulesThreadCpuTime", Long.valueOf(szn.A0A));
        A1G.put("CreateViewCount", Long.valueOf(szn.A00));
        A1G.put("UpdatePropsCount", Long.valueOf(szn.A0B));
        return A1G;
    }

    @Deprecated
    public C63339Sht getUIImplementation() {
        return this.mUIImplementation;
    }

    @Deprecated
    public ComponentCallbacks2C63415Sjt getViewManagerRegistry_DO_NOT_USE() {
        return this.mViewManagerRegistry;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void initialize() {
        R3M r3m = this.mReactApplicationContext;
        AbstractC05810Sj.A01(r3m, "Tried to get ReactApplicationContext even though NativeModule wasn't instantiated with one");
        r3m.registerComponentCallbacks(this.mMemoryTrimCallback);
        R3M r3m2 = this.mReactApplicationContext;
        AbstractC05810Sj.A01(r3m2, "Tried to get ReactApplicationContext even though NativeModule wasn't instantiated with one");
        r3m2.registerComponentCallbacks(this.mViewManagerRegistry);
        X9J x9j = this.mEventDispatcher;
        R3M r3m3 = this.mReactApplicationContext;
        AbstractC05810Sj.A01(r3m3, "Tried to get ReactApplicationContext even though NativeModule wasn't instantiated with one");
        ((T0q) x9j).A0E.mDefaultEventEmitter = (RCTEventEmitter) r3m3.A03(RCTEventEmitter.class);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void invalidate() {
        final ArrayList A0n;
        C63255SgD.A01(new RunnableC64576TKn((T0q) this.mEventDispatcher));
        C63339Sht c63339Sht = this.mUIImplementation;
        c63339Sht.A09 = false;
        ComponentCallbacks2C63415Sjt componentCallbacks2C63415Sjt = c63339Sht.A06;
        synchronized (componentCallbacks2C63415Sjt) {
            A0n = AbstractC31180DnO.A0n(componentCallbacks2C63415Sjt.A00);
        }
        Runnable runnable = new Runnable() { // from class: X.TKm
            @Override // java.lang.Runnable
            public final void run() {
                Iterator it = A0n.iterator();
                while (it.hasNext()) {
                    ((BaseJavaModule) it.next()).invalidate();
                }
            }
        };
        if (C63255SgD.A02()) {
            runnable.run();
        } else {
            C63255SgD.A01(runnable);
        }
        R3M A0b = AbstractC58321PtD.A0b(this);
        A0b.unregisterComponentCallbacks(this.mMemoryTrimCallback);
        A0b.unregisterComponentCallbacks(this.mViewManagerRegistry);
        ((C63592Spz) C62829STb.A00.getValue()).A00();
        C63369SiY.A00.clear();
        C63369SiY.A01.clear();
        C63104Sd8.A01.clear();
        C63104Sd8.A00.clear();
    }

    public void invalidateNodeLayout(int i) {
        ReactShadowNode A00 = this.mUIImplementation.A04.A00(i);
        if (A00 == null) {
            AbstractC58322PtE.A1P("Warning : attempted to dirty a non-existent react shadow node. reactTag=", i);
        } else {
            A00.APL();
            this.mUIImplementation.A04(-1);
        }
    }

    @ReactMethod
    public void manageChildren(int i, ReadableArray readableArray, ReadableArray readableArray2, ReadableArray readableArray3, ReadableArray readableArray4, ReadableArray readableArray5) {
        int size;
        int size2;
        int size3;
        boolean z;
        C63339Sht c63339Sht = this.mUIImplementation;
        if (c63339Sht.A09) {
            synchronized (c63339Sht.A01) {
                C62668SLf c62668SLf = c63339Sht.A04;
                ReactShadowNode A00 = c62668SLf.A00(i);
                if (readableArray != null) {
                    size = readableArray.size();
                } else {
                    size = 0;
                }
                if (readableArray3 == null) {
                    size2 = 0;
                } else {
                    size2 = readableArray3.size();
                }
                if (readableArray5 == null) {
                    size3 = 0;
                } else {
                    size3 = readableArray5.size();
                }
                if (size == 0 || (readableArray2 != null && size == readableArray2.size())) {
                    if (size2 == 0 || (readableArray4 != null && size2 == readableArray4.size())) {
                        int i2 = size + size2;
                        C62959SZc[] c62959SZcArr = new C62959SZc[i2];
                        int i3 = size + size3;
                        int[] iArr = new int[i3];
                        int[] iArr2 = new int[i3];
                        int[] iArr3 = new int[size3];
                        if (size > 0) {
                            AbstractC05810Sj.A00(readableArray);
                            AbstractC05810Sj.A00(readableArray2);
                            int i4 = 0;
                            do {
                                int i5 = readableArray.getInt(i4);
                                int i6 = ((ReactShadowNodeImpl) A00).A06(i5).A00;
                                c62959SZcArr[i4] = new C62959SZc(i6, readableArray2.getInt(i4));
                                iArr[i4] = i5;
                                iArr2[i4] = i6;
                                i4++;
                            } while (i4 < size);
                        }
                        if (size2 > 0) {
                            AbstractC05810Sj.A00(readableArray3);
                            AbstractC05810Sj.A00(readableArray4);
                            int i7 = 0;
                            do {
                                c62959SZcArr[size + i7] = new C62959SZc(readableArray3.getInt(i7), readableArray4.getInt(i7));
                                i7++;
                            } while (i7 < size2);
                        }
                        if (size3 > 0) {
                            AbstractC05810Sj.A00(readableArray5);
                            int i8 = 0;
                            do {
                                int i9 = readableArray5.getInt(i8);
                                int i10 = ((ReactShadowNodeImpl) A00).A06(i9).A00;
                                int i11 = size + i8;
                                iArr[i11] = i9;
                                iArr2[i11] = i10;
                                iArr3[i8] = i10;
                                i8++;
                            } while (i8 < size3);
                        }
                        Arrays.sort(c62959SZcArr, C62959SZc.A02);
                        Arrays.sort(iArr);
                        int i12 = -1;
                        for (int i13 = i3 - 1; i13 >= 0; i13--) {
                            int i14 = iArr[i13];
                            if (i14 != i12) {
                                A00.EF7(i14);
                                i12 = iArr[i13];
                            } else {
                                throw new R3C(AnonymousClass001.A0O("Repeated indices in Removal list for view tag: ", i));
                            }
                        }
                        for (int i15 = 0; i15 < i2; i15++) {
                            C62959SZc c62959SZc = c62959SZcArr[i15];
                            ReactShadowNode A002 = c62668SLf.A00(c62959SZc.A01);
                            if (A002 != null) {
                                A00.A88(A002, c62959SZc.A00);
                            } else {
                                throw new R3C(AnonymousClass001.A0O("Trying to add unknown view tag: ", c62959SZc.A01));
                            }
                        }
                        C63389Sj5 c63389Sj5 = c63339Sht.A03;
                        for (int i16 = 0; i16 < i3; i16++) {
                            int i17 = iArr2[i16];
                            int i18 = 0;
                            while (true) {
                                if (i18 < size3) {
                                    if (iArr3[i18] != i17) {
                                        i18++;
                                    } else {
                                        z = true;
                                        break;
                                    }
                                } else {
                                    z = false;
                                    break;
                                }
                            }
                            C63389Sj5.A03(c63389Sj5, c63389Sj5.A01.A00(i17), z);
                        }
                        for (int i19 = 0; i19 < i2; i19++) {
                            C62959SZc c62959SZc2 = c62959SZcArr[i19];
                            C63389Sj5.A01(c63389Sj5, A00, c63389Sj5.A01.A00(c62959SZc2.A01), c62959SZc2.A00);
                        }
                        for (int i20 = 0; i20 < size3; i20++) {
                            ReactShadowNode A003 = c62668SLf.A00(iArr3[i20]);
                            C63339Sht.A02(A003, c63339Sht);
                            A003.dispose();
                        }
                    }
                } else {
                    throw new R3C("Size of moveFrom != size of moveTo!");
                }
            }
        }
    }

    @ReactMethod
    public void measure(int i, Callback callback) {
        C63339Sht c63339Sht = this.mUIImplementation;
        if (c63339Sht.A09) {
            SZN szn = c63339Sht.A05;
            szn.A0F.add(new C64140T0g(callback, szn, i));
        }
    }

    @ReactMethod
    public void measureInWindow(int i, Callback callback) {
        C63339Sht c63339Sht = this.mUIImplementation;
        if (c63339Sht.A09) {
            SZN szn = c63339Sht.A05;
            szn.A0F.add(new C64139T0f(callback, szn, i));
        }
    }

    @ReactMethod
    public void measureLayout(int i, int i2, Callback callback, Callback callback2) {
        int i3;
        int i4;
        C63339Sht c63339Sht = this.mUIImplementation;
        if (c63339Sht.A09) {
            try {
                int[] iArr = c63339Sht.A08;
                C62668SLf c62668SLf = c63339Sht.A04;
                ReactShadowNode A00 = c62668SLf.A00(i);
                ReactShadowNode A002 = c62668SLf.A00(i2);
                if (A00 != null) {
                    if (A002 == null) {
                        i = i2;
                    } else {
                        if (A00 != A002) {
                            ReactShadowNode reactShadowNode = A00;
                            do {
                                reactShadowNode = ((ReactShadowNodeImpl) reactShadowNode).A09;
                                if (reactShadowNode != A002) {
                                }
                            } while (reactShadowNode != null);
                            throw new R3C(AnonymousClass001.A02(i2, i, "Tag ", " is not an ancestor of tag "));
                        }
                        if (A00 != A002 && !A00.Cfz()) {
                            i3 = Math.round(A00.BMd());
                            i4 = Math.round(A00.BMe());
                            ReactShadowNode reactShadowNode2 = A00;
                            while (true) {
                                reactShadowNode2 = ((ReactShadowNodeImpl) reactShadowNode2).A09;
                                if (reactShadowNode2 == A002) {
                                    break;
                                }
                                AbstractC05810Sj.A00(reactShadowNode2);
                                C63339Sht.A01(reactShadowNode2, c63339Sht);
                                i3 += Math.round(reactShadowNode2.BMd());
                                i4 += Math.round(reactShadowNode2.BMe());
                            }
                            C63339Sht.A01(A002, c63339Sht);
                        } else {
                            i3 = 0;
                            i4 = 0;
                        }
                        iArr[0] = i3;
                        iArr[1] = i4;
                        ReactShadowNodeImpl reactShadowNodeImpl = (ReactShadowNodeImpl) A00;
                        iArr[2] = reactShadowNodeImpl.A03;
                        int i5 = reactShadowNodeImpl.A02;
                        iArr[3] = i5;
                        callback2.invoke(Float.valueOf(AbstractC58321PtD.A04(iArr, 0)), Float.valueOf(AbstractC58321PtD.A04(iArr, 1)), Float.valueOf(AbstractC58321PtD.A04(iArr, 2)), Float.valueOf(WF1.A00(i5)));
                    }
                }
            } catch (R3C e) {
                AbstractC58321PtD.A1K(callback, e.getMessage());
            }
        }
    }

    public void onBatchComplete() {
        int size;
        int i = this.mBatchId;
        this.mBatchId = i + 1;
        AbstractC09720ep A00 = SystraceMessage.A00(SystraceMessage.A00, "onBatchCompleteUI", OdexSchemeArtXdex.STATE_PGO_ATTEMPTED);
        A00.A01("BatchId", i);
        A00.A02();
        Iterator it = this.mListeners.iterator();
        if (it.hasNext()) {
            it.next();
            throw AbstractC166987dD.A15("willDispatchViewUpdates");
        }
        Iterator it2 = this.mUIManagerListeners.iterator();
        while (it2.hasNext()) {
            ((InterfaceC65355Tij) it2.next()).willDispatchViewUpdates(this);
        }
        try {
            C63309ShF c63309ShF = this.mUIImplementation.A05.A0L;
            synchronized (c63309ShF) {
                size = c63309ShF.A04.size();
            }
            if (size > 0) {
                this.mUIImplementation.A04(i);
            }
            C0fY.A00(OdexSchemeArtXdex.STATE_PGO_ATTEMPTED, -1232018120);
        } catch (Throwable th) {
            C0fY.A00(OdexSchemeArtXdex.STATE_PGO_ATTEMPTED, -1916767129);
            throw th;
        }
    }

    @Override // X.InterfaceC65542TmH
    public void onHostDestroy() {
    }

    @Override // X.InterfaceC65542TmH
    public void onHostPause() {
        SZN szn = this.mUIImplementation.A05;
        szn.A0H = false;
        C63192Seu c63192Seu = C63192Seu.A05;
        if (c63192Seu != null) {
            c63192Seu.A03(szn.A0M, EnumC61159RgK.A03);
            SZN.A00(szn);
            return;
        }
        throw AbstractC166987dD.A14("ReactChoreographer needs to be initialized.");
    }

    @Override // X.InterfaceC65542TmH
    public void onHostResume() {
        SZN szn = this.mUIImplementation.A05;
        szn.A0H = true;
        if (!C62856SUd.A00.enableFabricRendererExclusively()) {
            C63192Seu c63192Seu = C63192Seu.A05;
            if (c63192Seu != null) {
                c63192Seu.A02(szn.A0M, EnumC61159RgK.A03);
                return;
            }
            throw AbstractC166987dD.A14("ReactChoreographer needs to be initialized.");
        }
    }

    public void prependUIBlock(InterfaceC65361Tip interfaceC65361Tip) {
        SZN szn = this.mUIImplementation.A05;
        szn.A0F.add(0, new C64137T0d(interfaceC65361Tip, szn));
    }

    public void profileNextBatch() {
        SZN szn = this.mUIImplementation.A05;
        szn.A0J = true;
        szn.A04 = 0L;
        szn.A00 = 0L;
        szn.A0B = 0L;
    }

    @ReactMethod
    public void removeRootView(int i) {
        C63339Sht c63339Sht = this.mUIImplementation;
        synchronized (c63339Sht.A01) {
            C62668SLf c62668SLf = c63339Sht.A04;
            c62668SLf.A02.A00();
            if (i != -1) {
                SparseBooleanArray sparseBooleanArray = c62668SLf.A01;
                if (sparseBooleanArray.get(i)) {
                    c62668SLf.A00.remove(i);
                    sparseBooleanArray.delete(i);
                } else {
                    throw new R3C(AnonymousClass001.A0c("View with tag ", " is not registered as a root view", i));
                }
            }
        }
        SZN szn = c63339Sht.A05;
        szn.A0F.add(new R5Z(szn, i));
    }

    @Override // X.InterfaceC65589TnT
    public void removeUIManagerEventListener(InterfaceC65355Tij interfaceC65355Tij) {
        this.mUIManagerListeners.remove(interfaceC65355Tij);
    }

    @Deprecated
    public void removeUIManagerListener(InterfaceC65226TgI interfaceC65226TgI) {
        this.mListeners.remove(interfaceC65226TgI);
    }

    @Deprecated
    public String resolveCustomDirectEventName(String str) {
        Map map;
        if (str != null && (map = (Map) this.mCustomDirectEvents.get(str)) != null) {
            return AbstractC166987dD.A1A("registrationName", map);
        }
        return str;
    }

    @Deprecated
    public int resolveRootTagFromReactTag(int i) {
        if (i % 10 != 1) {
            C62668SLf c62668SLf = this.mUIImplementation.A04;
            c62668SLf.A02.A00();
            if (!c62668SLf.A01.get(i)) {
                ReactShadowNode A00 = c62668SLf.A00(i);
                if (A00 != null) {
                    ReactShadowNodeImpl reactShadowNodeImpl = (ReactShadowNodeImpl) A00;
                    AbstractC05810Sj.A02(AbstractC167007dF.A1M(reactShadowNodeImpl.A01));
                    return reactShadowNodeImpl.A01;
                }
                AbstractC58322PtE.A1P("Warning : attempted to resolve a non-existent react shadow node. reactTag=", i);
                return 0;
            }
        }
        return i;
    }

    @Override // X.InterfaceC65589TnT
    public View resolveView(int i) {
        return this.mUIImplementation.A05.A0L.A03(i);
    }

    @ReactMethod
    public void setChildren(int i, ReadableArray readableArray) {
        C63339Sht c63339Sht = this.mUIImplementation;
        if (c63339Sht.A09) {
            synchronized (c63339Sht.A01) {
                C62668SLf c62668SLf = c63339Sht.A04;
                ReactShadowNode A00 = c62668SLf.A00(i);
                for (int i2 = 0; i2 < readableArray.size(); i2++) {
                    ReactShadowNode A002 = c62668SLf.A00(readableArray.getInt(i2));
                    if (A002 != null) {
                        A00.A88(A002, i2);
                    } else {
                        throw new R3C(AnonymousClass001.A0O("Trying to add unknown view tag: ", readableArray.getInt(i2)));
                    }
                }
                C63389Sj5 c63389Sj5 = c63339Sht.A03;
                for (int i3 = 0; i3 < readableArray.size(); i3++) {
                    C63389Sj5.A01(c63389Sj5, A00, c63389Sj5.A01.A00(readableArray.getInt(i3)), i3);
                }
            }
        }
    }

    @ReactMethod
    public void setJSResponder(int i, boolean z) {
        C63339Sht c63339Sht = this.mUIImplementation;
        ReactShadowNode A00 = c63339Sht.A04.A00(i);
        if (A00 == null) {
            return;
        }
        while (A00.BWB() == C05F.A0C) {
            A00 = ((ReactShadowNodeImpl) A00).A09;
        }
        SZN szn = c63339Sht.A05;
        szn.A0F.add(new R5d(szn, ((ReactShadowNodeImpl) A00).A00, i, false, z));
    }

    @ReactMethod
    public void setLayoutAnimationEnabledExperimental(boolean z) {
        SZN szn = this.mUIImplementation.A05;
        szn.A0F.add(new T0c(szn, z));
    }

    public void setViewHierarchyUpdateDebugListener(InterfaceC65228TgK interfaceC65228TgK) {
        this.mUIImplementation.A05.A0C = interfaceC65228TgK;
    }

    @Override // X.InterfaceC65589TnT
    public void synchronouslyUpdateViewOnUIThread(int i, ReadableMap readableMap) {
        C63339Sht c63339Sht = this.mUIImplementation;
        c63339Sht.A05.A0L.A09(new SKS(readableMap), i);
    }

    @ReactMethod
    public void updateView(int i, String str, ReadableMap readableMap) {
        C63339Sht c63339Sht = this.mUIImplementation;
        if (c63339Sht.A09) {
            c63339Sht.A06.A00(str);
            ReactShadowNode A00 = c63339Sht.A04.A00(i);
            if (A00 != null) {
                if (readableMap != null) {
                    SKS sks = new SKS(readableMap);
                    A00.FBr(sks);
                    if (!A00.Cfz()) {
                        C63389Sj5 c63389Sj5 = c63339Sht.A03;
                        ReactShadowNodeImpl reactShadowNodeImpl = (ReactShadowNodeImpl) A00;
                        if (reactShadowNodeImpl.A0H && !C63389Sj5.A07(sks)) {
                            C63389Sj5.A02(c63389Sj5, A00, sks);
                            return;
                        } else {
                            if (reactShadowNodeImpl.A0H) {
                                return;
                            }
                            SZN szn = c63389Sj5.A02;
                            int i2 = reactShadowNodeImpl.A00;
                            szn.A0B++;
                            szn.A0F.add(new R5b(sks, szn, i2));
                            return;
                        }
                    }
                    return;
                }
                return;
            }
            throw new R3C(AnonymousClass001.A0O("Trying to update non-existent view with tag ", i));
        }
    }

    @ReactMethod
    @Deprecated
    public void viewIsDescendantOf(int i, int i2, Callback callback) {
        Object[] objArr;
        boolean z;
        boolean z2;
        C62668SLf c62668SLf = this.mUIImplementation.A04;
        ReactShadowNode A00 = c62668SLf.A00(i);
        ReactShadowNode A002 = c62668SLf.A00(i2);
        if (A00 != null && A002 != null) {
            objArr = new Object[1];
            ReactShadowNodeImpl reactShadowNodeImpl = ((ReactShadowNodeImpl) A00).A09;
            while (true) {
                if (reactShadowNodeImpl != null) {
                    if (reactShadowNodeImpl == A002) {
                        z2 = true;
                        break;
                    }
                    reactShadowNodeImpl = reactShadowNodeImpl.A09;
                } else {
                    z2 = false;
                    break;
                }
            }
            z = Boolean.valueOf(z2);
        } else {
            objArr = new Object[1];
            z = false;
        }
        objArr[0] = z;
        callback.invoke(objArr);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.Sjr] */
    public UIManagerModule(R3M r3m, List list, int i) {
        super(r3m);
        this.mMemoryTrimCallback = new Object();
        this.mListeners = AbstractC166987dD.A1E();
        this.mUIManagerListeners = new CopyOnWriteArrayList();
        this.mBatchId = 0;
        C63356SiD.A04(r3m);
        T0q t0q = new T0q(r3m);
        this.mEventDispatcher = t0q;
        HashMap A1G = AbstractC166987dD.A1G();
        this.mCustomDirectEvents = A1G;
        this.mModuleConstants = createConstants(list, null, A1G);
        ComponentCallbacks2C63415Sjt componentCallbacks2C63415Sjt = new ComponentCallbacks2C63415Sjt(list);
        this.mViewManagerRegistry = componentCallbacks2C63415Sjt;
        this.mUIImplementation = new C63339Sht(r3m, componentCallbacks2C63415Sjt, t0q, i);
        r3m.A0A(this);
    }

    @ReactMethod
    public void dispatchViewManagerCommand(int i, Dynamic dynamic, ReadableArray readableArray) {
        R3M A0b = AbstractC58321PtD.A0b(this);
        int i2 = 2;
        if (i % 2 != 0) {
            i2 = 1;
        }
        InterfaceC65589TnT A03 = UIManagerHelper.A03(A0b, i2, true);
        if (A03 != null) {
            if (dynamic.getType() == ReadableType.Number) {
                A03.dispatchCommand(i, dynamic.asInt(), readableArray);
            } else {
                if (dynamic.getType() != ReadableType.String) {
                    return;
                }
                A03.dispatchCommand(i, dynamic.asString(), readableArray);
            }
        }
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public InterfaceC65657Tqj getDefaultEventTypes() {
        HashMap A00 = WDr.A00();
        HashMap A02 = WDr.A02();
        HashMap A12 = AbstractC31174DnI.A12("bubblingEventTypes", A00);
        A12.put("directEventTypes", A02);
        return Arguments.makeNativeMap(A12);
    }

    public void receiveEvent(int i, int i2, String str, InterfaceC65657Tqj interfaceC65657Tqj) {
        ((RCTEventEmitter) AbstractC58321PtD.A0b(this).A03(RCTEventEmitter.class)).receiveEvent(i2, str, interfaceC65657Tqj);
    }

    public void setViewLocalData(int i, Object obj) {
        R3M A0b = AbstractC58321PtD.A0b(this);
        MessageQueueThread messageQueueThread = A0b.A05;
        AbstractC05810Sj.A00(messageQueueThread);
        messageQueueThread.assertIsOnThread();
        Q21.A00(A0b, new R38(A0b, this, obj, i));
    }

    public int startSurface(View view, String str, InterfaceC65657Tqj interfaceC65657Tqj, int i, int i2) {
        throw AbstractC43592JPx.A11();
    }

    public void stopSurface(int i) {
        throw AbstractC43592JPx.A11();
    }

    public void updateInsetsPadding(int i, int i2, int i3, int i4, int i5) {
        AbstractC58321PtD.A0b(this).A07();
        C63339Sht c63339Sht = this.mUIImplementation;
        ReactShadowNode A00 = c63339Sht.A04.A00(i);
        if (A00 == null) {
            AbstractC58322PtE.A1P("Tried to update size of non-existent tag: ", i);
            return;
        }
        A00.EaQ(4, i3);
        A00.EaQ(1, i2);
        A00.EaQ(5, i5);
        A00.EaQ(3, i4);
        C63339Sht.A03(c63339Sht);
    }

    public void updateNodeSize(int i, int i2, int i3) {
        AbstractC58321PtD.A0b(this).A07();
        C63339Sht c63339Sht = this.mUIImplementation;
        ReactShadowNode A00 = c63339Sht.A04.A00(i);
        if (A00 == null) {
            AbstractC58322PtE.A1P("Tried to update size of non-existent tag: ", i);
            return;
        }
        YogaNodeJNIBase yogaNodeJNIBase = (YogaNodeJNIBase) ((ReactShadowNodeImpl) A00).A0B;
        YogaNative.jni_YGNodeStyleSetWidthJNI(yogaNodeJNIBase.mNativePointer, i2);
        YogaNative.jni_YGNodeStyleSetHeightJNI(yogaNodeJNIBase.mNativePointer, i3);
        C63339Sht.A03(c63339Sht);
    }

    @Override // X.InterfaceC65589TnT
    public void updateRootLayoutSpecs(int i, int i2, int i3, int i4, int i5) {
        R3M A0b = AbstractC58321PtD.A0b(this);
        Q21.A00(A0b, new R39(A0b, this, i, i2, i3));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.Sjr] */
    public UIManagerModule(R3M r3m, InterfaceC65227TgJ interfaceC65227TgJ, int i) {
        super(r3m);
        this.mMemoryTrimCallback = new Object();
        this.mListeners = AbstractC166987dD.A1E();
        this.mUIManagerListeners = new CopyOnWriteArrayList();
        this.mBatchId = 0;
        C63356SiD.A04(r3m);
        this.mEventDispatcher = new T0q(r3m);
        createConstants(interfaceC65227TgJ);
        throw C00O.createAndThrow();
    }

    public static Map createConstants(List list, Map map, Map map2) {
        ReactMarker.logMarker(RhX.A0R);
        AbstractC09720ep A00 = SystraceMessage.A00(SystraceMessage.A00, "CreateUIManagerConstants", OdexSchemeArtXdex.STATE_PGO_ATTEMPTED);
        A00.A00(AbstractC166997dE.A0a(), "Lazy");
        A00.A02();
        try {
            HashMap A01 = WDr.A01();
            HashMap A002 = WDr.A00();
            HashMap A02 = WDr.A02();
            if (map != null) {
                map.putAll(A002);
            }
            if (map2 != null) {
                map2.putAll(A02);
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ViewManager viewManager = (ViewManager) it.next();
                String name = viewManager.getName();
                HashMap A003 = C63235Sfn.A00(viewManager, map, map2);
                if (!A003.isEmpty()) {
                    A01.put(name, A003);
                }
            }
            A01.put("genericBubblingEventTypes", A002);
            A01.put("genericDirectEventTypes", A02);
            C0fY.A00(OdexSchemeArtXdex.STATE_PGO_ATTEMPTED, -1809393233);
            ReactMarker.logMarker(RhX.A0Q);
            return A01;
        } catch (Throwable th) {
            C0fY.A00(OdexSchemeArtXdex.STATE_PGO_ATTEMPTED, 1998569504);
            ReactMarker.logMarker(RhX.A0Q);
            throw th;
        }
    }

    public int addRootView(View view) {
        return addRootView(view, null);
    }

    @Override // X.InterfaceC65589TnT
    public void dispatchCommand(int i, String str, ReadableArray readableArray) {
        C63339Sht c63339Sht = this.mUIImplementation;
        String A0R = AnonymousClass001.A0R("dispatchViewManagerCommand: ", str);
        if (c63339Sht.A04.A00(i) != null) {
            SZN szn = c63339Sht.A05;
            szn.A0G.add(new C60535R5i(readableArray, szn, str, i));
            return;
        }
        C0I2.A04("ReactNative", AnonymousClass001.A09(i, "Unable to execute operation ", A0R, " on view with tag: ", ", since the view does not exist"));
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public InterfaceC65657Tqj getConstantsForViewManager(String str) {
        ViewManager viewManager;
        ComponentCallbacks2C63415Sjt componentCallbacks2C63415Sjt = this.mUIImplementation.A06;
        synchronized (componentCallbacks2C63415Sjt) {
            viewManager = (ViewManager) componentCallbacks2C63415Sjt.A00.get(str);
            if (viewManager == null) {
                viewManager = null;
            }
        }
        if (viewManager == null) {
            return null;
        }
        return getConstantsForViewManager(viewManager, this.mCustomDirectEvents);
    }

    /* renamed from: getEventDispatcher, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m76getEventDispatcher() {
        return this.mEventDispatcher;
    }

    public void receiveEvent(int i, String str, InterfaceC65657Tqj interfaceC65657Tqj) {
        receiveEvent(-1, i, str, interfaceC65657Tqj);
    }
}
