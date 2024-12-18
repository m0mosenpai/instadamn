package X;

import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "kotlinx.coroutines.flow.internal.ChannelFlow$collectToFun$1", f = "ChannelFlow.kt", i = {}, l = {56}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: X.0UH, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0UH extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public /* synthetic */ Object A01;
    public final /* synthetic */ C0UG A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0UH(InterfaceC23621Ds interfaceC23621Ds, C0UG c0ug) {
        super(2, interfaceC23621Ds);
        this.A02 = c0ug;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        C0UH c0uh = new C0UH(interfaceC23621Ds, this.A02);
        c0uh.A01 = obj;
        return c0uh;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((C0UH) create(obj, (InterfaceC23621Ds) obj2)).invokeSuspend(C0eB.A00);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        C1JX c1jx = C1JX.A02;
        if (this.A00 != 0) {
            AbstractC09560e7.A00(obj);
        } else {
            AbstractC09560e7.A00(obj);
            InterfaceC71543Iw interfaceC71543Iw = (InterfaceC71543Iw) this.A01;
            C0UG c0ug = this.A02;
            this.A00 = 1;
            if (c0ug.A00(interfaceC71543Iw, this) == c1jx) {
                return c1jx;
            }
        }
        return C0eB.A00;
    }
}
