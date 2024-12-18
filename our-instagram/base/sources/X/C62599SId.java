package X;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.SId, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62599SId {
    public final long A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final C61277Rkn A04;
    public final RO3 A05;

    /* JADX WARN: Multi-variable type inference failed */
    public C62599SId(JSONObject jSONObject) {
        this.A01 = jSONObject.optString("formattedPrice");
        this.A00 = jSONObject.optLong("priceAmountMicros");
        this.A02 = jSONObject.optString("priceCurrencyCode");
        String optString = jSONObject.optString("offerIdToken");
        C61277Rkn c61277Rkn = null;
        this.A03 = true == optString.isEmpty() ? null : optString;
        jSONObject.optString("offerId");
        jSONObject.optString("purchaseOptionId");
        jSONObject.optInt("offerType");
        JSONArray optJSONArray = jSONObject.optJSONArray("offerTags");
        ArrayList A1E = AbstractC166987dD.A1E();
        if (optJSONArray != null) {
            for (int i = 0; i < optJSONArray.length(); i = AbstractC58322PtE.A0C(A1E, optJSONArray, i)) {
            }
        }
        this.A05 = RO3.A02(A1E);
        if (jSONObject.has("fullPriceMicros")) {
            jSONObject.optLong("fullPriceMicros");
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("discountDisplayInfo");
        if (optJSONObject != null) {
            optJSONObject.getInt("percentageDiscount");
        }
        JSONObject optJSONObject2 = jSONObject.optJSONObject("validTimeWindow");
        if (optJSONObject2 != null) {
            optJSONObject2.getLong("startTimeMillis");
            optJSONObject2.getLong("endTimeMillis");
        }
        JSONObject optJSONObject3 = jSONObject.optJSONObject("limitedQuantityInfo");
        if (optJSONObject3 != null) {
            optJSONObject3.getInt("maximumQuantity");
            optJSONObject3.getInt("remainingQuantity");
        }
        JSONObject optJSONObject4 = jSONObject.optJSONObject("preorderDetails");
        if (optJSONObject4 != null) {
            optJSONObject4.getLong("preorderReleaseTimeMillis");
            optJSONObject4.getLong("preorderPresaleEndTimeMillis");
        }
        JSONObject optJSONObject5 = jSONObject.optJSONObject("rentalDetails");
        if (optJSONObject5 != null) {
            Object obj = new Object();
            optJSONObject5.getString("rentalPeriod");
            optJSONObject5.optString("rentalExpirationPeriod");
            c61277Rkn = obj;
        }
        this.A04 = c61277Rkn;
    }
}
