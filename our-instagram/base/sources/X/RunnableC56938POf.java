package X;

/* renamed from: X.POf, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class RunnableC56938POf implements Runnable {
    public final /* synthetic */ C147716kw A00;

    public RunnableC56938POf(C147716kw c147716kw) {
        this.A00 = c147716kw;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C55012OVx c55012OVx;
        C41181vS c41181vS;
        C147716kw c147716kw = this.A00;
        if (C147716kw.A04(c147716kw) && !c147716kw.A0D && (c55012OVx = c147716kw.A04) != null && c55012OVx.A04) {
            C147696ku c147696ku = c147716kw.A0R;
            C138376Ot c138376Ot = c147716kw.A01;
            if (c138376Ot != null) {
                c41181vS = c138376Ot.A02;
            } else {
                c41181vS = null;
            }
            InterfaceC147516kc interfaceC147516kc = c147696ku.A03;
            if (interfaceC147516kc != null) {
                InterfaceC1118853a interfaceC1118853a = c147696ku.A02;
                if (interfaceC147516kc.CQo(c41181vS, c138376Ot)) {
                    TextureViewSurfaceTextureListenerC147506ka textureViewSurfaceTextureListenerC147506ka = (TextureViewSurfaceTextureListenerC147506ka) interfaceC147516kc;
                    InterfaceC95344Qu interfaceC95344Qu = textureViewSurfaceTextureListenerC147506ka.A0M;
                    if (interfaceC95344Qu != null) {
                        interfaceC95344Qu.reset();
                    }
                    C3Q0 c3q0 = C3Q0.IDLE;
                    C121595fA c121595fA = textureViewSurfaceTextureListenerC147506ka.A12;
                    if (c121595fA != null) {
                        c121595fA.A00 = c3q0;
                    }
                    C41181vS AuU = interfaceC1118853a.AuU();
                    if (AuU != null) {
                        interfaceC147516kc.E5l(AuU, true);
                    }
                }
            }
        }
    }
}
