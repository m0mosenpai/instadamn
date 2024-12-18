package X;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.SMg, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62692SMg {
    public int A00;
    public String A01 = "";
    public String A02 = "";
    public String A03 = "";
    public String A04 = "";
    public String A05 = "";

    public final String toString() {
        try {
            JSONObject A0q = AbstractC31171DnF.A0q();
            A0q.putOpt("ck", this.A01);
            A0q.putOpt("cs", this.A02);
            A0q.putOpt("di", this.A03);
            A0q.putOpt("ds", this.A04);
            A0q.put("sr", this.A00);
            A0q.putOpt("rc", this.A05);
            return A0q.toString();
        } catch (JSONException e) {
            C0K8.A0I("ConnAckPayload", AbstractC43591JPw.A00(979), e);
            return "";
        }
    }
}
