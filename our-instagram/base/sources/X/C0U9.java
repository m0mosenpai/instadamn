package X;

import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "kotlinx.coroutines.flow.internal.ChannelLimitedFlowMerge$collectTo$2$1", f = "Merge.kt", i = {}, l = {92}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: X.0U9, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0U9 extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public final /* synthetic */ InterfaceC19390xP A01;
    public final /* synthetic */ C14830ox A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0U9(InterfaceC23621Ds interfaceC23621Ds, InterfaceC19390xP interfaceC19390xP, C14830ox c14830ox) {
        super(2, interfaceC23621Ds);
        this.A01 = interfaceC19390xP;
        this.A02 = c14830ox;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        return new C0U9(interfaceC23621Ds, this.A01, this.A02);
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((C0U9) create(obj, (InterfaceC23621Ds) obj2)).invokeSuspend(C0eB.A00);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        C1JX c1jx = C1JX.A02;
        if (this.A00 != 0) {
            AbstractC09560e7.A00(obj);
        } else {
            AbstractC09560e7.A00(obj);
            InterfaceC19390xP interfaceC19390xP = this.A01;
            C14830ox c14830ox = this.A02;
            this.A00 = 1;
            if (interfaceC19390xP.collect(c14830ox, this) == c1jx) {
                return c1jx;
            }
        }
        return C0eB.A00;
    }
}
