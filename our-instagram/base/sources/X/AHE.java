package X;

import com.instagram.common.typedurl.SimpleImageUrl;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class AHE {
    public String A00;
    public String A01;
    public boolean A02;

    public AHE(String str, String str2, boolean z) {
        C14360o3.A0B(str, 1);
        this.A01 = str;
        this.A00 = str2;
        this.A02 = z;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !AbstractC167017dG.A1Z(this, obj)) {
                return false;
            }
            AHE ahe = (AHE) obj;
            if (this.A02 != ahe.A02 || !C14360o3.A0K(A01(), ahe.A01()) || !C14360o3.A0K(this.A00, ahe.A00)) {
                return false;
            }
        }
        return true;
    }

    public final SimpleImageUrl A00() {
        String str = this.A00;
        if (str != null && str.length() != 0) {
            android.net.Uri A03 = AbstractC08820cl.A03(str);
            C14360o3.A07(A03);
            return AbstractC81033jX.A00(A03, -1, -1);
        }
        return null;
    }

    public final String A01() {
        String str = this.A01;
        if (str != null) {
            return str;
        }
        C14360o3.A0F("shortName");
        throw C00O.createAndThrow();
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{A01(), this.A00, Boolean.valueOf(this.A02)});
    }

    public AHE() {
    }
}
