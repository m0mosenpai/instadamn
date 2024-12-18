package X;

import java.util.List;
import java.util.Locale;
import java.util.Map;

/* renamed from: X.4J9, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C4J9 {
    public static long A00(Map map, boolean z) {
        String str;
        if (map != null) {
            List A01 = A01("Content-Range", map, z);
            if (A01 != null && !A01.isEmpty()) {
                String str2 = (String) A01.get(0);
                str = str2.substring(str2.lastIndexOf(47) + 1).trim();
            } else {
                List A012 = A01("Content-Length", map, z);
                if (A012 != null && !A012.isEmpty()) {
                    str = (String) A012.get(0);
                } else {
                    return -1L;
                }
            }
            return Long.parseLong(str);
        }
        return -1L;
    }

    public static void A02(C4C7 c4c7) {
        StringBuilder sb = new StringBuilder();
        sb.append("video_uid=");
        sb.append(C0HM.A00());
        String obj = sb.toString();
        if (obj != null) {
            c4c7.A07.A0Q.put("x-fb-qpl-ec", obj);
        }
    }

    public static List A01(String str, Map map, boolean z) {
        if (!map.containsKey(str)) {
            if (z) {
                Locale locale = Locale.US;
                if (map.containsKey(str.toLowerCase(locale))) {
                    str = str.toLowerCase(locale);
                } else {
                    return null;
                }
            } else {
                return null;
            }
        }
        return (List) map.get(str);
    }
}
