package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;

/* loaded from: classes8.dex */
public final class KH8 extends AbstractC66412zI {
    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC31175DnJ.A1R(viewGroup, layoutInflater);
        return new C44640Jpk(AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.layout_timeline_loading_spinner_item, false));
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C44640Jpk c44640Jpk = (C44640Jpk) c3oo;
        C14360o3.A0B(c44640Jpk, 1);
        AbstractC31171DnF.A1M(c44640Jpk.A00);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C45639KIc.class;
    }
}
