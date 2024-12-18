package X;

import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", i = {0, 0}, l = {179}, m = "first", n = {"result", "collector$iv"}, s = {"L$0", "L$1"})
/* renamed from: X.10y, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C209910y extends C1Dq {
    public int A00;
    public Object A01;
    public Object A02;
    public /* synthetic */ Object A03;

    public C209910y(InterfaceC23621Ds interfaceC23621Ds) {
        super(interfaceC23621Ds);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        this.A03 = obj;
        this.A00 |= Integer.MIN_VALUE;
        return AbstractC209010m.A02(this, null);
    }
}
