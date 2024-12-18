package X;

/* renamed from: X.9ZU, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9ZU extends C0T6 {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public final int A04;

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    public C9ZU(int i, float f, float f2, float f3, float f4) {
        this.A04 = i;
        switch (i) {
            case 0:
                this.A01 = f;
                this.A03 = f2;
                this.A00 = f3;
                this.A02 = f4;
                return;
            case 1:
                this.A02 = f;
                this.A00 = f2;
                this.A03 = f3;
                this.A01 = f4;
                return;
            case 2:
                this.A01 = f;
                this.A03 = f2;
                this.A02 = f3;
                this.A00 = f4;
                return;
            default:
                this.A00 = f;
                this.A01 = f2;
                this.A03 = f3;
                this.A02 = f4;
                return;
        }
    }

    public final boolean equals(Object obj) {
        float f;
        float f2;
        switch (this.A04) {
            case 0:
                if (this != obj) {
                    if (!(obj instanceof C9ZU)) {
                        return false;
                    }
                    C9ZU c9zu = (C9ZU) obj;
                    if (c9zu.A04 != 0 || !C119145aW.A01(this.A01, c9zu.A01) || !C119145aW.A01(this.A03, c9zu.A03) || !C119145aW.A01(this.A00, c9zu.A00) || !C119145aW.A01(this.A02, c9zu.A02)) {
                        return false;
                    }
                    return true;
                }
                return true;
            case 1:
                if (this != obj) {
                    if (!(obj instanceof C9ZU)) {
                        return false;
                    }
                    C9ZU c9zu2 = (C9ZU) obj;
                    if (c9zu2.A04 != 1 || Float.compare(this.A02, c9zu2.A02) != 0 || Float.compare(this.A00, c9zu2.A00) != 0 || Float.compare(this.A03, c9zu2.A03) != 0) {
                        return false;
                    }
                    f = this.A01;
                    f2 = c9zu2.A01;
                    break;
                } else {
                    return true;
                }
                break;
            case 2:
                if (this != obj) {
                    if (!(obj instanceof C9ZU)) {
                        return false;
                    }
                    C9ZU c9zu3 = (C9ZU) obj;
                    if (c9zu3.A04 != 2 || Float.compare(this.A01, c9zu3.A01) != 0 || Float.compare(this.A03, c9zu3.A03) != 0 || Float.compare(this.A02, c9zu3.A02) != 0) {
                        return false;
                    }
                    f = this.A00;
                    f2 = c9zu3.A00;
                    break;
                } else {
                    return true;
                }
                break;
            default:
                if (this != obj) {
                    if (obj instanceof C9ZU) {
                        C9ZU c9zu4 = (C9ZU) obj;
                        if (c9zu4.A04 == 3 && Float.compare(this.A00, c9zu4.A00) == 0 && Float.compare(this.A01, c9zu4.A01) == 0 && Float.compare(this.A03, c9zu4.A03) == 0) {
                            f = this.A02;
                            f2 = c9zu4.A02;
                            break;
                        } else {
                            return false;
                        }
                    } else {
                        return false;
                    }
                } else {
                    return true;
                }
                break;
        }
        if (Float.compare(f, f2) != 0) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A00;
        float f;
        int A002;
        float f2;
        switch (this.A04) {
            case 0:
                A002 = AbstractC166997dE.A00(Float.floatToIntBits(this.A01) * 31, this.A03);
                f2 = this.A00;
                A00 = AbstractC166997dE.A00(A002, f2);
                f = this.A02;
                break;
            case 1:
                A00 = AbstractC166997dE.A00(AbstractC166997dE.A00(Float.floatToIntBits(this.A02) * 31, this.A00), this.A03);
                f = this.A01;
                break;
            case 2:
                A00 = AbstractC166997dE.A00(AbstractC166997dE.A00(Float.floatToIntBits(this.A01) * 31, this.A03), this.A02);
                f = this.A00;
                break;
            default:
                A002 = AbstractC166997dE.A00(Float.floatToIntBits(this.A00) * 31, this.A01);
                f2 = this.A03;
                A00 = AbstractC166997dE.A00(A002, f2);
                f = this.A02;
                break;
        }
        return A00 + Float.floatToIntBits(f);
    }

    public final String toString() {
        StringBuilder A1C;
        float f;
        switch (this.A04) {
            case 2:
                A1C = AbstractC166987dD.A1C();
                A1C.append("DraftCropCoordinates(cropLeft=");
                A1C.append(this.A01);
                A1C.append(", cropTop=");
                A1C.append(this.A03);
                A1C.append(", cropRight=");
                A1C.append(this.A02);
                A1C.append(", cropBottom=");
                f = this.A00;
                break;
            case 3:
                A1C = AbstractC166987dD.A1C();
                A1C.append("MusicSoundwaveBounds(distanceOfCenterXToSticker=");
                A1C.append(this.A00);
                A1C.append(", distanceOfCenterYToSticker=");
                A1C.append(this.A01);
                A1C.append(", width=");
                A1C.append(this.A03);
                A1C.append(", height=");
                f = this.A02;
                break;
            default:
                return super.toString();
        }
        A1C.append(f);
        return AbstractC167017dG.A0p(A1C);
    }
}
