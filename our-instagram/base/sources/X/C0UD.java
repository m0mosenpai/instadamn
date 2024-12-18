package X;

import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "kotlinx.coroutines.flow.internal.ChannelFlowOperator$collectWithContextUndispatched$2", f = "ChannelFlow.kt", i = {}, l = {148}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: X.0UD, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0UD extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public /* synthetic */ Object A01;
    public final /* synthetic */ AnonymousClass055 A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0UD(InterfaceC23621Ds interfaceC23621Ds, AnonymousClass055 anonymousClass055) {
        super(2, interfaceC23621Ds);
        this.A02 = anonymousClass055;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        C0UD c0ud = new C0UD(interfaceC23621Ds, this.A02);
        c0ud.A01 = obj;
        return c0ud;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((C0UD) create(obj, (InterfaceC23621Ds) obj2)).invokeSuspend(C0eB.A00);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        C1JX c1jx = C1JX.A02;
        if (this.A00 != 0) {
            AbstractC09560e7.A00(obj);
        } else {
            AbstractC09560e7.A00(obj);
            InterfaceC19960yQ interfaceC19960yQ = (InterfaceC19960yQ) this.A01;
            AnonymousClass055 anonymousClass055 = this.A02;
            this.A00 = 1;
            if (anonymousClass055.A05(interfaceC19960yQ, this) == c1jx) {
                return c1jx;
            }
        }
        return C0eB.A00;
    }
}
