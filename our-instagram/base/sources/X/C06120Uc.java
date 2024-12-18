package X;

import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "kotlinx.coroutines.flow.StartedWhileSubscribed$command$2", f = "SharingStarted.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: X.0Uc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C06120Uc extends AbstractC23611Dp implements InterfaceC16620sF {
    public /* synthetic */ Object A00;

    public C06120Uc(InterfaceC23621Ds interfaceC23621Ds) {
        super(2, interfaceC23621Ds);
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        C06120Uc c06120Uc = new C06120Uc(interfaceC23621Ds);
        c06120Uc.A00 = obj;
        return c06120Uc;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((C06120Uc) create(obj, (InterfaceC23621Ds) obj2)).invokeSuspend(C0eB.A00);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        AbstractC09560e7.A00(obj);
        boolean z = false;
        if (this.A00 != C10L.A02) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
