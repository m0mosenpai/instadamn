package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;

/* renamed from: X.KJk, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45673KJk extends AbstractC66422zJ {
    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC31175DnJ.A1R(viewGroup, layoutInflater);
        return new C44627JpX(AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.direct_inbox_campaign_loading_indicator, false));
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C44627JpX c44627JpX = (C44627JpX) c3oo;
        C14360o3.A0B(c44627JpX, 1);
        AbstractC31171DnF.A1M(c44627JpX.A00);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return LZA.class;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void unbind(C3OO c3oo) {
        C44627JpX c44627JpX = (C44627JpX) c3oo;
        C14360o3.A0B(c44627JpX, 0);
        AbstractC43592JPx.A1S(c44627JpX.A00);
    }
}
