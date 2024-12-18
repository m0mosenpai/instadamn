package X;

import com.facebook.proxygen.TraceFieldType;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.VMv, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC68335VMv {
    public static final void A00(XC1 xc1, Exception exc, String str, Map map, long j) {
        C14360o3.A0B(map, 2);
        HashMap hashMap = new HashMap();
        Iterator A15 = AbstractC166997dE.A15(map);
        while (A15.hasNext()) {
            Map.Entry entry = (Map.Entry) A15.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null) {
                hashMap.put(key, value);
            }
        }
        if (exc != null) {
            hashMap.put("error", exc.toString());
            String stackTraceString = android.util.Log.getStackTraceString(exc);
            C14360o3.A0A(stackTraceString);
            hashMap.put(TraceFieldType.Error, stackTraceString);
        }
        if (j >= 0) {
            String valueOf = String.valueOf(j);
            hashMap.put("elapsed_time", valueOf);
            hashMap.put("dt", valueOf);
        }
        xc1.logEvent(str, hashMap);
    }
}
