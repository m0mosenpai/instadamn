package X;

/* loaded from: classes7.dex */
public final class J7T extends C0YY implements InterfaceC16820sZ {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ InterfaceC43418JGi A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J7T(InterfaceC43418JGi interfaceC43418JGi, String str, String str2, String str3, int i, int i2) {
        super(0);
        this.A02 = interfaceC43418JGi;
        this.A05 = str;
        this.A04 = str2;
        this.A03 = str3;
        this.A01 = i;
        this.A00 = i2;
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        InterfaceC43418JGi interfaceC43418JGi = this.A02;
        if (interfaceC43418JGi != null) {
            interfaceC43418JGi.D2v(this.A05, this.A04, this.A03, this.A01, this.A00);
        }
        return C0eB.A00;
    }
}
