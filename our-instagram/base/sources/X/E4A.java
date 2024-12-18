package X;

import android.content.Context;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.ui.widget.gradientspinner.GradientSpinner;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;

/* loaded from: classes6.dex */
public final class E4A extends C3OO implements C3Ow {
    public final View A00;
    public final LinearLayout A01;
    public final IgTextView A02;
    public final IgImageView A03;
    public final GradientSpinnerAvatarView A04;
    public final Context A05;

    @Override // X.C3Ow
    public final boolean Ejh() {
        return true;
    }

    @Override // X.C3Ow
    /* renamed from: AeS */
    public final RectF Ahl() {
        return AbstractC13880nE.A0G(this.A04);
    }

    @Override // X.InterfaceC72963Ox
    public final /* synthetic */ RectF Ahl() {
        return AbstractC13880nE.A0G(this.A04);
    }

    @Override // X.C3Ow
    public final GradientSpinner Blo() {
        return this.A04.A0O;
    }

    @Override // X.C3Ow
    public final void CMM() {
        this.A04.setVisibility(4);
    }

    @Override // X.C3Ow
    public final void EkR(InterfaceC11380iw interfaceC11380iw) {
        this.A04.setVisibility(0);
    }

    public E4A(View view) {
        super(view);
        this.A05 = AbstractC166997dE.A0L(view);
        this.A00 = AbstractC166997dE.A0S(view, R.id.grid_view_action_pog_avatar_container);
        this.A04 = AbstractC31176DnK.A0f(view, R.id.grid_view_action_pog_avatar_view);
        this.A02 = AbstractC25231BEo.A0d(view, R.id.grid_view_action_pog_text_view);
        this.A01 = (LinearLayout) AbstractC166997dE.A0R(view, R.id.grid_view_action_label_container);
        View requireViewById = view.requireViewById(R.id.grid_view_action_pog_chevron);
        IgImageView igImageView = (IgImageView) requireViewById;
        Drawable A00 = AbstractC13620mo.A00(igImageView.getContext(), R.drawable.instagram_chevron_right_pano_outline_12);
        C14360o3.A07(A00);
        igImageView.setImageDrawable(A00);
        C14360o3.A07(requireViewById);
        this.A03 = igImageView;
    }

    @Override // X.C3Ow
    public final View Aek() {
        return this.A04;
    }
}
