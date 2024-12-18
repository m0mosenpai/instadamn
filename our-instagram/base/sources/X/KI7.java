package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.R;

/* loaded from: classes8.dex */
public final class KI7 extends AbstractC66412zI {
    public final int A00;
    public final Context A01;
    public final C47401Kwq A02;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C48318LZr c48318LZr = (C48318LZr) interfaceC66482zP;
        C44673JqI c44673JqI = (C44673JqI) c3oo;
        AbstractC167017dG.A1N(c48318LZr, c44673JqI);
        Context context = this.A01;
        String str = c48318LZr.A01;
        boolean z = c48318LZr.A00;
        C47401Kwq c47401Kwq = this.A02;
        AbstractC167007dF.A1F(context, 0, c47401Kwq);
        c44673JqI.A01.setText(str);
        if (z) {
            TextView textView = c44673JqI.A00;
            textView.setVisibility(0);
            AbstractC166997dE.A18(context, textView, 2131957390);
            AbstractC56952jT.A01(textView);
            ViewOnClickListenerC48062LPn.A00(textView, 57, c47401Kwq);
            return;
        }
        c44673JqI.A00.setVisibility(8);
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        Context context = this.A01;
        int i = this.A00;
        View A0C = AbstractC25227BEk.A0C(AbstractC31172DnG.A09(context), R.layout.emoji_section_header);
        C14360o3.A0C(A0C, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
        ConstraintLayout constraintLayout = (ConstraintLayout) A0C;
        AbstractC31174DnI.A1D(constraintLayout, i, -2);
        return new C44673JqI(constraintLayout);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C48318LZr.class;
    }

    public KI7(Context context, C47401Kwq c47401Kwq, int i) {
        this.A01 = context;
        this.A00 = i;
        this.A02 = c47401Kwq;
    }
}
