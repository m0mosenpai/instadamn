package X;

/* renamed from: X.7CG, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7CG extends AbstractC160207Gg {
    public final int A00;
    public final AbstractC162047No A01;
    public final C7FZ A02;
    public final C7FY A03;
    public final Integer A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final boolean A08;

    public C7CG(AbstractC162047No abstractC162047No, C7FZ c7fz, C7FY c7fy, Integer num, String str, String str2, String str3, int i) {
        C14360o3.A0B(c7fz, 4);
        C14360o3.A0B(c7fy, 5);
        this.A06 = str;
        this.A05 = str2;
        this.A00 = i;
        this.A02 = c7fz;
        this.A03 = c7fy;
        this.A04 = num;
        this.A01 = abstractC162047No;
        this.A08 = true;
        this.A07 = str3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C7CG) {
                C7CG c7cg = (C7CG) obj;
                if (!C14360o3.A0K(this.A06, c7cg.A06) || !C14360o3.A0K(this.A05, c7cg.A05) || this.A00 != c7cg.A00 || this.A02 != c7cg.A02 || this.A03 != c7cg.A03 || !C14360o3.A0K(this.A04, c7cg.A04) || !C14360o3.A0K(this.A01, c7cg.A01) || this.A08 != c7cg.A08 || !C14360o3.A0K(this.A07, c7cg.A07)) {
                }
            }
            return false;
        }
        return true;
    }

    public final String A07() {
        String str = this.A06;
        if (str.length() > 0 && str.charAt(0) == this.A03.A00) {
            return str;
        }
        return AnonymousClass001.A0D(str, this.A03.A00);
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = this.A06.hashCode() * 31;
        String str = this.A05;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int hashCode4 = (((((((hashCode3 + hashCode) * 31) + this.A00) * 31) + this.A02.hashCode()) * 31) + this.A03.hashCode()) * 31;
        Integer num = this.A04;
        if (num == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = num.hashCode();
        }
        int hashCode5 = (((hashCode4 + hashCode2) * 31) + this.A01.hashCode()) * 31;
        int i2 = 1237;
        if (this.A08) {
            i2 = 1231;
        }
        int i3 = (hashCode5 + i2) * 31;
        String str2 = this.A07;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return i3 + i;
    }
}
