package X;

/* loaded from: classes12.dex */
public final class Y3U {
    public C72865XpU A00;
    public boolean A01 = false;
    public final YOu A02;
    public final Xl5 A03;

    public static void A00(Y3U y3u) {
        C72865XpU c72865XpU = y3u.A00;
        if (c72865XpU.A01) {
            C72806XnT c72806XnT = y3u.A03.A00;
            c72806XnT.A02 = true;
            YDP A00 = C73296Xzl.A00(c72806XnT.A04.A04);
            A00.A00.remove(c72806XnT.A05);
            return;
        }
        YOw yOw = (YOw) c72865XpU.A00;
        if (yOw == null) {
            A01(y3u, null);
        } else {
            yOw.ELC(new YDC(yOw, y3u), y3u.A03, null);
        }
    }

    public static void A01(Y3U y3u, Object obj) {
        y3u.A00 = y3u.A02.Csq(obj);
        A00(y3u);
    }

    public Y3U(YOu yOu, Xl5 xl5) {
        this.A03 = xl5;
        this.A02 = yOu;
        A01(this, null);
    }
}
