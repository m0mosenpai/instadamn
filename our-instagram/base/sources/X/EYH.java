package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.TextView;

/* loaded from: classes6.dex */
public final class EYH extends AbstractC66422zJ {
    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        C14360o3.A0B(viewGroup, 0);
        return new C31953E2h(FY8.A00(viewGroup));
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C32088E8m c32088E8m = (C32088E8m) interfaceC66482zP;
        C31953E2h c31953E2h = (C31953E2h) c3oo;
        AbstractC167007dF.A1K(c32088E8m, c31953E2h);
        FNF fnf = c31953E2h.A02;
        String str = c32088E8m.A03;
        if (str != null && str.length() != 0) {
            fnf.A03.setText(str);
            TextView textView = fnf.A04;
            textView.setText(c32088E8m.A04);
            textView.setVisibility(0);
        } else {
            fnf.A03.setText(c32088E8m.A04);
            fnf.A04.setVisibility(8);
        }
        fnf.A01.A0F(null, new C35945Fu5(), c32088E8m.A01);
        View A01 = c31953E2h.A01.A01();
        C14360o3.A07(A01);
        CompoundButton compoundButton = (CompoundButton) A01;
        compoundButton.setChecked(c32088E8m.A00);
        ViewOnClickListenerC31591DuJ.A00(fnf.A00, 8, c32088E8m, compoundButton);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C32088E8m.class;
    }
}
