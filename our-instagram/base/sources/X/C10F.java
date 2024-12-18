package X;

import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "kotlinx.coroutines.flow.StateFlowImpl", f = "StateFlow.kt", i = {0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2}, l = {380, 392, 397}, m = "collect", n = {"this", "collector", "slot", "this", "collector", "slot", "collectorJob", "newState", "this", "collector", "slot", "collectorJob", "oldState"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3", "L$4"})
/* renamed from: X.10F, reason: invalid class name */
/* loaded from: classes.dex */
public final class C10F extends C1Dq {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public /* synthetic */ Object A06;
    public final /* synthetic */ C008002u A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10F(InterfaceC23621Ds interfaceC23621Ds, C008002u c008002u) {
        super(interfaceC23621Ds);
        this.A07 = c008002u;
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        this.A06 = obj;
        this.A00 |= Integer.MIN_VALUE;
        return this.A07.collect(null, this);
    }
}
