package X;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.OnLifecycleEvent;

/* renamed from: X.WQd, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70298WQd implements C07W {
    public final /* synthetic */ Fragment A00;
    public final /* synthetic */ WEV A01;
    public final /* synthetic */ boolean A02;

    public C70298WQd(Fragment fragment, WEV wev, boolean z) {
        this.A02 = z;
        this.A00 = fragment;
        this.A01 = wev;
    }

    @OnLifecycleEvent(C07R.ON_PAUSE)
    public final void onPause() {
        if (this.A02 || AbstractC68351VNl.A00(this.A00.getActivity())) {
            WEV wev = this.A01;
            WEV.A01(wev);
            wev.A05 = null;
        }
    }

    @OnLifecycleEvent(C07R.ON_RESUME)
    public final void onResume() {
        if (this.A02 || AbstractC68351VNl.A00(this.A00.getActivity())) {
            WEV wev = this.A01;
            FragmentActivity activity = this.A00.getActivity();
            if (activity != null && activity.getWindow() != null) {
                View A08 = AbstractC43592JPx.A08(activity);
                wev.A05 = A08;
                if (A08 != null && A08.getWindowToken() != null) {
                    WEV.A00(activity, wev);
                    return;
                }
                if (wev.A03 != null) {
                    return;
                }
                BJ6 bj6 = new BJ6(3, activity, wev);
                wev.A03 = bj6;
                View view = wev.A05;
                if (view != null) {
                    view.addOnAttachStateChangeListener(bj6);
                    return;
                }
                throw AbstractC166997dE.A0g();
            }
        }
    }
}
