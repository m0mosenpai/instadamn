package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;

/* loaded from: classes8.dex */
public final class KI0 extends AbstractC66412zI {
    public final InterfaceC11380iw A00;
    public final C7CC A01;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC31175DnJ.A1R(viewGroup, layoutInflater);
        return new C44698Jqh(AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.mention_item_row, false));
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C45189JzV c45189JzV = (C45189JzV) interfaceC66482zP;
        C44698Jqh c44698Jqh = (C44698Jqh) c3oo;
        AbstractC167007dF.A1K(c45189JzV, c44698Jqh);
        GradientSpinnerAvatarView gradientSpinnerAvatarView = c44698Jqh.A02;
        C1575075i c1575075i = c45189JzV.A00;
        gradientSpinnerAvatarView.A0F(null, this.A00, c1575075i.A01);
        gradientSpinnerAvatarView.setGradientSpinnerVisible(false);
        gradientSpinnerAvatarView.A0K.setScaleType(ImageView.ScaleType.FIT_CENTER);
        c44698Jqh.A00.setText(c1575075i.A09);
        LQ1.A00(c44698Jqh.itemView, 37, this, c45189JzV);
        String str = c1575075i.A0A;
        if (str != null && str.length() != 0) {
            TextView textView = c44698Jqh.A01;
            textView.setVisibility(0);
            textView.setText(str);
            C85963sQ.A0B(textView, c1575075i.A0D);
            return;
        }
        TextView textView2 = c44698Jqh.A01;
        textView2.setVisibility(8);
        C85963sQ.A0B(textView2, false);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C45189JzV.class;
    }

    public KI0(InterfaceC11380iw interfaceC11380iw, C7CC c7cc) {
        this.A00 = interfaceC11380iw;
        this.A01 = c7cc;
    }
}
