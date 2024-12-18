package X;

/* renamed from: X.8HS, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8HS implements C8HT {
    public boolean A00 = false;
    public final /* synthetic */ C8HI A01;

    public C8HS(C8HI c8hi) {
        this.A01 = c8hi;
    }

    @Override // X.C8HT
    public final void DrO() {
        C8HI c8hi = this.A01;
        InterfaceC1810081c interfaceC1810081c = c8hi.A1C;
        if (!interfaceC1810081c.CRB(EnumC1810181d.A0f) && !interfaceC1810081c.CRB(EnumC1810181d.A0g)) {
            if (!this.A00 && c8hi.A0g.A0W(C81W.A0T, C81W.A0z)) {
                C208769Lk A00 = C8HI.A00(c8hi);
                if (A00 != null) {
                    A00.A0K(true);
                }
                this.A00 = true;
                return;
            }
            return;
        }
        interfaceC1810081c.E4u(new Object());
    }
}
