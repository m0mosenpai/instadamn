package X;

import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "kotlinx.coroutines.flow.DistinctFlowImpl$collect$2", f = "Distinct.kt", i = {}, l = {73}, m = "emit", n = {}, s = {})
/* renamed from: X.0xO, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C19380xO extends C1Dq {
    public int A00;
    public /* synthetic */ Object A01;
    public final /* synthetic */ C16470rs A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19380xO(InterfaceC23621Ds interfaceC23621Ds, C16470rs c16470rs) {
        super(interfaceC23621Ds);
        this.A02 = c16470rs;
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        this.A01 = obj;
        this.A00 |= Integer.MIN_VALUE;
        return this.A02.emit(null, this);
    }
}
