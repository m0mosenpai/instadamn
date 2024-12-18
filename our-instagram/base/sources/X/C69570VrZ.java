package X;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.VrZ, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69570VrZ {
    public final EnumC68130VCo A00;
    public final C69203VjW A01;
    public final List A02;

    public final String toString() {
        try {
            JSONObject jSONObject = new JSONObject();
            C69203VjW c69203VjW = this.A01;
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("startResponse", c69203VjW.A01.A00);
            jSONObject2.put("endResponse", c69203VjW.A00.A00);
            JSONArray jSONArray = new JSONArray();
            Iterator A15 = AbstractC166997dE.A15(c69203VjW.A02);
            while (A15.hasNext()) {
                Map.Entry entry = (Map.Entry) A15.next();
                W62 w62 = (W62) entry.getKey();
                W63 w63 = (W63) entry.getValue();
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("segment", w62.A00());
                jSONObject3.put("uploadResult", w63.A00());
                jSONArray.put(jSONObject3);
            }
            jSONObject2.put("transferResults", jSONArray);
            jSONObject2.putOpt("creativeToolsCommand", null);
            jSONObject2.put("isEdited", c69203VjW.A03);
            jSONObject.put("uploadProtocolResponses", jSONObject2);
            jSONObject.put("uploadMode", this.A00.name());
            List list = this.A02;
            JSONArray jSONArray2 = new JSONArray();
            for (Object obj : list) {
                if (obj instanceof C55176Odf) {
                    jSONArray2.put(((C55176Odf) obj).A03());
                }
            }
            jSONObject.put("transcodeResults", jSONArray2);
            return AbstractC166987dD.A19(jSONObject);
        } catch (JSONException unused) {
            return super.toString();
        }
    }

    public C69570VrZ(EnumC68130VCo enumC68130VCo, C69203VjW c69203VjW, List list) {
        AbstractC167017dG.A1R(enumC68130VCo, list);
        this.A01 = c69203VjW;
        this.A00 = enumC68130VCo;
        this.A02 = list;
    }
}
