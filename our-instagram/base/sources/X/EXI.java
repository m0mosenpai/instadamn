package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.igds.components.button.IgdsRadioButton;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;

/* loaded from: classes6.dex */
public final class EXI extends AbstractC66412zI {
    public final InterfaceC11380iw A00;
    public final FFM A01;

    public EXI(InterfaceC11380iw interfaceC11380iw, FFM ffm) {
        C14360o3.A0B(ffm, 2);
        this.A00 = interfaceC11380iw;
        this.A01 = ffm;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        return new E3G(AbstractC25227BEk.A0D(AbstractC31177DnL.A0E(viewGroup, 0), viewGroup, R.layout.direct_channels_xposting_selection_item_view, false));
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C36209FyN c36209FyN = (C36209FyN) interfaceC66482zP;
        E3G e3g = (E3G) c3oo;
        AbstractC167007dF.A1K(c36209FyN, e3g);
        GradientSpinnerAvatarView gradientSpinnerAvatarView = e3g.A04;
        Context context = gradientSpinnerAvatarView.getContext();
        TextView textView = e3g.A01;
        textView.setText(c36209FyN.A01);
        TextView textView2 = e3g.A02;
        String str = c36209FyN.A02;
        if (str == null) {
            str = AbstractC166997dE.A0p(context, 2131958826);
        }
        textView2.setText(str);
        IgdsRadioButton igdsRadioButton = e3g.A03;
        igdsRadioButton.setChecked(c36209FyN.A05);
        gradientSpinnerAvatarView.A0F(null, this.A00, c36209FyN.A00);
        gradientSpinnerAvatarView.A0B(context.getResources().getDimensionPixelSize(R.dimen.add_to_story_dual_destination_share_sheet_avatar_icon_size), 0);
        gradientSpinnerAvatarView.A05();
        Drawable drawable = context.getDrawable(R.drawable.facebook_user_badge_15);
        if (drawable != null) {
            gradientSpinnerAvatarView.setBottomBadgeDrawable(drawable);
        }
        gradientSpinnerAvatarView.A00 = context.getResources().getDimension(R.dimen.abc_control_corner_material);
        gradientSpinnerAvatarView.A01 = AbstractC31173DnH.A00(context, R.dimen.abc_control_corner_material);
        if (!c36209FyN.A04 && !c36209FyN.A06) {
            igdsRadioButton.setEnabled(false);
            igdsRadioButton.setAlpha(0.3f);
            gradientSpinnerAvatarView.setAlpha(0.3f);
            int A09 = AbstractC167007dF.A09(context, R.attr.igds_color_primary_text_disabled);
            textView.setTextColor(A09);
            textView2.setTextColor(A09);
            return;
        }
        ViewOnClickListenerC35683FpI.A00(e3g.A00, 59, c36209FyN, this);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C36209FyN.class;
    }
}
