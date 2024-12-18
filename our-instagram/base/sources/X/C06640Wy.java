package X;

import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$1", f = "Share.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: X.0Wy, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C06640Wy extends AbstractC23611Dp implements InterfaceC16620sF {
    public /* synthetic */ int A00;

    public C06640Wy(InterfaceC23621Ds interfaceC23621Ds) {
        super(2, interfaceC23621Ds);
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        C06640Wy c06640Wy = new C06640Wy(interfaceC23621Ds);
        c06640Wy.A00 = ((Number) obj).intValue();
        return c06640Wy;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((C06640Wy) create(Integer.valueOf(((Number) obj).intValue()), (InterfaceC23621Ds) obj2)).invokeSuspend(C0eB.A00);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        AbstractC09560e7.A00(obj);
        boolean z = false;
        if (this.A00 > 0) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
