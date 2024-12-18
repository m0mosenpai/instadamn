package X;

import java.util.Iterator;
import java.util.List;

/* renamed from: X.2l4, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C57912l4 implements InterfaceC42861yE {
    @Override // X.InterfaceC42861yE
    public final C89143yG BE0(List list) {
        Object obj;
        C89143yG c89143yG = (C89143yG) list.get(0);
        Iterator it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                C1QY c1qy = ((C89143yG) obj).A04;
                C14360o3.A06(c1qy);
                if (C1RN.A00(c1qy)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        C89143yG c89143yG2 = (C89143yG) obj;
        if (c89143yG2 != null) {
            return c89143yG2;
        }
        return c89143yG;
    }

    @Override // X.InterfaceC42861yE
    public final void DLa(C1QW c1qw, C1QY c1qy, boolean z) {
    }
}
