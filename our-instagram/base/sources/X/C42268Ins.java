package X;

/* renamed from: X.Ins, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42268Ins implements InterfaceC41501vz {
    public final /* synthetic */ InterfaceC145496h8 A00;
    public final /* synthetic */ C139516Tg A01;
    public final /* synthetic */ String A02;

    public C42268Ins(InterfaceC145496h8 interfaceC145496h8, C139516Tg c139516Tg, String str) {
        this.A02 = str;
        this.A00 = interfaceC145496h8;
        this.A01 = c139516Tg;
    }

    @Override // X.InterfaceC41501vz
    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int A03 = C0f9.A03(1412844884);
        C42237InN c42237InN = (C42237InN) obj;
        int A032 = C0f9.A03(-538998286);
        C14360o3.A0B(c42237InN, 0);
        if (C14360o3.A0K(c42237InN.A00, this.A02) && !this.A00.CLi()) {
            this.A01.A05.setVisibility(0);
        }
        C0f9.A0A(-1112827826, A032);
        C0f9.A0A(1738691572, A03);
    }
}
