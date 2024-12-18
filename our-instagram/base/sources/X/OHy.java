package X;

import com.instagram.ui.widget.spinner.SpinnerImageView;

/* loaded from: classes9.dex */
public final class OHy {
    public final /* synthetic */ N5U A00;
    public final /* synthetic */ SpinnerImageView A01;

    public OHy(N5U n5u, SpinnerImageView spinnerImageView) {
        this.A00 = n5u;
        this.A01 = spinnerImageView;
    }

    public final void A00(boolean z) {
        N5U n5u = this.A00;
        SpinnerImageView spinnerImageView = this.A01;
        if (n5u.getContext() != null && n5u.isAdded()) {
            N5U.A08(n5u, z);
            spinnerImageView.setLoadingStatus(C3T1.SUCCESS);
            n5u.A02 = false;
            N5U.A05(n5u);
        }
    }
}
