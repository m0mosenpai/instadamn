package X;

import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3", f = "Merge.kt", i = {}, l = {23}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: X.0UA, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0UA extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public /* synthetic */ Object A01;
    public final /* synthetic */ InterfaceC19960yQ A02;
    public final /* synthetic */ C007802s A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0UA(InterfaceC23621Ds interfaceC23621Ds, InterfaceC19960yQ interfaceC19960yQ, C007802s c007802s) {
        super(2, interfaceC23621Ds);
        this.A03 = c007802s;
        this.A02 = interfaceC19960yQ;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        C0UA c0ua = new C0UA(interfaceC23621Ds, this.A02, this.A03);
        c0ua.A01 = obj;
        return c0ua;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((C0UA) create(obj, (InterfaceC23621Ds) obj2)).invokeSuspend(C0eB.A00);
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [X.0ps, java.lang.Object] */
    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        C1JX c1jx = C1JX.A02;
        if (this.A00 != 0) {
            AbstractC09560e7.A00(obj);
        } else {
            AbstractC09560e7.A00(obj);
            C19L c19l = (C19L) this.A01;
            ?? obj2 = new Object();
            C007802s c007802s = this.A03;
            InterfaceC19390xP interfaceC19390xP = ((AnonymousClass055) c007802s).A00;
            C0p7 c0p7 = new C0p7(obj2, c19l, this.A02, c007802s);
            this.A00 = 1;
            if (interfaceC19390xP.collect(c0p7, this) == c1jx) {
                return c1jx;
            }
        }
        return C0eB.A00;
    }
}
