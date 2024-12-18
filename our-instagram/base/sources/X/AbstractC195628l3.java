package X;

import java.util.Calendar;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.8l3, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC195628l3 {
    public static final ConcurrentHashMap A00 = new ConcurrentHashMap();

    public static final Calendar A00() {
        Object putIfAbsent;
        long id = Thread.currentThread().getId();
        ConcurrentHashMap concurrentHashMap = A00;
        Long valueOf = Long.valueOf(id);
        Object obj = concurrentHashMap.get(valueOf);
        if (obj == null && (putIfAbsent = concurrentHashMap.putIfAbsent(valueOf, (obj = Calendar.getInstance()))) != null) {
            obj = putIfAbsent;
        }
        C14360o3.A09(obj);
        return (Calendar) obj;
    }
}
