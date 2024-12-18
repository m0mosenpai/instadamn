package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;

/* loaded from: classes11.dex */
public final class U1K extends AbstractC66412zI {
    public final XBD A00;

    public U1K(XBD xbd) {
        C14360o3.A0B(xbd, 1);
        this.A00 = xbd;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C14360o3.A0B(c3oo, 1);
        Object tag = c3oo.itemView.getTag();
        C14360o3.A0C(tag, "null cannot be cast to non-null type com.instagram.search.common.ui.SeeMoreViewBinder.Holder");
        C68841Vcx c68841Vcx = (C68841Vcx) tag;
        XBD xbd = this.A00;
        AbstractC25230BEn.A15(1, c68841Vcx, xbd);
        WNU.A00(c68841Vcx.A00, 70, xbd);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return NUR.class;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC167017dG.A1N(viewGroup, layoutInflater);
        View A0C = AbstractC31173DnH.A0C(layoutInflater, viewGroup, R.layout.row_see_more, false);
        A0C.setTag(new C68841Vcx(A0C));
        C3OO c3oo = new C3OO(A0C);
        if (A0C.getTag() instanceof C68841Vcx) {
            return c3oo;
        }
        throw AbstractC31172DnG.A0u();
    }
}
