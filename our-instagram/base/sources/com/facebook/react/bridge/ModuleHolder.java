package com.facebook.react.bridge;

import X.AbstractC05810Sj;
import X.AbstractC09720ep;
import X.AbstractC58322PtE;
import X.InterfaceC08830cm;
import X.MSW;
import X.RhX;
import X.SX2;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.common.dextricks.OdexSchemeArtXdex;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import com.facebook.systrace.SystraceMessage;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes10.dex */
public class ModuleHolder {
    public static final AtomicInteger sInstanceKeyCounter = MSW.A1C(1);
    public boolean mInitializable;
    public final int mInstanceKey = sInstanceKeyCounter.getAndIncrement();
    public boolean mIsCreating;
    public boolean mIsInitializing;
    public NativeModule mModule;
    public final String mName;
    public InterfaceC08830cm mProvider;
    public final SX2 mReactModuleInfo;

    public NativeModule getModule() {
        NativeModule nativeModule;
        synchronized (this) {
            NativeModule nativeModule2 = this.mModule;
            if (nativeModule2 != null) {
                return nativeModule2;
            }
            boolean z = true;
            if (!this.mIsCreating) {
                this.mIsCreating = true;
            } else {
                z = false;
            }
            if (z) {
                NativeModule create = create();
                synchronized (this) {
                    this.mIsCreating = false;
                    notifyAll();
                }
                return create;
            }
            synchronized (this) {
                while (true) {
                    nativeModule = this.mModule;
                    if (nativeModule != null || !this.mIsCreating) {
                        break;
                    }
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                    }
                }
                AbstractC05810Sj.A00(nativeModule);
            }
            return nativeModule;
        }
    }

    public void markInitializable() {
        boolean z;
        NativeModule nativeModule;
        synchronized (this) {
            z = true;
            this.mInitializable = true;
            boolean z2 = false;
            if (this.mModule != null) {
                if (!this.mIsInitializing) {
                    z2 = true;
                }
                AbstractC05810Sj.A02(z2);
                nativeModule = this.mModule;
            } else {
                nativeModule = null;
                z = false;
            }
        }
        if (z) {
            doInitialize(nativeModule);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0040, code lost:
    
        if (r6.mIsInitializing != false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private com.facebook.react.bridge.NativeModule create() {
        /*
            r6 = this;
            com.facebook.react.bridge.NativeModule r0 = r6.mModule
            boolean r1 = X.AbstractC25229BEm.A1Z(r0)
            java.lang.String r0 = "Creating an already created module."
            X.C62791SRl.A00(r1, r0)
            X.RhX r2 = X.RhX.A0N
            java.lang.String r1 = r6.mName
            int r0 = r6.mInstanceKey
            com.facebook.react.bridge.ReactMarker.logMarker(r2, r1, r0)
            java.lang.String r3 = "ModuleHolder.createModule"
            r1 = 8192(0x2000, double:4.0474E-320)
            X.0eq r0 = com.facebook.systrace.SystraceMessage.A00
            X.0ep r2 = com.facebook.systrace.SystraceMessage.A00(r0, r3, r1)
            java.lang.String r1 = "name"
            java.lang.String r0 = r6.mName
            r2.A00(r0, r1)
            r2.A02()
            X.0cm r0 = r6.mProvider     // Catch: java.lang.Throwable -> L59
            X.AbstractC05810Sj.A00(r0)     // Catch: java.lang.Throwable -> L59
            java.lang.Object r3 = r0.get()     // Catch: java.lang.Throwable -> L59
            com.facebook.react.bridge.NativeModule r3 = (com.facebook.react.bridge.NativeModule) r3     // Catch: java.lang.Throwable -> L59
            r0 = 0
            r6.mProvider = r0     // Catch: java.lang.Throwable -> L59
            monitor-enter(r6)     // Catch: java.lang.Throwable -> L59
            r6.mModule = r3     // Catch: java.lang.Throwable -> L56
            boolean r0 = r6.mInitializable     // Catch: java.lang.Throwable -> L56
            if (r0 == 0) goto L42
            boolean r1 = r6.mIsInitializing     // Catch: java.lang.Throwable -> L56
            r0 = 1
            if (r1 == 0) goto L43
        L42:
            r0 = 0
        L43:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L56
            if (r0 == 0) goto L49
            r6.doInitialize(r3)     // Catch: java.lang.Throwable -> L59
        L49:
            X.RhX r2 = X.RhX.A0M
            java.lang.String r1 = r6.mName
            int r0 = r6.mInstanceKey
            com.facebook.react.bridge.ReactMarker.logMarker(r2, r1, r0)
            X.AbstractC58322PtE.A15()
            return r3
        L56:
            r0 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L56
            throw r0     // Catch: java.lang.Throwable -> L59
        L59:
            r5 = move-exception
            java.lang.String r4 = "ReactNative"
            java.lang.String r3 = "Failed to create NativeModule '%s'"
            java.lang.String r0 = r6.mName     // Catch: java.lang.Throwable -> L75
            java.lang.Object[] r2 = new java.lang.Object[]{r0}     // Catch: java.lang.Throwable -> L75
            X.0I3 r1 = X.C0I2.A00     // Catch: java.lang.Throwable -> L75
            r0 = 6
            boolean r0 = r1.isLoggable(r0)     // Catch: java.lang.Throwable -> L75
            if (r0 == 0) goto L74
            java.lang.String r0 = X.AbstractC58318PtA.A0k(r3, r2)     // Catch: java.lang.Throwable -> L75
            r1.e(r4, r0, r5)     // Catch: java.lang.Throwable -> L75
        L74:
            throw r5     // Catch: java.lang.Throwable -> L75
        L75:
            r3 = move-exception
            X.RhX r2 = X.RhX.A0M
            java.lang.String r1 = r6.mName
            int r0 = r6.mInstanceKey
            com.facebook.react.bridge.ReactMarker.logMarker(r2, r1, r0)
            X.AbstractC58322PtE.A15()
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.bridge.ModuleHolder.create():com.facebook.react.bridge.NativeModule");
    }

    private void doInitialize(NativeModule nativeModule) {
        boolean z;
        AbstractC09720ep A00 = SystraceMessage.A00(SystraceMessage.A00, "ModuleHolder.initialize", OdexSchemeArtXdex.STATE_PGO_ATTEMPTED);
        A00.A00(this.mName, PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
        A00.A02();
        ReactMarker.logMarker(RhX.A0w, this.mName, this.mInstanceKey);
        try {
            synchronized (this) {
                try {
                    z = true;
                    if (this.mInitializable && !this.mIsInitializing) {
                        this.mIsInitializing = true;
                    } else {
                        z = false;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (z) {
                nativeModule.initialize();
                synchronized (this) {
                    try {
                        this.mIsInitializing = false;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        } finally {
            ReactMarker.logMarker(RhX.A0v, this.mName, this.mInstanceKey);
            AbstractC58322PtE.A15();
        }
    }

    public String getName() {
        return this.mName;
    }

    public ModuleHolder(SX2 sx2, InterfaceC08830cm interfaceC08830cm) {
        this.mName = sx2.A01;
        this.mProvider = interfaceC08830cm;
        this.mReactModuleInfo = sx2;
        if (sx2.A03) {
            this.mModule = create();
        }
    }

    public ModuleHolder(NativeModule nativeModule) {
        this.mName = nativeModule.getName();
        String name = nativeModule.getName();
        Class<?> cls = nativeModule.getClass();
        this.mReactModuleInfo = new SX2(name, cls.getSimpleName(), nativeModule.canOverrideExistingModule(), true, CxxModuleWrapper.class.isAssignableFrom(cls), TurboModule.class.isAssignableFrom(cls));
        this.mModule = nativeModule;
    }
}
