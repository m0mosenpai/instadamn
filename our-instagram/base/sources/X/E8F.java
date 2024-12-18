package X;

import com.instagram.user.model.User;
import java.util.List;

/* loaded from: classes6.dex */
public final class E8F extends C0T6 implements XFS {
    public final User A00;
    public final Boolean A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final List A06;
    public final Boolean A07;
    public final Float A08;
    public final String A09;
    public final String A0A;
    public final List A0B;
    public final List A0C;
    public final List A0D;
    public final List A0E;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof E8F) {
                E8F e8f = (E8F) obj;
                if (!C14360o3.A0K(this.A02, e8f.A02) || !C14360o3.A0K(this.A09, e8f.A09) || !C14360o3.A0K(this.A01, e8f.A01) || !C14360o3.A0K(this.A0A, e8f.A0A) || !C14360o3.A0K(this.A03, e8f.A03) || !C14360o3.A0K(this.A07, e8f.A07) || !C14360o3.A0K(this.A0B, e8f.A0B) || !C14360o3.A0K(this.A0C, e8f.A0C) || !C14360o3.A0K(this.A0D, e8f.A0D) || !C14360o3.A0K(this.A04, e8f.A04) || !C14360o3.A0K(this.A06, e8f.A06) || !C14360o3.A0K(this.A0E, e8f.A0E) || !C14360o3.A0K(this.A00, e8f.A00) || !C14360o3.A0K(this.A05, e8f.A05) || !C14360o3.A0K(this.A08, e8f.A08)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((((((((((((((((((((((((AbstractC167017dG.A0O(this.A02) * 31) + AbstractC167017dG.A0O(this.A09)) * 31) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC167017dG.A0O(this.A0A)) * 31) + AbstractC167017dG.A0O(this.A03)) * 31) + AbstractC167017dG.A0M(this.A07)) * 31) + AbstractC167017dG.A0M(this.A0B)) * 31) + AbstractC167017dG.A0M(this.A0C)) * 31) + AbstractC167017dG.A0M(this.A0D)) * 31) + AbstractC167017dG.A0O(this.A04)) * 31) + AbstractC167017dG.A0M(this.A06)) * 31) + AbstractC167017dG.A0M(this.A0E)) * 31) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC167017dG.A0O(this.A05)) * 31) + AbstractC166997dE.A0I(this.A08);
    }

    public E8F(User user, Boolean bool, Boolean bool2, Float f, String str, String str2, String str3, String str4, String str5, String str6, List list, List list2, List list3, List list4, List list5) {
        this.A02 = str;
        this.A09 = str2;
        this.A01 = bool;
        this.A0A = str3;
        this.A03 = str4;
        this.A07 = bool2;
        this.A0B = list;
        this.A0C = list2;
        this.A0D = list3;
        this.A04 = str5;
        this.A06 = list4;
        this.A0E = list5;
        this.A00 = user;
        this.A05 = str6;
        this.A08 = f;
    }
}
