package X;

/* renamed from: X.6MV, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6MV {
    public final float A00;
    public final float A01;
    public final InterfaceC1128957x A02;

    public static final double A00(C6MV c6mv, float f) {
        return Math.log((Math.abs(f) * 0.35f) / (c6mv.A00 * c6mv.A01));
    }

    public C6MV(InterfaceC1128957x interfaceC1128957x, float f) {
        this.A00 = f;
        this.A02 = interfaceC1128957x;
        float Awk = interfaceC1128957x.Awk();
        float f2 = C6MW.A00;
        this.A01 = Awk * 386.0878f * 160.0f * 0.84f;
    }
}
