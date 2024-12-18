package X;

/* loaded from: classes9.dex */
public final class OHz {
    public final InterfaceC09390do A00 = C1XM.A00(C57389Pdn.A00);
    public final InterfaceC09390do A01 = AbstractC25229BEm.A0p(this, 5);

    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, X.NEr] */
    public final C52353NEr A00(InterfaceC30828Dh3 interfaceC30828Dh3) {
        C1571273r c1571273r;
        EnumC153216up enumC153216up;
        if (interfaceC30828Dh3.equals(C29330CwP.A00)) {
            c1571273r = (C1571273r) this.A00.getValue();
            enumC153216up = EnumC153216up.A02;
        } else if (interfaceC30828Dh3 instanceof C29329CwO) {
            InterfaceC09390do interfaceC09390do = this.A01;
            ((C1571273r) interfaceC09390do.getValue()).A05 = new ViewOnClickListenerC28666ClE(interfaceC30828Dh3, 8);
            c1571273r = (C1571273r) interfaceC09390do.getValue();
            enumC153216up = EnumC153216up.A04;
        } else if (interfaceC30828Dh3.equals(C29331CwQ.A00)) {
            c1571273r = (C1571273r) this.A00.getValue();
            enumC153216up = EnumC153216up.A06;
        } else if (interfaceC30828Dh3.equals(C29332CwR.A00)) {
            c1571273r = (C1571273r) this.A00.getValue();
            enumC153216up = EnumC153216up.A07;
        } else {
            throw B4Z.A00();
        }
        C14360o3.A0B(c1571273r, 1);
        ?? obj = new Object();
        obj.A00 = c1571273r;
        obj.A01 = enumC153216up;
        return obj;
    }
}
