package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;

/* loaded from: classes11.dex */
public final class V57 extends AbstractC66412zI {
    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return V5Y.class;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        View A0A = AbstractC31172DnG.A0A(layoutInflater, viewGroup, R.layout.layout_empty_state);
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
        C14360o3.A0B(A0A, 1);
        return new C3OO(A0A);
    }
}
