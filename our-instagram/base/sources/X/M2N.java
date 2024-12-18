package X;

import androidx.fragment.app.FragmentActivity;

/* loaded from: classes8.dex */
public final class M2N implements Runnable {
    public final /* synthetic */ N7M A00;

    public M2N(N7M n7m) {
        this.A00 = n7m;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C3DN A0r;
        FragmentActivity activity = this.A00.getActivity();
        if (activity != null && (A0r = AbstractC31172DnG.A0r(activity)) != null) {
            A0r.A0W(false);
        }
    }
}
