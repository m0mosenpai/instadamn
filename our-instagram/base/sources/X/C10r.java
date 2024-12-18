package X;

import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", i = {0}, l = {163}, m = "lastOrNull", n = {"result"}, s = {"L$0"})
/* renamed from: X.10r, reason: invalid class name */
/* loaded from: classes.dex */
public final class C10r extends C1Dq {
    public int A00;
    public Object A01;
    public /* synthetic */ Object A02;

    public C10r(InterfaceC23621Ds interfaceC23621Ds) {
        super(interfaceC23621Ds);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        this.A02 = obj;
        this.A00 |= Integer.MIN_VALUE;
        return AbstractC209010m.A05(this, null);
    }
}
