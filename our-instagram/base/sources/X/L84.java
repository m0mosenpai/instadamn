package X;

/* loaded from: classes8.dex */
public final class L84 {
    public CharSequence A01;
    public Integer A02;
    public Integer A03;
    public Integer A04;
    public Integer A05;
    public String A06;
    public boolean A07 = true;
    public int A00 = 3;

    public final C48319LZs A00() {
        CharSequence charSequence;
        if (this.A03 == null && (((charSequence = this.A01) == null || charSequence.length() == 0) && this.A02 == null)) {
            throw AbstractC166987dD.A12("Banners must have at least body text or action set.");
        }
        String str = this.A06;
        Integer num = this.A05;
        Integer num2 = this.A03;
        return new C48319LZs(this.A01, num, num2, this.A02, this.A04, str, this.A00, this.A07);
    }
}
