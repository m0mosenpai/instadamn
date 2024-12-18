package X;

import com.instagram.common.typedurl.SimpleImageUrl;
import java.util.List;

/* renamed from: X.Mt5, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51728Mt5 extends C0T6 {
    public final SimpleImageUrl A00;
    public final Boolean A01;
    public final Boolean A02;
    public final Boolean A03;
    public final Integer A04;
    public final Integer A05;
    public final Integer A06;
    public final String A07;
    public final List A08;
    public final List A09;
    public final List A0A;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51728Mt5) {
                C51728Mt5 c51728Mt5 = (C51728Mt5) obj;
                if (!C14360o3.A0K(this.A06, c51728Mt5.A06) || !C14360o3.A0K(this.A05, c51728Mt5.A05) || !C14360o3.A0K(this.A07, c51728Mt5.A07) || !C14360o3.A0K(this.A00, c51728Mt5.A00) || !C14360o3.A0K(this.A0A, c51728Mt5.A0A) || !C14360o3.A0K(this.A03, c51728Mt5.A03) || !C14360o3.A0K(this.A08, c51728Mt5.A08) || !C14360o3.A0K(this.A09, c51728Mt5.A09) || !C14360o3.A0K(this.A01, c51728Mt5.A01) || !C14360o3.A0K(this.A04, c51728Mt5.A04) || !C14360o3.A0K(this.A02, c51728Mt5.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public static boolean A00(C51728Mt5 c51728Mt5, Object obj, List list, C05A c05a) {
        Integer num = c51728Mt5.A06;
        Integer num2 = c51728Mt5.A05;
        String str = c51728Mt5.A07;
        SimpleImageUrl simpleImageUrl = c51728Mt5.A00;
        List list2 = c51728Mt5.A0A;
        Boolean bool = c51728Mt5.A03;
        List list3 = c51728Mt5.A09;
        Boolean bool2 = c51728Mt5.A01;
        Integer num3 = c51728Mt5.A04;
        Boolean bool3 = c51728Mt5.A02;
        C14360o3.A0B(list, 6);
        return c05a.AIi(obj, new C51728Mt5(simpleImageUrl, bool, bool2, bool3, num, num2, num3, str, list2, list, list3));
    }

    public final int hashCode() {
        return ((((((AbstractC166997dE.A0J(this.A08, ((((((((((AbstractC167017dG.A0M(this.A06) * 31) + AbstractC167017dG.A0M(this.A05)) * 31) + AbstractC167017dG.A0O(this.A07)) * 31) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC167017dG.A0M(this.A0A)) * 31) + AbstractC167017dG.A0M(this.A03)) * 31) + AbstractC167017dG.A0M(this.A09)) * 31) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC167017dG.A0M(this.A04)) * 31) + AbstractC166997dE.A0I(this.A02);
    }

    public C51728Mt5(SimpleImageUrl simpleImageUrl, Boolean bool, Boolean bool2, Boolean bool3, Integer num, Integer num2, Integer num3, String str, List list, List list2, List list3) {
        this.A06 = num;
        this.A05 = num2;
        this.A07 = str;
        this.A00 = simpleImageUrl;
        this.A0A = list;
        this.A03 = bool;
        this.A08 = list2;
        this.A09 = list3;
        this.A01 = bool2;
        this.A04 = num3;
        this.A02 = bool3;
    }

    public C51728Mt5() {
        this(null, null, null, AbstractC166997dE.A0b(), null, null, null, null, null, C16930sl.A00, null);
    }
}
