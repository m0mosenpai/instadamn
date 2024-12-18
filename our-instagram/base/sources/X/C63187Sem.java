package X;

import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: X.Sem, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63187Sem {
    public final int A00;
    public final Boolean A01;
    public final Boolean A02;
    public final Boolean A03;
    public final Byte A04;
    public final Integer A05;
    public final Integer A06;
    public final Long A07;
    public final Long A08;
    public final Long A09;
    public final Long A0A;
    public final Long A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final String A0F;
    public final String A0G;
    public final String A0H;
    public final String A0I;
    public final List A0J;
    public final Map A0K;

    public static Long A00(Integer num, JSONObject jSONObject) {
        String A00 = S1A.A00(num);
        if (!jSONObject.has(A00)) {
            return null;
        }
        return Long.valueOf(jSONObject.optLong(A00));
    }

    public static String A01(Integer num, JSONObject jSONObject) {
        String A00 = S1A.A00(num);
        if (!jSONObject.has(A00)) {
            return null;
        }
        return jSONObject.optString(A00);
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("ConnectPayloadUserName {");
        A1C.append("user_id = <redacted>, ");
        A1C.append("user_agent = ");
        A1C.append(this.A0I);
        A1C.append(", ");
        A1C.append("capabilities = ");
        A1C.append(this.A07);
        A1C.append(", ");
        A1C.append("mqtt_session_id = ");
        A1C.append(this.A0A);
        A1C.append(", ");
        A1C.append("network_type = ");
        Integer num = this.A06;
        A1C.append(num);
        A1C.append(", ");
        A1C.append("network_subtype = ");
        A1C.append(num);
        A1C.append(", ");
        A1C.append("chat_on = ");
        A1C.append(this.A01);
        A1C.append(", ");
        A1C.append("no_auto_fg = ");
        A1C.append(this.A03);
        A1C.append(", ");
        A1C.append("device_client_id = <redacted>");
        A1C.append(", ");
        A1C.append("device_client_secret = <redacted>");
        A1C.append(", ");
        A1C.append("fg_keepalive = ");
        A1C.append(this.A02);
        A1C.append(", ");
        A1C.append("client_type = ");
        A1C.append(this.A0D);
        A1C.append(", ");
        A1C.append("app_id = ");
        A1C.append(this.A0C);
        A1C.append(", ");
        A1C.append("connect_payload_hash = ");
        return AbstractC50523MSb.A0W(this.A0E, A1C);
    }

    public C63187Sem(Boolean bool, Boolean bool2, Boolean bool3, Byte b, Integer num, Integer num2, Long l, Long l2, Long l3, Long l4, Long l5, String str, String str2, String str3, String str4, String str5, String str6, String str7, List list, Map map, int i) {
        this.A0B = l;
        this.A0I = str;
        this.A07 = l2;
        this.A0A = l3;
        this.A06 = num;
        this.A05 = num2;
        this.A01 = bool;
        this.A03 = bool2;
        this.A0G = str2;
        this.A0H = str3;
        this.A02 = bool3;
        this.A09 = l4;
        this.A00 = i;
        this.A0D = str4;
        this.A0C = str5;
        this.A0J = list;
        this.A0E = str6;
        this.A0F = str7;
        this.A04 = b;
        this.A0K = map;
        this.A08 = l5;
    }
}
