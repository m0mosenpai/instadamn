package X;

import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt$first$$inlined$collectWhile$2", f = "Reduce.kt", i = {0, 0}, l = {139}, m = "emit", n = {"this", "it"}, s = {"L$0", "L$1"})
/* renamed from: X.10z, reason: invalid class name */
/* loaded from: classes.dex */
public final class C10z extends C1Dq {
    public int A00;
    public Object A01;
    public Object A02;
    public /* synthetic */ Object A03;
    public final /* synthetic */ C15650qL A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10z(InterfaceC23621Ds interfaceC23621Ds, C15650qL c15650qL) {
        super(interfaceC23621Ds);
        this.A04 = c15650qL;
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        this.A03 = obj;
        this.A00 |= Integer.MIN_VALUE;
        return this.A04.emit(null, this);
    }
}
