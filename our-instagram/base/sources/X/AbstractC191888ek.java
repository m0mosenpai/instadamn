package X;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.8ek, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC191888ek {
    public static String A00(Map map, String str, String str2) {
        String str3;
        if (TextUtils.isEmpty(str2)) {
            if (map == null) {
                map = null;
            }
            StringBuilder sb = new StringBuilder();
            if (TextUtils.isEmpty(str)) {
                str = "appId";
            }
            sb.append(str);
            String A00 = AbstractC191898el.A00();
            if (!TextUtils.isEmpty(A00)) {
                sb.append(":");
                sb.append(A00);
            }
            if (map != null) {
                if (map.containsKey("_PRELOAD_ID_KEY_")) {
                    sb.append(":");
                    sb.append((String) map.get("_PRELOAD_ID_KEY_"));
                } else {
                    ArrayList arrayList = new ArrayList(map.keySet());
                    Collections.sort(arrayList);
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        String str4 = (String) map.get(it.next());
                        sb.append(":");
                        if (str4 == null) {
                            str3 = null;
                        } else {
                            char[] charArray = str4.toCharArray();
                            Arrays.sort(charArray);
                            str3 = new String(charArray);
                        }
                        sb.append(str3);
                    }
                }
            }
            str2 = sb.toString();
        }
        return AnonymousClass001.A0R(str2, "d0d0df20f1f4fcc942cd21b5181a6a9f0f554364b0e20671791f50beb40b97bf");
    }
}
