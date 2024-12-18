package X;

/* loaded from: classes5.dex */
public final class BW8 implements InterfaceC31113Dlv {
    @Override // X.InterfaceC31113Dlv
    public final /* synthetic */ float AFH(float f, float f2, float f3) {
        float f4 = f2 + f;
        if ((f >= 0.0f && f4 <= f3) || (f < 0.0f && f4 > f3)) {
            return 0.0f;
        }
        float f5 = f4 - f3;
        if (Math.abs(f) < Math.abs(f5)) {
            return f;
        }
        return f5;
    }

    @Override // X.InterfaceC31113Dlv
    public final /* synthetic */ C5Y6 Bqy() {
        return BWK.A00;
    }
}
