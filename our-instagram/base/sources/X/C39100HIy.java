package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;

/* renamed from: X.HIy, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39100HIy extends AbstractC66422zJ {
    @Override // X.AbstractC66422zJ
    public final C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC167007dF.A1K(viewGroup, layoutInflater);
        return new C38405Gug(layoutInflater.inflate(R.layout.layout_product_tab_grid_loading, viewGroup, false), 0);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C39084HIi.class;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
    }
}
