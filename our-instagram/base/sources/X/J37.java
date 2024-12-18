package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.facebook.R;
import com.instagram.genericsurvey.fragment.AdBakeOffFragment;
import com.instagram.ui.widget.spinner.SpinnerImageView;

/* loaded from: classes7.dex */
public final class J37 implements Runnable {
    public final /* synthetic */ AdBakeOffFragment A00;

    public J37(AdBakeOffFragment adBakeOffFragment) {
        this.A00 = adBakeOffFragment;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AdBakeOffFragment adBakeOffFragment = this.A00;
        ViewGroup viewGroup = adBakeOffFragment.contentContainer;
        if (viewGroup != null) {
            viewGroup.setVisibility(8);
        }
        SpinnerImageView spinnerImageView = adBakeOffFragment.loadingSpinner;
        if (spinnerImageView != null) {
            spinnerImageView.setVisibility(8);
        }
        if (adBakeOffFragment.retryViewGroup == null) {
            ViewStub viewStub = adBakeOffFragment.retryViewStub;
            if (viewStub != null) {
                View inflate = viewStub.inflate();
                C14360o3.A0C(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
                ViewGroup viewGroup2 = (ViewGroup) inflate;
                adBakeOffFragment.retryViewGroup = viewGroup2;
                ViewOnClickListenerC42032Ik1.A01(viewGroup2.requireViewById(R.id.retry), 35, adBakeOffFragment);
            } else {
                throw AbstractC166987dD.A14("Required value was null.");
            }
        }
        ViewGroup viewGroup3 = adBakeOffFragment.retryViewGroup;
        if (viewGroup3 != null) {
            viewGroup3.setVisibility(0);
            return;
        }
        throw AbstractC166987dD.A14("Required value was null.");
    }
}
