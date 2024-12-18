package X;

/* loaded from: classes12.dex */
public final class YDC implements InterfaceC73607YNx {
    public YOw A00;
    public boolean A01;
    public final /* synthetic */ Y3U A02;

    public YDC(YOw yOw, Y3U y3u) {
        this.A02 = y3u;
        this.A00 = yOw;
    }

    @Override // X.InterfaceC73607YNx
    public final void DD3(Object obj) {
        Y3U y3u = this.A02;
        if (!y3u.A01 && !this.A01) {
            this.A01 = true;
            Y3U.A01(y3u, obj);
        }
    }
}
