package X;

import android.text.TextUtils;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.SPm, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62755SPm {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final List A04;
    public final JSONObject A05;
    public final String A06;
    public final String A07;
    public final List A08;

    public final C62599SId A00() {
        List list = this.A08;
        if (list != null && !list.isEmpty()) {
            return (C62599SId) AbstractC166987dD.A16(list);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C62755SPm)) {
            return false;
        }
        return TextUtils.equals(this.A06, ((C62755SPm) obj).A06);
    }

    public final int hashCode() {
        return this.A06.hashCode();
    }

    public final String toString() {
        List list = this.A04;
        String obj = this.A05.toString();
        String valueOf = String.valueOf(list);
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("ProductDetails{jsonString='");
        A1C.append(this.A06);
        A1C.append("', parsedJson=");
        A1C.append(obj);
        A1C.append(", productId='");
        A1C.append(this.A00);
        A1C.append("', productType='");
        A1C.append(this.A01);
        A1C.append("', title='");
        A1C.append(this.A07);
        A1C.append("', productDetailsToken='");
        A1C.append(this.A02);
        A1C.append("', subscriptionOfferDetails=");
        return AbstractC50523MSb.A0W(valueOf, A1C);
    }

    public C62755SPm(String str) {
        this.A06 = str;
        JSONObject A17 = AbstractC58318PtA.A17(str);
        this.A05 = A17;
        String optString = A17.optString("productId");
        this.A00 = optString;
        String optString2 = A17.optString(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
        this.A01 = optString2;
        if (!TextUtils.isEmpty(optString)) {
            if (!TextUtils.isEmpty(optString2)) {
                this.A07 = A17.optString(DialogModule.KEY_TITLE);
                A17.optString(PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
                A17.optString(DevServerEntity.COLUMN_DESCRIPTION);
                A17.optString("packageDisplayName");
                A17.optString("iconUrl");
                this.A02 = A17.optString("skuDetailsToken");
                this.A03 = A17.optString("serializedDocid");
                JSONArray optJSONArray = A17.optJSONArray("subscriptionOfferDetails");
                ArrayList arrayList = null;
                if (optJSONArray != null) {
                    arrayList = AbstractC166987dD.A1E();
                    for (int i = 0; i < optJSONArray.length(); i++) {
                        arrayList.add(new SI7(optJSONArray.getJSONObject(i)));
                    }
                } else if (optString2.equals("subs") || optString2.equals("play_pass_subs")) {
                    arrayList = AbstractC166987dD.A1E();
                }
                this.A04 = arrayList;
                JSONObject optJSONObject = this.A05.optJSONObject("oneTimePurchaseOfferDetails");
                JSONArray optJSONArray2 = this.A05.optJSONArray("oneTimePurchaseOfferDetailsList");
                ArrayList A1E = AbstractC166987dD.A1E();
                if (optJSONArray2 == null) {
                    if (optJSONObject != null) {
                        A1E.add(new C62599SId(optJSONObject));
                    } else {
                        return;
                    }
                } else {
                    for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                        A1E.add(new C62599SId(optJSONArray2.getJSONObject(i2)));
                    }
                }
                this.A08 = A1E;
                return;
            }
            throw AbstractC166987dD.A12("Product type cannot be empty.");
        }
        throw AbstractC166987dD.A12("Product id cannot be empty.");
    }
}
