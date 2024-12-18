package X;

import com.instagram.model.venue.Venue;

/* loaded from: classes11.dex */
public final class WdQ implements C53S {
    public final int A00;
    public final Object A01;

    public WdQ(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.C53S
    public final void A8Y(C19280xC c19280xC) {
        C11520jB E6b;
        switch (this.A00) {
            case 0:
                C14360o3.A0B(c19280xC, 0);
                E6b = ((V1R) this.A01).E6b();
                break;
            case 1:
                Venue venue = ((V1B) this.A01).A0G;
                if (venue == null) {
                    return;
                }
                C14360o3.A0B(c19280xC, 0);
                E6b = AbstractC69959Vya.A01(venue);
                break;
            default:
                C14360o3.A0B(c19280xC, 0);
                AbstractC67878V0j abstractC67878V0j = (AbstractC67878V0j) this.A01;
                String A03 = abstractC67878V0j.A07().A03();
                String A0d = AbstractC65702TsY.A0d(abstractC67878V0j);
                String A04 = abstractC67878V0j.A06().A04();
                c19280xC.A07(AbstractC129015sM.A01, A03);
                c19280xC.A07(AbstractC129015sM.A00, A0d);
                c19280xC.A0C("search_session_id", A04);
                c19280xC.A0C("search_tab", AbstractC66135U1c.A00(abstractC67878V0j.A05().E6f()));
                c19280xC.A0C("selected_type", "USER");
                c19280xC.A08(0, "position");
                return;
        }
        c19280xC.A04(E6b.A00());
    }
}
