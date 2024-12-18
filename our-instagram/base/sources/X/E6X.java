package X;

import com.instagram.model.mediasize.ImageInfo;
import com.instagram.user.model.User;
import java.util.List;

/* loaded from: classes6.dex */
public final class E6X extends C0T6 {
    public final E6P A00;
    public final ImageInfo A01;
    public final User A02;
    public final Integer A03;
    public final Integer A04;
    public final Integer A05;
    public final String A06;
    public final String A07;
    public final List A08;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof E6X) {
                E6X e6x = (E6X) obj;
                if (!C14360o3.A0K(this.A06, e6x.A06) || !C14360o3.A0K(this.A01, e6x.A01) || !C14360o3.A0K(this.A03, e6x.A03) || !C14360o3.A0K(this.A04, e6x.A04) || !C14360o3.A0K(this.A00, e6x.A00) || !C14360o3.A0K(this.A02, e6x.A02) || !C14360o3.A0K(this.A07, e6x.A07) || !C14360o3.A0K(this.A05, e6x.A05) || !C14360o3.A0K(this.A08, e6x.A08)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((((((((((((AbstractC167017dG.A0O(this.A06) * 31) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC167017dG.A0M(this.A03)) * 31) + AbstractC167017dG.A0M(this.A04)) * 31) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC167017dG.A0M(this.A02)) * 31) + AbstractC167017dG.A0O(this.A07)) * 31) + AbstractC167017dG.A0M(this.A05)) * 31) + AbstractC166997dE.A0I(this.A08);
    }

    public E6X(E6P e6p, ImageInfo imageInfo, User user, Integer num, Integer num2, Integer num3, String str, String str2, List list) {
        this.A06 = str;
        this.A01 = imageInfo;
        this.A03 = num;
        this.A04 = num2;
        this.A00 = e6p;
        this.A02 = user;
        this.A07 = str2;
        this.A05 = num3;
        this.A08 = list;
    }
}
