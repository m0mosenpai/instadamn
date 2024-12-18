package X;

/* renamed from: X.L8r, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C47786L8r {
    public boolean A00;
    public final KLC A01;
    public InterfaceC60022ok volumeKeyListener;

    public C47786L8r(KLC klc) {
        C14360o3.A0B(klc, 1);
        this.A01 = klc;
    }

    public final void A00() {
        KLC klc = this.A01;
        if (klc.A04 != MXU.PAUSED) {
            klc.A04();
        }
    }

    public final void A01(boolean z) {
        this.A00 = z;
        KLC klc = this.A01;
        float f = 1.0f;
        if (z) {
            f = 0.0f;
        }
        klc.setVolume(f);
    }
}
