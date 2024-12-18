package X;

import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class FQI {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final boolean A04;
    public final boolean A05;

    public FQI(String str, String str2, String str3, String str4, boolean z, boolean z2) {
        C14360o3.A0B(str4, 6);
        this.A00 = str;
        this.A01 = str2;
        this.A05 = z;
        this.A04 = z2;
        this.A02 = str3;
        this.A03 = str4;
    }

    public final JSONObject A00() {
        JSONObject A0q = AbstractC31171DnF.A0q();
        A0q.put("contact_id", this.A00);
        A0q.put("is_group", this.A05);
        A0q.put("contact_name", this.A01);
        A0q.put(MSV.A00(1336), this.A04);
        A0q.put("ig_handle", this.A02);
        A0q.put(AbstractC31688Dvt.A02(9, 8, 121), this.A03);
        A0q.put("CALL_RANK", Integer.MAX_VALUE);
        A0q.put("MESSAGE_RANK", Integer.MAX_VALUE);
        return A0q;
    }
}
