package X;

import java.util.Map;

/* renamed from: X.35N, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C35N extends AbstractC64292vo {
    @Override // X.InterfaceC43071ya
    public final void ATP(C59062n7 c59062n7, InterfaceC57162jr interfaceC57162jr) {
        C14360o3.A0B(c59062n7, 0);
        C14360o3.A0B(interfaceC57162jr, 1);
        if (interfaceC57162jr.CFq(c59062n7) != C05F.A0C) {
            String id = ((C38321qM) c59062n7.A03).getId();
            if (id != null) {
                Map map = C115775Lq.A02;
                C115785Lr c115785Lr = (C115785Lr) map.get(id);
                if (c115785Lr == null) {
                    c115785Lr = new C115785Lr();
                }
                c115785Lr.A03 = true;
                map.put(id, c115785Lr);
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
    }
}
