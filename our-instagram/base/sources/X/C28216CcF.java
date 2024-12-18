package X;

import java.util.List;

/* renamed from: X.CcF, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28216CcF {
    public final C2YA A01(C50882Vk c50882Vk) {
        C2W5 c2w5;
        if (c50882Vk != null && (c2w5 = c50882Vk.A02) != null && !(c2w5 instanceof C78853fr)) {
            if (c2w5 instanceof C2W3) {
                C2W3 c2w3 = (C2W3) c2w5;
                int size = c2w3.A04().A0u.size() - 1;
                if (size < 0) {
                    size = 0;
                }
                C2YA A02 = A02(c2w3, size, 0, 0, 0, 0);
                if (A02 != null) {
                    A02.A00 = true;
                    return A02;
                }
            } else {
                throw AbstractC166987dD.A14("Expected root to be a LithoLayoutResult");
            }
        }
        return null;
    }

    public final synchronized C2YA A02(C2W3 c2w3, int i, int i2, int i3, int i4, int i5) {
        C2YA c2ya;
        Object obj;
        C2W1 A04 = c2w3.A04();
        C2XE c2xe = c2w3.A00;
        if (!(c2w3 instanceof C78853fr) && i < A04.A0u.size()) {
            String A0B = A04.A0B(i);
            C75793ak c75793ak = c2xe.A03;
            if (c75793ak != null) {
                obj = Integer.valueOf(c75793ak.A00);
            } else {
                obj = null;
            }
            StringBuilder A1C = AbstractC166987dD.A1C();
            if (obj == null) {
                obj = "notree";
            }
            A1C.append(obj);
            A1C.append(':');
            A1C.append(A0B);
            A1C.toString();
            c2ya = new C2YA(c2w3, c2w3.A04(), i, i2, i3, i4, i5);
            java.util.Set set = A04.A0j;
            if (set == null) {
                set = AbstractC166987dD.A1H();
                A04.A0j = set;
            }
            set.add(c2ya);
        } else {
            c2ya = null;
        }
        return c2ya;
    }

    public static final List A00(C2W3 c2w3, int i, int i2) {
        C01L A1I = C0eM.A1I();
        List list = c2w3.A03;
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            C2W3 c2w32 = (C2W3) list.get(i3);
            int A05 = AbstractC25226BEj.A05(c2w32.A04().A0u);
            C2YA A02 = C2YA.A08.A02(c2w32, AbstractC25230BEn.A06(A05, A05), c2w3.CI4(i3), c2w3.CIb(i3), i, i2);
            if (A02 != null) {
                A1I.add(A02);
            }
        }
        return C0eM.A1J(A1I);
    }
}
