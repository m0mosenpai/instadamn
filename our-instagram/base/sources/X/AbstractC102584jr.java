package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.4jr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC102584jr {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.HashSet, java.util.AbstractCollection] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.Set] */
    public static C1R0 A00(JSONObject jSONObject) {
        java.util.Set hashSet;
        C26701Qz c26701Qz;
        JSONArray optJSONArray = jSONObject.optJSONArray("walletDefinitionsKeys");
        JSONObject optJSONObject = jSONObject.optJSONObject("carrierSingalConfig");
        String string = jSONObject.getString("hash");
        String optString = jSONObject.optString("carrierName");
        String optString2 = jSONObject.optString("deadline");
        ArrayList A00 = AbstractC102594js.A00(jSONObject.getJSONArray("rewriteRules"));
        ArrayList A002 = AbstractC102594js.A00(jSONObject.getJSONArray("backupRewriteRules"));
        JSONArray jSONArray = jSONObject.getJSONArray("features");
        HashSet hashSet2 = new HashSet(jSONArray.length());
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            hashSet2.add(jSONArray.getString(i));
        }
        String optString3 = jSONObject.optString("campaignId");
        int i2 = jSONObject.getInt("ttl");
        long j = jSONObject.getLong("fetchedAt");
        int optInt = jSONObject.optInt("carrierID");
        if (optJSONArray == null) {
            hashSet = Collections.emptySet();
        } else {
            hashSet = new HashSet(optJSONArray.length());
            int length2 = optJSONArray.length();
            for (int i3 = 0; i3 < length2; i3++) {
                hashSet.add(optJSONArray.getString(i3));
            }
        }
        int optInt2 = jSONObject.optInt("cmsFetchIntervalSeconds", 86400);
        if (optJSONObject != null) {
            JSONArray jSONArray2 = optJSONObject.getJSONArray("pingConfigs");
            int length3 = jSONArray2.length();
            ArrayList arrayList = new ArrayList(length3);
            for (int i4 = 0; i4 != length3; i4++) {
                JSONObject jSONObject2 = jSONArray2.getJSONObject(i4);
                arrayList.add(new C62723SNn(jSONObject2.getString("key"), jSONObject2.getString("url"), jSONObject2.getInt("cooldown")));
            }
            c26701Qz = new C26701Qz(arrayList);
        } else {
            c26701Qz = new C26701Qz();
        }
        return new C1R0(c26701Qz, string, optString, optString2, optString3, jSONObject.optString("eligibilityHash"), A00, A002, hashSet2, hashSet, i2, optInt, optInt2, j);
    }

    public static JSONObject A01(C1R0 c1r0) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("version", 1);
        jSONObject.put("hash", c1r0.A09);
        jSONObject.put("ttl", c1r0.A02);
        jSONObject.put("fetchedAt", c1r0.A03);
        jSONObject.put("carrierName", c1r0.A06);
        jSONObject.put("campaignId", c1r0.A05);
        jSONObject.put("features", new JSONArray((Collection) c1r0.A0C));
        jSONObject.put("rewriteRules", AbstractC102594js.A01(c1r0.A0B));
        jSONObject.put("backupRewriteRules", AbstractC102594js.A01(c1r0.A0A));
        jSONObject.put("carrierID", c1r0.A00);
        jSONObject.put("walletDefinitionsKeys", new JSONArray((Collection) c1r0.A0D));
        jSONObject.put("cmsFetchIntervalSeconds", c1r0.A01);
        jSONObject.put("carrierSingalConfig", AbstractC103634lf.A00(c1r0.A04));
        jSONObject.put("eligibilityHash", c1r0.A08);
        return jSONObject;
    }
}
