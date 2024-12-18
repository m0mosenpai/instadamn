package X;

import android.os.Bundle;
import com.instagram.model.venue.Venue;

/* renamed from: X.Vqz, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69535Vqz {
    public final /* synthetic */ V1B A00;

    public C69535Vqz(V1B v1b) {
        this.A00 = v1b;
    }

    public final void A00() {
        String str;
        V1B v1b = this.A00;
        if (v1b.A0E != null) {
            C1VW.A00.getFragmentFactory();
            V1Y v1y = new V1Y();
            v1y.A02 = v1b.A0E;
            v1y.A01 = v1b.A0C;
            Bundle bundle = new Bundle();
            bundle.putString("location_id_key", v1b.A0I);
            Venue venue = v1b.A0G;
            if (venue != null) {
                bundle.putString("fb_page_id_key", venue.A04());
            }
            bundle.putString("info_page_logging_entry_point", "location_page");
            v1y.setArguments(bundle);
            C140966Yy A0P = AbstractC31173DnH.A0P(v1b.requireActivity(), v1b.A02);
            A0P.A0E(v1y);
            A0P.A0F(v1b, 0);
            A0P.A07 = new WdQ(v1b, 1);
            A0P.A04();
            WDE wde = v1b.A0C;
            String str2 = v1b.A0I;
            Venue venue2 = v1b.A0G;
            if (venue2 != null) {
                str = venue2.A04();
            } else {
                str = null;
            }
            wde.A02(null, null, "location_page", "tap_component", "view_information", str2, str, null, null);
        }
    }
}
