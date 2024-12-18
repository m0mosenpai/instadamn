package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementSerializer;
import kotlinx.serialization.json.JsonObject;

/* renamed from: X.W4d, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70106W4d {
    public static final XA1 A07 = new C70576WdA();
    public static final XA2 A08 = new C70578WdD();
    public final String A00;
    public final Map A01;
    public final Map A02;
    public final Map A03;
    public final Map A04;
    public final java.util.Set A05;
    public final JsonObject A06;

    public final XA2 A00(String str, String str2) {
        XA2 c70582WdH;
        int i;
        AbstractC167007dF.A1K(str, str2);
        if (AbstractC002300n.A0h(str2, "@REGEX", false)) {
            int length = str2.length();
            int i2 = 0;
            while (true) {
                i = -1;
                if (i2 < length) {
                    if (str2.charAt(i2) == '(') {
                        break;
                    }
                    i2++;
                } else {
                    i2 = -1;
                    break;
                }
            }
            int i3 = i2 + 1;
            int i4 = length - 1;
            if (i4 >= 0) {
                while (true) {
                    int i5 = i4 - 1;
                    if (str2.charAt(i4) == ')') {
                        i = i4;
                        break;
                    }
                    if (i5 < 0) {
                        break;
                    }
                    i4 = i5;
                }
            }
            return new C70581WdG(str, AbstractC25227BEk.A0w(str2, i3, i));
        }
        if (AbstractC002300n.A0h(str2, "@NONNULL", false)) {
            c70582WdH = new C70579WdE(str);
        } else {
            c70582WdH = new C70582WdH(str, str2);
        }
        return c70582WdH;
    }

    public C70106W4d(String str) {
        JsonObject jsonObject;
        JsonArray jsonArray;
        Map A0E;
        Map A0E2;
        String A00;
        JsonElement jsonElement;
        java.util.Set<Map.Entry<String, JsonElement>> entrySet;
        java.util.Set<Map.Entry<String, JsonElement>> entrySet2;
        String A002;
        java.util.Set<Map.Entry<String, JsonElement>> entrySet3;
        List<JsonElement> A1J;
        JsonElement jsonElement2;
        String A003;
        try {
            jsonObject = AbstractC100754fe.A03((JsonElement) AbstractC73763Sg.A03.A00(str, JsonElementSerializer.A00));
        } catch (AnonymousClass403 | IllegalArgumentException unused) {
            jsonObject = new JsonObject(AbstractC06930Yk.A0E());
        }
        this.A06 = jsonObject;
        this.A03 = new LinkedHashMap();
        this.A01 = new LinkedHashMap();
        this.A02 = new LinkedHashMap();
        this.A04 = new LinkedHashMap();
        this.A05 = new LinkedHashSet();
        JsonElement jsonElement3 = (JsonElement) jsonObject.get("version");
        this.A00 = (jsonElement3 == null || (A003 = AbstractC100754fe.A06(jsonElement3).A00()) == null) ? "unknown" : A003;
        JsonElement jsonElement4 = (JsonElement) jsonObject.get("events");
        if (jsonElement4 != null) {
            jsonArray = AbstractC100754fe.A02(jsonElement4);
        } else {
            jsonArray = new JsonArray(C16930sl.A00);
        }
        Iterator it = jsonArray.iterator();
        while (it.hasNext()) {
            JsonElement jsonElement5 = (JsonElement) it.next();
            JsonObject A03 = AbstractC100754fe.A03(jsonElement5);
            JsonElement jsonElement6 = (JsonElement) A03.get(PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
            if (jsonElement6 != null && (A002 = AbstractC100754fe.A06(jsonElement6).A00()) != null) {
                A0E = new LinkedHashMap();
                JsonElement jsonElement7 = (JsonElement) A03.get("two_measurement_info");
                if (jsonElement7 != null && (entrySet3 = AbstractC100754fe.A03(jsonElement7).entrySet()) != null) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC50522MSa.A09(entrySet3));
                    for (Map.Entry<String, JsonElement> entry : entrySet3) {
                        linkedHashMap.put(entry.getKey(), AbstractC100754fe.A06(entry.getValue()).A00());
                    }
                    java.util.Set<Map.Entry> entrySet4 = linkedHashMap.entrySet();
                    if (entrySet4 != null) {
                        for (Map.Entry entry2 : entrySet4) {
                            String str2 = (String) entry2.getKey();
                            String str3 = (String) entry2.getValue();
                            C14360o3.A0B(str2, 1);
                            JsonElement jsonElement8 = (JsonElement) A03.get("two_measurement_categorization");
                            if (jsonElement8 != null && (jsonElement2 = (JsonElement) AbstractC100754fe.A03(jsonElement8).get(str2)) != null) {
                                A1J = AbstractC001800i.A0a(AbstractC100754fe.A02(jsonElement2));
                            } else {
                                A1J = AbstractC166987dD.A1J(new JsonObject(AbstractC06930Yk.A0E()));
                            }
                            C70582WdH c70582WdH = new C70582WdH(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, A002);
                            for (JsonElement jsonElement9 : A1J) {
                                Map map = this.A03;
                                String A0j = AnonymousClass001.A0j(A002, str2, str3, ':', ':');
                                Object obj = map.get(A0j);
                                int intValue = ((Number) (obj == null ? 0 : obj)).intValue();
                                C14360o3.A0B(A0j, 0);
                                String A0G = AnonymousClass001.A0G(A0j, ':', intValue);
                                AbstractC37301Gc2.A1T(A0j, map, intValue + 1);
                                C70580WdF c70580WdF = new C70580WdF();
                                List list = c70580WdF.A00;
                                list.add(c70582WdH);
                                C14360o3.A0B(jsonElement9, 0);
                                for (Map.Entry<String, JsonElement> entry3 : AbstractC100754fe.A03(jsonElement9).entrySet()) {
                                    list.add(A00(entry3.getKey(), AbstractC100754fe.A06(entry3.getValue()).A00()));
                                }
                                A0E.put(A0G, c70580WdF);
                            }
                        }
                    }
                }
            } else {
                A0E = AbstractC06930Yk.A0E();
            }
            this.A01.putAll(A0E);
            JsonObject A032 = AbstractC100754fe.A03(jsonElement5);
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            JsonElement jsonElement10 = (JsonElement) A032.get("two_measurement_matching");
            if (jsonElement10 != null && (entrySet2 = AbstractC100754fe.A03(jsonElement10).entrySet()) != null) {
                LinkedHashMap linkedHashMap3 = new LinkedHashMap(AbstractC167017dG.A01(AbstractC06950Ym.A1E(entrySet2, 10)));
                for (Map.Entry<String, JsonElement> entry4 : entrySet2) {
                    JsonObject A033 = AbstractC100754fe.A03(entry4.getValue());
                    String key = entry4.getKey();
                    java.util.Set<Map.Entry<String, JsonElement>> entrySet5 = A033.entrySet();
                    ArrayList A0i = AbstractC167007dF.A0i(entrySet5);
                    for (Map.Entry<String, JsonElement> entry5 : entrySet5) {
                        AbstractC166997dE.A1R(entry5.getKey(), AbstractC100754fe.A06(entry5.getValue()).A00(), A0i);
                    }
                    linkedHashMap3.put(key, AbstractC001800i.A0a(A0i));
                }
                java.util.Set<Map.Entry> entrySet6 = linkedHashMap3.entrySet();
                if (entrySet6 != null) {
                    for (Map.Entry entry6 : entrySet6) {
                        Object key2 = entry6.getKey();
                        List<C09530e4> list2 = (List) entry6.getValue();
                        C70577WdB c70577WdB = new C70577WdB();
                        for (C09530e4 c09530e4 : list2) {
                            c70577WdB.A00.add(new WdC((String) c09530e4.A00, (String) c09530e4.A01));
                        }
                        linkedHashMap2.put(key2, c70577WdB);
                    }
                }
            }
            this.A02.putAll(linkedHashMap2);
            JsonObject A034 = AbstractC100754fe.A03(jsonElement5);
            JsonElement jsonElement11 = (JsonElement) A034.get(PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
            if (jsonElement11 != null && (A00 = AbstractC100754fe.A06(jsonElement11).A00()) != null && (jsonElement = (JsonElement) A034.get("validation_rule")) != null && (entrySet = AbstractC100754fe.A03(jsonElement).entrySet()) != null) {
                A0E2 = new LinkedHashMap(AbstractC50522MSa.A09(entrySet));
                for (Map.Entry<String, JsonElement> entry7 : entrySet) {
                    JsonObject A035 = AbstractC100754fe.A03(entry7.getValue());
                    String A0j2 = AnonymousClass001.A0j(A00, entry7.getKey(), "", ':', ':');
                    C70580WdF c70580WdF2 = new C70580WdF();
                    for (Map.Entry<String, JsonElement> entry8 : A035.entrySet()) {
                        c70580WdF2.A00.add(A00(entry8.getKey(), AbstractC100754fe.A06(entry8.getValue()).A00()));
                    }
                    A0E2.put(A0j2, c70580WdF2);
                }
            } else {
                A0E2 = AbstractC06930Yk.A0E();
            }
            this.A04.putAll(A0E2);
        }
        Iterator A15 = AbstractC166997dE.A15(this.A01);
        while (A15.hasNext()) {
            String str4 = (String) MSZ.A0m(A15);
            C14360o3.A0B(str4, 0);
            this.A05.add(AbstractC001900j.A0Q(str4, new char[]{':'}, 0).get(0));
        }
    }
}
