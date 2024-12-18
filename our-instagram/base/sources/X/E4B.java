package X;

import android.graphics.RectF;
import android.view.View;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.ui.widget.gradientspinner.GradientSpinner;

/* loaded from: classes6.dex */
public final class E4B extends C3OO implements C3Ow {
    public final int A00;
    public final View.OnClickListener A01;
    public final View.OnClickListener A02;
    public final View A03;
    public final TextView A04;
    public final TextView A05;
    public final CircularImageView A06;
    public final InterfaceC56392iX A07;
    public final GradientSpinner A08;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E4B(View view, InterfaceC37290Gbr interfaceC37290Gbr, int i) {
        super(view);
        C14360o3.A0B(view, 1);
        this.A03 = AbstractC166997dE.A0S(view, R.id.icon);
        this.A06 = AbstractC31176DnK.A0U(view, R.id.avatar_image_view);
        this.A08 = (GradientSpinner) AbstractC166997dE.A0R(view, R.id.seen_state);
        this.A05 = AbstractC167007dF.A0N(view, R.id.row_title);
        this.A04 = AbstractC167007dF.A0N(view, R.id.row_subtitle);
        this.A00 = AbstractC31174DnI.A01(view.getContext());
        this.A07 = AbstractC166997dE.A0X(view, R.id.reel_glyph_stub);
        this.A01 = new ViewOnClickListenerC35688FpN(i, 0, interfaceC37290Gbr, this);
        this.A02 = new ViewOnClickListenerC35683FpI(33, interfaceC37290Gbr, this);
    }

    @Override // X.C3Ow
    public final boolean Ejh() {
        return true;
    }

    @Override // X.C3Ow
    /* renamed from: AeS */
    public final RectF Ahl() {
        return AbstractC13880nE.A0G(this.A06);
    }

    @Override // X.InterfaceC72963Ox
    public final /* synthetic */ RectF Ahl() {
        return AbstractC13880nE.A0G(this.A06);
    }

    @Override // X.C3Ow
    public final void CMM() {
        this.A06.setVisibility(4);
    }

    @Override // X.C3Ow
    public final void EkR(InterfaceC11380iw interfaceC11380iw) {
        this.A06.setVisibility(0);
    }

    @Override // X.C3Ow
    public final /* bridge */ /* synthetic */ View Aek() {
        return this.A06;
    }

    @Override // X.C3Ow
    public final GradientSpinner Blo() {
        return this.A08;
    }
}
