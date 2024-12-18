package X;

/* renamed from: X.Ize, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42988Ize implements InterfaceC64212vg {
    public final /* synthetic */ InterfaceC60442pS A00;
    public final /* synthetic */ String A01;

    public C42988Ize(InterfaceC60442pS interfaceC60442pS, String str) {
        this.A01 = str;
        this.A00 = interfaceC60442pS;
    }

    @Override // X.InterfaceC64212vg
    public final /* bridge */ /* synthetic */ C9CQ AUX(Object obj, Object obj2) {
        C38321qM c38321qM;
        InterfaceC127955qO interfaceC127955qO = (AbstractC127945qN) obj;
        C14360o3.A0B(interfaceC127955qO, 0);
        if (interfaceC127955qO instanceof InterfaceC127975qQ) {
            c38321qM = ((InterfaceC127975qQ) interfaceC127955qO).BQN();
        } else {
            c38321qM = null;
        }
        return AbstractC82563mK.A01(c38321qM);
    }

    @Override // X.InterfaceC64212vg
    public final /* bridge */ /* synthetic */ C82573mL AUY(EnumC64262vl enumC64262vl, Object obj, Object obj2, float f, long j, long j2) {
        C38321qM c38321qM;
        String str;
        String A00;
        InterfaceC127955qO interfaceC127955qO = (AbstractC127945qN) obj;
        AbstractC167027dH.A12(interfaceC127955qO, obj2, enumC64262vl);
        if (interfaceC127955qO instanceof InterfaceC127975qQ) {
            c38321qM = ((InterfaceC127975qQ) interfaceC127955qO).BQN();
        } else {
            c38321qM = null;
        }
        String str2 = null;
        if (enumC64262vl == EnumC64262vl.A05) {
            if (c38321qM != null) {
                str2 = c38321qM.A2W();
            }
        } else if (c38321qM != null) {
            str2 = c38321qM.A2u();
        }
        String valueOf = String.valueOf(str2);
        if (c38321qM != null) {
            str = c38321qM.getId();
            if (str != null) {
                A00 = AbstractC37302Gc3.A0c(c38321qM);
            } else {
                throw AbstractC166997dE.A0g();
            }
        } else {
            str = "n/a";
            A00 = AbstractC111324zv.A00(2761);
        }
        return new C82573mL(enumC64262vl, valueOf, this.A01, str, this.A00.getModuleName(), A00, "", f, 0, -1, -1, -1, -1, -1, -1, -1, j, j2);
    }
}
