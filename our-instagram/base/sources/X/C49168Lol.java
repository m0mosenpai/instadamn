package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.R;
import com.instagram.feed.widget.IgProgressImageView;

/* renamed from: X.Lol, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49168Lol implements C7QD, C7QE, InterfaceC1581778c {
    public C7QH A00;
    public final ImageView A01;
    public final LinearLayout A02;
    public final ConstraintLayout A03;
    public final InterfaceC56392iX A04;
    public final InterfaceC56392iX A05;
    public final InterfaceC56392iX A06;
    public final IgProgressImageView A07;
    public final InterfaceC09390do A08;
    public final ImageView A09;
    public final InterfaceC56392iX A0A;
    public final InterfaceC56392iX A0B;
    public final InterfaceC56392iX A0C;
    public final InterfaceC09390do A0D;
    public final InterfaceC09390do A0E;

    public C49168Lol(View view) {
        C14360o3.A0B(view, 1);
        this.A02 = (LinearLayout) AbstractC166997dE.A0R(view, R.id.layered_xma_item_view);
        this.A0C = AbstractC31179DnN.A0M(view, R.id.legibility_gradient_header_stub);
        this.A03 = (ConstraintLayout) AbstractC166997dE.A0R(view, R.id.media_constraint_layout);
        View findViewById = view.findViewById(R.id.layered_xma_mention_reshare_cta_button_stub);
        this.A0A = findViewById != null ? AbstractC56372iV.A00(findViewById) : null;
        IgProgressImageView igProgressImageView = (IgProgressImageView) AbstractC166997dE.A0R(view, R.id.image);
        this.A07 = igProgressImageView;
        this.A0B = AbstractC166997dE.A0X(view, R.id.placeholder_layered_xma_reaction);
        this.A04 = AbstractC166997dE.A0X(view, R.id.gradient_spinner_stub);
        this.A05 = AbstractC166997dE.A0X(view, R.id.direct_persisted_layered_xma_label_stub);
        this.A06 = AbstractC166997dE.A0X(view, R.id.layered_xma_text);
        this.A09 = AbstractC31176DnK.A0D(view, R.id.doubletap_heart);
        this.A01 = AbstractC31176DnK.A0D(view, R.id.top_icon);
        this.A0E = C37059GUt.A01(this, 23);
        this.A08 = C37059GUt.A01(this, 24);
        this.A0D = MHU.A00(view, this, 11);
        igProgressImageView.getIgImageView().setScaleType(ImageView.ScaleType.CENTER_CROP);
    }

    @Override // X.InterfaceC1581778c
    public final ImageView Afy() {
        return this.A09;
    }

    @Override // X.C7QD
    public final View BKF() {
        return this.A02;
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
