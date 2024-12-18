package X;

import java.util.Arrays;
import java.util.List;

/* loaded from: classes8.dex */
public final class LGU {
    public static final LGU A03 = new LGU("", AbstractC166987dD.A1E());
    public final String A00;
    public final String A01 = AbstractC166997dE.A0n();
    public final List A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            LGU lgu = (LGU) obj;
            if (!AbstractC50102Ry.A00(lgu.A00, this.A00) || !AbstractC50102Ry.A00(lgu.A02, this.A02)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A02, this.A00});
    }

    public LGU(String str, List list) {
        this.A00 = str;
        this.A02 = list;
    }
}
