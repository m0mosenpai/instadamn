package X;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: X.643, reason: invalid class name */
/* loaded from: classes3.dex */
public final class AnonymousClass643 {
    public final Map A00 = Collections.synchronizedMap(new WeakHashMap());
    public final Map A01 = Collections.synchronizedMap(new WeakHashMap());

    public static final void A00(Status status, AnonymousClass643 anonymousClass643, boolean z) {
        HashMap hashMap;
        HashMap hashMap2;
        Map map = anonymousClass643.A00;
        synchronized (map) {
            hashMap = new HashMap(map);
        }
        Map map2 = anonymousClass643.A01;
        synchronized (map2) {
            hashMap2 = new HashMap(map2);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            if (z || ((Boolean) entry.getValue()).booleanValue()) {
                ((BasePendingResult) entry.getKey()).A08(status);
            }
        }
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            if (z || ((Boolean) entry2.getValue()).booleanValue()) {
                ((C58411Pup) entry2.getKey()).A02(new Rk3(status));
            }
        }
    }
}
