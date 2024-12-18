package com.android.billingclient.api;

import X.AbstractC166987dD;
import X.AbstractC58318PtA;
import android.text.TextUtils;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public final class Purchase {
    public final String A00;
    public final String A01;
    public final JSONObject A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Purchase) {
                Purchase purchase = (Purchase) obj;
                if (!TextUtils.equals(this.A00, purchase.A00) || !TextUtils.equals(this.A01, purchase.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final String toString() {
        return "Purchase. Json: ".concat(String.valueOf(this.A00));
    }

    public final String A01() {
        String optString = this.A02.optString("orderId");
        if (TextUtils.isEmpty(optString)) {
            return null;
        }
        return optString;
    }

    public final String A02() {
        JSONObject jSONObject = this.A02;
        return jSONObject.optString("token", jSONObject.optString("purchaseToken"));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public Purchase(String str, String str2) {
        this.A00 = str;
        this.A01 = str2;
        this.A02 = AbstractC58318PtA.A17(str);
    }

    public static final ArrayList A00(Purchase purchase) {
        ArrayList A1E = AbstractC166987dD.A1E();
        JSONObject jSONObject = purchase.A02;
        if (jSONObject.has("productIds")) {
            JSONArray optJSONArray = jSONObject.optJSONArray("productIds");
            if (optJSONArray != null) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    A1E.add(optJSONArray.optString(i));
                }
            }
        } else if (jSONObject.has("productId")) {
            A1E.add(jSONObject.optString("productId"));
        }
        return A1E;
    }
}
