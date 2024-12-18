package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerFrameLayout;

/* renamed from: X.Lof, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49162Lof implements C7QD, C7QE, InterfaceC1581778c {
    public C7QH A00;
    public final ImageView A01;
    public final TextView A02;
    public final IgImageView A03;
    public final IgImageView A04;
    public final RoundedCornerFrameLayout A05;

    @Override // X.InterfaceC1581778c
    public final ImageView Afy() {
        return this.A01;
    }

    @Override // X.C7QD
    public final View BKF() {
        return this.A05;
    }

    @Override // X.C7QE
    public final C7QH BYl() {
        return this.A00;
    }

    @Override // X.C7QE
    public final void EZu(C7QH c7qh) {
        this.A00 = c7qh;
    }

    public C49162Lof(View view) {
        this.A05 = (RoundedCornerFrameLayout) view.requireViewById(R.id.foreground_container);
        this.A01 = AbstractC31173DnH.A0I(view, R.id.doubletap_heart);
        this.A04 = AbstractC31172DnG.A0Z(view, R.id.preview);
        this.A02 = AbstractC166997dE.A0T(view, R.id.title_text);
        this.A03 = AbstractC31172DnG.A0Z(view, R.id.icon);
    }
}
