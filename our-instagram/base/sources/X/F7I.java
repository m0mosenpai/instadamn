package X;

import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public abstract class F7I {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3, types: [org.json.JSONArray] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v6, types: [org.json.JSONArray] */
    public static final C32023E5b A00(String str, String str2, String str3, String str4, String str5, String str6, String str7, List list, List list2) {
        Object obj;
        Object obj2;
        C14360o3.A0B(str, 0);
        JSONObject A0q = AbstractC31171DnF.A0q();
        String A00 = MSV.A00(83);
        try {
            if (str5 == null) {
                A0q.put(A00, JSONObject.NULL);
            } else {
                A0q.put(A00, str5);
            }
        } catch (JSONException unused) {
        }
        try {
            if (str6 == null) {
                A0q.put("search_engine", JSONObject.NULL);
            } else {
                A0q.put("search_engine", str6);
            }
        } catch (JSONException unused2) {
        }
        try {
            if (str4 == null) {
                A0q.put("search_query", JSONObject.NULL);
            } else {
                A0q.put("search_query", str4);
            }
        } catch (JSONException unused3) {
        }
        String A002 = AbstractC43591JPw.A00(95);
        try {
            if (list != null) {
                obj2 = AbstractC31171DnF.A0p();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    AbstractC31172DnG.A1W(it, obj2);
                }
            } else {
                obj2 = JSONObject.NULL;
            }
            A0q.put(A002, obj2);
        } catch (JSONException unused4) {
        }
        String A003 = AbstractC43591JPw.A00(94);
        try {
            if (list2 != null) {
                obj = AbstractC31171DnF.A0p();
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    AbstractC31172DnG.A1W(it2, obj);
                }
            } else {
                obj = JSONObject.NULL;
            }
            A0q.put(A003, obj);
        } catch (JSONException unused5) {
        }
        C32023E5b c32023E5b = new C32023E5b();
        c32023E5b.A00("bot_request_id", str3);
        c32023E5b.A00("bot_response_id", str2);
        c32023E5b.A00("text", str);
        c32023E5b.A00("followup_prompt_text", str7);
        try {
            c32023E5b.A00.put("external_search_params", A0q);
        } catch (JSONException unused6) {
        }
        return c32023E5b;
    }
}
