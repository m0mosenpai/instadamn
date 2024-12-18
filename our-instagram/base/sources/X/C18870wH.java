package X;

import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "kotlinx.coroutines.flow.AbstractFlow", f = "Flow.kt", i = {0}, l = {226}, m = "collect", n = {"safeCollector"}, s = {"L$0"})
/* renamed from: X.0wH, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18870wH extends C1Dq {
    public int A00;
    public Object A01;
    public /* synthetic */ Object A02;
    public final /* synthetic */ AnonymousClass058 A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18870wH(InterfaceC23621Ds interfaceC23621Ds, AnonymousClass058 anonymousClass058) {
        super(interfaceC23621Ds);
        this.A03 = anonymousClass058;
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        this.A02 = obj;
        this.A00 |= Integer.MIN_VALUE;
        return this.A03.collect(null, this);
    }
}
