package X;

/* renamed from: X.WkJ, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70915WkJ implements InterfaceC86223st {
    public final /* synthetic */ ViewOnTouchListenerC67974V4p A00;

    @Override // X.InterfaceC86223st
    public final void Dmb(C38321qM c38321qM, C37905Gm2 c37905Gm2, C81303k0 c81303k0, C75113Zb c75113Zb, int i) {
    }

    public C70915WkJ(ViewOnTouchListenerC67974V4p viewOnTouchListenerC67974V4p) {
        this.A00 = viewOnTouchListenerC67974V4p;
    }

    @Override // X.AnonymousClass370
    public final JG7 BQm() {
        return new C70914WkI(this);
    }

    @Override // X.InterfaceC86223st
    public final void DBR(C38321qM c38321qM, C37905Gm2 c37905Gm2, C81303k0 c81303k0, C75113Zb c75113Zb, int i) {
        ViewOnTouchListenerC67974V4p viewOnTouchListenerC67974V4p = this.A00;
        Boolean bool = viewOnTouchListenerC67974V4p.A09;
        if (bool == null) {
            bool = AbstractC166997dE.A0a();
            viewOnTouchListenerC67974V4p.A09 = bool;
        }
        if (bool.booleanValue()) {
            boolean A0N = C57532kS.A00(viewOnTouchListenerC67974V4p.A0G).A0N(viewOnTouchListenerC67974V4p.A04);
            if (!A0N) {
                ViewOnTouchListenerC67974V4p.A04(viewOnTouchListenerC67974V4p, EnumC77173d3.A02, c37905Gm2);
                ViewOnTouchListenerC67974V4p.A03(viewOnTouchListenerC67974V4p);
            }
            c75113Zb.A0J(null, A0N, true, true, false);
        }
    }
}
