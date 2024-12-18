package X;

import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.Gyr, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38650Gyr extends C0T6 {
    public final InterfaceC39571se A00;
    public final User A01;
    public final Boolean A02;
    public final Integer A03;
    public final Integer A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final List A0A;
    public final List A0B;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C38650Gyr) {
                C38650Gyr c38650Gyr = (C38650Gyr) obj;
                if (!C14360o3.A0K(this.A05, c38650Gyr.A05) || !C14360o3.A0K(this.A03, c38650Gyr.A03) || !C14360o3.A0K(this.A0A, c38650Gyr.A0A) || !C14360o3.A0K(this.A06, c38650Gyr.A06) || !C14360o3.A0K(this.A00, c38650Gyr.A00) || !C14360o3.A0K(this.A07, c38650Gyr.A07) || !C14360o3.A0K(this.A0B, c38650Gyr.A0B) || !C14360o3.A0K(this.A02, c38650Gyr.A02) || !C14360o3.A0K(this.A01, c38650Gyr.A01) || !C14360o3.A0K(this.A08, c38650Gyr.A08) || !C14360o3.A0K(this.A09, c38650Gyr.A09) || !C14360o3.A0K(this.A04, c38650Gyr.A04)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((((((((((((((((((AbstractC167017dG.A0O(this.A05) * 31) + AbstractC167017dG.A0M(this.A03)) * 31) + AbstractC167017dG.A0M(this.A0A)) * 31) + AbstractC167017dG.A0O(this.A06)) * 31) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC167017dG.A0O(this.A07)) * 31) + AbstractC167017dG.A0M(this.A0B)) * 31) + AbstractC167017dG.A0M(this.A02)) * 31) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC167017dG.A0O(this.A08)) * 31) + AbstractC167017dG.A0O(this.A09)) * 31) + AbstractC166997dE.A0I(this.A04);
    }

    public C38650Gyr(InterfaceC39571se interfaceC39571se, User user, Boolean bool, Integer num, Integer num2, String str, String str2, String str3, String str4, String str5, List list, List list2) {
        this.A05 = str;
        this.A03 = num;
        this.A0A = list;
        this.A06 = str2;
        this.A00 = interfaceC39571se;
        this.A07 = str3;
        this.A0B = list2;
        this.A02 = bool;
        this.A01 = user;
        this.A08 = str4;
        this.A09 = str5;
        this.A04 = num2;
    }
}
