package X;

import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.KsU, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC47135KsU {
    public static final Map A00;

    static {
        String property = System.getProperty("http.agent");
        if (!TextUtils.isEmpty(property)) {
            int length = property.length();
            StringBuilder sb = new StringBuilder(length);
            for (int i = 0; i < length; i++) {
                char charAt = property.charAt(i);
                if (charAt <= 31) {
                    if (charAt == '\t') {
                        sb.append(charAt);
                    }
                    charAt = '?';
                    sb.append(charAt);
                } else {
                    if (charAt < 127) {
                        sb.append(charAt);
                    }
                    charAt = '?';
                    sb.append(charAt);
                }
            }
            property = sb.toString();
        }
        HashMap hashMap = new HashMap(2);
        if (!TextUtils.isEmpty(property)) {
            hashMap.put("User-Agent", Collections.singletonList(new L9K(property)));
        }
        A00 = Collections.unmodifiableMap(hashMap);
    }
}
