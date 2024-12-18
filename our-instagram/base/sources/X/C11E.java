package X;

import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt", f = "Errors.kt", i = {0}, l = {152}, m = "catchImpl", n = {"fromDownstream"}, s = {"L$0"})
/* renamed from: X.11E, reason: invalid class name */
/* loaded from: classes.dex */
public final class C11E extends C1Dq {
    public int A00;
    public Object A01;
    public /* synthetic */ Object A02;

    public C11E(InterfaceC23621Ds interfaceC23621Ds) {
        super(interfaceC23621Ds);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        this.A02 = obj;
        this.A00 |= Integer.MIN_VALUE;
        return AbstractC20140yl.A00(this, null, null);
    }
}
