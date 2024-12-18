package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.SMr, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62703SMr {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final List A07;

    public C62703SMr(String str, String str2, String str3, String str4, String str5, String str6, String str7, List list) {
        ArrayList A1E = AbstractC166987dD.A1E();
        this.A07 = A1E;
        this.A06 = str4;
        this.A01 = str3;
        this.A04 = str;
        this.A05 = str2;
        this.A03 = str5;
        this.A00 = str6;
        this.A02 = str7;
        A1E.addAll(list);
    }

    public final String toString() {
        JSONObject A0q = AbstractC31171DnF.A0q();
        try {
            A0q.put("fullname", this.A01).put("email", this.A04).put("phone", this.A05).put("profile_pic_url", this.A06).put("account_type", this.A03).put("first_name", this.A00).put("last_name", this.A02).put("id_tokens", new JSONArray((Collection) this.A07));
            return A0q.toString();
        } catch (JSONException e) {
            return AbstractC166997dE.A0y("bad_sign_up_hint: ", e);
        }
    }
}
