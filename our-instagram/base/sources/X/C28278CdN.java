package X;

/* renamed from: X.CdN, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28278CdN {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05;
    public float A06;
    public float A07;
    public float A08;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C28278CdN) {
                C28278CdN c28278CdN = (C28278CdN) obj;
                if (Float.compare(this.A05, c28278CdN.A05) != 0 || Float.compare(this.A00, c28278CdN.A00) != 0 || Float.compare(this.A08, c28278CdN.A08) != 0 || Float.compare(this.A06, c28278CdN.A06) != 0 || Float.compare(this.A07, c28278CdN.A07) != 0 || Float.compare(this.A01, c28278CdN.A01) != 0 || Float.compare(this.A03, c28278CdN.A03) != 0 || Float.compare(this.A04, c28278CdN.A04) != 0 || Float.compare(this.A02, c28278CdN.A02) != 0) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC25226BEj.A01(AbstractC166997dE.A00(AbstractC166997dE.A00(AbstractC166997dE.A00(AbstractC166997dE.A00(AbstractC166997dE.A00(AbstractC166997dE.A00(AbstractC166997dE.A00(AbstractC25235BEs.A02(this.A05), this.A00), this.A08), this.A06), this.A07), this.A01), this.A03), this.A04), this.A02);
    }

    public C28278CdN(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
        this.A05 = f;
        this.A00 = f2;
        this.A08 = f3;
        this.A06 = f4;
        this.A07 = f5;
        this.A01 = f6;
        this.A03 = f7;
        this.A04 = f8;
        this.A02 = f9;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("SpeechIndicatorParameters(topRingAlpha=");
        A1C.append(this.A05);
        A1C.append(", backgroundRingAlpha=");
        A1C.append(this.A00);
        A1C.append(", topRingRotationAngleDiff=");
        A1C.append(this.A08);
        A1C.append(", topRingRotationAcceleration=");
        A1C.append(this.A06);
        A1C.append(", topRingRotationAccelerationFactor=");
        A1C.append(this.A07);
        A1C.append(", backgroundRingRotationAngleDiff=");
        A1C.append(this.A01);
        A1C.append(", pulseDiff=");
        A1C.append(this.A03);
        A1C.append(", ringWaveFactor=");
        A1C.append(this.A04);
        A1C.append(", gradientOffsetDiff=");
        A1C.append(this.A02);
        return AbstractC167017dG.A0p(A1C);
    }

    public C28278CdN() {
        this(0.5f, 1.0f, 2.0f, 0.0f, 0.0f, 0.0f, 0.001f, 0.0f, 0.0f);
    }
}
