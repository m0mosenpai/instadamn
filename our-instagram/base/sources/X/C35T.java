package X;

import java.util.Map;

/* renamed from: X.35T, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C35T extends AbstractC64292vo {
    @Override // X.InterfaceC43071ya
    public final void ATP(C59062n7 c59062n7, InterfaceC57162jr interfaceC57162jr) {
        C14360o3.A0B(c59062n7, 0);
        C14360o3.A0B(interfaceC57162jr, 1);
        if (interfaceC57162jr.CFq(c59062n7) != C05F.A0C) {
            C38321qM c38321qM = (C38321qM) c59062n7.A03;
            C14360o3.A0A(c38321qM);
            if (this.A00.get(c38321qM) != null) {
                String id = c38321qM.getId();
                if (id != null) {
                    Map map = C115775Lq.A02;
                    C115785Lr c115785Lr = (C115785Lr) map.get(id);
                    if (c115785Lr == null) {
                        c115785Lr = new C115785Lr();
                    }
                    c115785Lr.A02 = true;
                    map.put(id, c115785Lr);
                    String id2 = c38321qM.getId();
                    if (id2 != null) {
                        A02(c59062n7, interfaceC57162jr, id2, c38321qM.A5M());
                        return;
                    }
                    throw new IllegalStateException("Required value was null.");
                }
                throw new IllegalStateException("Required value was null.");
            }
        }
    }
}
