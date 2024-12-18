package X;

import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import java.util.Locale;

/* loaded from: classes7.dex */
public final class HI5 extends AbstractC66412zI {
    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC31175DnJ.A1R(viewGroup, layoutInflater);
        return new C38499GwK(AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.translation_attribution_row, false), this);
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        String str;
        C42336Ioy c42336Ioy = (C42336Ioy) interfaceC66482zP;
        C38499GwK c38499GwK = (C38499GwK) c3oo;
        AbstractC167007dF.A1K(c42336Ioy, c38499GwK);
        View view = c38499GwK.itemView;
        String str2 = c42336Ioy.A00;
        if (str2 == null || (str = (String) AbstractC001800i.A0O(new C11L("_").A03(str2), 0)) == null) {
            str = "";
        }
        Locale locale = new Locale(str);
        c38499GwK.A00.setText(c42336Ioy.A02);
        TextView textView = c38499GwK.A01;
        Resources resources = view.getResources();
        textView.setText(AbstractC166997dE.A0r(resources, locale.getDisplayName(), 2131975722));
        c38499GwK.A03.setText(c42336Ioy.A03);
        AbstractC31173DnH.A19(resources, c38499GwK.A02, 2131975723);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C42336Ioy.class;
    }
}
