package X;

import android.content.SharedPreferences;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.browser.lite.extensions.autofill.model.AutofillData;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.instagram.common.session.UserSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;

/* renamed from: X.20J, reason: invalid class name */
/* loaded from: classes.dex */
public final class C20J {
    public static boolean A00 = true;
    public static SharedPreferences A01;
    public static SharedPreferences A02;
    public static UserSession A03;
    public static final C20J A04 = new Object();

    public static final SharedPreferences A00() {
        SharedPreferences sharedPreferences = A01;
        if (sharedPreferences != null) {
            return sharedPreferences;
        }
        C14360o3.A0F("store");
        throw C00O.createAndThrow();
    }

    public static final AutofillData A01(AutofillData autofillData) {
        Map map = autofillData.A00;
        String str = (String) Collections.unmodifiableMap(map).get(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
        SharedPreferences.Editor edit = A00().edit();
        if (str == null) {
            C14360o3.A07(A00().getAll());
            if (!r0.isEmpty()) {
                edit.clear();
            }
            Map unmodifiableMap = Collections.unmodifiableMap(map);
            C14360o3.A07(unmodifiableMap);
            LinkedHashMap linkedHashMap = new LinkedHashMap(unmodifiableMap);
            str = UUID.randomUUID().toString();
            linkedHashMap.put(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str);
            autofillData = new AutofillData(linkedHashMap);
        }
        edit.putString(str, autofillData.A01().toString()).apply();
        return autofillData;
    }

    public static final ArrayList A02() {
        ArrayList arrayList = new ArrayList();
        Iterator<Map.Entry<String, ?>> it = A00().getAll().entrySet().iterator();
        while (it.hasNext()) {
            Object value = it.next().getValue();
            C14360o3.A0C(value, "null cannot be cast to non-null type kotlin.String");
            arrayList.add(value);
        }
        return arrayList;
    }

    public static final void A03(AutofillData autofillData) {
        String str;
        Map unmodifiableMap = Collections.unmodifiableMap(autofillData.A00);
        if (unmodifiableMap != null && (str = (String) unmodifiableMap.get(PublicKeyCredentialControllerUtility.JSON_KEY_ID)) != null) {
            A00().edit().putString(str, autofillData.A01().toString()).apply();
        }
    }

    public final void A04(AutofillData autofillData) {
        AutofillData A012 = A01(autofillData);
        Boolean valueOf = Boolean.valueOf((String) autofillData.A00.get("skip_graphql_save_request_for_bloks"));
        C14360o3.A07(valueOf);
        if (!valueOf.booleanValue()) {
            UserSession userSession = A03;
            if (userSession != null) {
                try {
                    C04060Jx c04060Jx = GraphQlCallInput.A02;
                    C0CA A022 = c04060Jx.A02();
                    C0CA.A00(A022, "", "sensitive_string_value");
                    C0CA A023 = c04060Jx.A02();
                    A023.A0E(A022, "access_token");
                    Map unmodifiableMap = Collections.unmodifiableMap(A012.A00);
                    C14360o3.A07(unmodifiableMap);
                    Object obj = unmodifiableMap.get("given-name");
                    C0CA A024 = c04060Jx.A02();
                    C0CA.A00(A024, obj, "given_name");
                    C0CA.A00(A024, unmodifiableMap.get("family-name"), "family_name");
                    C0CA.A00(A024, unmodifiableMap.get("address-line1"), "address_line1");
                    C0CA.A00(A024, unmodifiableMap.get("address-line2"), "address_line2");
                    C0CA.A00(A024, unmodifiableMap.get("address-level1"), "address_level1");
                    C0CA.A00(A024, unmodifiableMap.get("address-level2"), "address_level2");
                    C0CA.A00(A024, unmodifiableMap.get("postal-code"), "postal_code");
                    C0CA.A00(A024, unmodifiableMap.get("country-name"), "country_name");
                    C0CA.A00(A024, unmodifiableMap.get("country"), "country");
                    C0CA.A00(A024, unmodifiableMap.get("email"), "email");
                    C0CA.A00(A024, unmodifiableMap.get("tel"), "tel");
                    A023.A0E(A024, "data");
                    C2JM c2jm = new C2JM();
                    c2jm.A00.A02().A0E(A023, "request");
                    Sg3.A02(Sg3.A00(new C907442n(c2jm, C211599Yt.class, "IABAutofillSaveData", true), userSession));
                    return;
                } catch (IOException e) {
                    C0w9.A06("AutofillGraphQLRequest", "Error creating save autofill request", e);
                    return;
                }
            }
            C14360o3.A0F("userSession");
            throw C00O.createAndThrow();
        }
    }
}
