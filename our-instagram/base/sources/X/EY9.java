package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.facebook.R;

/* loaded from: classes6.dex */
public final class EY9 extends AbstractC66422zJ {
    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        C14360o3.A0B(viewGroup, 0);
        return new C31953E2h(FY8.A00(viewGroup));
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C32082E8g c32082E8g = (C32082E8g) interfaceC66482zP;
        C31953E2h c31953E2h = (C31953E2h) c3oo;
        AbstractC167017dG.A1N(c32082E8g, c31953E2h);
        FNF fnf = c31953E2h.A02;
        ViewGroup viewGroup = fnf.A00;
        Context context = viewGroup.getContext();
        int A03 = AbstractC167017dG.A03(context);
        TextView textView = fnf.A03;
        textView.setText(c32082E8g.A02);
        textView.setTextAppearance(R.style.control_option_title_text);
        TextView textView2 = fnf.A04;
        textView2.setText(c32082E8g.A03);
        textView2.setMaxLines(2);
        textView2.setLineSpacing(0.0f, 1.0f);
        fnf.A01.setVisibility(8);
        AbstractC31177DnL.A0x(textView, A03, textView.getPaddingTop());
        AbstractC31177DnL.A0x(textView2, A03, textView2.getPaddingTop());
        viewGroup.setMinimumHeight(context.getResources().getDimensionPixelSize(R.dimen.abc_list_item_height_material));
        viewGroup.setBackgroundResource(AbstractC53242c7.A0H(context, R.attr.backgroundDrawable));
        View A01 = c31953E2h.A01.A01();
        C14360o3.A07(A01);
        CompoundButton compoundButton = (CompoundButton) A01;
        compoundButton.setChecked(c32082E8g.A00);
        ViewOnClickListenerC35683FpI.A00(viewGroup, 24, compoundButton, c32082E8g);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C32082E8g.class;
    }
}
