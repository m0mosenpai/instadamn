package X;

import com.instagram.common.typedurl.ImageUrl;
import java.util.List;

/* renamed from: X.MrQ, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51633MrQ extends C0T6 {
    public final int A00;
    public final int A01;
    public final C5QE A02;
    public final ImageUrl A03;
    public final ImageUrl A04;
    public final Integer A05;
    public final String A06;
    public final List A07;
    public final boolean A08;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51633MrQ) {
                C51633MrQ c51633MrQ = (C51633MrQ) obj;
                if (!C14360o3.A0K(this.A06, c51633MrQ.A06) || !C14360o3.A0K(this.A04, c51633MrQ.A04) || this.A00 != c51633MrQ.A00 || this.A01 != c51633MrQ.A01 || !C14360o3.A0K(this.A02, c51633MrQ.A02) || !C14360o3.A0K(this.A03, c51633MrQ.A03) || !C14360o3.A0K(this.A07, c51633MrQ.A07) || this.A05 != c51633MrQ.A05 || this.A08 != c51633MrQ.A08) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str;
        int A0J = AbstractC166997dE.A0J(this.A07, (AbstractC166997dE.A0J(this.A02, ((((((AbstractC167017dG.A0O(this.A06) * 31) + AbstractC167017dG.A0M(this.A04)) * 31) + this.A00) * 31) + this.A01) * 31) + AbstractC166997dE.A0I(this.A03)) * 31);
        int intValue = this.A05.intValue();
        if (1 != intValue) {
            str = "PARAGRAPH";
        } else {
            str = "LIST";
        }
        return AbstractC166987dD.A0K(this.A08, AbstractC25231BEo.A0H(str, intValue, A0J));
    }

    public C51633MrQ(C5QE c5qe, ImageUrl imageUrl, ImageUrl imageUrl2, Integer num, String str, List list, int i, int i2, boolean z) {
        this.A06 = str;
        this.A04 = imageUrl;
        this.A00 = i;
        this.A01 = i2;
        this.A02 = c5qe;
        this.A03 = imageUrl2;
        this.A07 = list;
        this.A05 = num;
        this.A08 = z;
    }
}
