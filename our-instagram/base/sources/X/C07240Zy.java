package X;

import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1", f = "Emitters.kt", i = {0, 0, 0, 1}, l = {113, 121}, m = "collect", n = {"this", "$this$onEmpty_u24lambda_u243", "isEmpty", "collector"}, s = {"L$0", "L$1", "L$2", "L$0"})
/* renamed from: X.0Zy, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C07240Zy extends C1Dq {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public /* synthetic */ Object A04;
    public final /* synthetic */ C11200ib A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C07240Zy(C11200ib c11200ib, InterfaceC23621Ds interfaceC23621Ds) {
        super(interfaceC23621Ds);
        this.A05 = c11200ib;
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        this.A04 = obj;
        this.A00 |= Integer.MIN_VALUE;
        return this.A05.collect(null, this);
    }
}
