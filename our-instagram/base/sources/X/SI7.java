package X;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public final class SI7 {
    public final SAN A00;
    public final String A01;
    public final String A02;
    public final SAQ A03;
    public final List A04;

    public SI7(JSONObject jSONObject) {
        jSONObject.optString("basePlanId");
        String optString = jSONObject.optString("offerId");
        this.A01 = true == optString.isEmpty() ? null : optString;
        this.A02 = jSONObject.getString("offerIdToken");
        this.A00 = new SAN(jSONObject.getJSONArray("pricingPhases"));
        JSONObject optJSONObject = jSONObject.optJSONObject("installmentPlanDetails");
        if (optJSONObject != null) {
            optJSONObject.getInt("commitmentPaymentsCount");
            optJSONObject.optInt("subsequentCommitmentPaymentsCount");
        }
        JSONObject optJSONObject2 = jSONObject.optJSONObject("transitionPlanDetails");
        this.A03 = optJSONObject2 != null ? new SAQ(optJSONObject2) : null;
        ArrayList A1E = AbstractC166987dD.A1E();
        JSONArray optJSONArray = jSONObject.optJSONArray("offerTags");
        if (optJSONArray != null) {
            for (int i = 0; i < optJSONArray.length(); i = AbstractC58322PtE.A0C(A1E, optJSONArray, i)) {
            }
        }
        this.A04 = A1E;
    }
}
