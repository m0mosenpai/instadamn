package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.facebook.R;

/* loaded from: classes9.dex */
public final class NEI extends AbstractC66412zI {
    public final C52182N7r A00;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC31175DnJ.A1R(viewGroup, layoutInflater);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.series_create_row_layout, false);
        C52182N7r c52182N7r = this.A00;
        C14360o3.A0B(c52182N7r, 2);
        C3OO c3oo = new C3OO(A0R);
        AbstractC166987dD.A0e(A0R, R.id.new_series).setText(2131964264);
        ImageView A08 = AbstractC31171DnF.A08(A0R, R.id.series_create_button);
        A08.setImageResource(R.drawable.plus_24);
        A08.setColorFilter(C3DY.A00(AbstractC53242c7.A01(A0R.getContext())));
        ViewOnClickListenerC55455Ok9.A01(A0R, 40, c52182N7r);
        return c3oo;
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C52354NEs.class;
    }

    public NEI(C52182N7r c52182N7r) {
        this.A00 = c52182N7r;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
    }
}
