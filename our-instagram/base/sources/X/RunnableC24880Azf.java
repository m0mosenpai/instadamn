package X;

/* renamed from: X.Azf, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24880Azf implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C203858zu A02;
    public final /* synthetic */ InterfaceC203868zv A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ boolean A05;

    public RunnableC24880Azf(C203858zu c203858zu, InterfaceC203868zv interfaceC203868zv, String str, int i, int i2, boolean z) {
        this.A02 = c203858zu;
        this.A04 = str;
        this.A05 = z;
        this.A01 = i;
        this.A00 = i2;
        this.A03 = interfaceC203868zv;
    }

    @Override // java.lang.Runnable
    public final void run() {
        EnumC222539ru enumC222539ru;
        C203858zu c203858zu = this.A02;
        InterfaceC150406pp interfaceC150406pp = c203858zu.A04;
        String str = this.A04;
        boolean z = this.A05;
        int i = this.A01;
        if (i >= 0 && i < EnumC222539ru.values().length) {
            enumC222539ru = EnumC222539ru.values()[i];
        } else {
            enumC222539ru = EnumC222539ru.Text;
        }
        C22908A8d c22908A8d = new C22908A8d(enumC222539ru, str, this.A00, z);
        InterfaceC203868zv interfaceC203868zv = this.A03;
        if (interfaceC203868zv == null) {
            interfaceC203868zv = c203858zu;
        }
        interfaceC150406pp.DDw(c22908A8d, interfaceC203868zv);
    }
}
