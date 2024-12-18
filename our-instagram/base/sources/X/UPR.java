package X;

/* loaded from: classes11.dex */
public final class UPR extends C0T6 {
    public EnumC68149VDt A08 = null;
    public float A00 = 0.0f;
    public float A01 = 0.0f;
    public float A04 = 0.0f;
    public float A05 = 0.0f;
    public int A06 = 0;
    public float A02 = 0.0f;
    public float A03 = 0.0f;
    public UQ7 A07 = null;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof UPR) {
                UPR upr = (UPR) obj;
                if (this.A08 != upr.A08 || Float.compare(this.A00, upr.A00) != 0 || Float.compare(this.A01, upr.A01) != 0 || Float.compare(this.A04, upr.A04) != 0 || Float.compare(this.A05, upr.A05) != 0 || this.A06 != upr.A06 || Float.compare(this.A02, upr.A02) != 0 || Float.compare(this.A03, upr.A03) != 0 || !C14360o3.A0K(this.A07, upr.A07)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        int A00 = AbstractC166997dE.A00(AbstractC166997dE.A00((AbstractC166997dE.A00(AbstractC166997dE.A00(AbstractC166997dE.A00(AbstractC166997dE.A00(AbstractC167017dG.A0M(this.A08) * 31, this.A00), this.A01), this.A04), this.A05) + this.A06) * 31, this.A02), this.A03);
        UQ7 uq7 = this.A07;
        if (uq7 != null) {
            i = uq7.hashCode();
        }
        return A00 + i;
    }
}
