package X;

import android.view.View;
import android.widget.ImageView;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerMediaFrameLayout;

/* renamed from: X.Loi, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49165Loi implements C7QD, C7QE, InterfaceC1581778c {
    public C47349Kvy A00;
    public L7B A01;
    public Runnable A02;
    public C7QH A03;
    public final IgImageView A04;
    public final InterfaceC56392iX A05;
    public final InterfaceC56392iX A06;
    public final RoundedCornerMediaFrameLayout A07;
    public final Runnable A08;
    public final ImageView A09;

    public C49165Loi(View view) {
        C14360o3.A0B(view, 1);
        this.A07 = (RoundedCornerMediaFrameLayout) AbstractC166997dE.A0R(view, R.id.media_frame);
        this.A04 = AbstractC167007dF.A0T(view, R.id.animated_image);
        this.A06 = AbstractC166997dE.A0X(view, R.id.random_attribution_stub);
        this.A05 = AbstractC166997dE.A0X(view, R.id.giphy_attribution_stub);
        this.A08 = new M1D(this);
        View findViewById = view.findViewById(R.id.doubletap_heart);
        if (findViewById != null) {
            this.A09 = (ImageView) findViewById;
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.InterfaceC1581778c
    public final ImageView Afy() {
        return this.A09;
    }

    @Override // X.C7QD
    public final View BKF() {
        return this.A07;
    }

    @Override // X.C7QE
    public final C7QH BYl() {
        return this.A03;
    }

    @Override // X.C7QE
    public final void EZu(C7QH c7qh) {
        this.A03 = c7qh;
    }
}
