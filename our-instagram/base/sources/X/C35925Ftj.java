package X;

import com.instagram.business.fragment.SuggestBusinessFragment;
import com.instagram.ui.widget.spinner.SpinnerImageView;

/* renamed from: X.Ftj, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35925Ftj implements InterfaceC37146GYh {
    public final /* synthetic */ SuggestBusinessFragment A00;

    public C35925Ftj(SuggestBusinessFragment suggestBusinessFragment) {
        this.A00 = suggestBusinessFragment;
    }

    @Override // X.InterfaceC37146GYh
    public final void Dqb() {
        AbstractC31181DnP.A0t(this.A00);
    }

    @Override // X.InterfaceC37146GYh
    public final void Dqc(ECM ecm) {
        SuggestBusinessFragment suggestBusinessFragment = this.A00;
        SuggestBusinessFragment.A01(suggestBusinessFragment);
        suggestBusinessFragment.A07 = ecm.A01;
        SpinnerImageView spinnerImageView = suggestBusinessFragment.mLoadingSpinner;
        if (spinnerImageView != null && suggestBusinessFragment.mBusinessNavBar != null) {
            spinnerImageView.setVisibility(8);
        }
        SuggestBusinessFragment.A02(suggestBusinessFragment);
    }
}
