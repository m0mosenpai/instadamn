package X;

import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "kotlinx.coroutines.flow.CallbackFlowBuilder", f = "Builders.kt", i = {0}, l = {330}, m = "collectTo", n = {"scope"}, s = {"L$0"})
/* renamed from: X.0wJ, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0wJ extends C1Dq {
    public int A00;
    public Object A01;
    public /* synthetic */ Object A02;
    public final /* synthetic */ C008302x A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0wJ(InterfaceC23621Ds interfaceC23621Ds, C008302x c008302x) {
        super(interfaceC23621Ds);
        this.A03 = c008302x;
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        this.A02 = obj;
        this.A00 |= Integer.MIN_VALUE;
        return this.A03.A00(null, this);
    }
}
