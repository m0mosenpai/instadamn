package X;

/* loaded from: classes8.dex */
public final class M5H implements Runnable {
    public final /* synthetic */ C47701L4i A00;
    public final /* synthetic */ C161257Kk A01;
    public final /* synthetic */ String A02;

    public M5H(C47701L4i c47701L4i, C161257Kk c161257Kk, String str) {
        this.A01 = c161257Kk;
        this.A00 = c47701L4i;
        this.A02 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C161257Kk c161257Kk = this.A01;
        C47701L4i c47701L4i = this.A00;
        String str = this.A02;
        c161257Kk.A04(c47701L4i, str, new MHY(c161257Kk, c47701L4i, C05F.A00, str, 3, false), MFC.A00, false);
    }
}
