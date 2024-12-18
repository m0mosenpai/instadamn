package X;

import com.instagram.common.api.result.ResultFlowKt$mapError$$inlined$map$1$2;

/* renamed from: X.7n0, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C172887n0 implements InterfaceC19390xP {
    public final /* synthetic */ InterfaceC16620sF A00;
    public final /* synthetic */ InterfaceC19390xP A01;

    public C172887n0(InterfaceC16620sF interfaceC16620sF, InterfaceC19390xP interfaceC19390xP) {
        this.A01 = interfaceC19390xP;
        this.A00 = interfaceC16620sF;
    }

    @Override // X.InterfaceC19390xP
    public final Object collect(InterfaceC19960yQ interfaceC19960yQ, InterfaceC23621Ds interfaceC23621Ds) {
        Object collect = this.A01.collect(new ResultFlowKt$mapError$$inlined$map$1$2(this.A00, interfaceC19960yQ), interfaceC23621Ds);
        if (collect != C1JX.A02) {
            return C0eB.A00;
        }
        return collect;
    }
}
