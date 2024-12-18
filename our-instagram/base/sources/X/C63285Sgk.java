package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.browser.lite.extensions.autofill.model.AutofillData;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Sgk, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63285Sgk {
    public static String A01(Object obj, Map map) {
        Object obj2 = map.get(obj);
        if (obj2 != null) {
            return obj2.toString();
        }
        return null;
    }

    public static final Map A02(AutofillData autofillData) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        Object obj8;
        Object obj9;
        Object obj10;
        Object obj11;
        Object obj12;
        Object obj13;
        Object obj14;
        Object obj15;
        Object obj16;
        Object obj17;
        Object obj18;
        Object obj19;
        Object obj20;
        Object obj21;
        Object obj22 = autofillData != null ? autofillData.A00.get(PublicKeyCredentialControllerUtility.JSON_KEY_NAME) : null;
        Object obj23 = "";
        if (obj22 == null) {
            obj22 = "";
        }
        C09530e4 A1L = AbstractC166987dD.A1L(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, obj22);
        if (autofillData == null || (obj = autofillData.A00.get("family-name")) == null) {
            obj = "";
        }
        C09530e4 A1L2 = AbstractC166987dD.A1L("family_name", obj);
        if (autofillData == null || (obj2 = autofillData.A00.get("given-name")) == null) {
            obj2 = "";
        }
        C09530e4 A1L3 = AbstractC166987dD.A1L("given_name", obj2);
        if (autofillData == null || (obj3 = autofillData.A00.get("tel")) == null) {
            obj3 = "";
        }
        C09530e4 A1L4 = AbstractC166987dD.A1L("tel", obj3);
        if (autofillData == null || (obj4 = autofillData.A00.get("tel-country-code")) == null) {
            obj4 = "";
        }
        C09530e4 A1L5 = AbstractC166987dD.A1L("tel_country_code", obj4);
        if (autofillData == null || (obj5 = autofillData.A00.get("tel-national")) == null) {
            obj5 = "";
        }
        C09530e4 A1L6 = AbstractC166987dD.A1L("tel_national", obj5);
        if (autofillData == null || (obj6 = autofillData.A00.get("tel-area-code")) == null) {
            obj6 = "";
        }
        C09530e4 A1L7 = AbstractC166987dD.A1L("tel_area_code", obj6);
        if (autofillData == null || (obj7 = autofillData.A00.get("tel-local")) == null) {
            obj7 = "";
        }
        C09530e4 A1L8 = AbstractC166987dD.A1L("tel_local", obj7);
        if (autofillData == null || (obj8 = autofillData.A00.get("tel-local-prefix")) == null) {
            obj8 = "";
        }
        C09530e4 A1L9 = AbstractC166987dD.A1L("tel_local_prefix", obj8);
        if (autofillData == null || (obj9 = autofillData.A00.get("tel-local-suffix")) == null) {
            obj9 = "";
        }
        C09530e4 A1L10 = AbstractC166987dD.A1L("tel_local_suffix", obj9);
        if (autofillData == null || (obj10 = autofillData.A00.get("postal-code")) == null) {
            obj10 = "";
        }
        C09530e4 A1L11 = AbstractC166987dD.A1L("postal_code", obj10);
        if (autofillData == null || (obj11 = autofillData.A00.get("country")) == null) {
            obj11 = "";
        }
        C09530e4 A1L12 = AbstractC166987dD.A1L("country", obj11);
        if (autofillData == null || (obj12 = autofillData.A00.get("street-address")) == null) {
            obj12 = "";
        }
        C09530e4 A1L13 = AbstractC166987dD.A1L("street_address", obj12);
        if (autofillData == null || (obj13 = autofillData.A00.get("address-line1")) == null) {
            obj13 = "";
        }
        C09530e4 A1L14 = AbstractC166987dD.A1L("address_line1", obj13);
        if (autofillData == null || (obj14 = autofillData.A00.get("address-line2")) == null) {
            obj14 = "";
        }
        C09530e4 A1L15 = AbstractC166987dD.A1L("address_line2", obj14);
        if (autofillData == null || (obj15 = autofillData.A00.get("address-line3")) == null) {
            obj15 = "";
        }
        C09530e4 A1L16 = AbstractC166987dD.A1L("address_line3", obj15);
        if (autofillData == null || (obj16 = autofillData.A00.get("address-level1")) == null) {
            obj16 = "";
        }
        C09530e4 A1L17 = AbstractC166987dD.A1L("address_level1", obj16);
        if (autofillData == null || (obj17 = autofillData.A00.get("address-level2")) == null) {
            obj17 = "";
        }
        C09530e4 A1L18 = AbstractC166987dD.A1L("address_level2", obj17);
        if (autofillData == null || (obj18 = autofillData.A00.get("address-level3")) == null) {
            obj18 = "";
        }
        C09530e4 A1L19 = AbstractC166987dD.A1L("address_level3", obj18);
        if (autofillData == null || (obj19 = autofillData.A00.get("address-level4")) == null) {
            obj19 = "";
        }
        C09530e4 A1L20 = AbstractC166987dD.A1L("address_level4", obj19);
        if (autofillData == null || (obj20 = autofillData.A00.get("email")) == null) {
            obj20 = "";
        }
        C09530e4 A1L21 = AbstractC166987dD.A1L("email", obj20);
        if (autofillData != null && (obj21 = autofillData.A00.get("ent_id")) != null) {
            obj23 = obj21;
        }
        LinkedHashMap A06 = AbstractC06930Yk.A06(A1L, A1L2, A1L3, A1L4, A1L5, A1L6, A1L7, A1L8, A1L9, A1L10, A1L11, A1L12, A1L13, A1L14, A1L15, A1L16, A1L17, A1L18, A1L19, A1L20, A1L21, AbstractC166987dD.A1L("ent_id", obj23));
        C14360o3.A0C(A06, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, java.lang.Object>");
        return A06;
    }

    public static final AutofillData A00(Map map, boolean z) {
        String str;
        Object obj;
        HashMap A1G = AbstractC166987dD.A1G();
        A1G.put("skip_graphql_save_request_for_bloks", String.valueOf(z));
        Object obj2 = map.get("given_name");
        if (obj2 != null) {
            str = obj2.toString();
        } else {
            str = null;
        }
        A1G.put("given-name", str);
        A1G.put("family-name", A01("family_name", map));
        A1G.put("street-address", A01("street_address", map));
        A1G.put("address-line1", A01("address_line1", map));
        A1G.put("address-line2", A01("address_line2", map));
        A1G.put("address-line3", A01("address_line3", map));
        A1G.put("address-level1", A01("address_level1", map));
        A1G.put("address-level2", A01("address_level2", map));
        A1G.put("address-level3", A01("address_level3", map));
        A1G.put("address-level4", A01("address_level4", map));
        A1G.put("postal-code", A01("postal_code", map));
        A1G.put("tel", A01("tel", map));
        A1G.put("tel-country-code", A01("tel_country_code", map));
        A1G.put("tel-national", A01("tel_national", map));
        A1G.put("tel-area-code", A01("tel_area_code", map));
        A1G.put("tel-local", A01("tel_local", map));
        A1G.put("tel-local-prefix", A01("tel_local_prefix", map));
        A1G.put("tel-local-suffix", A01("tel_local_suffix", map));
        A1G.put("email", A01("email", map));
        A1G.put("ent_id", A01("ent_id", map));
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC16850sd.A0L(A1G.size()));
        Iterator A14 = AbstractC166997dE.A14(A1G);
        while (A14.hasNext()) {
            Map.Entry A1K = AbstractC166987dD.A1K(A14);
            Object key = A1K.getKey();
            CharSequence charSequence = (CharSequence) A1K.getValue();
            if (charSequence != null && !AbstractC001900j.A0T(charSequence)) {
                obj = A1K.getValue();
            } else {
                obj = null;
            }
            A18.put(key, obj);
        }
        return new AutofillData(A18);
    }

    public final LinkedHashMap A03(AutofillData autofillData) {
        Map A02 = A02(autofillData);
        C14360o3.A0C(A02, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        Iterator A15 = AbstractC166997dE.A15(A02);
        while (A15.hasNext()) {
            Map.Entry A1K = AbstractC166987dD.A1K(A15);
            if (((CharSequence) A1K.getValue()).length() > 0) {
                A1I.put(A1K.getKey(), A1K.getValue());
            }
        }
        return A1I;
    }
}
