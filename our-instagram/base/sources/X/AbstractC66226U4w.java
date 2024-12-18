package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.U4w, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC66226U4w {
    public static final Map A00;
    public static final Map A01;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("auto", 0);
        hashMap.put("yes", 1);
        hashMap.put("no", 2);
        hashMap.put("no_hide_descendants", 4);
        A00 = Collections.unmodifiableMap(hashMap);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(NetInfoModule.CONNECTION_TYPE_NONE, 0);
        hashMap2.put("polite", 1);
        hashMap2.put("assertive", 2);
        A01 = Collections.unmodifiableMap(hashMap2);
    }
}
