package com.instagram.util.creation;

import X.AbstractC14350nz;
import X.AbstractRunnableC14200nk;
import X.C09170dP;
import X.C0K8;
import X.C0o0;
import X.C18240vB;
import X.InterfaceC185858Mf;
import com.instagram.util.creation.ShaderBridge;

/* loaded from: classes.dex */
public class ShaderBridge {
    public static final Class TAG = ShaderBridge.class;
    public static final C18240vB sExecutor;
    public static boolean sLoaded;
    public static final Object sLock;

    public static native int compileProgram(String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6);

    static {
        C0o0 A00 = AbstractC14350nz.A00();
        A00.A01 = "shaderbridge";
        sExecutor = new C18240vB(A00);
        sLock = new Object();
    }

    public static void ensureShaderBridgeLoaded() {
        boolean z;
        if (!sLoaded) {
            synchronized (sLock) {
                z = sLoaded;
            }
            if (!z) {
                loadLibrariesSync();
            }
        }
    }

    public static void loadLibraries(final InterfaceC185858Mf interfaceC185858Mf) {
        synchronized (sLock) {
            if (sLoaded) {
                interfaceC185858Mf.DH5(true);
            } else {
                sExecutor.ATO(new AbstractRunnableC14200nk() { // from class: X.8Mg
                    {
                        super(351);
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean loadLibrariesSync = ShaderBridge.loadLibrariesSync();
                        ShaderBridge.sLoaded = loadLibrariesSync;
                        InterfaceC185858Mf.this.DH5(loadLibrariesSync);
                    }
                });
            }
        }
    }

    public static boolean loadLibrariesSync() {
        synchronized (sLock) {
            if (!sLoaded) {
                try {
                    C09170dP.A0C("scrambler");
                    C09170dP.A0C("cj_moz");
                    sLoaded = true;
                } catch (UnsatisfiedLinkError e) {
                    C0K8.A05(ShaderBridge.class, "Could not load native library", e);
                }
            }
        }
        return sLoaded;
    }
}
