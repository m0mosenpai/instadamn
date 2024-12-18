package X;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;

/* loaded from: classes9.dex */
public final class NEH extends AbstractC66412zI {
    public final Activity A00;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC31175DnJ.A1R(viewGroup, layoutInflater);
        return new C51316Mld(AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.metadata_tagging_row, false));
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C56108OvS c56108OvS = (C56108OvS) interfaceC66482zP;
        C51316Mld c51316Mld = (C51316Mld) c3oo;
        AbstractC167007dF.A1K(c56108OvS, c51316Mld);
        c51316Mld.A03.setText(c56108OvS.A03);
        String str = c56108OvS.A02;
        TextView textView = c51316Mld.A02;
        if (str != null) {
            textView.setText(str);
            textView.setVisibility(0);
            c51316Mld.A01.setVisibility(8);
        } else {
            textView.setVisibility(8);
            c51316Mld.A01.setVisibility(0);
        }
        ViewOnClickListenerC55455Ok9.A01(c51316Mld.A00, 34, c56108OvS);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C56108OvS.class;
    }

    public NEH(Activity activity) {
        this.A00 = activity;
    }
}
