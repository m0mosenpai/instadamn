package X;

import com.facebook.proxygen.TraceFieldType;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.OaA, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55055OaA {
    public final int A00;
    public final String A01;

    public static String A00(EnumC53275NhD enumC53275NhD) {
        return new C55055OaA(enumC53275NhD).A01();
    }

    public C55055OaA(EnumC53275NhD enumC53275NhD) {
        this.A00 = enumC53275NhD.A00;
        this.A01 = enumC53275NhD.A02;
    }

    public final String A01() {
        JSONObject A0q = AbstractC31171DnF.A0q();
        try {
            A0q.put("success", false);
            A0q.put(TraceFieldType.ErrorCode, this.A00);
            A0q.put("error_message", this.A01);
        } catch (JSONException e) {
            C0K8.A0F("ErrorResponse", "json serialization error", e);
        }
        return AbstractC166987dD.A19(A0q);
    }

    public C55055OaA(int i, String str) {
        C14360o3.A0B(str, 2);
        this.A00 = i;
        this.A01 = str;
    }
}
