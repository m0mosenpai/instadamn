package X;

import android.util.LruCache;
import com.instagram.common.session.UserSession;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: X.1IB, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C1IB {
    public final C1ID A00;
    public final Map A01;
    public final java.util.Set A02 = new LinkedHashSet();
    public final UserSession A03;

    public final boolean A03(String str, long j, boolean z) {
        Long l;
        Boolean bool;
        LruCache lruCache = this.A00.A00;
        C1IH c1ih = (C1IH) lruCache.get(str);
        if (c1ih != null) {
            l = Long.valueOf(c1ih.A00);
        } else {
            l = null;
        }
        if (l == null) {
            return false;
        }
        long longValue = l.longValue();
        C1IH c1ih2 = (C1IH) lruCache.get(str);
        if (c1ih2 == null) {
            return false;
        }
        long j2 = c1ih2.A01;
        if (Long.valueOf(j2) == null) {
            return false;
        }
        C1IH c1ih3 = (C1IH) lruCache.get(str);
        if (c1ih3 != null) {
            bool = Boolean.valueOf(c1ih3.A03);
        } else {
            bool = null;
        }
        if (z && bool != null && bool.booleanValue()) {
            return false;
        }
        if (j != -1 && System.currentTimeMillis() - longValue > TimeUnit.SECONDS.toMillis(j)) {
            return false;
        }
        Number number = (Number) this.A01.get(str);
        if (number != null) {
            long longValue2 = number.longValue();
            if (longValue2 != -1 && System.currentTimeMillis() - j2 > TimeUnit.SECONDS.toMillis(longValue2)) {
                return false;
            }
        }
        return true;
    }

    public abstract EnumC23071Am A04();

    public final boolean A02() {
        boolean z = C23051Ak.A05;
        return !C23061Al.A00(this.A03).A00(A04());
    }

    public C1IB(UserSession userSession) {
        this.A03 = userSession;
        this.A00 = C1IC.A00(userSession);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("clips_discover_prefetch", Long.valueOf(C18U.A01(C06090Tz.A05, userSession, 36609626921441211L)));
        this.A01 = linkedHashMap;
    }
}
