package com.instagram.pendingmedia.service.impl;

import X.AbstractC09440dt;
import X.AbstractC167017dG;
import X.AbstractC31177DnL;
import X.C14360o3;
import X.C48532Kv;
import X.DGZ;
import X.InterfaceC09390do;
import X.InterfaceC23621Ds;
import X.L59;
import X.MVD;
import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;

/* loaded from: classes8.dex */
public final class NetworkRetryWorker extends CoroutineWorker {
    public final InterfaceC09390do A00;

    /* JADX WARN: Removed duplicated region for block: B:12:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A03(X.InterfaceC23621Ds r13) {
        /*
            Method dump skipped, instructions count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.pendingmedia.service.impl.NetworkRetryWorker.A03(X.1Ds):java.lang.Object");
    }

    @Override // androidx.work.CoroutineWorker
    public final Object A04(InterfaceC23621Ds interfaceC23621Ds) {
        MVD mvd = MVD.A00;
        Context context = this.mAppContext;
        C14360o3.A07(context);
        C48532Kv c48532Kv = this.mWorkerParams.A02;
        C14360o3.A07(c48532Kv);
        return mvd.A01(context, new L59(null, null, null, null, AbstractC31177DnL.A04(c48532Kv.A03("PENDING_MEDIA_KEY")), false, true));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetworkRetryWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        AbstractC167017dG.A1P(context, workerParameters);
        this.A00 = AbstractC09440dt.A01(new DGZ(this, 9));
    }
}
