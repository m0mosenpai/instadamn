package X;

import com.instagram.realtimeclient.GraphQLSubscriptionID;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.9Jd, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C208199Jd implements InterfaceC169497hP {
    public final Map A00 = new ConcurrentHashMap(AbstractC166987dD.A1G());

    @Override // X.InterfaceC169497hP
    public final void AA3(UQE uqe, String str, List list) {
        AA1(uqe, new C9JQ(C05F.A0C, null, null, null, null, null, list, null, false, false, true));
    }

    @Override // X.InterfaceC169497hP
    public final void AA4(C9JQ c9jq, String str) {
        C14360o3.A0B(str, 0);
        A00(c9jq, str, GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT);
    }

    @Override // X.InterfaceC169497hP
    public final void AA5(String str, String str2, List list) {
        AA4(new C9JQ(C05F.A0C, null, null, null, null, null, list, null, false, false, AbstractC167007dF.A1R(0, str, list)), str);
    }

    @Override // X.InterfaceC169497hP
    public final C9JQ BjP(String str) {
        String str2;
        String str3;
        Object obj;
        String str4;
        List list;
        boolean z;
        boolean z2;
        boolean z3;
        Iterable iterable;
        C14360o3.A0B(str, 0);
        Map map = (Map) this.A00.get(str);
        if (map != null) {
            if (map.get(GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT) != null) {
                C9JQ c9jq = (C9JQ) map.get(GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT);
                if (c9jq != null) {
                    return c9jq;
                }
            } else {
                C9JQ c9jq2 = (C9JQ) map.get(AbstractC001800i.A09(map.keySet()));
                Integer num = C05F.A0C;
                Collection<C9JQ> values = map.values();
                ArrayList A1E = AbstractC166987dD.A1E();
                for (C9JQ c9jq3 : values) {
                    if (c9jq3 == null || (iterable = c9jq3.A06) == null) {
                        iterable = C16930sl.A00;
                    }
                    AnonymousClass016.A16(iterable, A1E);
                }
                Integer num2 = null;
                if (c9jq2 != null) {
                    str2 = c9jq2.A03;
                    str3 = c9jq2.A04;
                    obj = c9jq2.A02;
                    str4 = c9jq2.A05;
                    list = c9jq2.A07;
                    num2 = c9jq2.A00;
                    z = c9jq2.A08;
                    z2 = c9jq2.A09;
                    z3 = c9jq2.A0A;
                } else {
                    str2 = null;
                    str3 = null;
                    obj = null;
                    str4 = null;
                    list = null;
                    z = false;
                    z2 = false;
                    z3 = true;
                }
                return new C9JQ(num, num2, obj, str2, str3, str4, A1E, list, z, z2, z3);
            }
        }
        return AbstractC208189Jc.A00();
    }

    public final void A00(C9JQ c9jq, String str, String str2) {
        List list;
        C9JQ c9jq2 = c9jq;
        C14360o3.A0B(str, 0);
        Map map = this.A00;
        synchronized (map) {
            Object obj = map.get(str);
            if (obj == null) {
                obj = AbstractC166987dD.A1I();
                map.put(str, obj);
            }
            C9JQ c9jq3 = (C9JQ) ((Map) obj).get(str2);
            if (c9jq3 != null && (list = c9jq3.A06) != null) {
                ArrayList A1F = AbstractC166987dD.A1F(list);
                List list2 = c9jq2.A06;
                if (list2 != null) {
                    A1F.addAll(list2);
                }
                c9jq2 = new C9JQ(C05F.A0C, c9jq2.A00, c9jq2.A02, c9jq2.A03, c9jq2.A04, c9jq2.A05, A1F, c9jq2.A07, c9jq2.A08, c9jq2.A09, c9jq2.A0A);
            }
            Map map2 = (Map) map.get(str);
            if (map2 != null) {
                map2.put(str2, c9jq2);
            }
        }
    }

    @Override // X.InterfaceC169497hP
    public final void AA1(UQE uqe, C9JQ c9jq) {
        String str = uqe.A01;
        String str2 = uqe.A00;
        if (str2 == null) {
            str2 = GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT;
        }
        A00(c9jq, str, str2);
    }

    @Override // X.InterfaceC169497hP
    public final C9JQ BjO(UQE uqe) {
        C9JQ c9jq;
        Map map = (Map) this.A00.get(uqe.A01);
        if (map != null) {
            String str = uqe.A00;
            if (map.get(str) != null && (c9jq = (C9JQ) map.get(str)) != null) {
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
