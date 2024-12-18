package X;

import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "kotlinx.coroutines.flow.SubscribedFlowCollector", f = "Share.kt", i = {0, 0}, l = {415, 419}, m = "onSubscription", n = {"this", "safeCollector"}, s = {"L$0", "L$1"})
/* renamed from: X.10D, reason: invalid class name */
/* loaded from: classes.dex */
public final class C10D extends C1Dq {
    public int A00;
    public Object A01;
    public Object A02;
    public /* synthetic */ Object A03;
    public final /* synthetic */ C14990pE A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10D(InterfaceC23621Ds interfaceC23621Ds, C14990pE c14990pE) {
        super(interfaceC23621Ds);
        this.A04 = c14990pE;
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        this.A03 = obj;
        this.A00 |= Integer.MIN_VALUE;
        return this.A04.A00(this);
    }
}
