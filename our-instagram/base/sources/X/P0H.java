package X;

import com.instagram.business.scheduling.model.NonSupportedContentSchedulingFeatures;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class P0H implements InterfaceC58190Pqw {
    public final OXR A00;
    public final UserSession A01;

    public P0H(OXR oxr, UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A01 = userSession;
        this.A00 = oxr;
    }

    @Override // X.InterfaceC58190Pqw
    public final void CiW() {
    }

    @Override // X.InterfaceC58190Pqw
    public final void CkS() {
    }

    @Override // X.InterfaceC58190Pqw
    public final void CkR() {
        UserSession userSession = this.A01;
        MX1.A00(userSession).A04("LOCATION_REMOVED");
        AnonymousClass229.A01(userSession).A1Z(C81X.A03);
    }

    @Override // X.InterfaceC58190Pqw
    public final void ClQ() {
        OXR oxr = this.A00;
        Integer num = C05F.A00;
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(oxr.A01, "content_scheduling_cancel");
        if (A0f.isSampled()) {
            OXR.A00(A0f, oxr.A00, num);
            A0f.Cht();
        }
    }

    @Override // X.InterfaceC58190Pqw
    public final void ClR() {
        AnonymousClass229.A01(this.A01).A1Y(C81X.A0i);
        this.A00.A08(C05F.A00, C05F.A01);
    }

    @Override // X.InterfaceC58190Pqw
    public final void ClS(NonSupportedContentSchedulingFeatures nonSupportedContentSchedulingFeatures) {
        OXR oxr = this.A00;
        EnumC50628MWp enumC50628MWp = EnumC50628MWp.A0B;
        oxr.A03(enumC50628MWp);
        oxr.A01(enumC50628MWp);
    }

    @Override // X.InterfaceC58190Pqw
    public final void ClT() {
        this.A00.A02(EnumC50628MWp.A0B);
    }

    @Override // X.InterfaceC58190Pqw
    public final void ClU() {
        OXR oxr = this.A00;
        Integer num = C05F.A00;
        oxr.A06(num);
        oxr.A07(num);
    }

    @Override // X.InterfaceC58190Pqw
    public final void CkT() {
        C6WI.A01().A0O = true;
        UserSession userSession = this.A01;
        MX1.A00(userSession).A04("LOCATION_TOKEN_TAPPED");
        MX1.A00(userSession).A04("LOCATION_SAVED");
    }
}
