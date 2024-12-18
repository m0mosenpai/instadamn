package X;

/* loaded from: classes8.dex */
public final class M6R implements Runnable {
    public final /* synthetic */ C71933Kq A00;
    public final /* synthetic */ C71943Kr A01;
    public final /* synthetic */ LG9 A02;
    public final /* synthetic */ String A03;

    public M6R(C71933Kq c71933Kq, C71943Kr c71943Kr, LG9 lg9, String str) {
        this.A00 = c71933Kq;
        this.A02 = lg9;
        this.A03 = str;
        this.A01 = c71943Kr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC16660sJ interfaceC16660sJ = this.A02.A02;
        String str = this.A03;
        C14360o3.A0A(str);
        ((C2IZ) interfaceC16660sJ.invoke(str)).A02(new C4JH(this.A01, "notification_received"));
    }
}
