package X;

import com.google.gson.Gson;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.Sfy, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC63244Sfy {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.AbstractMap, java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.AbstractCollection, java.util.ArrayList] */
    public static Object A00(Object obj, Map map, boolean z) {
        Object A1G;
        if (obj != null && !(obj instanceof Byte) && !(obj instanceof Character) && !(obj instanceof Double) && !(obj instanceof Float) && !(obj instanceof Integer) && !(obj instanceof Long) && !(obj instanceof Short) && !(obj instanceof Boolean) && !(obj instanceof String)) {
            if (obj instanceof Collection) {
                A1G = AbstractC166987dD.A1E();
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    A1G.add(A00(it.next(), map, z));
                }
            } else if (obj instanceof Map) {
                A1G = AbstractC166987dD.A1G();
                Iterator A15 = AbstractC166997dE.A15((Map) obj);
                while (A15.hasNext()) {
                    Map.Entry A1K = AbstractC166987dD.A1K(A15);
                    A1G.put(A1K.getKey(), A00(A1K.getValue(), map, z));
                }
            } else {
                if (obj instanceof SEA) {
                    return processPttBloksPayload((SEA) obj, map, z);
                }
                Class<?> cls = obj.getClass();
                HashMap A1G2 = AbstractC166987dD.A1G();
                for (Field field : cls.getDeclaredFields()) {
                    processFieldPayload(field, obj, A1G2, map, z);
                }
                return A1G2;
            }
            return A1G;
        }
        return obj;
    }

    public static C3AY createPayloads(Object obj) {
        byte[] bytes;
        byte[] bArr;
        obj.getClass();
        C58579Pxx c58579Pxx = new C58579Pxx();
        c58579Pxx.A05 = false;
        Gson A00 = c58579Pxx.A00();
        HashMap A1G = AbstractC166987dD.A1G();
        String A0B = A00.A0B(A00(obj, A1G, false));
        if (!A1G.isEmpty()) {
            String A0B2 = A00.A0B(A1G);
            bytes = A0B.getBytes(Charset.defaultCharset());
            bArr = A0B2.getBytes(Charset.defaultCharset());
        } else {
            bytes = A0B.getBytes(Charset.defaultCharset());
            bArr = null;
        }
        return new C3AY(bytes, bArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0032, code lost:
    
        if (android.text.TextUtils.isEmpty(r1) == false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void processFieldPayload(java.lang.reflect.Field r4, java.lang.Object r5, java.util.Map r6, java.util.Map r7, boolean r8) {
        /*
            int r0 = r4.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isStatic(r0)
            if (r0 != 0) goto L5f
            boolean r0 = r4.isSynthetic()
            if (r0 != 0) goto L5f
            r2 = 1
            r4.setAccessible(r2)
            java.lang.Object r3 = r4.get(r5)
            if (r3 == 0) goto L5f
            java.lang.Class<com.fbpay.ptt.interfaces.SerializedName> r1 = com.fbpay.ptt.interfaces.SerializedName.class
            boolean r0 = r4.isAnnotationPresent(r1)
            if (r0 == 0) goto L65
            java.lang.annotation.Annotation r0 = r4.getAnnotation(r1)
            com.fbpay.ptt.interfaces.SerializedName r0 = (com.fbpay.ptt.interfaces.SerializedName) r0
            if (r0 == 0) goto L65
            java.lang.String r1 = r0.value()
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L65
        L34:
            if (r8 != 0) goto L60
            java.lang.Class<com.fbpay.ptt.interfaces.Sensitive> r0 = com.fbpay.ptt.interfaces.Sensitive.class
            boolean r0 = r4.isAnnotationPresent(r0)
            if (r0 == 0) goto L60
            java.lang.String r0 = "csc"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 == 0) goto L53
            boolean r0 = r3 instanceof java.lang.String
            if (r0 == 0) goto L53
            r0 = r3
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L60
        L53:
            java.lang.Object r0 = A00(r3, r7, r2)
            r7.put(r1, r0)
            java.lang.String r0 = "$e2ee"
        L5c:
            r6.put(r1, r0)
        L5f:
            return
        L60:
            java.lang.Object r0 = A00(r3, r7, r8)
            goto L5c
        L65:
            java.lang.String r1 = r4.getName()
            goto L34
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC63244Sfy.processFieldPayload(java.lang.reflect.Field, java.lang.Object, java.util.Map, java.util.Map, boolean):void");
    }

    public static Map processPttBloksPayload(SEA sea, Map map, boolean z) {
        HashMap A1G = AbstractC166987dD.A1G();
        Map unmodifiableMap = Collections.unmodifiableMap(sea.A00);
        Iterator A15 = AbstractC166997dE.A15(unmodifiableMap);
        while (A15.hasNext()) {
            Map.Entry A1K = AbstractC166987dD.A1K(A15);
            A1G.put(A1K.getKey(), A00(A1K.getValue(), map, z));
        }
        for (Object obj : Collections.unmodifiableSet(sea.A01)) {
            if (unmodifiableMap.containsKey(obj)) {
                map.put(obj, A00(unmodifiableMap.get(obj), map, true));
                A1G.put(obj, "$e2ee");
            }
        }
        return A1G;
    }
}
