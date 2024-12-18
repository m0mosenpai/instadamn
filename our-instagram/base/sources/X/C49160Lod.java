package X;

import android.view.View;
import android.widget.ImageView;
import com.facebook.R;
import com.instagram.feed.widget.IgProgressImageView;

/* renamed from: X.Lod, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49160Lod implements C7QD, C7QE, InterfaceC1581778c {
    public L7B A00;
    public C7QH A01;
    public final View A02;
    public final IgProgressImageView A03;
    public final ImageView A04;

    public C49160Lod(View view) {
        C14360o3.A0B(view, 1);
        this.A02 = AbstractC166987dD.A0c(view, R.id.static_sticker_container);
        this.A03 = (IgProgressImageView) AbstractC166987dD.A0c(view, R.id.image);
        this.A04 = (ImageView) AbstractC166987dD.A0c(view, R.id.doubletap_heart);
    }

    @Override // X.InterfaceC1581778c
    public final ImageView Afy() {
        return this.A04;
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
