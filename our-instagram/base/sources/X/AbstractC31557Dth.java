package X;

import android.view.View;
import androidx.fragment.app.Fragment;
import com.facebook.R;

/* renamed from: X.Dth, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC31557Dth {
    public static final void A00(View view, boolean z) {
        View findViewById;
        if (view != null && (findViewById = view.findViewById(R.id.listview_progressbar)) != null) {
            findViewById.setVisibility(AbstractC167007dF.A05(z ? 1 : 0));
        }
    }

    public static void A01(Fragment fragment, boolean z) {
        A00(fragment.mView, z);
    }
}
