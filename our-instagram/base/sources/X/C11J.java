package X;

import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1", f = "Emitters.kt", i = {0, 0, 0}, l = {115, 119}, m = "collect", n = {"this", "$this$onStart_u24lambda_u241", "safeCollector"}, s = {"L$0", "L$1", "L$2"})
/* renamed from: X.11J, reason: invalid class name */
/* loaded from: classes.dex */
public final class C11J extends C1Dq {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public /* synthetic */ Object A04;
    public final /* synthetic */ C16400rl A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11J(InterfaceC23621Ds interfaceC23621Ds, C16400rl c16400rl) {
        super(interfaceC23621Ds);
        this.A05 = c16400rl;
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        this.A04 = obj;
        this.A00 |= Integer.MIN_VALUE;
        return this.A05.collect(null, this);
    }
}
