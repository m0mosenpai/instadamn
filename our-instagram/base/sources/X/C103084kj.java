package X;

import android.util.JsonWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.4kj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C103084kj implements InterfaceC103074ki {
    public static String A00(Object obj, boolean z, boolean z2) {
        if (!(obj instanceof List) && !(obj instanceof Map)) {
            if (obj == null) {
                return "";
            }
            return String.valueOf(obj);
        }
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        try {
            A03(jsonWriter, obj, z, z2);
            jsonWriter.close();
            return stringWriter.toString();
        } catch (IOException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Exception in serialization ");
            sb.append(e);
            return sb.toString();
        }
    }

    public static HashMap A02(JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj = jSONObject.get(next);
            if (!(obj instanceof String)) {
                if (obj instanceof JSONObject) {
                    obj = A02((JSONObject) obj);
                } else if (obj instanceof JSONArray) {
                    obj = A01((JSONArray) obj);
                } else if (!(obj instanceof Integer)) {
                    if (obj instanceof Double) {
                        obj = C6DZ.A00(((Number) obj).doubleValue());
                    } else if (obj instanceof Float) {
                        obj = C6DZ.A00(((Number) obj).floatValue());
                    } else if (obj instanceof Boolean) {
                        hashMap.put(next, obj);
                    } else if (obj instanceof Long) {
                    }
                }
            }
            hashMap.put(next, obj);
        }
        return hashMap;
    }

    public static void A03(JsonWriter jsonWriter, Object obj, boolean z, boolean z2) {
        String valueOf;
        long j;
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        if (obj instanceof Number) {
            jsonWriter.value((Number) obj);
            return;
        }
        if (obj instanceof Boolean) {
            boolean booleanValue = ((Boolean) obj).booleanValue();
            if (z2) {
                if (booleanValue) {
                    j = 1;
                } else {
                    j = 0;
                }
                jsonWriter.value(j);
                return;
            }
            jsonWriter.value(booleanValue);
            return;
        }
        if (obj instanceof String) {
            valueOf = (String) obj;
        } else {
            if (obj instanceof Map) {
                jsonWriter.beginObject();
                if (z) {
                    TreeMap treeMap = new TreeMap();
                    for (Map.Entry entry : ((Map) obj).entrySet()) {
                        treeMap.put(String.valueOf(entry.getKey()), entry.getValue());
                    }
                    for (Map.Entry entry2 : treeMap.entrySet()) {
                        jsonWriter.name((String) entry2.getKey());
                        A03(jsonWriter, entry2.getValue(), z, z2);
                    }
                } else {
                    for (Map.Entry entry3 : ((Map) obj).entrySet()) {
                        jsonWriter.name(String.valueOf(entry3.getKey()));
                        A03(jsonWriter, entry3.getValue(), z, z2);
                    }
                }
                jsonWriter.endObject();
                return;
            }
            if (obj instanceof List) {
                jsonWriter.beginArray();
                Iterator it = ((List) obj).iterator();
                while (it.hasNext()) {
                    A03(jsonWriter, it.next(), z, z2);
                }
                jsonWriter.endArray();
                return;
            }
            valueOf = String.valueOf(obj);
        }
        jsonWriter.value(valueOf);
    }

    public static ArrayList A01(JSONArray jSONArray) {
        int length = jSONArray.length();
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            Object obj = jSONArray.get(i);
            if (!(obj instanceof String)) {
                if (obj instanceof JSONObject) {
                    obj = A02((JSONObject) obj);
                } else if (obj instanceof JSONArray) {
                    obj = A01((JSONArray) obj);
                } else if (!(obj instanceof Integer)) {
                    if (obj instanceof Double) {
                        obj = C6DZ.A00(((Number) obj).doubleValue());
                    } else if (obj instanceof Float) {
                        obj = C6DZ.A00(((Number) obj).floatValue());
                    } else {
                        if (obj instanceof Boolean) {
                            arrayList.add(obj);
                        } else if (!(obj instanceof Long)) {
                        }
                    }
                }
            }
            arrayList.add(obj);
        }
        return arrayList;
    }

    @Override // X.InterfaceC103074ki
    public final Object AT6(C6FQ c6fq, C6FW c6fw, String str) {
        char c = 65535;
        switch (str.hashCode()) {
            case -863899808:
                if (str.equals("bk.action.string.JsonDecode")) {
                    c = 0;
                    break;
                }
                break;
            case -826958968:
                if (str.equals("bk.action.string.JsonEncode")) {
                    c = 1;
                    break;
                }
                break;
            case -138615772:
                if (str.equals("bk.action.string.JsonEncodeV2")) {
                    c = 2;
                    break;
                }
                break;
            case -138615771:
                if (str.equals("bk.action.string.JsonEncodeV3")) {
                    c = 3;
                    break;
                }
                break;
            case 1509306073:
                if (str.equals("bk.action.string.JsonDecodeArray")) {
                    c = 4;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                try {
                    return A02(new JSONObject((String) c6fw.A03(0)));
                } catch (JSONException e) {
                    throw new IllegalArgumentException("Trying to decode malformed json", e);
                }
            case 1:
                return A00(c6fw.A00.get(0), false, true);
            case 2:
                List list = c6fw.A00;
                return A00(list.get(0), C6DZ.A01(list.get(1)), true);
            case 3:
                List list2 = c6fw.A00;
                return A00(list2.get(0), C6DZ.A01(list2.get(1)), false);
            case 4:
                try {
                    return A01(new JSONArray((String) c6fw.A03(0)));
                } catch (JSONException e2) {
                    throw new IllegalArgumentException("Trying to decode malformed json", e2);
                }
            default:
                throw new RuntimeException(AnonymousClass001.A0R("Unknown lispy action type: ", str));
        }
    }
}
