package X;

import org.json.JSONObject;

/* renamed from: X.SIe, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62600SIe {
    public final int A00;
    public final int A01;
    public final long A02;
    public final String A03;
    public final String A04;
    public final String A05;

    public C62600SIe(JSONObject jSONObject) {
        this.A05 = jSONObject.optString(MSV.A00(983));
        this.A04 = jSONObject.optString("priceCurrencyCode");
        this.A03 = jSONObject.optString("formattedPrice");
        this.A02 = jSONObject.optLong("priceAmountMicros");
        this.A01 = jSONObject.optInt("recurrenceMode");
        this.A00 = jSONObject.optInt("billingCycleCount");
    }
}
