package X;

import com.instagram.common.session.UserSession;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: X.TxQ, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C65973TxQ {
    public final ConcurrentMap A00;
    public final UserSession A01;

    public C65973TxQ(UserSession userSession) {
        C14360o3.A0B(userSession, 2);
        this.A01 = userSession;
        this.A00 = new ConcurrentHashMap();
    }

    public final void A03(String str) {
        C14360o3.A0B(str, 0);
        U1D u1d = (U1D) this.A00.get(str);
        if (u1d != null) {
            u1d.A01("SEARCH_QUERY_REQUEST_COMPLETE", "query_fail");
        }
    }

    public final void A04(String str, String str2, int i, int i2, boolean z) {
        C14360o3.A0B(str, 0);
        A00(this, str, str2, i, i2, z);
        A02(this, str, "SEARCH_QUERY_RESULTS_DISPLAYED", (short) 2);
    }

    public static final void A00(C65973TxQ c65973TxQ, String str, String str2, int i, int i2, boolean z) {
        U1D u1d = (U1D) c65973TxQ.A00.get(str);
        if (u1d != null) {
            u1d.A00("rank_token", str2);
            Boolean valueOf = Boolean.valueOf(z);
            ConcurrentMap concurrentMap = u1d.A03;
            concurrentMap.put("is_query_previously_cached", valueOf);
            AbstractC37301Gc2.A1T("fetched_results_count", concurrentMap, i);
            AbstractC37301Gc2.A1T("displayed_results_count", concurrentMap, i2);
        }
    }

    public static final void A01(C65973TxQ c65973TxQ, String str, String str2, String str3, String str4, int i, boolean z) {
        ConcurrentMap concurrentMap = c65973TxQ.A00;
        if (!concurrentMap.containsKey(str)) {
            U1D u1d = new U1D(c65973TxQ.A01, 32309250);
            u1d.A00 = System.currentTimeMillis();
            u1d.A01(str2, null);
            u1d.A00("search_session_id", str3);
            u1d.A00("tab_type", str4);
            Boolean valueOf = Boolean.valueOf(z);
            ConcurrentMap concurrentMap2 = u1d.A03;
            concurrentMap2.put("is_null_state", valueOf);
            AbstractC37301Gc2.A1T("page_count", concurrentMap2, i);
            concurrentMap.put(str, u1d);
        }
    }

    public static final void A02(C65973TxQ c65973TxQ, String str, String str2, short s) {
        ConcurrentMap concurrentMap = c65973TxQ.A00;
        U1D u1d = (U1D) concurrentMap.get(str);
        if (u1d != null) {
            u1d.A01(str2, null);
            u1d.A02(s);
            concurrentMap.remove(str);
        }
    }
}
