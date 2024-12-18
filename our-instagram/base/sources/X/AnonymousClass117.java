package X;

import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__LimitKt", f = "Limit.kt", i = {0}, l = {70}, m = "emitAbort$FlowKt__LimitKt", n = {"ownershipMarker"}, s = {"L$0"})
/* renamed from: X.117, reason: invalid class name */
/* loaded from: classes.dex */
public final class AnonymousClass117 extends C1Dq {
    public int A00;
    public Object A01;
    public /* synthetic */ Object A02;

    public AnonymousClass117(InterfaceC23621Ds interfaceC23621Ds) {
        super(interfaceC23621Ds);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        this.A02 = obj;
        this.A00 |= Integer.MIN_VALUE;
        AnonymousClass114.A00(null, null, this, null);
        throw C00O.createAndThrow();
    }
}
