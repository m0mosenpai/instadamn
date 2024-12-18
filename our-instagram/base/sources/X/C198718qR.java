package X;

/* renamed from: X.8qR, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C198718qR implements InterfaceC1809680y {
    public static final C1809780z A06 = new Object();
    public final InterfaceC198588q7 A00;
    public final C198548q3 A01;
    public final C198508pz A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;

    @Override // X.InterfaceC1809680y
    public final /* bridge */ /* synthetic */ C81D AMv() {
        C199728sO c199728sO = new C199728sO(this.A00, this.A01, this.A03, this.A05, this.A04);
        C198508pz c198508pz = this.A02;
        if (c198508pz != null) {
            c199728sO.A04 = new C197618oY(c198508pz.A00, c198508pz.A01);
        }
        return c199728sO;
    }

    @Override // X.InterfaceC1809680y
    public final C1809780z BKW() {
        return A06;
    }

    public C198718qR(InterfaceC198588q7 interfaceC198588q7, C198548q3 c198548q3, C198508pz c198508pz, boolean z, boolean z2, boolean z3) {
        this.A01 = c198548q3;
        this.A00 = interfaceC198588q7;
        this.A03 = z;
        this.A05 = z2;
        this.A04 = z3;
        this.A02 = c198508pz;
    }
}
