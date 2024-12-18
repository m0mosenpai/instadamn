package X;

import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$1$1", f = "Zip.kt", i = {}, l = {329}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: X.0VI, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0VI extends AbstractC23611Dp implements InterfaceC16610sE {
    public int A00;
    public /* synthetic */ Object A01;
    public /* synthetic */ Object A02;
    public final /* synthetic */ InterfaceC16600sD A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0VI(InterfaceC23621Ds interfaceC23621Ds, InterfaceC16600sD interfaceC16600sD) {
        super(3, interfaceC23621Ds);
        this.A03 = interfaceC16600sD;
    }

    @Override // X.InterfaceC16610sE
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        C0VI c0vi = new C0VI((InterfaceC23621Ds) obj3, this.A03);
        c0vi.A01 = obj;
        c0vi.A02 = obj2;
        return c0vi.invokeSuspend(C0eB.A00);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        C1JX c1jx = C1JX.A02;
        if (this.A00 != 0) {
            AbstractC09560e7.A00(obj);
        } else {
            AbstractC09560e7.A00(obj);
            Object obj2 = this.A01;
            Object[] objArr = (Object[]) this.A02;
            InterfaceC16600sD interfaceC16600sD = this.A03;
            Object obj3 = objArr[0];
            Object obj4 = objArr[1];
            this.A00 = 1;
            if (interfaceC16600sD.invoke(obj2, obj3, obj4, this) == c1jx) {
                return c1jx;
            }
        }
        return C0eB.A00;
    }
}
