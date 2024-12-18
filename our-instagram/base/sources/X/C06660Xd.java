package X;

import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$values$1", f = "Delay.kt", i = {}, l = {204}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: X.0Xd, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C06660Xd extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public /* synthetic */ Object A01;
    public final /* synthetic */ InterfaceC19390xP A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C06660Xd(InterfaceC23621Ds interfaceC23621Ds, InterfaceC19390xP interfaceC19390xP) {
        super(2, interfaceC23621Ds);
        this.A02 = interfaceC19390xP;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        C06660Xd c06660Xd = new C06660Xd(interfaceC23621Ds, this.A02);
        c06660Xd.A01 = obj;
        return c06660Xd;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((C06660Xd) create(obj, (InterfaceC23621Ds) obj2)).invokeSuspend(C0eB.A00);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        C1JX c1jx = C1JX.A02;
        if (this.A00 != 0) {
            AbstractC09560e7.A00(obj);
        } else {
            AbstractC09560e7.A00(obj);
            InterfaceC71543Iw interfaceC71543Iw = (InterfaceC71543Iw) this.A01;
            InterfaceC19390xP interfaceC19390xP = this.A02;
            C16420rn c16420rn = new C16420rn(interfaceC71543Iw);
            this.A00 = 1;
            if (interfaceC19390xP.collect(c16420rn, this) == c1jx) {
                return c1jx;
            }
        }
        return C0eB.A00;
    }
}
