package X;

import java.util.List;

/* renamed from: X.3xA, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C88523xA extends C0T6 {
    public final InterfaceC39571se A00;
    public final C38321qM A01;
    public final C38321qM A02;
    public final C39531sa A03;
    public final Boolean A04;
    public final Boolean A05;
    public final Boolean A06;
    public final Integer A07;
    public final Integer A08;
    public final Integer A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final List A0F;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C88523xA) {
                C88523xA c88523xA = (C88523xA) obj;
                if (!C14360o3.A0K(this.A03, c88523xA.A03) || !C14360o3.A0K(this.A04, c88523xA.A04) || !C14360o3.A0K(this.A07, c88523xA.A07) || !C14360o3.A0K(this.A0F, c88523xA.A0F) || !C14360o3.A0K(this.A0A, c88523xA.A0A) || !C14360o3.A0K(this.A08, c88523xA.A08) || !C14360o3.A0K(this.A0B, c88523xA.A0B) || !C14360o3.A0K(this.A0C, c88523xA.A0C) || !C14360o3.A0K(this.A05, c88523xA.A05) || !C14360o3.A0K(this.A06, c88523xA.A06) || !C14360o3.A0K(this.A00, c88523xA.A00) || !C14360o3.A0K(this.A01, c88523xA.A01) || !C14360o3.A0K(this.A02, c88523xA.A02) || !C14360o3.A0K(this.A0D, c88523xA.A0D) || !C14360o3.A0K(this.A0E, c88523xA.A0E) || !C14360o3.A0K(this.A09, c88523xA.A09)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        C39531sa c39531sa = this.A03;
        int hashCode = (c39531sa == null ? 0 : c39531sa.hashCode()) * 31;
        Boolean bool = this.A04;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num = this.A07;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        List list = this.A0F;
        int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.A0A;
        int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.A08;
        int hashCode6 = (hashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str2 = this.A0B;
        int hashCode7 = (hashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.A0C;
        int hashCode8 = (hashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool2 = this.A05;
        int hashCode9 = (hashCode8 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.A06;
        int hashCode10 = (hashCode9 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        InterfaceC39571se interfaceC39571se = this.A00;
        int hashCode11 = (hashCode10 + (interfaceC39571se == null ? 0 : interfaceC39571se.hashCode())) * 31;
        C38321qM c38321qM = this.A01;
        int hashCode12 = (hashCode11 + (c38321qM == null ? 0 : c38321qM.hashCode())) * 31;
        C38321qM c38321qM2 = this.A02;
        int hashCode13 = (hashCode12 + (c38321qM2 == null ? 0 : c38321qM2.hashCode())) * 31;
        String str4 = this.A0D;
        int hashCode14 = (hashCode13 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.A0E;
        int hashCode15 = (hashCode14 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num3 = this.A09;
        return hashCode15 + (num3 != null ? num3.hashCode() : 0);
    }

    public C88523xA(InterfaceC39571se interfaceC39571se, C38321qM c38321qM, C38321qM c38321qM2, C39531sa c39531sa, Boolean bool, Boolean bool2, Boolean bool3, Integer num, Integer num2, Integer num3, String str, String str2, String str3, String str4, String str5, List list) {
        this.A03 = c39531sa;
        this.A04 = bool;
        this.A07 = num;
        this.A0F = list;
        this.A0A = str;
        this.A08 = num2;
        this.A0B = str2;
        this.A0C = str3;
        this.A05 = bool2;
        this.A06 = bool3;
        this.A00 = interfaceC39571se;
        this.A01 = c38321qM;
        this.A02 = c38321qM2;
        this.A0D = str4;
        this.A0E = str5;
        this.A09 = num3;
    }
}
