package X;

import android.os.Build;
import android.util.LruCache;
import java.util.Iterator;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.29h, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC459729h {
    public static volatile boolean A00;

    public static String A00(android.net.Uri uri, String str, String str2, boolean z, boolean z2) {
        StringBuilder sb = new StringBuilder();
        if (uri != null && "127.0.0.1".equals(uri.getHost())) {
            uri = android.net.Uri.parse(uri.getQueryParameter("remote-uri"));
        }
        if (str2 != null) {
            sb.append(str2);
        }
        if (z && !z2) {
            sb.append("_t");
        }
        sb.append(".");
        sb.append(str);
        sb.append(".");
        sb.append(uri.getLastPathSegment());
        return sb.toString();
    }

    public static void A01(String str, String str2, Object... objArr) {
        if (A00) {
            android.util.Log.w(str, String.format(str2, objArr));
        } else {
            String.format(str2, objArr);
        }
    }

    public static void A03(String str, AtomicReference atomicReference) {
        LruCache lruCache = (LruCache) atomicReference.get();
        A01("Util", "Trying to resize cache for %s: old=%d, new=%d, SDK=%d", str, Integer.valueOf(lruCache.maxSize()), 10, Integer.valueOf(Build.VERSION.SDK_INT));
        if (lruCache.maxSize() != 10) {
            A01("Util", "Resizing cache for %s: old=%d, new=%d, %d existing items", str, Integer.valueOf(lruCache.maxSize()), 10, Integer.valueOf(lruCache.size()));
            lruCache.resize(10);
        }
    }

    public static void A02(String str, String str2, Object... objArr) {
        android.util.Log.w(str, String.format(str2, objArr));
    }

    public static boolean A04(TreeMap treeMap, int i, long j, long j2) {
        Long valueOf = Long.valueOf(j);
        Object floorKey = treeMap.floorKey(valueOf);
        if (floorKey != null && ((Number) treeMap.get(floorKey)).intValue() >= i) {
            return true;
        }
        Iterator it = treeMap.subMap(valueOf, false, Long.valueOf(j2), true).values().iterator();
        while (it.hasNext()) {
            if (((Number) it.next()).intValue() >= i) {
                return true;
            }
        }
        return false;
    }
}
