package X;

/* loaded from: classes6.dex */
public final class GPP implements Runnable {
    public final /* synthetic */ G3P A00;
    public final /* synthetic */ C160787Im A01;
    public final /* synthetic */ C83403nh A02;

    public GPP(G3P g3p, C160787Im c160787Im, C83403nh c83403nh) {
        this.A01 = c160787Im;
        this.A00 = g3p;
        this.A02 = c83403nh;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A01.A0b = true;
        this.A00.A00.BT6().EZ9(C05F.A0C, this.A02.A0i(), true);
    }
}
