package X;

import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$2", f = "Errors.kt", i = {0}, l = {154}, m = "emit", n = {"this"}, s = {"L$0"})
/* renamed from: X.11D, reason: invalid class name */
/* loaded from: classes.dex */
public final class C11D extends C1Dq {
    public int A00;
    public Object A01;
    public /* synthetic */ Object A02;
    public final /* synthetic */ C16350rg A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11D(InterfaceC23621Ds interfaceC23621Ds, C16350rg c16350rg) {
        super(interfaceC23621Ds);
        this.A03 = c16350rg;
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        this.A02 = obj;
        this.A00 |= Integer.MIN_VALUE;
        return this.A03.emit(null, this);
    }
}
