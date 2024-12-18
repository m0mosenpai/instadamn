package X;

import com.facebook.pando.PandoGraphQLRequest;

/* renamed from: X.TLk, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class RunnableC64599TLk implements Runnable {
    public final /* synthetic */ C64479TFp A00;

    public RunnableC64599TLk(C64479TFp c64479TFp) {
        this.A00 = c64479TFp;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1Dk maxToleratedCacheAgeMs = new PandoGraphQLRequest(AbstractC25225BEi.A0c(), "IGOnDeviceAppHistoryPrivacyQuery", AbstractC25225BEi.A0b().getParamsCopy(), AbstractC25225BEi.A0b().getParamsCopy(), C5NS.class, false, null, 0, null, "ig_on_device_app_history_privacy", AbstractC166987dD.A1E()).setMaxToleratedCacheAgeMs(0L);
        C64479TFp c64479TFp = this.A00;
        c64479TFp.A03.A06(maxToleratedCacheAgeMs, new C60902RbH(c64479TFp, 5));
    }
}
