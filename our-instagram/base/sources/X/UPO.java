package X;

/* loaded from: classes11.dex */
public final class UPO extends C0T6 {
    public float A00;
    public float A01;
    public int A02;
    public int A03;
    public int A04;
    public String A05;
    public String A06;
    public boolean A07;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof UPO) {
                UPO upo = (UPO) obj;
                if (!C14360o3.A0K(this.A06, upo.A06) || Float.compare(this.A00, upo.A00) != 0 || this.A04 != upo.A04 || this.A02 != upo.A02 || this.A07 != upo.A07 || this.A03 != upo.A03 || Float.compare(this.A01, upo.A01) != 0 || !C14360o3.A0K(this.A05, upo.A05)) {
                }
            }
            return false;
        }
        return true;
    }

    public UPO() {
        String A0j = AbstractC167017dG.A0j();
        this.A06 = "";
        this.A00 = 0.0f;
        this.A04 = 0;
        this.A02 = 0;
        this.A07 = false;
        this.A03 = 0;
        this.A01 = 1.0f;
        this.A05 = A0j;
    }

    public final int hashCode() {
        return AbstractC166997dE.A00((AbstractC167007dF.A0D(this.A07, (((AbstractC166997dE.A00(this.A06.hashCode() * 31, this.A00) + this.A04) * 31) + this.A02) * 31) + this.A03) * 31, this.A01) + this.A05.hashCode();
    }
}
