package X;

/* renamed from: X.3KQ, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3KQ extends C3KR {
    public final boolean A00;
    public final boolean A01;
    public final boolean A02;
    public final boolean A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C3KQ) {
                C3KQ c3kq = (C3KQ) obj;
                if (this.A00 != c3kq.A00 || this.A02 != c3kq.A02 || this.A03 != c3kq.A03 || this.A01 != c3kq.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Viper2mConfig(isAdsEnabled=");
        sb.append(this.A00);
        sb.append(", isOrganicEnabled=");
        sb.append(this.A02);
        sb.append(", isVAIEnabled=");
        sb.append(this.A03);
        sb.append(", isFramebasedViewabilityEnabled=");
        sb.append(this.A01);
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        int i = 1237;
        if (this.A00) {
            i = 1231;
        }
        int i2 = i * 31;
        int i3 = 1237;
        if (this.A02) {
            i3 = 1231;
        }
        int i4 = (i2 + i3) * 31;
        int i5 = 1237;
        if (this.A03) {
            i5 = 1231;
        }
        int i6 = (i4 + i5) * 31;
        int i7 = 1237;
        if (this.A01) {
            i7 = 1231;
        }
        return i6 + i7;
    }

    public C3KQ(boolean z, boolean z2, boolean z3, boolean z4) {
        this.A00 = z;
        this.A02 = z2;
        this.A03 = z3;
        this.A01 = z4;
    }

    public C3KQ() {
        this(false, false, false, false);
    }
}
