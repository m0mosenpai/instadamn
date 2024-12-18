package X;

/* loaded from: classes4.dex */
public final class AVL implements InterfaceC176007sJ {
    public final /* synthetic */ C180037yt A00;

    public AVL(C180037yt c180037yt) {
        this.A00 = c180037yt;
    }

    @Override // X.InterfaceC176007sJ
    public final /* bridge */ /* synthetic */ void A9q(Object obj) {
        C176507t8 c176507t8 = (C176507t8) obj;
        if (c176507t8 != null) {
            C180037yt c180037yt = this.A00;
            if (c180037yt.A06 != null) {
                c176507t8.A06 = -c180037yt.A00;
                c176507t8.A07 = 1;
                c180037yt.A06.A9p(c176507t8);
            }
        }
    }

    @Override // X.InterfaceC176007sJ
    public final /* bridge */ /* synthetic */ void EG4(Object obj) {
        InterfaceC178737wl interfaceC178737wl;
        C176507t8 c176507t8 = (C176507t8) obj;
        if (c176507t8 != null && (interfaceC178737wl = this.A00.A06) != null) {
            interfaceC178737wl.EG3(c176507t8);
        }
    }
}
