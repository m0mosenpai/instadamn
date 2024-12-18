package X;

/* renamed from: X.U7d, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66283U7d {
    public float A00;
    public float A01;
    public float A02;
    public final float A03;
    public final float A04;
    public final InterfaceC72009XEx A05;
    public final XE9 A06;

    public static final void A00(C66283U7d c66283U7d) {
        InterfaceC72009XEx interfaceC72009XEx = c66283U7d.A05;
        interfaceC72009XEx.Duy(c66283U7d.A01);
        float f = (c66283U7d.A00 * c66283U7d.A03) + (c66283U7d.A02 * c66283U7d.A04);
        interfaceC72009XEx.DvE(f);
        c66283U7d.A06.Dbk((c66283U7d.A01 * 0.4f) + (f * 0.6f));
    }

    public C66283U7d(InterfaceC72009XEx interfaceC72009XEx, XE9 xe9, boolean z) {
        this.A06 = xe9;
        this.A05 = interfaceC72009XEx;
        float f = z ? 0.0f : 0.1f;
        this.A03 = f;
        this.A04 = 1.0f - f;
    }
}
