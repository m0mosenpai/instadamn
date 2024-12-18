package X;

/* renamed from: X.35O, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C35O extends AbstractC64292vo {
    @Override // X.InterfaceC43071ya
    public final void ATP(C59062n7 c59062n7, InterfaceC57162jr interfaceC57162jr) {
        C14360o3.A0B(c59062n7, 0);
        C14360o3.A0B(interfaceC57162jr, 1);
        if (interfaceC57162jr.CFq(c59062n7) != C05F.A0C) {
            String id = ((C38321qM) c59062n7.A03).getId();
            if (id != null) {
                A02(c59062n7, interfaceC57162jr, id, false);
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
    }
}
