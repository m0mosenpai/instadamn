package X;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.hallpass.model.HallPassViewModel;
import com.instagram.igds.components.button.IgdsRadioButton;

/* renamed from: X.EYr, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32643EYr extends AbstractC66422zJ {
    public View A00;
    public final Context A01;
    public final EOS A02;
    public final boolean A03;
    public final UserSession A04;

    public C32643EYr(Context context, UserSession userSession, EOS eos, boolean z) {
        C14360o3.A0B(userSession, 2);
        this.A01 = context;
        this.A04 = userSession;
        this.A03 = z;
        this.A02 = eos;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        int color;
        HallPassViewModel hallPassViewModel = (HallPassViewModel) interfaceC66482zP;
        C31978E3g c31978E3g = (C31978E3g) c3oo;
        AbstractC167007dF.A1K(hallPassViewModel, c31978E3g);
        Context context = this.A01;
        boolean z = this.A03;
        EOS eos = this.A02;
        AbstractC167007dF.A1G(context, 0, eos);
        int A01 = AbstractC13890nF.A01(context) / 2;
        IgTextView igTextView = c31978E3g.A05;
        igTextView.setText(hallPassViewModel.A05);
        ViewOnClickListenerC31591DuJ.A00(igTextView, 35, hallPassViewModel, eos);
        igTextView.setMaxWidth(A01);
        int i = 8;
        c31978E3g.A03.setVisibility(AbstractC31175DnJ.A01(z ? 1 : 0));
        c31978E3g.A02.setVisibility(AbstractC167007dF.A05(z ? 1 : 0));
        IgdsRadioButton igdsRadioButton = c31978E3g.A06;
        if (z) {
            i = 0;
        }
        igdsRadioButton.setVisibility(i);
        igdsRadioButton.setChecked(hallPassViewModel.A00);
        ViewOnClickListenerC31591DuJ.A00(c31978E3g.A00, 36, hallPassViewModel, eos);
        String str = hallPassViewModel.A03;
        if (AbstractC25225BEi.A1Y(str)) {
            color = Color.parseColor(str);
        } else {
            color = context.getColor(R.color.igds_gradient_lavender);
        }
        int A04 = AbstractC13950nL.A04(color);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(context.getResources().getDimensionPixelSize(R.dimen.accent_edge_thickness));
        gradientDrawable.setColor(color);
        igTextView.setTextColor(A04);
        c31978E3g.A01.setBackground(gradientDrawable);
        IgTextView igTextView2 = c31978E3g.A04;
        igTextView2.setText(AbstractC167017dG.A0k(context.getResources(), hallPassViewModel.A01, R.plurals.hall_pass_followers_count));
        ViewOnClickListenerC31591DuJ.A00(igTextView2, 34, hallPassViewModel, eos);
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC167017dG.A1N(viewGroup, layoutInflater);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.layout_hall_pass_row_item, false);
        this.A00 = A0R;
        return new C31978E3g(A0R);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return HallPassViewModel.class;
    }
}
