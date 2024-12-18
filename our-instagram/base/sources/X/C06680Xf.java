package X;

import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$2", f = "Delay.kt", i = {0}, l = {236}, m = "invokeSuspend", n = {"$this$onFailure_u2dWpGqRn0$iv"}, s = {"L$0"})
/* renamed from: X.0Xf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C06680Xf extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public Object A01;
    public /* synthetic */ Object A02;
    public final /* synthetic */ C15370ps A03;
    public final /* synthetic */ InterfaceC19960yQ A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C06680Xf(InterfaceC23621Ds interfaceC23621Ds, C15370ps c15370ps, InterfaceC19960yQ interfaceC19960yQ) {
        super(2, interfaceC23621Ds);
        this.A03 = c15370ps;
        this.A04 = interfaceC19960yQ;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        C06680Xf c06680Xf = new C06680Xf(interfaceC23621Ds, this.A03, this.A04);
        c06680Xf.A02 = obj;
        return c06680Xf;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((C06680Xf) create(new C2QV(((C2QV) obj).A00), (InterfaceC23621Ds) obj2)).invokeSuspend(C0eB.A00);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        C15370ps c15370ps;
        C1JX c1jx = C1JX.A02;
        if (this.A00 != 0) {
            c15370ps = (C15370ps) this.A01;
            AbstractC09560e7.A00(obj);
        } else {
            AbstractC09560e7.A00(obj);
            Object obj2 = ((C2QV) this.A02).A00;
            c15370ps = this.A03;
            boolean z = obj2 instanceof C2QW;
            if (!z) {
                c15370ps.A00 = obj2;
            }
            InterfaceC19960yQ interfaceC19960yQ = this.A04;
            if (z) {
                Throwable A01 = C2QV.A01(obj2);
                if (A01 == null) {
                    Object obj3 = c15370ps.A00;
                    if (obj3 != null) {
                        if (obj3 == AbstractC20780zy.A01) {
                            obj3 = null;
                        }
                        this.A02 = obj2;
                        this.A01 = c15370ps;
                        this.A00 = 1;
                        if (interfaceC19960yQ.emit(obj3, this) == c1jx) {
                            return c1jx;
                        }
                    }
                } else {
                    throw A01;
                }
            }
            return C0eB.A00;
        }
        c15370ps.A00 = AbstractC20780zy.A00;
        return C0eB.A00;
    }
}
