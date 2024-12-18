package X;

import java.util.Arrays;
import java.util.HashMap;

/* loaded from: classes11.dex */
public final class W59 {
    public static final HashMap A06 = new HashMap();
    public long A00 = 0;
    public HashMap A03 = null;
    public HashMap A05 = null;
    public HashMap A04 = null;
    public HashMap A02 = null;
    public C69724VuJ A01 = null;

    public final boolean equals(Object obj) {
        if (!(obj instanceof W59)) {
            return false;
        }
        W59 w59 = (W59) obj;
        if (this.A00 != w59.A00 || !C14360o3.A0K(this.A03, w59.A03)) {
            return false;
        }
        return AbstractC25231BEo.A1Z(this.A05, w59.A05, false);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.A00), this.A03, this.A05});
    }
}
