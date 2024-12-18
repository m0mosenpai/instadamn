package X;

/* renamed from: X.7CF, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7CF extends AbstractC160207Gg {
    public final int A00;
    public final C7FZ A01;
    public final C7FY A02;
    public final Integer A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;

    public C7CF(C7FZ c7fz, C7FY c7fy, Integer num, String str, String str2, String str3, int i) {
        String A0D;
        C14360o3.A0B(str, 1);
        C14360o3.A0B(c7fz, 4);
        C14360o3.A0B(c7fy, 5);
        this.A06 = str;
        this.A05 = str2;
        this.A00 = i;
        this.A01 = c7fz;
        this.A02 = c7fy;
        this.A03 = num;
        this.A07 = str3;
        this.A04 = (str3 == null || (A0D = AnonymousClass001.A0D(str3, c7fy.A00)) == null) ? str : A0D;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C7CF) {
                C7CF c7cf = (C7CF) obj;
                if (!C14360o3.A0K(this.A06, c7cf.A06) || !C14360o3.A0K(this.A05, c7cf.A05) || this.A00 != c7cf.A00 || this.A01 != c7cf.A01 || this.A02 != c7cf.A02 || !C14360o3.A0K(this.A03, c7cf.A03) || !C14360o3.A0K(this.A07, c7cf.A07)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = ((((((((this.A06.hashCode() * 31) + this.A05.hashCode()) * 31) + this.A00) * 31) + this.A01.hashCode()) * 31) + this.A02.hashCode()) * 31;
        Integer num = this.A03;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31 * 31;
        String str = this.A07;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }
}
