package X;

import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$drop$2$1", f = "Limit.kt", i = {}, l = {21}, m = "emit", n = {}, s = {})
/* renamed from: X.119, reason: invalid class name */
/* loaded from: classes.dex */
public final class AnonymousClass119 extends C1Dq {
    public int A00;
    public /* synthetic */ Object A01;
    public final /* synthetic */ C16320rd A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnonymousClass119(InterfaceC23621Ds interfaceC23621Ds, C16320rd c16320rd) {
        super(interfaceC23621Ds);
        this.A02 = c16320rd;
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        this.A01 = obj;
        this.A00 |= Integer.MIN_VALUE;
        return this.A02.emit(null, this);
    }
}
