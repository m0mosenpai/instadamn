package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.igds.components.textcell.IgdsListCell;

/* loaded from: classes9.dex */
public final class NE1 extends AbstractC66412zI {
    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C56100OvK c56100OvK = (C56100OvK) interfaceC66482zP;
        C51241MkQ c51241MkQ = (C51241MkQ) c3oo;
        AbstractC167017dG.A1N(c56100OvK, c51241MkQ);
        IgdsListCell igdsListCell = c51241MkQ.A00;
        igdsListCell.setTextCellType(EnumC53237Nga.A04);
        CharSequence text = igdsListCell.getResources().getText(c56100OvK.A00);
        C14360o3.A07(text);
        igdsListCell.A0I(text);
        igdsListCell.A0C(c56100OvK.A01);
        String str = c56100OvK.A02;
        if (str != null) {
            igdsListCell.A0J(str, null, false);
        }
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C56100OvK.class;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        return new C51241MkQ(AbstractC31174DnI.A0Z(AbstractC31176DnK.A04(viewGroup)));
    }
}
