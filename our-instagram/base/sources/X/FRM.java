package X;

import com.instagram.common.typedurl.ImageUrl;
import java.util.Arrays;

/* loaded from: classes6.dex */
public final class FRM {
    public long A00;
    public ImageUrl A01;
    public C38321qM A02;
    public Boolean A03;
    public Boolean A04;
    public Long A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09 = "";
    public String A0A;
    public boolean A0B;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && AbstractC167017dG.A1Z(this, obj)) {
            return C14360o3.A0K(this.A08, ((FRM) obj).A08);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A08});
    }
}
