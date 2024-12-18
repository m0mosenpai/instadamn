package X;

/* renamed from: X.PFg, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56714PFg implements InterfaceC58067Pos {
    public final /* synthetic */ C6FQ A00;
    public final /* synthetic */ InterfaceC103384lE A01;
    public final /* synthetic */ InterfaceC103384lE A02;
    public final /* synthetic */ Object A03;

    public C56714PFg(C6FQ c6fq, InterfaceC103384lE interfaceC103384lE, InterfaceC103384lE interfaceC103384lE2, Object obj) {
        this.A03 = obj;
        this.A00 = c6fq;
        this.A01 = interfaceC103384lE;
        this.A02 = interfaceC103384lE2;
    }

    @Override // X.InterfaceC58067Pos
    public final void DFg(EnumC53331NiB enumC53331NiB) {
        C131845xK.A00(this.A00, C6FW.A01, this.A01);
    }

    @Override // X.InterfaceC58067Pos
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        C51743MtS c51743MtS = (C51743MtS) obj;
        Object obj2 = this.A03;
        if (obj2 != null) {
            C6FQ c6fq = this.A00;
            C6FX c6fx = new C6FX();
            String str5 = null;
            if (c51743MtS != null) {
                str = c51743MtS.A02;
            } else {
                str = null;
            }
            c6fx.A01(str);
            if (c51743MtS != null) {
                str2 = c51743MtS.A05;
            } else {
                str2 = null;
            }
            c6fx.A02(str2);
            if (c51743MtS != null) {
                str3 = c51743MtS.A04;
            } else {
                str3 = null;
            }
            c6fx.A03(str3, 2);
            if (c51743MtS != null) {
                str4 = c51743MtS.A03;
            } else {
                str4 = null;
            }
            c6fx.A03(str4, 3);
            if (c51743MtS != null) {
                str5 = c51743MtS.A01;
            }
            c6fx.A03(str5, 4);
            C131845xK.A00(c6fq, c6fx.A00(), ((C1344465q) obj2).A00);
        }
    }
}
