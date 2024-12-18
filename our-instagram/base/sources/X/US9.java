package X;

/* loaded from: classes11.dex */
public final class US9 extends C0T6 implements Comparable {
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
            if (obj instanceof US9) {
                US9 us9 = (US9) obj;
                if (!C14360o3.A0K(this.A06, us9.A06) || Float.compare(this.A00, us9.A00) != 0 || this.A04 != us9.A04 || this.A02 != us9.A02 || this.A07 != us9.A07 || this.A03 != us9.A03 || Float.compare(this.A01, us9.A01) != 0 || !C14360o3.A0K(this.A05, us9.A05)) {
                }
            }
            return false;
        }
        return true;
    }

    public US9() {
        String A0n = AbstractC166997dE.A0n();
        C14360o3.A0B(A0n, 8);
        this.A06 = "";
        this.A00 = 0.0f;
        this.A04 = 0;
        this.A02 = 0;
        this.A07 = false;
        this.A03 = 0;
        this.A01 = 1.0f;
        this.A05 = A0n;
    }

    public final int A00() {
        return ((int) (this.A04 / this.A01)) + this.A03;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return C14360o3.A00(((int) (this.A04 / this.A01)) + this.A03, ((Number) obj).intValue());
    }

    public final int hashCode() {
        return AbstractC166997dE.A00((AbstractC167007dF.A0D(this.A07, (((AbstractC166997dE.A00(this.A06.hashCode() * 31, this.A00) + this.A04) * 31) + this.A02) * 31) + this.A03) * 31, this.A01) + this.A05.hashCode();
    }
}
