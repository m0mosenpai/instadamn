package X;

/* renamed from: X.MsS, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51697MsS extends C0T6 {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public boolean A04;
    public final int A05;

    public C51697MsS(int i) {
        int i2;
        this.A05 = i;
        if (i != 0) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        this.A05 = i2;
        if (i2 != 0) {
            this.A02 = 0;
            this.A00 = 0;
            this.A03 = 0;
            this.A01 = 0;
        } else {
            this.A03 = 0;
            this.A00 = 0;
            this.A01 = 0;
            this.A02 = 0;
        }
        this.A04 = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean equals(Object obj) {
        int i;
        int i2;
        switch (this.A05) {
            case 1:
                if (this != obj) {
                    if (obj instanceof C51697MsS) {
                        C51697MsS c51697MsS = (C51697MsS) obj;
                        if (c51697MsS.A05 == 1 && this.A02 == c51697MsS.A02 && this.A00 == c51697MsS.A00 && this.A03 == c51697MsS.A03 && this.A01 == c51697MsS.A01) {
                            boolean z = this.A04;
                            i2 = c51697MsS.A04;
                            i = z;
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
            case 2:
                if (this != obj) {
                    if (obj instanceof C51697MsS) {
                        C51697MsS c51697MsS2 = (C51697MsS) obj;
                        if (c51697MsS2.A05 == 2 && this.A00 == c51697MsS2.A00 && this.A01 == c51697MsS2.A01 && this.A04 == c51697MsS2.A04 && this.A02 == c51697MsS2.A02) {
                            int i3 = this.A03;
                            i2 = c51697MsS2.A03;
                            i = i3;
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
            default:
                return super.equals(obj);
        }
        if (i != i2) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int i2;
        switch (this.A05) {
            case 1:
                i = ((((((this.A02 * 31) + this.A00) * 31) + this.A03) * 31) + this.A01) * 31;
                i2 = 1237;
                if (this.A04) {
                    i2 = 1231;
                    break;
                }
                break;
            case 2:
                i = (AbstractC167007dF.A0D(this.A04, ((this.A00 * 31) + this.A01) * 31) + this.A02) * 31;
                i2 = this.A03;
                break;
            default:
                return super.hashCode();
        }
        return i + i2;
    }

    public C51697MsS(boolean z, int i, int i2, int i3, int i4) {
        this.A05 = 2;
        this.A00 = i;
        this.A01 = i2;
        this.A04 = z;
        this.A02 = i3;
        this.A03 = i4;
    }
}
