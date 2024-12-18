package X;

import java.util.List;

/* renamed from: X.4gi, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C101264gi extends C0T6 {
    public final InterfaceC39571se A00;
    public final C54K A01;
    public final Boolean A02;
    public final Boolean A03;
    public final Integer A04;
    public final Integer A05;
    public final Integer A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final List A0B;
    public final List A0C;
    public final C37771pE A0D;
    public final Integer A0E;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C101264gi) {
                C101264gi c101264gi = (C101264gi) obj;
                if (!C14360o3.A0K(this.A0E, c101264gi.A0E) || !C14360o3.A0K(this.A01, c101264gi.A01) || !C14360o3.A0K(this.A07, c101264gi.A07) || !C14360o3.A0K(this.A04, c101264gi.A04) || !C14360o3.A0K(this.A02, c101264gi.A02) || !C14360o3.A0K(this.A08, c101264gi.A08) || !C14360o3.A0K(this.A00, c101264gi.A00) || !C14360o3.A0K(this.A03, c101264gi.A03) || !C14360o3.A0K(this.A0D, c101264gi.A0D) || !C14360o3.A0K(this.A0B, c101264gi.A0B) || !C14360o3.A0K(this.A0C, c101264gi.A0C) || !C14360o3.A0K(this.A09, c101264gi.A09) || !C14360o3.A0K(this.A0A, c101264gi.A0A) || !C14360o3.A0K(this.A05, c101264gi.A05) || !C14360o3.A0K(this.A06, c101264gi.A06)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Integer num = this.A0E;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        C54K c54k = this.A01;
        int hashCode2 = (hashCode + (c54k == null ? 0 : c54k.hashCode())) * 31;
        String str = this.A07;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.A04;
        int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool = this.A02;
        int hashCode5 = (hashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.A08;
        int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        InterfaceC39571se interfaceC39571se = this.A00;
        int hashCode7 = (hashCode6 + (interfaceC39571se == null ? 0 : interfaceC39571se.hashCode())) * 31;
        Boolean bool2 = this.A03;
        int hashCode8 = (hashCode7 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        C37771pE c37771pE = this.A0D;
        int hashCode9 = (hashCode8 + (c37771pE == null ? 0 : c37771pE.hashCode())) * 31;
        List list = this.A0B;
        int hashCode10 = (hashCode9 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.A0C;
        int hashCode11 = (hashCode10 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str3 = this.A09;
        int hashCode12 = (hashCode11 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.A0A;
        int hashCode13 = (hashCode12 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num3 = this.A05;
        int hashCode14 = (hashCode13 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.A06;
        return hashCode14 + (num4 != null ? num4.hashCode() : 0);
    }

    public C101264gi(InterfaceC39571se interfaceC39571se, C54K c54k, C37771pE c37771pE, Boolean bool, Boolean bool2, Integer num, Integer num2, Integer num3, Integer num4, String str, String str2, String str3, String str4, List list, List list2) {
        this.A0E = num;
        this.A01 = c54k;
        this.A07 = str;
        this.A04 = num2;
        this.A02 = bool;
        this.A08 = str2;
        this.A00 = interfaceC39571se;
        this.A03 = bool2;
        this.A0D = c37771pE;
        this.A0B = list;
        this.A0C = list2;
        this.A09 = str3;
        this.A0A = str4;
        this.A05 = num3;
        this.A06 = num4;
    }
}
