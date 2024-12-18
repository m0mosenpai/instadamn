package X;

import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$2", f = "Merge.kt", i = {}, l = {30}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: X.0UB, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0UB extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public final /* synthetic */ Object A01;
    public final /* synthetic */ InterfaceC19960yQ A02;
    public final /* synthetic */ C007802s A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0UB(Object obj, InterfaceC23621Ds interfaceC23621Ds, InterfaceC19960yQ interfaceC19960yQ, C007802s c007802s) {
        super(2, interfaceC23621Ds);
        this.A03 = c007802s;
        this.A02 = interfaceC19960yQ;
        this.A01 = obj;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        C007802s c007802s = this.A03;
        return new C0UB(this.A01, interfaceC23621Ds, this.A02, c007802s);
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((C0UB) create(obj, (InterfaceC23621Ds) obj2)).invokeSuspend(C0eB.A00);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        C1JX c1jx = C1JX.A02;
        if (this.A00 != 0) {
            AbstractC09560e7.A00(obj);
        } else {
            AbstractC09560e7.A00(obj);
            InterfaceC16610sE interfaceC16610sE = this.A03.A00;
            InterfaceC19960yQ interfaceC19960yQ = this.A02;
            Object obj2 = this.A01;
            this.A00 = 1;
            if (interfaceC16610sE.invoke(interfaceC19960yQ, obj2, this) == c1jx) {
                return c1jx;
            }
        }
        return C0eB.A00;
    }
}
