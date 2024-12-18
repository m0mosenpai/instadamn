package X;

/* loaded from: classes11.dex */
public final class W5A {
    public float A00;
    public int A01;
    public Integer A02;
    public InterfaceC71984XDt A03;
    public final int A04;
    public final int A05;
    public final int A06;

    public final void A02(int i) {
        float f;
        float f2;
        if (i >= 0) {
            InterfaceC71984XDt interfaceC71984XDt = this.A03;
            int AYr = interfaceC71984XDt.AYr(i);
            if (AYr >= interfaceC71984XDt.Bd3() - 1) {
                this.A01 = AYr - 1;
                this.A02 = C05F.A0C;
                this.A00 = 1.0f;
                return;
            }
            this.A01 = AYr;
            int A00 = A00(AYr);
            int Bzm = interfaceC71984XDt.Bzm(this.A01);
            int i2 = Bzm + A00;
            int i3 = this.A04;
            int i4 = this.A05;
            float max = Math.max(1.0f, ((i3 + i4) + this.A06) / A00);
            int i5 = (int) (i3 / max);
            int i6 = (int) (i4 / max);
            int i7 = i - Bzm;
            if (i7 < i5) {
                this.A02 = C05F.A00;
                f = i7;
                f2 = i5;
            } else {
                int i8 = i2 - i6;
                if (i < i8) {
                    this.A02 = C05F.A01;
                    f = i - (Bzm + i5);
                    f2 = (i2 - Bzm) - (i5 + i6);
                } else {
                    this.A02 = C05F.A0C;
                    f = i - i8;
                    f2 = i6;
                }
            }
            this.A00 = f / f2;
            return;
        }
        throw new IllegalStateException(AnonymousClass001.A0c("PhraseProgressCalculator: invalid frame time ", " in calculate()", i));
    }

    private final int A00(int i) {
        InterfaceC71984XDt interfaceC71984XDt = this.A03;
        int Bd3 = interfaceC71984XDt.Bd3();
        if (i >= 0 && i < Bd3) {
            if (i == interfaceC71984XDt.Bd3() - 1) {
                return Integer.MAX_VALUE;
            }
            int Bzm = interfaceC71984XDt.Bzm(i);
            int i2 = i + 1;
            int Bzm2 = interfaceC71984XDt.Bzm(i2);
            int max = Math.max(Bzm2 - Bzm, 1);
            C18C.A0I(AbstractC167007dF.A1M(max), "%s: invalid phrase duration: %s in getPhraseDuration() for phrases: \"%s\" with start time: %s and \"%s\" with start time %s", "PhraseProgressCalculator", Integer.valueOf(max), interfaceC71984XDt.Bd2(i), Integer.valueOf(Bzm), interfaceC71984XDt.Bd2(i2), Integer.valueOf(Bzm2));
            return max;
        }
        throw new IllegalStateException(AnonymousClass001.A0n("PhraseProgressCalculator: invalid phrase index ", " for phrase count ", " in getPhraseDuration()", i, Bd3));
    }

    public final float A01(int i) {
        int Bd3 = this.A03.Bd3();
        if (i >= 0 && i < Bd3) {
            int A00 = A00(i);
            int i2 = this.A04;
            int i3 = this.A05;
            float f = A00;
            float max = Math.max(1.0f, ((i2 + i3) + this.A06) / f);
            return (A00 - (((int) (i2 / max)) + ((int) (i3 / max)))) / f;
        }
        throw new IllegalStateException(AnonymousClass001.A0n("PhraseProgressCalculator: invalid phrase index ", " for phrase count ", " in getPhraseActiveStateProgressVelocity()", i, Bd3));
    }

    public W5A(InterfaceC71984XDt interfaceC71984XDt, int i, int i2, int i3) {
        this.A03 = interfaceC71984XDt;
        this.A06 = i;
        this.A04 = i2;
        this.A05 = i3;
    }
}
