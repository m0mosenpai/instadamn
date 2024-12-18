package X;

/* loaded from: classes10.dex */
public final class T8A implements InterfaceC216113n {
    public final /* synthetic */ String A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ boolean A03;

    public T8A(String str, String str2, boolean z, String str3) {
        this.A01 = str;
        this.A03 = z;
        this.A00 = str2;
        this.A02 = str3;
    }

    @Override // X.InterfaceC216113n
    public final /* bridge */ /* synthetic */ Object get() {
        String str;
        C1Ee c1Ee = new C1Ee();
        String str2 = this.A01;
        if (this.A03) {
            str = this.A00;
        } else {
            str = this.A02;
        }
        c1Ee.A05(str2, str);
        return c1Ee;
    }
}
