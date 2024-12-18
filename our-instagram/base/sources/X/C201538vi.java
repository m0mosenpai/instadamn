package X;

/* renamed from: X.8vi, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C201538vi {
    public int A00;
    public boolean A01;
    public final InterfaceC201368vP A02;

    public final void A00(AXC axc) {
        int i;
        if (axc != null) {
            InterfaceC201368vP interfaceC201368vP = this.A02;
            if (interfaceC201368vP.BPZ().frameDataNeeded) {
                AGQ agq = (AGQ) axc.get();
                int i2 = this.A00;
                if (agq != null && (i = agq.A01) != -1) {
                    i2 = i;
                }
                interfaceC201368vP.FB3(axc, i2, this.A01);
            }
        }
    }

    public C201538vi(InterfaceC201368vP interfaceC201368vP) {
        this.A02 = interfaceC201368vP;
    }
}
