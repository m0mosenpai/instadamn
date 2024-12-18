package X;

import java.util.HashMap;
import java.util.List;

/* renamed from: X.4yB, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C110394yB extends C0T6 implements InterfaceC110404yC {
    public final InterfaceC39571se A00;
    public final Boolean A01;
    public final Integer A02;
    public final Integer A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final List A07;
    public final Boolean A08;
    public final String A09;
    public final HashMap A0A;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C110394yB) {
                C110394yB c110394yB = (C110394yB) obj;
                if (!C14360o3.A0K(this.A04, c110394yB.A04) || !C14360o3.A0K(this.A05, c110394yB.A05) || !C14360o3.A0K(this.A01, c110394yB.A01) || !C14360o3.A0K(this.A09, c110394yB.A09) || !C14360o3.A0K(this.A02, c110394yB.A02) || !C14360o3.A0K(this.A07, c110394yB.A07) || !C14360o3.A0K(this.A06, c110394yB.A06) || !C14360o3.A0K(this.A00, c110394yB.A00) || !C14360o3.A0K(this.A08, c110394yB.A08) || !C14360o3.A0K(this.A0A, c110394yB.A0A) || !C14360o3.A0K(this.A03, c110394yB.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.A04;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.A05;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.A01;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str3 = this.A09;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.A02;
        int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        List list = this.A07;
        int hashCode6 = (hashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        String str4 = this.A06;
        int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        InterfaceC39571se interfaceC39571se = this.A00;
        int hashCode8 = (hashCode7 + (interfaceC39571se == null ? 0 : interfaceC39571se.hashCode())) * 31;
        Boolean bool2 = this.A08;
        int hashCode9 = (hashCode8 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        HashMap hashMap = this.A0A;
        int hashCode10 = (hashCode9 + (hashMap == null ? 0 : hashMap.hashCode())) * 31;
        Integer num2 = this.A03;
        return hashCode10 + (num2 != null ? num2.hashCode() : 0);
    }

    public C110394yB(InterfaceC39571se interfaceC39571se, Boolean bool, Boolean bool2, Integer num, Integer num2, String str, String str2, String str3, String str4, HashMap hashMap, List list) {
        this.A04 = str;
        this.A05 = str2;
        this.A01 = bool;
        this.A09 = str3;
        this.A02 = num;
        this.A07 = list;
        this.A06 = str4;
        this.A00 = interfaceC39571se;
        this.A08 = bool2;
        this.A0A = hashMap;
        this.A03 = num2;
    }
}
