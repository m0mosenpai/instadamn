package X;

import com.instagram.quickpromotion.sdk.IGOnDemandFetcher;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.quickpromotion.sdk.IGOnDemandFetcher", f = "IGOnDemandFetcher.kt", i = {0, 0, 0, 0, 0, 0, 0, 1, 1}, l = {89, 117}, m = "fetchPromotions", n = {"key", "serverTriggerContext", "coroutineContext", "quickPromotionSurface", "IGqpSDKLogProducer", "slotFetcher", "devModeEnabled", "this", "key"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "Z$0", "L$0", "L$1"})
/* renamed from: X.4O3, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4O3 extends C1Dq {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public Object A06;
    public /* synthetic */ Object A07;
    public final /* synthetic */ IGOnDemandFetcher A08;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4O3(IGOnDemandFetcher iGOnDemandFetcher, InterfaceC23621Ds interfaceC23621Ds) {
        super(interfaceC23621Ds);
        this.A08 = iGOnDemandFetcher;
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        this.A07 = obj;
        this.A00 |= Integer.MIN_VALUE;
        return IGOnDemandFetcher.A00(null, null, null, null, this.A08, null, this, null, false);
    }
}
