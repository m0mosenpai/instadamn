package X;

import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1", f = "Builders.kt", i = {0, 0}, l = {113}, m = "collect", n = {"this", "$this$flowOf_u24lambda_u248"}, s = {"L$0", "L$1"})
/* renamed from: X.0IS, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0IS extends C1Dq {
    public int A00;
    public int A01;
    public int A02;
    public Object A03;
    public Object A04;
    public /* synthetic */ Object A05;
    public final /* synthetic */ C11950ju A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0IS(C11950ju c11950ju, InterfaceC23621Ds interfaceC23621Ds) {
        super(interfaceC23621Ds);
        this.A06 = c11950ju;
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        this.A05 = obj;
        this.A02 |= Integer.MIN_VALUE;
        return this.A06.collect(null, this);
    }
}
