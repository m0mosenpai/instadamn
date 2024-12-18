package X;

import android.util.Pair;
import android.view.View;

/* loaded from: classes6.dex */
public final class EZO extends C3PD {
    public final /* synthetic */ Pair A00;
    public final /* synthetic */ C36006Fv4 A01;

    public EZO(Pair pair, C36006Fv4 c36006Fv4) {
        this.A01 = c36006Fv4;
        this.A00 = pair;
    }

    @Override // X.C3PD, X.C3PE
    public final boolean DsE(View view) {
        C3DO c3do = C3DN.A00;
        C36006Fv4 c36006Fv4 = this.A01;
        C3DN A00 = c3do.A00(c36006Fv4.A02);
        if (A00 != null) {
            GHK.A00(A00, c36006Fv4, this.A00, 7);
            return true;
        }
        return true;
    }
}
