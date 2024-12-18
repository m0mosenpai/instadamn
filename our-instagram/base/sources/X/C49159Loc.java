package X;

import android.view.View;
import android.widget.ImageView;
import com.facebook.R;
import com.instagram.feed.widget.IgProgressImageView;
import com.instagram.ui.widget.framelayout.MediaFrameLayout;

/* renamed from: X.Loc, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49159Loc implements C7QD, C7QE, InterfaceC1581778c {
    public C7QH A00;
    public final InterfaceC56392iX A01;
    public final IgProgressImageView A02;
    public final MediaFrameLayout A03;
    public final ImageView A04;

    public C49159Loc(View view) {
        C14360o3.A0B(view, 1);
        this.A03 = (MediaFrameLayout) AbstractC166997dE.A0R(view, R.id.container);
        this.A02 = (IgProgressImageView) AbstractC166997dE.A0R(view, R.id.image);
        this.A01 = AbstractC166997dE.A0X(view, R.id.view_request_button_stub);
        this.A04 = AbstractC31176DnK.A0D(view, R.id.doubletap_heart);
    }

    @Override // X.InterfaceC1581778c
    public final ImageView Afy() {
        return this.A04;
    }

    @Override // X.C7QD
    public final View BKF() {
        return this.A03;
    }

    @Override // X.C7QE
    public final C7QH BYl() {
        return this.A00;
    }

    @Override // X.C7QE
    public final void EZu(C7QH c7qh) {
        this.A00 = c7qh;
    }
}
