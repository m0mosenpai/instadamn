package X;

/* renamed from: X.LxX, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49702LxX implements InterfaceC42241xE {
    public final /* synthetic */ C158797Aq A00;
    public final /* synthetic */ C48261LXk A01;

    public C49702LxX(C158797Aq c158797Aq, C48261LXk c48261LXk) {
        this.A01 = c48261LXk;
        this.A00 = c158797Aq;
    }

    @Override // X.InterfaceC42241xE
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        C46h c46h = (C46h) obj;
        if (c46h instanceof C4JL) {
            Object A03 = c46h.A03();
            C14360o3.A07(A03);
            if (!AbstractC43592JPx.A1a(AbstractC111324zv.A00(841), 1, AbstractC167027dH.A0Q(A03))) {
                EnumC40111tc enumC40111tc = this.A00.A0I;
                if (enumC40111tc != null) {
                    this.A01.A04(null, new C49097Lna(AbstractC25227BEk.A0B((String) c46h.A03()), enumC40111tc), "aggregated_media_viewer");
                    return;
                }
                throw AbstractC166997dE.A0g();
            }
        }
        C9GR.A0A(this.A01.A00, "error");
    }
}
