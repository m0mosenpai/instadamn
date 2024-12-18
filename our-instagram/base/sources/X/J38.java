package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.facebook.R;
import com.instagram.genericsurvey.fragment.GenericSurveyFragment;
import com.instagram.ui.widget.spinner.SpinnerImageView;

/* loaded from: classes7.dex */
public final class J38 implements Runnable {
    public final /* synthetic */ GenericSurveyFragment A00;

    public J38(GenericSurveyFragment genericSurveyFragment) {
        this.A00 = genericSurveyFragment;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View view;
        GenericSurveyFragment genericSurveyFragment = this.A00;
        SpinnerImageView spinnerImageView = genericSurveyFragment.loadingSpinner;
        if (spinnerImageView != null) {
            spinnerImageView.setVisibility(8);
        }
        ViewGroup viewGroup = genericSurveyFragment.contentContainer;
        if (viewGroup != null) {
            viewGroup.setVisibility(8);
        }
        ViewGroup viewGroup2 = genericSurveyFragment.retryView;
        if (viewGroup2 == null) {
            ViewStub viewStub = genericSurveyFragment.retryViewStub;
            if (viewStub != null) {
                view = viewStub.inflate();
            } else {
                view = null;
            }
            if ((view instanceof ViewGroup) && (viewGroup2 = (ViewGroup) view) != null) {
                ViewOnClickListenerC42032Ik1.A01(viewGroup2.requireViewById(R.id.retry), 36, genericSurveyFragment);
            } else {
                viewGroup2 = null;
            }
        }
        genericSurveyFragment.retryView = viewGroup2;
        AbstractC167007dF.A0w(viewGroup2);
    }
}
