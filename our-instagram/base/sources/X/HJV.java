package X;

import com.instagram.common.session.UserSession;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* loaded from: classes7.dex */
public final class HJV extends AbstractRunnableC14200nk {
    public final /* synthetic */ C37730Gj5 A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HJV(C37730Gj5 c37730Gj5, UserSession userSession, String str, String str2, String str3) {
        super(1829080448, 5, true, false);
        this.A00 = c37730Gj5;
        this.A04 = str;
        this.A02 = str2;
        this.A01 = userSession;
        this.A03 = str3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C37730Gj5 c37730Gj5 = this.A00;
        String str = this.A04;
        String str2 = this.A02;
        UserSession userSession = this.A01;
        String str3 = this.A03;
        long currentTimeMillis = System.currentTimeMillis();
        long j = c37730Gj5.A05.getLong("LAST_OPENED_EFFECT_PAGE_TIMESTAMP_KEY", -1L);
        if (j != -1 && TimeUnit.MILLISECONDS.toHours(AbstractC37300Gc1.A00(j)) <= 24) {
            Map map = c37730Gj5.A00;
            if (currentTimeMillis - AbstractC25232BEp.A0t(AbstractC37300Gc1.A0Q(str2, map)) > C42194Img.A04) {
                Map map2 = c37730Gj5.A01;
                if (map2.containsKey(str)) {
                    if (!"loop_playback_25_percent".equals(str)) {
                        Map map3 = c37730Gj5.A02;
                        java.util.Set set = (java.util.Set) map3.get(str2);
                        if (set == null) {
                            set = AbstractC166987dD.A1H();
                            map3.put(str2, set);
                        }
                        if (!set.contains(str)) {
                            set.add(str);
                        } else {
                            return;
                        }
                    }
                    int A0K = AbstractC167017dG.A0K(AbstractC37300Gc1.A0Q(str, map2));
                    Map map4 = c37730Gj5.A03;
                    AbstractC37301Gc2.A1T(str2, map4, AbstractC25227BEk.A06(AbstractC37300Gc1.A0Q(str2, map4), 0) + A0K);
                    if (map4.containsKey(str2)) {
                        int A0K2 = AbstractC167017dG.A0K(AbstractC37300Gc1.A0Q(str2, map4));
                        boolean z = C23051Ak.A05;
                        int i = 80;
                        if (!C23061Al.A00(c37730Gj5.A04).A00(EnumC23071Am.A0A)) {
                            i = 24;
                        }
                        if (A0K2 >= i) {
                            new C42194Img(str2, 100, false).AQ9(null, userSession, str3, null, false, false);
                            map.put(str2, Long.valueOf(currentTimeMillis));
                        }
                    }
                }
            }
        }
    }
}
