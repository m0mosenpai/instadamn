package X;

import android.os.Looper;
import java.util.Arrays;

/* renamed from: X.Vtq, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69695Vtq {
    public Looper A00;
    public C4R4 A01;
    public final C121745fS A02;

    public final WYZ A00() {
        C67624Utc c67624Utc;
        C4R4 c4r4 = this.A01;
        if (c4r4 != null) {
            c67624Utc = new C67624Utc(this.A00, c4r4);
        } else {
            c67624Utc = null;
        }
        return new WYZ(this.A02, new Utb((XC8[]) Arrays.copyOf(new XLB[]{c67624Utc, null}, 2)));
    }

    public final void A01(Looper looper, C4R4 c4r4) {
        this.A01 = c4r4;
        this.A00 = looper;
    }

    public C69695Vtq(C121745fS c121745fS) {
        this.A02 = c121745fS;
    }
}
