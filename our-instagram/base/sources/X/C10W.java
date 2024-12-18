package X;

import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$runningFold$1$1", f = "Transform.kt", i = {0}, l = {105, 106}, m = "emit", n = {"this"}, s = {"L$0"})
/* renamed from: X.10W, reason: invalid class name */
/* loaded from: classes.dex */
public final class C10W extends C1Dq {
    public int A00;
    public Object A01;
    public Object A02;
    public /* synthetic */ Object A03;
    public final /* synthetic */ C15260pg A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10W(InterfaceC23621Ds interfaceC23621Ds, C15260pg c15260pg) {
        super(interfaceC23621Ds);
        this.A04 = c15260pg;
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        this.A03 = obj;
        this.A00 |= Integer.MIN_VALUE;
        return this.A04.emit(null, this);
    }
}
