package X;

import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "kotlinx.coroutines.flow.internal.FlowCoroutineKt$scopedFlow$1$1", f = "FlowCoroutine.kt", i = {}, l = {47}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: X.0Tx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C06070Tx extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public /* synthetic */ Object A01;
    public final /* synthetic */ InterfaceC16610sE A02;
    public final /* synthetic */ InterfaceC19960yQ A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C06070Tx(InterfaceC23621Ds interfaceC23621Ds, InterfaceC16610sE interfaceC16610sE, InterfaceC19960yQ interfaceC19960yQ) {
        super(2, interfaceC23621Ds);
        this.A02 = interfaceC16610sE;
        this.A03 = interfaceC19960yQ;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        C06070Tx c06070Tx = new C06070Tx(interfaceC23621Ds, this.A02, this.A03);
        c06070Tx.A01 = obj;
        return c06070Tx;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((C06070Tx) create(obj, (InterfaceC23621Ds) obj2)).invokeSuspend(C0eB.A00);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        C1JX c1jx = C1JX.A02;
        if (this.A00 != 0) {
            AbstractC09560e7.A00(obj);
        } else {
            AbstractC09560e7.A00(obj);
            Object obj2 = this.A01;
            InterfaceC16610sE interfaceC16610sE = this.A02;
            InterfaceC19960yQ interfaceC19960yQ = this.A03;
            this.A00 = 1;
            if (interfaceC16610sE.invoke(obj2, interfaceC19960yQ, this) == c1jx) {
                return c1jx;
            }
        }
        return C0eB.A00;
    }
}
