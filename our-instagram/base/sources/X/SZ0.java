package X;

import org.json.JSONObject;

/* loaded from: classes10.dex */
public final class SZ0 {
    public String A01 = "";
    public String A02 = "";
    public String A03 = "";
    public Long A00 = AbstractC167007dF.A0d();
    public boolean A04 = false;

    public static SZ0 A00(String str) {
        SZ0 sz0 = new SZ0();
        if (str != null) {
            JSONObject A17 = AbstractC58318PtA.A17(str);
            sz0.A01 = A17.optString("app_id");
            sz0.A02 = A17.optString("pkg_name");
            sz0.A03 = A17.optString("token");
            sz0.A00 = Long.valueOf(A17.optLong("time"));
            sz0.A04 = A17.optBoolean("invalid");
        }
        return sz0;
    }

    public final String A01() {
        JSONObject A0q = AbstractC31171DnF.A0q();
        A0q.putOpt("app_id", this.A01);
        A0q.putOpt("pkg_name", this.A02);
        A0q.putOpt("token", this.A03);
        A0q.putOpt("time", this.A00);
        A0q.putOpt("invalid", Boolean.valueOf(this.A04));
        return A0q.toString();
    }
}
