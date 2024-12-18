package X;

import com.instagram.common.session.UserSession;
import java.util.Collections;
import java.util.List;

/* renamed from: X.312, reason: invalid class name */
/* loaded from: classes2.dex */
public final class AnonymousClass312 implements AnonymousClass310 {
    public long A00 = -1;
    public InterfaceC670130s A01;
    public final UserSession A02;

    @Override // X.AnonymousClass310
    public final void COU(C38321qM c38321qM, Integer num, int i) {
        String A0F;
        C5FS A00;
        C14360o3.A0B(c38321qM, 0);
        if (this.A01 != null && (A0F = AbstractC41071vF.A0F(this.A02, c38321qM)) != null && (A00 = AbstractC129385t0.A00(c38321qM)) != null) {
            int i2 = i + 1;
            C42709Iv4 c42709Iv4 = new C42709Iv4(A00, c38321qM, A0F, i2, this.A00);
            C3XG c3xg = new C3XG(c42709Iv4, C1XV.A08, c42709Iv4.getId());
            EnumC73363Qm enumC73363Qm = EnumC73363Qm.A05;
            C671831j c671831j = new C671831j(null, null, null, 0, 0, 0, 0, 0, 16383, false, false, false, false);
            c671831j.A0B(i2);
            String A002 = C1EP.A00();
            C1EP.A00();
            C82373m0 c82373m0 = new C82373m0(new C9CB(C1EN.A0N, A002), c3xg, enumC73363Qm, c671831j);
            InterfaceC670130s interfaceC670130s = this.A01;
            if (interfaceC670130s != null) {
                List singletonList = Collections.singletonList(c82373m0);
                C14360o3.A07(singletonList);
                interfaceC670130s.DnX(C05F.A00, singletonList);
            }
        }
    }

    @Override // X.AnonymousClass310
    public final void EGE() {
        this.A01 = null;
    }

    @Override // X.AnonymousClass310
    public final boolean Eio(C38321qM c38321qM) {
        C14360o3.A0B(c38321qM, 0);
        if (!c38321qM.CdW() || AbstractC129385t0.A00(c38321qM) == null) {
            return false;
        }
        boolean A06 = C18U.A06(C06090Tz.A05, this.A02, 36328637275913924L);
        C14360o3.A0A(Boolean.valueOf(A06));
        return A06;
    }

    public AnonymousClass312(UserSession userSession) {
        this.A02 = userSession;
    }

    @Override // X.AnonymousClass310
    public final void Eco(InterfaceC670130s interfaceC670130s) {
        this.A01 = interfaceC670130s;
    }
}
