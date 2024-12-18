package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.google.gson.Gson;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes10.dex */
public final class SZO {
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public Long A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public String A0D;
    public String A0E;
    public String A0F;
    public String A0G;
    public String A0H;
    public String A0I;
    public String A0J;
    public Map A0K;
    public Map A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public final boolean A0Q;

    public /* synthetic */ SZO(Long l, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, Map map, Map map2, int i, int i2, long j, long j2, boolean z, boolean z2, boolean z3, boolean z4) {
        boolean A1W = AbstractC167007dF.A1W(AbstractC83633o6.A01);
        this.A0I = str;
        this.A0B = str2;
        this.A0G = str3;
        this.A0F = str4;
        this.A06 = str5;
        this.A07 = str6;
        this.A0C = str7;
        this.A08 = str8;
        this.A0D = str9;
        this.A0A = str10;
        this.A09 = str11;
        this.A0H = str12;
        this.A0E = str13;
        this.A0P = z;
        this.A02 = j;
        this.A00 = i;
        this.A01 = i2;
        this.A03 = j2;
        this.A0L = map;
        this.A0J = str14;
        this.A0O = z2;
        this.A0N = z3;
        this.A04 = l;
        this.A05 = str15;
        this.A0Q = z4;
        this.A0K = map2;
        this.A0M = A1W;
    }

    public static final void A00(SZO szo, Map map) {
        String str = szo.A0B;
        if (str != null && str.length() != 0) {
            map.put("iab_session_id", str);
        }
        String str2 = szo.A0G;
        if (str2 != null) {
            map.put("selected_field_tag", str2);
        }
        String str3 = szo.A0F;
        if (str3 != null) {
            map.put("requested_fields", str3);
        }
        String str4 = szo.A06;
        if (str4 != null) {
            map.put("all_fields", str4);
        }
        String str5 = szo.A07;
        if (str5 != null) {
            map.put("available_fields", str5);
        }
        String str6 = szo.A0C;
        if (str6 != null) {
            map.put("new_fields", str6);
        }
        String str7 = szo.A08;
        if (str7 != null) {
            map.put("current_url", str7);
        }
        String str8 = szo.A0D;
        if (str8 != null) {
            map.put("origin_host", str8);
        }
        String str9 = szo.A0A;
        if (str9 != null) {
            map.put("form_session_id", str9);
        }
        String str10 = szo.A09;
        if (str10 != null) {
            map.put("edited_fields", str10);
        }
        String str11 = szo.A0J;
        if (str11 != null) {
            map.put("user_credentials_status", str11);
        }
        map.put("has_helium", String.valueOf(szo.A0M));
    }

    public final HashMap A01() {
        HashMap A1G = AbstractC166987dD.A1G();
        A1G.put("action", "BrowserLiteIntent.IAB_AUTOFILL_INTERACTION");
        A1G.put("user_action", this.A0I);
        A00(this, A1G);
        String str = this.A0H;
        if (str != null) {
            A1G.put(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, str);
        }
        String str2 = this.A0E;
        if (str2 != null) {
            A1G.put("payment_credential_ids", str2);
        }
        A1G.put("with_ads_disclosure", String.valueOf(this.A0P));
        long j = this.A02;
        if (j != 0) {
            A1G.put("form_completion_duration", String.valueOf(j));
        }
        int i = this.A00;
        if (i != 0) {
            A1G.put("event_times", String.valueOf(i));
        }
        int i2 = this.A01;
        if (i2 != 0) {
            A1G.put("time_spend", String.valueOf(i2));
        }
        long j2 = this.A03;
        if (j2 > 0) {
            A1G.put("index", String.valueOf(j2));
        }
        Map map = this.A0L;
        if (map != null) {
            map.put("is_bloks_screen", String.valueOf(this.A0Q));
            String A0C = new Gson().A0C(map, new C60848RVl().type);
            C14360o3.A07(A0C);
            A1G.put("enhanced_regex_new_fields_metadata", A0C);
        }
        A1G.put("is_payment_opt_in", String.valueOf(this.A0O));
        A1G.put("is_contact_opt_in", String.valueOf(this.A0N));
        A1G.put("has_helium", String.valueOf(this.A0M));
        String str3 = this.A05;
        if (str3 != null) {
            A1G.put("ad_id", str3);
        }
        A1G.put("IS_BLOKS_LOG_EVENT", String.valueOf(this.A0Q));
        Map map2 = this.A0K;
        if (map2 != null) {
            String A0C2 = new Gson().A0C(map2, new C60847RVk().type);
            C14360o3.A07(A0C2);
            A1G.put("experiments", A0C2);
        }
        return A1G;
    }
}
