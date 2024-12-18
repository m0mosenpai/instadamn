package X;

/* renamed from: X.Lxk, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49715Lxk implements InterfaceC42241xE {
    public final /* synthetic */ L97 A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ InterfaceC71543Iw A03;

    public C49715Lxk(L97 l97, String str, String str2, InterfaceC71543Iw interfaceC71543Iw) {
        this.A02 = str;
        this.A01 = str2;
        this.A00 = l97;
        this.A03 = interfaceC71543Iw;
    }

    @Override // X.InterfaceC42241xE
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        if (!((EnumC61185Rgl) obj).A01) {
            EnumC53199Nfv enumC53199Nfv = EnumC53199Nfv.A03;
            String str = this.A02;
            String str2 = this.A01;
            L97 l97 = this.A00;
            l97.A05.A02(l97.A00, new QIo(null, enumC53199Nfv, str, AnonymousClass001.A15("{\"sku\":\"", str, "\",\"product_id\":\"", str2, "\",\"product_session_id\":\"", l97.A06, "\"}"), str2, null, null), new C48205LVd(l97, this.A03), null);
            return;
        }
        InterfaceC71543Iw interfaceC71543Iw = this.A03;
        interfaceC71543Iw.F8s(new C45153Jyt());
        interfaceC71543Iw.AID(null);
    }
}
