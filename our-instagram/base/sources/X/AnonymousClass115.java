package X;

import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$take$2$1", f = "Limit.kt", i = {}, l = {58, 60}, m = "emit", n = {}, s = {})
/* renamed from: X.115, reason: invalid class name */
/* loaded from: classes.dex */
public final class AnonymousClass115 extends C1Dq {
    public int A00;
    public /* synthetic */ Object A01;
    public final /* synthetic */ C16210rM A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnonymousClass115(InterfaceC23621Ds interfaceC23621Ds, C16210rM c16210rM) {
        super(interfaceC23621Ds);
        this.A02 = c16210rM;
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        this.A01 = obj;
        this.A00 |= Integer.MIN_VALUE;
        return this.A02.emit(null, this);
    }
}
