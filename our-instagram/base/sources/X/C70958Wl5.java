package X;

import com.instagram.model.venue.Venue;

/* renamed from: X.Wl5, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70958Wl5 implements InterfaceC71955XCh {
    public final /* synthetic */ V1B A00;

    public C70958Wl5(V1B v1b) {
        this.A00 = v1b;
    }

    @Override // X.InterfaceC71955XCh
    public final void DLw(C67845UzJ c67845UzJ) {
        V1B v1b = this.A00;
        v1b.A0E = c67845UzJ;
        AbstractC31175DnJ.A0i(v1b.getActivity());
        WDE wde = v1b.A0C;
        wde.A04 = "fetch_data";
        wde.A07 = "location_page";
        wde.A01 = "view_information";
        wde.A06 = v1b.A0I;
        Venue venue = v1b.A0G;
        if (venue != null) {
            wde.A05 = venue.A04();
        }
        v1b.A0C.A01();
    }

    @Override // X.InterfaceC71955XCh
    public final void DLx(String str) {
        V1B v1b = this.A00;
        WDE wde = v1b.A0C;
        wde.A04 = MSV.A00(1181);
        wde.A07 = "location_page";
        wde.A01 = "view_information";
        wde.A06 = v1b.A0I;
        wde.A03 = str;
        Venue venue = v1b.A0G;
        if (venue != null) {
            wde.A05 = venue.A04();
        }
        v1b.A0C.A01();
    }
}
