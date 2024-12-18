package X;

import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$1", f = "Delay.kt", i = {}, l = {226}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: X.0Xi, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C06700Xi extends AbstractC23611Dp implements InterfaceC16660sJ {
    public int A00;
    public final /* synthetic */ C15370ps A01;
    public final /* synthetic */ InterfaceC19960yQ A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C06700Xi(InterfaceC23621Ds interfaceC23621Ds, C15370ps c15370ps, InterfaceC19960yQ interfaceC19960yQ) {
        super(1, interfaceC23621Ds);
        this.A02 = interfaceC19960yQ;
        this.A01 = c15370ps;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(InterfaceC23621Ds interfaceC23621Ds) {
        return new C06700Xi(interfaceC23621Ds, this.A01, this.A02);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return ((C06700Xi) create((InterfaceC23621Ds) obj)).invokeSuspend(C0eB.A00);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        C1JX c1jx = C1JX.A02;
        if (this.A00 != 0) {
            AbstractC09560e7.A00(obj);
        } else {
            AbstractC09560e7.A00(obj);
            InterfaceC19960yQ interfaceC19960yQ = this.A02;
            C20730zt c20730zt = AbstractC20780zy.A01;
            Object obj2 = this.A01.A00;
            if (obj2 == c20730zt) {
                obj2 = null;
            }
            this.A00 = 1;
            if (interfaceC19960yQ.emit(obj2, this) == c1jx) {
                return c1jx;
            }
        }
        this.A01.A00 = null;
        return C0eB.A00;
    }
}
