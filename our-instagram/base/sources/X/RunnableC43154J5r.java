package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: X.J5r, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class RunnableC43154J5r implements Runnable {
    public final /* synthetic */ C61842rl A00;
    public final /* synthetic */ Integer A01;
    public final /* synthetic */ List A02;
    public final /* synthetic */ List A03;

    public RunnableC43154J5r(C61842rl c61842rl, Integer num, List list, List list2) {
        this.A03 = list;
        this.A02 = list2;
        this.A01 = num;
        this.A00 = c61842rl;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        C674432j c674432j;
        boolean z;
        Long l;
        C1EN c1en;
        boolean z2;
        String str;
        C1ES c1es;
        String str2;
        C17590tu c17590tu;
        String str3;
        String str4;
        Map map;
        Map map2;
        String str5;
        int i;
        String str6;
        boolean z3;
        C1ET c1et;
        Long l2;
        boolean z4;
        Long l3;
        List list = this.A03;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            C74283Vj c74283Vj = (C74283Vj) list.get(i2);
            C1I1 c1i1 = (C1I1) this.A02.get(i2);
            if (c74283Vj != null && c1i1 != null) {
                if (i2 == 0 && this.A01 != C05F.A15) {
                    z = true;
                    C1EU c1eu = c1i1.A00;
                    l = null;
                    c1en = C1EN.A0I;
                    z2 = false;
                    str = c1eu.A0A;
                    c1es = c1eu.A05;
                    str2 = c1eu.A08;
                    c17590tu = c1eu.A03;
                    str3 = c1eu.A0C;
                    str4 = c1eu.A0B;
                    map = c1eu.A0E;
                    map2 = c1eu.A0D;
                    str5 = c1eu.A09;
                    i = c1eu.A01;
                    str6 = c1eu.A07;
                    z3 = c1eu.A00;
                    c1et = c1eu.A02;
                    l2 = c1eu.A06;
                    z4 = c1eu.A0F;
                    C14360o3.A0B(str, 0);
                } else {
                    z = false;
                    C1EU c1eu2 = c1i1.A00;
                    l = null;
                    c1en = C1EN.A0H;
                    z2 = false;
                    str = c1eu2.A0A;
                    c1es = c1eu2.A05;
                    str2 = c1eu2.A08;
                    c17590tu = c1eu2.A03;
                    str3 = c1eu2.A0C;
                    str4 = c1eu2.A0B;
                    map = c1eu2.A0E;
                    map2 = c1eu2.A0D;
                    str5 = c1eu2.A09;
                    i = c1eu2.A01;
                    str6 = c1eu2.A07;
                    z3 = c1eu2.A00;
                    c1et = c1eu2.A02;
                    l2 = c1eu2.A06;
                    z4 = c1eu2.A0F;
                    C14360o3.A0B(str, 0);
                }
                C14360o3.A0B(c1es, 2);
                AbstractC25233BEq.A0y(7, map, map2, str5);
                C1EU c1eu3 = new C1EU(c1et, c17590tu, c1en, c1es, l2, str, str2, str3, str4, str5, str6, map, map2, i, z3, z4);
                C61842rl c61842rl = this.A00;
                c61842rl.A0b.A05(c1i1, l, "DEFERRED", "delivery_controller", l, l);
                if (this.A01 == C05F.A15) {
                    UserSession userSession = c61842rl.A0Q;
                    if (((int) IB7.A00(userSession).longValue()) == 2 || ((int) IB7.A00(userSession).longValue()) == 4) {
                        List A00 = c74283Vj.A00();
                        ArrayList A1E = AbstractC166987dD.A1E();
                        int i3 = 0;
                        for (Object obj : A00) {
                            int i4 = i3 + 1;
                            if (i3 < 0) {
                                AbstractC16960so.A1U();
                                throw C00O.createAndThrow();
                            }
                            C3XG c3xg = (C3XG) obj;
                            if (i3 > 1 || !C3YW.A01(c3xg)) {
                                A1E.add(obj);
                            }
                            i3 = i4;
                        }
                        if (!A1E.isEmpty()) {
                            c74283Vj.A01(A1E);
                        }
                    }
                } else if (!z && !C14360o3.A0K(c1i1.A00.A0A, c61842rl.A0k.getSessionId())) {
                }
                C61842rl.A03(c1eu3, c74283Vj, EnumC73363Qm.A05, c61842rl, Integer.valueOf(i2), z, z2, true);
                C61922rt c61922rt = c61842rl.A0e;
                long currentTimeMillis = System.currentTimeMillis();
                if (z) {
                    c61922rt.A07 = new C77413dR(c61922rt.A0K, currentTimeMillis);
                } else {
                    C77413dR c77413dR = c61922rt.A07;
                    if (c77413dR != null) {
                        c77413dR.A00 = currentTimeMillis;
                    }
                }
                C61932ru c61932ru = c61922rt.A0T;
                long j = c74283Vj.A00;
                if (z) {
                    l3 = Long.valueOf(currentTimeMillis);
                } else {
                    l3 = null;
                }
                c61932ru.A00 = j;
                if (l3 != null) {
                    c61932ru.A01 = l3;
                }
                if (i2 == 0) {
                    try {
                        C60662pp c60662pp = c61842rl.A0m;
                        c60662pp.A0X(z2, z2);
                        c60662pp.A0O(c1i1.A00.A04, c1i1.A00.A09, true);
                    } catch (Exception e) {
                        C0K8.A05(C61842rl.class, "Exception in loadDeferredFeed ", e);
                    }
                }
            }
        }
        C61842rl c61842rl2 = this.A00;
        c61842rl2.A0h.A00();
        UserSession userSession2 = c61842rl2.A0Q;
        if ((((int) IB7.A00(userSession2).longValue()) == 3 || ((int) IB7.A00(userSession2).longValue()) == 4) && (c674432j = c61842rl2.A0G) != null) {
            c674432j.A04 = true;
            c674432j.A00 = 0;
        }
    }
}
