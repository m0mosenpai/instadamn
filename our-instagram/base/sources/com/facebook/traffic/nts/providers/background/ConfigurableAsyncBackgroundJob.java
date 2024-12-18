package com.facebook.traffic.nts.providers.background;

import X.AbstractC166987dD;
import X.AbstractC167017dG;
import X.AbstractC48352Kc;
import X.C51A;
import X.InterfaceC18540vh;
import X.Y4b;
import android.content.Context;
import androidx.work.WorkerParameters;
import com.facebook.traffic.nts.providers.background.MC;
import com.facebook.ultralight.UL;
import com.google.common.util.concurrent.ListenableFuture;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes10.dex */
public final class ConfigurableAsyncBackgroundJob extends AbstractC48352Kc {
    public static final Companion Companion = new Object();
    public static final String TAG = "TNTSConfigurableAsyncBackgroundJob";

    /* loaded from: classes10.dex */
    public final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v6, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object, X.2Nr, X.2Nt] */
    @Override // X.AbstractC48352Kc
    public ListenableFuture startWork() {
        long j;
        boolean z;
        boolean z2;
        Object obj = this.mWorkerParams.A02.A00.get("timeoutAwaitSchedulerSeconds");
        if (obj instanceof Long) {
            j = AbstractC166987dD.A0N(obj);
        } else {
            j = 300;
        }
        long min = Math.min(j, 300L);
        Object obj2 = this.mWorkerParams.A02.A00.get("verifyNtsManagerEnabled");
        if (obj2 instanceof Boolean) {
            z = AbstractC166987dD.A1a(obj2);
        } else {
            z = false;
        }
        boolean z3 = true;
        if (z) {
            z2 = ((InterfaceC18540vh) Y4b.A00(UL.id._UL__ULSEP_com_facebook_mobileconfig_factory_MobileConfig_ULSEP_BINDING_ID)).AhA(MC.fb_android_traffic_nts_manager.init_services_enabled);
        } else {
            z2 = true;
        }
        Object obj3 = this.mWorkerParams.A02.A00.get("verifyNtsSchedulerEnabled");
        if ((obj3 instanceof Boolean) && AbstractC166987dD.A1a(obj3)) {
            z3 = ((InterfaceC18540vh) Y4b.A00(UL.id._UL__ULSEP_com_facebook_mobileconfig_factory_MobileConfig_ULSEP_BINDING_ID)).AhA(MC.fb_android_traffic_nts_manager.enable_background_scheduler);
        }
        ?? obj4 = new Object();
        if (z2 && z3) {
            BackgroundV2TaskSchedulerAppLayerUpcallsImpl.Companion.executeReadyTasksAsyncAndReschedule(obj4, min);
            return obj4;
        }
        obj4.A07(new C51A());
        return obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConfigurableAsyncBackgroundJob(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        AbstractC167017dG.A1P(context, workerParameters);
    }
}
