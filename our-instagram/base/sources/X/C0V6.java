package X;

import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$1", f = "Zip.kt", i = {}, l = {269}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: X.0V6, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0V6 extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public /* synthetic */ Object A01;
    public final /* synthetic */ InterfaceC16600sD A02;
    public final /* synthetic */ InterfaceC19390xP[] A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0V6(InterfaceC23621Ds interfaceC23621Ds, InterfaceC16600sD interfaceC16600sD, InterfaceC19390xP[] interfaceC19390xPArr) {
        super(2, interfaceC23621Ds);
        this.A03 = interfaceC19390xPArr;
        this.A02 = interfaceC16600sD;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        C0V6 c0v6 = new C0V6(interfaceC23621Ds, this.A02, this.A03);
        c0v6.A01 = obj;
        return c0v6;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((C0V6) create(obj, (InterfaceC23621Ds) obj2)).invokeSuspend(C0eB.A00);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        C1JX c1jx = C1JX.A02;
        if (this.A00 != 0) {
            AbstractC09560e7.A00(obj);
        } else {
            AbstractC09560e7.A00(obj);
            InterfaceC19960yQ interfaceC19960yQ = (InterfaceC19960yQ) this.A01;
            InterfaceC19390xP[] interfaceC19390xPArr = this.A03;
            C05B c05b = C05B.A00;
            C0VI c0vi = new C0VI(null, this.A02);
            this.A00 = 1;
            if (AnonymousClass104.A00(this, c05b, c0vi, interfaceC19960yQ, interfaceC19390xPArr) == c1jx) {
                return c1jx;
            }
        }
        return C0eB.A00;
    }
}
