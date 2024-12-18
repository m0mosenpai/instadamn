package X;

/* renamed from: X.JlA, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44443JlA extends VK3 {
    public float A00 = 1.0f;
    public final C74843Xy A01 = new C74843Xy();

    @Override // X.VK3
    public final /* bridge */ /* synthetic */ float A00(Object obj) {
        return this.A00;
    }

    @Override // X.VK3
    public final /* bridge */ /* synthetic */ void A01(Object obj, float f) {
        InterfaceC162347Ow interfaceC162347Ow = (InterfaceC162347Ow) obj;
        C14360o3.A0B(interfaceC162347Ow, 0);
        this.A00 = f;
        C74843Xy c74843Xy = this.A01;
        float[] fArr = interfaceC162347Ow.C0D().A01;
        float f2 = fArr[0];
        for (int i = 1; i < fArr.length; i++) {
            float f3 = fArr[i];
            if (f3 > f2) {
                f2 = f3;
            }
        }
        c74843Xy.A06(f2);
        interfaceC162347Ow.FCi(c74843Xy, this.A00);
    }
}
