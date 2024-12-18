package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.venue.Venue;

/* renamed from: X.Ozo, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56327Ozo implements InterfaceC58116Ppf {
    public final /* synthetic */ O3E A00;

    public C56327Ozo(O3E o3e) {
        this.A00 = o3e;
    }

    @Override // X.InterfaceC58116Ppf
    public final void DQB() {
        AbstractC52180N7p abstractC52180N7p = this.A00.A00;
        if (abstractC52180N7p instanceof NMX) {
            NMX nmx = (NMX) abstractC52180N7p;
            C1VW c1vw = C1VW.A00;
            if (c1vw != null) {
                c1vw.removeLocationUpdates(AbstractC166987dD.A0r(nmx.A0W), nmx.A0U);
            }
            NNE.A00(nmx).A1H = null;
            NMX.A09(nmx);
            return;
        }
        NMW nmw = (NMW) abstractC52180N7p;
        C1VW c1vw2 = C1VW.A00;
        if (c1vw2 != null) {
            c1vw2.removeLocationUpdates(AbstractC166987dD.A0r(nmw.A0Y), nmw.A05);
        }
        nmw.A0E = null;
        NMW.A03(nmw);
    }

    @Override // X.InterfaceC58116Ppf
    public final void DQE() {
        AbstractC52180N7p abstractC52180N7p = this.A00.A00;
        if (abstractC52180N7p instanceof NMX) {
            NMX nmx = (NMX) abstractC52180N7p;
            MSW.A0b(nmx.A0Y).A04(nmx, new C52552NMy(nmx.A00));
        } else {
            NMW nmw = (NMW) abstractC52180N7p;
            UserSession A0r = AbstractC166987dD.A0r(nmw.A0Y);
            AbstractC69933Cc.A01();
            OXy.A02(nmw, N5Z.A00(nmw.A00, "POST", null, -1L, true, false), A0r, OU0.A04);
        }
    }

    @Override // X.InterfaceC58116Ppf
    public final void DQF(Venue venue) {
        C25671My c25671My;
        AbstractC52180N7p abstractC52180N7p = this.A00.A00;
        if (abstractC52180N7p instanceof NMX) {
            NMX nmx = (NMX) abstractC52180N7p;
            NNE.A00(nmx).A0U(venue);
            NMX.A09(nmx);
            c25671My = MSX.A0F(nmx);
        } else {
            NMW nmw = (NMW) abstractC52180N7p;
            nmw.A0E = venue;
            NMW.A03(nmw);
            c25671My = nmw.A08;
            if (c25671My == null) {
                C14360o3.A0F("eventBus");
                throw C00O.createAndThrow();
            }
        }
        c25671My.E4s(new C3VQ(venue, C05F.A01));
    }
}
