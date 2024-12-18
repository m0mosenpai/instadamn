package X;

import android.content.Intent;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;

/* renamed from: X.Nqr, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC53801Nqr {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        boolean A1X = MSY.A1X(c6fw.A02());
        FragmentActivity A04 = C6BQ.A04(c6fq);
        if (A04 != null) {
            Intent A042 = AbstractC31171DnF.A04();
            A042.putExtra("EXTRA_IS_ONBOARDING_COMPLETE", !A1X);
            AbstractC31180DnO.A0y(A04, A042);
            A04.overridePendingTransition(R.anim.right_in, R.anim.left_out);
            return null;
        }
        return null;
    }
}
