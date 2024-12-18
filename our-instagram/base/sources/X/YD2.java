package X;

/* loaded from: classes12.dex */
public final class YD2 implements YOw {
    public final C72806XnT A00;

    @Override // X.YOw
    public final void AGF(Xl5 xl5) {
    }

    @Override // X.YOw
    public final void ELC(InterfaceC73607YNx interfaceC73607YNx, Xl5 xl5, AbstractC73413YCe abstractC73413YCe) {
        if (abstractC73413YCe != null) {
            throw AbstractC166987dD.A15("effectId");
        }
        Y3U y3u = this.A00.A01;
        if (y3u != null && !y3u.A01) {
            y3u.A01 = true;
            Object obj = y3u.A00.A00;
            if (obj != null) {
                ((YOw) obj).AGF(y3u.A03);
            }
            y3u.A00 = y3u.A02.EKx();
            Y3U.A00(y3u);
        }
        interfaceC73607YNx.DD3(null);
    }

    public YD2(C72806XnT c72806XnT) {
        this.A00 = c72806XnT;
    }
}
