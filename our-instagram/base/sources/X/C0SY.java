package X;

import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__EmittersKt", f = "Emitters.kt", i = {0}, l = {212}, m = "invokeSafely$FlowKt__EmittersKt", n = {"cause"}, s = {"L$0"})
/* renamed from: X.0SY, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0SY extends C1Dq {
    public int A00;
    public Object A01;
    public /* synthetic */ Object A02;

    public C0SY(InterfaceC23621Ds interfaceC23621Ds) {
        super(interfaceC23621Ds);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        this.A02 = obj;
        this.A00 |= Integer.MIN_VALUE;
        return C11G.A00(null, this, null, null);
    }
}
