package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.OoA, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55685OoA implements C2Wq {
    public final List A00;

    public C55685OoA(List list) {
        ArrayList A1E = AbstractC166987dD.A1E();
        for (Object obj : list) {
            if (obj instanceof C2Wq) {
                A1E.add(obj);
            }
        }
        ArrayList A1E2 = AbstractC166987dD.A1E();
        Iterator it = A1E.iterator();
        while (it.hasNext()) {
            AnonymousClass016.A16(((C55685OoA) ((C2Wq) it.next())).A00, A1E2);
        }
        this.A00 = A1E2;
    }
}
