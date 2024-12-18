package X;

import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;

/* loaded from: classes11.dex */
public final class V55 extends AbstractC66412zI {
    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC167007dF.A1K(viewGroup, layoutInflater);
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
        return new UIS(AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.appreciation_text_view_layout, false));
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        int i;
        int i2;
        int i3;
        C70795Wh8 c70795Wh8 = (C70795Wh8) interfaceC66482zP;
        UIS uis = (UIS) c3oo;
        boolean A1R = AbstractC167007dF.A1R(0, c70795Wh8, uis);
        IgTextView igTextView = uis.A01;
        igTextView.setText(c70795Wh8.A01);
        igTextView.setTextAppearance(c70795Wh8.A00);
        View view = uis.A00;
        Resources resources = view.getResources();
        C14360o3.A07(resources);
        int dimensionPixelSize = resources.getDimensionPixelSize(c70795Wh8.A07.intValue());
        int dimensionPixelSize2 = resources.getDimensionPixelSize(c70795Wh8.A02.intValue());
        Integer num = c70795Wh8.A04;
        if (num != null) {
            i = resources.getDimensionPixelSize(num.intValue());
        } else {
            i = 0;
        }
        Integer num2 = c70795Wh8.A03;
        if (num2 != null) {
            i2 = resources.getDimensionPixelSize(num2.intValue());
        } else {
            i2 = 0;
        }
        igTextView.setPadding(i, dimensionPixelSize, i2, dimensionPixelSize2);
        Integer num3 = c70795Wh8.A06;
        if (num3 != null) {
            AbstractC166987dD.A1O(igTextView.getContext(), igTextView, num3.intValue());
        }
        int intValue = c70795Wh8.A05.intValue();
        if (intValue != 0) {
            i3 = 6;
            if (intValue != A1R) {
                i3 = 4;
            }
        } else {
            i3 = 5;
        }
        view.setTextAlignment(i3);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C70795Wh8.class;
    }
}
