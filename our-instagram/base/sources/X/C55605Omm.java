package X;

import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.FilterChain;

/* renamed from: X.Omm, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55605Omm implements BBP {
    public final /* synthetic */ FilterChain A00;
    public final /* synthetic */ C55723Oop A01;
    public final /* synthetic */ C15370ps A02;

    public C55605Omm(FilterChain filterChain, C55723Oop c55723Oop, C15370ps c15370ps) {
        this.A02 = c15370ps;
        this.A01 = c55723Oop;
        this.A00 = filterChain;
    }

    @Override // X.BBP
    public final void DLU(InterfaceC197718oi interfaceC197718oi) {
        C14360o3.A0B(interfaceC197718oi, 0);
        C15370ps c15370ps = this.A02;
        C197728oj B9M = interfaceC197718oi.B9M();
        c15370ps.A00 = B9M;
        this.A01.A01.A00(this.A00, B9M);
    }
}
