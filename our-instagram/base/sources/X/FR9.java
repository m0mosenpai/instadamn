package X;

import java.util.Arrays;

/* loaded from: classes6.dex */
public final class FR9 {
    public String A00;
    public String A01;
    public String A02;
    public String A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            FR9 fr9 = (FR9) obj;
            if (!C2I7.A00(this.A01, fr9.A01) || !C2I7.A00(this.A02, fr9.A02)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A01, this.A02});
    }
}
