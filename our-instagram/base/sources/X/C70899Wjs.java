package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.venue.Venue;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.Wjs, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70899Wjs implements InterfaceC71926XAk {
    public final /* synthetic */ V1B A00;

    public C70899Wjs(V1B v1b) {
        this.A00 = v1b;
    }

    @Override // X.InterfaceC71926XAk
    public final void Drt(EnumC68206VFy enumC68206VFy) {
        String str;
        V1B v1b = this.A00;
        if (!(!C68034V7f.A00(enumC68206VFy, v1b.A07).A02.isEmpty())) {
            v1b.A0D.A01(enumC68206VFy, true, false);
            C66095TzW.A00(v1b.A05);
        }
        C19260xA c19260xA = new C19260xA();
        C19260xA.A00(c19260xA, v1b.A07.A00.toString(), "tab");
        List A00 = AbstractC68477VSi.A00(v1b.A0J);
        HashMap hashMap = new HashMap();
        for (int i = 0; i < v1b.A0J.size(); i++) {
            hashMap.put(Long.valueOf(i), A00.get(i).toString());
        }
        WDE wde = v1b.A0C;
        String str2 = v1b.A0I;
        Venue venue = v1b.A0G;
        if (venue != null) {
            str = venue.A04();
        } else {
            str = null;
        }
        wde.A02(c19260xA, null, "location_page", AbstractC111324zv.A00(3211), "location_tab", str2, str, null, hashMap);
        UserSession userSession = v1b.A02;
        int A05 = v1b.A07.A05();
        Venue venue2 = v1b.A0G;
        AbstractC167017dG.A1P(userSession, enumC68206VFy);
        C19280xC A01 = C19280xC.A01("location_feed_button_tapped", "feed_location");
        A01.A0C("tab_selected", enumC68206VFy.toString());
        A01.A0B("tab_index", Long.valueOf(A05));
        A01.A04(AbstractC69959Vya.A01(venue2).A00());
        AbstractC31173DnH.A1S(A01, userSession);
    }
}
