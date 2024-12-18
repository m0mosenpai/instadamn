package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.ui.widget.spinner.SpinnerImageView;

/* renamed from: X.GNb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC36880GNb implements Runnable {
    public final /* synthetic */ C67882V0n A00;
    public final /* synthetic */ C69645Vsm A01;

    public RunnableC36880GNb(C67882V0n c67882V0n, C69645Vsm c69645Vsm) {
        this.A00 = c67882V0n;
        this.A01 = c69645Vsm;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C67882V0n c67882V0n = this.A00;
        FragmentActivity activity = c67882V0n.getActivity();
        if (activity != null) {
            C9GR.A0F(activity, "could_not_load_canvas", 2131956845);
        }
        SpinnerImageView spinnerImageView = c67882V0n.A05;
        if (spinnerImageView == null) {
            C14360o3.A0F("spinnerImageView");
            throw C00O.createAndThrow();
        }
        spinnerImageView.setLoadingStatus(C3T1.FAILED);
    }
}
