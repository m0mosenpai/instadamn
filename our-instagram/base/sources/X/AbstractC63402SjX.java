package X;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.browser.lite.extensions.autofill.model.AutofillData;
import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import kotlin.Deprecated;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Deprecated(message = "")
/* renamed from: X.SjX, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC63402SjX {
    public static final AutofillData A00(JSONObject jSONObject) {
        HashMap A1G = AbstractC166987dD.A1G();
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject("raw_autofill_data");
            Iterator<String> keys = jSONObject2.keys();
            while (keys.hasNext()) {
                String A1B = AbstractC166987dD.A1B(keys);
                A1G.put(A1B, jSONObject2.getJSONArray(A1B).getString(0));
            }
        } catch (JSONException e) {
            android.util.Log.e("AutofillSharedUtil", "Save autofill JSON wrongly formatted", e);
        }
        return new AutofillData(A1G);
    }

    public static final JSONObject A09(AutofillData autofillData) {
        C14360o3.A0B(autofillData, 0);
        JSONObject A0q = AbstractC31171DnF.A0q();
        Iterator A15 = AbstractC166997dE.A15(AbstractC58318PtA.A12(autofillData.A00));
        while (A15.hasNext()) {
            Map.Entry A1K = AbstractC166987dD.A1K(A15);
            String A17 = AbstractC31172DnG.A17(A1K);
            Object value = A1K.getValue();
            JSONArray A0p = AbstractC31171DnF.A0p();
            A0p.put(value);
            try {
                A0q.put(A17, A0p);
            } catch (JSONException unused) {
            }
        }
        JSONObject A0q2 = AbstractC31171DnF.A0q();
        try {
            A0q2.put("raw_autofill_data", A0q);
            A0q2.put("callbackID", "placeholder");
        } catch (JSONException unused2) {
        }
        return A0q2;
    }

    public static final boolean A0F(AutofillData autofillData, AutofillData autofillData2) {
        C14360o3.A0B(autofillData, 0);
        HashMap A10 = AbstractC58318PtA.A10(Collections.unmodifiableMap(autofillData.A00));
        HashMap A102 = AbstractC58318PtA.A10(Collections.unmodifiableMap(autofillData2.A00));
        for (Object obj : Arrays.asList(PublicKeyCredentialControllerUtility.JSON_KEY_ID, "ent_id", "usage_frequency")) {
            A10.remove(obj);
            A102.remove(obj);
        }
        if (A102.size() > A10.size()) {
            return false;
        }
        java.util.Set keySet = A102.keySet();
        if ((keySet instanceof Collection) && keySet.isEmpty()) {
            return true;
        }
        Iterator it = keySet.iterator();
        while (it.hasNext()) {
            if (!A10.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    public static final String A02(java.util.Set set) {
        TreeSet treeSet;
        if (set == null) {
            treeSet = new TreeSet();
        } else {
            treeSet = new TreeSet(set);
        }
        List asList = Arrays.asList(PublicKeyCredentialControllerUtility.JSON_KEY_ID, "ent_id", "usage_frequency");
        C14360o3.A07(asList);
        treeSet.removeAll(asList);
        String join = TextUtils.join(", ", treeSet);
        C14360o3.A07(join);
        return join;
    }

    public static final String A03(JSONObject jSONObject) {
        try {
            JSONArray jSONArray = new JSONArray(jSONObject.getString("autofillFields"));
            ArrayList A1E = AbstractC166987dD.A1E();
            int length = jSONArray.length();
            for (int i = 0; i < length; i = AbstractC58322PtE.A0C(A1E, jSONArray, i)) {
            }
            C01T.A1C(A1E);
            return TextUtils.join(", ", A1E);
        } catch (JSONException e) {
            AbstractC63254SgB.A00("AutofillSharedUtil", "Failed to parseRequestedFields", e, e);
            return null;
        }
    }

    public static final String A04(JSONObject jSONObject) {
        try {
            return jSONObject.getString("selectedAutoCompleteTag");
        } catch (JSONException e) {
            AbstractC63254SgB.A00("AutofillSharedUtil", "Failed to get autofill tag", e, e);
            return null;
        }
    }

    public static final void A0A(Bundle bundle, C5G6 c5g6, SZO szo) {
        ImmutableMap immutableMap;
        if (szo != null) {
            if (c5g6 != null) {
                if (AbstractC31177DnL.A1U(C06090Tz.A06, c5g6.A04.A00, 36322800417974879L)) {
                    C63024Sau c63024Sau = c5g6.A01;
                    String str = szo.A0I;
                    if (!AbstractC002300n.A0f(str, "_V2", false)) {
                        str = AnonymousClass001.A0R(str, "_V2");
                    }
                    String valueOf = String.valueOf(szo.A0H);
                    Map map = szo.A0L;
                    if (map != null) {
                        immutableMap = ImmutableMap.copyOf(map);
                    } else {
                        immutableMap = null;
                    }
                    boolean z = szo.A0P;
                    String str2 = szo.A09;
                    Long valueOf2 = Long.valueOf(szo.A02);
                    String str3 = szo.A0C;
                    String str4 = szo.A0E;
                    C63024Sau.A00(bundle, c63024Sau, new C26061Bfo(Integer.valueOf(szo.A00), Integer.valueOf((int) szo.A03), valueOf2, AbstractC31171DnF.A0V(szo.A01), str2, str3, str4, (String) null, immutableMap, 512, z), str, valueOf);
                    return;
                }
            }
            C63305ShB.A01(bundle, szo.A01());
        }
    }

    public static void A0D(QE9 qe9, C61602RqR c61602RqR) {
        c61602RqR.A0C = A02(A08(Collections.unmodifiableMap(qe9.A08.A00), Collections.unmodifiableMap(qe9.A07.A00)));
        c61602RqR.A09 = A02(A07(Collections.unmodifiableMap(qe9.A08.A00), Collections.unmodifiableMap(qe9.A07.A00)));
    }

    public static void A0E(QE9 qe9, C61602RqR c61602RqR, String str) {
        c61602RqR.A0G = str;
        c61602RqR.A06 = A02(qe9.A09.A04());
        c61602RqR.A0F = A02(qe9.A09.A04());
    }

    public static final String A01(List list) {
        StringBuilder A1C = AbstractC166987dD.A1C();
        if (list != null && !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                A1C.append(A02(AbstractC58320PtC.A1C(it.next())));
                A1C.append(";");
            }
        }
        return AbstractC166987dD.A19(A1C);
    }

    public static final ArrayList A05(List list) {
        ArrayList A1E = AbstractC166987dD.A1E();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                try {
                    A1E.add(new AutofillData(AbstractC58318PtA.A17(AbstractC166987dD.A1B(it))));
                } catch (JSONException e) {
                    android.util.Log.e("AutofillSharedUtil", "Wrong JSON format for autofill", e);
                }
            }
        }
        return A1E;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003e, code lost:
    
        if (r3.remove("first_form_interaction_time") == null) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.HashMap A06(android.os.Bundle r4, X.SZO r5) {
        /*
            java.util.HashMap r3 = X.AbstractC166987dD.A1G()
            if (r5 == 0) goto L18
            X.SZO.A00(r5, r3)
            java.lang.Long r0 = r5.A04
            if (r0 == 0) goto L18
            java.lang.String r1 = r0.toString()
            if (r1 == 0) goto L18
            java.lang.String r0 = "first_form_interaction_time"
            r3.put(r0, r1)
        L18:
            r1 = 1
            if (r4 == 0) goto L48
            java.lang.String r0 = "Tracking.ENABLED"
            boolean r0 = r4.getBoolean(r0, r1)
        L21:
            r0 = r0 ^ 1
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "is_messaging_thread"
            r3.put(r0, r1)
            java.lang.String r1 = "first_form_interaction_time"
            java.lang.Object r0 = r3.get(r1)
            java.lang.String r2 = "user_interaction_time"
            if (r0 == 0) goto L40
            r3.put(r2, r0)
            java.lang.Object r0 = r3.remove(r1)
            if (r0 != 0) goto L47
        L40:
            long r0 = java.lang.System.currentTimeMillis()
            X.AbstractC58318PtA.A1R(r2, r3, r0)
        L47:
            return r3
        L48:
            r0 = 1
            goto L21
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC63402SjX.A06(android.os.Bundle, X.SZO):java.util.HashMap");
    }

    public static final HashSet A07(Map map, Map map2) {
        String str;
        AbstractC167017dG.A1N(map, map2);
        HashSet A1H = AbstractC166987dD.A1H();
        Iterator A15 = AbstractC166997dE.A15(map);
        while (A15.hasNext()) {
            Map.Entry A1K = AbstractC166987dD.A1K(A15);
            Object key = A1K.getKey();
            String A0p = AbstractC58318PtA.A0p(A1K);
            if (A0p != null && AbstractC25228BEl.A1A(A0p).length() > 0) {
                if (map2.get(key) != null) {
                    String A1A = AbstractC166987dD.A1A(key, map2);
                    if (A1A != null) {
                        str = AbstractC25228BEl.A1A(A1A);
                    } else {
                        str = null;
                    }
                    if (!C14360o3.A0K(str, AbstractC25228BEl.A1A(A0p))) {
                    }
                }
                A1H.add(key);
            }
        }
        return A1H;
    }

    public static final HashSet A08(Map map, Map map2) {
        CharSequence charSequence;
        boolean A1a = AbstractC167017dG.A1a(map, map2);
        HashSet A1H = AbstractC166987dD.A1H();
        Iterator A15 = AbstractC166997dE.A15(map2);
        while (A15.hasNext()) {
            Map.Entry A1K = AbstractC166987dD.A1K(A15);
            Object key = A1K.getKey();
            String A0p = AbstractC58318PtA.A0p(A1K);
            if (A0p != null) {
                int length = A0p.length() - (A1a ? 1 : 0);
                int i = 0;
                boolean z = false;
                while (i <= length) {
                    int i2 = length;
                    if (!z) {
                        i2 = i;
                    }
                    boolean A19 = AbstractC167027dH.A19(A0p, i2);
                    if (!z) {
                        if (!A19) {
                            z = true;
                        } else {
                            i++;
                        }
                    } else {
                        if (!A19) {
                            break;
                        }
                        length--;
                    }
                }
                if (AbstractC31177DnL.A0g(A0p, length, i).length() != 0 && (charSequence = (CharSequence) map.get(key)) != null && charSequence.length() != 0) {
                    A1H.add(key);
                }
            }
        }
        return A1H;
    }

    public static void A0B(C5G6 c5g6, C58883QEt c58883QEt, C61602RqR c61602RqR) {
        A0A(c58883QEt.A03(), c5g6, c61602RqR.A00());
    }

    public static void A0C(C5G6 c5g6, C63380Siu c63380Siu, C61602RqR c61602RqR) {
        A0A(c63380Siu.A03.A03(), c5g6, c61602RqR.A00());
    }
}
