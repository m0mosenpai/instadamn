package X;

import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.6Sa, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C139196Sa extends C0T6 implements InterfaceC139206Sb {
    public final C115875Md A00;
    public final C47F A01;
    public final User A02;
    public final Boolean A03;
    public final Boolean A04;
    public final Boolean A05;
    public final Float A06;
    public final Float A07;
    public final Integer A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final List A0F;
    public final List A0G;
    public final List A0H;
    public final List A0I;
    public final List A0J;

    public C139196Sa(C115875Md c115875Md, C47F c47f, User user, Boolean bool, Boolean bool2, Boolean bool3, Float f, Float f2, Integer num, String str, String str2, String str3, String str4, String str5, String str6, List list, List list2, List list3, List list4, List list5) {
        C14360o3.A0B(str, 1);
        C14360o3.A0B(str5, 15);
        C14360o3.A0B(user, 18);
        this.A09 = str;
        this.A0A = str2;
        this.A0B = str3;
        this.A01 = c47f;
        this.A03 = bool;
        this.A04 = bool2;
        this.A0C = str4;
        this.A05 = bool3;
        this.A0F = list;
        this.A08 = num;
        this.A0G = list2;
        this.A0H = list3;
        this.A00 = c115875Md;
        this.A06 = f;
        this.A0D = str5;
        this.A0I = list4;
        this.A0J = list5;
        this.A02 = user;
        this.A0E = str6;
        this.A07 = f2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C139196Sa) {
                C139196Sa c139196Sa = (C139196Sa) obj;
                if (!C14360o3.A0K(this.A09, c139196Sa.A09) || !C14360o3.A0K(this.A0A, c139196Sa.A0A) || !C14360o3.A0K(this.A0B, c139196Sa.A0B) || !C14360o3.A0K(this.A01, c139196Sa.A01) || !C14360o3.A0K(this.A03, c139196Sa.A03) || !C14360o3.A0K(this.A04, c139196Sa.A04) || !C14360o3.A0K(this.A0C, c139196Sa.A0C) || !C14360o3.A0K(this.A05, c139196Sa.A05) || !C14360o3.A0K(this.A0F, c139196Sa.A0F) || !C14360o3.A0K(this.A08, c139196Sa.A08) || !C14360o3.A0K(this.A0G, c139196Sa.A0G) || !C14360o3.A0K(this.A0H, c139196Sa.A0H) || !C14360o3.A0K(this.A00, c139196Sa.A00) || !C14360o3.A0K(this.A06, c139196Sa.A06) || !C14360o3.A0K(this.A0D, c139196Sa.A0D) || !C14360o3.A0K(this.A0I, c139196Sa.A0I) || !C14360o3.A0K(this.A0J, c139196Sa.A0J) || !C14360o3.A0K(this.A02, c139196Sa.A02) || !C14360o3.A0K(this.A0E, c139196Sa.A0E) || !C14360o3.A0K(this.A07, c139196Sa.A07)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.A09.hashCode() * 31;
        String str = this.A0A;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.A0B;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        C47F c47f = this.A01;
        int hashCode4 = (hashCode3 + (c47f == null ? 0 : c47f.hashCode())) * 31;
        Boolean bool = this.A03;
        int hashCode5 = (hashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.A04;
        int hashCode6 = (hashCode5 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str3 = this.A0C;
        int hashCode7 = (hashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool3 = this.A05;
        int hashCode8 = (hashCode7 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        List list = this.A0F;
        int hashCode9 = (hashCode8 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num = this.A08;
        int hashCode10 = (hashCode9 + (num == null ? 0 : num.hashCode())) * 31;
        List list2 = this.A0G;
        int hashCode11 = (hashCode10 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List list3 = this.A0H;
        int hashCode12 = (hashCode11 + (list3 == null ? 0 : list3.hashCode())) * 31;
        C115875Md c115875Md = this.A00;
        int hashCode13 = (hashCode12 + (c115875Md == null ? 0 : c115875Md.hashCode())) * 31;
        Float f = this.A06;
        int hashCode14 = (((hashCode13 + (f == null ? 0 : f.hashCode())) * 31) + this.A0D.hashCode()) * 31;
        List list4 = this.A0I;
        int hashCode15 = (hashCode14 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List list5 = this.A0J;
        int hashCode16 = (((hashCode15 + (list5 == null ? 0 : list5.hashCode())) * 31) + this.A02.hashCode()) * 31;
        String str4 = this.A0E;
        int hashCode17 = (hashCode16 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Float f2 = this.A07;
        return hashCode17 + (f2 != null ? f2.hashCode() : 0);
    }
}
