package X;

/* renamed from: X.WxC, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71606WxC implements Runnable {
    public final /* synthetic */ InterfaceC138736Qd A00;
    public final /* synthetic */ C6PT A01;
    public final /* synthetic */ C130005u5 A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;

    public RunnableC71606WxC(InterfaceC138736Qd interfaceC138736Qd, C6PT c6pt, C130005u5 c130005u5, String str, String str2) {
        this.A02 = c130005u5;
        this.A01 = c6pt;
        this.A04 = str;
        this.A00 = interfaceC138736Qd;
        this.A03 = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        try {
            C130005u5 c130005u5 = this.A02;
            C65750TtP A01 = c130005u5.A04.A01(this.A00, this.A01, this.A04, null, true);
            String str2 = this.A03;
            C129955u0 c129955u0 = c130005u5.A01;
            c130005u5.A00.AzQ();
            C6PU A02 = ((C6VU) ((XP4) c129955u0.A00(str2)).A00).A02(A01, false);
            A02.A02();
            C6PU.A00(A02, AbstractC111324zv.A00(5079), null);
            C6PU.A00(A02, AbstractC111324zv.A00(5080), null);
            A02.A03();
        } catch (C902840n unused) {
            str = "Cannot create carousel logger";
            C0w9.A03("IgCarouselHandler#logCarousel", str);
        } catch (C129895tu unused2) {
            str = "Failed to get drawable provider due to missing user session";
            C0w9.A03("IgCarouselHandler#logCarousel", str);
        }
    }
}
