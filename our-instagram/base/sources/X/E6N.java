package X;

import com.instagram.common.typedurl.ImageUrl;

/* loaded from: classes6.dex */
public final class E6N extends C0T6 {
    public final ImageUrl A00;
    public final Integer A01;
    public final Object A02;
    public final String A03;
    public final String A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof E6N) {
                E6N e6n = (E6N) obj;
                if (!C14360o3.A0K(this.A00, e6n.A00) || !C14360o3.A0K(this.A03, e6n.A03) || !C14360o3.A0K(this.A04, e6n.A04) || this.A01 != e6n.A01 || !C14360o3.A0K(this.A02, e6n.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A0M = ((((AbstractC167017dG.A0M(this.A00) * 31) + AbstractC167017dG.A0O(this.A03)) * 31) + AbstractC167017dG.A0O(this.A04)) * 31;
        Integer num = this.A01;
        return AbstractC167017dG.A0L(num, FWG.A01(num), A0M) + AbstractC166997dE.A0I(this.A02);
    }

    public E6N(ImageUrl imageUrl, Integer num, Object obj, String str, String str2) {
        this.A00 = imageUrl;
        this.A03 = str;
        this.A04 = str2;
        this.A01 = num;
        this.A02 = obj;
    }
}
