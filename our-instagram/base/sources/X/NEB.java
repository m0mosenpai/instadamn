package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;

/* loaded from: classes9.dex */
public final class NEB extends AbstractC66412zI {
    @Override // X.AbstractC66422zJ
    public final C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC167007dF.A1K(viewGroup, layoutInflater);
        return new C51230MkF(layoutInflater.inflate(R.layout.layout_highlights_in_grid_loading_item, viewGroup, false), 0);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C52356NEu.class;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
    }
}
