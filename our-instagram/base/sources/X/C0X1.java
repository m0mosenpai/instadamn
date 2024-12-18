package X;

import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__MergeKt$mapLatest$1", f = "Merge.kt", i = {}, l = {213, 213}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: X.0X1, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0X1 extends AbstractC23611Dp implements InterfaceC16610sE {
    public int A00;
    public /* synthetic */ Object A01;
    public /* synthetic */ Object A02;
    public final /* synthetic */ InterfaceC16620sF A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0X1(InterfaceC23621Ds interfaceC23621Ds, InterfaceC16620sF interfaceC16620sF) {
        super(3, interfaceC23621Ds);
        this.A03 = interfaceC16620sF;
    }

    @Override // X.InterfaceC16610sE
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        C0X1 c0x1 = new C0X1((InterfaceC23621Ds) obj3, this.A03);
        c0x1.A01 = obj;
        c0x1.A02 = obj2;
        return c0x1.invokeSuspend(C0eB.A00);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        InterfaceC19960yQ interfaceC19960yQ;
        C1JX c1jx = C1JX.A02;
        int i = this.A00;
        if (i != 0) {
            if (i != 1) {
                AbstractC09560e7.A00(obj);
                return C0eB.A00;
            }
            interfaceC19960yQ = (InterfaceC19960yQ) this.A01;
            AbstractC09560e7.A00(obj);
        } else {
            AbstractC09560e7.A00(obj);
            interfaceC19960yQ = (InterfaceC19960yQ) this.A01;
            Object obj2 = this.A02;
            InterfaceC16620sF interfaceC16620sF = this.A03;
            this.A01 = interfaceC19960yQ;
            this.A00 = 1;
            obj = interfaceC16620sF.invoke(obj2, this);
            if (obj == c1jx) {
                return c1jx;
            }
        }
        this.A01 = null;
        this.A00 = 2;
        if (interfaceC19960yQ.emit(obj, this) == c1jx) {
            return c1jx;
        }
        return C0eB.A00;
    }
}
