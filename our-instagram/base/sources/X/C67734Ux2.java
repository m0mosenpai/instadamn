package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Ux2, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C67734Ux2 extends AbstractC70537Wby {
    @Override // X.InterfaceC71907X9r
    public final C4BI AVI(C4BI c4bi) {
        int i;
        if (c4bi == null) {
            return null;
        }
        List<C4BF> list = c4bi.A03;
        int i2 = 0;
        int i3 = 0;
        for (C4BF c4bf : list) {
            if (c4bf != null && c4bf.A01 == 2) {
                i3++;
            }
        }
        if (i3 == 1) {
            return c4bi;
        }
        ArrayList arrayList = new ArrayList();
        for (C4BF c4bf2 : list) {
            if (c4bf2 != null && (i = c4bf2.A01) == 2) {
                ArrayList arrayList2 = new ArrayList();
                int i4 = i2;
                for (C4BB c4bb : c4bf2.A07) {
                    int i5 = c4bb.A02.A0A;
                    if (i5 > i2) {
                        arrayList2.add(c4bb);
                        i4 = Math.max(i4, i5);
                    }
                }
                if (!arrayList2.isEmpty()) {
                    arrayList.add(new C4BF(c4bf2.A03, c4bf2.A04, c4bf2.A02, arrayList2, c4bf2.A05, c4bf2.A06, c4bf2.A08, c4bf2.A00, i, c4bf2.A09, c4bf2.A0A));
                }
                i2 = i4;
            } else {
                arrayList.add(c4bf2);
            }
        }
        return new C4BI(c4bi.A00, c4bi.A02, AbstractC70537Wby.A00(arrayList));
    }
}
