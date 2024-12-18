package X;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.AUb, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23290AUb implements C8EF {
    public final int A00;
    public final Object A01;

    public C23290AUb(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.C8EF
    public final void D6b(Exception exc, List list) {
        int i;
        switch (this.A00) {
            case 0:
                C14360o3.A0B(list, 0);
                if (!AbstractC166987dD.A1b(list)) {
                    return;
                }
                C22896A7q c22896A7q = (C22896A7q) this.A01;
                c22896A7q.A00 = ((C184028Eq) list.get(0)).A01;
                list.get(0);
                if (c22896A7q.A01 != null) {
                    return;
                }
                try {
                    c22896A7q.A01 = AbstractC193188gy.A00(c22896A7q.A00);
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 1:
                C14360o3.A0B(list, 0);
                if (!AbstractC166987dD.A1b(list)) {
                    return;
                }
                C184028Eq c184028Eq = (C184028Eq) list.get(0);
                C9VK c9vk = (C9VK) this.A01;
                c9vk.A01 = c184028Eq.A01;
                List list2 = C8E4.A0G.A00;
                Object A0J = AbstractC001800i.A0J(list2);
                Object obj = null;
                if (A0J != null) {
                    Object obj2 = c184028Eq.A03.get(A0J);
                    if (obj2 == null) {
                        obj2 = null;
                    }
                    c9vk.A02 = (String) obj2;
                }
                Object A0L = AbstractC001800i.A0L(list2);
                if (A0L != null) {
                    Object obj3 = c184028Eq.A03.get(A0L);
                    if (obj3 != null) {
                        obj = obj3;
                    }
                    c9vk.A00 = (String) obj;
                }
                C9VK.A00(c9vk);
                return;
            case 2:
                C14360o3.A0B(list, 0);
                HashMap A1G = AbstractC166987dD.A1G();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    C184028Eq c184028Eq2 = (C184028Eq) it.next();
                    HashMap hashMap = LE9.A01;
                    String str = c184028Eq2.A02;
                    Object obj4 = hashMap.get(str);
                    if (obj4 == null) {
                        obj4 = str;
                    }
                    A1G.put(obj4, c184028Eq2.A01);
                }
                ((InterfaceC16660sJ) this.A01).invoke(A1G);
                return;
            default:
                C14360o3.A0B(list, 0);
                if (AbstractC166987dD.A1b(list)) {
                    String str2 = ((C184028Eq) list.get(0)).A01;
                    Integer num = ((C184028Eq) list.get(0)).A00;
                    if (num != null) {
                        i = num.intValue();
                    } else {
                        i = -1;
                    }
                    long j = i;
                    C50986Mft c50986Mft = (C50986Mft) this.A01;
                    if (j == 12) {
                        InterfaceC19610xo A0w = AbstractC166987dD.A0w(c50986Mft.A04);
                        A0w.E7K(MSV.A00(407), str2);
                        A0w.apply();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
