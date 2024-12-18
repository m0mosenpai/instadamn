package com.instagram.direct.fragment.thread.infra.open;

import X.AbstractC09560e7;
import X.AbstractC23611Dp;
import X.C05A;
import X.C0eB;
import X.C160847Is;
import X.C163807Uu;
import X.C2EC;
import X.C7IH;
import X.InterfaceC16620sF;
import X.InterfaceC23621Ds;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.direct.fragment.thread.infra.open.DirectThreadHeaderRepository$updateViewModel$1", f = "DirectThreadHeaderRepository.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
public final class DirectThreadHeaderRepository$updateViewModel$1 extends AbstractC23611Dp implements InterfaceC16620sF {
    public final /* synthetic */ C163807Uu A00;
    public final /* synthetic */ C7IH A01;
    public final /* synthetic */ C2EC A02;
    public final /* synthetic */ boolean A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DirectThreadHeaderRepository$updateViewModel$1(C163807Uu c163807Uu, C7IH c7ih, C2EC c2ec, InterfaceC23621Ds interfaceC23621Ds, boolean z) {
        super(2, interfaceC23621Ds);
        this.A00 = c163807Uu;
        this.A03 = z;
        this.A02 = c2ec;
        this.A01 = c7ih;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        C163807Uu c163807Uu = this.A00;
        boolean z = this.A03;
        return new DirectThreadHeaderRepository$updateViewModel$1(c163807Uu, this.A01, this.A02, interfaceC23621Ds, z);
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((DirectThreadHeaderRepository$updateViewModel$1) create(obj, (InterfaceC23621Ds) obj2)).invokeSuspend(C0eB.A00);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        C160847Is A00;
        AbstractC09560e7.A00(obj);
        C163807Uu c163807Uu = this.A00;
        C05A c05a = c163807Uu.A0C;
        if (this.A03) {
            A00 = c163807Uu.A00;
        } else {
            A00 = C163807Uu.A00(c163807Uu, this.A01, this.A02);
        }
        c05a.Egh(A00);
        return C0eB.A00;
    }
}
