package X;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class OD6 {
    public Integer A00;
    public String A01;
    public String A02;
    public ArrayList A03 = AbstractC166987dD.A1E();
    public boolean A04;

    public OD6(JSONObject jSONObject) {
        ArrayList arrayList;
        String str;
        Integer num;
        boolean z;
        int i;
        try {
            if (jSONObject.has("media_uri")) {
                this.A03.add(jSONObject.getString("media_uri"));
            } else if (jSONObject.has("media_uri_list")) {
                ArrayList arrayList2 = this.A03;
                Object A0E = C102274j2.A02().A0E(jSONObject.getString("media_uri_list"), List.class);
                arrayList2.addAll((!(A0E instanceof ArrayList) || (arrayList = (ArrayList) A0E) == null) ? AbstractC166987dD.A1E() : arrayList);
            }
            if (jSONObject.has("source_attribution")) {
                str = jSONObject.getString("source_attribution");
            } else {
                str = null;
            }
            this.A02 = str;
            if (jSONObject.has("audience")) {
                int i2 = jSONObject.getInt("audience");
                Integer[] A00 = C05F.A00(3);
                int length = A00.length;
                int i3 = 0;
                while (true) {
                    if (i3 < length) {
                        num = A00[i3];
                        switch (num.intValue()) {
                            case 1:
                                i = 1;
                                break;
                            case 2:
                                i = -1;
                                break;
                            default:
                                i = 0;
                                break;
                        }
                        if (i != i2) {
                            i3++;
                        }
                    } else {
                        num = C05F.A0C;
                    }
                }
            } else {
                num = null;
            }
            this.A00 = num;
            this.A01 = jSONObject.has("recipient_id") ? jSONObject.getString("recipient_id") : null;
            if (jSONObject.has("is_group_thread")) {
                z = jSONObject.getBoolean("is_group_thread");
            } else {
                z = false;
            }
            this.A04 = z;
        } catch (JSONException unused) {
        }
    }
}
