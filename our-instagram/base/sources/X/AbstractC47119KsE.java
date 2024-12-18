package X;

import android.widget.AbsListView;
import androidx.fragment.app.Fragment;

/* renamed from: X.KsE, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC47119KsE {
    public static final void A00(AbsListView absListView, Fragment fragment) {
        AbstractC167007dF.A1K(fragment, absListView);
        if (absListView.getCount() != 0 && absListView.getHeight() != 0) {
            absListView.smoothScrollToPosition(0);
            absListView.postDelayed(new RunnableC49974M4p(absListView, fragment), 100L);
        }
    }
}
