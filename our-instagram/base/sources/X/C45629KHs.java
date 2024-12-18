package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;

/* renamed from: X.KHs, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45629KHs extends AbstractC66412zI {
    public final C45523KDo A00;
    public final InterfaceC11380iw A01;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC31175DnJ.A1R(viewGroup, layoutInflater);
        return new C44709Jqs(AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.row_appreciation_reels_item, false));
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C48311LZk c48311LZk = (C48311LZk) interfaceC66482zP;
        C44709Jqs c44709Jqs = (C44709Jqs) c3oo;
        AbstractC167017dG.A1N(c48311LZk, c44709Jqs);
        c44709Jqs.A03.setUrl(AbstractC25225BEi.A0t(c48311LZk.A05), this.A01);
        c44709Jqs.A02.setText(c48311LZk.A03);
        c44709Jqs.A01.setText(c48311LZk.A02);
        ViewOnClickListenerC48066LPr.A00(c44709Jqs.A00, 3, c48311LZk, this);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C48311LZk.class;
    }

    public C45629KHs(C45523KDo c45523KDo, InterfaceC11380iw interfaceC11380iw) {
        this.A00 = c45523KDo;
        this.A01 = interfaceC11380iw;
    }
}
