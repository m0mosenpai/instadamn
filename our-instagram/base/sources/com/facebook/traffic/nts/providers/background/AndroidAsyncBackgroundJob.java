package com.facebook.traffic.nts.providers.background;

import X.AbstractC167017dG;
import X.AbstractC48352Kc;
import X.C51A;
import android.content.Context;
import androidx.work.WorkerParameters;
import com.google.common.util.concurrent.ListenableFuture;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes10.dex */
public final class AndroidAsyncBackgroundJob extends AbstractC48352Kc {
    public static final Companion Companion = new Object();
    public static final String TAG = "TNTSAsyncBackgroundV2Job";

    /* loaded from: classes10.dex */
    public final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public Companion() {
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object, X.2Nt] */
    @Override // X.AbstractC48352Kc
    public ListenableFuture startWork() {
        ?? obj = new Object();
        obj.A07(new C51A());
        return obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidAsyncBackgroundJob(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        AbstractC167017dG.A1P(context, workerParameters);
    }
}
