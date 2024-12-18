package com.instagram.ml.remotepresence;

import X.AbstractC09440dt;
import X.AbstractC167017dG;
import X.C57247PbV;
import X.EnumC09460dv;
import X.InterfaceC09390do;
import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;

/* loaded from: classes4.dex */
public final class RpModelDownloadWorker extends CoroutineWorker {
    public final int A00;
    public final InterfaceC09390do A01;

    /* JADX WARN: Removed duplicated region for block: B:14:0x00bb A[Catch: InterruptedException | CancellationException | ExecutionException -> 0x00f4, TryCatch #0 {InterruptedException | CancellationException | ExecutionException -> 0x00f4, blocks: (B:11:0x00b4, B:12:0x00b7, B:14:0x00bb, B:17:0x00c1, B:19:0x00db, B:20:0x00e5), top: B:10:0x00b4 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00c1 A[Catch: InterruptedException | CancellationException | ExecutionException -> 0x00f4, TryCatch #0 {InterruptedException | CancellationException | ExecutionException -> 0x00f4, blocks: (B:11:0x00b4, B:12:0x00b7, B:14:0x00bb, B:17:0x00c1, B:19:0x00db, B:20:0x00e5), top: B:10:0x00b4 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A03(X.InterfaceC23621Ds r9) {
        /*
            Method dump skipped, instructions count: 271
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.ml.remotepresence.RpModelDownloadWorker.A03(X.1Ds):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RpModelDownloadWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        AbstractC167017dG.A1P(context, workerParameters);
        this.A01 = AbstractC09440dt.A00(EnumC09460dv.A02, new C57247PbV(this, 28));
        this.A00 = this.mWorkerParams.A02.A02("maxRetries", 0);
    }
}
