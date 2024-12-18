package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.77f, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1579577f extends AbstractC161727Mh implements InterfaceC162347Ow {
    public final UserSession A00;
    public final C1579777h A01;
    public final AnonymousClass988 A02;
    public final C7IM A03;
    public final C18A A04;

    @Override // X.InterfaceC162347Ow
    public final void AI4() {
        ((C1579477e) ((C7SP) ((AbstractC161677Mc) this).A00).A0M).AI4();
    }

    @Override // X.InterfaceC162347Ow
    public final C74843Xy BLT() {
        return ((C1579477e) ((C7SP) ((AbstractC161677Mc) this).A00).A0M).BLT();
    }

    @Override // X.InterfaceC162347Ow
    public final C74843Xy C0D() {
        return ((C1579477e) ((C7SP) ((AbstractC161677Mc) this).A00).A0M).C0D();
    }

    @Override // X.InterfaceC162347Ow
    public final void Ctd(float f) {
        ((C1579477e) ((C7SP) ((AbstractC161677Mc) this).A00).A0M).Ctd(f);
    }

    @Override // X.InterfaceC162347Ow
    public final void EJl() {
        ((C1579477e) ((C7SP) ((AbstractC161677Mc) this).A00).A0M).EJl();
    }

    @Override // X.InterfaceC162347Ow
    public final void Ec3(C74843Xy c74843Xy) {
        ((C1579477e) ((C7SP) ((AbstractC161677Mc) this).A00).A0M).Ec3(c74843Xy);
    }

    @Override // X.InterfaceC162347Ow
    public final void FCi(C74843Xy c74843Xy, float f) {
        ((C1579477e) ((C7SP) ((AbstractC161677Mc) this).A00).A0M).FCi(c74843Xy, f);
    }

    public C1579577f(UserSession userSession, C7SP c7sp, C7ZX c7zx, AnonymousClass988 anonymousClass988, C77Y c77y, final C7IM c7im) {
        super(c7sp, c77y, c7zx);
        this.A00 = userSession;
        this.A04 = AnonymousClass189.A00(userSession);
        this.A03 = c7im;
        this.A01 = new C1579777h(AbstractC09440dt.A01(new InterfaceC16820sZ() { // from class: X.77g
            @Override // X.InterfaceC16820sZ
            public final Object invoke() {
                C7IM c7im2 = C7IM.this;
                int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
                return c7im2.A03.A04();
            }
        }));
        this.A02 = anonymousClass988;
    }
}
