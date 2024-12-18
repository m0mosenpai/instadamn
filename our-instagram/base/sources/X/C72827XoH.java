package X;

/* renamed from: X.XoH, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C72827XoH {
    public final /* synthetic */ YRH A00;
    public final /* synthetic */ Y2I A01;
    public final /* synthetic */ C72172XRg A02;

    public C72827XoH(YRH yrh, Y2I y2i, C72172XRg c72172XRg) {
        this.A01 = y2i;
        this.A00 = yrh;
        this.A02 = c72172XRg;
    }

    public final void A00(Throwable th) {
        Y2I y2i = this.A01;
        y2i.A0L.DEV(7);
        y2i.A0J.A04(this.A02);
        y2i.A0G.post(new YH8(this, th));
        y2i.A0W = false;
    }
}
