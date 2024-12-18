package X;

import android.content.Context;
import android.content.res.Resources;
import androidx.fragment.app.Fragment;

/* loaded from: classes5.dex */
public abstract class BHX {
    public static final CharSequence A00(Context context, C5QE c5qe) {
        AbstractC167017dG.A1N(context, c5qe);
        return c5qe.A01(AbstractC166997dE.A0M(context));
    }

    public static final CharSequence A01(Resources resources, C5QE c5qe) {
        AbstractC167017dG.A1N(resources, c5qe);
        return c5qe.A01(resources);
    }

    public static final CharSequence A02(Fragment fragment, C5QE c5qe) {
        AbstractC167017dG.A1N(fragment, c5qe);
        Resources A0N = AbstractC166997dE.A0N(fragment);
        C14360o3.A07(A0N);
        return c5qe.A01(A0N);
    }

    public static String A03(Context context, C5QE c5qe) {
        return A00(context, c5qe).toString();
    }
}
