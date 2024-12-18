package X;

import android.util.Base64;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.61s, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1336361s {
    /* JADX WARN: Type inference failed for: r0v15, types: [X.KiM, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8, types: [X.KiL, java.lang.Object] */
    public static final L9N A00(byte[] bArr) {
        byte[] decode;
        try {
            JSONArray jSONArray = new JSONObject(new String(bArr, C15W.A05)).getJSONArray("entries");
            ArrayList arrayList = new ArrayList();
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                C14360o3.A0A(jSONObject);
                C14360o3.A0B(jSONObject, 0);
                String string = jSONObject.getString("userId");
                JSONArray jSONArray2 = jSONObject.getJSONArray("features");
                ArrayList arrayList2 = new ArrayList();
                int length2 = jSONArray2.length();
                for (int i2 = 0; i2 < length2; i2++) {
                    JSONObject jSONObject2 = jSONArray2.getJSONObject(i2);
                    C14360o3.A07(jSONObject2);
                    String string2 = jSONObject2.getString("feature");
                    if (jSONObject2.has("backupData")) {
                        JSONArray jSONArray3 = jSONObject2.getJSONArray("backupData");
                        decode = new byte[jSONArray3.length()];
                        int length3 = jSONArray3.length();
                        for (int i3 = 0; i3 < length3; i3++) {
                            Object obj = jSONArray3.get(i3);
                            C14360o3.A0C(obj, "null cannot be cast to non-null type kotlin.Int");
                            decode[i3] = (byte) ((Integer) obj).intValue();
                        }
                    } else {
                        decode = Base64.decode(jSONObject2.getString("bd"), 0);
                    }
                    C14360o3.A0A(string2);
                    C14360o3.A0B(string2, 1);
                    C14360o3.A0B(decode, 2);
                    ?? obj2 = new Object();
                    obj2.A00 = string2;
                    obj2.A01 = decode;
                    arrayList2.add(obj2);
                }
                C14360o3.A0A(string);
                C14360o3.A0B(string, 1);
                ?? obj3 = new Object();
                obj3.A00 = string;
                obj3.A01 = arrayList2;
                arrayList.add(obj3);
            }
            return new L9N(arrayList);
        } catch (Exception unused) {
            return null;
        }
    }

    public static final byte[] A01(L9N l9n) {
        try {
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            for (C46521KiL c46521KiL : l9n.A00) {
                JSONObject jSONObject2 = new JSONObject();
                JSONArray jSONArray2 = new JSONArray();
                for (C46522KiM c46522KiM : c46521KiL.A01) {
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("feature", c46522KiM.A00);
                    jSONObject3.put("bd", Base64.encodeToString(c46522KiM.A01, 2));
                    jSONArray2.put(jSONObject3);
                }
                jSONObject2.put("userId", c46521KiL.A00);
                jSONObject2.put("features", jSONArray2);
                jSONArray.put(jSONObject2);
            }
            jSONObject.put("entries", jSONArray);
            String obj = jSONObject.toString();
            C14360o3.A07(obj);
            byte[] bytes = obj.getBytes(C15W.A05);
            C14360o3.A07(bytes);
            return bytes;
        } catch (Exception unused) {
            return null;
        }
    }
}
