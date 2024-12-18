package X;

/* renamed from: X.2YM, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2YM implements C2W2 {
    public final C2YT A00;
    public final C2YP A01;

    @Override // X.C2W2
    public final /* synthetic */ C2W5 AF9(C78473fD c78473fD, long j) {
        return AbstractC135286Ad.A00(c78473fD, this, j);
    }

    @Override // X.C2W2
    public final C2W5 AF8(C78473fD c78473fD, int i, int i2) {
        Object obj = c78473fD.A02;
        c78473fD.A02 = null;
        final C2YU Cgz = this.A00.Cgz(new C2YR(c78473fD, obj), AbstractC78403f6.A00(i, i2));
        final C2YQ c2yq = this.A01.A02;
        return new C2W5() { // from class: X.3fc
            @Override // X.C2W5
            public final int Ang() {
                return 0;
            }

            @Override // X.C2W5
            public final C2W5 AnV(int i3) {
                throw new UnsupportedOperationException("A PrimitiveLayoutResult has no children");
            }

            @Override // X.C2W5
            public final Object BMS() {
                return Cgz.A02;
            }

            @Override // X.C2W5
            public final int Bat() {
                return 0;
            }

            @Override // X.C2W5
            public final int Bau() {
                return 0;
            }

            @Override // X.C2W5
            public final int Baw() {
                return 0;
            }

            @Override // X.C2W5
            public final int Bax() {
                return 0;
            }

            @Override // X.C2W5
            public final C2WC Bmi() {
                return C2WC.this;
            }

            @Override // X.C2W5
            public final int CI4(int i3) {
                throw new UnsupportedOperationException("A PrimitiveLayoutResult has no children");
            }

            @Override // X.C2W5
            public final int CIb(int i3) {
                throw new UnsupportedOperationException("A PrimitiveLayoutResult has no children");
            }

            @Override // X.C2W5
            public final int getHeight() {
                return Cgz.A00;
            }

            @Override // X.C2W5
            public final int getWidth() {
                return Cgz.A01;
            }
        };
    }

    public C2YM(C2YT c2yt, C2YP c2yp) {
        this.A00 = c2yt;
        this.A01 = c2yp;
    }
}
