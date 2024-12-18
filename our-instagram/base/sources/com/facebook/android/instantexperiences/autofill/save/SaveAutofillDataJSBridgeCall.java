package com.facebook.android.instantexperiences.autofill.save;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC58318PtA;
import X.AbstractC58320PtC;
import X.C0K8;
import X.EnumC61176Rgc;
import X.Py5;
import X.Rk1;
import android.os.Parcelable;
import com.facebook.android.instantexperiences.jscall.InstantExperiencesJSBridgeCall;
import com.facebook.common.stringformat.StringFormatUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public final class SaveAutofillDataJSBridgeCall extends InstantExperiencesJSBridgeCall {
    public static final Parcelable.Creator CREATOR = Py5.A00(95);

    public final HashMap A03() {
        String valueOf = String.valueOf(AbstractC58320PtC.A0r(this.A01, "raw_autofill_data"));
        HashMap A1G = AbstractC166987dD.A1G();
        try {
            JSONObject A17 = AbstractC58318PtA.A17(valueOf);
            Iterator<String> keys = A17.keys();
            while (keys.hasNext()) {
                String A1B = AbstractC166987dD.A1B(keys);
                JSONArray jSONArray = A17.getJSONArray(A1B);
                ArrayList A1E = AbstractC166987dD.A1E();
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    Object obj = jSONArray.get(i);
                    if (obj != null) {
                        AbstractC166997dE.A1S(obj, A1E);
                    }
                }
                A1G.put(A1B, A1E);
            }
            return A1G;
        } catch (JSONException e) {
            C0K8.A0F("SaveAutofillDataJSBridgeCall", StringFormatUtil.formatStrLocaleSafe("Failed to getRawAutofillData."), e);
            return A1G;
        }
    }

    @Override // com.facebook.android.instantexperiences.jscall.InstantExperiencesJSBridgeCall
    public final void A01() {
        super.A01();
        Object A0r = AbstractC58320PtC.A0r(this.A01, "raw_autofill_data");
        if ((A0r instanceof String) && A0r != null) {
        } else {
            throw new Rk1(EnumC61176Rgc.A06, AbstractC58318PtA.A0o(Locale.US, "The raw autofill data must be a string", Arrays.copyOf(new Object[0], 0)));
        }
    }
}
