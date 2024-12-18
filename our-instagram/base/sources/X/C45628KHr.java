package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;

/* renamed from: X.KHr, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45628KHr extends AbstractC66412zI {
    public final C45523KDo A00;
    public final InterfaceC11380iw A01;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC31175DnJ.A1R(viewGroup, layoutInflater);
        return new Jq2(AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.row_appreciation_horizontal_scroll_item, false), this.A00, this.A01);
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        LZD lzd = (LZD) interfaceC66482zP;
        Jq2 jq2 = (Jq2) c3oo;
        AbstractC167017dG.A1N(lzd, jq2);
        jq2.A00.A05(AbstractC43593JPy.A0L(AbstractC001800i.A0T(new Object(), lzd.A00)));
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return LZD.class;
    }

    public C45628KHr(C45523KDo c45523KDo, InterfaceC11380iw interfaceC11380iw) {
        this.A00 = c45523KDo;
        this.A01 = interfaceC11380iw;
    }
}
