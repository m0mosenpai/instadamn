package X;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.LoZ, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49156LoZ implements C7QD, C7QE, InterfaceC1581778c {
    public ImageView A00;
    public C7QH A01;
    public final FrameLayout A02;
    public final IgImageView A03;

    public C49156LoZ(View view) {
        C14360o3.A0B(view, 1);
        this.A02 = (FrameLayout) AbstractC166997dE.A0R(view, R.id.image_container);
        this.A03 = AbstractC167007dF.A0T(view, R.id.animated_image);
        this.A00 = AbstractC31173DnH.A0I(view, R.id.doubletap_heart);
    }

    @Override // X.InterfaceC1581778c
    public final ImageView Afy() {
        return this.A00;
    }

    @Override // X.C7QD
    public final View BKF() {
        return this.A02;
    }

    @Override // X.C7QE
    public final C7QH BYl() {
        return this.A01;
    }

    @Override // X.C7QE
    public final void EZu(C7QH c7qh) {
        this.A01 = c7qh;
    }
}
