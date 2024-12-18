package X;

import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.Lfi, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48657Lfi implements MRE {
    public final JSONArray A00;
    public final JSONObject A01;

    @Override // X.MRE
    public final String BaC() {
        String string = this.A01.getString("offline_threading_id");
        C14360o3.A07(string);
        return string;
    }

    @Override // X.MRE
    public final byte[] Bbl() {
        MCX mcx = AbstractC47734L5v.A00;
        String string = this.A01.getJSONObject("toplevel_payload").getString("encrypted_payload");
        return mcx.A00(string, AbstractC43592JPx.A04(string));
    }

    @Override // X.MRE
    public final byte[] C46(int i) {
        MCX mcx = AbstractC47734L5v.A00;
        String string = this.A00.getJSONObject(i).getJSONObject("encrypted_supplemental_payload").getString("encrypted_payload");
        return mcx.A00(string, AbstractC43592JPx.A04(string));
    }

    @Override // X.MRE
    public final long C47(int i) {
        return AbstractC43592JPx.A05(this.A00.getJSONObject(i).getJSONObject("encrypted_supplemental_payload").getString("payloadTimestampMs"));
    }

    @Override // X.MRE
    public final int C48() {
        return this.A00.length();
    }

    @Override // X.MRE
    public final long C8g() {
        return AbstractC43592JPx.A05(this.A01.getJSONObject("toplevel_payload").getString("payloadTimestampMs"));
    }

    public C48657Lfi(JSONObject jSONObject) {
        this.A01 = jSONObject;
        this.A00 = jSONObject.getJSONArray("supplemental_payloads");
    }
}
