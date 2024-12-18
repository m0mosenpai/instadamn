package X;

import com.instagram.business.scheduling.model.NonSupportedContentSchedulingFeatures;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class P0I implements InterfaceC58190Pqw {
    public final OXR A00;
    public final UserSession A01;
    public final InterfaceC11380iw A02;

    @Override // X.InterfaceC58190Pqw
    public final void CiW() {
        UserSession userSession = this.A01;
        LL0.A02(this.A02, userSession, C05F.A0F, C05F.A1F, LB9.A00(userSession));
    }

    @Override // X.InterfaceC58190Pqw
    public final void CkR() {
        AnonymousClass229.A01(this.A01).A1Z(C81X.A03);
    }

    @Override // X.InterfaceC58190Pqw
    public final void CkS() {
        AnonymousClass229.A01(this.A01).A1C(EnumC53380NjV.A03, C81X.A03);
    }

    @Override // X.InterfaceC58190Pqw
    public final void CkT() {
        UserSession userSession = this.A01;
        O7Z A00 = AbstractC53937NtA.A00(userSession);
        A00.A01.flowMarkPoint(A00.A00, "ADD_LOCATION_TOKEN_TAPPED");
        AnonymousClass229.A01(userSession).A1Y(C81X.A03);
    }

    @Override // X.InterfaceC58190Pqw
    public final void ClQ() {
        OXR oxr = this.A00;
        Integer num = C05F.A01;
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(oxr.A01, "content_scheduling_cancel");
        if (A0f.isSampled()) {
            OXR.A00(A0f, oxr.A00, num);
            A0f.Cht();
        }
    }

    @Override // X.InterfaceC58190Pqw
    public final void ClR() {
        AnonymousClass229.A01(this.A01).A1C(EnumC53380NjV.A0A, C81X.A0i);
        OXR oxr = this.A00;
        Integer num = C05F.A01;
        oxr.A08(num, num);
    }

    @Override // X.InterfaceC58190Pqw
    public final void ClS(NonSupportedContentSchedulingFeatures nonSupportedContentSchedulingFeatures) {
        if (nonSupportedContentSchedulingFeatures != null) {
            C151866sW.A05(this.A00, nonSupportedContentSchedulingFeatures);
        }
        OXR oxr = this.A00;
        EnumC50628MWp enumC50628MWp = EnumC50628MWp.A0E;
        oxr.A03(enumC50628MWp);
        oxr.A01(enumC50628MWp);
    }

    @Override // X.InterfaceC58190Pqw
    public final void ClT() {
        this.A00.A02(EnumC50628MWp.A0E);
    }

    @Override // X.InterfaceC58190Pqw
    public final void ClU() {
        OXR oxr = this.A00;
        Integer num = C05F.A01;
        oxr.A06(num);
        oxr.A07(num);
    }

    public P0I(OXR oxr, InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        AbstractC167027dH.A13(userSession, interfaceC11380iw, oxr);
        this.A01 = userSession;
        this.A02 = interfaceC11380iw;
        this.A00 = oxr;
    }
}
