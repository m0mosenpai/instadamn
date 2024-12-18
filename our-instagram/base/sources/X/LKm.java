package X;

import android.util.Base64;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public abstract class LKm {
    public String A00;
    public String A01;

    public final synchronized void A05(C46513KiC c46513KiC) {
        try {
            HashMap A01 = A01(this);
            Map map = (Map) A01.get(c46513KiC.A03);
            if (map != null) {
                map.remove(Base64.encodeToString(c46513KiC.A04, 2));
                A03(A01);
            }
        } catch (IllegalArgumentException | JSONException unused) {
            A04();
        }
    }

    public final synchronized void A06(List list) {
        C14360o3.A0B(list, 0);
        try {
            HashMap A01 = A01(this);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C46513KiC c46513KiC = (C46513KiC) it.next();
                String str = c46513KiC.A03;
                Map map = (Map) A01.get(str);
                if (map == null) {
                    map = AbstractC166987dD.A1G();
                    A01.put(str, map);
                }
                map.put(Base64.encodeToString(c46513KiC.A04, 2), c46513KiC);
            }
            A03(A01);
        } catch (IllegalArgumentException | JSONException unused) {
            A04();
        }
    }

    public LKm() {
        StringBuilder A11;
        if (AbstractC167007dF.A1N("".length())) {
            this.A00 = AnonymousClass001.A0R("acs_storage_manager_cached_token:", "LS_IgdReceiverFetch");
            A11 = AbstractC166997dE.A11("acs_storage_manager_server_config:");
            A11.append("LS_IgdReceiverFetch");
        } else {
            this.A00 = AnonymousClass001.A0i("acs_storage_manager_cached_token:", "LS_IgdReceiverFetch", "", ':');
            A11 = AbstractC166997dE.A11("acs_storage_manager_server_config:");
            A11.append("LS_IgdReceiverFetch");
            A11.append(':');
            A11.append("");
        }
        this.A01 = A11.toString();
    }

    public final void A04() {
        if (this instanceof C45334K4m) {
            C45334K4m c45334K4m = (C45334K4m) this;
            C1ZT AR9 = c45334K4m.A00.AR9();
            AR9.A06(((LKm) c45334K4m).A00);
            AR9.A06(c45334K4m.A01);
            AR9.A0C(1);
            return;
        }
        ((C45333K4l) this).A00 = AbstractC166987dD.A1G();
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, X.Ki6] */
    public static final HashMap A00(LKm lKm) {
        String A1A;
        HashMap A1G = AbstractC166987dD.A1G();
        String str = lKm.A01;
        if (lKm instanceof C45334K4m) {
            A1A = ((C45334K4m) lKm).A00.getString(str, "");
        } else {
            A1A = AbstractC166987dD.A1A(str, ((C45333K4l) lKm).A00);
        }
        if (A1A != null && A1A.length() != 0) {
            JSONObject jSONObject = new JSONObject(A1A);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                JSONObject jSONObject2 = jSONObject.getJSONObject(AbstractC166987dD.A1B(keys));
                String string = jSONObject2.getString("server_config_id");
                int i = jSONObject2.getInt("cipher_suite");
                byte[] decode = Base64.decode(jSONObject2.getString("public_key"), 2);
                int i2 = jSONObject2.getInt("max_evals");
                int i3 = jSONObject2.getInt("max_redemptions");
                long j = jSONObject2.getLong("config_expires_on");
                long j2 = jSONObject2.getLong("token_ttl");
                ?? obj = new Object();
                obj.A05 = string;
                obj.A00 = i;
                obj.A06 = decode;
                obj.A01 = i2;
                obj.A02 = i3;
                obj.A03 = j;
                obj.A04 = j2;
                A1G.put(string, obj);
            }
        }
        return A1G;
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [X.KiC, java.lang.Object] */
    public static final HashMap A01(LKm lKm) {
        String A1A;
        HashMap A1G = AbstractC166987dD.A1G();
        String str = lKm.A00;
        if (lKm instanceof C45334K4m) {
            A1A = ((C45334K4m) lKm).A00.getString(str, "");
        } else {
            A1A = AbstractC166987dD.A1A(str, ((C45333K4l) lKm).A00);
        }
        if (A1A != null && A1A.length() != 0) {
            JSONObject jSONObject = new JSONObject(A1A);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String A1B = AbstractC166987dD.A1B(keys);
                JSONObject jSONObject2 = jSONObject.getJSONObject(A1B);
                HashMap A1G2 = AbstractC166987dD.A1G();
                Iterator<String> keys2 = jSONObject2.keys();
                while (keys2.hasNext()) {
                    String A1B2 = AbstractC166987dD.A1B(keys2);
                    Object obj = jSONObject2.get(A1B2);
                    C14360o3.A0C(obj, "null cannot be cast to non-null type org.json.JSONObject");
                    JSONObject jSONObject3 = (JSONObject) obj;
                    String string = jSONObject3.getString("server_config_id");
                    byte[] decode = Base64.decode(jSONObject3.getString("nonce"), 2);
                    byte[] decode2 = Base64.decode(jSONObject3.getString("shared_secret"), 2);
                    long j = jSONObject3.getLong("token_expires_on");
                    int i = jSONObject3.getInt("max_redemptions");
                    int i2 = jSONObject3.getInt("number_redemptions");
                    ?? obj2 = new Object();
                    obj2.A03 = string;
                    obj2.A04 = decode;
                    obj2.A05 = decode2;
                    obj2.A02 = j;
                    obj2.A00 = i;
                    obj2.A01 = i2;
                    A1G2.put(A1B2, obj2);
                }
                A1G.put(A1B, A1G2);
            }
        }
        return A1G;
    }

    public static final void A02(LKm lKm, Map map) {
        JSONObject A0q = AbstractC31171DnF.A0q();
        Iterator A15 = AbstractC166997dE.A15(map);
        while (A15.hasNext()) {
            Map.Entry A1K = AbstractC166987dD.A1K(A15);
            String A17 = AbstractC31172DnG.A17(A1K);
            C46507Ki6 c46507Ki6 = (C46507Ki6) A1K.getValue();
            JSONObject A0q2 = AbstractC31171DnF.A0q();
            A0q2.put("server_config_id", c46507Ki6.A05);
            A0q2.put("cipher_suite", c46507Ki6.A00);
            A0q2.put("public_key", Base64.encodeToString(c46507Ki6.A06, 2));
            A0q2.put("max_evals", c46507Ki6.A01);
            A0q2.put("max_redemptions", c46507Ki6.A02);
            A0q2.put("config_expires_on", c46507Ki6.A03);
            A0q2.put("token_ttl", c46507Ki6.A04);
            A0q.put(A17, A0q2);
        }
        String str = lKm.A01;
        String A19 = AbstractC166987dD.A19(A0q);
        if (lKm instanceof C45334K4m) {
            C1ZT AR9 = ((C45334K4m) lKm).A00.AR9();
            AR9.A09(str, A19);
            AR9.A0C(1);
            return;
        }
        ((C45333K4l) lKm).A00.put(str, A19);
    }

    private final void A03(Map map) {
        JSONObject A0q = AbstractC31171DnF.A0q();
        Iterator A15 = AbstractC166997dE.A15(map);
        int i = 0;
        while (A15.hasNext()) {
            Map.Entry A1K = AbstractC166987dD.A1K(A15);
            String A17 = AbstractC31172DnG.A17(A1K);
            Map map2 = (Map) A1K.getValue();
            JSONObject A0q2 = AbstractC31171DnF.A0q();
            Iterator A16 = AbstractC166997dE.A16(map2);
            while (A16.hasNext()) {
                C46513KiC c46513KiC = (C46513KiC) A16.next();
                if (c46513KiC.A00()) {
                    if (i >= 50) {
                        break;
                    }
                    i++;
                    JSONObject A0q3 = AbstractC31171DnF.A0q();
                    A0q3.put("server_config_id", c46513KiC.A03);
                    byte[] bArr = c46513KiC.A04;
                    A0q3.put("nonce", Base64.encodeToString(bArr, 2));
                    A0q3.put("shared_secret", Base64.encodeToString(c46513KiC.A05, 2));
                    A0q3.put("token_expires_on", c46513KiC.A02);
                    A0q3.put("max_redemptions", c46513KiC.A00);
                    A0q3.put("number_redemptions", c46513KiC.A01);
                    A0q2.put(Base64.encodeToString(bArr, 2), A0q3);
                }
            }
            if (A0q2.length() > 0) {
                A0q.put(A17, A0q2);
            }
        }
        String str = this.A00;
        String A19 = AbstractC166987dD.A19(A0q);
        if (this instanceof C45334K4m) {
            C1ZT AR9 = ((C45334K4m) this).A00.AR9();
            AR9.A09(str, A19);
            AR9.A0C(1);
            return;
        }
        ((C45333K4l) this).A00.put(str, A19);
    }
}
