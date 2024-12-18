package X;

/* renamed from: X.PTa, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class RunnableC57061PTa implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C53398Njn A01;
    public final /* synthetic */ C50866Mdx A02;
    public final /* synthetic */ InterfaceC16660sJ A03;
    public final /* synthetic */ InterfaceC16660sJ A04;

    public RunnableC57061PTa(C53398Njn c53398Njn, C50866Mdx c50866Mdx, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16660sJ interfaceC16660sJ2, int i) {
        this.A01 = c53398Njn;
        this.A03 = interfaceC16660sJ;
        this.A00 = i;
        this.A04 = interfaceC16660sJ2;
        this.A02 = c50866Mdx;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC16660sJ interfaceC16660sJ;
        if (this.A01.A00()) {
            interfaceC16660sJ = this.A03;
        } else {
            interfaceC16660sJ = this.A04;
        }
        AbstractC43592JPx.A19(this.A00, interfaceC16660sJ);
        this.A02.A00 = null;
    }
}
