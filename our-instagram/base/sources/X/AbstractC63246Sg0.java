package X;

import java.util.List;

/* renamed from: X.Sg0, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC63246Sg0 {
    public static final C58252li A00(List list) {
        C14360o3.A0B(list, 0);
        C58252li A0I = AbstractC58318PtA.A0I();
        if (list.isEmpty()) {
            C63167SeR.A00(A0I, AbstractC166997dE.A0b());
        } else {
            Object obj = new Object();
            int size = list.size();
            for (int i = 0; i < size; i++) {
                A02((C2GT) list.get(i), A0I, new C63626SqY(12, obj, list, A0I));
            }
        }
        return A0I;
    }

    public static final void A03(C2GT c2gt, InterfaceC58362lv interfaceC58362lv) {
        C14360o3.A0B(c2gt, 0);
        c2gt.A09(new C63625SqX(c2gt, interfaceC58362lv, 23));
    }

    public static final void A01(C07X c07x, C2GT c2gt, InterfaceC58362lv interfaceC58362lv) {
        AbstractC167017dG.A1O(c2gt, interfaceC58362lv);
        C63625SqX c63625SqX = new C63625SqX(c2gt, interfaceC58362lv, 24);
        if (c07x == null) {
            c2gt.A09(c63625SqX);
        } else {
            c2gt.A06(c07x, c63625SqX);
        }
    }

    public static final void A02(C2GT c2gt, C58252li c58252li, InterfaceC58362lv interfaceC58362lv) {
        AbstractC167017dG.A1N(c58252li, c2gt);
        AbstractC58321PtD.A1D(c2gt, c58252li, new DHZ(46, interfaceC58362lv, c58252li, c2gt), 34);
    }
}
