package com.instagram.security.attestation.keystore.worker;

import X.C12L;
import X.C14090nZ;
import X.C14360o3;
import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;

/* loaded from: classes3.dex */
public final class KeyAttestationWorker extends CoroutineWorker {
    public final C14090nZ A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KeyAttestationWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        C14360o3.A0B(context, 1);
        C14360o3.A0B(workerParameters, 2);
        this.A00 = C12L.A00.CPG(1800671267, 3);
    }
}
