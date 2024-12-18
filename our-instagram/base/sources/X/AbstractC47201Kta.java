package X;

import android.webkit.MimeTypeMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.Kta, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC47201Kta {
    public static final MimeTypeMap A00 = MimeTypeMap.getSingleton();
    public static final Map A01;
    public static final Map A02;

    static {
        HashMap hashMap = new HashMap(2);
        hashMap.put("image/heif", "heif");
        hashMap.put("image/heic", "heic");
        A02 = Collections.unmodifiableMap(hashMap);
        HashMap hashMap2 = new HashMap(2);
        hashMap2.put("heif", "image/heif");
        hashMap2.put("heic", "image/heic");
        A01 = Collections.unmodifiableMap(hashMap2);
    }
}
