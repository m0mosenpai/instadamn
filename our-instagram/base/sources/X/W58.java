package X;

import com.instagram.common.session.UserSession;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes11.dex */
public final class W58 {
    public final ConcurrentMap A00;
    public final UserSession A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;

    public W58(UserSession userSession, String str, String str2, String str3, String str4) {
        AbstractC167007dF.A1G(userSession, 1, str4);
        this.A01 = userSession;
        this.A03 = str;
        this.A04 = str2;
        this.A02 = str3;
        this.A05 = str4;
        this.A00 = new ConcurrentHashMap();
    }

    public static final void A00(W58 w58, String str, int i) {
        ConcurrentMap concurrentMap = w58.A00;
        Integer valueOf = Integer.valueOf(i);
        U1D u1d = new U1D(w58.A01, 32318480);
        u1d.A00 = System.currentTimeMillis();
        u1d.A01(str, null);
        u1d.A00("search_session_id", w58.A03);
        u1d.A00("serp_session_id", w58.A04);
        u1d.A00("tab_type", w58.A05);
        u1d.A03.put("page_count", valueOf);
        concurrentMap.put(valueOf, u1d);
    }

    public final void A01() {
        ConcurrentMap concurrentMap = this.A00;
        for (Object obj : AbstractC001800i.A0a(concurrentMap.keySet())) {
            C14360o3.A0A(obj);
            U1D u1d = (U1D) concurrentMap.get(obj);
            if (u1d != null) {
                u1d.A01("SERP_EXIT_NAVIGATION", null);
                u1d.A02((short) 4);
            }
            concurrentMap.remove(obj);
        }
    }

    public final void A02(int i) {
        ConcurrentMap concurrentMap = this.A00;
        Integer valueOf = Integer.valueOf(i);
        U1D u1d = (U1D) concurrentMap.get(valueOf);
        if (u1d != null) {
            u1d.A01("SERP_RESULTS_DISPLAYED", null);
            u1d.A02((short) 2);
        }
        concurrentMap.remove(valueOf);
    }
}
