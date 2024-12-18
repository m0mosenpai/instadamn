package X;

import java.util.Arrays;
import java.util.List;

/* loaded from: classes6.dex */
public final class FRG {
    public Boolean A00;
    public String A01;
    public String A02;
    public String A03;
    public String A04;
    public List A05;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FRG)) {
            return false;
        }
        FRG frg = (FRG) obj;
        return AbstractC50102Ry.A00(this.A02, frg.A02) && AbstractC50102Ry.A00(this.A01, frg.A01) && AbstractC50102Ry.A00(this.A03, frg.A03) && AbstractC50102Ry.A00(this.A04, frg.A04) && this.A00 == frg.A00 && AbstractC50102Ry.A00(this.A05, frg.A05);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A02, this.A01, this.A03, this.A04, this.A00, this.A05});
    }
}
