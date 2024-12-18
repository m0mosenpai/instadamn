package X;

import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.SMs, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62704SMs {
    public long A01;
    public InterfaceC65366Tiy A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public UUID A08;
    public List A07 = AbstractC25225BEi.A17(50);
    public int A00 = 0;

    public final String toString() {
        JSONObject A0q = AbstractC31171DnF.A0q();
        try {
            A0q.put("seq", this.A00);
            A0q.put("time", AbstractC62801SRv.A00(this.A01));
            A0q.putOpt("app_id", this.A03);
            A0q.putOpt("app_ver", this.A04);
            A0q.putOpt("build_num", this.A05);
            A0q.putOpt(AbstractC63082Sc5.A01(0, 9, 98), this.A02.get());
            A0q.putOpt(AbstractC63082Sc5.A00(), this.A08);
            A0q.putOpt("uid", this.A06);
            List list = this.A07;
            JSONArray A0p = AbstractC31171DnF.A0p();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                A0p.put(((C63302Sh6) it.next()).A02());
            }
            A0q.put("data", A0p);
            A0q.put("log_type", "client_event");
            return A0q.toString();
        } catch (JSONException e) {
            C0K8.A0I("AnalyticsSession", "Failed to serialize", e);
            return "";
        }
    }
}
