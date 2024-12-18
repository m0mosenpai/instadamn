package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;

/* loaded from: classes11.dex */
public final class U1M extends AbstractC66412zI {
    public final InterfaceC71958XCk A00;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        View A0C = AbstractC31173DnH.A0C(AbstractC31177DnL.A0E(viewGroup, 0), viewGroup, R.layout.search_section, false);
        A0C.setTag(new U37(A0C));
        C3OO c3oo = new C3OO(A0C);
        if (A0C.getTag() instanceof U37) {
            return c3oo;
        }
        throw AbstractC31172DnG.A0u();
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        MZW mzw = (MZW) interfaceC66482zP;
        AbstractC167017dG.A1N(mzw, c3oo);
        Object tag = c3oo.itemView.getTag();
        C14360o3.A0C(tag, "null cannot be cast to non-null type com.instagram.search.common.ui.SearchSectionTitleViewBinder.Holder");
        U36.A00(mzw.A00, mzw.A01, this.A00, (U37) tag);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return MZW.class;
    }

    public U1M(InterfaceC71958XCk interfaceC71958XCk) {
        this.A00 = interfaceC71958XCk;
    }
}
