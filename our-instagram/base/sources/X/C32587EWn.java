package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;

/* renamed from: X.EWn, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32587EWn extends AbstractC66412zI {
    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC31175DnJ.A1R(viewGroup, layoutInflater);
        return new E1H(AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.onboarding_check_list_header_row, false));
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        TextView textView;
        String str;
        C36180Fxu c36180Fxu = (C36180Fxu) interfaceC66482zP;
        E1H e1h = (E1H) c3oo;
        if (e1h != null && (textView = e1h.A00) != null) {
            if (c36180Fxu != null) {
                str = c36180Fxu.A00;
            } else {
                str = null;
            }
            textView.setText(str);
        }
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C36180Fxu.class;
    }
}
