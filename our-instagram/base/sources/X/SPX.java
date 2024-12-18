package X;

import android.text.TextUtils;
import com.facebook.android.instantexperiences.autofill.model.BrowserExtensionsAutofillData;
import com.facebook.android.instantexperiences.autofill.model.TelephoneAutofillData;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public final class SPX {
    public final C23031Ai A00;

    public SPX(UserSession userSession) {
        this.A00 = AbstractC23021Ah.A00(userSession);
    }

    public final ArrayList A00() {
        ArrayList A1E = AbstractC166987dD.A1E();
        String A0f = MSY.A0f(this.A00, "ix_autofill_address", "");
        if (!TextUtils.isEmpty(A0f)) {
            try {
                JSONArray jSONArray = new JSONArray(A0f);
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    C14360o3.A0B(jSONObject, 1);
                    A1E.add(new BrowserExtensionsAutofillData(jSONObject));
                }
            } catch (JSONException e) {
                C0K8.A0F("IgAutofillDataStore", e.toString(), e);
            }
        }
        return A1E;
    }

    public final ArrayList A01() {
        ArrayList A1E = AbstractC166987dD.A1E();
        String A0f = MSY.A0f(this.A00, "ix_autofill_email", "");
        if (!TextUtils.isEmpty(A0f)) {
            try {
                JSONArray jSONArray = new JSONArray(A0f);
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    C14360o3.A0B(jSONObject, 1);
                    A1E.add(new BrowserExtensionsAutofillData(jSONObject));
                }
            } catch (JSONException e) {
                C0K8.A0F("IgAutofillDataStore", e.toString(), e);
            }
        }
        return A1E;
    }

    public final ArrayList A02() {
        ArrayList A1E = AbstractC166987dD.A1E();
        String A0f = MSY.A0f(this.A00, "ix_autofill_name", "");
        if (!TextUtils.isEmpty(A0f)) {
            try {
                JSONArray jSONArray = new JSONArray(A0f);
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    C14360o3.A0B(jSONObject, 1);
                    A1E.add(new BrowserExtensionsAutofillData(jSONObject));
                }
            } catch (JSONException e) {
                C0K8.A0F("IgAutofillDataStore", e.toString(), e);
            }
        }
        return A1E;
    }

    public final ArrayList A03() {
        ArrayList A1E = AbstractC166987dD.A1E();
        String A0f = MSY.A0f(this.A00, "ix_autofill_phone", "");
        if (!TextUtils.isEmpty(A0f)) {
            try {
                JSONArray jSONArray = new JSONArray(A0f);
                for (int i = 0; i < jSONArray.length(); i++) {
                    A1E.add(new TelephoneAutofillData(jSONArray.getJSONObject(i)));
                }
            } catch (JSONException e) {
                C0K8.A0F("IgAutofillDataStore", e.toString(), e);
            }
        }
        return A1E;
    }
}
