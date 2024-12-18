package X;

import java.util.AbstractMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.Sq8, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63600Sq8 implements InterfaceC65299ThX {
    @Override // X.InterfaceC65299ThX
    public final int BtV(int i, Object obj, Object obj2) {
        AbstractMap abstractMap = (AbstractMap) obj;
        C58388PuS c58388PuS = (C58388PuS) obj2;
        int i2 = 0;
        if (!abstractMap.isEmpty()) {
            Iterator A14 = AbstractC166997dE.A14(abstractMap);
            while (A14.hasNext()) {
                Map.Entry A1K = AbstractC166987dD.A1K(A14);
                Object key = A1K.getKey();
                Object value = A1K.getValue();
                int A05 = AbstractC63226Sfd.A05(i);
                C58389PuT c58389PuT = c58388PuS.A00;
                int A00 = C63340Shu.A00(c58389PuT.A00, key, 1) + C63340Shu.A00(c58389PuT.A01, value, 2);
                boolean z = Q7P.A02;
                i2 += A05 + AbstractC58321PtD.A06(A00) + A00;
            }
        }
        return i2;
    }
}
