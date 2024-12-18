package X;

import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class N14 extends AbstractC46523KiO {
    public JSONArray A00 = AbstractC31171DnF.A0p();

    @Override // X.AbstractC46523KiO
    public final void A04(long j) {
        JSONArray jSONArray = this.A00;
        JSONObject A0q = AbstractC31171DnF.A0q();
        int i = super.A00;
        String str = "UNKNOWN";
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        str = "WIFI_BAND_5GHZ";
                    }
                } else {
                    str = "WIFI_BAND_2_4GHZ";
                }
            } else {
                str = "CELLULAR";
            }
        }
        jSONArray.put(A0q.put("uplink_type", str));
        jSONArray.put(AbstractC31171DnF.A0q().put("duration", j));
    }

    @Override // X.AbstractC46523KiO
    public final void A03() {
        this.A00 = AbstractC31171DnF.A0p();
    }
}
