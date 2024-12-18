package X;

/* renamed from: X.34B, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C34B implements InterfaceC62702t9 {
    public static final C34B A00 = new C34B();

    @Override // X.InterfaceC62702t9
    public final String BKe(C59062n7 c59062n7) {
        String id;
        String BPW;
        C14360o3.A0B(c59062n7, 0);
        C38321qM c38321qM = (C38321qM) c59062n7.A03;
        if (c38321qM.A5M() && (BPW = c38321qM.A0C.BPW()) != null && BPW.length() != 0) {
            id = c38321qM.A0C.BPW();
            if (id == null) {
                throw new IllegalStateException("Required value was null.");
            }
        } else {
            id = c38321qM.getId();
            if (id == null) {
                throw new IllegalStateException("Required value was null.");
            }
        }
        return id;
    }
}
