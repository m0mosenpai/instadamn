package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;

/* renamed from: X.V5b, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C67986V5b extends AbstractC66422zJ {
    public final String A00;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        return new C66443UHt(AbstractC25226BEj.A0R(AbstractC25231BEo.A0O(viewGroup), viewGroup, R.layout.layout_ads_consent_growth_bottomsheet_footer, false));
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C66636URa c66636URa = (C66636URa) interfaceC66482zP;
        C66443UHt c66443UHt = (C66443UHt) c3oo;
        AbstractC167017dG.A1N(c66636URa, c66443UHt);
        String str = this.A00;
        TextView textView = c66443UHt.A00;
        Context A0L = AbstractC166997dE.A0L(textView);
        CharSequence A00 = BHX.A00(A0L, (C5QE) c66636URa.A00.A00);
        if (A00.length() == 0) {
            textView.setVisibility(8);
            return;
        }
        textView.setVisibility(0);
        if (C14360o3.A0K(str, "3pd_trial_inline_opt_in")) {
            AnonymousClass773.A07(new VB7(c66636URa, A0L.getColor(AbstractC53242c7.A0C(A0L))), textView, AbstractC166997dE.A0p(A0L, 2131952495), A00.toString());
            return;
        }
        textView.setText(A00);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C66636URa.class;
    }

    public C67986V5b(String str) {
        this.A00 = str;
    }
}
