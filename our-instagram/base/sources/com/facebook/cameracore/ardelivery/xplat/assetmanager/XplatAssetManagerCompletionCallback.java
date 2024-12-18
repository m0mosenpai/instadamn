package com.facebook.cameracore.ardelivery.xplat.assetmanager;

import X.AbstractC167017dG;
import X.C14360o3;
import X.InterfaceC203698zY;
import X.RunnableC24528Atl;
import X.RunnableC24529Atm;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes4.dex */
public final class XplatAssetManagerCompletionCallback {
    public final Executor backgroundExecutor;
    public final InterfaceC203698zY stateListener;

    public final void onFail(String str) {
        C14360o3.A0B(str, 0);
        this.backgroundExecutor.execute(new RunnableC24528Atl(this, str));
    }

    public final void onSuccess(List list) {
        C14360o3.A0B(list, 0);
        this.backgroundExecutor.execute(new RunnableC24529Atm(this, list));
    }

    public XplatAssetManagerCompletionCallback(InterfaceC203698zY interfaceC203698zY, Executor executor) {
        AbstractC167017dG.A1P(interfaceC203698zY, executor);
        this.stateListener = interfaceC203698zY;
        this.backgroundExecutor = executor;
    }
}
