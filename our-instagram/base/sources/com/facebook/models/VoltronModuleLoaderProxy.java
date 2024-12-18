package com.facebook.models;

import X.InterfaceC195968lj;
import com.google.common.util.concurrent.ListenableFuture;

/* loaded from: classes4.dex */
public class VoltronModuleLoaderProxy {
    public final InterfaceC195968lj mVoltronModuleLoader;

    /* JADX WARN: Type inference failed for: r2v1, types: [com.google.common.util.concurrent.ListenableFuture, X.1Ke, java.lang.Object] */
    public ListenableFuture loadModule() {
        InterfaceC195968lj interfaceC195968lj = this.mVoltronModuleLoader;
        if (interfaceC195968lj == null) {
            ?? obj = new Object();
            obj.set(new VoltronLoadingResult(true, true));
            return obj;
        }
        return interfaceC195968lj.loadModule();
    }

    public boolean requireLoad() {
        InterfaceC195968lj interfaceC195968lj = this.mVoltronModuleLoader;
        if (interfaceC195968lj == null) {
            return false;
        }
        return interfaceC195968lj.requireLoad();
    }

    public VoltronModuleLoaderProxy(InterfaceC195968lj interfaceC195968lj) {
        this.mVoltronModuleLoader = interfaceC195968lj;
    }
}
