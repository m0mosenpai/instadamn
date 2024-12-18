package X;

import java.util.Map;

/* renamed from: X.35S, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C35S extends AbstractC64292vo {
    @Override // X.InterfaceC43071ya
    public final void ATP(C59062n7 c59062n7, InterfaceC57162jr interfaceC57162jr) {
        C38321qM c38321qM;
        C14360o3.A0B(c59062n7, 0);
        C14360o3.A0B(interfaceC57162jr, 1);
        if (interfaceC57162jr.CFq(c59062n7) != C05F.A0C) {
            C38321qM c38321qM2 = (C38321qM) c59062n7.A03;
            if (c38321qM2.A5M()) {
                c38321qM = c38321qM2.A1e(((C75113Zb) c59062n7.A04).A03);
            } else {
                c38321qM = c38321qM2;
            }
            boolean z = true;
            if (c38321qM == null || !c38321qM.A4s()) {
                z = false;
            }
            String id = c38321qM2.getId();
            if (id != null) {
                A02(c59062n7, interfaceC57162jr, id, z);
                String id2 = c38321qM2.getId();
                if (id2 != null) {
                    Map map = C115775Lq.A02;
                    C115785Lr c115785Lr = (C115785Lr) map.get(id2);
                    if (c115785Lr == null) {
                        c115785Lr = new C115785Lr();
                    }
                    c115785Lr.A03 = true;
                    map.put(id2, c115785Lr);
                    return;
                }
                throw new IllegalStateException("Required value was null.");
            }
            throw new IllegalStateException("Required value was null.");
        }
    }
}
