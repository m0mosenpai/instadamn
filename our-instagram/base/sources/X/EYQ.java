package X;

import android.content.Context;
import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.text.CustomTypefaceSpan;

/* loaded from: classes6.dex */
public final class EYQ extends AbstractC66422zJ {
    public final EOH A00;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC167007dF.A1K(viewGroup, layoutInflater);
        View inflate = layoutInflater.inflate(R.layout.follow_list_sorting_entry_row, viewGroup, false);
        ViewOnClickListenerC35685FpK.A01(inflate, 7, this);
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
        C14360o3.A0A(inflate);
        return new E1V(inflate);
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C32617EXr c32617EXr = (C32617EXr) interfaceC66482zP;
        E1V e1v = (E1V) c3oo;
        AbstractC167017dG.A1N(c32617EXr, e1v);
        Context A05 = AbstractC31172DnG.A05(e1v);
        String A0q = AbstractC166997dE.A0q(A05.getResources(), 2131953626);
        TextView textView = e1v.A00;
        Integer num = c32617EXr.A00;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int length = spannableStringBuilder.length();
        Typeface A0R = AbstractC167017dG.A0R(A05);
        if (A0R == null) {
            A0R = Typeface.DEFAULT_BOLD;
        }
        spannableStringBuilder.append((CharSequence) A0q).append((CharSequence) " ").append((CharSequence) A05.getString(F7O.A00(num))).setSpan(new CustomTypefaceSpan(A0R), length, spannableStringBuilder.length(), 33);
        textView.setText(spannableStringBuilder);
    }

    public EYQ(EOH eoh) {
        this.A00 = eoh;
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C32617EXr.class;
    }
}
