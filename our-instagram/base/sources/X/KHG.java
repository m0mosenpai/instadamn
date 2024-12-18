package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;

/* loaded from: classes8.dex */
public final class KHG extends AbstractC66412zI {
    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        AbstractC167017dG.A1N(null, c3oo);
        throw AbstractC166987dD.A15("titleText");
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return LZ2.class;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC167017dG.A1N(viewGroup, layoutInflater);
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
        return new C44655Jpz(AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.live_scheduling_management_section_title_row, false));
    }
}
