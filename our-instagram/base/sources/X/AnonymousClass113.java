package X;

import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1$2", f = "Merge.kt", i = {}, l = {219, 219}, m = "emit", n = {}, s = {})
/* renamed from: X.113, reason: invalid class name */
/* loaded from: classes.dex */
public final class AnonymousClass113 extends C1Dq {
    public int A00;
    public Object A01;
    public /* synthetic */ Object A02;
    public final /* synthetic */ C16070r3 A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnonymousClass113(InterfaceC23621Ds interfaceC23621Ds, C16070r3 c16070r3) {
        super(interfaceC23621Ds);
        this.A03 = c16070r3;
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        this.A02 = obj;
        this.A00 |= Integer.MIN_VALUE;
        return this.A03.emit(null, this);
    }
}
