package X;

/* renamed from: X.4uY, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C108474uY extends C0T6 {
    public Integer A03 = null;
    public Integer A05 = null;
    public String A08 = null;
    public Integer A02 = null;
    public Boolean A00 = null;
    public Integer A01 = null;
    public String A07 = null;
    public Integer A06 = null;
    public Integer A04 = null;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C108474uY) {
                C108474uY c108474uY = (C108474uY) obj;
                if (!C14360o3.A0K(this.A03, c108474uY.A03) || !C14360o3.A0K(this.A05, c108474uY.A05) || !C14360o3.A0K(this.A08, c108474uY.A08) || !C14360o3.A0K(this.A02, c108474uY.A02) || !C14360o3.A0K(this.A00, c108474uY.A00) || !C14360o3.A0K(this.A01, c108474uY.A01) || !C14360o3.A0K(this.A07, c108474uY.A07) || !C14360o3.A0K(this.A06, c108474uY.A06) || !C14360o3.A0K(this.A04, c108474uY.A04)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Integer num = this.A03;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.A05;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.A08;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num3 = this.A02;
        int hashCode4 = (hashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Boolean bool = this.A00;
        int hashCode5 = (hashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num4 = this.A01;
        int hashCode6 = (hashCode5 + (num4 == null ? 0 : num4.hashCode())) * 31;
        String str2 = this.A07;
        int hashCode7 = (hashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num5 = this.A06;
        int hashCode8 = (hashCode7 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.A04;
        return hashCode8 + (num6 != null ? num6.hashCode() : 0);
    }
}
