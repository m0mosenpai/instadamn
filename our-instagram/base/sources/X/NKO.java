package X;

import android.content.Context;
import android.location.Location;
import com.instagram.common.session.UserSession;
import com.instagram.model.venue.Venue;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes9.dex */
public final class NKO extends OX6 implements InterfaceC58116Ppf, InterfaceC58040PoQ {
    public C56037Ou9 A00;
    public final AbstractC55082Oac A01;
    public final InterfaceC19390xP A02;
    public final C05A A03;
    public final Context A04;
    public final UserSession A05;
    public final InterfaceC58190Pqw A06;
    public final InterfaceC16660sJ A07;
    public final boolean A08;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NKO(Context context, UserSession userSession, InterfaceC58190Pqw interfaceC58190Pqw, AbstractC55082Oac abstractC55082Oac, InterfaceC16660sJ interfaceC16660sJ, boolean z) {
        super(abstractC55082Oac);
        C14360o3.A0B(abstractC55082Oac, 1);
        AbstractC167007dF.A1F(interfaceC58190Pqw, 2, userSession);
        this.A01 = abstractC55082Oac;
        this.A06 = interfaceC58190Pqw;
        this.A04 = context;
        this.A05 = userSession;
        this.A08 = z;
        this.A07 = interfaceC16660sJ;
        C008002u A1H = AbstractC25225BEi.A1H(new C51751Mta((Venue) null, (String) null, (List) null, (DefaultConstructorMarker) null, 15, 2, false));
        this.A03 = A1H;
        this.A02 = A1H;
    }

    public final void A08(C47Z c47z, String str) {
        Context context = this.A04;
        UserSession userSession = this.A05;
        C1VW c1vw = C1VW.A00;
        if (c1vw != null) {
            C56037Ou9 c56037Ou9 = new C56037Ou9(context, userSession, this, c1vw, c47z, str);
            this.A00 = c56037Ou9;
            c56037Ou9.A00();
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.InterfaceC58040PoQ
    public final void Dl4(List list, String str) {
        C14360o3.A0B(list, 0);
        C05A c05a = this.A03;
        C51751Mta c51751Mta = (C51751Mta) c05a.getValue();
        c05a.Egh(new C51751Mta((Venue) c51751Mta.A00, str, list, c51751Mta.A03));
        C56037Ou9 c56037Ou9 = this.A00;
        if (c56037Ou9 != null) {
            c56037Ou9.A05.removeLocationUpdates(c56037Ou9.A03, c56037Ou9);
        }
    }

    private final void A00(Venue venue) {
        C51754Mtd A00;
        C56037Ou9 c56037Ou9;
        Location location;
        C09530e4 c09530e4 = null;
        A00 = C51754Mtd.A00(null, null, null, null, null, null, null, null, null, null, null, null, A04(), null, venue, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -129, 262143, false, false, false, false, false, false, false, false, false, false, false, false, false);
        if (this.A08) {
            if (venue != null && (c56037Ou9 = this.A00) != null && (location = c56037Ou9.A00) != null) {
                c09530e4 = AbstractC166987dD.A1L(Double.valueOf(location.getLatitude()), Double.valueOf(location.getLongitude()));
            }
            A00 = C51754Mtd.A00(null, null, null, null, null, null, null, null, null, null, null, null, A00, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, c09530e4, -257, 262143, false, false, false, false, false, false, false, false, false, false, false, false, false);
        }
        A07(A00);
    }

    @Override // X.InterfaceC58040PoQ
    public final void D3I() {
        C05A c05a = this.A03;
        C51751Mta c51751Mta = (C51751Mta) c05a.getValue();
        C16930sl c16930sl = C16930sl.A00;
        Venue venue = (Venue) c51751Mta.A00;
        boolean z = c51751Mta.A03;
        C14360o3.A0B(c16930sl, 0);
        c05a.Egh(new C51751Mta(venue, (String) null, c16930sl, z));
    }

    @Override // X.InterfaceC58116Ppf
    public final void DQB() {
        this.A06.CkR();
        A00(null);
    }

    @Override // X.InterfaceC58116Ppf
    public final void DQE() {
        this.A06.CkS();
        C05A c05a = this.A03;
        C51751Mta c51751Mta = (C51751Mta) c05a.getValue();
        List list = (List) c51751Mta.A01;
        String str = c51751Mta.A02;
        Venue venue = (Venue) c51751Mta.A00;
        C14360o3.A0B(list, 0);
        c05a.Egh(new C51751Mta(venue, str, list, true));
    }

    @Override // X.InterfaceC58116Ppf
    public final void DQF(Venue venue) {
        this.A06.CkT();
        A00(venue);
        InterfaceC16660sJ interfaceC16660sJ = this.A07;
        if (interfaceC16660sJ != null) {
            interfaceC16660sJ.invoke(venue);
        }
    }
}
