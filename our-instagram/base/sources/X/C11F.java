package X;

import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1", f = "Errors.kt", i = {0, 0}, l = {112, 113}, m = "collect", n = {"this", "$this$catch_u24lambda_u240"}, s = {"L$0", "L$1"})
/* renamed from: X.11F, reason: invalid class name */
/* loaded from: classes.dex */
public final class C11F extends C1Dq {
    public int A00;
    public Object A01;
    public Object A02;
    public /* synthetic */ Object A03;
    public final /* synthetic */ C16360rh A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11F(InterfaceC23621Ds interfaceC23621Ds, C16360rh c16360rh) {
        super(interfaceC23621Ds);
        this.A04 = c16360rh;
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        this.A03 = obj;
        this.A00 |= Integer.MIN_VALUE;
        return this.A04.collect(null, this);
    }
}
