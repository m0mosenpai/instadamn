package X;

import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;

/* loaded from: classes6.dex */
public final class EYF extends AbstractC66422zJ {
    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC31175DnJ.A1R(viewGroup, layoutInflater);
        return new C31944E1y(AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.subscription_list_education, false));
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        EY4 ey4 = (EY4) interfaceC66482zP;
        C31944E1y c31944E1y = (C31944E1y) c3oo;
        boolean A1a = AbstractC167017dG.A1a(ey4, c31944E1y);
        TextView textView = c31944E1y.A01;
        Resources resources = c31944E1y.A00.getResources();
        C14360o3.A07(resources);
        C5QE c5qe = ey4.A00;
        C14360o3.A0B(c5qe, A1a ? 1 : 0);
        textView.setText(c5qe.A01(resources));
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return EY4.class;
    }
}
