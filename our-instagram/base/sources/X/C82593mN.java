package X;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.3mN, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C82593mN {
    public static final C82593mN A00 = new Object();

    public final void A01(C9BW c9bw, C3HZ c3hz) {
        C14360o3.A0B(c3hz, 2);
        C9C7 c9c7 = (C9C7) c9bw.A01;
        C206209Bd c206209Bd = new C206209Bd((EnumC64262vl) c9c7.A01, (AnonymousClass317) c9c7.A04, (EnumC64222vh) c9c7.A05);
        HashMap hashMap = c3hz.A01;
        java.util.Set keySet = hashMap.keySet();
        C14360o3.A07(keySet);
        if (keySet.contains(c206209Bd)) {
            List singletonList = Collections.singletonList(c9bw);
            C14360o3.A07(singletonList);
            List<InterfaceC669630n> list = (List) hashMap.get(c206209Bd);
            if (list != null) {
                for (InterfaceC669630n interfaceC669630n : list) {
                    interfaceC669630n.CKM(c206209Bd, singletonList);
                    C9BW c9bw2 = (C9BW) AbstractC001800i.A0J(singletonList);
                    if (c9bw2 != null) {
                        ((C1M6) c3hz.A02.getValue()).EIA(c9bw2, interfaceC669630n.B5L());
                    }
                }
            }
        }
    }

    public static final boolean A00(C9BW c9bw) {
        AnonymousClass317 anonymousClass317 = (AnonymousClass317) ((C9C7) c9bw.A01).A04;
        if (anonymousClass317 != AnonymousClass317.A0M && !C82603mO.A01(anonymousClass317)) {
            return true;
        }
        return false;
    }
}
