package X;

import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$runningFold$$inlined$unsafeFlow$1", f = "Transform.kt", i = {0, 0, 0}, l = {113, 114}, m = "collect", n = {"this", "$this$runningFold_u24lambda_u249", "accumulator"}, s = {"L$0", "L$1", "L$2"})
/* renamed from: X.10X, reason: invalid class name */
/* loaded from: classes.dex */
public final class C10X extends C1Dq {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public /* synthetic */ Object A04;
    public final /* synthetic */ C15290pj A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10X(InterfaceC23621Ds interfaceC23621Ds, C15290pj c15290pj) {
        super(interfaceC23621Ds);
        this.A05 = c15290pj;
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        this.A04 = obj;
        this.A00 |= Integer.MIN_VALUE;
        return this.A05.collect(null, this);
    }
}
