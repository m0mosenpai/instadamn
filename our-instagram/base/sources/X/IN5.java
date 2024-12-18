package X;

import com.instagram.common.typedurl.ImageUrl;
import java.util.Arrays;

/* loaded from: classes7.dex */
public final class IN5 {
    public int A00;
    public int A01;
    public ImageUrl A02;
    public String A03;
    public String A04;
    public String A05;

    public final boolean equals(Object obj) {
        if (!(obj instanceof IN5)) {
            return false;
        }
        IN5 in5 = (IN5) obj;
        if (!C14360o3.A0K(in5.A05, this.A05) || !C14360o3.A0K(in5.A03, this.A03) || !C14360o3.A0K(in5.A04, this.A04) || in5.A01 != this.A01 || in5.A00 != this.A00) {
            return false;
        }
        ImageUrl imageUrl = in5.A02;
        ImageUrl imageUrl2 = this.A02;
        if (imageUrl == null) {
            if (imageUrl2 != null) {
                return false;
            }
        } else if (imageUrl2 == null || !C14360o3.A0K(imageUrl.getUrl(), imageUrl2.getUrl())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A03, this.A04, this.A02, this.A05});
    }
}
