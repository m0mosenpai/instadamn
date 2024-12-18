package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.igds.components.textcell.IgdsListCell;

/* loaded from: classes9.dex */
public final class NE4 extends AbstractC66412zI {
    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C56107OvR c56107OvR = (C56107OvR) interfaceC66482zP;
        C51244MkT c51244MkT = (C51244MkT) c3oo;
        AbstractC167017dG.A1N(c56107OvR, c51244MkT);
        IgdsListCell igdsListCell = c51244MkT.A00;
        igdsListCell.setTextCellType(EnumC53237Nga.A08);
        CharSequence text = igdsListCell.getResources().getText(c56107OvR.A00);
        C14360o3.A07(text);
        igdsListCell.A0I(text);
        igdsListCell.A0E(c56107OvR.A01);
        igdsListCell.setChecked(c56107OvR.A02);
        igdsListCell.setEnabled(c56107OvR.A03);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C56107OvR.class;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        return new C51244MkT(AbstractC31174DnI.A0Z(AbstractC31176DnK.A04(viewGroup)));
    }
}
