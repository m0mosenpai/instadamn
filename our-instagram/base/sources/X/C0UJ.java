package X;

import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "kotlinx.coroutines.flow.internal.ChannelFlow$collect$2", f = "ChannelFlow.kt", i = {}, l = {119}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: X.0UJ, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0UJ extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public /* synthetic */ Object A01;
    public final /* synthetic */ InterfaceC19960yQ A02;
    public final /* synthetic */ C0UG A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0UJ(InterfaceC23621Ds interfaceC23621Ds, InterfaceC19960yQ interfaceC19960yQ, C0UG c0ug) {
        super(2, interfaceC23621Ds);
        this.A02 = interfaceC19960yQ;
        this.A03 = c0ug;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        C0UJ c0uj = new C0UJ(interfaceC23621Ds, this.A02, this.A03);
        c0uj.A01 = obj;
        return c0uj;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((C0UJ) create(obj, (InterfaceC23621Ds) obj2)).invokeSuspend(C0eB.A00);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        C1JX c1jx = C1JX.A02;
        if (this.A00 != 0) {
            AbstractC09560e7.A00(obj);
        } else {
            AbstractC09560e7.A00(obj);
            C19L c19l = (C19L) this.A01;
            InterfaceC19960yQ interfaceC19960yQ = this.A02;
            InterfaceC24751Is A02 = this.A03.A02(c19l);
            this.A00 = 1;
            if (AbstractC07080Za.A00(this, A02, interfaceC19960yQ) == c1jx) {
                return c1jx;
            }
        }
        return C0eB.A00;
    }
}
