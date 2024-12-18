package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;

/* loaded from: classes9.dex */
public final class NEM extends AbstractC66412zI {
    public final InterfaceC16820sZ A00;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC31175DnJ.A1R(viewGroup, layoutInflater);
        return new C51309MlW(AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.layout_iglive_earnings_row, false));
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C56097OvH c56097OvH = (C56097OvH) interfaceC66482zP;
        C51309MlW c51309MlW = (C51309MlW) c3oo;
        AbstractC167007dF.A1K(c56097OvH, c51309MlW);
        Ok4.A00(c51309MlW.A00, 18, this);
        String str = c56097OvH.A00;
        boolean A1N = AbstractC167007dF.A1N(str.length());
        TextView textView = c51309MlW.A01;
        if (A1N) {
            textView.setVisibility(8);
        } else {
            textView.setText(str);
            textView.setVisibility(0);
        }
        String str2 = c56097OvH.A01;
        if (str2 != null && str2.length() != 0) {
            TextView textView2 = c51309MlW.A02;
            textView2.setText(str2);
            textView2.setVisibility(0);
            return;
        }
        c51309MlW.A02.setVisibility(8);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C56097OvH.class;
    }

    public NEM(InterfaceC16820sZ interfaceC16820sZ) {
        this.A00 = interfaceC16820sZ;
    }
}
