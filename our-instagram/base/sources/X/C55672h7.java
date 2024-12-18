package X;

import com.instagram.common.session.UserSession;
import com.instagram.quickpromotion.intf.QuickPromotionSlot;
import com.instagram.quickpromotion.intf.QuickPromotionSurface;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* renamed from: X.2h7, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C55672h7 {
    public final C55662h6 A00(UserSession userSession, C55602h0 c55602h0) {
        C14360o3.A0B(userSession, 1);
        if (c55602h0 != null) {
            try {
                TimeUnit timeUnit = TimeUnit.SECONDS;
                Long valueOf = Long.valueOf(timeUnit.toMillis(c55602h0.A00));
                long j = C55662h6.A03;
                if (valueOf != null) {
                    j = valueOf.longValue();
                }
                List<C55632h3> list = c55602h0.A04;
                HashMap hashMap = new HashMap();
                for (C55632h3 c55632h3 : list) {
                    QuickPromotionSurface quickPromotionSurface = (QuickPromotionSurface) QuickPromotionSurface.A02.get(Integer.valueOf(c55632h3.A00));
                    if (quickPromotionSurface != null) {
                        hashMap.put(quickPromotionSurface, Long.valueOf(timeUnit.toMillis(c55632h3.A01)));
                    }
                }
                List<C55652h5> list2 = c55602h0.A03;
                HashMap hashMap2 = new HashMap();
                HashMap hashMap3 = new HashMap();
                for (QuickPromotionSlot quickPromotionSlot : QuickPromotionSlot.values()) {
                    String lowerCase = quickPromotionSlot.name().toLowerCase(Locale.ROOT);
                    C14360o3.A07(lowerCase);
                    hashMap3.put(lowerCase, quickPromotionSlot);
                }
                for (C55652h5 c55652h5 : list2) {
                    Object obj = hashMap3.get(c55652h5.A01);
                    if (obj != null) {
                        hashMap2.put(obj, Long.valueOf(timeUnit.toMillis(c55652h5.A00)));
                    }
                }
                return new C55662h6(hashMap2, hashMap, j);
            } catch (Exception e) {
                AbstractC31546DtW.A00(userSession, C05F.A0N, "generateCooldownRules(): Failed parsing cooldown rules", e);
                return new C55662h6();
            }
        }
        return new C55662h6();
    }
}
