package X;

/* loaded from: classes8.dex */
public final class JUA implements InterfaceC41501vz {
    public final /* synthetic */ JU8 A00;

    public JUA(JU8 ju8) {
        this.A00 = ju8;
    }

    @Override // X.InterfaceC41501vz
    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int A03 = C0f9.A03(-1261320275);
        C2Io c2Io = (C2Io) obj;
        int A0N = AbstractC167017dG.A0N(c2Io, 1838228434);
        JU8 ju8 = this.A00;
        C2EC c2ec = ju8.A02;
        if (c2ec != null && C14360o3.A0K(c2Io.A00.A00, c2ec.C7I()) && c2ec.CWO() != ju8.A03) {
            ju8.A03 = c2ec.CWO();
            InterfaceC50428MOi interfaceC50428MOi = ju8.A00;
            if (interfaceC50428MOi != null) {
                interfaceC50428MOi.EJ0(ju8);
            }
        }
        C0f9.A0A(-1303348616, A0N);
        C0f9.A0A(1733459987, A03);
    }
}
