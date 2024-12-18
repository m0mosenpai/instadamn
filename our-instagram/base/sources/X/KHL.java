package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.igds.components.textcell.IgdsListCell;

/* loaded from: classes8.dex */
public final class KHL extends AbstractC66412zI {
    public final C45520KDl A00;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C45217Jzx c45217Jzx = (C45217Jzx) interfaceC66482zP;
        C44659Jq4 c44659Jq4 = (C44659Jq4) c3oo;
        boolean A1a = AbstractC167017dG.A1a(c45217Jzx, c44659Jq4);
        IgdsListCell igdsListCell = c44659Jq4.A01;
        igdsListCell.setTextCellType(EnumC53237Nga.A07);
        C51675Ms6 c51675Ms6 = c45217Jzx.A00;
        igdsListCell.A0I(c51675Ms6.A06);
        igdsListCell.A0H(c51675Ms6.A02);
        igdsListCell.A0D(null);
        igdsListCell.setChecked(c45217Jzx.A01);
        igdsListCell.A0D(new LRF(A1a ? 1 : 0, c44659Jq4, c45217Jzx));
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C45217Jzx.class;
    }

    public KHL(C45520KDl c45520KDl) {
        this.A00 = c45520KDl;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        return new C44659Jq4(this.A00, new IgdsListCell(AbstractC31176DnK.A04(viewGroup), null));
    }
}
