package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;

/* loaded from: classes9.dex */
public final class NEG extends AbstractC66412zI {
    public final O3G A00;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC31175DnJ.A1R(viewGroup, layoutInflater);
        C51300MlN c51300MlN = new C51300MlN(AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.metadata_series_no_header_container, false));
        View view = c51300MlN.A00;
        ViewOnClickListenerC55455Ok9.A01(view, 33, this);
        int A05 = AbstractC166997dE.A05(view.getResources());
        view.setPadding(A05, 0, A05, 0);
        return c51300MlN;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C56093OvD c56093OvD = (C56093OvD) interfaceC66482zP;
        C51300MlN c51300MlN = (C51300MlN) c3oo;
        AbstractC167007dF.A1K(c56093OvD, c51300MlN);
        c51300MlN.A02.setText(c56093OvD.A01);
        String str = c56093OvD.A00;
        if (str == null) {
            c51300MlN.A01.setVisibility(8);
            return;
        }
        TextView textView = c51300MlN.A01;
        textView.setText(str);
        textView.setVisibility(0);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C56093OvD.class;
    }

    public NEG(O3G o3g) {
        this.A00 = o3g;
    }
}
