package X;

/* renamed from: X.GFr, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36696GFr implements InterfaceC58067Pos {
    public final /* synthetic */ C6FQ A00;
    public final /* synthetic */ InterfaceC103384lE A01;
    public final /* synthetic */ InterfaceC103384lE A02;
    public final /* synthetic */ Object A03;

    public C36696GFr(C6FQ c6fq, InterfaceC103384lE interfaceC103384lE, InterfaceC103384lE interfaceC103384lE2, Object obj) {
        this.A03 = obj;
        this.A00 = c6fq;
        this.A01 = interfaceC103384lE;
        this.A02 = interfaceC103384lE2;
    }

    @Override // X.InterfaceC58067Pos
    public final void DFg(EnumC53331NiB enumC53331NiB) {
        AbstractC31171DnF.A1K(this.A00, this.A01);
    }

    @Override // X.InterfaceC58067Pos
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        String str;
        MUD mud = (MUD) obj;
        Object obj2 = this.A03;
        if (obj2 != null) {
            C6FQ c6fq = this.A00;
            C6FX A0s = AbstractC25225BEi.A0s();
            String str2 = null;
            if (mud != null) {
                str = mud.A01;
            } else {
                str = null;
            }
            A0s.A01(str);
            if (mud != null) {
                str2 = mud.A02;
            }
            A0s.A02(str2);
            C131845xK.A00(c6fq, A0s.A00(), ((C1344465q) obj2).A00);
        }
    }
}
