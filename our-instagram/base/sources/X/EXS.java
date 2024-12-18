package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;

/* loaded from: classes6.dex */
public final class EXS extends AbstractC66412zI {
    public final InterfaceC11380iw A00;
    public final InterfaceC37172GZj A01;
    public final UserSession A02;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v8, types: [android.text.SpannableStringBuilder] */
    /* JADX WARN: Type inference failed for: r2v1, types: [android.view.View] */
    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        String str;
        int i;
        float f;
        GradientSpinnerAvatarView gradientSpinnerAvatarView;
        C44O Ast;
        C36195Fy9 c36195Fy9 = (C36195Fy9) interfaceC66482zP;
        C31976E3e c31976E3e = (C31976E3e) c3oo;
        boolean A1a = AbstractC167017dG.A1a(c36195Fy9, c31976E3e);
        InterfaceC11380iw interfaceC11380iw = this.A00;
        C14360o3.A0B(interfaceC11380iw, 3);
        C44Q c44q = c36195Fy9.A00;
        String BAW = c44q.BAW();
        GradientSpinnerAvatarView gradientSpinnerAvatarView2 = c31976E3e.A06;
        String BAX = c44q.BAX();
        if (BAW == null) {
            gradientSpinnerAvatarView2.A0F(null, interfaceC11380iw, AbstractC25225BEi.A0t(BAX));
        } else {
            gradientSpinnerAvatarView2.A0G(null, interfaceC11380iw, AbstractC25225BEi.A0t(BAX), AbstractC25225BEi.A0t(c44q.BAW()));
        }
        gradientSpinnerAvatarView2.setGradientSpinnerVisible(false);
        Integer C7h = c44q.C7h();
        boolean z = true;
        if (C7h == null || C7h.intValue() != 29 || (Ast = c44q.Ast()) == null || Ast.AdZ() != 2) {
            z = false;
        }
        IgTextView igTextView = c31976E3e.A05;
        if (z) {
            ?? A0H = AbstractC25225BEi.A0H(c44q.getTitle());
            FVH.A01(AbstractC166997dE.A0L(igTextView), A0H, false, A1a, false);
            str = A0H;
        } else {
            str = c44q.getTitle();
        }
        AbstractC31171DnF.A15(igTextView, str);
        c31976E3e.A04.setText(c44q.getSubtitle());
        boolean z2 = c36195Fy9.A01;
        IgSimpleImageView igSimpleImageView = c31976E3e.A03;
        Context context = c31976E3e.A00;
        if (z2) {
            AbstractC166997dE.A19(context, igSimpleImageView, R.drawable.instagram_payments_icons_radio);
            i = R.attr.igds_color_controls;
        } else {
            AbstractC166997dE.A19(context, igSimpleImageView, R.drawable.unchecked);
            i = R.attr.igds_color_stroke;
        }
        igSimpleImageView.setColorFilter(AbstractC167007dF.A09(context, i));
        igSimpleImageView.setSelected(z2);
        Integer BYF = c44q.BYF();
        if (BYF != null && BYF.intValue() >= 250) {
            igSimpleImageView.setVisibility(4);
            f = 0.3f;
            gradientSpinnerAvatarView = gradientSpinnerAvatarView2;
        } else {
            igSimpleImageView.setVisibility(0);
            f = 1.0f;
            gradientSpinnerAvatarView = c31976E3e.A02;
        }
        gradientSpinnerAvatarView.setAlpha(f);
        FpQ.A01(c31976E3e.A01, 48, this, c36195Fy9);
    }

    public EXS(InterfaceC11380iw interfaceC11380iw, UserSession userSession, InterfaceC37172GZj interfaceC37172GZj) {
        AbstractC167017dG.A1Q(interfaceC37172GZj, userSession);
        this.A01 = interfaceC37172GZj;
        this.A00 = interfaceC11380iw;
        this.A02 = userSession;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC167017dG.A1N(viewGroup, layoutInflater);
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
        return new C31976E3e(AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.existing_thread_row, false));
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C36195Fy9.class;
    }
}
