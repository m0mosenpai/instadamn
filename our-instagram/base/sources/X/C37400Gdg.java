package X;

/* renamed from: X.Gdg, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37400Gdg extends C1P1 {
    public final /* synthetic */ C1P3 A00;
    public final /* synthetic */ InterfaceC23511Cn A01;
    public final /* synthetic */ C1P1 A02;
    public final /* synthetic */ C1P1 A03;
    public final /* synthetic */ C1ON A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ boolean A06;

    public C37400Gdg(C1P3 c1p3, InterfaceC23511Cn interfaceC23511Cn, C1P1 c1p1, C1P1 c1p12, C1ON c1on, String str, boolean z) {
        this.A02 = c1p1;
        this.A00 = c1p3;
        this.A05 = str;
        this.A04 = c1on;
        this.A06 = z;
        this.A03 = c1p12;
        this.A01 = interfaceC23511Cn;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A0N = AbstractC167017dG.A0N(abstractC115105If, -81686306);
        super.onFail(abstractC115105If);
        C1ON c1on = this.A04;
        if (c1on != null && (!this.A06 || this.A00.A02())) {
            C1P3 c1p3 = this.A00;
            String str = this.A05;
            C1P3.A01(c1p3, this.A01, this.A03, this.A02, c1on, str);
        }
        C0f9.A0A(210735272, A0N);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C0f9.A03(-1759945992);
        InterfaceC55612h1 interfaceC55612h1 = (InterfaceC55612h1) obj;
        int A0N = AbstractC167017dG.A0N(interfaceC55612h1, -1514295714);
        super.onSuccess(interfaceC55612h1);
        if (interfaceC55612h1.Ajf() == -1) {
            C0w9.A03("IgApiPrefetchScheduler", "invalid cache responseObject");
        }
        InterfaceC14020nS A00 = C14120nc.A00();
        C14360o3.A07(A00);
        this.A00.A00.put(this.A05, new C99074cU(interfaceC55612h1, A00, interfaceC55612h1.Ajf()));
        C1P1 c1p1 = this.A02;
        if (c1p1 != null) {
            c1p1.onSuccess(interfaceC55612h1);
        }
        C0f9.A0A(685708945, A0N);
        C0f9.A0A(-433550897, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
        int A03 = C0f9.A03(1978442061);
        int A0N = AbstractC167017dG.A0N(obj, 1061502636);
        C1P1 c1p1 = this.A02;
        if (c1p1 != null) {
            c1p1.onSuccessInBackground(obj);
        }
        C0f9.A0A(-186232426, A0N);
        C0f9.A0A(-1622341271, A03);
    }
}
