package X;

/* renamed from: X.Y9c, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C73347Y9c implements YPm {
    public long A00;
    public C73348Y9d A01;
    public Long A02;
    public Y68 A03;
    public volatile boolean A06;
    public volatile boolean A07 = false;
    public final C72174XRi A05 = new C72174XRi(this);
    public final C197298o0 A04 = C197298o0.A01;

    @Override // X.YPm
    public final void Emf(C73348Y9d c73348Y9d) {
        this.A07 = false;
        this.A06 = true;
        this.A01 = c73348Y9d;
        this.A04.A00(this.A05);
    }

    @Override // X.YPm
    public final void stop() {
        this.A07 = true;
        this.A06 = false;
    }

    @Override // X.YPm
    public final void DII() {
        this.A04.A00(this.A05);
    }

    @Override // X.YPm
    public final Y68 CFD() {
        return this.A03;
    }

    @Override // X.YPm
    public final void DIE() {
    }

    @Override // X.YPm
    public final void Egs(Y68 y68) {
        this.A03 = y68;
    }
}
