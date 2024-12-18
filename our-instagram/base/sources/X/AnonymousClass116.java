package X;

import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$take$$inlined$unsafeFlow$1", f = "Limit.kt", i = {0}, l = {115}, m = "collect", n = {"ownershipMarker"}, s = {"L$0"})
/* renamed from: X.116, reason: invalid class name */
/* loaded from: classes.dex */
public final class AnonymousClass116 extends C1Dq {
    public int A00;
    public Object A01;
    public /* synthetic */ Object A02;
    public final /* synthetic */ C16240rS A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnonymousClass116(InterfaceC23621Ds interfaceC23621Ds, C16240rS c16240rS) {
        super(interfaceC23621Ds);
        this.A03 = c16240rS;
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        this.A02 = obj;
        this.A00 |= Integer.MIN_VALUE;
        return this.A03.collect(null, this);
    }
}
