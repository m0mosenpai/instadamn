package X;

/* renamed from: X.W4f, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70108W4f {
    public Integer A00;
    public String A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07 = "undefined";
    public boolean A08;

    public static C66166U2h A00(Integer num, String str, String str2, String str3, String str4, String str5) {
        Long l;
        String str6 = str4;
        C14360o3.A0A(str2);
        if (str4 == null) {
            str6 = "";
        }
        C14360o3.A0A(str3);
        if (num != null) {
            l = Long.valueOf(num.intValue());
        } else {
            l = null;
        }
        return new C66166U2h(l, str2, str6, str5, str3, str, null, null, false);
    }

    public final C66166U2h A01() {
        Long l;
        String str = this.A03;
        C14360o3.A0A(str);
        String str2 = this.A05;
        if (str2 == null) {
            str2 = "";
        }
        String str3 = this.A07;
        String str4 = this.A04;
        C14360o3.A0A(str4);
        String str5 = this.A01;
        String str6 = this.A02;
        if (this.A00 != null) {
            l = Long.valueOf(r0.intValue());
        } else {
            l = null;
        }
        return new C66166U2h(l, str, str2, str3, str4, str5, str6, this.A06, this.A08);
    }
}
