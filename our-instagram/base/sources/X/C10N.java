package X;

import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "kotlinx.coroutines.flow.SharedFlowImpl", f = "SharedFlow.kt", i = {0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2}, l = {382, 389, 392}, m = "collect$suspendImpl", n = {"$this", "collector", "slot", "$this", "collector", "slot", "collectorJob", "$this", "collector", "slot", "collectorJob"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3"})
/* renamed from: X.10N, reason: invalid class name */
/* loaded from: classes.dex */
public final class C10N extends C1Dq {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public /* synthetic */ Object A05;
    public final /* synthetic */ AnonymousClass057 A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10N(InterfaceC23621Ds interfaceC23621Ds, AnonymousClass057 anonymousClass057) {
        super(interfaceC23621Ds);
        this.A06 = anonymousClass057;
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        this.A05 = obj;
        this.A00 |= Integer.MIN_VALUE;
        return AnonymousClass057.A01(this, null, this.A06);
    }
}
