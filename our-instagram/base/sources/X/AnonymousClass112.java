package X;

import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__MergeKt$flattenConcat$1$1", f = "Merge.kt", i = {}, l = {79}, m = "emit", n = {}, s = {})
/* renamed from: X.112, reason: invalid class name */
/* loaded from: classes.dex */
public final class AnonymousClass112 extends C1Dq {
    public int A00;
    public /* synthetic */ Object A01;
    public final /* synthetic */ C15760qW A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnonymousClass112(InterfaceC23621Ds interfaceC23621Ds, C15760qW c15760qW) {
        super(interfaceC23621Ds);
        this.A02 = c15760qW;
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        this.A01 = obj;
        this.A00 |= Integer.MIN_VALUE;
        return this.A02.emit(this, null);
    }
}
