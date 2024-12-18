package X;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Build;

/* renamed from: X.11d, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC210211d {
    public static final void A00(Activity activity) {
        if (Build.VERSION.SDK_INT >= 29) {
            C210311e.A00(activity);
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new Fragment(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void A01(Activity activity, C07R c07r) {
        if (activity instanceof C07X) {
            C07T lifecycle = ((C07X) activity).getLifecycle();
            if (lifecycle instanceof C0eR) {
                ((C0eR) lifecycle).A0B(c07r);
            }
        }
    }
}
