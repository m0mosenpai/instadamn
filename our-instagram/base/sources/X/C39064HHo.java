package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;

/* renamed from: X.HHo, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39064HHo extends AbstractC66412zI {
    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC31175DnJ.A1R(viewGroup, layoutInflater);
        return new C38408Guj(AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.gap_binder_layout, false));
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        int dimensionPixelSize;
        H7I h7i = (H7I) interfaceC66482zP;
        C38408Guj c38408Guj = (C38408Guj) c3oo;
        AbstractC167017dG.A1N(h7i, c38408Guj);
        View view = c38408Guj.A00;
        Integer num = h7i.A02;
        if (num != null) {
            dimensionPixelSize = num.intValue();
        } else {
            dimensionPixelSize = view.getResources().getDimensionPixelSize(h7i.A00);
        }
        if (dimensionPixelSize != view.getLayoutParams().height) {
            AbstractC13880nE.A0W(view, dimensionPixelSize);
        }
        Integer num2 = h7i.A01;
        if (num2 != null) {
            AbstractC31172DnG.A1B(view.getContext(), view, num2.intValue());
        }
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return H7I.class;
    }
}
