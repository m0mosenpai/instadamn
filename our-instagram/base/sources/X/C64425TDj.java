package X;

/* renamed from: X.TDj, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64425TDj implements InterfaceC65524Tlt {
    public C63200Sf3 A00;
    public boolean A01 = false;
    public boolean A02 = false;
    public final C64418TDc A03;

    public C64425TDj(C64418TDc c64418TDc) {
        this.A03 = c64418TDc;
    }

    @Override // X.InterfaceC65524Tlt
    public final InterfaceC65524Tlt A7X(String str) {
        if (!this.A01) {
            this.A01 = true;
            this.A03.A05(this.A00, str, this.A02);
            return this;
        }
        throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
    }

    @Override // X.InterfaceC65524Tlt
    public final InterfaceC65524Tlt A7Y(boolean z) {
        if (!this.A01) {
            this.A01 = true;
            this.A03.A03(this.A00, z ? 1 : 0, this.A02);
            return this;
        }
        throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
    }
}
