package X;

import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1$2", f = "Transform.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
/* renamed from: X.10d, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C208110d extends C1Dq {
    public int A00;
    public /* synthetic */ Object A01;
    public final /* synthetic */ C15450q0 A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C208110d(InterfaceC23621Ds interfaceC23621Ds, C15450q0 c15450q0) {
        super(interfaceC23621Ds);
        this.A02 = c15450q0;
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        this.A01 = obj;
        this.A00 |= Integer.MIN_VALUE;
        return this.A02.emit(null, this);
    }
}
