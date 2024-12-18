package X;

/* renamed from: X.3MA, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3MA {
    public String A00;
    public String A01;
    public boolean A02;
    public boolean A03;
    public final AbstractC12990ll A04;

    public C3MA(AbstractC12990ll abstractC12990ll) {
        C14360o3.A0B(abstractC12990ll, 1);
        this.A04 = abstractC12990ll;
    }

    public final void A00(InterfaceC11380iw interfaceC11380iw) {
        String str;
        if (this.A00 != null && this.A01 != null && C14360o3.A0K(interfaceC11380iw.getModuleName(), this.A01)) {
            C18920wW A01 = AbstractC12220kQ.A01(interfaceC11380iw, this.A04);
            InterfaceC02590Ai A00 = A01.A00(A01.A00, "app_switch_dest");
            A00.AAP("dest_module", this.A01);
            A00.AAP(MSV.A00(387), this.A00);
            if (this.A03) {
                str = "warm";
            } else {
                str = "cold";
            }
            A00.AAP("dest_state", str);
            A00.Cht();
            this.A00 = null;
            this.A01 = null;
        }
        this.A02 = true;
    }
}
