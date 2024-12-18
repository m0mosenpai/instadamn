package X;

import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$5$1", f = "Zip.kt", i = {}, l = {329}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: X.0V5, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0V5 extends AbstractC23611Dp implements InterfaceC16610sE {
    public int A00;
    public /* synthetic */ Object A01;
    public /* synthetic */ Object A02;
    public final /* synthetic */ C0s9 A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0V5(InterfaceC23621Ds interfaceC23621Ds, C0s9 c0s9) {
        super(3, interfaceC23621Ds);
        this.A03 = c0s9;
    }

    @Override // X.InterfaceC16610sE
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        C0V5 c0v5 = new C0V5((InterfaceC23621Ds) obj3, this.A03);
        c0v5.A01 = obj;
        c0v5.A02 = obj2;
        return c0v5.invokeSuspend(C0eB.A00);
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
            C0s9 c0s9 = this.A03;
            Object obj3 = objArr[0];
            Object obj4 = objArr[1];
            Object obj5 = objArr[2];
            Object obj6 = objArr[3];
            Object obj7 = objArr[4];
            this.A00 = 1;
            if (c0s9.invoke(obj2, obj3, obj4, obj5, obj6, obj7, this) == c1jx) {
                return c1jx;
            }
        }
        return C0eB.A00;
    }
}
