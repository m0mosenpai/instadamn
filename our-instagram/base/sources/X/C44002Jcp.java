package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;

/* renamed from: X.Jcp, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44002Jcp extends AbstractC66422zJ {
    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC31175DnJ.A1R(viewGroup, layoutInflater);
        return new C44626JpW(AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.direct_inbox_campaign_view_entry_banner_layout, false));
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C44626JpW c44626JpW = (C44626JpW) c3oo;
        AbstractC167017dG.A1N(interfaceC66482zP, c44626JpW);
        ViewOnClickListenerC48072LPx.A01(c44626JpW.A00, 53, interfaceC66482zP);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C45642KIf.class;
    }
}
