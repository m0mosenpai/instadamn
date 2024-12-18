package X;

/* renamed from: X.5Zq, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5Zq extends C58J implements InterfaceC1130758u, InterfaceC114155Db {
    public static final C5Zr A02 = new Object();
    public boolean A00;
    public InterfaceC1131459c A01;

    public static final void A00(C5Zq c5Zq) {
        C6Ng c6Ng;
        InterfaceC1131459c interfaceC1131459c = c5Zq.A01;
        if (interfaceC1131459c != null && interfaceC1131459c.CQ7() && c5Zq.A08) {
            InterfaceC1130758u A00 = BFZ.A00(c5Zq, C6Ng.A02);
            if ((A00 instanceof C6Ng) && (c6Ng = (C6Ng) A00) != null) {
                c6Ng.A0F(c5Zq.A01);
            }
        }
    }

    @Override // X.InterfaceC1130758u
    public final Object CAp() {
        return A02;
    }

    @Override // X.InterfaceC114155Db
    public final void DJc(InterfaceC1131459c interfaceC1131459c) {
        C6Ng c6Ng;
        this.A01 = interfaceC1131459c;
        if (this.A00) {
            if (interfaceC1131459c.CQ7()) {
                A00(this);
                return;
            }
            if (!this.A08) {
                return;
            }
            InterfaceC1130758u A00 = BFZ.A00(this, C6Ng.A02);
            if (!(A00 instanceof C6Ng) || (c6Ng = (C6Ng) A00) == null) {
                return;
            }
            c6Ng.A0F(null);
        }
    }
}
