package X;

import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.5IG, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5IG extends AbstractC671431f {
    public final UserSession A00;
    public final InterfaceC62242sP A01;

    public C5IG(UserSession userSession, InterfaceC62242sP interfaceC62242sP, C1PY c1py) {
        super(interfaceC62242sP, c1py, false, false, false, false, false, false, false, false, false);
        this.A01 = interfaceC62242sP;
        this.A00 = userSession;
    }

    @Override // X.AbstractC671431f
    public final int A04(int i) {
        return 0;
    }

    @Override // X.AbstractC671431f
    public final /* bridge */ /* synthetic */ C671831j A0A(Object obj) {
        C206259Bi c206259Bi = (C206259Bi) obj;
        C14360o3.A0B(c206259Bi, 0);
        return (C671831j) c206259Bi.A04;
    }

    @Override // X.AbstractC671431f
    public final List A0B() {
        return C16930sl.A00;
    }

    @Override // X.AbstractC671431f
    public final /* bridge */ /* synthetic */ boolean A0H(Object obj) {
        C206259Bi c206259Bi = (C206259Bi) obj;
        C14360o3.A0B(c206259Bi, 0);
        C38321qM A00 = ((C130455uq) c206259Bi.A02).A00();
        if (A00 != null) {
            return AbstractC41071vF.A0R(this.A00, A00);
        }
        return false;
    }

    @Override // X.AbstractC671431f
    public final /* bridge */ /* synthetic */ boolean A0I(Object obj) {
        return false;
    }

    @Override // X.AbstractC671431f
    public final /* bridge */ /* synthetic */ boolean A0G(C671831j c671831j, Object obj) {
        return true;
    }

    @Override // X.AbstractC671431f
    public final /* bridge */ /* synthetic */ void A0E(Object obj, int i, int i2, int i3) {
    }
}
