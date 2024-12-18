package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.7hO, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public class C169487hO implements InterfaceC169497hP {
    public final Map A00 = Collections.synchronizedMap(new HashMap());

    @Override // X.InterfaceC169497hP
    public final void AA3(UQE uqe, String str, List list) {
        AA5(uqe.A01, null, list);
    }

    @Override // X.InterfaceC169497hP
    public final void AA5(String str, String str2, List list) {
        C14360o3.A0B(str, 0);
        C14360o3.A0B(list, 1);
        AA4(new C9JQ(C05F.A0C, null, null, null, null, null, list, null, false, false, true), str);
    }

    @Override // X.InterfaceC169497hP
    public final void AA1(UQE uqe, C9JQ c9jq) {
        AA4(c9jq, uqe.A01);
    }

    @Override // X.InterfaceC169497hP
    public final void AA4(C9JQ c9jq, String str) {
        List list;
        C9JQ c9jq2 = c9jq;
        C14360o3.A0B(str, 0);
        Map map = this.A00;
        C14360o3.A06(map);
        synchronized (map) {
            C9JQ c9jq3 = (C9JQ) map.get(str);
            if (c9jq3 != null && (list = c9jq3.A06) != null) {
                ArrayList arrayList = new ArrayList(list);
                List list2 = c9jq2.A06;
                if (list2 != null) {
                    arrayList.addAll(list2);
                    c9jq2 = new C9JQ(C05F.A0C, c9jq2.A00, c9jq2.A02, c9jq2.A03, c9jq2.A04, c9jq2.A05, arrayList, c9jq2.A07, c9jq2.A08, false, true);
                } else {
                    throw new IllegalArgumentException("Required value was null.");
                }
            }
            map.put(str, c9jq2);
        }
    }

    @Override // X.InterfaceC169497hP
    public final C9JQ BjO(UQE uqe) {
        return BjP(uqe.A01);
    }

    @Override // X.InterfaceC169497hP
    public final C9JQ BjP(String str) {
        if (!(this instanceof C221259pp)) {
            C14360o3.A0B(str, 0);
            C9JQ c9jq = (C9JQ) this.A00.get(str);
            if (c9jq != null) {
                return c9jq;
            }
        }
        return AbstractC208189Jc.A00();
    }

    @Override // X.InterfaceC169497hP
    public final void clear() {
        this.A00.clear();
    }
}
