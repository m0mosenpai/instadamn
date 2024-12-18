package X;

/* renamed from: X.SzE, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64097SzE implements InterfaceC65489TlA {
    public final /* synthetic */ QKE A00;

    @Override // X.InterfaceC65489TlA
    public final void EmN(String str, String str2) {
        C14360o3.A0B(str2, 1);
        C0f6 c0f6 = this.A00.A01;
        if (c0f6 != null) {
            C0f5 AEp = c0f6.AEp(str, 817899599);
            AEp.ERI(new Rk9(str2));
            AEp.report();
        }
    }

    public C64097SzE(QKE qke) {
        this.A00 = qke;
    }

    @Override // X.InterfaceC65489TlA
    public final void EmQ(String str, Throwable th) {
        AbstractC167017dG.A1N(str, th);
        C0f6 c0f6 = this.A00.A01;
        if (c0f6 != null) {
            C0f5 AEp = c0f6.AEp(str, 817899599);
            AEp.ERI(th);
            AEp.report();
        }
    }
}
