package X;

import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$values$1$1", f = "Delay.kt", i = {}, l = {204}, m = "emit", n = {}, s = {})
/* renamed from: X.0N6, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0N6 extends C1Dq {
    public int A00;
    public /* synthetic */ Object A01;
    public final /* synthetic */ C16420rn A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0N6(InterfaceC23621Ds interfaceC23621Ds, C16420rn c16420rn) {
        super(interfaceC23621Ds);
        this.A02 = c16420rn;
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        this.A01 = obj;
        this.A00 |= Integer.MIN_VALUE;
        return this.A02.emit(null, this);
    }
}
