package X;

import androidx.fragment.app.FragmentActivity;

/* loaded from: classes6.dex */
public final class GLM implements Runnable {
    public final /* synthetic */ EN8 A00;

    public GLM(EN8 en8) {
        this.A00 = en8;
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
