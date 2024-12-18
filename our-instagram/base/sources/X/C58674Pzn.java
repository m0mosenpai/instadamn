package X;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.TimeUnit;

/* renamed from: X.Pzn, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58674Pzn {
    public static final C58674Pzn A00 = new Object();
    public static final char[] A01 = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static final boolean A03(long j, long j2, long j3) {
        long millis = TimeUnit.SECONDS.toMillis(j2);
        return j >= 0 && millis > 0 && j + millis > j3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0037, code lost:
    
        if (r5 == null) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String A00(X.C63E r6, java.lang.String r7, java.util.Map r8) {
        /*
            if (r6 == 0) goto L13
            java.util.Map r0 = r6.A00
            java.lang.Object r0 = r0.get(r7)
            if (r0 != 0) goto L12
            X.63F r0 = r6.A00(r7)
            if (r0 == 0) goto L13
            java.lang.String r7 = r0.A01
        L12:
            return r7
        L13:
            java.lang.String r6 = "d0d0df20f1f4fcc942cd21b5181a6a9f0f554364b0e20671791f50beb40b97bf"
            X.0do r0 = X.AbstractC58684Pzx.A00
            java.lang.Object r1 = r0.getValue()
            X.13y r1 = (X.InterfaceC217213y) r1
            if (r1 == 0) goto L39
            X.13x r1 = (X.C217113x) r1
            java.util.concurrent.atomic.AtomicReference r0 = r1.A01
            java.lang.Object r0 = r0.get()
            java.util.Locale r0 = (java.util.Locale) r0
            if (r0 != 0) goto L33
            java.util.Locale r0 = r1.AcP()
            java.util.Locale r0 = r1.C4D(r0)
        L33:
            java.lang.String r5 = X.AbstractC27081Th.A01(r0)
            if (r5 != 0) goto L3b
        L39:
            java.lang.String r5 = ""
        L3b:
            java.lang.String r4 = X.AbstractC191898el.A00()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r7)
            java.lang.String r2 = ":"
            r3.append(r2)
            X.Pzn r1 = X.C58674Pzn.A00
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1.A02(r0, r8)
            java.lang.String r0 = r0.toString()
            X.C14360o3.A07(r0)
            r3.append(r0)
            r3.append(r2)
            r3.append(r6)
            r3.append(r2)
            r3.append(r5)
            int r0 = r4.length()
            if (r0 <= 0) goto L78
            r3.append(r2)
            r3.append(r4)
        L78:
            java.lang.String r2 = r3.toString()
            X.C14360o3.A07(r2)
            java.lang.String r0 = "SHA-1"
            java.security.MessageDigest r1 = java.security.MessageDigest.getInstance(r0)
            X.C14360o3.A07(r1)
            java.nio.charset.Charset r0 = X.C15W.A05
            byte[] r0 = r2.getBytes(r0)
            X.C14360o3.A07(r0)
            r1.update(r0)
            byte[] r7 = r1.digest()
            X.C14360o3.A07(r7)
            r0 = 40
            char[] r6 = new char[r0]
            int r5 = r7.length
            r4 = 0
        La1:
            if (r4 >= r5) goto Lbc
            r0 = r7[r4]
            r3 = r0 & 255(0xff, float:3.57E-43)
            int r1 = r4 * 2
            char[] r2 = X.C58674Pzn.A01
            int r0 = r3 >>> 4
            char r0 = r2[r0]
            r6[r1] = r0
            int r1 = r1 + 1
            r0 = r3 & 15
            char r0 = r2[r0]
            r6[r1] = r0
            int r4 = r4 + 1
            goto La1
        Lbc:
            java.lang.String r7 = new java.lang.String
            r7.<init>(r6)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58674Pzn.A00(X.63E, java.lang.String, java.util.Map):java.lang.String");
    }

    public static final String A01(C63E c63e, String str, Map map, Map map2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map2.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (map.containsKey(value)) {
                linkedHashMap.put(key, map.get(value));
            }
        }
        return A00(c63e, str, linkedHashMap);
    }

    private final void A02(StringBuilder sb, Object obj) {
        if (obj != null) {
            if (!(obj instanceof Boolean) && !(obj instanceof Number) && !(obj instanceof String) && !(obj instanceof Enum)) {
                if (obj instanceof List) {
                    Iterator it = AbstractC001800i.A0a((Iterable) obj).iterator();
                    while (it.hasNext()) {
                        A00.A02(sb, it.next());
                    }
                    return;
                }
                if (obj instanceof Map) {
                    Map map = (Map) obj;
                    C14360o3.A0B(map, 0);
                    for (Map.Entry entry : new TreeMap(map).entrySet()) {
                        C58674Pzn c58674Pzn = A00;
                        c58674Pzn.A02(sb, entry.getKey());
                        c58674Pzn.A02(sb, entry.getValue());
                    }
                    return;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Unexpected object value type ");
                sb2.append(obj.getClass());
                throw new IllegalArgumentException(sb2.toString());
            }
            sb.append(obj);
        }
    }

    public static final boolean A04(EnumC58683Pzw enumC58683Pzw, long j, long j2, long j3) {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        long millis = timeUnit.toMillis(j2);
        if (!A03(j, j2, j3)) {
            if (enumC58683Pzw == EnumC58683Pzw.A04 && millis == 0 && j3 - j < timeUnit.toMillis(5L)) {
                return true;
            }
            return false;
        }
        return true;
    }
}
