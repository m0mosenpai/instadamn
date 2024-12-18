package X;

import com.instagram.common.typedurl.ImageUrl;
import java.util.List;

/* renamed from: X.GyQ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38623GyQ extends C0T6 {
    public final ImageUrl A00;
    public final String A01;
    public final String A02;
    public final List A03;
    public final List A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C38623GyQ) {
                C38623GyQ c38623GyQ = (C38623GyQ) obj;
                if (!C14360o3.A0K(this.A00, c38623GyQ.A00) || !C14360o3.A0K(this.A03, c38623GyQ.A03) || !C14360o3.A0K(this.A04, c38623GyQ.A04) || !C14360o3.A0K(this.A01, c38623GyQ.A01) || !C14360o3.A0K(this.A02, c38623GyQ.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((AbstractC166997dE.A0J(this.A04, AbstractC166997dE.A0J(this.A03, AbstractC167017dG.A0M(this.A00) * 31)) + AbstractC167017dG.A0O(this.A01)) * 31) + AbstractC167017dG.A0O(this.A02)) * 31 * 31) + AbstractC53644Nnp.A00();
    }

    public C38623GyQ(ImageUrl imageUrl, String str, String str2, List list, List list2) {
        this.A00 = imageUrl;
        this.A03 = list;
        this.A04 = list2;
        this.A01 = str;
        this.A02 = str2;
    }
}
