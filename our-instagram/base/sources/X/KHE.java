package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;

/* loaded from: classes8.dex */
public final class KHE extends AbstractC66412zI {
    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        boolean A1R = AbstractC167007dF.A1R(0, viewGroup, layoutInflater);
        View A0D = AbstractC25227BEk.A0D(layoutInflater, viewGroup, R.layout.layout_loading_row_wrap_height, false);
        C14360o3.A0B(A0D, A1R ? 1 : 0);
        return new C3OO(A0D);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return LZC.class;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
    }
}
