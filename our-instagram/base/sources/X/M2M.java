package X;

import androidx.fragment.app.FragmentActivity;

/* loaded from: classes8.dex */
public final class M2M implements Runnable {
    public final /* synthetic */ N7L A00;

    public M2M(N7L n7l) {
        this.A00 = n7l;
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
