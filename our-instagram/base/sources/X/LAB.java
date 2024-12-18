package X;

import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes8.dex */
public final class LAB {
    public final L8o A00;
    public final boolean A05;
    public final boolean A06;
    public final L7J A03 = new L7J();
    public final L6z A02 = new L6z();
    public final java.util.Set A04 = AbstractC31171DnF.A0l();
    public final LJA A01 = new LJA();

    public final void A01(Exception exc, List list) {
        C14360o3.A0B(list, 0);
        Iterator it = AbstractC06950Ym.A1F(this.A03.A00(list)).iterator();
        while (it.hasNext()) {
            String A1B = AbstractC166987dD.A1B(it);
            this.A02.A00(A1B);
            LJA lja = this.A01;
            lja.A05(A1B, "persist_failure_reason", exc.getMessage());
            lja.A07(A1B, (short) 3);
            L8o l8o = this.A00;
            l8o.A00(A1B, null, 7054, 1);
            l8o.A01(A1B, false);
        }
    }

    public final void A03(List list) {
        ArrayList A00;
        boolean containsKey;
        Integer valueOf;
        String str;
        C14360o3.A0B(list, 0);
        L7J l7j = this.A03;
        synchronized (l7j) {
            A00 = l7j.A00(list);
            int size = list.size();
            for (int i = 0; i < size; i++) {
                java.util.Set set = (java.util.Set) AbstractC001800i.A0O(A00, i);
                if (set != null) {
                    Iterator it = set.iterator();
                    while (it.hasNext()) {
                        String A1B = AbstractC166987dD.A1B(it);
                        Map map = l7j.A02;
                        AtomicInteger atomicInteger = (AtomicInteger) map.get(A1B);
                        String str2 = null;
                        if (atomicInteger != null && (valueOf = Integer.valueOf(atomicInteger.decrementAndGet())) != null && valueOf.intValue() == 0) {
                            Map map2 = l7j.A01;
                            C09530e4 c09530e4 = (C09530e4) AbstractC001800i.A0O(list, i);
                            if (c09530e4 != null) {
                                str = (String) c09530e4.A00;
                            } else {
                                str = null;
                            }
                            C15500q5.A04(map2).remove(str);
                            Map map3 = l7j.A00;
                            C09530e4 c09530e42 = (C09530e4) AbstractC001800i.A0O(list, i);
                            if (c09530e42 != null) {
                                str2 = (String) c09530e42.A01;
                            }
                            C15500q5.A04(map3).remove(str2);
                            map.remove(A1B);
                        }
                    }
                }
            }
        }
        Iterator it2 = AbstractC06950Ym.A1F(A00).iterator();
        while (it2.hasNext()) {
            String A1B2 = AbstractC166987dD.A1B(it2);
            this.A02.A00(A1B2);
            LJA lja = this.A01;
            lja.A03(A1B2, "persist_end");
            synchronized (l7j) {
                C14360o3.A0B(A1B2, 0);
                containsKey = l7j.A02.containsKey(A1B2);
            }
            if (!containsKey) {
                lja.A07(A1B2, (short) 2);
            }
            L8o l8o = this.A00;
            l8o.A00(A1B2, null, 7054, 0);
            l8o.A01(A1B2, true);
        }
    }

    public final void A04(List list) {
        C14360o3.A0B(list, 0);
        Iterator it = AbstractC06950Ym.A1F(this.A03.A00(list)).iterator();
        while (it.hasNext()) {
            this.A01.A03(AbstractC166987dD.A1B(it), "persist_start");
        }
    }

    public final CompletableFuture A00() {
        CompletableFuture completableFuture;
        L6z l6z = this.A02;
        synchronized (l6z) {
            if (l6z.A01.isEmpty()) {
                completableFuture = CompletableFuture.completedFuture(C0eB.A00);
                C14360o3.A07(completableFuture);
            } else {
                completableFuture = l6z.A00;
                if (completableFuture == null) {
                    completableFuture = new CompletableFuture();
                    l6z.A00 = completableFuture;
                }
            }
        }
        return completableFuture;
    }

    public final void A02(Long l, String str, String str2, boolean z) {
        String str3;
        LJA lja;
        if (str2.equals(DialogModule.KEY_MESSAGE)) {
            L6z l6z = this.A02;
            synchronized (l6z) {
                l6z.A01.add(str);
            }
        }
        if (z) {
            str3 = "receive";
        } else {
            str3 = "send";
        }
        boolean z2 = this.A06;
        boolean z3 = true;
        if (z2 && z) {
            lja = this.A01;
            lja.A03(str, "dispatch_start");
            lja.A05(str, "direction", str3);
            lja.A05(str, "payload_type", str2);
        } else {
            lja = this.A01;
            lja.A02(str);
            lja.A03(str, "dispatch_start");
            lja.A05(str, "message_otid", str);
            lja.A05(str, "direction", str3);
            lja.A05(str, "payload_type", str2);
            lja.A06(str, "is_background_account", !this.A05);
        }
        lja.A06(str, "mem_message_received_logging_enabled", z2);
        if (l == null || l.longValue() < 0 || !z) {
            z3 = false;
        }
        lja.A06(str, "is_offline_message", z3);
    }

    public LAB(UserSession userSession) {
        this.A00 = AbstractC47002KqL.A00(userSession);
        this.A05 = AbstractC94034Kn.A00(userSession);
        this.A06 = C18U.A06(C06090Tz.A05, userSession, 36326154787567315L);
    }
}
